package Day6_1012.HospitalExercise;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReaderAndParser<Hospital> hospitalLRAP = new LineReaderAndParser<>(new HospitalParser());
        List<Hospital> hospitals = hospitalLRAP.readAllLinesAndParse("./OriginalData/서울시 병의원 위치 정보.csv");

        System.out.println(hospitals.size());

        MakeSqlFile makeSqlFile = new MakeSqlFile("./ExtractedData/extracted_queries.sql");
        makeSqlFile.createFile();
        // makeSqlFile.write(hospitals);
        makeSqlFile.write2(hospitals);      // Insert문 한번만 써줘서 속도 증가
    }
}
