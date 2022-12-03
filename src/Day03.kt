fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf {
            val (a, b) = it.chunked(it.length / 2).map(String::toSet)
            a.intersect(b).first().alphabeticalOrder()
        }
    }

    fun part2(input: List<String>): Int {
        return input
            .map { it.toSet() }
            .chunked(3)
            .sumOf { (a, b, c) ->
                a.intersect(b).intersect(c).first().alphabeticalOrder()
            }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
