package PP12025_B_233040043.Pertemuan2;

public class Node {
    private int nilai;
    private Node next;

    //inisialisasi Node
    public Node (int nilai){
        this.nilai = nilai;
    }

    //Setter & Getter
    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}