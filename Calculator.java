import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator {

	public static void main(String[] args) throws Exception {
		
		Calculator c = new Calculator();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number 1 : ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter a number 2 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.print("\n\n1. Addition"
				+ "\n2. Subtraction"
				+ "\n3. Multiplication"
				+ "\n4. Division"
				+ "\nEnter Operation : ");
		
		int opt = Integer.parseInt(br.readLine());
		
		switch(opt){
		
		case 1 : System.out.println("\n" + num1 + " + " + num2 + " is " + c.add(num1, num2));
				 break;
				 
		case 2 : System.out.println("\n" + num1 + " - " + num2 + " is " + c.sub(num1, num2));
				 break;
		
		case 3 : System.out.println("\n" + num1 + " * " + num2 + " is " + c.mul(num1, num2));
		 		 break;
				
		case 4 : System.out.println("\n" + num1 + " / " + num2 + " is " + c.div(num1, num2));
		 		 break;
		 		 
		default : System.out.println("Wrong opration selected.");
				  break;
		
		}

	}
	
	public int add(int a,int b){
		
		return (a+b);
		
	}
	
	public int sub(int a,int b){
		
		return (a-b);
		
	}

	public int mul(int a,int b){
	
		return (a*b);
	
	}

	public int div(int a,int b){
	
		return (a/b);
	
	}

}
