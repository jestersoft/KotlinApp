package nl.jestersoft.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_main.textCount
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val toastMsg = getString(R.string.toast_message)
        val myToast = Toast.makeText(this,toastMsg, Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view:View){
        // val showCountTextView = findViewById<TextView>(R.id.textCount)

        val countString = textCount.text.toString()

        var count : Int = Integer.parseInt(countString)
        count++

        textCount.text = count.toString()
    }

    fun randomMe(view:View){
        val randomIntent = Intent(this, RandomActivity::class.java)

        val countString = textCount.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }

    fun showList(view:View){
        val listIntent = Intent(this, ListActivity::class.java)

        startActivity(listIntent)
    }
}
