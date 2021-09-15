package ListasEncadeadas;

public class ListasEncadeadas {

    No<T> refEntrada;

    public ListasEncadeadas(){
        this.refEntrada = null;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAuxiliar = refEntrada;
        while(true){
            if(refEntrada != null){
                tamanhoLista++;
                if(refEntrada.getProximoNO() != null){
                    refAuxiliar = refEntrada.getProximoNO();

                }else{
                    break;

                }

            }else{
                break;
            }
        }
        return tamanhoLista;




    }

    public boolean isEmpty(){
        return refEntrada == null? true: false;
    }
    
}
