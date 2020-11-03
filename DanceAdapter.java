public class DanceAdapter implements GuitarController{
    DanceController dance;

    public DanceAdapter(DanceController dance){
        this.dance = dance;
    }
    public void PressFretButton(colors button){
        if(button == GuitarController.colors.GREEN){
            dance.Step(DanceController.direction.LEFT);
        }
        else if(button == GuitarController.colors.RED){
            dance.Step(DanceController.direction.RIGHT);
        }
        else if(button == GuitarController.colors.BLUE){
            dance.Step(DanceController.direction.BACK);
        }
        else if(button == GuitarController.colors.YELLOW){
            dance.Step(DanceController.direction.FORWARD);
        }
        else if(button == GuitarController.colors.ORANGE){
            dance.Step(DanceController.direction.MIDDLE);
        }
    }
    public void PressPick(){
        throw new UnsupportedOperationException();
    }
    public void PressTremelo(){
        throw new UnsupportedOperationException();
    }
}