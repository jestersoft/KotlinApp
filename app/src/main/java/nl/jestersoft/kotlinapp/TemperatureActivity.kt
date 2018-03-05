package nl.jestersoft.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class TemperatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature)

        // Add some dummy data to the list
        val tempData = getDummyData()

        // Get list to view data in
        val list = findViewById<ListView>(R.id.list)

        // Show data in the list
        val layoutID = R.layout.temperature_item
        list.adapter = TemperatureAdapter(this, layoutID, tempData)
    }

    fun getDummyData(): ArrayList<TemperatureData> {
        val dummyData: ArrayList<TemperatureData> = ArrayList<TemperatureData>()

        val data1 = TemperatureData("Balcony", 18.0, 16.0, 20.0, "05-08-2018 17:29")
        dummyData.add(data1)

        val data2 = TemperatureData("Living room", 24.0, 20.0, 25.0, "05-08-2018 17:29")
        dummyData.add(data2)

        val data3 = TemperatureData("Bath room", 18.0, 21.0, 27.0, "05-08-2018 17:29")
        dummyData.add(data3)

        val data4 = TemperatureData("Hallway", 20.0, 18.0, 23.0, "05-08-2018 17:29")
        dummyData.add(data4)

        return dummyData
    }
}
