import java.awt.Color;
public class Editor4 {
    public static void main(String[] args) {
        String filename = args[0];
        int steps = Integer.parseInt(args[1]);

        // Read the original image
        Color[][] originalImage = Runigram.read(filename);

        // Create the greyscaled version of the original image
        Color[][] greyscaledImage = Runigram.grayScaled(originalImage);

        // Prepare the canvas for displaying the morphing process
        Runigram.setCanvas(originalImage);

        // Perform and display the morphing process
        Runigram.morph(originalImage, greyscaledImage, steps);
    }
    
}
