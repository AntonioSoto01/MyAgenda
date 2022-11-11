package com.example.myagenda;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

//import com.example.myagenda.nota;

/**
 * Esta interfaz define los métodos para interactuar con la base de datos.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */

@Dao
public interface NotaDao {

    @Query("SELECT * FROM nota")
    List<Nota> getNotas();

    @Query("SELECT * FROM nota WHERE mId LIKE :uuid")
    Nota getNota(String uuid);

    @Insert
    void addNota(Nota book);

    @Delete
    void deleteNota(Nota book);

    @Update
    void updateNota(Nota book);
}