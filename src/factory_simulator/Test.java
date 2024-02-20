package factory_simulator;
public class Test {
    public static void main(String[] arg){
        ChargingPoint chargingPoint1 = new ChargingPoint(13,13);
        Robot robot1 = new Robot(0,0,chargingPoint1 ,new Point (15,15));
        Robot robot2 = new Robot(10,10,chargingPoint1, new Point (20,20));
        Robot robot3 = new Robot(11,11,chargingPoint1, new Point (20,20));
        Puck puck1 = new Puck(7,7, true);
        Puck puck2 = new Puck(7,7,false);
        Area Packaging_area = new Area(0,0, new Dimension(30,30), "Packaging Area");
        Room room1 = new Room(0,0, new Dimension(30,10), "Stock Room");
        Room room2 = new Room(0,10, new Dimension(10,20), "Packing Room");
        Room room3 = new Room(30,10, new Dimension(20,10), "Delivery Room");
        Room room4 = new Room(20,10, new Dimension(30,10), "Sorting Room");




        Packaging_area.addPuck(puck1);
        System.out.println (chargingPoint1);
        System.out.println (robot1);
        System.out.println (robot2);
        System.out.println (robot3);
        System.out.println (puck1);
        System.out.println (puck2);
        System.out.println (Packaging_area);
        

    }
}