package com.practice.programs.contest;

import java.util.PriorityQueue;

/**
 *
 * As Women's Day is coming, Geek decided to give one flower to each woman he knows.
 * Geek knows K women. Geek's neighbour has a garden in which there are N flowers and each flower has a beauty associated with it i.e. ith flower has B[i] beauty. Geek wants to pluck exactly K flowers from his neighbour's garden such that the sum of beauties of all flowers he plucked is maximum but to not get caught he can't pluck more than one flower in a row, more formally he can't pluck two flowers if they are adjacent.
 * Your task is to find maximum sum of beauty of all flowers Geek can get.
 *
 *
 * Input:
 * N = 3
 * K = 2
 * B[] = {1, 1000000, 1}
 * Output:
 * 2
 * Explanation:
 * Geek has only one option i.e. plucking
 * first and third flower.
 *
 */
public class PluckFlowers {

    public static void main(String[] args) {
        // Create a PriorityQueue to store integers in ascending order
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Insert data into the PriorityQueue
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);

        System.out.println(priorityQueue);
        // Elements will be sorted automatically
        // Peek and remove elements to observe the sorted order
        int first = priorityQueue.peek();
        if(first < 6){
            priorityQueue.poll();
            priorityQueue.offer(5);
        }
        System.out.println(priorityQueue);
        double sum = priorityQueue.stream().mapToDouble(each -> each).sum();
        System.out.println(sum);
        long finalSum = (long) sum;
    }
}
