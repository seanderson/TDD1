package edu.bard.tdd1;
import android.util.Log;

import java.util.*;

public class QueueTest {
	public static String TAG = "Qtest";

    public static void run(String[] args) {

		QueueCircularArray<Integer> aQueue = new QueueCircularArray<Integer>();
		int maxint = 5;
		// JUst enqueue a few items then dequeue them;
		for (int i = 0; i < maxint; i++) {
			aQueue.enqueue(new Integer(i));
			Log.i(TAG, "Enqueue " + i);
		}
		for (int i = 0; i < maxint; i++) {
			int val = aQueue.dequeue();
			Log.i(TAG, "Dequeue " + val);
		}
	}

}
