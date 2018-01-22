import java.util.Scanner;

public class SimpleMath {
	
	 Scanner input=new Scanner(System.in);

	 public void add() {
	  int firstNumber = 0;
	  int secondNumber = 0;
	  int sum = 0;
	  System.out.println(" Please enter first number on which you want to perform add operation ");
	  firstNumber = input.nextInt();
	  System.out.println(" Please enter first number on which you want to perform add operation ");
	  secondNumber = input.nextInt();
	  sum = firstNumber + secondNumber;
	  System.out.println("Sum is "+sum);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner choiceinput=new Scanner(System.in);
	    SimpleMath sm = new SimpleMath();
	    int choice = 0;
	    System.out.println(" Please enter the choice of the operation you want to perform ");
	    System.out.println(" 1. Sum");
	    System.out.println(" 2. Multiply");
	    System.out.println(" 3. Subtract");
	    choice = choiceinput.nextInt();
	    switch(choice)
	    {
	      case 1:
	             sm.add();        
	             break;
	      default: 
	          System.out.println(" Wrong choice ");
	     }
	}

}
