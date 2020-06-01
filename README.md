# LongestRepeatedSubstring

####Description: 

Returns the longest repeated substring using TDD

#### Time of Implementation

2 hours

#### Assumptions
 1. substrings are matched assuming same case
 2. substrings are longer than 1 character
 3. empty input or empty substring returns no repeat

#### Algorithm:

#### For each character element in the input string
1. create a substring from a tracked starting position to the current character
2. confirm substring has multiple occurrences, after beginning of first
3. If #2 true, set current substring as longest(if it is)
4. If #2 false, increment start position, re-initialize current

#### Discussion:

1. I created a separate function to confirm there are multiple occurrences of
   the substring in the input string.
2. I created separate unit tests for both methods (TDD)
3. The surprising result was the test with all characters repeated. I didn't expect
   that the longest repeated string would be 1 character less than the entire string.
4. I also decided that an empty input would return an empty substring.
5. In terms of performance and optimizations 
   
   - using internal String methods is probably faster 
   - future enhancement: can reduce loop to look only up to input-length(substring)
   - performance degrades with large strings
 
#### Testing
 
1. to build: ```gradlew clean assemble```
2. to run: 
   ```kotlin -classpath build/libs/LongestRepeatedSubstring.jar longestRepeatedString.AppKt <input string>```, where the input string is the string to be searched for repeats
3. to run tests: ```gradlew test``` or in IntelliJ, Crtl-Shift-R on test folder
