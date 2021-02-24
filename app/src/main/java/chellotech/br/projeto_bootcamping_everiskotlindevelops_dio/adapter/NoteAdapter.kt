package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.adapter

import android.database.Cursor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.databases.NotesDatabaseHelper.Companion.DESCRIPTION_NOTES
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.databases.NotesDatabaseHelper.Companion.TITLE_NOTES
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.interfaces.NoteClickedListener

/**
 * Projeto-Bootcamping-EverisKotlinDevelops-DIO
 * @author Marcelo Alves
 * 24/02/2021
 */
class NoteAdapter (private val listener:NoteClickedListener) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    private var mCursor:Cursor? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder =

        NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        )

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {

        mCursor?.moveToPosition(position)
        holder.noteTitle.text = mCursor?.getString(mCursor?.getColumnIndex(TITLE_NOTES) as Int)
        holder.noteDescription.text = mCursor?.getString(mCursor?.getColumnIndex(DESCRIPTION_NOTES) as Int)

        holder.noteButtonRemove.setOnClickListener {
            mCursor?.moveToPosition(position)
            listener.noteRemoveItem(mCursor)
            notifyDataSetChanged()
        }

        holder.itemView.setOnClickListener { listener.noteClickedItem(mCursor as Cursor)  }

    }

    override fun getItemCount(): Int = if(mCursor != null) mCursor?.count as Int else 0
    fun setCursor(newCursor: Cursor?){

        mCursor = newCursor
        notifyDataSetChanged()

    }

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var noteTitle = itemView.findViewById(R.id.note_title) as TextView
        val noteDescription = itemView.findViewById(R.id.note_description) as TextView
        val noteButtonRemove = itemView.findViewById(R.id.note_button_remove) as Button

    }

}