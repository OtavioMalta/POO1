public class TStack2 {
    private TLista2 lista;

    
    public void push(int value){
        try{
             lista.push_back(value);
        }catch(Exception e){
            System.out.println(e);
        }
       
    }

    public void size(){
        try{
            
            System.out.println(lista.size());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void pop(){
        try{

            lista.popFront();
        }
        catch(Exception e){
            System.out.println(e);}
        
    }
    
    public void top(){
        try{
        System.out.println(lista.getHead().getValue());
        }catch(NullPointerException e){
            System.out.println("Lista vazia!");
        }
    }
    

    public void print(){
        try{ 
            lista.print();
        }
        catch(Exception e){
            System.out.println(e);}
    }

    public TLista2 getLista() {
        return this.lista;
    }

    public void setLista(TLista2 lista) {
        this.lista = lista;
    }

    public TStack2() {
        lista = new TLista2();
    }
}
