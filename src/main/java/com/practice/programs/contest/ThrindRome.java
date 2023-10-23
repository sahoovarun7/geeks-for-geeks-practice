package com.practice.programs.contest;

/**
 *
 * A Thrindrome is a palindromic sequence of length three.
 * A tree has N nodes numbered 0, 1,... N - 1. The structure of the tree is given by array p[ ] of size N where p[i] is the direct ancestor of ith node and p[0] = -1 as 0 is the root of the tree. Also, you are given a string C of size N, where C[i] represents the character written on the ith node.
 * Find the number of triplets of nodes (a, b, c){a≠ b≠ c} such that node b comes in the simple path from node a to c and C[a], C[b], and C[c] forms Thrindrome.
 *
 * Input:
 * N = 5
 * p[] = {-1, 0, 0, 1, 1}
 * C = "accaa"
 * Output:
 * 8
 * Explanation:
 * Tree looks like:
 *             0'a'
 *            /   \
 *         1'c'   2'c'
 *       /   \
 *      3'a'   4'a'
 * Possible triplets are
 * (1, 0, 2), (2, 0, 1),
 * (3, 1, 0), (4, 1, 0),
 * (0, 1, 4), (0, 1, 3),
 * (3, 1, 4), (4, 1, 3)
 *
 *
 */
public class ThrindRome {
}
