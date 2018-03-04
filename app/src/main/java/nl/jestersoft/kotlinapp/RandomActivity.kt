package nl.jestersoft.kotlinapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0;
        if (count > 0) {
            randomInt = random.nextInt(count+1)
        }

        textview_random.text = Integer.toString(randomInt)

        textview_label.text = getString(R.string.random_heading, count)
    }

    fun goBack(){
         val intent: Intent = Intent(this, MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

         startActivity(intent)
    }
}
