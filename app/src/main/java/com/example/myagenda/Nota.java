package com.example.myagenda;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;


/**
 * Esta clase contiene un objeto de tipo Nota, con un id y el texto de dicha Nota.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */

@Entity(tableName = "nota")
public class Nota {
    @PrimaryKey
    @NonNull
    private String mId;
    @ColumnInfo(name = "contenido")
    private String mMensaje;

    public Nota() {
        mId = UUID.randomUUID().toString();
    }

    @NonNull
    public String getId() {
        return mId;
    }

    public void setId(@NonNull String id) {
        mId = id;
    }

    public String getMensaje() {
        return mMensaje;
    }

    public void setMensaje(String mensaje) {
        mMensaje = mensaje;
    }

    public Nota(@NonNull String mId, String mMensaje) {
        this.mId = mId;
        this.mMensaje = mMensaje;
    }

    @NonNull
    public String getmId() {
        return mId;
    }

    public void setmId(@NonNull String mId) {
        this.mId = mId;
    }

    public String getmMensaje() {
        return mMensaje;
    }

    public void setmMensaje(String mMensaje) {
        this.mMensaje = mMensaje;
    }





}

