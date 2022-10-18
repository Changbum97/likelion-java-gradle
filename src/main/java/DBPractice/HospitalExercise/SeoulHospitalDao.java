package DBExercise.HospitalExercise;

import DBExercise.HospitalExercise.domain.Hospital;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeoulHospitalDao {

    private Map<String, String> env;
    private String dbHost, dbUser, dbPassword;
    private Connection conn;
    private PreparedStatement ps;

    public SeoulHospitalDao() throws SQLException {
        env = System.getenv();
        dbHost = env.get("DB_HOST");
        dbUser = env.get("DB_USER");
        dbPassword = env.get("DB_PASSWORD");
        // DB 연결
        conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }

    public void add(Hospital hospital) throws SQLException {
        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) " +
                        "values (?, ?, ?, ?, ?, ?, ?);"
        );

        // 쿼리 파라미터 설정
        ps.setString(1, hospital.getId());
        ps.setString(2, hospital.getAddress());
        ps.setString(3, hospital.getDistrict());
        ps.setString(4, hospital.getCategory());
        ps.setInt(5, hospital.getEmergency_room());
        ps.setString(6, hospital.getName());
        ps.setString(7, hospital.getSubdivision());

        // 쿼리 실행
        ps.executeUpdate();

        ps.close();
    }

    public List<Hospital> search() throws SQLException {
        // 쿼리 입력
        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM seoul_hospital WHERE district = ?;"
        );

        // 쿼리 파라미터 설정
        ps.setString(1, "서울특별시 강남구");

        // 쿼리 실행
        ResultSet resultSet = ps.executeQuery();
        System.out.println("DB Search 완료");

        List<Hospital> hospitals = new ArrayList<>();
        // 여러개 search도 가능
        while(resultSet.next()) {
            hospitals.add(new Hospital(
                    resultSet.getString("id"),
                    resultSet.getString("address"),
                    resultSet.getString("district"),
                    resultSet.getString("category"),
                    resultSet.getInt("emergency_room"),
                    resultSet.getString("name"),
                    resultSet.getString("subdivision")));
        }

        resultSet.close();
        ps.close();

        return hospitals;
    }

    public static void main(String[] args) throws IOException, SQLException {

        SeoulHospitalDao seoulHospitalDao = new SeoulHospitalDao();

        /* 파일 읽어오기 + DB에 삽입
        LineReaderAndParser<Hospital> hospitalLRAP = new LineReaderAndParser<>(new HospitalParser());
        List<Hospital> hospitals = hospitalLRAP.readAllLinesAndParse("./OriginalData/서울시 병의원 위치 정보.csv");
        System.out.println(hospitals.size());

        for(Hospital hospital : hospitals) {
            seoulHospitalDao.add(hospital);
        }
        System.out.println("전체 병원 삽입 완료");
        */

        // DB에서 검색 ( district가 "서울특별시 강남구"인 병원 )
        List<Hospital> searchHospitals = seoulHospitalDao.search();
        for(Hospital hospital : searchHospitals) {
            System.out.println(hospital.getName());
        }
        System.out.println("검색결과 : " + searchHospitals.size() + "개");

        seoulHospitalDao.conn.close();
    }
}
