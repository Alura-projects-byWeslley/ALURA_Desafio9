package principal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import models.Titulo;

public class Principal {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new LinkedList<>();
        List<Titulo> titus = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        Collections.sort(listaInteiros);
        System.out.println(listaInteiros);

        Titulo titu1 = new Titulo();
        Titulo titu2 = new Titulo();
        Titulo titu3 = new Titulo();
        titu1.setNome("FODA");
        titu2.setNome("FODA TBM");
        titu3.setNome("FODA PRA CARALHO");
        titus.add(titu1);
        titus.add(titu2);
        titus.add(titu3);
        Collections.sort(titus);
        titus.forEach(t -> System.out.println(t.getNome()));
    }
}
