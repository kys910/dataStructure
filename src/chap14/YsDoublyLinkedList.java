package chap14;

public class YsDoublyLinkedList {
    DoublyListNode head = null;

    // Definition for doubly-linked list.
    static class DoublyListNode {
        int val;
        DoublyListNode next, prev;
        DoublyListNode(int x) {val = x;}
    }

    public void printAllNode() {
        DoublyListNode dn = head;


        while (dn.next != null) {
            System.out.println(dn.val);
            dn = dn.next;
            if(dn.next == null){
                System.out.println(dn.val);
            }
        }
    }

    public void saveReverseNode(){
        if (head == null) {
            return;
        }

        DoublyListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        DoublyListNode newHead = new DoublyListNode(cur.val);
        newHead.next = cur.prev;
        newHead.prev = head;
        head = newHead;

        while(cur.prev != head){
            cur = cur.prev;

            addAtTail(cur.val);
            /*
            newHead.

            DoublyListNode tmp = newHead;
            newHead = newHead.next;
            newHead.next = cur.prev;
            newHead.prev = tmp;
            */
        }

        /*
        if(head.prev == head){
            System.out.println(head.val);
        }else{
            DoublyListNode dn = head.prev;

            while (dn.prev != head) {
                System.out.println(dn.val);
                dn = dn.prev;
                if(dn.prev == head){
                    System.out.println(dn.val);
                    System.out.println(head.val);
                    break;
                }
            }
        }
         */
    }

    public void printAllReverseNode() {
        if(head.prev == head){
            System.out.println(head.val);
        }else{
            DoublyListNode dn = head.prev;

            while (dn.prev != head) {
                System.out.println(dn.val);
                dn = dn.prev;
                if(dn.prev == head){
                    System.out.println(dn.val);
                    System.out.println(head.val);
                    break;
                }
            }
        }
    }

    /** Initialize your data structure here. */
    public void MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head == null) {
            return -1;
        }

        DoublyListNode cur = head;
        for (int i = 0; i < index; i++) {
            if (cur.next == null) {
                return -1;
            }
            // Move to Index (i + 1)
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (head == null) {
            head = new DoublyListNode(val);
            return;
        }

        DoublyListNode node = new DoublyListNode(val);
        node.next = head;
        head.prev = node;
        head = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            head = new DoublyListNode(val);
            return;
        }

        DoublyListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        DoublyListNode node = new DoublyListNode(val);
        cur.next = node;
        node.prev = cur;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list,
     * the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (head == null) {
            if (index == 0) {
                head = new DoublyListNode(val);
            }
            return;
        }

        DoublyListNode prev = null;
        DoublyListNode cur = head;
        for (int i = 0; i < index; i++) {
            if (cur == null) {
                return;
            }
            // Move to Index (i + 1)
            prev = cur;
            cur = cur.next;
        }

        DoublyListNode node = new DoublyListNode(val);
        if (prev == null) {
            node.next = head;
            head.prev = node;
            head = node;
        } else if (cur == null) {
            cur = node;
            prev.next = cur;
            cur.prev = prev;
        } else {
            prev.next = node;
            node.prev = prev;
            node.next = cur;
            cur.prev = node;
        }
    }

    public void add(int value){
        DoublyListNode dn = head;

        if(dn.next == null){
            dn.next = new DoublyListNode(value);
            dn.next.prev = dn;
            head.prev = dn.next;
        }else{
            while(dn.next != null){
                dn = dn.next;
                if(dn.next == null){
                    dn.next = new DoublyListNode(value);
                    dn.next.prev = dn;
                    head.prev = dn.next;
                    break;
                }
            }
        }
        /*
        if(head == null){
            head.val = value;
        }else{
            if(dn.next == null){

            }
            while(dn.next == null){
                if(dn.next == null){
                    dn.next = new DoublyListNode(value);
                }else{
                    dn = dn.next;
                }
            }
        }
         */
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        DoublyListNode cur = head;
        for (int i = 0; i < index; i++) {
            if (cur.next == null) {
                return;
            }
            // Move to Index (i + 1)
            cur = cur.next;
        }

        DoublyListNode prev = cur.prev;
        DoublyListNode next = cur.next;
        if (prev == null) {
            head = next;
        } else if (next == null) {
            prev.next = null;
        } else {
            prev.next = next;
            next.prev = prev;
        }
    }

    public static void main(String[] args){
        YsDoublyLinkedList yl = new YsDoublyLinkedList();
        yl.addAtHead(0);
        yl.add(1);
        yl.add(2);
        yl.add(3);
        //yl.printAllNode();
        //yl.printAllReverseNode();
        yl.saveReverseNode();
    }
}