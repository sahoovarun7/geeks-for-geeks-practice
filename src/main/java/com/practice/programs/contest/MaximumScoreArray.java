package com.practice.programs.contest;

/**
 * Maximum Score of Array
 *
 *
 * Given an array "arr" of positive integers with length N, your goal is to achieve the maximum possible score by removing elements from either the beginning or the end of the array. The score for removing an element is calculated as:
 *
 * Score = element * length(arr) + minimum(arr)
 *
 * Here, "arr" is considered before the current operation, and you can choose to remove elements from the start or end of the array.
 * "element" represents the value of the removed element.
 *
 *
 *
 * Input:
 * N = 2
 * arr = {1, 2}
 * Output: 7
 * Explanation: A possilbe way to perform the operations
 * -> remove first element,
 * score = 1*length({1,2}) + min({1,2}) = 3
 * updated arr = {2}
 *
 * -> remove last element
 * score = 2*length({2}) + min({2}) = 4
 *
 * -> total score = 3 + 4 = 7
 *
 *
 * Input:
 * N = 3
 * arr = {2,3,4}
 * Output: 26
 * Explanation: A possilbe way to perform the operations
 * -> remove 4 from last,
 * score = 4*length({2,3,4})+min({2,3,4}) = 14
 * updated arr = {2,3}
 *
 * -> remove 2 from start,
 * score = 2*length({2,3})+min({2,3}) = 6
 * updated arr = {3}
 *
 * -> remove last element 3,
 * score = 3*length({3})+min({3}) = 6
 *
 * -> total score = 14 + 6 + 6 = 26
 *
 *
 *
 */
public class MaximumScoreArray {
}
