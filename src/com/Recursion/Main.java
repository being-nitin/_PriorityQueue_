package com.Recursion;
import java.util.PriorityQueue;
public class Main {

    public static void main(String[] args) {
	/*
	Priority queue with its methods.
	With this we can set a priority for a particular element.
	 */
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    // offer method will add an element in a priority queue.
        pq.offer(90);
        pq.offer(78);
        pq.offer(87);
        pq.offer(94);
        pq.offer(98);
        pq.poll();
        System.out.println(pq);
    }
}
