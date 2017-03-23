/**
 *
 *  @author SreePurna
 */
class ReverseSingleLinkedList{
	public static void main(String args[]){
		SLL s= new SLL();
		int insertElements[]={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<insertElements.length;i++){
			s.insertAtEnd(insertElements[i]);
		}
		s.print();
		s.printReverseList(s.getHead());
		s.reverseRecursive();
		s.print();
		s.reverseLoop();
		s.print();
		s.reversePairs();
		s.print();
	}
}