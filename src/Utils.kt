import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Read text from the given input txt file.
 */
fun readInputText(name: String) = File("src", "$name.txt").readText().replace("\r\n", "\n")

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "$name.txt").readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

/**
 * Split string by new line character \n
 */
fun String.splitLines() = this.split("\n")

/**
 * Split string by two new line characters \n\n
 */
fun String.splitEmptyLines() = this.split("\n\n")

/**
 * Returns n max values from a list
 */
fun List<Int>.top(n: Int): List<Int> {
    return this.sortedDescending().subList(0, n)
}

/**
 * Return alphabetical order (Int) of a letter. Lowercase first.
 */
fun Char.alphabeticalOrder() = 1 + (('a'..'z') + ('A'..'Z')).indexOf(this)