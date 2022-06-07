
package com.mycompany.test;


public class CircQueue<E> implements CircularQueue<E>   {
    CircularlyLinkedList<E> list = new CircularlyLinkedList<>();

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void rotate() {
        list.rotate();
    }
    
     
}
