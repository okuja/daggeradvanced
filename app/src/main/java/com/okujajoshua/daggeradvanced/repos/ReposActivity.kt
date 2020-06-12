package com.okujajoshua.daggeradvanced.repos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.okujajoshua.daggeradvanced.R
import com.okujajoshua.daggeradvanced.appComponent


class ReposActivity : AppCompatActivity() {

    lateinit var factory: ReposViewModelFactory
    private lateinit var viewModel: ReposViewModel


    private lateinit var repos: RecyclerView
    private lateinit var reposAdapter: ReposAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repos)


        repos = findViewById(R.id.repos)
        repos.layoutManager = LinearLayoutManager(this)
        reposAdapter = ReposAdapter(listOf())
        repos.adapter = reposAdapter


        viewModel = ViewModelProvider(this, factory).get(ReposViewModel::class.java)

        viewModel.repos.observe(this, Observer { repositories ->
            reposAdapter.updateRepos(repositories)
        })

        val username = intent.getStringExtra("username")
        viewModel.getRepos(username)
    }
}
