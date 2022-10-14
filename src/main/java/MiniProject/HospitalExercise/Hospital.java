package MiniProject.HospitalExercise;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private char category;
    private int emergency_room;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String district, char category,
                    int emergency_room, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergency_room = emergency_room;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public String getDistrict() {
        return district;
    }
    public char getCategory() {
        return category;
    }
    public int getEmergency_room() {
        return emergency_room;
    }
    public String getName() {
        return name;
    }
    public String getSubdivision() {
        return subdivision;
    }

/*
INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)
VALUES ('A1120837','서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)','서울특별시 금천구','C',2,'가산기대찬의원',null);
이런 식의 쿼리를 String 으로 만들어야 함
*/
    public String getSQLQuery() {
        // 주소에 '가 들어가는 경우가 있어서 ' 제거
        this.address = this.address.replace("'", "");

        // String.format 사용 예시
        String queryFormat = String.format("INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                "VALUES ('%s','%s','%s','%c',%d,'%s',", id, address, district, category, emergency_room, name);

        // String 사용 예시
        String query = "INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                "VALUES ('" + this.id + "','" + this.address + "','" + this.district + "','" + this.category + "'," +
                this.emergency_room + ",'" + this.name + "',";
        if(this.subdivision != null) {
            query += "'" + this.subdivision + "');";
            queryFormat += "'" + this.subdivision + "');";
        } else {
            query += "null);";
            queryFormat += "null);";
        }
        return queryFormat;
    }

    public String getTupleString(boolean lastTuple) {
        // 주소에 '가 들어가는 경우가 있어서 ' 제거
        this.address = this.address.replace("'", "");

        String tuple = "('" + this.id + "','" + this.address + "','" + this.district + "','" + this.category + "'," +
                this.emergency_room + ",'" + this.name + "',";
        if(this.subdivision != null) {
            tuple += "'" + this.subdivision + "')";
        } else {
            tuple += "null)";
        }

        if (lastTuple == false) {
            tuple += ",\n";
        } else {
            tuple += ";";
        }
        return tuple;
    }
}
