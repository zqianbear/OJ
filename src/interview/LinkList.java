/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author zhengqian
 */
public class LinkList {

    public static void main(String[] args) {
        Node head = read();
        write(head);
        Node newhead = reverse(head);
        write(newhead);
    }

    public static Node read() {
        Node head = null;
        for (int i = 10; i > 0; i--) {
            Node node = new Node();
            node.data = i;
            node.next = head;
            head = node;
        }
        return head;
    }

    public static void write(Node head) {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public static Node reverse(Node head) {
        Node tail = head;
        Node current = tail;
        Node temp = null;
        while (true) {
            if (current.next == null) {
                break;
            } else {
                temp = current.next.next;
                current.next.next = tail;
                tail = current.next;
                current.next = temp;
                if (temp == null) {                   
                    break;
                }
            }
        }
        return tail;
    }

    static class Node {

        int data;
        Node next;
    }
}
