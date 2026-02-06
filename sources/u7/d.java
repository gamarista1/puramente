package U7;

import com.facebook.react.bridge.WritableArray;

public interface d {
    void callIdleCallbacks(double d10);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
