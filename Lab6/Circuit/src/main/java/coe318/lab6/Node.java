package coe318.lab6;

/**
 *
 * @author romit
 */
public class Node {
    static int nodeNum = 0;
    private int identity;
    
    public Node(){
        this.identity = nodeNum;
        nodeNum ++;
    }
    
    
    @Override
    public String toString() {
        String s = "" + this.identity;
        return s;
    }
}
