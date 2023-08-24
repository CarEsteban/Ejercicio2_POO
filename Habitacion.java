public class Habitacion {

    //Atributos
    String tipoHabitacion;
    int ID;
    String cliente;
    int cupo;
    boolean reservado;
    double precio; //Cambio en el tipo de la variable para el precio
                    //se agregó el parámetro ID al constructor, ya estaba el atributo pensado, mas no el parametro 
    public Habitacion(int ID, String tipo, int cupoMaximo, double precio , boolean reservado ){
        this.ID = ID;
        this.tipoHabitacion = tipo;
        this.cupo = cupoMaximo;
        this.precio = precio;
        this.reservado = reservado;
    }

    /**
     * @return
     */
    public int getCupo() {
        return this.cupo;
    }

    /**
     * @return
     */
    public boolean getReservado(){
        return this.reservado;
    }

    /**
     * @return
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return
     */
    public int getID() {
        return ID;
    }


    /**
     * @return
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }


    /**
     * @param cupo
     */
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    /**
     * @param reservado
     */
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    /**
     * @param cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    //fue necesario implemente un toString para mejor visualización de los datos de la habitación
    @Override
    public String toString() {
        String estado;
        if (reservado) {
            estado = "La habitación está ocupada por " + cliente;
            
            return "ID de habitación: " + ID + "\n" +
                   "Tipo de habitación: " + tipoHabitacion + "\n" +
                   "Estado: " + estado;
                   
        } else {
            estado = "La habitación está libre";

            return "ID de habitación: " + ID + "\n" +
                   "Tipo de habitación: " + tipoHabitacion + "\n" +
                   "Estado: " + estado + "\n" +
                   "Precio: " + precio + "\n" +
                   "Cupo Máximo: " + cupo;
        }
    
    }
    

}
