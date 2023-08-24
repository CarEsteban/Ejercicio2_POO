/**
 * Representa un cliente que puede reservar y ocupar habitaciones en el hotel.
 */
public class Cliente {

    int ID;
    String nombre;
    String frecuencia;
    boolean asignado;
    int amigos;
    String habitacionReservada;
    int ID_habitacion;

    /**
     * Constructor de Cliente.
     *
     * @param ID          El ID del cliente.
     * @param nombre      El nombre del cliente.
     * @param frecuencia  La frecuencia de visita del cliente.
     * @param asignado    Indica si el cliente tiene una habitación asignada.
     * @param amigos      La cantidad de amigos que el cliente trae consigo.
     */
    public Cliente(int ID, String nombre, String frecuencia, boolean asignado, int amigos) {
        this.ID = ID;
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.asignado = asignado;
        this.amigos = amigos;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la frecuencia de visita del cliente.
     *
     * @return La frecuencia de visita del cliente.
     */
    public String getFrecuencia() {
        return frecuencia;
    }

    /**
     * Verifica si el cliente tiene una habitación asignada.
     *
     * @return `true` si el cliente tiene una habitación asignada, `false` si no la tiene.
     */
    public boolean getAsignado() {
        return asignado;
    }

    /**
     * Obtiene la cantidad de amigos que el cliente trae consigo.
     *
     * @return La cantidad de amigos del cliente.
     */
    public int getAmigos() {
        return amigos;
    }

    /**
     * Obtiene la descripción de la habitación que el cliente ha reservado.
     *
     * @return La descripción de la habitación reservada o información sobre la espera.
     */
    public String getHabitacionReservada() {
        return habitacionReservada;
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public int getID() {
        return ID;
    }

    /**
     * Establece la descripción de la habitación que el cliente ha reservado.
     *
     * @param habitacionReservada La descripción de la habitación reservada.
     */
    public void setHabitacionReservada(String habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    /**
     * Establece si el cliente tiene una habitación asignada.
     *
     * @param asignado `true` si el cliente tiene una habitación asignada, `false` si no la tiene.
     */
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    /**
     * Obtiene el ID de la habitación asignada al cliente.
     *
     * @return El ID de la habitación asignada al cliente.
     */
    public int getID_habitacion() {
        return ID_habitacion;
    }

    /**
     * Establece el ID de la habitación asignada al cliente.
     *
     * @param iD_habitacion El ID de la habitación asignada al cliente.
     */
    public void setID_habitacion(int iD_habitacion) {
        ID_habitacion = iD_habitacion;
    }

    /**
     * Genera una representación en cadena del cliente y su estado.
     *
     * @return La representación en cadena del cliente.
     */
    @Override
    public String toString() {
        String info = "ID del usuario: " + this.ID + "\n" +
                      "Nombre: " + this.nombre + "\n" +
                      "Frecuencia de visita: " + this.frecuencia + "\n" +
                      "Cantidad de amigos: " + this.amigos + "\n";

        if (asignado) {
            info += "Su habitación es " + habitacionReservada;
        } else {
            info += "Por el momento su habitación está en espera.";
        }

        return info;
    }
}
