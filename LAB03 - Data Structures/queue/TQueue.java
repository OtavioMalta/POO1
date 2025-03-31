public class TQueue {
    private TLista lista;




    public int push(int value){
        int res = lista.push_back(value);
        if (res == 0){
            return 0;
        }else{
            return res;
        }
    }

    public void size(){
        System.out.println(lista.size());
    }

    public int pop(){
        int res = lista.popFront();
        if (res == 0){
            return 0;
        }else{
            return res;
        }
    }
    

    public void front(){
        System.out.println(lista.getHead().getValue());
    }

    public void print(){
        if(lista.size() == 0){
            System.out.println("|ERRO| Fila vazia!");
        }else{
            lista.print();
        }
    }

    public TQueue() {
        lista = new TLista();
    }

    public TLista getLista() {
        return this.lista;
    }

    public void setLista(TLista lista) {
        this.lista = lista;
    }


}
