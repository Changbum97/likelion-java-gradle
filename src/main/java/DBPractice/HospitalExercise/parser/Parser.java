package DBPractice.HospitalExercise.parser;

public interface Parser<T> {
    T parse(String str);
}