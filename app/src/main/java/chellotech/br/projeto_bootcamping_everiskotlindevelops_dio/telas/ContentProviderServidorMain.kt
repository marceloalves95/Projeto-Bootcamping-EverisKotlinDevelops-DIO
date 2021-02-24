package chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.telas

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns._ID
import androidx.loader.app.LoaderManager
import androidx.loader.content.CursorLoader
import androidx.loader.content.Loader
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.R
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.adapter.NoteAdapter
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.databases.NoteProvider.Companion.URI_NOTES
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.databases.NotesDatabaseHelper.Companion.TITLE_NOTES
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.fragments.NoteDetailFragment
import chellotech.br.projeto_bootcamping_everiskotlindevelops_dio.interfaces.NoteClickedListener
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ContentProviderServidorMain : AppCompatActivity() , LoaderManager.LoaderCallbacks<Cursor>{

    lateinit var notesrecyclerview:RecyclerView
    lateinit var noteadd:FloatingActionButton

    lateinit var adapter:NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider_servidor_main)

        title = "Content Provider - Servidor"

        noteadd = findViewById(R.id.note_add)
        noteadd.setOnClickListener{

            NoteDetailFragment().show(supportFragmentManager, "dialog")


        }

        adapter = NoteAdapter(object : NoteClickedListener {
            override fun noteClickedItem(cursor: Cursor) {
                val id = cursor.getLong(cursor.getColumnIndex(_ID))
                val fragment = NoteDetailFragment.newInstance(id)
                fragment.show(supportFragmentManager, "dialog")
            }

            override fun noteRemoveItem(cursor: Cursor?) {
                val id = cursor?.getLong(cursor.getColumnIndex(_ID))

                contentResolver.delete(Uri.withAppendedPath(URI_NOTES, id.toString()), null, null)

            }

        })
        adapter.setHasStableIds(true)

        notesrecyclerview = findViewById(R.id.notes_recycler_view)
        notesrecyclerview.layoutManager = LinearLayoutManager(this)
        notesrecyclerview.adapter = adapter

        LoaderManager.getInstance(this).initLoader(0,null,this)

    }

    override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> =
        CursorLoader(this, URI_NOTES, null,null, null, TITLE_NOTES)

    override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
        if(data != null){

            adapter.setCursor(data)


        }
    }

    override fun onLoaderReset(loader: Loader<Cursor>) {
        adapter.setCursor(null)
}
}