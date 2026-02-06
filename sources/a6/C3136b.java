package a6;

import T5.d;
import java.util.concurrent.TimeUnit;

/* renamed from: a6.b  reason: case insensitive filesystem */
public interface C3136b {
    @d
    long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @d
    long nowNanos();
}
