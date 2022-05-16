
package coe318.lab6;

/**
 *
 * @author romit
 */
public class Resistor {
    private static int numRes = 1;
    private int identity;
    private double resistance;
    private Node a, b;
    
    public Resistor(double resistance, Node node1, Node node2){
        if (resistance<0){
            throw new IllegalArgumentException("Resistance can't be negative");
        }
        else if (resistance==0){
            throw new IllegalArgumentException("Resistance can't be zero");
        }
        else if (node1 == null){
            throw new IllegalArgumentException("The first node can't be null");
        }
        else if (node2 == null){
            throw new IllegalArgumentException("The second node can't be null");
        }
        else{      
            this.a = node1;
            this.b = node2;
            this.resistance = resistance;
            this.identity = numRes;
            numRes ++;
        }
    }
    
    public Node [] getNodes(){
        Node temp [] = {this.a, this.b};
        return temp;
    }
    
    @Override
    public String toString() {
        String s = "R" + this.identity + " " + this.a + " " + this.b + " " + this.resistance;
        return s;
    }
}
