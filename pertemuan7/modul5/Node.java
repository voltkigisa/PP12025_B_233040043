package pertemuan7.modul5;

public class Node {
    private int Data;
    private Node Next;
    
    public Node(int Data) {
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
