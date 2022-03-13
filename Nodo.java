package Registro_alumno;

public class Nodo {
    Alumno alumno;
    public Nodo siguiente;

//    public Nodo(Alumno alumno) {
//        this.alumno = alumno;
//    }

    public Nodo(Alumno alumno, Nodo siguiente) {
        this.alumno = alumno;
        this.siguiente = siguiente;

    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}