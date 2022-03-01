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
        pq.offer(96);
        pq.offer(65);
        // poll method will delete the minimum element from the list.
        pq.poll();
        System.out.println(pq);

        /*
        peek method will return the smallest element from te list.
         */
        System.out.println(pq.peek());
        /*
        This is a minimum heap data structure which means, the element which is minimum
        will be removed first.
         */


    }
}
