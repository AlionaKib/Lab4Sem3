package Functions;

/**
 * Created by Алена on 15.09.2018.
 */
public class FunctionPoint {
    private double x;
    private double y;

    public FunctionPoint (double x, double y){
        this.x = x;
        this.y = y;
    }

    public FunctionPoint(FunctionPoint o){
        this.x = o.x;
        this.y = o.y;
    }

    public FunctionPoint(){
        this.x = 0;
        this.y = 0;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
}
