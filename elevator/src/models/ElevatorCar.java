import enums.CartStatus;
import enums.Direction;

public class ElevatorCar {

    private String elevatorId;
    private Display display;
    private InternalButton internalButton;
    private CartStatus cartStatus;
    private Door door;

    public void move (int destinationFloor) {
        int currentFloor = display.getCurrentFloor();
        cartStatus = CartStatus.MOVING;
        if (destinationFloor > currentFloor) {
            display.setDirection(Direction.UP);
            for (int floor = currentFloor; floor <= destinationFloor; floor++) {
                System.out.println(display.toString());
            }
            
        } else if (destinationFloor < currentFloor) {
            display.setDirection(Direction.DOWN);
            for (int floor = currentFloor; floor >= destinationFloor; floor--) {
                System.out.println(display.toString());
            }
        }
        cartStatus = CartStatus.IDLE;
    }

    public void pressButton(int floorNumber) {
        
    }
}
