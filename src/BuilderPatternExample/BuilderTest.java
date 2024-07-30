package BuilderPatternExample;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
            .setCPU("Intel i7")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .build();
        System.out.println(computer); // Should print the details of the computer
    }
}