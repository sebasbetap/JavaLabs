package curso.practicas.practicas2;

public class persona {
    
    private int id;

    private String nombre;

    private int añoNacimiento;

    private int telefono;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return this.añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    void minombre() {
        System.out.println("Nombre: " + nombre);
    }

    void miEdad(){
        System.out.println("Mi edad: " + (2022-añoNacimiento));
    }
}
