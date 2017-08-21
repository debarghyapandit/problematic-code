package es.rachelcarmena;

import static es.rachelcarmena.To.status.BLACK;
import static es.rachelcarmena.To.status.WHITE;

public class Adapter {

    public static To adapt(From from) {
        String arg1 = String.valueOf(from.getParam1());
        String arg2 = String.valueOf(from.getParam2());
        To.status arg3 = ((from.getParam1() > from.getParam2())? BLACK: WHITE);

        return new To(arg1, arg2, arg3);
    }
}
