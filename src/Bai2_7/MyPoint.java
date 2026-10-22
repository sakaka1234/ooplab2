package Bai2_7;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] a = {this.x ,this.y};
        return a;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(int x , int y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        double dis = Math.sqrt(xDiff*xDiff + yDiff*yDiff);
        return dis;
    }

    public double distance(MyPoint another) {
        double xDiff = this.x - another.getX();
        double yDiff = this.y - another.getY();
        double dis = Math.sqrt(xDiff*xDiff + yDiff*yDiff);
        return dis;
    }

    public double distance() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }


}
