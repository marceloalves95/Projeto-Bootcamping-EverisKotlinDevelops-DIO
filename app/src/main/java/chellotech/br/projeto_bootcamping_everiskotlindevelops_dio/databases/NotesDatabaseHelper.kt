package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.databases

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID
/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class NotesDatabaseHelper (context:Context): SQLiteOpenHelper(context, "databaseNotes", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE $TABLE_NOTES (" +
                    "$_ID INTEGER NOT NULL PRIMARY KEY, " +
                    "$TITLE_NOTES TEXT NOT NULL, " +
                    "$DESCRIPTION_NOTES TEXT NOT NULL)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object{

        const val TABLE_NOTES:String = "Notes"
        const val TITLE_NOTES:String = "title"
        const val DESCRIPTION_NOTES:String = "description"




    }
}