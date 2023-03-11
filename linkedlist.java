class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class linkedlist {
    public void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public int lengthofList(Node head) {
        Node n = head;
        int count = 0;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    public boolean IdentiticalList(Node head1, Node head2) {
        Node a = head1;
        Node b = head2;
        while (a != null && b != null) {
            if (a.data != b.data) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
        // at this point both a and b should point at null if they are of the same
        // length
    }

    public Node reverseList(Node head) {
        Node prev = null, next = null;
        Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public boolean detectLoop_Hash(Node head) {
        return false;
    }

    public boolean detectLoop_Floyd(Node head) {
        return false;
    }

    public boolean listPalindromeCheck(Node head) {
        return false;
        // using stack
    }
}
