package le;

import ie.r;
import kotlin.jvm.internal.C6496s;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f61064a;

    /* renamed from: b  reason: collision with root package name */
    private r f61065b;

    /* renamed from: c  reason: collision with root package name */
    private r f61066c;

    public i(String str) {
        C6496s.h(str, "name");
        this.f61064a = str;
    }

    public final h a() {
        return new h(this.f61064a, this.f61065b, this.f61066c);
    }

    public final void b(r rVar) {
        this.f61065b = rVar;
    }

    public final void c(r rVar) {
        this.f61066c = rVar;
    }
}
