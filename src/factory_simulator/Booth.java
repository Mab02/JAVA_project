package factory_simulator;
import java.util.ArrayList;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;
public class Booth extends Component implements ContientPucks,RectangleFigure{

    private ArrayList<Puck> pucks;

    public Booth (int xcoord, int ycoord, Dimension dimension ){
		  super( xcoord, ycoord, dimension);
	      this.id = "b" + Component.compteur;
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
    public int getWidth(){
        return dimension.width;
    }
    public int getHeight(){
        return dimension.height;
    }
    
}
