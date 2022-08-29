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
        java1.setId(id:1);
        java1.setNombre(nombre: "Java el novelón");
        java1.setAutor(autor: "La Nutria Malvada");
        java1.setEditorial(editorial: "Planeta");
        java1.setAñoLanzamiento(añoLanzamiento: 2022);
        listaLibros.add(java1);

        Libro java2 = new Libro();
        java2.setId(id: 2);
        java2.setNombre(nombre: "Java para JavaScripteros");
        java2.setAutor(autor: "J.S. Betancur");
        java2.setEditorial(editorial: "Planeta");
        java2.setAñoLanzamiento(añoLanzamiento: 2021);
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
                if (item.getId()) == libro.getId() {
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

    public List<Libro> delete(int id) throws Exception{
        try {
            for (Libro item : listaLibros) {
                if (item.getId()) == libro.getId() {
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
