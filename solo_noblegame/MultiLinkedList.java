/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import java.util.Arrays;

/**
 *
 * @author yunus
 */
public class MultiLinkedList {
    // check for node is header or not.1 for is header.

    public static int isHeader(Node head, char[] label, int n) {
        Node tmp = new Node();
        if (tmp.label.equals(label)) {
            return 1;
        }
        while (tmp != null) {
            Node tmp2 = new Node();
            while (tmp2 != null) {
                if (tmp2.label.equals(label) && tmp2.header == 1) {
                    return 1;
                }
                if (tmp2.label.equals(label) && tmp2.header == 0) {
                    return 0;
                }
                tmp2 = tmp2.child;
            }
            tmp = tmp.next;
        }
        return 0;
    }

    // print the outer table
    void printChars(int n) { // n: number of corresponding chars / A B C etc.
        int i;
        System.out.print("   "); // Space for the Numbers column
        for (i = 65; i < n + 65; i++) {
            System.out.print((char) i + " ");
        }
        System.out.print("\n");
    }

    // add node 
    void add(Node head, Node add) {
        Node iter = head;

        while (iter.next != null) {
            iter = iter.next;
        }
        iter.next = add;
    }
    // add child node 

    void addChild(Node head, Node add) {
        Node iter = head;
        while (iter.child != null) {
            iter = iter.child;
        }
        iter.child = add;
    }

    // create headers list
    Node installHeader(Node head, int n) {
        if (head == null) {
            head = new Node();
            head.child = null;
            head.label[0] = 65;
            head.label[1] = 49;
            head.label[2] = '\0';
            head.peg = 1;
            head.header = 1;
            head.next = null;
        }
        int i;
        for (i = 0; i < n - 1; i++) {
            Node NEW = new Node();
            NEW.peg = 1;
            NEW.label[0] = (char) (65 + i + 1);
            NEW.label[1] = 49; // 49 = 1
            NEW.label[2] = '\0';
            NEW.next = null;
            NEW.child = null;
            NEW.header = 1;
            add(head, NEW);
        }
        return head;
    }

    // create child list
    Node installChild(Node head, int n) {
        int i, j;
        Node tmp = head;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                Node newNode = new Node();
                newNode.label[0] = (char) (65 + i);
                newNode.label[1] = (char) (49 + j + 1);
                newNode.label[2] = '\0';
                newNode.next = null;
                newNode.peg = 1;
                newNode.child = null;
                addChild(tmp, newNode);
            }
            tmp = tmp.next;
        }
        return head;
    }

    // delete node from list
    Node deleteNode(Node head, char[] label, int n) {
        // Eger silinecek Node header ise(Node.header ==1) sil ve childin nextine nexti bagla

        if ("A1".equals(label)) {
            Node deleted = head;
            head = head.child;
            head.next = deleted.next;
            head.header = 1;
            return head;
        }
        Node temp = head;

        if (head.label.equals(label) && head.child != null) { // eger ilk head Node silinecek ise
            Node deleted = head;
            head = head.child;
            head.next = deleted.next;
            return head;
        }
        if (head.label.equals(label) && head.child != null) {
            head = head.next;
            return head;
        }

        if (isHeader(head, label, n) == 1) { // eger silinecek Node headerda ise
            while (temp != null) {

                // Eger child varsa
                if (temp.next.label.equals(label) && temp.next.child != null) {
                    Node deleted = temp.next;
                    temp.next = temp.next.child;
                    temp.next.header = 1;
                    temp.next.next = deleted.next;
                    deleted = null;
                    return head;
                } // eger child yoksa
                else if (temp.next.label.equals(label) && temp.next.child == null) {
                    temp.next = temp.next.next;
                    return head;
                }
                temp = temp.next;
            }
        } else { // If it is not a header Node
            Node tmp = head;
            while (tmp != null) {
                if (tmp.label[0] == label[0]) {
                    // Eger bu kolonda ise
                    Node temp2 = tmp;
                    while (temp2 != null) {
                        if (temp2.child.label[1] == label[1]) {
                            // Node which is going to be deleted
                            Node deleted = temp2.child;
                            temp2.child = temp2.child.child;
                            return head;
                        }
                        temp2 = temp2.child;
                    }
                }
                tmp = tmp.next;
            }
        }

        // Eger child Node silinecek ise onceki. child = sonraki
        return head;
    }

    // deletes 4 node according to game rules
    Node deleteMiddleFour(Node head, int n) {
        char[] label = new char[2];
        int x, y;
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                label[0] = (char) (65 + (n / 2) - 1 + y);
                label[1] = (char) (49 + (n / 2) - 1 + x);
                deleteNode(head, label, n);
            }
        }
        return head;
    }

    Node returnPlace(Node head, char[] label) {
        Node tmp = head;
        while (tmp != null) {
            Node tmp2 = tmp;
            while (tmp2 != null) {
                if (tmp2.label.equals(label)) {
                    return tmp2;
                }
                tmp2 = tmp2.child;
            }
            tmp = tmp.next;
        }
        return null;
    }

    // if node is exist return 1 otherwise 0.
    public int exist(Node head, char[] label) {
        int sonuc = 0;
        Node tmp = head;
        while (tmp != null) {
            Node tmp2 = tmp;
            while (tmp2 != null) {

                if (label[0] == tmp2.label[0] && label[1] == tmp2.label[1]) {
                    sonuc = 1;
                }
                tmp2 = tmp2.child;
            }
            tmp = tmp.next;
        }
        return sonuc;
    }

    // print list for gamer
    void table(Node head, int n) {
        printChars(n);

        int yStart = 49;
        int xStart = 'A';
        int i, j;
        char[] label = new char[2];
        for (i = 0; i < n; i++) {
            System.out.print(i + 1 + "  ");
            for (j = 0; j < n; j++) {
                label[0] = (char) (xStart + j);
                label[1] = (char) (yStart + i);
                if (exist(head, label) == 1) {
                    System.out.print("X ");

                } else {
                    System.out.print("  ");

                }
            }
            System.out.print("\n");
        }
    }

    // show number of count
    void remaining(Node head) {
        Node t = head;
        int count = 0;
        while (t != null) {
            Node t2 = t;
            while (t2 != null) {
                count++;
                t2 = t2.child;
            }
            t = t.next;
        }
        System.out.println("Remaining:" + count + "\n");
        Game.lbl_hamle.setText("Kalan Hamle: " + String.valueOf(count));
    }

    // show user to possible location
    int possible(Node head, char[] label, int n) {
        System.out.println("\nPossible hit location(s): ");
        if (exist(head, label) == 0) {
            return -1; // No such Node
        }
        int x = 0;
        // Yukariyi kontrol et
        char[] check = Arrays.copyOf(label, 3);

        check[1] = (char) ((int) label[1] - 1);
        if (exist(head, check) == 1) {
            check[1] = (char) ((int) check[1] - 1);
            if (exist(head, check) == 0 && (int) check[1] <= 48 + n && (int) check[1] > 48) {
                System.out.println(check);
                Game.lbl_hamle1.setText("Possible hit location: " + Arrays.toString(check));
                x++;
            }
        }

        // Asagiyi kontrol et
        check[0] = label[0];
        check[1] = (char) ((int) label[1] + 1);
        check[2] = '\0';
        if (exist(head, check) == 1) {
            check[1] = (char) ((int) check[1] + 1);
            if (exist(head, check) == 0 && (int) check[1] <= 48 + n && (int) check[1] > 48) {
                System.out.println(check);
                Game.lbl_hamle1.setText("Possible hit location: " + Arrays.toString(check));
                x++;
            }
        }

        // Solu kontrol et
        check[1] = label[1];
        check[0] = (char) ((int) label[0] - 1);
        check[2] = '\0';
        if (exist(head, check) == 1) {
            check[0] = (char) ((int) check[0] - 1);
            if (exist(head, check) == 0 && (int) check[0] <= 64 + n && (int) check[0] > 64) {
                System.out.println(check);
                Game.lbl_hamle1.setText("Possible hit location: " + Arrays.toString(check));
                x++;
            }
        }

        // Sagi kontrol et
        check[1] = label[1];
        check[0] = (char) ((int) label[0] + 1);
        check[2] = '\0';
        if (exist(head, check) == 1) {
            check[0] = (char) ((int) check[0] + 1);
            if (exist(head, check) == 0 && (int) check[0] <= 64 + n && (int) check[0] > 64) {
                System.out.println(check);
                Game.lbl_hamle1.setText("Possible hit location: " + Arrays.toString(check));
                x++;
            }
        }
        if (x == 0) {
            System.out.println("None\n");
            Game.lbl_hamle1.setText("Possible hit location: " + "None");
            return 0;
        }
        System.out.println("\n");
        return 1;
    }

    Node returnHeader(Node head, char[] label) {
        Node t = head;
        while (t != null) {
            if (t.label[0] == label[0]) {
                return t;
            }
            t = t.next;
        }
        Node t2 = null;
        return t2;
    }
// Return adress of previos header of given column

    Node returnPrevHeader(Node head, char[] label) {
        Node t = head;
        while (t.next != null) {
            if (t.next.label[0] == label[0]) {
                return t;
            }
            t = t.next;
        }
        Node t2 = null;
        return t2;
    }

    // add node to column with rules
    Node addToColumn(Node head, char[] label) {
        Node newNode = new Node();
        newNode.peg = 1;
        newNode.label = Arrays.copyOf(label, 2);
        Node t = head;

        if (label[0] == 'A') {
            if ((int) head.label[1] > (int) label[1]) {
                newNode.next = head.next;
                newNode.child = head;
                newNode.header = 1;
                head.header = 1;
                head = newNode;
                return head;
            }
        }

        while (t != null) {
            if (label[0] == t.label[0]) { // bu kolonda ise
                if ((int) label[1] < (int) t.label[1]) { // Eger kolonun basina eklenmesi gerekiyorsa
                    if (t != head) {
                        returnPrevHeader(head, t.label).next = newNode;
                    }
                    newNode.next = t.next;
                    newNode.child = t;
                    newNode.header = 1;
                    t.header = 0;
                    t.next = null;
                    return head;
                } else {
                    Node t2 = t;
                    while (t2 != null) {
                        if (t2.child == null) {
                            t2.child = newNode;
                            return head;
                        } else if ((int) t2.child.label[1] > (int) label[1]) {
                            newNode.child = t2.child;
                            t2.child = newNode;
                            return head;
                        }

                        t2 = t2.child;
                    }
                }
            } else if (t.next == null && (int) label[0] > (int) t.label[0]) {
                t.next = newNode;
                newNode.header = 1;
                newNode.next = null;
                newNode.child = null;
                return head;
            } else if ((int) label[0] < t.next.label[0]) { // o kolon mevcut degil ise
                newNode.next = t.next;
                t.next = newNode;
                newNode.header = 1;
                return head;
            }

            t = t.next;
        }
        return head;
    }
    // move node and deleted other one.
    Node move(Node head, char[] l1, char[] l2, int n) {
        head = deleteNode(head, l1, n);

        char[] tmp;
        tmp = Arrays.copyOf(l1, 2);
        if (l1[0] == l2[0]) { // Eger nodlar ust uste ise
            if ((int) l1[1] < (int) l2[1]) { // 49 < 51  yukaridan asagiya  - B1->B3
                tmp[1] = (char) (l1[1] + 1);

                head = deleteNode(head, tmp, n);
            } else {
                int k = (int) l1[1] - 1;
                tmp[1] = (char) k;

                head = deleteNode(head, tmp, n);
            }

            // Eger node'lar yatayda iseler
        } else { // Eger node'lar yatayda iseler
            if ((int) l1[0] < (int) l2[0]) {
                tmp[0] = (char) (l1[0] + 1);
                head = deleteNode(head, tmp, n);
            } else {
                tmp[0] = (char) (l1[0] - 1);
                head = deleteNode(head, tmp, n);
            }
        }

        head = addToColumn(head, l2);

        return head;
    }
    
    void printT(Node head) {
        System.out.print("\n");
        Node t = head;
        while (t != null) {
            Node t2 = t;
            while (t2 != null) {
                System.out.print(t2.label);
                System.out.print(t2.header);
                t2 = t2.child;
            }
            System.out.print("\n");
            t = t.next;
        }
    }

}
