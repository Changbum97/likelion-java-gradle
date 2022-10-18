package DBPractice.HospitalExercise.parser;

import DBPractice.HospitalExercise.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");

        String id = splitted[0];
        String address = splitted[1];
        String district = address.split(" ")[0] + " " + address.split(" ")[1];
        String category = splitted[2];
        int emergency_room = Integer.parseInt(splitted[6]);
        String name = splitted[10];
        String subdivision = makeSubdivision(name);

        return new Hospital(id, address, district, category, emergency_room, name, subdivision);
    }

    private String makeSubdivision(String name) {
        String[] subdivisionList = new String[]
                {"치과", "성형외과", "한방병원", "한의원", "영상의학과", "이비인후과", "소아청소년과", "내과", "정형외과", "외과",
                        "가정의학과","피부과", "안과", "소아과", "요양병원", "비뇨기과", "정신건강의학과", "산부인과", "재활의학과", "정신과",
                        "마취통증의학과"};     // 이 외의 것들은 일단 null로 처리
        for(String subdivision : subdivisionList) {
            if(name.contains(subdivision)) {
                return subdivision;
            }
        }
        return null;
    }
}
