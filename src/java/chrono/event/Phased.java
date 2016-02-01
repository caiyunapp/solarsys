package chrono.event;

public interface Phased extends Durable {

    public Event subeventOf(int i);

}
