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
	 * This method is used to get the middle element of the linked list.
	 */
	public void getMiddleElement(){
		Node fast= head;
		Node slow= head;
		while(fast!=null){
			if(fast.next==null){
				break;
			}
			else if(fast.next.next==null){
				break;
			}else{
				fast= fast.next.next;
				slow=slow.next;
			}
		}
		System.out.println(slow.data);
	}
}