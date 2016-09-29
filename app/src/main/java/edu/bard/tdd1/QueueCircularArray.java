package edu.bard.tdd1;
/**
   Implements the Queue Interface.  The queue goes from head to tail
   by increasing index, inclusive, and may wrap around the array.
*/

public class QueueCircularArray<T> implements Queue<T> {
    private T[ ] items; // circular array of items
    private int head; // location of first item in queue
    private int tail;  // location of last item in queue
    private int N; // number of items in the queue

    public QueueCircularArray() {
	clear();
    }

    public boolean isEmpty() {	return N == 0;  }

    /**
       Return number of items enqueued.
    */
    public int size() { return N;}

    /**
      Resize this.arr to max, copying old elements int new array.
      Copies into 0 to N-1.
    */
    private void resize(int oldsize,int newsize) {
		// TODO
    }

    /**
       @param newItem item added to tail of queue.
    */
    public void enqueue(T newItem) {
	if (N == items.length)
	    resize(items.length,2*items.length);
	tail = (tail+1) % (items.length);
	items[tail] = newItem;
	N++;
    }

    /**
       Removes and returns head of queue.
       @return head of queue
    */
    public T dequeue() throws QueueException {
	if (isEmpty()) {
	    throw new QueueException("QueueException on dequeue: "+
				     "Queue empty");
	}
	if (N < items.length/4) {
	    System.out.println("Q shrinking to " + items.length/2);
	    resize(items.length,items.length/2);
	}
	// queue is not empty; remove head
	T queueHead = items[head];
	head = (head+1) % (items.length);
	N--;
	return queueHead;
    }

    /**
       Empty the queue.
    */
    public void clear () {
	items = (T [ ]) new Object[1];  
	head = 0;
	tail = items.length - 1;
	N = 0;
    }

    public T peek() {
	if (isEmpty()) return null;
	// queue is not empty; retrieve head
	return items[head];
    }

    public String toString() {
	int i = head;
	int num = 0;
	String s = "Q: ";
	while (num < N) {
	    s += " " + items[i].toString();
	    i = (i + 1) % items.length;
	    num++;
	}
	return s;
    }
	    
    
} 
