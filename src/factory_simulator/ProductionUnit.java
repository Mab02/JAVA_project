package factory_simulator;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;

public class ProductionUnit extends Component implements RectangleFigure{
    private int numberOfUnitToProduct;


    public ProductionUnit(int xcoord, int ycoord, Dimension dimension, int numberOfUnitToProduct){
		super( xcoord, ycoord, dimension);
	    this.id = "pr" + super.compteur;
        this.numberOfUnitToProduct = numberOfUnitToProduct;
    }

    public ProductionUnit(int xcoord, int ycoord, int numberOfUnitToProduct){
        this(xcoord, ycoord, new Dimension(5,5), numberOfUnitToProduct);
    }
    public int getWidth(){
        return dimension.width;
    }
    public int getHeight(){
        return dimension.height;
    }

    
}