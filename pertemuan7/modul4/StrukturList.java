package pertemuan7.modul4;

public class StrukturList {
    private Node HEAD;
    public boolean isEmpty(){
        return HEAD == null;
    }

    public void addTail(int data){
        Node posNode = null, curNode = null;

        Node newNode = new Node(data);
        if(isEmpty()){
            HEAD = newNode;
        }
        else{
            curNode = HEAD;
            while(curNode != null){
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement(){
        Node curNode = HEAD;
        while(curNode != null){
            System.out.print(curNode.getData()+" ");
            curNode = curNode.getNext();
        }
    }

    public void addHead(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            HEAD = newNode;
        }
        else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int position){
        Node posNode = null, curNode = null;
        int i;

        Node newNode = new Node(data);
        if(isEmpty()){
            HEAD = newNode;
        }
        else{
            curNode = HEAD;
            if(position == 1){
                newNode.setNext(curNode);
            }else{
                i = 1;
                while(curNode != null && i < position){
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    //prosedur remove head
    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
    }
    public void removeHead(){
        if(isEmpty()){
            System.out.println("List Kosong");
        }else{
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    //prosedur remove tail
    public void disposeTail(Node lastNode){
        lastNode.setNext(null);
        lastNode = null;
    }
    public void removeTail(){
        Node preNode = null, lastNode;
        if(isEmpty()){
            System.out.println("List Kosong");
        }else if(HEAD != null){
            if (HEAD.getNext() == null){
                HEAD = null;
            }else{
                lastNode = HEAD;
                while (lastNode.getNext() != null){
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                disposeTail(lastNode);
            }
        }
    }
}
