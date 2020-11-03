public class DanceAdapter implements GuitarController{
    DanceController dance;

    public DanceAdapter(DanceController dance){
        this.dance = dance;
    }
    public void PressFretButton(colors button){
        if(button == GuitarController.colors.GREEN){
            dance.PressFretButton(GuitarController.colors.GREEN);
        }
        else if(button == DanceController.direction.LEFT){
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
    public void PressPick(){

    }
    public void PressTremelo(){
        
    }
}