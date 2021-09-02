package pilhaTopPushPop;

public class Pilha{

    private No refNoInPilha;

        public Pilha(){
            this.refNoInPilha = null;
        }

        public void push(No novoNo){
            No refAuxiliar = refNoInPilha
            refNoInPilha = novoNo;
            refNoInPilha.setRefNo(refAuxiliar);
        }
        
        public No pop(){
            if(!this.isEmpty()){
                No noPoped = refNoInPilha;
                refNoInPilha = refNoInPilha.getRefeNo();
                return noPoped;

            }
            return 
        }


        public No top(){
            return refNoInPilha;
        }

        public boolean isEmpty() {
            
            return refNoInPilha == null? true : false;
            
        }
}
