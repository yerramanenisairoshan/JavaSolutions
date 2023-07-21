package Linkedlist;

public class Linkedlist10 extends Linkedlist9 {
        int data;
    Linkedlist10 next;

        public Linkedlist10(int data) {
            super();
            this.data = data;
            this.next = null;
        }
    }

    class LinkedLis {
        Linkedlist10 head;

        public LinkedLis() {
            this.head = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public static void main(String[] args) {
            LinkedList list1 = new LinkedList();

            System.out.println("Is the linked list empty? " + list1.isEmpty());

            list1.head = new Linkedlist10(1);

            System.out.println("Is the linked list empty? " + list1.isEmpty());
        }
    }

