package edu.bard.tdd1;
public class QueueEmptyException extends Exception {
    public QueueEmptyException(String msg) {
	super(msg);
    }
}