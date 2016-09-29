# TDD1: Exercise using Test-Driven Development with a Queue

This program is an Android App shell around a queue data type implemented with dynamic arrays that expand and shrink as necessary. The Android part of this has no real function; it merely runs a method that does a few enqueue and dequeue operations.  The implementation keeps track of head, tail, and the queue's size.  The head and tail pointers always increase during enqueue and dequeue but wrap around so that after several enqueue and dequeue operations that queue can occupy any contiguous sequence in the array, modulo the array's length.  

You are to implement the resize method using Testing First Development.  I have written and empty `resize` method for you.  You must determine a set of tests and implement them in `test/java/edu/bard/tdd1/QResizeUnitTest.java`.  

1. You should write a full set of tests for this method.
1. Your tests should fail prior to implementing the `resize` method.
1. Now implement the `resize` method and verify that your tests are passed.  If they are not passed, then repair your code until they are.
1. Once tests are passed you can refactor your code to make it efficient and easy to read.
