package curso.practicas.model;

public class Alumno {
    private int id;
    private String nombreAlumno;
    private String apellido;
    private String curso;
    private int edad;


    public Alumno() {
    }

    public Alumno(int id, String nombreAlumno, String apellido, String curso, int edad) {
        this.id = id;
        this.nombreAlumno = nombreAlumno;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnombreAlumno() {
        return this.nombreAlumno;
    }

    public void setnombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
