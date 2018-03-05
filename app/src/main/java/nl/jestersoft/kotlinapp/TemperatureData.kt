package nl.jestersoft.kotlinapp

class TemperatureData(_sensorName: String, _currentTemperature: Double, _minimumTemperature: Double, _maximumTemperature: Double, _timeStamp: String) {
    // The data
    private var sensorName: String = ""
    private var currentTemperature: Double = 0.toDouble()
    private var minimumTemperature: Double = 0.toDouble()
    private var maximumTemperature: Double = 0.toDouble()
    private var timeStamp: String = ""

    init {
        sensorName = _sensorName
        currentTemperature = _currentTemperature
        minimumTemperature = _minimumTemperature
        maximumTemperature = _maximumTemperature
        timeStamp = _timeStamp
    }

    fun getSensorName() : String {
        return sensorName
    }

    fun getCurrentTemperature() : Double {
        return currentTemperature
    }

    fun getMinimumTemperature() : Double {
        return minimumTemperature
    }

    fun getMaximumTemperature() : Double {
        return maximumTemperature
    }

    fun getTimestamp() : String {
        return timeStamp
    }
}