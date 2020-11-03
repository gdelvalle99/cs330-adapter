public class Main {
    public static void main(String[] args){
        Guitar guitar = new Guitar();
        GuitarAdapter dance = new GuitarAdapter(guitar);
        dance.Step(DanceController.direction.LEFT);
    }
}