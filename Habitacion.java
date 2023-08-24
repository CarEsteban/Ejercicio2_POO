/**
 * Representa una habitación en un hotel.
 */
public class Habitacion {

    // Atributos
    String tipoHabitacion;
    int ID;
    String cliente;
    int cupo;
    boolean reservado;
    double precio;

    /**
     * Constructor de Habitacion.
     *
     * @param ID          El ID de la habitación.
     * @param tipo        El tipo de habitación (Estándar, Deluxe, Suite, etc.).
     * @param cupoMaximo  La capacidad máxima de la habitación.
     * @param precio      El precio de la habitación.
     * @param reservado   Indica si la habitación está reservada o no.
     */
    public Habitacion(int ID, String tipo, int cupoMaximo, double precio, boolean reservado) {
        this.ID = ID;
        this.tipoHabitacion = tipo;
        this.cupo = cupoMaximo;
        this.precio = precio;
        this.reservado = reservado;
    }

    /**
     * Obtiene la capacidad máxima de la habitación.
     *
     * @return La capacidad máxima de la habitación.
     */
    public int getCupo() {
        return this.cupo;
    }

    /**
     * Verifica si la habitación está reservada.
     *
     * @return `true` si la habitación está reservada, `false` si está libre.
     */
    public boolean getReservado() {
        return this.reservado;
    }

    /**
     * Obtiene el nombre del cliente que ocupa la habitación.
     *
     * @return El nombre del cliente o `null` si la habitación está libre.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Obtiene el precio de la habitación.
     *
     * @return El precio de la habitación.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene el ID de la habitación.
     *
     * @return El ID de la habitación.
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtiene el tipo de habitación.
     *
     * @return El tipo de habitación.
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Establece la cantidad máxima de ocupantes de la habitación.
     *
     * @param cupo La nueva capacidad máxima de la habitación.
     */
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    /**
     * Establece el estado de reserva de la habitación.
     *
     * @param reservado `true` si la habitación está reservada, `false` si está libre.
     */
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    /**
     * Asigna un cliente a la habitación.
     *
     * @param cliente El nombre del cliente que ocupará la habitación.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Genera una representación en cadena de la habitación.
     *
     * @return La representación en cadena de la habitación.
     */
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
