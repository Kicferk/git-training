package com.gitTraining

fun computeFibbonaciNumber(position: Int): Int {
    if (position == 0) return 0
    if (position < 0) {
        return computeNegativeFibbonachi(position)
    }
    var i = 1
    var j = 1

    if (position <= 2) return 1

    var currentPosition = 2
    while (currentPosition < position) {
        val temp = i
        i = j
        j += temp
        currentPosition ++
    }
    return j
}

fun computeNegativeFibbonachi(position:Int): Int {
    if (position >= 0) throw Exception("potition must be smaller than zero!")
    val resultIsNegative = position % 2 == 0
    val absoluteResult = computeFibbonaciNumber(-position)
    return if (resultIsNegative) (absoluteResult * -1) else absoluteResult
}
