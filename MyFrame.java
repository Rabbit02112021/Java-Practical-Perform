import java.awt.*;

public  class MyFrame  extends Frame {
    MyFrame(){
        Label l = new Label("Hello World");
        add(l);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String args[]){
        new MyFrame();
    }
}