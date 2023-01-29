
package tienda;


public class Empleado extends Persona {
    
    private String cargo;

    public Empleado(String nombre, int edad, String direccion, String cargo) {
        super(nombre, edad, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void saludar(){
            System.out.println("Hola soy "+this.getNombre() + " y trabajo como: " + this.getCargo());
    
}
    
    
}
