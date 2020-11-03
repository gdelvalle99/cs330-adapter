public class Dance implements DanceController{
    public void Step(direction dir){
        if(dir == DanceController.direction.RIGHT){
            System.out.println("Right has been pressed!");
        }
        else if(dir == DanceController.direction.LEFT){
            System.out.println("Left has been pressed!");
        }
        else if(dir == DanceController.direction.BACK){
            System.out.println("Back has been pressed!");
        }
        else if(dir == DanceController.direction.FORWARD){
            System.out.println("Forward has been pressed!");
        }
        else if(dir == DanceController.direction.MIDDLE){
            System.out.println("Middle has been pressed!");
        }
    }
}