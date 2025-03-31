public class Queue {
    public static void main(String[] args) {
        TQueue fila = new TQueue();
        fila.push(2);
        fila.push(1);
        fila.push(4);
        fila.push(3);

        fila.print();
        fila.pop();
        fila.print();

        System.out.print("Front: ");
        fila.front();
        System.out.print("Tamanho: ");
        fila.size();
    }
}
