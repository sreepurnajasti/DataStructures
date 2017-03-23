/**
 *
 * @author SreePurna
 */

public class MiddleElementLinkedList{
	public static void main(String args[]){
		SLL s= new SLL();
		for(int i=1;i<10;i++){
			s.insertAtEnd(i);
		}
		s.getMiddleElement();
		s.print();
	}
}