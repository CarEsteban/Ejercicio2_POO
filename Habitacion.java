public class Habitacion {
    //Atributos
    String tipoHabitacion;
    int ID;
    String cliente;
    int cupo;
    boolean reservado;
    float precio;

    public Habitacion(String tipo, int cupoMaximo, float precio , boolean reservado ){
        this.tipoHabitacion = tipo;
        this.cupo = cupoMaximo;
        this.precio = precio;
        this.reservado = reservado;
    }

    public int getCupo() {
        return this.cupo;
    }

    public boolean getReservado(){
        return this.reservado;
    }

    public String getCliente() {
        return cliente;
    }

    public float getPrecio() {
        return precio;
    }

    public int getID() {
        return ID;
    }


}
