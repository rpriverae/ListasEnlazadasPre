public class List {

    private Node first;
    private Node last;

    //Contructor
    public List() {
        this.first = null;
        this.last = null;
    }

    public void unshift (int info) {
        Node newNode = new Node(info);
        if (this.first == null) { //isEmpty()
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.setLink(this.first);
            this.first = newNode;
        }
    }

    public void push (int info) {
        Node newNode = new Node(info);
        if (this.first == null) { //isEmpty()
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setLink(newNode);
            this.last = newNode;
            //no mandatorio
            this.last.setLink(null);
        }
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public boolean search(int info) {
        Node p = first;//Nodo auxiliar
        while(p.getLink() != null) {
            if(p.getInfo() == info) {
                return true;
            }
            p = p.getLink();
        }
        return false;
    }

    public boolean shift() {
        if (this.isEmpty()) 
            return false;
        if (this.first.getLink() == null) {
            this.first = null;
            this.last = null;
            return true;
        }
        Node temp = this.first;
        this.first = this.first.getLink();
        temp = null;
        return true;
    }

    public boolean pop() {
        if (this.isEmpty()) 
            return false;
        if (this.first.getLink() == null) {
            this.first = null;
            this.last = null;
            return true;
        }
        Node temp1 = this.first;
        Node temp2 = this.first;
        while (temp1.getLink() != null) {
            temp2 = temp1;
            temp1 = temp1.getLink();
        }
        this.last = temp2;
        this.last.setLink(null);
        temp1 = null;
        return true;
    }

    public String print() {
        String str = "";
        Node p = this.first;
        while (p.getLink() != null) {
            str += p.getInfo() + " | ";
            p = p.getLink();
        }
        return str;
    }
}