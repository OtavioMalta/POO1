public class Stack {
    public static void main(String[] args) {
        TStack2 pilha = new  TStack2();
        //pilha.push(-13);
        pilha.push(3);
        pilha.push(6);
        pilha.push(9);
        pilha.push(2);
        pilha.push(4);
        pilha.print();

        pilha.pop();
        /*pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();*/
        pilha.print();

        System.out.print("Top: ");
        pilha.top();

        System.out.print("Tamanho: ");
        pilha.size();

        
    }
}
