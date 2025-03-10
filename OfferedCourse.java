public class OfferedCourse extends Course {
    private String instructorName;
    private String location;
    private String classTime;

    public OfferedCourse() {
        instructorName = "Mark Patterson";
        location = "Wilson Hall 231";
        classTime = "WF: 2-3:30 PM";
    }

    public void PrintOCInfo() {
        System.out.println("Course Information:");
        System.out.println(indent + "Course Number: " + CourseNumber);
        System.out.println(indent + "Course Title: " + CourseTitle);
        System.out.println(indent + "Instructor Name: " + instructorName);
        System.out.println(indent + "Location: " + location);
        System.out.println(indent + "Class Time: " + classTime);
    }
}
