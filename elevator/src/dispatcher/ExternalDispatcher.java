public abstract class ExternalDispatcher {
    
    private List<ElevatorController> elevatorControllerList;

    public abstract void SubmitExternalRequest(int floor, Direction direction);
}
