
public class GuitarAdapter implements DanceController{
    GuitarController guitar;

    public GuitarAdapter(GuitarController guitar){
        this.guitar = guitar;
    }

    public void Step(direction dir){
        if(dir == DanceController.direction.RIGHT){
            guitar.PressFretButton(GuitarController.colors.GREEN);
            guitar.PressPick();
        }
        else if(dir == DanceController.direction.LEFT){
            guitar.PressFretButton(GuitarController.colors.RED);
            guitar.PressPick();
        }
        else if(dir == DanceController.direction.BACK){
            guitar.PressFretButton(GuitarController.colors.BLUE);
            guitar.PressPick();
        }
        else if(dir == DanceController.direction.FORWARD){
            guitar.PressFretButton(GuitarController.colors.YELLOW);
            guitar.PressPick();
        }
        else if(dir == DanceController.direction.MIDDLE){
            guitar.PressFretButton(GuitarController.colors.ORANGE);
            guitar.PressPick();
        }
    }

}