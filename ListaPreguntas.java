package modelo;
import coleccion.Lista;

public class ListaPreguntas {
   
    static Lista <Pregunta> dataBase = new Lista <Pregunta> (2); 
    
    public void llenarBase(){

        dataBase.agregar(Pregunta.crearPregunta("Pregunta 1", "Ponga lo que quiera", "10", "abierta"));
        String[] respuestasUno = { "1", "2", "3", "11" };
        dataBase.agregar(Pregunta.crearPregunta("Pregunta 2", "11", respuestasUno, "multiple"));
        dataBase.agregar(Pregunta.crearPregunta("Pregunta 3", "Ponga lo que quiera", "12", "abierta"));
        String[] respuestasDos = { "1", "2", "3", "13" };
        dataBase.agregar(Pregunta.crearPregunta("Pregunta 4", "13", respuestasDos, "multiple"));
        dataBase.agregar(Pregunta.crearPregunta("Pregunta 5", "Ponga lo que quiera", "14", "abierta"));
    }
}