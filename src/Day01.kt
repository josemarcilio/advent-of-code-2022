fun main() {
    fun part1(input: String): Int {
        val caloriesByElf = input.split("\n\n")

        return caloriesByElf.maxOf {
            it.split("\n").sumOf(String::toInt)
        }
    }

    fun part2(input: String): Int {
        val caloriesByElf = input.split("\n\n")

        return caloriesByElf
            .map{ it.split("\n").sumOf(String::toInt) }
            .sortedDescending()
            .subList(0, 3)
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
