package S9;

import java.io.IOException;

public final class r extends IOException {
    public r(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
