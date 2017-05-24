package data;

/**
 * Description：TODO
 * Create Time：2017/5/24 13:09
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class Course {
    public Course(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
