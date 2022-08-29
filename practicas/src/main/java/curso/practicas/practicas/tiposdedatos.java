package curso.practicas.practicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class tiposdedatos implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        int a = 1;
        double d = 1.2;
        String s= "ejemplo String";
        Boolean b = true;
        String texto = "Tipo string";

        System.out.println("Tipo entero " + a);
        System.out.println("Tipo double " + d);
        System.out.println(texto.concat(s));
        System.out.println("Tipo boolean " + d);       
    }
    
}
