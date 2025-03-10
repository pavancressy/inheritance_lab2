public class Course {
    protected String CourseNumber;
    protected String CourseTitle;
    String indent = "   ";

    public Course() {
        CourseNumber = "ECE287";
        CourseTitle = "Digital Systems Design";
    }
    public void PrintInfo() {
        System.out.println("Course Information:");
        System.out.println(indent + "Course Number: " + CourseNumber);
        System.out.println(indent + "Course Title: " + CourseTitle);
    }

}
