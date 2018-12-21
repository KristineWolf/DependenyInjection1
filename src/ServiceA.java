public class ServiceA implements MessageInterface {
    @Override
    public void sendMessage() {
        System.out.println("Call Service A");
    }
}
