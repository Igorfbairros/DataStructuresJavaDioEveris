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

    public T get(int index){
        return getNo(index).getConteudo();
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

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            refEntrada = noPivor.getProximoNO();
            return noPivor.getConteudo();

        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNO(noPivor.getProximoNO());
        return noPivor.getConteudo();


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

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = refEntrada;

        for(int i = 0; i < this.size(); i++){
            strRetorno += "{No [Conteudo =" + refEntrada + "]}-->";
            noAuxiliar = noAuxiliar.getProximoNO();
        }


        
        strRetorno += "null";
        return strRetorno;
    }


    
    
}
