public class Main {
    public static void main(String[] args){
        Guitar guitar = new Guitar();
        Dance dance = new Dance();
        GuitarAdapter danceInterface = new GuitarAdapter(guitar);
        danceInterface.Step(DanceController.direction.LEFT);
        DanceAdapter guitarInterface = new DanceAdapter(dance);
        guitarInterface.PressFretButton(GuitarController.colors.BLUE);
        
        
    }
}