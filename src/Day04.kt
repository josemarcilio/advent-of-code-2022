fun main() {
    fun part1(input: List<String>): Int {
        return input.count { line ->
            val (dumb, dumber) = line.split(',').map{ it.split('-').map(String::toInt) }
            val dumbContainsDumber = dumb.first() <= dumber.first() && dumb.last() >= dumber.last()
            val dumberContainsDumb = dumber.first() <= dumb.first() && dumber.last() >= dumb.last()

            dumbContainsDumber || dumberContainsDumb
        }
    }

    fun part2(input: List<String>): Int {
        return input.count { line ->
            val (dumb, dumber) = line.split(',').map{ it.split('-').map(String::toInt) }
            val dumbOverlapsDumber = dumb.first() <= dumber.last()
            var dumberOverlapsDumb = dumb.last() >= dumber.first()

            dumbOverlapsDumber && dumberOverlapsDumb
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day04_test")
    check(part1(testInput) == 2)
    check(part2(testInput) == 4)

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}
