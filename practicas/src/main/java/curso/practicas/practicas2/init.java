package curso.practicas.practicas2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class init implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        persona blanca = new persona();
        blanca.setNombre("Blanca");
        blanca.setId(1);
        blanca.setAñoNacimiento(1993);
        blanca.setTelefono(301602);
        blanca.miEdad();
        blanca.minombre();

        alumno alumno = new alumno();
        alumno.setId(2);
        alumno.setNombre("Juan");
        alumno.setAñoNacimiento(1994);
        alumno.setGrado("Primero");
        alumno.setGrupo("B");
        alumno.miEdad();
        alumno.minombre(); 
    }
    
}
