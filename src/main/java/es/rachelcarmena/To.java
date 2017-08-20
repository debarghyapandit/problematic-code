package es.rachelcarmena;

public class To {

    private final String param1;
    private final String param2;
    private final status param3;

    public enum status {BLACK, WHITE}

    public To(String param1, String param2, status param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }
}