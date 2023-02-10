/**
 * Point class that initializes the x and y coordinates of the point with the given values as obtained from the user
 * The class also has a few getter and setter methods that return values and set the x and y coordinates respectively
 * The class also has methods to calculate distances between two points ( both an instance and class method is present to calculate the distance)
 * The class also a method for garbage collection which can be called in the Test.java class for forceful garbage collection
 */
public class Point
{
    private double x,y;
    public static int id = 0;
    private static int actives;

    /**
     * Constructor that initializes the instance variables
     * @param x this gets initialized to the instance variable x
     * @param y this gets initizlized to the instance variable y
     *
     */
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
        id++;
        actives++;
    }

    /**
     * Constructor that initializes the instance variables to 0.0
     */
    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
        id++;
        actives++;
    }

    /**
     * Setter method that initializes the individual instance variable to the parameter passed
     * @param x gets initialized to the instancce variable x
     */
    public void setX(double x)
    {
        this.x = x;
    }

    /**
     * Setter method that initializes the individual instance variable to the parameter passed
     * @param y gets initialized to the instancce variable y
     */
    public void setY(double y)
    {
        this.y = y;
    }

    /**
     * Setter method initializes both the instance variables to the parameters x and y together
     * @param x gets initialized to the instancce variable x
     * @param y gets initialized to the instancce variable y
     */
    public void setXY(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter method that returns the x coordinate of the point
     * @return value of the instance variable x
     */
    public double getX()
    {
        return x;
    }

    /**
     * Getter method that returns y coordinate of the point
     * @return value of the instance variable y
     */
    public double getY()
    {
        return y;
    }

    /**
     * SHifts the x and y coordinates of the point according to the value specified by the user
     * @param delta_x value that gets added to the x coordinate of the point
     * @param delta_y value that gets added to the y coordinate of the point
     */
    public void move(double delta_x,double delta_y)
    {
        x += delta_x;
        y += delta_y;
    }

    /**
     * Instance method named Distance that calculates the distance between the two points created.
     * @param x1 value of the x coordinate
     * @param y1 value of the y coordinate
     * @return returns the distance between the two points
     */
    public double distance(double x1, double y1)
    {
        return Math.sqrt(Math.pow((x1 - x),2) + Math.pow((y1-y),2));
    }

    /**
     * PointID method that basically returns the ID of each of the point created
     * @return returns integer value which basically represents the id of the point
     */
    public int pointID()
    {
        return id;
    }

    /**
     * Active method that returns the number of active instances that are present while execution of the program
     * @return returns an integer value that basically represents the number of active instances present in the program
     */
    public static int active()
    {
        return actives;
    }

    /**
     * Method that basically does the Garbage collection
     * @throws Throwable;
     */
    protected void remove() throws Throwable
    {
        super.finalize();
        actives--;
    }

    /**
     * Class method named Distance that basically calculates the distance between the two points entered as parameters in the method
     * @param x1 x coordinate of the first point
     * @param y1 y coordinate of the first point
     * @param x2 x coordinate of the second point
     * @param y2 y coordinate of the second point
     * @return returns basically the distance between the two points
     */
    public static double distance(double x1, double y1,double x2,double y2)
    {
        return Math.sqrt(Math.pow((x1 - x2),2)+Math.pow((y1-y2),2));
    }
}