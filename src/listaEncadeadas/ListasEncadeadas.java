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

    private No<T> getNo(int index){
        
        validaLista(index);
    
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i < this.size()-1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNO();

            
        }

        return noRetorno;
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

    private void validaLista(int index){
        if(index >= this.size()){
            int lastIndex = this.size() - 1 ;

            throw IndexOutOfBoundsException("NO CONTENT AVAIABLE ON INDEX "+ index + "THIS LIST. This list just go "+ lastIndex+ ";");

        }
    }

    public boolean isEmpty(){
        return refEntrada == null? true: false;
    }
    
}
