package com.example.myagenda;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import com.example.myagenda.Nota;
import com.example.myagenda.NotaDao;


/**
 * Esta clase devuelve una instancia de la interfaz NotaDao.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.07
 */
@Database(entities = {Nota.class}, version = 1)
abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();
}