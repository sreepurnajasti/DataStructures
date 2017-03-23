import java.util.Scanner;
class CheckBalanceParathesis{
	Node head;
	/**
	 *
	 * This method is used to insert the data in the stack.
	 * @param data: Character data type which is needed to be inserted in stack.
 	 *
	 */
	public void push(char data){
		if(head== null){
			head= new Node();
			head.data= data;
			head.next=null;
		}
		else{
			Node currentNode= new Node();
			currentNode.data= data;
			currentNode.next= head;
			head=currentNode;
		}
	}
	/**
	 *
	 * This method is used to delete the data in the stack.
	 */
	public void pop(){
		
		if(head!=null){
			Node currentNode= new Node();
			if(currentNode.next==null){
				
				head= null;
			}else{
				while(currentNode.next.next!=null){
					currentNode= currentNode.next;
				}
				currentNode.next= null;
			}

		}
	}
	/**
	 *
	 * This method is used to display the elements of stack.
	 */
	public void print(){
		if(head!= null){
			Node currentNode= head;
			while(currentNode!=null){
				currentNode= currentNode.next;
			}
		}
	}
	/**
	 *
	 * This method is used to display whether the stack is empty or not.
	 */
	public boolean isEmpty(){
		if(head==null)
			return true;
		else
			return false;
	}
	/**
	 *
	 * This method is used to display whether the stack is empty or not.
	 */
	public boolean checkParathesis(char data){
		if(head!= null){
			Node currentNode= head;
			while(currentNode.next!=null){
				currentNode= currentNode.next;
			}
			
			if(currentNode.data== '('){
				if(data==')'){
					pop();
					return true;
				}else{
					return false;
				}
			}
			else if(currentNode.data== '{'){
				if(data=='}'){
					pop();
					return true;
				}else{
					return false;
				}
			}
			else if(currentNode.data== '['){
				if(data==']'){
					pop();
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}

		}else
			return false;
	}
	public static void main(String args[]){
		CheckBalanceParathesis c= new CheckBalanceParathesis();
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		boolean resultFlag=false;
		for(int i=0;i<input.length();i++){
			char element= input.charAt(i);
			switch(element){
				case '[':
						c.push(element);
						break;
				case '(':
						c.push(element);
						break;
				case '{':
						c.push(element);
						break;
				case ']':
						if(c.checkParathesis(element))
							resultFlag=true;
						else
							resultFlag=false;
						break;
				case ')':
						if(c.checkParathesis(element))
							resultFlag=true;
						else
							resultFlag=false;
						break;
				case '}':
						if(c.checkParathesis(element))
							resultFlag=true;
						else
							resultFlag=false;
						break;
			}
			
		}
		if(resultFlag==false){
			System.out.println("Inbalanced Expression");
		}
		else if(c.isEmpty())
			System.out.println("Balanced Expression");
		else
			System.out.println("Inbalanced Expression");
	}
}