public class simpleMicrowave {
    private int time;
    private int power;

    public simpleMicrowave() {
        time = 0;
        power = 1;
    }

    public void addTime() {
        time += 30;
        System.out.println("Time has changed to " + time + " seconds.");
    }
  
    public void changePower() {
        power = (power == 1) ? 2 : 1;
        System.out.println("Power level has changed to " + power);
    }
  
    public void stop() {
        time = 0;
        power = 1;
        System.out.println("Microwave has stopped.\n");
    }
  
    public void start() {
        if (time > 0) {
            System.out.println("\nCooking for " + time + " seconds at level " + power + ".\n");
        } else {
            System.out.println("You need to set add some time.");
        }
    }

    public static void main(String[] args) {
        simpleMicrowave simple_microwave = new simpleMicrowave();

        System.out.println("Let's start cooking some food!\n");

        simple_microwave.addTime();
        simple_microwave.changePower();
        simple_microwave.addTime();
        simple_microwave.start();

        simple_microwave.stop();
        simple_microwave.addTime();
        simple_microwave.addTime();
        simple_microwave.addTime();
        simple_microwave.addTime();
        simple_microwave.start();
        simple_microwave.stop();
    }
}