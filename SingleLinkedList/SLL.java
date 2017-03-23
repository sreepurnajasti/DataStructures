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
     * This method is used insert data at a particular index in the list.
     * @param data: Integer value which is to be inserted.
     * @param index: Integer value is used to indicate the position at which data need to be inserted.
     */
	
	public void insertAtIndex(int data, int index){
		int count=0;
		if(index==0){
			insertAtBegin(data);
		}else if(head!=null && index>0) {
			Node currentNode= head;
			Boolean flag= true;
			while(currentNode!=null){
				if(count<index-1){
					count++;
					currentNode=currentNode.next;
					flag=true;
				}else if(count== index-1){
					flag=true;
					break;
				}else{
					System.out.println("Insertion Failed due to invalid position");
					flag=false;
					break;
				}
			}
			if(flag){
				Node newNode= new Node();
				newNode.data= data;
				Node currentNode2= currentNode.next;
				newNode.next= currentNode2;
				currentNode.next= newNode;
			}
		}else if((head==null && index>0) || (head==null && index<0)){
			System.out.println("Insertion Failed due to invalid position");
		}
	}
	
	/**
	 *
     * This method is used insert data at the begining of list.
     * @param data: data which is to be inserted.
     */
	public void insertAtBegin(int data){
		Node newNode = new Node();
		newNode.data= data;
		newNode.next= head;
		head= newNode;
	}
	
	/**
	 *
     * This method is used delete data at the end of list.
     */
	public void deleteAtEnd(){
		if(head==null){
			System.out.println("Cannot delete an element from empty list");
		}else{
			Node currentNode= head;
			if(currentNode.next==null){
				head=null;
			}
			else{ 
				while(currentNode.next.next!=null){
					currentNode=currentNode.next;
				}
				currentNode.next=null;
			}
		}
	}
	
	/**
	 *
     * This method is used delete data at the begining of list.
     */
	public void deleteAtBegin(){
		if(head==null){
			System.out.println("Cannot delete an element from empty list");
		}else{
			head= head.next;
		}
	}
	
	/**
	 *
     * This method is used delete data at the particular position in the list.
     * @param index: index is used to indicate the position at which data need to be deleted.
     */
	public void deleteAtIndex(int index){
		int count=0;
		if(head== null){
			System.out.println("Cannot delete an element from empty list");
		}else{
			Node currentNode= head;
			Boolean flag= true;
			while(currentNode!=null){
				if(count<index-1){
					currentNode= currentNode.next;
					flag=true;
					count++;
				}else if(count== index-1){
					flag=true;
					break;
				}
				else{
					System.out.println("Insertion Failed due to invalid position");
					flag= false;
					break;
				}
			}
			if(flag){
				currentNode.next= currentNode.next.next;
			}
		}

	}

	/**
	 *
     * This method is used delete the particular data in the list.
     * @param data: data which is to be deleted.
     */
	public void deleteElement(int data){
		if(head==null){
			System.out.println("Cannot delete an element from empty list");	
		}else{
			Node currentNode= head;
			if(currentNode.data== data){
				deleteAtBegin();
			}
			else if(currentNode.next==null){
				System.out.println("Cannot find the element in the LinkedList");
			}else{
				Boolean flag= false;
				while(currentNode.next!=null){
					if(currentNode.next.data != data){
					    currentNode = currentNode.next;
					}else if(currentNode.next.data == data){
						flag= true;
						break;
					}
				}
				if(flag){
					currentNode.next= currentNode.next.next;
				}
				else{
					System.out.println("Cannot find the element in the LinkedList");
				}
			}
		}
	}
	public void setElement(int data,int newData){
		if(head==null){
			System.out.println("Cannot set an element in empty list");	
		}else{
			Node currentNode= head;
			Boolean flag= true;
			while(currentNode!=null){
				if(currentNode.data== data){
					currentNode.data= newData;
					flag= true;
					break;
				}else{
					currentNode= currentNode.next;
					flag=false;
				}
			}
			if(!flag){
				System.out.println("Cannot find the element. Enter a valid element!!");
			}
		}
	}
	
	/**
	 *
     * This method is used to display the length of linked list.
     */
	public void getLength(){
		int length=0;
		Node currentNode= head;
		while(currentNode!=null){
			length++;
			currentNode=currentNode.next;
		}
		System.out.println("Length of LinkedList:"+length);
	}
	
	/**
	 *
     * This method is used to display the head.
     */
	public void getHead(){
		if(head!=null)
			System.out.println("Head is:"+head.data);
		else
			System.out.println("Empty List");
	}

	/**
	 *
     * This method is used to display the tail.
     */
	public void getTail(){
		Node currentNode= head;
		while(currentNode.next!=null){
			currentNode= currentNode.next;
		}
		System.out.println("Tail is:"+currentNode.data);
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
}