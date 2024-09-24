import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        // Set the window size to 800x600
        size(800, 600);
    }
     public void setup() {

        // Set the background color to light gray (RGB values for light gray)
        background(150, 150, 200);
        fill(153, 190, 130);
        rect(100, 50, 200, 100);
        fill(10, 5, 105);
        stroke(255, 105, 180);
        strokeWeight(5);
        
        // Draw a circle at position (400, 300) with a diameter of 100
        ellipse(400, 300, 100, 100);
        stroke(100, 105, 100);
        strokeWeight(3);
        line(200, 400, 600, 400);
        stroke(50, 105, 200);
        fill(10, 100, 105);
        triangle(600, 100, 700, 200, 400, 100);
        
    }

    // Main method to run the Processing sketch
    

}
