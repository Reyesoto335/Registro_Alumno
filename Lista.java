package Registro_alumno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lista {
    Alumno alumno;
    static Scanner sc = new Scanner(System.in);
    protected Nodo inicio, fin;

    public Lista() {
        inicio = null;
        fin = null;
    }
    
    public boolean estaVacia(){
	if(this.inicio == null){
		return true;
        }
	return false;
    }
    
//    public void PedirDatos(){
//        System.out.println("Ingrese el nombre");
//        alumno.nombre = sc.next();
//        System.out.println("Ingrese el apellido");
//        alumno.apellido = sc.next();
//        System.out.println("Ingrese el carne");
//        alumno.carne = sc.nextInt();
//        System.out.println("Ingrese el email");
//        alumno.email = sc.next();
//    }
//    
    public void agregar(Alumno alumno){
        Nodo actual;
        if(estaVacia()){
            actual = new Nodo(alumno, null);
            inicio = actual;
            fin = actual;
        }else{
            actual = new Nodo(alumno, null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    public void mostrarLista(){
        
        if (estaVacia()){
            System.out.println("La lista está vacía");
        }else{
            Nodo aux;
            aux = inicio;
            while(aux!=null){
                System.out.println(aux.getAlumno().toString());
                aux = aux.getSiguiente();
            }
        }
        
      }
    
    public void BuscarAlumno(int Carne){
        if(estaVacia()){
           JOptionPane.showMessageDialog(null, "La lista está vacía");
           return;
       }else{
           Nodo temporal;
           temporal = inicio;
           while(temporal!=null){
               if (Carne == temporal.getAlumno().getCarne()){
               JOptionPane.showMessageDialog(null, temporal.getAlumno().toString());
               break;
               }
               temporal = temporal.getSiguiente();
           }
        }
    }
    public void EliminarAlumno(int Carne2){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        } else{
            if(inicio == fin && Carne2 == inicio.getAlumno().getCarne()){
                inicio = fin = null;
            } else if(inicio.getAlumno().getCarne() == Carne2){
                inicio = inicio.siguiente;
            } else{
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                
                while(temporal != null && temporal.getAlumno().getCarne() == Carne2){
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                
                if (temporal!= null){
                    anterior.siguiente = temporal.siguiente;
                    if(temporal == fin){
                        fin = anterior;
                    }
                }
            }
        }
    }
    }    
