package Pertemuan2;

public class NodeMain {
    public static void main(String[] args) {

        //membuat 2 buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        //membuat relasi Node n1 dan n2
        n1.setNext(n2);

        //menampilkan nilai n1 & n2 dengan pointer p
        Node p =n1;
        while (p !=null)
        {
            System.out.printf("%d ",p.getNilai());
            p = p.getNext();
        }
    }
    
}
