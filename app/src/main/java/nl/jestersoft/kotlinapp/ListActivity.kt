package nl.jestersoft.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_list.view.*


class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
    }
}
