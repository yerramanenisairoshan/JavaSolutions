package Linkedlist;
import java.util.*;
public class Linkedlist9 {
    int data;
    Linkedlist9 next;

    public Linkedlist9(int data) {
        this.data = data;
        this.next = null;
    }

    public Linkedlist9() {

    }
}

class LinkedList {
    Linkedlist9 head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Linkedlist9 newNode = new Linkedlist9(data);
        if (head == null) {
            head = newNode;
        } else {
            Linkedlist9 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public ArrayList<Integer> toArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Linkedlist9 current = head;
        while (current != null) {
            arrayList.add(current.data);
            current = current.next;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        ArrayList<Integer> arrayList = list.toArrayList();

        System.out.println("Linked List: " + arrayList);
    }

    public String isEmpty() {
        return null;
    }

}
