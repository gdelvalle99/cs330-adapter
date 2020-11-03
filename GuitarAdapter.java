
public class GuitarAdapter implements DanceController{
    GuitarController guitar;

    public GuitarAdapter(GuitarController guitar){
        this.guitar = guitar;
    }

    public void Step(direction dir){
        if(dir == DanceController.direction.RIGHT){
            guitar.PressFretButton(GuitarController.colors.GREEN);
        }
        else if(dir == DanceController.direction.LEFT){
            guitar.PressFretButton(GuitarController.colors.RED);
        }
        else if(dir == DanceController.direction.BACK){
            guitar.PressFretButton(GuitarController.colors.BLUE);
        }
        else if(dir == DanceController.direction.FORWARD){
            guitar.PressFretButton(GuitarController.colors.YELLOW);
        }
        else if(dir == DanceController.direction.MIDDLE){
            guitar.PressFretButton(GuitarController.colors.ORANGE);
        }
    }
}