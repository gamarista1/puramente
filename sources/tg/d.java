package Tg;

import java.util.concurrent.TimeUnit;
import sf.C6714a;

public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: a  reason: collision with root package name */
    private final TimeUnit f65184a;

    static {
        d[] a10;
        f65183j = C6714a.a(a10);
    }

    private d(TimeUnit timeUnit) {
        this.f65184a = timeUnit;
    }

    public final TimeUnit b() {
        return this.f65184a;
    }
}
