package Day6_1012.HospitalExercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MakeSqlFile {
    private String fileName;

    public MakeSqlFile(String fileName) {
        this.fileName = fileName;
    }

    public void createFile() {
        File file = new File(fileName);
        try {
            if(file.exists()) {
                file.delete();
            }
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Hospital 객체마다 Insert문 따로 작성
    public void write(List<Hospital> hospitals) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        for(Hospital hospital : hospitals) {
            bw.write(hospital.getSQLQuery() + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 맨 처음에 Insert문을 맨 처음 한 번만 써주고
    // ('A1120837','서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)','서울특별시 금천구','C',2,'가산기대찬의원',null),
    // ('A1104130','서울특별시 강남구 도산대로 118 (논현동 신사빌딩 2층)','서울특별시 강남구','C',2,'365엠씨의원',null),
    // 이런 식으로 Tuple String 만 뽑아서 write => Insert문 한 번만으로 모든 데이터가 삽입되기 때문에 속도가 매우 빠름
    public void write2(List<Hospital> hospitals) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        bw.write("INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) VALUES \n");
        int idx = 0;
        for(Hospital hospital : hospitals) {
            idx ++;
            // 마지막 라인은 ;로 끝내야 되고 중간 라인은 ,로 끝내야 되서 구분
            if(idx == hospitals.size()) {
                bw.write(hospital.getTupleString(true));
            } else {
                bw.write(hospital.getTupleString(false));
            }
        }
        bw.flush();
        bw.close();
    }
}