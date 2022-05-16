package coe318.lab6;
import java.util.ArrayList;

/**
 *
 * @author romit
 */
public class Circuit {
    private static Circuit instance = null; 
    private ArrayList <Resistor> circuit; 
    
    public static Circuit getInstance() {
        if (instance == null) { 
            instance = new Circuit();
        }
    return instance;
    }
    
    private Circuit() {
        circuit = new ArrayList <Resistor> ();
    } //Yes, the constructor is PRIVATE!
    
    
    public void add(Resistor r){
        this.circuit.add(r);
    }
    
    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < circuit.size(); i++) {
            s += (""+ circuit.get(i) + "\n");
        }
        return s;
    }
}
