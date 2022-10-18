package Week1.Day4_1007;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class SidoCodeMaker {

    private Map<Integer, String> sidoCodeMap = new HashMap<>();
    public SidoCodeMaker() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("./OriginalData/adm_code_edit2.csv"), StandardCharsets.UTF_8));

        while(true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }
            int code = Integer.parseInt(str.split(",")[0]);
            String sidoName = str.split(",")[1];
            sidoCodeMap.put(code, sidoName);
        }
    }

    public Map<Integer, String> getSidoCodeMap() {
        return sidoCodeMap;
    }

    public void printCityCode() {
        System.out.println(sidoCodeMap);
    }
}
