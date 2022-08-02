/**/
package proyecto;

import javax.swing.JOptionPane;

public class clsMenu {
    clsOperario clsC = new clsOperario(); 
   public void menuPrincipal(){
        char opcion = ' ';
        do {
            opcion = JOptionPane.showInputDialog("Seleccione una opcion: "
                    + "\nA. Gestíon de Colaboradores"
                    + "\nB. Gestíon de Clientes"
                    + "\nC. Gestíon de " // Falta asignar la gesntion de que!!
                    + "\nD. Consulta de reparaciones"
                    + "\nE. Inventario"
                    + "\nF. Facturación"
                    + "\nG. Contabilidad"
                    + "\nS. Salir").toUpperCase().charAt(0);
            switch (opcion){
                case 'A':
                     
                    break;
                case 'B':
                    break;
                case 'C':
                    break;
                case 'D':
                    break;
                case 'E':
                    break;
                case 'F':
                    break;
                case 'G':
                    break;
                case 'S':
                    JOptionPane.showMessageDialog(null,"Te esperamos pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccion invalida, intentelo nuevamente");
                    break; 
            }
        }while (opcion != 'S'); 
}
}
