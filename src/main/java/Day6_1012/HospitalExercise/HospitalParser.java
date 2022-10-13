package Day6_1012.HospitalExercise;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0], splitted[1], splitted[2], splitted[6], splitted[10]);
    }
}
