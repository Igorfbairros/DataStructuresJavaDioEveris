package ListasEncadeadas;

public class ListasEncadeadas {

    No<T> refEntrada;

    public ListasEncadeadas(){
        this.refEntrada = null;
    }

    public void add(T obj){
        No<T> novoNo = new No<>(obj);
        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntrada;
        for(int i = 0 ; i < this.size() -1; i++){
            noAuxiliar = noAuxiliar.getProximoNO();
        }

        noAuxiliar.setProximoNO(novoNo);

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
