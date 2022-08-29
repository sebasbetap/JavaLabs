package curso.practicas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import curso.practicas.model.Alumno;

@Service
public class AlumnoService {
    
    private List<Alumno> listaAlumnos = new ArrayList<>();

    private void crearLista(){
        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setnombreAlumno("Juan");
        alumno1.setApellido("Ramírez");
        alumno1.setCurso("Java");
        alumno1.setEdad(26);
        listaAlumnos.add(alumno1);

        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setnombreAlumno("Sofía");
        alumno2.setApellido("Álvarez");
        alumno2.setCurso("Comunicación");
        alumno2.setEdad(29);
        listaAlumnos.add(alumno2);

    }

    public AlumnoService(){
        crearLista();
    }

    public List<Alumno> getAll(){
        return listaAlumnos;
    }

    public Alumno getById(int idAlumno) throws Exception {
        try {
            for (Alumno item : listaAlumnos) {
                if (item.getId() == idAlumno) {
                    return item;
                }
            }
            throw new Exception("No se encontró el libro");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Alumno save(Alumno alumno) throws Exception{
        try {
            listaAlumnos.add(alumno);
            return alumno;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Alumno update(Alumno alumno) throws Exception{
        try {
            for (Alumno item : listaAlumnos) {
                if (item.getId() == alumno.getId()) {
                    item.setnombreAlumno(alumno.getnombreAlumno());
                    item.setApellido(alumno.getApellido());
                    item.setCurso(alumno.getCurso());
                    item.setEdad(alumno.getEdad());
                    return alumno;
                }
            }
            return null;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<Alumno> delete(int idAlumno) throws Exception{
        try {
            for (Alumno item : listaAlumnos) {
                if (item.getId() == idAlumno) {
                    listaAlumnos.remove(item);
                    return listaAlumnos;
                }
            }
            return null;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}

