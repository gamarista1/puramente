package A6;

import kotlin.jvm.internal.C6496s;
import sf.C6714a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final X5.a f29420a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29421b;

    public enum a {
        SUCCESS,
        NEAREST,
        MISSING;

        static {
            a[] a10;
            f29426e = C6714a.a(a10);
        }
    }

    public l(X5.a aVar, a aVar2) {
        C6496s.h(aVar2, "type");
        this.f29420a = aVar;
        this.f29421b = aVar2;
    }

    public final X5.a a() {
        return this.f29420a;
    }

    public final a b() {
        return this.f29421b;
    }
}
