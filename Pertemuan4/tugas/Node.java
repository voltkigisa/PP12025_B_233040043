package Pertemuan4.tugas;

public class Node {
    private Double Data;
    private Node Next;
    
    public Node(Double Data) {
        this.Data = Data;
    }

    public Double getData() {
        return Data;
    }

    public void setData(Double data) {
        Data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
