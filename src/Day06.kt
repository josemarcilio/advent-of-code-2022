fun main() {
    fun solve(input: String, window: Int): Int {
        return input.indices.windowed(window, step = 1) { values ->
            if (values.map{ input[it] }.toSet().size == window) {
                return@windowed values.last() + 1
            }

            -1
        }.first { it > 0 }
    }

    fun part1(input: String) = solve(input, 4)

    fun part2(input: String) = solve(input, 14)

    // test if implementation meets criteria from the description, like:
    val testInput = readInputText("Day06_test")
    check(part1(testInput) == 11)
    check(part2(testInput) == 26)

    val input = readInputText("Day06")
    println(part1(input))
    println(part2(input))
}
