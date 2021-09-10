package filaenqueuedequeue;

public class Main{
    
    public static void main(String[] args){

       Fila<String> minhaFila = new Fila<String>();


       minhaFila.enqueue("Primeiro");
       minhaFila.enqueue("Segundo");
       minhaFila.enqueue("Quarto");
       minhaFila.enqueue("Quinto");
       


       System.out.println(minhaFila);
       System.out.println(minhaFila.dequeue());

       
       System.out.println(minhaFila);
       System.out.println(minhaFila.first());

       System.out.println(minhaFila);
    }
    
}
