package modelo;

public class main {
    
    static ListaPreguntas objList = new ListaPreguntas();

    public static void main(String[] args){
        
        objList.llenarBase();
        for(int i = 0; i < ListaPreguntas.dataBase.cantidadDatos(); i++){
            
            if((ListaPreguntas.dataBase.obtener(i).getTipoPregunta()).equals("abierta")){
                
                System.out.println(ListaPreguntas.dataBase.obtener(i).getEnunciado() + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getIndicacion() + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getRespuestaCorrecta());
                
            } else if((ListaPreguntas.dataBase.obtener(i).getTipoPregunta()).equals("multiple")) {
                
                System.out.println(ListaPreguntas.dataBase.obtener(i).getEnunciado() + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getRespuestaMultiple()[0] + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getRespuestaMultiple()[1] + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getRespuestaMultiple()[2] + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getRespuestaMultiple()[3] + "\n" +
                                   ListaPreguntas.dataBase.obtener(i).getRespuestaCorrecta());
                
            }
        }
    }
}