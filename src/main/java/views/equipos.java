package views;
public class equipos {
    String record;
    String nombre;
    String entrenador;
    int id;
    String puntos;

    public equipos(){
        this("", "", "",0);
    }

    public equipos(String record, String nombre, String entrenador, int id){
        this.record = record;
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.id = id;
    }


    public String getEntrenador() {
        return entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getid() {
        return id;
    }

    public String getRecord() {
        return record;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
