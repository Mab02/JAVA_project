
public class Puck extends Component{ 
    public final boolean destination; // Final destination of the puck 
    public Puck (int xcoord, int ycoord, Dimension dimension, boolean destination){
        super(xcoord, ycoord, dimension);
         this.id = "p" + super.compteur;
        this.destination = destination;
    }
    public Puck (int xcoord, int ycoord, boolean destination){
        this (xcoord, ycoord, new Dimension(1,1), destination); // Setting puck dimension by default 
    }

    public String toString(){
        return "Puck " +id+  " destination " +  (destination ? "customer" : "stock");
    }
    
}
