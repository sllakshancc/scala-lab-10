def countLetterOccurrences(words: List[String]): Int = {

  val lengths = words.map(word => word.length)

  val count = lengths.reduce((x, y) => x + y)

  count
}

@main def main() = {
    val fruits = List("apple", "banana", "cherry", "date")
    val count = countLetterOccurrences(fruits)
    println(s"Total count of letter occurrences: $count")
}

