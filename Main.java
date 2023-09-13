/**
 * @author (Sandeep Kaur)
 * @ID (24066442)
 */

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static String assignmentName;

    // the main method
    public static void main(String[] args) {
        double[] marks = new double[30];
        // This the logic to input marks of assignment of the students.
        input(marks);
        System.out.println("The marks of student in Assignment named -- " + assignmentName + " are as follows :");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // This method is to sort the marks so the highest and lowest calcuations
        sortmarks(marks);
        
        System.out.println("---");
        
        System.out.println("The Lowest marks is : " + marks[0]);
        System.out.println("The Highest marks is : " + marks[marks.length - 1]);
        
        System.out.println("---");
        
        System.out.println("The Standard Deviation is : " + calculate_std_deviation(marks));
    }
    
    // The input method which takes marks
    public static void input(double[] marks) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of the Assignment");
        assignmentName = sc.next();
        System.out.println("Now Please Enter the Marks of the Students");
        for (int index = 0; index < marks.length; index++) {
            System.out.println("Enter marks of Student no. :" + (index + 1));
            double number = 0.0;
            boolean check = false;
            do {
                number = sc.nextDouble();
                // The validation system of marks.
                if (number < 0 || number > 30) {
                    System.out.println("Entry is Invalid: Please Input a valid Number (Marks can be between 0 - 30.0)");
                    check = false;
                } else {
                    check = true;
                }     
            } while (check != true);
            marks[index] = number;
        }
    }

    // The sort method.
    public static void sortmarks(double[] marks) {
        System.out.println("sorting the input marks:");
        double temp = 0.0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
    }

    // This method is to calculate mean of the marks 
    public static double calculate_mean(double[] marks) {
        System.out.println("Calculating Mean:");
        double sum = 0.0;
        for (int index = 0; index < marks.length; index++) {
            sum = sum + marks[index];
        }
        System.out.println("The mean is : " + sum / marks.length);
        return sum / marks.length;
    }

    // This method is to calculate Standard Deviation of the Input Data
    public static double calculate_std_deviation(double[] marks) {
        System.out.println("Calculating Standard Deviation");
        double mean = calculate_mean(marks);
        double temp = 0.0;
        // Refering to java.lang.Math.pow(a,b)
        for (double mark: marks) {
            temp = temp + Math.pow(mark - mean, 2);
        }
        // Refering to java.lang.Math.sqrt()
        return Math.sqrt(temp / marks.length);
    }
}
