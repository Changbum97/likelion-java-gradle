package Week1.Day4_1007;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class PopulationStatisticsMain {
    public static void main(String[] args) throws IOException {


        // csv -> txt
        // 맨 처음 1번만 실행
        /*
        try {
            DataMaker dataMaker = new DataMaker();
            dataMaker.run();
        } catch(Exception e) {
            e.printStackTrace();
        }
        */


        PopulationStatistics populationStatistics = new PopulationStatistics( "./ExtractedData/from_to.txt");

        try {
            List<PopulationMove> pmList = populationStatistics.readAllLines();
            Map<String, Integer> moveCntMap = populationStatistics.getMoveCntMap(pmList);

            String makeFileName = "./ExtractedData/each_sido_cnt.txt";
            new DataMaker().createFile(makeFileName);

            BufferedWriter bw = new BufferedWriter(new FileWriter(makeFileName));
            bw.write("총 전입 횟수 : " + pmList.size() + "번\n");
            bw.write("경우의 수 : " + moveCntMap.size() + "개\n");
            for(String key : moveCntMap.keySet()) {
                String str = key + " : " + moveCntMap.get(key) + "번\n";
                bw.write(str);
            }
            bw.flush();
            bw.close();

            /* Heat Map Data 생성
            new DataMaker().createFile("./ExtractedData/heat_map_data.txt");
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("./ExtractedData/heat_map_data.txt"));
            for(String key : moveCntMap.keySet()) {
                String str = "[" + key + ", " + moveCntMap.get(key) + "], ";
                str = str.replace(" -> ", ", ").replace("서울특별시", "0").replace("부산광역시", "1").replace("대구광역시", "2").replace("인천광역시", "3").replace("광주광역시", "4").replace("대전광역시", "5").replace("울산광역시", "6").replace("세종특별자치시", "7").replace("경기도", "8").replace("강원도", "9").replace("충청북도", "10").replace("충청남도", "11").replace("전라북도", "12").replace("전라남도", "13").replace("경상북도", "14").replace("경상남도", "15").replace("제주특별자치도", "16");
                bw2.write(str);
            }
            bw2.flush();
            bw2.close();
            */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
