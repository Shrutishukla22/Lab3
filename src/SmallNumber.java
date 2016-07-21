import java.util.Scanner;

public class SmallNumber {
	
	public static int gettingSmallNumber(int num1,int num2 ){
		int smallNumber = 0;
		if(num1<num2)
			smallNumber= num1;
		else
			smallNumber= num2;
		return smallNumber;
	}
	

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
       System.out.println("please enter  number:");
       int number1 = scan1.nextInt();
          scan1.nextLine();
          System.out.println("please enter  number:");
       int number2 = scan1.nextInt();
       scan1.nextLine(); 
       int smallerNumber = gettingSmallNumber(number1,number2);
       System.out.println(smallerNumber);
	}

}
