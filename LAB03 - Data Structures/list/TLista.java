public class TLista {
    private Node head;
    private Node rear;
    private int size = 0;
    private boolean sorted = false;

    public int push_front(int value){
        if(sorted == true){
            return 1;
        }
        if(size == 0){
            Node n = new Node(value, null);
            this.rear = n;
            this.head = n;
            rear.setNext(null);
        }else{
            Node n = new Node(value, this.head);
            this.head = n;
        }
        
        size++;
        return 0;
    }

    public int push_back(int value){
        if(sorted == true){
            return 1;
        }
        Node n = new Node(value, null);
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
        return 0;
    }

    public int insert(int pos, int value){
        if(sorted == true){
            return 1;
        }
        if(pos > size+1){
            return 1;
    
        }else if(pos == 1){
            push_front(value);
            return 0;
            
        }else if(pos == size+1){
            push_back(value);
            return 0;
        }else{
            Node n = new Node(value, null);
            Node aux = head;
            Node aux2 = head.getNext();
            
            for(int i = 1; i < pos-1; i++){
                aux = aux2; 
                aux2 = aux2.getNext();
            }
            aux.setNext(n);
            n.setNext(aux2);
            size++;
            return 0;
        }
    }

    public int insertSorted(int value){ // Incompleto
        if(sorted == false){
            return 1;
        }else{
            Node n = new Node(value, null);
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
                Node aux = head;
                Node aux2 = null;
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
            return 0;
        }
    }

    public void print(){
        if(size == 0){
            System.out.println("|ERRO| Lista vazia!");
        }else{

        
            int i = 1;
            Node aux = head;
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

    public int popFront(){
        if(size == 0){
            return 1;
        }else{
            head = head.getNext();
            
            if(size==1){
                rear = null;
            }
            size--;
            return 0;
        }
    }
    
    public int popBack(){
        if(size == 0){
            return 1;
        }else{
            if(size==1){
                head = null;
                rear = null;
            }else if(size == 2){
                rear = head;
                head.setNext(null);
            }else{
                Node aux = head;
                Node aux2 = null;
                while(aux.getNext()!=null){
                    aux2 = aux;
                    aux = aux.getNext();
                }
                aux2.setNext(null);
                rear = aux2;
            }
            size--;
            return 0;
        }
    }

    public void front(){
        System.out.println(head);
    }

    
    public void back(){
        System.out.println(rear);
    }

    public int eraseData(int value){
        if(size == 0){
            return 1;
        }
        else{
            Node aux = head;
            Node aux2 = null;
            while(value != aux.getValue()){
                aux2 = aux;
                aux = aux.getNext();
            }
            if(aux == null){
                return 2;
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
            return 0;
        }
    }
    public int erasePos(int pos){
        if(size == 0){
            return 1;
        }else if(pos> size){
            return 2;
        }
        else{
            Node aux = head;
            Node aux2 = null;
            while(pos > 1 ){
                aux2 = aux;
                aux = aux.getNext();
                pos--;
            }
            if(aux == null){
                return 2;
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
            return 0;
        }
    }

    public int findPos(int pos){
        if(size == 0){
            return 1;
        }else if(pos > size){
            return 2;
        }else{ 
            Node aux = head;
            int auxPos = pos;
            while(auxPos >1 ){
                aux = aux.getNext();
                auxPos--;
            }
            System.out.println("Valor na posicao "+ pos+ ": " + aux.getValue() );
            return 0;
        }
    }

    public int getPos(int value){
        if(size == 0){
            return 1;
        }else{ 
            Node aux = head;
            int i = 1;
            while(value != aux.getValue() ){
                aux = aux.getNext();
                i++;
                if(i>size){
                    return 1;
                }
            }
            System.out.println("Posicao do valor "+value+": "+ i);
            return 0;
        }
    }

    






























    public TLista() {
    }

    public TLista(boolean sorted) {
        
        this.sorted = sorted;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getRear() {
        return this.rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
