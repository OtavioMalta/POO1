public class Queue {
    public static void main(String[] args) {
        TQueue2 fila = new TQueue2();
        fila.push(-1);
        fila.push(2);
        fila.push(1);
        fila.push(4);
        fila.push(3);

        fila.print();
        fila.pop();
        
        //fila.pop();
        //fila.pop();


        System.out.print("Front: ");
        fila.front();
        System.out.print("Tamanho: ");
        fila.size();
    }
}
