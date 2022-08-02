/* Clase para gestion de clsOperario */
package proyecto;

public class clsOperario extends clsUsuario{ // Permite heredar caracteristicas
    private String numeroEmpleado; // CO-001 Debe variar cada vez que se agregue un nuevo colaborador - Edwin
    
    public clsOperario(String numeroEmpleado, String nombre, String apellido, String direccion, String email, String telefono, String estadoUsuario) {
        super(nombre, apellido, direccion, email, telefono, estadoUsuario);
        this.numeroEmpleado = numeroEmpleado;
    }
    public void registrarOperario(){
        
    }    
    public void listarOperarios(){
        
    }
    public void eliminarOperario(){
        
    }
    public void asignarOperario(){
        
    }
    public void editarOperario(){
    }
    public void activarOperario(){
        
    }
    public void desactivarOperario(){
        
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
}

    
    


