package es.rachelcarmena;

public class Adapter {

    public static To adapt(From from) {
        String arg1 = String.valueOf(from.getParam1());
        String arg2 = String.valueOf(from.getParam2());

        return new To(arg1, arg2);
    }
}
