package Week9.Day38;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaPractice {

    public static void main(String[] args) {

        // DB에서 불러왔다고 가정
        List<Teacher> teachers = getTeachers();

        // lambda, stream, filter 사용 X
        System.out.println("Algorithm을 선호하는 Teacher");
        List<Teacher> likeAlgorithmTeachers2 = new ArrayList<>();
        for(Teacher teacher : teachers) {
            if(teacher.isLikeAlgorithm) {
                likeAlgorithmTeachers2.add(teacher);
            }
        }
        for (Teacher teacher : likeAlgorithmTeachers2) {
            System.out.print(teacher.name + " ");
        }
        System.out.println();

        // lambda, stream, filter을 사용하여 조건에 맞는 Teacher 추출 후 name만 출력
        System.out.println("Algorithm을 선호하는 Teacher");
        List<Teacher> likeAlgorithmTeachers = teachers.stream()
                .filter(teacher -> teacher.isLikeAlgorithm == true)
                .collect(Collectors.toList());
        for (Teacher teacher : likeAlgorithmTeachers) {
            System.out.print(teacher.name + " ");
        }
        System.out.println();

        // lambda, stream, filter, map을 사용하여 조건에 맞는 Teacher의 name을 추출 후 출력
        System.out.println("SpringBoot를 선호하는 Teacher");
        List<String> likeSpringBootTeachersName = teachers.stream()
                .filter(teacher -> teacher.isLikeSpringBoot == true)
                .map(teacher -> teacher.name)
                .collect(Collectors.toList());
        System.out.println(likeSpringBootTeachersName);

        // lambda, stream, filter, map, ::를 사용하여 조건에 맞는 Teacher의 이름 글자 수 출력
        System.out.println("SpringBoot를 선호하는 Teacher의 이름의 글자수");
        List<Integer> likeSpringBootTeachersNameDigit = teachers.stream()
                .filter(teacher -> teacher.isLikeSpringBoot)
                .map(Teacher::cntNameDigit)
                .collect(Collectors.toList());
        System.out.println(likeSpringBootTeachersNameDigit);
    }

    static List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sujin = new Teacher("김수진", false, true);
        Teacher sohyun = new Teacher("박소현", true, false);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sujin);
        teachers.add(sohyun);

        return teachers;
    }

    static class Teacher {
        String name;
        boolean isLikeAlgorithm;
        boolean isLikeSpringBoot;

        public int cntNameDigit() {
            return this.name.length();
        }
    }
}
