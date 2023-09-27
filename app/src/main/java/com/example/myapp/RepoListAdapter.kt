package com.example.myapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class RepoListAdapter(context: Context, resource: Int, objects: List<IRepository>) :
    ArrayAdapter<IRepository>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.list_item_layout, parent, false)

        val repoNameTextView: TextView = view.findViewById(R.id.repoNameTextView)

        val repository = getItem(position)

        repoNameTextView.text = repository?.full_name

        repoNameTextView.setOnClickListener {
            val intent = Intent(context, ShowDataFromListActivity::class.java).apply {
                putExtra("full_name", repository?.full_name)
            }
            context.startActivity(intent)
        }

        return view
    }
}


