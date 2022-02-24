import java.util.NoSuchElementException;

public class TLista2 {
    private Node2 head;
    private Node2 rear;
    private int size = 0;
    private boolean sorted = false;

    public void push_front(int value){
        if(sorted == true){
            throw new SortedException("Erro ao inserir valor em uma lista ordenada!");
        }else if(value < 0){
            throw new IllegalArgumentException("Argumento invalido!");
        }
        else if(size == 0){
            Node2 n = new Node2(value, null);
            this.rear = n;
            this.head = n;
            rear.setNext(null);
        }else{
            Node2 n = new Node2(value, this.head);
            this.head = n;
        }
        
        size++;
    }

    public void push_back(int value){
        if(sorted == true){
            throw new SortedException("Erro ao inserir valor em uma lista ordenada!");
        }else if(value < 0){
            throw new IllegalArgumentException("Argumento invalido!");
        }else{
            Node2 n = new Node2(value, null);
            if(size == 0){
                this.rear = n;
                this.head = n;
            }else{
                rear.setNext(n);
                this.rear = n;
                rear.setNext(null);
            }
            
            rear.setNext(null);
            size++;
            }
        
    }

    public void insert(int pos, int value){
        if(sorted == true){
            throw new SortedException("Erro ao inserir valor em uma lista ordenada!");
        }else if(value < 0){
            throw new IllegalArgumentException("Argumento invalido!");
        }
        else if(pos > size+1 || pos < 0){
            throw new  ArrayIndexOutOfBoundsException("Index inválido");
    
        }else if(pos == 1){
            push_front(value);
            
        }else if(pos == size+1){
            push_back(value);
        }else{
            Node2 n = new Node2(value, null);
            Node2 aux = head;
            Node2 aux2 = head.getNext();
            
            for(int i = 1; i < pos-1; i++){
                aux = aux2; 
                aux2 = aux2.getNext();
            }
            aux.setNext(n);
            n.setNext(aux2);
            size++;
        }
    }

    public void insertSorted(int value){ 
        if(sorted == false){
            throw new SortedException("Erro ao inserir valor em uma lista não ordenada!");
        }else if(value < 0){
            throw new IllegalArgumentException("Argumento invalido!");
        
        }else{
            Node2 n = new Node2(value, null);
            if(size == 0){
                this.rear = n;
                this.head = n;
            }
            else if(size == 1){
                if(n.getValue()<head.getValue()){
                    n.setNext(head);
                    rear = head;
                    head = n;
                }else{
                    head.setNext(n);
                    rear = n;
                }
            }else{
                Node2 aux = head;
                Node2 aux2 = null;
                while((aux != null) && aux.getValue() < value){
                    aux2 = aux;
                    aux = aux.getNext();
                }
                if(aux2 == null){
                    n.setNext(head);
                    head = n;
                }else{
                    aux2.setNext(n);
                    n.setNext(aux);
                }
            }
            size++;
        }
    }

    public void print(){
        if(size == 0){
            throw new NullPointerException("Não há referencia!");
        }else{
            int i = 1;
            Node2 aux = head;
            while(i<this.size){
                System.out.print(aux.getValue() + " -> ");
                aux = aux.getNext();
                i++;
            }
            System.out.println(aux.getValue());
            }
    }

    public int size(){
        return size;
    }

    public void popFront(){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else{
            head = head.getNext();
            
            if(size==1){
                rear = null;
            }
            size--;
        }
    }
    
    public void popBack(){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else{
            if(size==1){
                head = null;
                rear = null;
            }else if(size == 2){
                rear = head;
                head.setNext(null);
            }else{
                Node2 aux = head;
                Node2 aux2 = null;
                while(aux.getNext()!=null){
                    aux2 = aux;
                    aux = aux.getNext();
                }
                aux2.setNext(null);
                rear = aux2;
            }
            size--;
        }
    }

    public void front(){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else{
        System.out.println(head);
    }
    }

    
    public void back(){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else{
        System.out.println(rear);}

    }

    public void eraseData(int value){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }
        else{
            Node2 aux = head;
            Node2 aux2 = null;
            while(value != aux.getValue()){
                aux2 = aux;
                aux = aux.getNext();
            }
            if(aux == null){
                throw new NoSuchElementException("Elemento não encontrado!");
            }
            else if(aux2 == null){
                head = head.getNext();
            }
            else if(aux.getValue() == rear.getValue()){
                rear = aux2;
                aux2.setNext(null);
            }
            else{
                aux2.setNext(aux.getNext());
            }
            size--;
        }
    }
    public void erasePos(int pos){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else if(pos> size || pos < 0){
            throw new  ArrayIndexOutOfBoundsException("Index inválido");
        }
        else{
            Node2 aux = head;
            Node2 aux2 = null;
            while(pos > 1 ){
                aux2 = aux;
                aux = aux.getNext();
                pos--;
            }
            if(aux == null){
                throw new NoSuchElementException("Elemento não encontrado!");

            }
            else if(aux2 == null){
                head = head.getNext();
            }
            else if(aux.getValue() == rear.getValue()){
                rear = aux2;
                aux2.setNext(null);
            }
            else{
                aux2.setNext(aux.getNext());
            }
            size--;
        }
    }

    public void findPos(int pos){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else if(pos> size || pos < 0){
            throw new ArrayIndexOutOfBoundsException("Index inválido");
        }else{ 
            Node2 aux = head;
            int auxPos = pos;
            while(auxPos >1 ){
                aux = aux.getNext();
                auxPos--;
            }
            System.out.println("Valor na posicao "+ pos+ ": " + aux.getValue() );
            
        }
    }

    public void getPos(int value){
        if(size == 0){
            throw new NullPointerException("Size = 0 | Não há referencia!");
        }else if(value < 0){
            throw new IllegalArgumentException("Argumento invalido!");
        
        }else{ 
            Node2 aux = head;
            int i = 1;
            while(value != aux.getValue() ){
                aux = aux.getNext();
                i++;
                if(i>size){
                    throw new NoSuchElementException("Elemento não encontrado!");
                }
            }
            System.out.println("Posicao do valor "+value+": "+ i);
           
        }
    }

    






























    public TLista2() {
    }

    public TLista2(boolean sorted) {
        
        this.sorted = sorted;
    }

    public Node2 getHead() {
        return this.head;
    }

    public void setHead(Node2 head) {
        this.head = head;
    }

    public Node2 getRear() {
        return this.rear;
    }

    public void setRear(Node2 rear) {
        this.rear = rear;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
