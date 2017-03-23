/**
 *
 * @author SreePurna
 */
class SingleLinkedList{
	public static void main(String[] args) {
		SLL s= new SLL();
		s.insertAtEnd(10);
		s.insertAtEnd(11);
		s.insertAtBegin(1);
		s.insertAtBegin(2);
		s.insertAtIndex(3,0);
		s.getLength();
		s.insertAtIndex(4,2);
		s.getHead();
		s.getTail();
		s.print();
		s.deleteAtEnd();
		s.deleteAtBegin();
		s.deleteAtIndex(1);
		s.deleteElement(2);
		s.setElement(10,2);
		s.print();
	}
}