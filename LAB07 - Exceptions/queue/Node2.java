public class Node2 {
    private int value;
    private Node2 next;

    public Node2() {
    }

    public Node2(int value, Node2 next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        
            this.value = value;
        
    }

    public Node2 getNext() {
        return this.next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public void setNode2(int value, Node2 next){
        
        this.value = value;
        this.next = next;
    }



}
