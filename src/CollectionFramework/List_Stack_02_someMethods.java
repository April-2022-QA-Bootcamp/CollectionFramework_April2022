package CollectionFramework;

import java.util.Stack;

public class List_Stack_02_someMethods {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(5);//this will be tail
		stack.add(15);//it is extending Vector so we have add()
		stack.push(25);//push()
		stack.add(35);//this will be the head---peek
		System.out.println(stack.peek());
		
		System.out.println(stack.contains(25));
		
		System.out.println(stack.size());
		
	
		
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
				
			}
			
			stack.clear();
		
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
				
			}

	}

}
