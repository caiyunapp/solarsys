package chrono.event.sun;

import chrono.event.Context;
import chrono.event.Instant;

public class SunSet implements Instant {

    @Override
    public long time() {
        return 0;
    }

    @Override
    public boolean check(Context ctx) {
        return false;
    }
}
