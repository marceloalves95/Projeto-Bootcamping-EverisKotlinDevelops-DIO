package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.interfaces

import android.database.Cursor

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
interface NoteClickedListener {

    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}