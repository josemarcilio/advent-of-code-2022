fun main() {
    fun part1(input: String): Int {
        return input
            .splitEmptyLines()
            .maxOf { it
                .splitLines()
                .sumOf(String::toInt)
            }
    }

    fun part2(input: String): Int {
        return input.splitEmptyLines()
            .map{ it
                .splitLines()
                .sumOf(String::toInt)
            }
            .top(3)
            .sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInputText("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInputText("Day01")
    println(part1(input))
    println(part2(input))
}
