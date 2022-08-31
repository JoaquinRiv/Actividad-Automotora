

/**
 *
 * @author CETECOM
 */
public class Cliente {
    //crear atributos de la clase
    private String rut;
    private String nombre;
    private int edad;
    private char sexo;
    private String nacionalidad;
    private String codigo;
    
    //02 crear constructores

    public Cliente() {
    }

    public Cliente(String rut, String nombre, int edad, char sexo, String nacionalidad, String codigo) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.codigo = codigo;
    }
    
    //03 crear getter y setter

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
    
    
}
