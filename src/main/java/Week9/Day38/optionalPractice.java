package Week9.Day38;

import java.util.List;
import java.util.Optional;

// lambdaPractice의 class, method 호출
import static Week9.Day38.lambdaPractice.*;

public class optionalPractice {
    public static void main(String[] args) {

        // DB에서 불러왔다고 가정
        List<Teacher> teachers = getTeachers();

        // empty 값 삽입
        Optional<Teacher> emptyTeacher = Optional.empty();
        // emptyTeacher.get();  에러 발생
        // emptyTeacher.orElseThrow(RuntimeException::new); RuntimeException 발생

        Optional<Teacher> optionalTeacher = Optional.of(new Teacher("김경록", true, true));
        Teacher kyeongrok = optionalTeacher.get();
        Teacher kyeongrok2 = optionalTeacher.orElseThrow(() -> new RuntimeException());
        Teacher kyeongrok3 = optionalTeacher.orElseThrow(RuntimeException::new);

        System.out.println(kyeongrok.name);
        System.out.println(kyeongrok2.name);
        System.out.println(kyeongrok3.name);

        optionalTeacher.ifPresent(teacher -> {
            System.out.println(teacher.name);
        });

        Optional<Teacher> noNameTeacher = Optional.of(new Teacher(null, true, true));
        String emptyName = Optional.ofNullable(noNameTeacher.get().name).orElse("이름이 없습니다.");
        System.out.println(emptyName);
    }
}
