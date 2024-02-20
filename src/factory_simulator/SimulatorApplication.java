package factory_simulator;
import fr.tp.inf112.projects.canvas.controller.Controller;
import fr.tp.inf112.projects.canvas.view.CanvasViewer;
public class SimulatorApplication {
    public static void main(String[] args) {
        ChargingPoint chargingPoint1 = new ChargingPoint(13,13);
        Robot robot1 = new Robot(3,3,chargingPoint1 ,new Point (15,15));
        Robot robot2 = new Robot(10,10,chargingPoint1, new Point (20,20));
        Robot robot3 = new Robot(11,11,chargingPoint1, new Point (20,20));
        Puck puck1 = new Puck(7,7, true);
        Puck puck2 = new Puck(10,7,false);
        Area Packaging_area = new Area(0,0, new Dimension(10,10), "Packaging Area");
        Room room1 = new Room(0,0, new Dimension(30,10), "Stock Room");
        Room room2 = new Room(0,10, new Dimension(10,20), "Packing Room");
        Room room3 = new Room(30,10, new Dimension(20,10), "Delivery Room");
        Room room4 = new Room(20,10, new Dimension(30,10), "Sorting Room");
        Factory factory = new Factory("Lego Factory");
        factory.addComponent(room1);
        factory.addComponent(room2);
        factory.addComponent(room3);
        factory.addComponent(room4);
        factory.addComponent(Packaging_area);
        factory.addComponent(chargingPoint1);
        factory.addComponent(robot1);
        factory.addComponent(robot2);
        factory.addComponent(robot3);
        factory.addComponent(puck1);
        factory.addComponent(puck2);

        final Controller controller = new SimulatorController(factory);
        final CanvasViewer viewer = new CanvasViewer(controller);
        controller.addObserver(viewer);
    }
}
