package es.rachelcarmena;

public class To {

    private final String param1;
    private final String param2;

    public To(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof To)) return false;

        To toClass = (To) o;

        if (!param1.equals(toClass.param1)) return false;
        return param2.equals(toClass.param2);
    }

    @Override
    public int hashCode() {
        int result = param1.hashCode();
        result = 31 * result + param2.hashCode();
        return result;
    }
}
