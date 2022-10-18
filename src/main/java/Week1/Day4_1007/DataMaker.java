package Week1.Day4_1007;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataMaker {

    public void run() throws IOException {
        createFile("./ExtractedData/from_to.txt");
        write("./OriginalData/2021_인구관련연간자료.csv", "./ExtractedData/from_to.txt");
    }

    public void createFile(String fileName) {
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

    public void write(String inputFileName, String outputFileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName), 16*1024);
        List<PopulationMove> pmList = new ArrayList<>();

        while(true) {
            String str = br.readLine();
            if (str == null) break;

            pmList.add(parse(str));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
        for(PopulationMove pm : pmList) {
            String str = pm.getFromSidoCode() + "," + pm.getToSidoCode() + "\n";
            bw.write(str);
            bw.flush();
        }
        bw.close();
    }

    private PopulationMove parse(String data) {
        String[] strings = data.split(",");
        int fromSidoCode = Integer.parseInt(strings[6]);
        int toSidoCode = Integer.parseInt(strings[0]);
        return new PopulationMove(fromSidoCode, toSidoCode);
    }
}
