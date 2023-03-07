public class Computer {
    private int screenSize; // in inches
    private int memory;// in gigabytes (GB)

    public Computer(int size, int mem){
        screenSize = size;
        memory = mem;
    }
    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }
}
