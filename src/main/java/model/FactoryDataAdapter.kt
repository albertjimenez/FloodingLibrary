package model

import interfaces.FloodDataAdapter

class FactoryDataAdapter {
    companion object Adapter {
        val basicAdapter = BasicDataAdapter()
    }
}


class BasicDataAdapter: FloodDataAdapter<BasicFlood>{
    override fun mapToFlood(genericFlood: BasicFlood): Flood {
        return genericFlood
    }
}