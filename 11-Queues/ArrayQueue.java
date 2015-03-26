public class ArrayQueue {

    private int[] queue;
    private int index;

    public ArrayQueue() {
	queue = new int[10];
	index = 0;
    }

    public void grow() {
	int[] tmp = new int[queue.length+10];
	for (int i=0;i<queue.length;i++) {
	    tmp[i] = queue[i];
	}
	queue = tmp;
	index = index + 1;
    }

    public void enqueue( int data ) {
	queue[index] = data;
	index = index + 1;
    }

    public boolean full() {

    }

}
