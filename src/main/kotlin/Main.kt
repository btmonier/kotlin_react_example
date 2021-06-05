import kotlinx.browser.document
import kotlinx.css.*
import react.dom.*
import styled.css
import styled.styledDiv



val myVideos = listOf(
    Video(1, "Part 1: Cool Title", "www.google.com", "Brandon"),
    Video(2, "Part 2: Revenge", "www.ebay.com", "Sally")
)

fun main() {
    val colors = listOf("red", "green", "blue", "yellow")

    document.bgColor = colors.shuffled()[1]

}