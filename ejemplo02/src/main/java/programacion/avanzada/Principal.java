package programacion.avanzada;

import com.programacion.avanzada.Operaciones;

import java.util.Optional;
import java.util.function.Function;

public class Principal {
    public static void main(String[] args){

        Operaciones.sumar(4,5);

        Function<Integer, Optional<Integer>> fn = x->{
          if(x==0){
              return Optional.empty();
          }
          else {
              return Optional.of(1/x);
          }
        };

        var ret = fn.apply(0);
        if (ret.isPresent()){
            System.out.printf("La division es: %.2f", ret.get());
        }
        else {
            System.out.println("La division no existe");
        }
    }
}
