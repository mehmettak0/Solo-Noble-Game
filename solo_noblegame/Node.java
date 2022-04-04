/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

/**
 *
 * @author yunus
 */
public class Node {

    int peg; // 1 or 0
    char [] label = new char[3];// Coordinate
    Node next;  // Next node
    Node child; // Child node
    int header; // Header node

    public Node Node() {
        Node newNode = new Node();
        newNode.next = null;
        newNode.child = null;
        newNode.label[0] = newNode.label[1] = newNode.label[2];
        newNode.peg = 0;
        return newNode;
    }
}
