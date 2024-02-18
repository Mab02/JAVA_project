import java.util.ArrayList;
public class Area extends Component implements ContientPucks{ 

  private ArrayList<Puck> pucks;
  private String name;
  public Area (int xcoord, int ycoord, Dimension dimension, String name ){
		super( xcoord, ycoord, dimension);
	    this.id = "a" + super.compteur;
        this.pucks = new ArrayList<Puck>();
        this .name = name;
    
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

  public String toString(){
    return name +" "+ this.id + " : " + this.pucks.size() + " pucks "+ pucks;
  }

}
