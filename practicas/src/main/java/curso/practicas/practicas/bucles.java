package curso.practicas.practicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bucles implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        // For
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando for "+ i);
        }

        // Do while

        int x =20;

        do{
            System.out.println("valor de x " + x );
            x++;
        } while(x<25);

        //While

        int z=10;
        while(z < 15){
            System.out.println("valor de z " + z);
            z++;
        }
        
    }
    
}
