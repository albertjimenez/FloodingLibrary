package model

import interfaces.FloodDataAdapter

class FactoryDataAdapter {
    companion object Adapter {
        val ukAdapter = UKAdapter()
    }
}


class UKAdapter : FloodDataAdapter<UKAdapter.UKFloodJSON> {
    override fun mapToFlood(genericFlood: UKFloodJSON): Flood {
        return with(genericFlood) {
            UKFlood(genericFlood.lat, genericFlood.lon, genericFlood.county, genericFlood.eaAreaName)
        }
    }

    inner class UKFloodJSON(val county: String? = "", val description: String? = "", val eaAreaName: String? = "", val floodWatchArea: String? = "",
                            val fwdCode: String? = "", val lat: Double, val lon: Double, val riverOrSea: String? = "")
}

