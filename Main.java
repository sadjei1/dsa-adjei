public class Main {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        list.addElement(6);
        list.addElement(7);
        list.addElement(8);
        list.printList();

        System.out.println();

        list.deleteNode(1);
        list.printList();
        list.deleteNode(5);
        list.printList();

    }

}
