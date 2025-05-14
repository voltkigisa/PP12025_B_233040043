package pertemuan11;


public class StrukturQueue {
    private Node front, rear;

    public boolean isEmpty(){
        return front == null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public int size(){
        int size = 0;
        Node curNode = front;
        while(curNode != null){
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int FRONT(){
        return front != null ? front.getData() : -1;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Kosong");
            return -1;
        } else {
            int data = front.getData();
            front = front.getNext();
            if (front == null) {
                rear = null;
            }
            return data;
        }
    }

    public void displayElement(){
        if(isEmpty()){
            System.out.println("Size :"+size());
            System.out.println("IsEmpty :"+isEmpty());
            System.out.println("Queue Kosong\n");
        } else{
            Node curNode = front;
            System.out.println("Size :"+size());
            System.out.println("IsEmpty :"+isEmpty());
            System.out.print("Elemen Queue : ");
            while(curNode != null){
                int q = curNode.getData();
                System.out.print(q+" ");
                curNode = curNode.getNext();
            }
            System.out.println("");
            System.out.println("Front :"+FRONT()+"\n");
        }
    }
}
