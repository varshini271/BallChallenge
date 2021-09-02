import processing.core.PApplet;

public class Circle4 extends PApplet {

    public static final int DIAMETER = 10;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 420;

    public static void main(String[] args) {
    PApplet.main("Circle4",args);}

    int x1=0,x2=0,x3=0,x4=0;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw() {
        circle1();
        circle2();
        circle3();
        circle4();
    }
    private void circle1() {
        ellipse(x1,HEIGHT/5,DIAMETER,DIAMETER);
        x1++;
    }
    private void circle2() {
        ellipse(x2,2*HEIGHT/5,DIAMETER,DIAMETER);
        x2+=2;
    } private void circle3() {
        ellipse(x3,3*HEIGHT/5,DIAMETER,DIAMETER);
        x3+=3;
    } private void circle4() {
        ellipse(x4,4*HEIGHT/5,DIAMETER,DIAMETER);
        x4+=4;
    }

}
