import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
	private static Scanner input;
	public static void main(String[] args) {
		checkOneNumber();
		showAllPrimeNumber();
	}
	
	public static void checkOneNumber(){
		String msg;
		input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		if (checkPrimeNumber(number)) {
			msg = number + " is a prime number!";
			System.out.println(msg);
		}
		else {
			msg = number + " is not a prime number!";
			System.out.println(msg);
		}	
	}
	
	public static void showAllPrimeNumber(){
		input = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = input.nextInt();
		getAllPrimeNumber(n);
	}
	
	public static void getAllPrimeNumber(int n){
		List<Integer> primeNumberList = new ArrayList<>();
		int count = 0;
			for (int i = 1; i > 0; i++) {
				if (checkPrimeNumber(i)) {	
					if (count < n) {
						primeNumberList.add(i);
						count++;
					}else {
						break;
					}
				}
		}
		showList(n,primeNumberList);
	}
	
	public static void showList(int i,List<Integer> numberList){
		System.out.println(i + " first prime numbers:");
		for (int j = 0; j < numberList.size(); j++) {
			System.out.print(" | " + numberList.get(j));
		}
	}
	
	public static boolean checkPrimeNumber(int number){
		int flag = 0;
		if (number == 2) {
			return true;
		}else {
			if (number == 1 || number % 2 == 0){
				return false;
			}
			else {
				int m = (int) Math.sqrt(number);
				for(int i = 3;i <= m; i = i + 2){
					if(number % i == 0){
						flag++;
					}
				}
				if (flag != 0) {
					return false;
				}else {
					return true;
				}
			}
		}
	}
}
