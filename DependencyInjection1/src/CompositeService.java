public class CompositeService implements MessageInterface {

    private ServiceA serviceA;
    private ServiceB serviceB;

    public CompositeService(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA=serviceA;
        this.serviceB=serviceB;
    }


    @Override
    public void sendMessage() {
        System.out.println("Call Composite-Service");
        serviceA.sendMessage();
        serviceB.sendMessage();
    }
}

