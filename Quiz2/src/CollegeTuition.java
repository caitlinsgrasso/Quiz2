import java.util.Scanner;

public class CollegeTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double initialCost;
		double percentIncrease;
		double totalCost = 0;
		int yearsAtCollege = 0;

		System.out.println("What is the initial tuition cost?");
		initialCost = input.nextDouble();

		for (; yearsAtCollege < 5; yearsAtCollege++) {
			if (yearsAtCollege == 1) {
				totalCost = initialCost;
			}
			if (yearsAtCollege == 2) {
				System.out.println("What is the percent increase (as a decimal) after your first year of college?");
				percentIncrease = input.nextDouble();
				totalCost = totalCost + (percentIncrease * totalCost);
			}
			if (yearsAtCollege == 3) {
				System.out.println("What is the percent increase (as a decimal) after your second year of college?");
				percentIncrease = input.nextDouble();
				totalCost = totalCost + (percentIncrease * totalCost);
			}
			if (yearsAtCollege == 4) {
				System.out.println("What is the percent increase (as a decimal) after your third year of college?");
				percentIncrease = input.nextDouble();
				totalCost = totalCost + (percentIncrease * totalCost);
			}
		}
		input.close();
		System.out.print("Your total cost of four years at college is $");
		System.out.printf("%.2f", totalCost);
		System.out.print(".");

	}

}
