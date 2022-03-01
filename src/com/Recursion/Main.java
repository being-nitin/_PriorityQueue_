package com.Recursion;
import java.util.Comparator;
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


        // Case 2:
        /*
        if you want to give the priority to the largest element then use.
         */
        PriorityQueue <Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(98);
        pqr.offer(99);
        pqr.offer(101);
        pqr.offer(76);
        // now with poll method it will remove the largest element.
        pqr.poll();
        // and peek method will return the largest element.
        System.out.println(pqr.peek());
        System.out.println(pqr);
    }
}
