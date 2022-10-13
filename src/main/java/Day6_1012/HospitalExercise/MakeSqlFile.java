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
            bw.write(hospital.toSQLQuery() + "\n");
        }
        bw.flush();
        bw.close();
    }
}