package Day6_1012.HospitalExercise;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private char category;
    private int emergency_room;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String category, String emergency_room, String name) {
        this.id = id;
        this.address = address;
        this.district = address.split(" ")[0] + " " + address.split(" ")[1];
        this.category = category.charAt(0);
        this.emergency_room = Integer.parseInt(emergency_room);
        this.name = name;
        this.subdivision = this.makeSubdivision(name);
    }

    private String makeSubdivision(String name) {
        String[] subdivisionList = new String[]
                {"치과", "성형외과", "한방병원", "한의원", "영상의학과", "이비인후과", "소아청소년과", "내과", "정형외과", "외과",
                "가정의학과","피부과", "안과", "소아과", "요양병원", "비뇨기과", "정신건강의학과", "산부인과", "재활의학과", "정신과",
                "마취통증의학과"};
        for(String subdivision : subdivisionList) {
            if(name.contains(subdivision)) {
                return subdivision;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "id : " + this.id + "\naddress : " + this.address + "\ndistrict : " + this.district +
                "\ncategory : " + this.category + "\nemergency_room : " + this.emergency_room +
                "\nname : " + this.name + "\nsubdivision : " + this.subdivision + "\n";
    }

/*
INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)
VALUES ('A1120837','서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)','서울특별시 금천구','C',2,'가산기대찬의원',null);
이런 식의 쿼리를 String 으로 만들어야 함
*/
    public String toSQLQuery() {
        this.address = this.address.replace("'", "");
        String query = "INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                "VALUES ('" + this.id + "','" + this.address + "','" + this.district + "','" + this.category + "'," +
                this.emergency_room + ",'" + this.name + "',";
        if(this.subdivision != null) {
            query += "'" + this.subdivision + "');";
        } else {
            query += "null);";
        }
        return query;
    }
}
