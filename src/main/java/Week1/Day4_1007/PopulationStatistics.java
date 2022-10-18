package Week1.Day4_1007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    private String fullPath;
    private SidoCodeMaker sidoCodeMaker;

    public PopulationStatistics(String fullPath) throws IOException {
        this.fullPath = fullPath;
        this.sidoCodeMaker = new SidoCodeMaker();
    }

    public PopulationMove parse(String data) {
        try {
            String[] strings = data.split(",");
            Map<Integer, String> sidoCodeMap = sidoCodeMaker.getSidoCodeMap();
            String fromSido = sidoCodeMap.get(Integer.parseInt(strings[0]));
            String toSido = sidoCodeMap.get(Integer.parseInt(strings[1]));
            return new PopulationMove(fromSido, toSido);
        } catch (Exception e) {
            return null;
        }
    }

    public List<PopulationMove> readAllLines() throws IOException {
        return readByLine(Integer.MAX_VALUE);
    }

    public List<PopulationMove> readByLine(int lines) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fullPath), 16*1024);
        List<PopulationMove> pmList = new ArrayList<>();

        int line = 0;
        while(line < lines) {
            String str = br.readLine();
            if (str == null) break;
            pmList.add(parse(str));
            line ++;
        }
         return pmList;
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pmList) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pmList) {
            String key = pm.getFromSido() + " -> " + pm.getToSido();
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            } else {
                moveCntMap.put(key, moveCntMap.get(key) + 1);
            }
        }
        return moveCntMap;
    }

    public void readByByte(int bytes) throws IOException {
        FileReader fileReader = new FileReader(fullPath);
        String fileContents = "";
        while(fileContents.length() < 100) {
            fileContents += (char) fileReader.read();
        }
        System.out.println(fileContents);
    }
}
