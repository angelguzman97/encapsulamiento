public class encapsulacion{
    public static void main(String[] args){
    Persona persona = new Persona();
    persona.setNombre("Angel Guzmán");
    String nombre = persona.getNombre();
    
    persona.setEdad(25);
    int edad = persona.getEdad();

    persona.setTelefono("9221992132");
    String telefono= persona.getTelefono();

    System.out.println("Hola, soy "+nombre+", tengo "+edad+". Mi número de telefono es "+telefono);
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }

}
