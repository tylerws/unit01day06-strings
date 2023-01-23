1. `ShortLongShort.java`

Take two command line argument Strings as input whose lengths are not equal. Then make a new String, that contains three parts: the shorter String followed by the longer String, followed by the shorter String.

Print that String. Examples:

`args[0]` | `args[1]` | printed output 
---|---|---
book | linked | booklinkedbook
elephant | dog | dogelephantdog

2. `NegatePhrase.java`

Take a command line argument String as input (put double quotes around the String in the terminal if it contains spaces, so it doesn't get interpreted as more than one command line argument). 

Make a new String which is the original string negated, that is, prefixed with the word "not". Except if it already started with the word "not", don't negate it again. Print that new String. Examples:

`args[0]` | printed output 
---|---
bad | not bad
"a small feat" | not a small feat
"not good" | not good
noteworthy | noteworthy

3. `Abbreviate.java`

Take a word as a command line argument. Make a new String which:
* is identical to the input word if that word was short (less than 8 characters)
* is an abbreviated version of the word for long words. The abbreviation should have the first two letters followed by "...", followed by the last two letters.
Print that String. Examples:

`args[0]` | printed output
---|---
brand | brand
briarwood | br...od
asinine | asinine
pneumothorax | pn...ax