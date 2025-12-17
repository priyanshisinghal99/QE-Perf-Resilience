import java.util.Random;

public class Activity10JavaMainMethod{

    public static void main(String[] args) {
        Random randomNo = new Random();
        int boys = randomNo.nextInt(200);
        System.out.println("Total number of boys: "+boys);
        int girls = randomNo.nextInt(200);
        System.out.println("Total number of girls: "+girls);
        for(int i = 0; i < boys; i++){
            Boy2 boy = new Boy2();
        }
        for(int i = 0; i < girls; i++){
            Girl girl = new Girl();
        }
        System.out.println(Human2.count);

    }
}