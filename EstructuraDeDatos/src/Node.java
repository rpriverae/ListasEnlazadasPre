
public class Node {

    private int info;
    private Node link;

    //Contructor 0 
    public Node(int info, Node link) {
        this.info = info;
        this.link = link;
    }

    //Contructor 1
    public Node(int info) {

        this.info = info;
        this.link = null;
    }

    //Contructor 2
    public Node() {

        this.info = 0;
        this.link = null;
    }

    //Getters and Setters
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public Node getLink() {
        return link;
    }
    public void setLink(Node link) {
        this.link = link;
    }   
}