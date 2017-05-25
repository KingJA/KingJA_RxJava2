package other.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：TODO
 * Create Time：2017/5/24 13:08
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class DataManager {
    public static List<Person> getPersons(int count) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Person person = new Person();
            ArrayList<Course> courses = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                courses.add(new Course("课程" + j));
            }
            persons.add(person);
        }

        return persons;
    }

    public static Person getPerson(int count) {
        Person person = new Person();
        ArrayList<Course> courses = new ArrayList<>();
        for (int j = 0; j < count; j++) {
            courses.add(new Course("课程" + j));
        }

        return person;
    }
}
