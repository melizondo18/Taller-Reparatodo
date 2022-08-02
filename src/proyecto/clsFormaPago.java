/* Clase para gestion de metodos de pago */

/// MElizondo ** metodos de pago efectivo, tc cheque
package proyecto;

public class clsFormaPago {
    private byte cvv;
    private String numeroTarjeta;
    private short vencimiento;
    private String titular;
    private String [] datoTarjeta;
    
    public clsFormaPago(byte cvv, String numeroTarjeta, short fechaVencimiento, String titular) {
        this.cvv = cvv;
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = fechaVencimiento;
        this.titular = titular;
    }

    public byte getCvv() {
        return cvv;
    }

    public void setCvv(byte cvv) {
        this.cvv = cvv;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public short getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(short fechaVencimiento) {
        this.Vencimiento = fechaVencimiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public clsFormaPago[]asignarFormaPago(){
        clsFormaPago clsFP [] = new clsFormaPago;
        return
    }
}
