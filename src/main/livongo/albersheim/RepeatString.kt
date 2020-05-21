package main.livongo.albersheim

public class RepeatString : RepeatStringInterface {
    // returns true if there are multiple occurrences of substring in string
    override fun containsMultiples(sub: String, input: String): Boolean {
         if (input.isEmpty() || sub.isEmpty()) return false
         if (input.contains(sub)) {
             val starts = input.indexOf(sub) // get index of first occurrence
             if (input.substring(starts+1).contains(sub)) return true // confirm 2nd occurrence after beginning of first
         }
         return false
     }

     // returns the longest repeated substring
     // assumptions - 1. substrings are matched assuming same case
     //               2. substrings are longer than 1 character
     //               3. empty input or empty substring returns no repeat
     override fun findLongestRepeatingSubstring(input: String): String {
        if (input.isEmpty()) return "";
        var current = input.substring(0,1) // initialize to first letter
        var longest = input.substring(0,1) // initialize to first letter

        var start=0;
        // for each character element in the input string
        for (element in input.substring(1)) {
            val c = element
            val sub = current.plus(c) // create a substring
            if (containsMultiples(sub,input)) { // confirm substring has multiple occurrences
                current += c
                if (current.length > longest.length) { // set as longest if it's longer then previous substrings
                    longest = current
                }
            }
            else { // if current substring does not have multiples, increment start, re-initialize current
                start = input.indexOf(c);
                current = "".plus(c)
            }
        }
        // a substring should have more than 1 character
        if (longest.length==1) return ""
        return longest
    }
}

public interface RepeatStringInterface {
    fun containsMultiples(sub: String, input: String): Boolean
    fun findLongestRepeatingSubstring(input: String): String
}