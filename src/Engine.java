public class Engine {
    public void main(String[] args) {
        {
            double HP, weight, velocity;
            weight = 23;
            velocity = 34;
            HP = weight * Math.pow((velocity / 234), 3);
            HP = (double) Math.round(HP * 10000000) / 10000000;
            System.out.print("Weight :" + Math.round(weight));
            System.out.print("Velocity :" + Math.round(velocity));
            System.out.print("Horse Power (HP) :" + HP);
        }
    }
}
