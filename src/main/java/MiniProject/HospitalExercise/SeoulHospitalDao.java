package MiniProject.HospitalExercise;

import MiniProject.HospitalExercise.domain.Hospital;
import MiniProject.HospitalExercise.fileIO.LineReaderAndParser;
import MiniProject.HospitalExercise.parser.HospitalParser;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
    }

    public void add(Hospital hospital) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) " +
                        "values (?, ?, ?, ?, ?, ?, ?);"
        );

        ps.setString(1, hospital.getId());
        ps.setString(2, hospital.getAddress());
        ps.setString(3, hospital.getDistrict());
        ps.setString(4, hospital.getCategory());
        ps.setInt(5, hospital.getEmergency_room());
        ps.setString(6, hospital.getName());
        ps.setString(7, hospital.getSubdivision());

        ps.executeUpdate();
        ps.close();
    }

    public static void main(String[] args) throws IOException, SQLException {
        LineReaderAndParser<Hospital> hospitalLRAP = new LineReaderAndParser<>(new HospitalParser());
        List<Hospital> hospitals = hospitalLRAP.readAllLinesAndParse("./OriginalData/서울시 병의원 위치 정보.csv");
        System.out.println(hospitals.size());

        SeoulHospitalDao seoulHospitalDao = new SeoulHospitalDao();

        for(Hospital hospital : hospitals) {
            seoulHospitalDao.add(hospital);
        }
        System.out.println("전체 병원 삽입 완료");

        seoulHospitalDao.conn.close();
    }
}
