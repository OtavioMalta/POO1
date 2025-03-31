public class TStack {
    private TLista lista;

    public int push(int value){
        int res = lista.push_front(value);
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

    public void top(){
        System.out.println(lista.getHead().getValue());
    }

    public void print(){
        lista.print();
    }







    public TStack() {
        lista = new TLista();
    }
}
