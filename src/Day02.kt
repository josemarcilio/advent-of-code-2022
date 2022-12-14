fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf {
            val (elf, me) = it.split(" ")

            mapOf(
                "A" to mapOf("X" to 4, "Y" to 8, "Z" to 3),
                "B" to mapOf("X" to 1, "Y" to 5, "Z" to 9),
                "C" to mapOf("X" to 7, "Y" to 2, "Z" to 6)
            )[elf]!![me]!!
        }
    }

    fun part2(input: List<String>): Int {
        return input.sumOf {
            val (elf, me) = it.split(" ")

            mapOf(
                "A" to mapOf("X" to 3, "Y" to 4, "Z" to 8),
                "B" to mapOf("X" to 1, "Y" to 5, "Z" to 9),
                "C" to mapOf("X" to 2, "Y" to 6, "Z" to 7),
            )[elf]!![me]!!
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
