package filaenqueuedequeue;

public class Fila<T>{

    private No<T> refNoEntraFila;

    public Fila(){
        this.refNoEntraFila = null;

    }




    public void enqueue(T object){
        No<T> novoNo = new No<T>(object);
        novoNo.setRefNo(refNoEntraFila);
        refNoEntraFila = novoNo;

    }

    public T first(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntraFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }


    public T dequeue(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntraFila;
            No<T> auxiliarNo = refNoEntraFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    auxiliarNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    auxiliarNo.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getRefNo();
        }
        return null;
    }


    public boolean isEmpty(){
        return refNoEntraFila == null ? true: false;
    }




    @Override
    public String toString() {

        String stringRetorno = "";
        No<T> auxiliarNo = refNoEntraFila;

        if(refNoEntraFila != null){
            while(true){
                stringRetorno += "[No{object=" + auxiliarNo.getObject() + "}]--->";
                auxiliarNo = auxiliarNo.getRefNo();
                if(auxiliarNo.getRefNo() != null){
                    auxiliarNo = auxiliarNo.getRefNo();

                }else{
                    stringRetorno += "null"; /*If no has this part. It will show noPointerExeption*/
                    break;
                }
            }

        }else{
            stringRetorno = "null";
        }



        return stringRetorno;
    
    }


    

}