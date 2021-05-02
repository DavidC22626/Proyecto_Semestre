package controlador;
import modelo.Pregunta;
import vista.Preguntas;

public class Controlador {
    
    Pregunta modeloPregunta = new Pregunta();
    Preguntas vistaPregunta = new Preguntas();
    
    public Controlador(Pregunta modeloPregunta, Preguntas vistaPregunta){
        this.modeloPregunta = modeloPregunta;
        this.vistaPregunta = vistaPregunta;
    }
    
    public void iniciarPregunta(){
        vistaPregunta.setTitle("Cuestionario");
        vistaPregunta.setResizable(false);
        vistaPregunta.setLocationRelativeTo(null);
    }
}