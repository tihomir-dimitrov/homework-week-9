import java.util.Random;

public class HeatManager {

    public class generateRandom{

        public void main(String args[])
        {
            Random rand = new Random();

            double rand_dub1 = rand.nextDouble();
            double rand_dub2 = rand.nextDouble();

            System.out.println("HeatEngine's Temperature : " +rand_dub1);
            System.out.println("WrapperEngine's Temperature: " +rand_dub2);
        }
    }
}
