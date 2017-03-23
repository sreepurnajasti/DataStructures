/**
 *
 * @author SreePurna
 */
class CLL{
	Node head;
	/**
	 *
	 * This method is used to insert the element at the end of the circular list
	 * @param data: It is an integer value which is to be inserted on circular list.
	 */
	public void insertAtEnd(int data){
		if(head==null){
			head= new Node();
			head.data= data;
			head.next= head;
		}
		else{
			Node currentNode= head;
			while(currentNode.next!=head){
				currentNode= currentNode.next;
			}
			Node temp= new Node();
			temp.data= data;
			temp.next= head;
			currentNode.next=temp; 
		}
	}
	/**
 	 * 
 	 * This method is used to insert an data at the begining of the circular linked list.
 	 * @param data: Integer value is passed to add at the begining of the circular linked list.
 	 */
	public void insertAtBegin(int data){
		Node currentNode= new Node();
		currentNode.data= data;
		if(head==null){
			head= currentNode;
			head.next= head;
		}else{
			currentNode.next=head;
			Node temp= head;
			while(temp.next!=head){
				temp= temp.next;
			}
			temp.next= currentNode;
			head= currentNode;
		}
	}
	/**
	 *
     * This method is used delete data at the end of circular linked list.
     */
	public void deleteAtEnd(){
		if(head!=null){
			Node currentNode= head;
			if(currentNode.next!= head ){
				while(currentNode.next.next!=head){
					currentNode= currentNode.next;
				}
				currentNode.next=currentNode.next.next;

			}else{
				head=null;
			}
		}
	}
	/**
	 *
     * This method is used delete data at the begining of circular linked list.
     */
	public void deleteAtBegin(){
		if(head!=null && head.next!=head){
			Node currentNode= head.next;
			Node currentNode1= head.next;
			while(currentNode.next!=head){
				currentNode=currentNode.next;
			}
			currentNode.next= currentNode1;
			head= currentNode1;
		}else{
			head= null;
		}

	}
	/**
	 *
     * This method is used to display the length of circular linked list.
     */
	public void length(){
		int count=0;
		Node currentNode= head;
		if(head!=null){
			count++;
			currentNode= currentNode.next;
			while(currentNode!=head){
				count++;
				currentNode= currentNode.next;
			}
		}
		System.out.println("length of circular linked list:"+count);
	}
	/**
	 *
     * This method is used to display the print the elements in circular linked list.
     */
	public void print(){
		if(head!=null){
			System.out.println("Printing the elements in the circular linked list:");
			Node currentNode= head;
			System.out.print(currentNode.data);
			currentNode= currentNode.next;
			while(currentNode!=head){
				System.out.print(" "+currentNode.data);
				currentNode= currentNode.next;
			}
			System.out.println();
		}
	}
}