public class Client {

    private CompositeService service;

    public Client(CompositeService service){
        this.service=service;
    }

    public void printMessages(){
        service.sendMessage();
    }
}
