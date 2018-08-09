/*
 * Naresh Kc
 */
import java.util.Random;
import java.util.Scanner;

public class arrayPractice {
	public static void main(String[] args) {

		String[] thisIsString = {"bob","rob","hob","lob","mob","clown","dog"};
		int [] thisIsInt = {1,4,8,3,9,23,45,67,7};
		boolean [] thisIsBool = {true,false,false,true,false,false,false,true};
		double [] thisIsDouble = new double[7];
		Random random = new Random();
		for(int i=0;i<thisIsDouble.length;i++){
			int x = random.nextInt(23);
			thisIsDouble[i] = x;
		}	
		
		System.out.println("printing all the strings.................");
		for(String s: thisIsString)
			System.out.print(s + " ");
		System.out.println("\n");

	    System.out.println("printing even indices of an Integer.........");
		for(int i =0; i<thisIsInt.length;i+=2)
			System.out.print(thisIsInt[i] + " ");
		System.out.println("\n");
		
		
		char[] thisIsChar  = new char[6];
		String a = "thisIsString";
		for(int i=0;i<thisIsChar.length;i++)
			thisIsChar[i] = a.charAt(i);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which index of char do you want to print ?");
		int input = scanner.nextInt();
		try{
	    System.out.print(thisIsChar[input] + " ");
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("you enter the number that is out of bound !!!");
		}

	    }
	}
	
	    
//		System.out.println("\n");
//		System.out.println("printing even indices of an Booleans.........");
//		for(int i =0; i<thisIsBool.length;i+=2)
//			System.out.print(thisIsBool[i] + " ");
//		System.out.println("\n");
//		System.out.println("printing even indices of an Double.........");
//		for(int i =0; i<thisIsDouble.length;i+=2)
//			System.out.print(thisIsDouble[i] + " ");
//	

	
	

