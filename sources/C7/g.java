package C7;

import java.util.concurrent.TimeUnit;

public abstract class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final long f30099a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f30100b;

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        f30099a = timeUnit.convert(20, TimeUnit.MILLISECONDS);
        f30100b = (float) timeUnit.convert(3, TimeUnit.SECONDS);
    }
}
