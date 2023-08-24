public class Cliente {
    //Atributo
    String nombre;
    String frecuencia;
    boolean asignado;
    int amigos;
    String habitacionReservada;


    /**
     * @param nombre
     * @param frecuencia
     * @param asignado
     * @param amigos
     */
    public Cliente(String nombre, String frecuencia, boolean asignado, int amigos){
        this.nombre = nombre;
        this.frecuencia = frecuencia;
        this.asignado = asignado;
        this.amigos = amigos;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return
     */
    public String getFrecuencia() {
        return frecuencia;
    }


    /**
     * @return
     */
    public boolean getAsignado() {
        return asignado;
    }

    /**
     * @return
     */
    public int getAmigos() {
        return amigos;
    }

    /**
     * @return
     */
    public String getHabitacionReservada() {
        return habitacionReservada;
    }
    /**
     * Se agregó para poder agregarle la habitación al cliente, se olvidó planeat el setter
     * @param habitacionReservada
     */
    public void setHabitacionReservada(String habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    /**
     * @param asignado
     */
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    //fue necesario implemente un toString para mejor visualización de los datos ingresador por el usuario
    @Override
    public String toString() {
        String info = "Nombre: " + this.nombre + "\n" +
                      "Frecuencia de visita: " + this.frecuencia + "\n" +
                      "Cantidad de amigos: " + this.amigos + "\n";

        if (asignado) {
            info += "Su habitacion es " + habitacionReservada;
        } else {
            info += "Por el momento su habitación está en espera.";
        }

        return info;
    }



}
