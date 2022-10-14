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

    public void write(List<Hospital> hospitals) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        for(Hospital hospital : hospitals) {
            bw.write(hospital.getSQLQuery() + "\n");
        }
        bw.flush();
        bw.close();
    }

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