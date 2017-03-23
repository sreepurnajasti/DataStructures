class FindNodeFromEnd{
	public static void main(String args[]){
	    LinkedList l= new LinkedList();
		for(int i=10;i>0;i--){
			l.insertAtBegin(i*10);
		}
		l.print();
		l.findnthNodeFromEnd(5);
	}
}