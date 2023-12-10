public class CalculatorCGPAFunction {
    public double averageFunction(GradingForCourse[] data) {
        double totalGradePoint = 0;
        double totalGradeUnit = 0;

        for (GradingForCourse course: data) {
            totalGradePoint += course.getGradeUnit() * course.getCourseUnit();
            totalGradeUnit += course.getCourseUnit();
        }
        return totalGradePoint / totalGradeUnit;
    }
}
