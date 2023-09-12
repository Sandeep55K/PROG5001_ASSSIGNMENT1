/**
 * @author (Sandeep Kaur)
 * @ID (24066442)
 */
public class Main {
    public static String assignmentName;
    public static void main(String[] args) {
        double[] marks = new double[30];
        input(marks);
        System.out.println("The marks of student in Assignment named -- " + assignmentName + " are as follows :");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        sortmarks(marks);
        System.out.println("The Lowest marks is : " + marks[0]);
        System.out.println("The Highest marks is : " + marks[marks.length - 1]);
        System.out.println("The Standard Deviation is : " + calcSD(marks));
    }
}
