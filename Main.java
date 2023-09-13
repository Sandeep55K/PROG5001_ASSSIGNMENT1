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
                check = checkValidity(number);        
            } while (check != true);
            marks[index] = number;
        }
    }
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
}
