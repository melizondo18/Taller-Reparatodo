/* Clase para gestion de Cliente  */

package proyecto;

public class clsCliente extends clsUsuario {
    String nombreUsuario; // FMarti Asignar nombre de usuario
    String vehiculo[];
    String proforma[];
    clsFormaPago clsFP[];

    public clsCliente(String nombreUsuario, String[] vehiculo, String nombre, String apellido, String direccion, String email, String telefono, String estadoUsuario) {
        super(nombre, apellido, direccion, email, telefono, estadoUsuario);
        this.nombreUsuario = nombreUsuario;
        this.vehiculo = vehiculo;
    }
    
}
