package com.practice.programs.contest;

/**
 *
 * You are given a string S of lowercase Latin characters with size N.
 * Your task is to find the lexicographically smallest substring with the maximum frequency.
 *
 * Note: String p is lexicographically smaller than string q, if p
 * is a prefix of q, is not equal to q or there exists i, such
 * that pi < qi and for all j < i it is satisfied that
 * pj = qj. For example, abc is lexicographically smaller than abcd,
 * abd is lexicographically smaller than abec, afa is not lexicographically
 * smaller than ab and a is not lexicographically smaller than a.
 *
 *
 * Input:
 * N = 4
 * S = "gfgg"
 * Output:
 * "g"
 * Explanation:
 * Substring "g" is present 3
 * in the string and it can be proved
 * that it is the lexicographically
 * smallest one
 *
 */
public class HighFrequencey {

    public static void main(String[] args) {
        if('z' > 'r')
            System.out.println("true");
        else
            System.out.println("false");
    }
}
