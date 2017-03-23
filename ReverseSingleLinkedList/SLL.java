/**
 *
 * @author SreePurna
 */

public class SLL{
	Node head;
	
	/**
	 *
     * This method is used insert data at the end of list.
     * @param data: Integer value which is to be inserted.
     */
	public void insertAtEnd(int data){
		if(head==null){
			head= new Node();
			head.data= data;
		}else{
			Node currentNode= head;
			while(currentNode.next!= null){
				currentNode= currentNode.next;
			}
			Node newNode= new Node();
			newNode.data= data;
			currentNode.next = newNode;
		}
	} 
	/**
	 *
	 * This method is used to call reverseInPairs method. 
	 */
	public void reversePairs(){
		head= reverseInPairs(head);
	}
	/**
	 *
	 * This method is used to reverse the list in pairs.
	 * @param head Node of the list is passed.
	 */
	public Node reverseInPairs(Node currentNode){
		if(currentNode==null ||currentNode.next==null){
			return currentNode;
		}else{
			Node temp= currentNode.next;
			currentNode.next=temp.next;
			temp.next=currentNode;
			currentNode.next= reverseInPairs(currentNode.next);
			return temp;
		}

	}
	/**
	 *
     * This method is used to reverse the list through a loop.
     */
	public void reverseLoop(){
		Node reverse =null;
		Node currentNode=head;
		while(currentNode!=null){
			Node temp= currentNode;
			currentNode= currentNode.next;
			temp.next=reverse;
			reverse= temp;
		}
		head=reverse;
	}

	/**
	 *
     * This method is used to call the method reverseListRecursive.
     */
	public void reverseRecursive(){
		Node reverse=null;
		reverseListRecursive(head,reverse);
	}
	/**
	 *
     * This method is used to reverse the elements in linked list recursively.
     * @param main: head Node of linked list.
     * @param reverse: null Node which stores the linked list in reverse order.
     */
	public void reverseListRecursive(Node main,Node reverse){
		if(main!=null){
			Node currentNode= main;
			main= main.next;
			currentNode.next=reverse;
			reverse= currentNode;
			reverseListRecursive(main,reverse);
		}
		else{
			head=reverse;
		}
	}
	/**
	 *
     * This method is used to display the print the elements in linked list.
     */
	public void print(){
		System.out.println("printing the elements in list");
		Node currentNode = head;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode= currentNode.next;
		}
	}

	/**
	 *
     * This method is used to display the reverse order of the linked list.
     * @param currentNode: head Node of the list is passed.
     */

	public void printReverseList(Node currentNode){
		if(currentNode!=null){
			printReverseList(currentNode.next);
			System.out.println(currentNode.data);
		}
	}

	/**
	 *
     * This method is used to return the head of the linked list.
     */
	public Node getHead(){
		return head;
	}

}