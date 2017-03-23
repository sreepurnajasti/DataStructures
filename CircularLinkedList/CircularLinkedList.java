/**
 *
 * @author SreePurna
 */
class CircularLinkedList{
	public static void main(String args[]){
		CLL c= new CLL();
		c.insertAtEnd(10);
		c.insertAtEnd(20);
		c.insertAtEnd(30);
		c.insertAtBegin(1);
		c.print();
		c.deleteAtEnd();
		c.print();
		c.deleteAtBegin();
		c.print();
	}
}