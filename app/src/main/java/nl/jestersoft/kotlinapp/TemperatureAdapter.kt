package nl.jestersoft.kotlinapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class TemperatureAdapter(context: Context, resource: Int, list: ArrayList<TemperatureData>) :
        ArrayAdapter<TemperatureData>(context, resource, list) {

    var resource : Int
    var items : ArrayList<TemperatureData>

    init {
        this.resource = resource
        this.items = list
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var temperatureView = convertView

        if (temperatureView==null) {
            val inflator : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            temperatureView = inflator.inflate(R.layout.temperature_item, null)
        }

        // Get current item
        val item : TemperatureData = getItem(position)

        // Get item values
        val sensorName = item.getSensorName()
        val curTemp = item.getCurrentTemperature()
        val minTemp = item.getMinimumTemperature()
        val maxTemp = item.getMaximumTemperature()
        val timeStamp = item.getTimestamp()

        // Show the values in the item view
        val tvCurTemp = temperatureView?.findViewById<TextView>(R.id.currentTemp)
        tvCurTemp?.text = curTemp.toString()

        val tvSensorDescr = temperatureView?.findViewById<TextView>(R.id.sensorDescr)
        tvSensorDescr?.text = sensorName

        val tvTimestamp = temperatureView?.findViewById<TextView>(R.id.timestamp)
        tvTimestamp?.text = timeStamp

        val tvMinTemp = temperatureView?.findViewById<TextView>(R.id.minTemp)
        tvMinTemp?.text = minTemp.toString()

        val tvMaxTemp = temperatureView?.findViewById<TextView>(R.id.maxTemp)
        tvMaxTemp?.text = maxTemp.toString()

        return temperatureView
    }
}