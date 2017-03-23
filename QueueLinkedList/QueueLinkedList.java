class QueueLinkedList{
	public static void main(String args[]){
		QueueOperations q= new QueueOperations();
		System.out.println("Is queue is empty: "+q.isQueueEmpty());
		for(int i=10;i>0;i--){
			q.enqueue(i*10);
		}
		q.print();
		System.out.println("Is queue is empty: "+q.isQueueEmpty());
		q.dequeue();
		q.print();
	}
}