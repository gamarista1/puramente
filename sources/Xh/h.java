package xh;

import Gh.C5406g;
import kotlin.jvm.internal.C6496s;
import rh.F;
import rh.y;

public final class h extends F {

    /* renamed from: c  reason: collision with root package name */
    private final String f73892c;

    /* renamed from: d  reason: collision with root package name */
    private final long f73893d;

    /* renamed from: e  reason: collision with root package name */
    private final C5406g f73894e;

    public h(String str, long j10, C5406g gVar) {
        C6496s.h(gVar, "source");
        this.f73892c = str;
        this.f73893d = j10;
        this.f73894e = gVar;
    }

    public long o() {
        return this.f73893d;
    }

    public y q() {
        String str = this.f73892c;
        if (str != null) {
            return y.f73499e.b(str);
        }
        return null;
    }

    public C5406g y() {
        return this.f73894e;
    }
}
