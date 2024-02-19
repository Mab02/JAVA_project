public class ProductionUnit extends Component{
    private int numberOfUnitToProduct;


    public ProductionUnit(int xcoord, int ycoord, Dimension dimension, int numberOfUnitToProduct){
		super( xcoord, ycoord, dimension);
	    this.id = "pr" + super.compteur;
        this.numberOfUnitToProduct = numberOfUnitToProduct;
    }

    public ProductionUnit(int xcoord, int ycoord, int numberOfUnitToProduct){
        this(xcoord, ycoord, new Dimension(5,5), numberOfUnitToProduct);
    }

    
}