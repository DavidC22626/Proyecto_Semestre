package coleccion;

public class Lista <T> {
    
    private Object[] lista;
    private int cantidadDatos = 0;
    
    public Lista(int tamanioInicial){
        lista = new Object[tamanioInicial];
    }
    
    public void agregar(T elemento){
        insertar(elemento, cantidadDatos);
    }
    
    public void insertar(T elemento, int posicion){
        if(cantidadDatos == lista.length){
            Object[] aux = lista;
            lista = new Object[lista.length * 2];
            
            for(int i = 0; i < cantidadDatos; i++){
                lista[i] = aux[i];
            }
            aux = null;
        }
        
        for(int i = cantidadDatos - 1; i >= posicion; i--){
            lista[i + 1] = lista[i];
        }
        
        lista[posicion] = elemento;
        cantidadDatos++;
    }
    
    @SuppressWarnings ("unchecked")
    public T eliminar(int posicion){
        Object aux = lista[posicion];
        for(int i = posicion; i < cantidadDatos - 1; i++){
            lista[i] = lista[i + 1];
        }
        cantidadDatos--;
        return (T) aux;
    }
    
    @SuppressWarnings ("unchecked")
    public T obtener(int posicion){
        return (T)lista[posicion];
    }
    
    public int cantidadDatos(){
        return cantidadDatos;
    }
}