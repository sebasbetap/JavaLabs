package curso.practicas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import curso.practicas.model.Libro;

@Service
public class LibroService {
    
    private List<Libro> listaLibros = new ArrayList<>();

    private void crearLista(){
        Libro java1 = new Libro();
        java1.setId(1);
        java1.setNombre("Caballo de Troya");
        java1.setAutor("J.J Benítez");
        java1.setEditorial("Planeta");
        java1.setAñoLanzamiento(1981);
        listaLibros.add(java1);

        Libro java2 = new Libro();
        java2.setId(2);
        java2.setNombre("El Libro de Urantia");
        java2.setAutor("Urantia Foundation");
        java2.setEditorial("Urantia Foundation");
        java2.setAñoLanzamiento(1935);
        listaLibros.add(java2);

    }

    public LibroService(){
        crearLista();
    }

    public List<Libro> getAll(){
        return listaLibros;
    }

    public Libro getById(int idLibro) throws Exception {
        try {
            for (Libro item : listaLibros) {
                if (item.getId() == idLibro) {
                    return item;
                }
            }
            throw new Exception("No se encontró el libro");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Libro save(Libro libro) throws Exception{
        try {
            listaLibros.add(libro);
            return libro;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public Libro update(Libro libro) throws Exception{
        try {
            for (Libro item : listaLibros) {
                if (item.getId() == libro.getId()) {
                    item.setNombre(libro.getNombre());
                    item.setAutor(libro.getAutor());
                    item.setEditorial(libro.getEditorial());
                    item.setAñoLanzamiento(libro.getAñoLanzamiento());
                    return libro;
                }
            }
            return null;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public List<Libro> delete(int idlibro) throws Exception{
        try {
            for (Libro item : listaLibros) {
                if (item.getId() == idlibro) {
                    listaLibros.remove(item);
                    return listaLibros;
                }
            }
            return null;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
