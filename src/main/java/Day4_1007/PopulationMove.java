package Day4_1007;

public class PopulationMove {
    private int fromSidoCode;
    private int toSidoCode;

    private String fromSido;
    private String toSido;

    public PopulationMove(int fromSidoCode, int toSidoCode) {
        this.fromSidoCode = fromSidoCode;
        this.toSidoCode = toSidoCode;
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSidoCode() {
        return fromSidoCode;
    }

    public int getToSidoCode() {
        return toSidoCode;
    }

    public String getFromSido() {
        return fromSido;
    }

    public String getToSido() {
        return toSido;
    }
}
