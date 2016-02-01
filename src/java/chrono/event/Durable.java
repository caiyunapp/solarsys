package chrono.event;


public interface Durable extends Event {

    public long starttime();
    public long endtime();

}
