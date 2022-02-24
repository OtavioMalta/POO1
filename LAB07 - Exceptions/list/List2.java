public class List2 {
    public static void main(String[] args) {
        TLista2 lista = new TLista2(false);
        try{
            lista.push_front(2);
            lista.push_back(3);
            lista.push_front(1);
            lista.push_back(4);
            //lista.insertSorted(7);
        }catch(Exception e){
            System.out.println(e);
        }
    
        try{
            //lista.findPos(7);
            lista.findPos(3);
            lista.getPos(2);
            lista.print();
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            lista.insert(1, 5);
            //lista.insert(1, -5);
            lista.popFront();
            lista.popBack();
            lista.print();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            
            //lista.eraseData(1);
            lista.eraseData(3);
            lista.erasePos(1);
            lista.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }
        
    
}
