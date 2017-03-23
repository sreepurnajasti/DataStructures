/**
 *
 * @author sreepurna
 */
class DLL{
	Node head;
	/**
 	 * 
 	 * This method is used to insert an data at the end of the list.
 	 * @param data: integer value is passed to add at the end of the list.
 	 */
	public void insertAtEnd(int data){
		if(head==null){
			head= new Node();
			head.data= data;
			head.next= null;
			head.prev= null;
		}else{
			Node currentNode= head;
			while(currentNode.next!=null){
				currentNode= currentNode.next;
			}
			Node temp= new Node();
			currentNode.next = temp;
			temp.data= data;
			temp.prev= currentNode;
			temp.next= null;
		}
	}
	/**
 	 * 
 	 * This method is used to insert an data at the begining of the list.
 	 * @param data: integer value is passed to add at the begining of the list.
 	 */
	public void insertAtBegin(int data){
		Node currentNode= new Node();
		currentNode.data= data;
		currentNode.prev= null;
		currentNode.next= head;
		head = currentNode;
	}
	/**
	 *
     * This method is used insert data at a particular index in the list.
     * @param data: Integer value which is to be inserted.
     * @param index: Integer value is used to indicate the position at which data need to be inserted.
     */
	public void insertAtPosition(int data,int index){
		if((head==null && index==0) || index==0){
			insertAtBegin(data);
			return;
		}else if(index<0 || head==null && index>0){
			System.out.println("Invalid position");
		}else{
			int count=0;
			Node currentNode= head;
			while(currentNode!=null){
				if(count<index-1){
					currentNode= currentNode.next;
					count++;
				}else if(count==index-1){
					break;
				}
			}
		
			Node temp= new Node();
			temp.data= data;
			temp.prev= currentNode;
			if(currentNode.next!=null){
			temp.next= currentNode.next;
			currentNode.next= temp;}

		}
	}
	/**
	 *
     * This method is used delete data at the begining of list.
     */
	public void deleteAtBegin(){
		head= head.next;
		head.prev= null;
	}
	/**
	 *
     * This method is used delete data at the end of list.
     */
	public void deleteAtEnd(){
		if(head==null){
			System.out.println("Cannot delete an empty list");
		}else if(head.next==null){
			head= null;
		}
		else{
			Node currentNode= head;
			while(currentNode.next.next!=null){
				currentNode= currentNode.next;
			}
			currentNode.next=null;
		}
	}
	/**
	 *
     * This method is used delete data at the particular position in the list.
     * @param index: index is used to indicate the position at which data need to be deleted.
     */
	public void deleteAtPosition(int index){
		if(index<0 || head==null && index>=0){
			System.out.println("Invalid position");
		}else if(index==0 && head!=null){
			deleteAtBegin();
		}else{
			int count=0;
			Node currentNode= head;
			while(currentNode!=null){
				if(count<index-1){
					currentNode= currentNode.next;
					count++;
				}else if(count==index-1){
					break;
				}
			}
			if(currentNode.next.next == null){
				currentNode.next = null;
				return;
			}
			currentNode.next.next.prev= currentNode;
			currentNode.next= currentNode.next.next;
		}
	}
	/**
	 *
     * This method is used to display the length of linked list.
     */
	public void getLength(){
		int count=0;
		Node currentNode=head;
		while(currentNode!=null){
			count++;
			currentNode= currentNode.next;
		}
		System.out.println("length of list:"+count);

	}
	/**
	 *
     * This method is used to display the print the elements in linked list.
     */
	public void print(){
		Node currentNode=head;
		System.out.println();
		while(currentNode!=null){
			System.out.print(currentNode.data+"->");
			currentNode= currentNode.next;
		}
	}
}