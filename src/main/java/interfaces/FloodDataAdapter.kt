package interfaces

import model.Flood

/**
 * Interface to provide an adaptor that maps a generic instance of Flood class to another one that conforms Flood schema
 */
interface FloodDataAdapter<in T> {
    /**
     * Function to be implemented that handles the mapping between generic and Flood instances
     * @param genericFlood any instance that extends Flood as abstract class
     */
    fun mapToFlood(genericFlood: T): Flood
}