import java.util.ArrayList;
public class Booth extends Component implements ContientPucks{

    private ArrayList<Puck> pucks;

    public Booth (int xcoord, int ycoord, Dimension dimension ){
		  super( xcoord, ycoord, dimension);
	      this.id = "b" + super.compteur;
    }
    public Booth (int xcoord, int ycoord ){
	      this (xcoord, ycoord, new Dimension(12,1));
    }
    public void addPuck(Puck puck){
        this.pucks.add(puck);
    }
    public Puck removePuck(){
        return this.pucks.remove(0);
    }
    public boolean hasPuck(){
        return this.pucks.size() > 0;
    }

    
}
