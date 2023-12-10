import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many courses: ");
        int noOfCourses = input.nextInt(), index = 0;
        GradingForCourse[] data = new GradingForCourse[noOfCourses];

        while (index < noOfCourses)
        {
            try {
                GradingForCourse course = new GradingForCourse();

                input = new Scanner(System.in);
                System.out.printf("Entry: %d\n", index + 1);
                System.out.printf("Enter the course %d name & code: ", index + 1);
                course.setCourseCode(input.nextLine());

                input = new Scanner(System.in);
                System.out.print("Enter the course unit (positive integers only): ");
                int unit = input.nextInt();
                if (unit < 0) {
                    throw new Exception();
                }
                course.setCourseUnit(unit);

                input = new Scanner(System.in);
                System.out.print("Enter the course score: ");
                int score = input.nextInt();
                while (score < 0 || score > 100) {
                    System.out.print("Enter a score greater than 0 and less than 100: ");
                    score = input.nextInt();
                }
                course.setCourseScore(score);

                data[index] = course;
                index++;
            } catch (Exception ex) {
                System.out.println("** Wrong value, re-enter **");
            }
        }
        PrintDetails print = new PrintDetails();
        print.printTable(data);
    }
}
