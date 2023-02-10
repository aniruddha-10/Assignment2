public class Point
{
    private double x,y;
    public static int id = 0;
    private static int actives;
    public Point(double x,double y)
    {
        this.x = x;
        this.y = y;
        id++;
        actives++;
    }
    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
        id++;
        actives++;
    }

    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY() {
        return y;
    }
    public void move(double delta_x,double delta_y)
    {
        x += delta_x;
        y += delta_y;
    }
    public double distance(double x1, double y1)
    {
        return Math.sqrt(Math.pow((x1 - x),2) + Math.pow((y1-y),2));
    }
    public int pointID()
    {
        return id;
    }

    public static int active()
    {
        return actives;
    }
    protected void remove() throws Throwable
    {
        super.finalize();
        actives--;
    }
    public static double distance(double x1, double y1,double x2,double y2)
    {
        return Math.sqrt(Math.pow((x1 - x2),2)+Math.pow((y1-y2),2));
    }
}