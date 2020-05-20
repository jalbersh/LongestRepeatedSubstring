# LongestRepeatedSubstring

####Description: 

Returns the longest repeated substring using TDD

#### Time of Implementation

2 hours

#### Assumptions
 1. substrings are matched assuming same case
 2. substrings are longer than 1 character long

#### Algorithm:

#### For each character element in the input string
1. create a substring from a tracked tarting position to the current character
2. confirm substring has multiple occurrences
3. If #2 true, set current substring as longest(if it is)
4. If #2 false, increment start postion, re-initialize current

#### Discussion:

1. I created a separate function to confirm there are multiple occurrences of
   the substring in the input string.
2. I created separate unit tests for both methods
3. The surprising result was the test with all characters repeated. I didn't expect
   that the longest repeated string would be 1 character less than the entire string.
4. I also decided that an empty input would return an empty substring.
5. In terms of performance and optimizations 
   
   - using internal String methods is probably faster 
   - can reduce loop to look only up to input-length(substring)
   - performance degrades with large strings
