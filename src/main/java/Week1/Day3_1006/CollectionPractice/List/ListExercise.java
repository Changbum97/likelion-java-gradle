package Week1.Day3_1006.CollectionPractice.List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("김미지");
        this.students.add("김민경");
        this.students.add("김민지");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
