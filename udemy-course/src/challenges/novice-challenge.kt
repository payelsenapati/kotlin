fun main() {
    val myBookArrayList: ArrayList<String> = arrayListOf(
            "In Search of Lost Time",
            "Ulysses",
            "Don Quixote",
            "The Great Gatsby",
            "One Hundred Years of Solitude",
            "Moby Dick",
            "War and Peace",
            "Lolita",
            "Hamlet",
            "The Catcher in the Rye"
    )

    for (book in myBookArrayList) {
        if (book.contains('e')) {
            for (myChar in book) {
                println(myChar)
            }
            println("#######################################################################")
        }

    }
}
