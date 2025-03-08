import javax.swing.*;   //Typical Swing applications do processing in response to an event generated from a user gesture.

public class App {

    //Main Method, creates the size of the frame
    public static void main(String[] args) throws Exception{
        int width = 568;
        int height = 850;

        //Import Class frame - a class in its library
        JFrame frame = new JFrame("BlobFish");
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Import Class BlobFish - a class I created
        BlobFish blobfish = new BlobFish();
        frame.add(blobfish);    //add the class Blobfish
        frame.pack();           //The header incorparte the height, so doing pack will make the window height bellow the header
        blobfish.requestFocus();
        frame.setVisible(true);
    }
}