import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		double num1 = in.nextDouble();
		System.out.println(Math.abs(num1));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		double num2 = in.nextDouble();
		System.out.print("Input another number:");
		double num3 = in.nextDouble();
		double num23 = num2/num3;
		System.out.println(Math.floor(num23));
		System.out.println(Math.ceil(num23));

	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		double num4 = in.nextDouble();
		System.out.println(Math.round(Math.sqrt(num4)));

	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		double num5 = in.nextDouble();
		System.out.print("Input another number:");
		double num6 = in.nextDouble();
		System.out.println(Math.pow(num5,num6));

	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number:");
		double num7 = in.nextDouble();
		System.out.print("Input another number:");
		double num8 = in.nextDouble();
		System.out.print("Input one more number:");
		double num9 = in.nextDouble();
		System.out.println(Math.max((Math.max(num7,num8)),num9));
		System.out.println(Math.min((Math.min(num7,num8)),num9));

	}
	public static void q6() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence:");
		String sen1 = in.nextLine();
		System.out.println(sen1.contains("on"));
	}
	public static void q7() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango:");
		String word1 = in.nextLine();
		System.out.println(word1.equalsIgnoreCase("mango"));
	}
	public static void q8() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word:");
		String word2 = in.nextLine();
		System.out.print("Input a letter:");
		String lett = in.nextLine();
		System.out.println(word2.indexOf(lett));
		System.out.println(word2.lastIndexOf(lett));
		
	}

	public static void q9() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence:");
		String sen2 = in.nextLine();
		System.out.println("Your sentence is "+ (sen2.length()) + " characters long");
	}
	public static void q10() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence:");
		String sen3 = in.nextLine();
		System.out.print("Input a word to replace:");
		String word3 = in.nextLine();
		System.out.print("What word would you like to replace it with:");
		String word4 = in.nextLine();
		System.out.println(sen3.replaceAll(word3, word4));
	}

	public static void q11() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence:");
		String sen4 = in.nextLine();
		System.out.println(sen4.toUpperCase().trim());
		System.out.println(sen4.toLowerCase().trim());
		
	}

	public static void q12() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word:");
		String word5 = in.nextLine();
		System.out.println(word5.substring(0, 4));
		System.out.println(word5.substring((word5.length())-4));
	}
	

}
