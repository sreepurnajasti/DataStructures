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
     * This method is used to return the head of the linked list.
     */
	public Node getHead(){
		return head;
	}
	/**
	 *
     * This method is used to display the reverse order of the linked list.
     * @param currentNode: head Node of the list is passed.
     */
	public void printReverseList(Node currentNode){
		if(currentNode!=null){
			printReverseList(currentNode.next);
			System.out.print(currentNode.data);
		}
	}
	/**
     * This method is used to add two linked lists.
     * @param head1: takes head node of first linked list.
     * @param head2: takes head node of second linked list.
     * @return result sum of two linked list.
     */
	public SLL addLists(Node head1,Node head2){
		//System.out.println(length1);
		SLL result = new SLL();
		int sum=0;
		int carry=0;
		while(head1!=null || head2!=null){
			if(head1==null && head2 !=null){
				System.out.print("CARRY:"+carry+" Head2:"+head2.data);
				sum= carry+head2.data;
				if(sum>9){
					int temp= sum%10;
					carry= sum/10;
					sum=temp;
				}else{
					sum= sum%10;
					carry=0;
				}
				result.insertAtEnd(sum);
				head2= head2.next;
			}else if(head1!=null && head2==null){
				sum= carry+head1.data;
				if(sum>9){
					int temp= sum%10;
					carry= sum/10;
					sum=temp;
				}else{
					sum= sum%10;
					carry=0;
				}
				result.insertAtEnd(sum);
				head1= head1.next;
			}else{
				sum= carry+head1.data+ head2.data;
				if(sum>9){
					int temp= sum%10;
					carry= sum/10;
					sum= temp;
				}else{
					sum= sum%10;
					carry=0;
				}
				result.insertAtEnd(sum);
				head1= head1.next;
				head2= head2.next;
			}
		}
		if(head1==null && head2==null){
			if(carry>0){
				result.insertAtEnd(carry);
			}
		}
		return result;

	}

}