//Abstract Interface
interface Shape{
    //void calculateArea(int x);
    void calculateArea(int x, int y);
    void display();
}


//Class Circle

class Circle implements Shape{
    double area;
    @Override
    public void calculateArea(int r, int ignore){
        area = Math.PI *(Math.pow(r, 2));
    }
   @Override
    public void display(){
       System.out.println(area);
    }
}

//Class Rectangle

class Rectangle implements Shape{
    double area;
    @Override
    public void calculateArea(int w, int l){
        area = w * l;
    }
   @Override
    public void display(){
       System.out.println(area);
    }
}

//Class Triangle

class Triangle implements Shape{
    double area;
    @Override
    public void calculateArea(int h, int b){
        area = (h*b)/2;
    }
   @Override
    public void display(){
       System.out.println(area);
    }
}


//Driver Class

public class A2Interface implements Shape{
    
    public static void main(String[] args){
        Circle c = new Circle();
        c.calculateArea(5,0);
        c.display();
        
        Rectangle r = new Rectangle();
        r.calculateArea(5, 4);
        r.display();
        
        Triangle t = new Triangle();
        t.calculateArea(8, 10);
        t.display();
    }
    //implements methods
    @Override
    public void calculateArea(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
