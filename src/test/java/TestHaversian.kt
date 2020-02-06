import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import util.Haversian


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestHaversian {

    private lateinit var haversian: Haversian
    private val MAX_MARGIN_ERROR = 5
    @BeforeAll
    fun setup() {
        haversian = Haversian(64.1265, -21.8174)
    }

    @Test
    fun testHaversianDistance() {
        val otherHaversian = Haversian(40.7128, -74.0060)

        Assertions.assertEquals(4208.toDouble(),haversian.distance(otherHaversian), MAX_MARGIN_ERROR.toDouble())
    }
}