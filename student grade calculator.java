import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numOfSubjects=0 ;
        int totalMarks =0;

        while (true) {
            System.out.print("Subject " + (numOfSubjects + 1) + ": ");
            int marks = scanner.nextInt();

            // Check for valid input (marks should be between 0 and 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                continue;
            }

            totalMarks += marks;
            numOfSubjects++;

            // Ask if there are more subjects
            System.out.print("Do you have more subjects? (yes/no): ");
            String moreSubjects = scanner.next().toLowerCase();
            if (moreSubjects.equals("no")) {
                break;
            }
        }

        // Calculate Total Marks
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Grade Calculation
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}