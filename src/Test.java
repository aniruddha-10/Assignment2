import java.util.Scanner;
public class Test
{
    public static void main(String[] args) throws Throwable
    {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter the coordinates of first point: ");
        double x1 = a.nextDouble();
        double y1 = a.nextDouble();
        var y = new Point(x1, y1);
        int id1 = y.pointID();

        System.out.println("Enter the coordinates of second point: ");
        double x2 = a.nextDouble();
        double y2 = a.nextDouble();
        var z = new Point(x2, y2);
        int id2 = z.pointID();

        System.out.println("Enter the coordinates of third point: ");
        double x3 = a.nextDouble();
        double y3 = a.nextDouble();
        var w = new Point(x3, y3);
        int id3 = w.pointID();

        System.out.println("Enter the values for delta x and delta y :");
        double delta_x = a.nextDouble();
        double delta_y = a.nextDouble();
        y.move(delta_x, delta_y);
        z.move(delta_x, delta_y);
        w.move(delta_x, delta_y);

        System.out.println();
        System.out.println("The three points are:");
        System.out.println("Point ID: "+ id1 + " Point: " + "(" + String.valueOf(y.getX()) + "," + String.valueOf(y.getY()) + ")");
        System.out.println("Point ID: "+ id2 + " Point: " + "(" + String.valueOf(z.getX()) + "," + String.valueOf(z.getY()) + ")");
        System.out.println("Point ID: "+ id3 + " Point: " + "(" + String.valueOf(w.getX()) + "," + String.valueOf(w.getY()) + ")");

        System.out.println("No. of active instances so far: " + Point.active());
        System.out.println();
        var x = new Point();
        int id4 = x.pointID();
        System.out.println("The fourth point created:");
        System.out.println("Point ID: "+ id4 + " Point: " + "(" + String.valueOf(x.getX()) + "," + String.valueOf(x.getY())+ ")");
        System.out.println();
        System.out.println("The distance between the new point and the first point is: " + x.distance(y.getX(),y.getY()));
        System.out.println("The distance between the new point and the second point is: " + x.distance(z.getX(),z.getY()));
        System.out.println("The distance between the new point and the third point is: " + Point.distance(x.getX(),x.getY(),w.getX(),w.getY()));
        System.out.println();
        var avgPoint = new Point((y.getX()+z.getX()+w.getX())/3,(y.getY()+z.getY()+w.getY())/3);
        System.out.println("Point ID: " + avgPoint.pointID() + " The new Point:" + "(" + avgPoint.getX() +","+avgPoint.getY() + ")" );
        System.out.println("No of Active Instances: " + Point.active());

        y.remove();
        System.gc();
        Thread.sleep(1000);

        z.remove();
        System.gc();
        Thread.sleep(1000);

        w.remove();
        System.gc();
        Thread.sleep(1000);

        System.out.println("Number of Active instances available now after garbage collection : " + Point.active());
    }
}