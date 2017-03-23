/**
 *
 * @author SreePurna
 */
class StackLinkedList{
	public static void main(String args[]){
		StackOperation s= new StackOperation();
		System.out.println("stack is empty: "+s.isEmptyStack());
		s.push(10);
		s.push(20);
		s.push(30);
		s.top();
		s.size();
		s.pop();
		s.size();

	}
}