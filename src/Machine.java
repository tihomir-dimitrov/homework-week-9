import java.awt.*;

public class Machine {

    public class Power {
        public void main(String args[]) {
            double a = 30;
            double b = 2;
            System.out.println(Math.pow(a, b));
            System.out.print("Power of the machine:" +Math.pow(a,b));
        }
    }

    public class Machine1 {
        private int width;
        private int height;

        public void paint(Graphics gr) {
            int width = getWidth();
            int height = getHeight();
            int radius;

            if (width < height)
                radius = 2 * width / 5;
            else
                radius = 2 * height / 5;

            gr.setColor(Color.white);
            gr.fillRect(0, 0, width, height);
            gr.setColor(Color.black);

            gr.drawOval((width / 2 - radius), (height / 2 - radius), radius * 2, radius * 2);
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }
}
