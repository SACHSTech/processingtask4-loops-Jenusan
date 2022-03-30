import processing.core.PApplet;

public class Sketch extends PApplet {
  // Initializing variables
  float fltLines;
  float fltCirclesX;
  float fltCirclesY;
  int intAngle;
  float angles = (float)Math.PI;
  float i = (float)Math.PI * 3 / 4;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  public void draw() {
    // Set stroke value to 0
    stroke(0);
    
    // Place 10 x 10 grid along top left quadrant 
    for(fltLines = width / 20; fltLines <= width / 2; fltLines += width / 20){
      line(fltLines, 0, fltLines, height / 2);
      line(0, fltLines, width / 2 , fltLines);
    }

    // Place 5 x 5 circles along top right quadrant 
    for(fltCirclesX = width * 55 / 100; fltCirclesX <= width; fltCirclesX += width / 10){
      for(fltCirclesY = height / 20; fltCirclesY <= height / 2; fltCirclesY += height /10){
        fill(102, 0, 153);
        ellipse(fltCirclesX, fltCirclesY , width / 12, width / 12);
      }
    }

    //create gradient in bottom left quadrant
    for(int i = 0; i <= width / 2; i++){
      stroke(i+ width / 255, i+ width / 255, i+ width / 255);
      line(i + width / 255, height /2 , i +  width / 255, height);
    }

    // 
    pushMatrix();
    translate(width * 3 / 4, height * 3 / 4);

    for(int flower = 1; flower <= 8; flower++){
      rotate(angles);
      ellipse(0,0, width /10, height / 3);

      angles = angles + i;

      if (angles >= 2 * Math.PI){
        angles = (float)Math.PI;
      }

    }
    popMatrix();

    fill(255,255,0);
    ellipse(width * 3 / 4, height * 3 / 4, width / 10, height / 10);
  

      }
    }

