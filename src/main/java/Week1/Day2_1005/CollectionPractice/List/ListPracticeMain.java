package Week1.Day2_1005.CollectionPractice.List;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<Student> students = likeLion2th.getStudentObjs();

        for(Student student : students) {
            System.out.println(student);
        }

        List<String> nameList = likeLion2th.getStudentList();
        System.out.println(nameList.size());
    }
}
