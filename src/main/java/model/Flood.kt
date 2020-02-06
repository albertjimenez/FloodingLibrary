package model

import util.Haversian

abstract class Flood {
    abstract val latitude: Double
    abstract val longitude: Double

    fun calculateDistance(anotherIFlood: Flood): Double {
        val currentHaversian = Haversian(this.latitude, this.longitude)
        val targetHaversian = Haversian(anotherIFlood.latitude, anotherIFlood.longitude)
        return currentHaversian.distance(targetHaversian)
    }

    fun calculateDistance(latitude: Double, longitude: Double): Double =
            Haversian.distance(this.latitude, this.longitude, latitude, longitude)
}

data class BasicFlood(override val latitude: Double, override val longitude: Double) : Flood()
data class IrishFlood(override val latitude: Double, override val longitude: Double, val county: String) : Flood()
data class UKFlood(override val latitude: Double, override val longitude: Double, val county: String? = "",
                   val areaName: String? = "") : Flood()