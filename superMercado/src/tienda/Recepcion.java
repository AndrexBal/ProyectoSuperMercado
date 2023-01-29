
package tienda;
import java.util.ArrayList;
import java.util.List;


public class Recepcion {
    
    private List<Persona> personas;
    
    public Recepcion(){
        this.personas = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente){
        this.personas.add(cliente);
    }
    
    public void agregarEmpleado(Empleado empleado){
        this.personas.add(empleado);
    }
    
    public void imprimirInformacionPersonas() {
        for(Persona persona: personas) {
            System.out.println("Nombre: "+ persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Direccion: " + persona.getDireccion());
            System.out.println("");
        }
        
    }
    
    
    
    
}
