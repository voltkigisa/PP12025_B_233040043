package Pertemuan4.tugas;

public class ListMain {
    public static void main(String[] args) {
        StrukturList listT1 = new StrukturList();
        StrukturList listT2A = new StrukturList();
        StrukturList listT2B = new StrukturList();
    
        //Tugas1
        listT1.addTail(3.9);
        listT1.addTail(4.1);
        listT1.addHead(5.3);
        listT1.addMid(7.2, 2);
        listT1.addMid(8.4, 2);

        //tugas2A
        listT2A.addTail(4.5);
        listT2A.addHead(2.1);
        listT2A.addMid(3.4, 2);

        //tugas2B
        listT2B.addTail(4.5);
        listT2B.addTail(5.5);
        listT2B.addHead(3.4);
        listT2B.addMid(1.1, 2);
        listT2B.addMid(2.1, 2);

        System.out.println("Element Tugas1: ");
        listT1.displayElement();
        System.out.println();
        System.out.println("Elemen Tugas 2A : ");
        listT2A.displayElement();
        System.out.println();
        System.out.println("Elemen Tugas 2B : ");
        listT2B.displayElement();

    }
    }
