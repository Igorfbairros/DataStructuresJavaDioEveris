package ListasEncadeadas;

public class No<T>{
    private T conteudo;
    private No proximoNO;

    public No(){
        this.proximoNo = null;

    }

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNO() {
        return proximoNO;
    }

    public void setProximoNO(No proximoNO) {
        this.proximoNO = proximoNO;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";

    }

    public String toStringEncadeado() {
        String str = "No [conteudo=" + conteudo + "]";

        if(proximoNO != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }







    
    
}