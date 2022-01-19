public class List {
    public static void main(String[] args) {
        TLista lista = new TLista(false);
        
        lista.push_front(2);
        lista.push_back(3);
        lista.push_front(1);
        lista.push_back(4);

        lista.findPos(3);
        lista.getPos(2);

        lista.print();
        lista.insert(3, 5);
        
        lista.print();
        lista.popFront();
        lista.popBack();

        lista.print();
        lista.eraseData(5);
        
        lista.print();
        lista.erasePos(2);
        
        lista.print();
        }
}
