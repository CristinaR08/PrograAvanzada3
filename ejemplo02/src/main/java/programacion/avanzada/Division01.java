package programacion.avanzada;

import java.util.function.Function;

public class Division01 {

    Function<Integer,Integer> f = x->{
        return 1/x;
    };
    int ret = f.apply(0);

}
