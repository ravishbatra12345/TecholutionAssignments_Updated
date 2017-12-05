public class BalancedOrNot {

	private static boolean balancedOrNot(String input){
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for(int i=0; i < input.length(); i++){
			String str = ""+input.charAt(i);		//store characters as String

			//if opening bracket then push into stack
			if(str.equals("<") 
			{
				stack.push(str);
			}

			//if closing bracket, pop bracket and compare if its a pair
			if(str.equals(">")
			 {
				//if stack becomes empty in between then also its not balanced
				if(stack.isEmpty()){
					return false;
				}
				String opening = stack.peek();
				if(str.equals(">") && opening.equals("<")){
					stack.pop();
				}
			}			
		}
		//if stack is empty at end, then its balanced
		if(input.length() > 0 && stack.isEmpty()){
			isBalanaced = true;
		}

		return isBalanaced;
	}

	public static void main(String[] args) throws IOException{
		String[] inputs = {"<<>>","<<<<<>>","<<><>>"};		

		for(String input : inputs){
			boolean flag = balancedOrNot(input);
			if(flag){	
				System.out.println(1);
			}else{
				System.out.println(0);
			}		
		}
	}
}