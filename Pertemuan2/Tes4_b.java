package Pertemuan2;

public class Tes4_b {
    public static void main(String[] args) {

        //membuat 2 buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(2);
        Node n5 = new Node(3);

        //membuat relasi Node n1 dan n2
        n4.setNext(n5);
        n5.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);

        //menampilkan nilai n1 & n2 dengan pointer p
        Node p =n4;
        while (p !=null)
        {
            System.out.printf("%d ",p.getNilai());
            p = p.getNext();
        }
    }
    
}