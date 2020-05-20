package test.livongo.albersheim

import main.livongo.albersheim.RepeatString
import main.livongo.albersheim.RepeatStringInterface
import org.junit.Test
import org.junit.Assert.assertEquals

class RepeatStringTest {

    @Test
    fun testEmptyString() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("",repeatString.findLongestRepeatingSubstring(""))
    }

    @Test
    fun testNoRepeats() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("",repeatString.findLongestRepeatingSubstring("Nick"))
    }

    @Test
    fun testAvaracadavara() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("avara",repeatString.findLongestRepeatingSubstring("avaracadavara"))
    }

    @Test
    fun testSubNotStarting() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("cat",repeatString.findLongestRepeatingSubstring("somecatothercat"))
    }

    @Test
    fun testOverlapping() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("issi",repeatString.findLongestRepeatingSubstring("Mississippi"))
    }

    @Test
    fun testInternalString() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("abababa",repeatString.findLongestRepeatingSubstring("ababababa"))
    }

    // This test returns tone character less than the entire string
    @Test
    fun testEntireString() {
        var repeatString: RepeatStringInterface = RepeatString()
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",repeatString.findLongestRepeatingSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
    }

}