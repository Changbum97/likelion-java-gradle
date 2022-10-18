package MiniProject.HospitalExercise.fileIO;

import MiniProject.HospitalExercise.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReaderAndParser<T> {
    Parser<T> parser;

    public LineReaderAndParser(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readAllLinesAndParse(String fileName) throws IOException {
        List<T> result = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        br.readLine();

        String line;
        while((line = br.readLine()) != null) {
            result.add(parser.parse(line));
        }

        return result;
    }
}
