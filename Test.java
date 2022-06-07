
package com.mycompany.test;

public class Test {

    public static void main(String[] args) {
       CircularQueue<String> q = new CircQueue<>();
        q.enqueue("Subham");
        q.enqueue("Jonathan");
        q.enqueue("Subha");
        q.enqueue("Aniket");
        q.rotate();
        while(!(q.isEmpty())) {
            System.out.println(q.dequeue());
        }
        System.out.println("The size is " + q.size());
        q.enqueue("Alex");
        System.out.println(q.size());
    }
}
