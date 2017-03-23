/**
 *
 * @author SreePurna
 */
import java.util.*;
class AddTwoLinkedList{
	public static void main(String args[]){
		System.out.println("enter two numbers");
		long first=0,second=0;
		try{
			Scanner sc= new Scanner(System.in);
			first= sc.nextLong();
			second= sc.nextLong();
		}catch(Exception ex){
			System.out.println("input is invalid");
		}
		SLL s= new SLL();
		SLL s1= new SLL();
		SLL s2= new SLL();
		while(first!=0){
			int digit=(int)first%10;
			s1.insertAtEnd(digit);
			first= first/10;
		}
		while(second!=0){
			int digit=(int)second%10;
			s2.insertAtEnd(digit);
			second= second/10;
		}
		s1.print();
		s2.print();
		s= s.addLists(s1.getHead(),s2.getHead());
		s.printReverseList(s.getHead());

	}
}