package com.example.test

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.SimpleAdapter
import com.example.test.databinding.ActivityTicketBinding

class ticket : AppCompatActivity() {

    private lateinit var binding: ActivityTicketBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTicketBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListViewSimple()
    }

    private fun setupListViewSimple() {
        val data = listOf(
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            ),
            mapOf(
                KEY_TITLE to "first tit",
                KEY_DESCRIPTION to "first des"
            )
        )
        val adapter = SimpleAdapter(
            this,
            data,
            android.R.layout.simple_list_item_2,
            arrayOf(KEY_TITLE, KEY_DESCRIPTION),
            intArrayOf(android.R.id.text1, android.R.id.text2)
        )
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            val selectedItemTitle = data[position][KEY_TITLE]
            val selectedItemDescription = data[position][KEY_DESCRIPTION]

            val dialog = AlertDialog.Builder(this)
                .setTitle(selectedItemTitle)
                .setMessage(getString(R.string.item_selected_message, selectedItemDescription))
                .setPositiveButton("ok") { dialog, wich ->}
                .create()
            dialog.show()
        }
    }

    companion object{
        @JvmStatic val KEY_TITLE = "title"
        @JvmStatic val KEY_DESCRIPTION = "description"
    }
}