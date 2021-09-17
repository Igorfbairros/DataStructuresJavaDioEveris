package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo =  null;
        this.ultimoNo =  null;
        this.tamanhoLista = 0;
    }

    public  T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T element){
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }


    public void add(int index, T element){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;

        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;

    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar  = primeiroNo;

    for(int i =0;(i < index) && (noAuxiliar != null); i++){
        noAuxiliar = noAuxiliar.getNoProximo();
    }
    return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

}