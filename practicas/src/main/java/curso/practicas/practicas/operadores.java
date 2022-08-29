package curso.practicas.practicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class operadores implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        int a = 20, b= 10, c=0, d=20, e=40, f=30;

        String hola="Hola ", chicos = "chicos";

        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));

        System.out.println("hola + chicos "+hola+chicos);

        //Operadores unarios
        int t = ++a;
        System.out.println(("++ a" + t));
    }
    
}
