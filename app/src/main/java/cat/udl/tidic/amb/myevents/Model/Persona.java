package cat.udl.tidic.amb.myevents.Model;

import androidx.annotation.NonNull;

public class Persona {

    private String nombre;
    private String evento;
    private String fecha;


    public Persona(String nombre, String description, String date) {
        this.nombre = nombre;
        this.evento = description;
        this.fecha = date;
    }

    public Persona(){
        this.nombre ="";
        this.evento ="";
        this.fecha ="";
    }

    @NonNull
    @Override
    public String toString(){
        return "Hola "+ nombre + ", has sido invitado a " + evento + " el dia " + fecha +
                ". ¡Te esperamos!";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }
}
