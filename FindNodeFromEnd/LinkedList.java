class LinkedList{
	Node head;
	/**
	 *
     * This method is used insert data at the begining of list.
     * @param data: Integer value which is to be inserted.
     */
	public void insertAtBegin(int data){
		Node newNode = new Node();
		newNode.data= data;
		newNode.next= head;
		head= newNode;
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
	}
	/**
	 * 
	 * This method is used to find the nth element from the end of the linked list.
	 * @param n: Integer value to get particular element from the last.
	 */
	public void findnthNodeFromEnd(int n){
		Node fast= head;
		Node slow= head;
		for(int i=0;i<n;i++){
			if(fast!=null){
				fast= fast.next;
			}else{
				System.out.println("\nThere is no "+n+"th elements in the list");
				return;
			}
		}
		while(fast!=null){
			fast= fast.next;
			slow= slow.next;
		}
		System.out.println("\n"+n+"th elementh from the end of list is "+slow.data);
	}
}