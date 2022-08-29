package curso.practicas.practicas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class condicionales implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        
        int a=10;

        if(a > 10){
            System.out.println("A es mayor a 10");
        }else if(a < 10){
            System.out.println("A es menor a 10");
        } else if(a == 10){
            System.out.println("A es igual a 10");
        } else {
            System.out.println("Entro al else");
        }

        String texto="hola";

        switch (texto) {
            case "adios":
                System.out.println("Es adios");
                break;
            case "nuevo":
                System.out.println("Es nuevo");
                break;
            case "hola":
                System.out.println("Es hola");
                break;
            default:
                System.out.println("No coincide con ninguna");
                break;
        }
        
    }
    
}
