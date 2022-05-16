/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author romit
 */
public class CircuitTry {
    public static void main(String[] args) {
        
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
                
        Resistor one = new Resistor(100, node1, node2);
        Resistor three = new Resistor(50, node2, node3);
        Resistor four = new Resistor(10000, node1, node4);
                
        Circuit two = Circuit.getInstance();
        
        two.add(one);
        two.add(three);
        two.add(four);

        System.out.println(two);
    }
}
