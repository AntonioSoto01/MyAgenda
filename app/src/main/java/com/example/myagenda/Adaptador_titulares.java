package com.example.myagenda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador_titulares extends RecyclerView.Adapter<Adaptador_titulares.TitularesViewHolder> implements View.OnClickListener {
    private ArrayList<Titular> datos;
    private View.OnClickListener listener;

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    public Adaptador_titulares(ArrayList<Titular> datos) {
        this.datos = datos;
    }

    @Override
    public void onClick(View view) {
        if(listener !=null){
            listener.onClick(view);

        }

}

    public static class TitularesViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNombre;
        private TextView txtApellido;
        private TextView txtTelefono;


        public TitularesViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtNombre = itemView.findViewById(R.id.nombre);
            this.txtApellido = itemView.findViewById(R.id.apellido);
            this.txtTelefono = itemView.findViewById(R.id.telefono);
        }
        public void bindTitular(Titular titular){
            txtNombre.setText(titular.getNombre());
            txtApellido.setText(titular.getApellido());
            txtTelefono.setText(titular.getTelefono());
        }

        public TextView getTxtNombre() {
            return txtNombre;
        }

        public void setTxtNombre(TextView txtNombre) {
            this.txtNombre = txtNombre;
        }

        public TextView getTxtApellido() {
            return txtApellido;
        }

        public void setTxtApellido(TextView txtApellido) {
            this.txtApellido = txtApellido;
        }

        public TextView getTxtTelefono() {
            return txtTelefono;
        }

        public void setTxtTelefono(TextView txtTelefono) {
            this.txtTelefono = txtTelefono;
        }




    }
    //CONSTRUYE LA VISTA
    public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_component, viewGroup, false);
        itemView.setOnClickListener(this);
        TitularesViewHolder tvh = new TitularesViewHolder(itemView);
        return tvh;



    }
    //ASIGNA CADA COMPONENTE
    public void onBindViewHolder(TitularesViewHolder holder, int position){
        Titular titular = datos.get(position);
        holder.bindTitular(titular);

    }
    //DEVUELVE EL TAMAÑO DEL ARRAY
    public int getItemCount(){
        return datos.size();


    }






}