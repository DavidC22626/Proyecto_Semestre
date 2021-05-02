package modelo;

public class Pregunta {
    
    private String enunciado, indicacion, respuestaCorrecta, tipoPregunta;
    private String[] respuestaMultiple;
    
    public Pregunta(){
    }
    
    public Pregunta(String enunciado, String indicacion, String respuestaCorrecta, String tipoPregunta){
        this.enunciado = enunciado;
        this.indicacion = indicacion;
        this.respuestaCorrecta = respuestaCorrecta;
        this.tipoPregunta = tipoPregunta;
    }
    
    public Pregunta(String enunciado, String respuestaCorrecta, String[] respuestaMultiple, String tipoPregunta){
        this.enunciado = enunciado;
        this.respuestaMultiple = new String[respuestaMultiple.length];
        this.respuestaMultiple = respuestaMultiple;
        this.respuestaCorrecta = respuestaCorrecta;
        this.tipoPregunta = tipoPregunta;
    }
    
    public static Pregunta crearPregunta(String enunciado, String indicacion, String respuestaCorrecta, String tipoPregunta){
        return new Pregunta(enunciado, indicacion, respuestaCorrecta, tipoPregunta);
    }
    
    public static Pregunta crearPregunta(String enunciado, String respuestaCorrecta, String[] respuestaMultiple, String tipoPregunta){
        return new Pregunta(enunciado, respuestaCorrecta, respuestaMultiple, tipoPregunta);
    }
    
    public boolean compararRespuesta(String respuestaUsuario){
        return this.respuestaCorrecta.equals(respuestaUsuario);
    }
    
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public String getIndicacion() {
        return indicacion;
    }
    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }
    
    public String[] getRespuestaMultiple() {
        return respuestaMultiple;
    }
    public void setRespuestaMultiple(String[] respuestaMultiple) {
        this.respuestaMultiple = respuestaMultiple;
    }
    
    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    public String getTipoPregunta() {
        return tipoPregunta;
    }
    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }
}