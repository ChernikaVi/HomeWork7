public class Main1 {
    public static void main(String[] args) {
        Director director = new Director("Director");
        director.setPosition();

        Worker worker = new Worker("Worker");
        worker.setPosition();

        Accountant accountant = new Accountant("Accountant");
        accountant.setPosition();
    }
}
