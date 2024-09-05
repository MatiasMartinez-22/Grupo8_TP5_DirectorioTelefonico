/*
Un directorio telefónico posee una lista de Contactos de los que interesa conocer su DNI, nombre, apellido, ciudad 
y dirección. Un contacto se empareja con un teléfono tipo Long.
 */
package entiies;

/**
 *
 * @author matia
 */
public class Contacto {
    
    private Integer dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto(Integer dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
    
    
}
