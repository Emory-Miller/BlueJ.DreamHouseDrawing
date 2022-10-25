
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square grass;
    private Square window2;
    private Square chimney1;
    private Square chimney2;
    private Square door1;
    private Square door2;
    private Circle doorknob;
    private Square tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle tree4;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Circle cloud4;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(480);
        sun.moveVertical(100);
        sun.changeSize(80);
        sun.makeVisible();
        
        cloud1 = new Circle();
        cloud1.changeColor("white");
        cloud1.moveHorizontal(280);
        cloud1.moveVertical(-10);
        cloud1.changeSize(40);
        cloud1.makeVisible();
        
        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(240);
        cloud2.moveVertical(-30);
        cloud2.changeSize(60);
        cloud2.makeVisible();
        
        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveHorizontal(220);
        cloud3.moveVertical(-20);
        cloud3.changeSize(40);
        cloud3.makeVisible();
        
        cloud4 = new Circle();
        cloud4.changeColor("white");
        cloud4.moveHorizontal(225);
        cloud4.moveVertical(-10);
        cloud4.changeSize(50);
        cloud4.makeVisible();
        
        grass = new Square();
        grass.moveVertical(150);
        grass.moveHorizontal(-60);
        grass.changeSize(600);
        grass.changeColor("green");
        grass.makeVisible();
        
        
        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        
        chimney1 = new Square();
        chimney1.changeColor("black");
        chimney1.moveHorizontal(10);
        chimney1.moveVertical(50);
        chimney1.makeVisible();
        
        chimney2 = new Square();
        chimney2.changeColor("black");
        chimney2.moveHorizontal(10);
        chimney2.moveVertical(25);
        chimney2.makeVisible();
        
        door1 = new Square();
        door1.changeColor("black");
        door1.moveHorizontal(35);
        door1.moveVertical(155);
        door1.makeVisible();
        door1.changeSize(25);
        
        door2 = new Square();
        door2.changeColor("black");
        door2.moveHorizontal(35);
        door2.moveVertical(140);
        door2.makeVisible();
        door2.changeSize(25);
        
        doorknob = new Circle();
        doorknob.changeColor("red");
        doorknob.moveHorizontal(90);
        doorknob.moveVertical(145);
        doorknob.makeVisible();
        doorknob.changeSize(5);

        
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();
        window.changeSize(25);

        window2 = new Square();
        window2.changeColor("blue");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
        window2.changeSize(25);
        
        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.changeColor("black");
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        tree1 = new Square();
        tree1.changeColor("black");
        tree1.moveHorizontal(300);
        tree1.moveVertical(140);
        tree1.changeSize(20);
        tree1.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeColor("green");
        tree2.moveHorizontal(320);
        tree2.moveVertical(130);
        tree2.makeVisible();
        tree2.changeSize(50,40);
        
        tree3 = new Triangle();
        tree3.changeColor("green");
        tree3.moveHorizontal(320);
        tree3.moveVertical(110);
        tree3.makeVisible();
        tree3.changeSize(50,40);
        
        tree3 = new Triangle();
        tree3.changeColor("green");
        tree3.moveHorizontal(320);
        tree3.moveVertical(90);
        tree3.makeVisible();
        tree3.changeSize(50,40);

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("gray");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
