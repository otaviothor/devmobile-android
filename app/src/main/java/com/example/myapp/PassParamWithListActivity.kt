package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PassParamWithListActivity : AppCompatActivity() {

    private val repositoriesService = RepositoriesService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_param_with_list)

        GlobalScope.launch(Dispatchers.IO) {
            val repositories = repositoriesService.getRepositories();
            withContext(Dispatchers.Main) {
                val listView = findViewById<ListView>(R.id.RepositoriesListView)

                val nonNullRepositories = repositories ?: emptyList()

                val adapter = RepoListAdapter(this@PassParamWithListActivity, R.layout.list_item_layout, nonNullRepositories)
                listView.adapter = adapter

            }
        }
    }
}