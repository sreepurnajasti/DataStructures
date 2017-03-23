class QueueOperations{
	Node head;
	/**
	 *
	 * This method is used to insert the element at the begining of the Queue.
	 * @param data: Integer value which is to be inserted.
	 */
	public void enqueue(int data){
		if(head==null){
			head= new Node();
			head.data= data;
			head.next= null;
		}
		else{
			Node currentNode= new Node();
			currentNode.data= data;
			currentNode.next= head;
			head= currentNode;
		}
	}
	/**
	 *
	 * This method is used to delete the first element from the Queue.
	 */
	public void dequeue(){
		if(head!=null){
			head= head.next;
		}else{
			System.out.println("Queue cannot be empty");
		}
	}
	/**
	 *
	 * This method is used to tell whether the queue is empty or not.
	 * @return boolean value. True - when queue is empty. False when queue contains element.
	 */
	public boolean isQueueEmpty(){
		if(head==null)
			return true;
		else
			return false;
	}
	/**
	 *
     * This method is used to display the print the elements in linked list.
     */
	public void print(){
		System.out.println("printing the elements in list");
		Node currentNode = head;
		while(currentNode!=null){
			System.out.print(currentNode.data+" ");
			currentNode= currentNode.next;
		}
		System.out.println();
	}
	
}