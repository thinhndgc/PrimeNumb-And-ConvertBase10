import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertBase10 {
	private static Scanner input;
	public static void main(String[] args) {
		int base = 0;
		int number = 0;
		boolean flag = false;
		input = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = input.nextInt();
		while (!flag) {
			System.out.println("Enter base you want to convert:");
			base = input.nextInt();
			if (1 < base && base <= 36) {
				flag = true;
			}
		}
		convertBaseK(number, base);
		
	}
	
	public static void convertBaseK(int number, int base){
		List<Integer> primeNumberList = new ArrayList<>();
		System.out.print(number + " after convert to base " + base + " :");
		   while ( number != 0 )
		    {
		       int remainder = number % base ;
		       number = number / base ;
		       primeNumberList.add(remainder);
		    }
		   for (int i = primeNumberList.size() - 1; i >= 0; i--) {
	    	   System.out.print(primeNumberList.get(i));
		}
	}

}
