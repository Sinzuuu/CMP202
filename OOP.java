public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String login() {
        if (username.equals("") || password.equals("")) {
            return "Username or password cannot be empty";
        } else {
            return "Logged in successfully";
        }
    }

    String logout() {
        return "Logged out successfully";
    }
}

public class Admin extends User {
    String staffNo;

    public Admin(String username, String password, String staffNo) {
        super(username, password);
        this.staffNo = staffNo;
    }

    String uploadResult(String course, float score) {
        // Perform result uploading
        return "Result uploaded for course: " + course + ", with score: " + score;
    }
}

public class Student extends User {
    String matricNo;
    String admissionNo;

    public Student(String username, String password, String matricNo, String admissionNo) {
        super(username, password);
        this.matricNo = matricNo;
        this.admissionNo = admissionNo;
    }

    String registerCourses(String courseClass, String courseCode) {
        // Register the course
        return "Course registered successfully: " + courseCode + " in class: " + courseClass;
    }

    String checkResult(String courseClass, double GPA) {
        // Check the result
        return "Result for class: " + courseClass + " is ready with GPA: " + GPA;
    }
}
