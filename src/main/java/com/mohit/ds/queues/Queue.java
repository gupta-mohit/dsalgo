package com.mohit.ds.queues;

import com.mohit.ds.queues.exception.QueueEmptyException;
import com.mohit.ds.queues.exception.QueueFullException;

public interface Queue {

	 // return the size of the queue
    public int size();
     
    public boolean isEmpty();
     
    public boolean isFull();
     
    // insert an element into the queue 
    public void enqueue(Object obj) throws QueueFullException;
     
    // removes an element from the queue 
    public Object dequeue() throws QueueEmptyException; 
 
}
