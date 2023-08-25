package day1.array



fun checkContainsDuplicate(arr: IntArray): Boolean {

    return !arr.distinct().size.equals(arr.toList().size)
}