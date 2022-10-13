package Day2_1005.CollectionPractice.List;

import java.util.List;

public class LikeLion2th {
    private List<String> nameList;
    private List<Student> studentObjs;

    public LikeLion2th() {
        Names names = new Names();
        nameList = names.getNames();
        studentObjs = names.getStudentObjs();
    }

    public List<String> getStudentList() {
        return this.nameList;
    }

    public List<Student> getStudentObjs() {
        return this.studentObjs;
    }

}
