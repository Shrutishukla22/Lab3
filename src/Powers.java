import java.util.Scanner;

public class Powers {
	
	public static int getValue(int num ,int x){
		int result=1; 
		for(int i=1;i<=x;i++){
		 	result = num*result;
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner scan1= new Scanner(System.in);
		//prompt user for input
		System.out.println("please enter the number here:");
		int input=scan1.nextInt();
		scan1.nextLine();
      // System.out.println(input);
		System.out.println("***********************" );
		System.out.println("Number"+"\t"  +"Squared"+ "\t"  +"Cubed" );
		System.out.println("======"+"\t"  +"======="+ "\t"  +"=======" );
		for(int i=1;i<=input;i++){
			//System.out.println(i);
			
			//System.out.println("square of number is:"+ getValue(i ,2));
			//System.out.println("cube of number is:"+ getValue(i ,3));
			System.out.println(i+ "\t"  +getValue(i ,2)+"\t"+getValue(i ,3));
		}
		
		
		
	}

}
