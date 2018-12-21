public class CompositeService{

    private MessageInterface serviceA;
    private MessageInterface serviceB;

    public CompositeService(MessageInterface messageInterface1, MessageInterface messageInterface2) {
        this.serviceA=messageInterface1;
        this.serviceB=messageInterface2;
    }


    public void sendMessage() {
        System.out.println("Call Composite-Service");
        serviceA.sendMessage();
        serviceB.sendMessage();
    }
}

