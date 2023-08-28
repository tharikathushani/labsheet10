object q2 {
    def main(args: Array[String]): Unit = {
      val inputWords = List("apple", "banana", "cherry", "date")
      val totalLetterOccurrences = countLetterOccurrences(inputWords)
      println(s"Total count of letter occurrences: $totalLetterOccurrences")
    }

    def countLetterOccurrences(words: List[String]): Int = {
      val wordLengths = words.map(_.length)
      val totalOccurrences = wordLengths.reduce((len1, len2) => len1 + len2)
      totalOccurrences
    }
  }


