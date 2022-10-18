package Week1.Day3_1006.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    private String fileName;
    private File dir;
    private BufferedReader br;

    public MyFileReader(String dir, String fileName) {
        this.fileName = fileName;
        this.dir = new File(dir);
    }

    // 경로에 있는 파일 목록 출력
    public void printFiles() {
        File files[] = dir.listFiles();

        System.out.println("<File List>");
        for(File file : files) {
            System.out.println(file);
        }
    }

    // 첫 줄의 N개 문자 출력
    public String readNBytes(int bytes) {
        try {
            br = new BufferedReader(new FileReader(dir + "/" + fileName));
            String str = "";
            for(int i = 0 ; i < bytes ; i ++) {
                str += (char)br.read();
            }
            return str;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // N개 라인 출력
    public String[] readNLines(int lines) {
        try {
            br = new BufferedReader(new FileReader(dir + "/" + fileName));
            String[] strArr = new String[lines];
            for(int i = 0 ; i < lines ; i ++) {
                strArr[i] = br.readLine();
            }
            return strArr;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
