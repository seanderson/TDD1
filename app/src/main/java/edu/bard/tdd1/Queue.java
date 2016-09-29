package edu.bard.tdd1;

public interface Queue<T> {  

    /** 
     * @return number of elements in the queue.
     */
    int size();  

    /** 
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty(); 

    /**
     * Inspect the element at the front of the queue.
     *
     * @return element at the front of the queue or null if empty
     */
    T peek();

    /** 
     * Insert an element at the rear of the queue.
     *
     * @param element new element to be inserted.
     */
    void enqueue (T element); 

    /** 
     * Remove the element at the front of the queue.
     *
     * @return element removed.
     * @exception QueueEmptyException if the queue is empty.
     */
    T dequeue() throws QueueEmptyException; 


    /** 
     * Empty the queue.
     *
     */
    void clear();
    
}
