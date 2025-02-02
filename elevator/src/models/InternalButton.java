import dispatcher.InternalDispatcher;

public class InternalButton {

    private InternalDispatcher internalDispatcher;

    public void pressButton(int floor) {
        internalDispatcher.submitInternalRequest(floor);
    }
}
