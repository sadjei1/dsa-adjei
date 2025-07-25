public class LinkedList {

    Node head;

    //This function adds an element to the linked list. This linked list accepts only integers.
    public void addElement(int data) {

        Node newValue = new Node(data);
        if (head == null) {
            head = newValue;
            return;
        }

        //What is the head is not empty.
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newValue;
    }

    //This line of code will print out the linked list in ascending order.
    public void printList() {
        Node current = head;

        System.out.println("Linked list: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
       
    }

    public void deleteNode(int data) {
        Node current = head;
        //What if the list is empty.
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        //What if the head is the value to be deleted.
        if (head.value == data) {
            head = head.next;
            return;
        }   

        //What if the value to be deleted is in the middle or the tail of the list.
        while (current.next != null) {
            if (current.next.value == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        } 
    }

    //This algorithm uses just data
    public void removeDuplicates(int data) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value == data) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }

        return;
    }





















}
