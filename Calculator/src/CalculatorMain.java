

	import java.util.Locale;
	import java.util.Scanner;
	/*Very very simple Java Calculator for beginners just for 4 operations on 
	 * two variables without exception and while loop*/

	public class CalculatorMain {
		Scanner scan = new Scanner(System.in); 
		
		
		

		public void showMenu() {
			

System.out.println("	░█▀▀░█▀▀░█░░░█▀▀░█▀▀░▀█▀░░█▀█░█▀▄░▀█▀░▀█▀░█░█░█▄█░█▀▀░▀█▀░█▀▀░█▀▀░░█▀█░█▀█░█▀▀░█▀▄░█▀█░▀█▀░▀█▀░█▀█░█▀█"); 
System.out.println("	░▀▀█░█▀▀░█░░░█▀▀░█░░░░█░░░█▀█░█▀▄░░█░░░█░░█▀█░█░█░█▀▀░░█░░█▀▀░█░░░░█░█░█▀▀░█▀▀░█▀▄░█▀█░░█░░░█░░█░█░█░█"); 
System.out.println("	░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░░▀░░░▀░▀░▀░▀░▀▀▀░░▀░░▀░▀░▀░▀░▀▀▀░░▀░░▀▀▀░▀▀▀░░▀▀▀░▀░░░▀▀▀░▀░▀░▀░▀░░▀░░▀▀▀░▀▀▀░▀░▀");

			
			
			
			
			
			System.out.print("\n\n\t 1.Addition ➕");
			System.out.print("\t\t2.Substraction ➖");
			System.out.print("\t\t3.Multiplication ✖");
			System.out.print("\t\t4.Division ➗");
			

		}

		public double division() {
			scan.useLocale(Locale.US); 
			double a, b;
			System.out.print("\n\nEnter first value   ");
			a = scan.nextDouble();
			System.out.print("Enter second value   ");
			b = scan.nextDouble();
			double val = a / b;

			return val;
		}

		public double mutliplication() {
			scan.useLocale(Locale.US);
			double a, b;
			System.out.println("\n\nEnter first value");
			a = scan.nextDouble();
			System.out.println("Enter second value");
			b = scan.nextDouble();
			double val = a * b;

			return val;
		}

		public double substraction() {
			scan.useLocale(Locale.US);
			double a, b;
			System.out.println("\n\nEnter first value");
			a = scan.nextDouble();
			System.out.println("Enter second value");
			b = scan.nextDouble();
			double val = a - b;

			return val;
		}

		public double addition() {
			scan.useLocale(Locale.US);
			double a, b;
			System.out.println("\n\nEnter first value");
			a = scan.nextDouble();
			System.out.println("Enter second value");
			b = scan.nextDouble();
			double val = a + b;

			return val;
		}

		public static void main(String[] args) {
			CalculatorMain calc = new CalculatorMain();
			Scanner scan = new Scanner(System.in);
			scan.useLocale(Locale.US);
			int x;
			double score;
			calc.showMenu();
			x = scan.nextInt();

			switch (x) {
			case 1:
				score = calc.addition();
				System.out.println(score);
				break;
			case 2:
				score = calc.substraction();
				System.out.println(score);
				break;
			case 3:
				score = calc.mutliplication();
				System.out.println(score);
				break;
			case 4:
				score = calc.division();
				System.out.println(score);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}

		}

	}

