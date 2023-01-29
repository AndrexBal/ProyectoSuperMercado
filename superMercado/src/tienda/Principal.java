
package tienda;


public class Principal {
    
    public static void main(String[] args) {
        
        Recepcion recepcion = new Recepcion();
        
        Empleado empleado1 = new Empleado("Andres", 3, "casa 0", "desarrollador");
        Empleado empleado2 = new Empleado("Skoll", 8, "casa 3", "perro");
        
        Cliente cliente1 = new Cliente("Julian", 33, "calle san alejo", 12);
        Cliente cliente2 = new Cliente("andrea", 23, "calle java", 13);
        
        recepcion.agregarEmpleado(empleado1);
        recepcion.agregarEmpleado(empleado2);
        
        recepcion.agregarCliente(cliente1);
        recepcion.agregarCliente(cliente2);
        
        recepcion.imprimirInformacionPersonas();
        
        System.out.println("------------------------------");
        
        cliente1.saludar();
        cliente2.saludar();
        empleado1.saludar();
        empleado2.saludar();
        
        
    }
    
}
