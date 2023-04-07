public class Accountant implements Main2 {
    String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void setPosition() {
        System.out.println("Position: " + position);
    }
}