package exTend;
class shape{
    protected String name;
    public void paint(){
        draw();
    }
    public void draw(){
        System.out.println("shape");
    }
}
public class circle extends shape {
    public void draw(){
        System.out.println("circle");
    }
    public static void main(String[] args){
        shape b = new circle();
        b.paint();
    }
}
