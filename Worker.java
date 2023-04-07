public class Worker implements Main2 {

    String position;

    public Worker(String position) {
        this.position = position;
    }

    @Override
    public void setPosition() {
        System.out.println("Position: " + position);
    }
}