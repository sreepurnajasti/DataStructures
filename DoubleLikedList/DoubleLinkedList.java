/**
 *
 * @author sreepurna
 */
public class DoubleLinkedList{
	public static void main(String args[]){
		DLL d= new DLL();
		d.insertAtBegin(2);
		d.insertAtBegin(1);
		d.insertAtEnd(5);
		d.insertAtEnd(4);
		d.insertAtPosition(3,2);
		d.deleteAtBegin();
		d.deleteAtEnd();
		d.deleteAtPosition(1);
		d.print();
	}
}