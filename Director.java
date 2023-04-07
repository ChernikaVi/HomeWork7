public class Director implements Main2 {
    String position;

    public Director(String position) {
        this.position = position;
    }

    @Override
    public void setPosition() {
        System.out.println("Position: " + position);
    }
}