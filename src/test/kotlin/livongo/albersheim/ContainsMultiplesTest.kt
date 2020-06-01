package livongo.albersheim

import org.junit.Test
import org.junit.Assert.assertEquals

class ContainsMultiplesTest {

    @Test
    fun testEmptyString() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(false,repeatString.containsMultiples("",""))
    }

    @Test
    fun testNoRepeats() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(false,repeatString.containsMultiples("Nick","Nick"))
    }

    @Test
    fun testAvaracadavara() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(true,repeatString.containsMultiples("avara","avaracadavara"))
    }

    @Test
    fun testSubNotStarting() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(true,repeatString.containsMultiples("cat","somecatothercat"))
    }

    @Test
    fun testOverlapping() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(true,repeatString.containsMultiples("issi","Mississippi"))
    }

    @Test
    fun testInternalString() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(true,repeatString.containsMultiples("ababab","ababababa"))
    }

    @Test
    fun testEntireStringShoudReturnFalseSinceNotRepeated() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(false,repeatString.containsMultiples("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
    }

    @Test
    fun testOneLessThanEntireStringShoudReturnTrueSinceItIsRepeated() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals(true,repeatString.containsMultiples("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
    }
}