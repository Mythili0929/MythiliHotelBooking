import java.util.Random;

class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Random Integer: " + r.nextInt(100));
        System.out.println("Random Double: " + r.nextDouble());
        System.out.println("Random Boolean: " + r.nextBoolean());
    }
}