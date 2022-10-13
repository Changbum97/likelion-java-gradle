package Day3_1006.FileIO;

public class FileInputPractice {

    public static void main(String[] args) {
        String nowDir = "./src/Day3_1006/FileIO/";
        String rootDir = "./";
        String fileName = "input.txt";
        MyFileReader myFileReader = new MyFileReader(nowDir, fileName);
        myFileReader.printFiles();

        // 첫 줄 n글자 출력
        int bytes = 3;
        System.out.println("\n" + bytes + " 글자 읽기 : " + myFileReader.readNBytes(bytes) + "\n");

        // n줄 출력
        int lines = 3;
        String[] result = myFileReader.readNLines(lines);
        for(int i = 0 ; i < result.length ; i ++) {
            System.out.println( (i + 1) + " Line : " + result[i]);
        }
    }
}
