package Day6_1012.HospitalExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospitalParserTest {
    @Test
    @DisplayName("Parsing Test")
    void parseId() {
        String line1 = "A1120837,서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동),C,의원,G099,응급의료기관 이외,2,외과: 상시진료 내과는 당분간 휴진,서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료,방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물,가산기대찬의원,02-6267-258,02-920-5374";
        String line2 = "A1117873,서울특별시 관악구 신원로 38 5층 (신림동 청암빌딩),N,치과의원,G099,응급의료기관 이외,2,대표번호1 지역번호 추가20170118150453,서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료,서월치안센터 인근 청암빌딩 5층,가로수치과의원,02-882-2750,02-920-5374";

        HospitalParser hp = new HospitalParser();
        assertHospital(hp.parse(line1), "A1120837", "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "서울특별시 금천구", 'C', 2, "가산기대찬의원", null,
                "INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                        "VALUES ('A1120837','서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)','서울특별시 금천구','C',2,'가산기대찬의원',null);");
        assertHospital(hp.parse(line2), "A1117873", "서울특별시 관악구 신원로 38 5층 (신림동 청암빌딩)",
                "서울특별시 관악구", 'N', 2, "가로수치과의원", "치과",
                "INSERT INTO `likelion-db`.`seoul_hospital` (`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`) " +
                        "VALUES ('A1117873','서울특별시 관악구 신원로 38 5층 (신림동 청암빌딩)','서울특별시 관악구','N',2,'가로수치과의원','치과');");
    }

    private void assertHospital(Hospital hospital, String eId, String eAddress, String eDistrict, char eCategory,
                                int eEmergency_room, String eName, String eSubdivision, String eSqlQuery) {
        Assertions.assertEquals(eId, hospital.getId());
        Assertions.assertEquals(eAddress, hospital.getAddress());
        Assertions.assertEquals(eDistrict, hospital.getDistrict());
        Assertions.assertEquals(eCategory, hospital.getCategory());
        Assertions.assertEquals(eEmergency_room, hospital.getEmergency_room());
        Assertions.assertEquals(eName, hospital.getName());
        Assertions.assertEquals(eSubdivision, hospital.getSubdivision());
        Assertions.assertEquals(eSqlQuery, hospital.getSQLQuery());
    }
}