package com.example.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.socialapp.daos.PostDaos

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDaos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDaos()

        val postButton:Button=findViewById(R.id.postButton)
        postButton.setOnClickListener {
            val postInput:EditText=findViewById(R.id.postInput)
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()) {
                postDao.addPost(input)
                finish()
            }
        }


    }


}