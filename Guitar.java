public class Guitar implements GuitarController{
    public void PressFretButton(colors button){
        if(button == GuitarController.colors.GREEN){
            System.out.println("Green has been pressed!");
        }
        else if(button == GuitarController.colors.RED){
            System.out.println("Red has been pressed!");
        }
        else if(button == GuitarController.colors.BLUE){
            System.out.println("Blue has been pressed!");
        }
        else if(button == GuitarController.colors.YELLOW){
            System.out.println("Yellow has been pressed!");
        }
        else if(button == GuitarController.colors.ORANGE){
            System.out.println("Orange has been pressed!");
        }
    }
    public void PressPick(){
        System.out.println("Guitar has been picked!");
    }
    public void PressTremelo(){
        System.out.println("Tremelo has been used!");
    }
}