
package tienda;


public class Cliente extends Persona {
    
    private int numeroTarjetaFidelidad;

    public Cliente(String nombre, int edad, String direccion,int numeroTarjetaFidelidad) {
        super(nombre, edad, direccion);
        this.numeroTarjetaFidelidad = numeroTarjetaFidelidad;
    }

    public int getNumeroTarjetaFidelidad() {
        return numeroTarjetaFidelidad;
    }

    public void setNumeroTarjetaFidelidad(int numeroTarjetaFidelidad) {
        this.numeroTarjetaFidelidad = numeroTarjetaFidelidad;
    }
    
    @Override
    public void saludar(){
            System.out.println("Hola soy "+this.getNombre() + " y soy un cliente del supermercado " + " y mi codigo es:  " + this.getNumeroTarjetaFidelidad() );
    
}
    
}
