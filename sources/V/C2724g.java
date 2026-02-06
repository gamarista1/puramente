package v;

import k0.c;
import kotlin.jvm.internal.C6496s;
import w.C2763G;
import yf.C6798l;

/* renamed from: v.g  reason: case insensitive filesystem */
public final class C2724g {

    /* renamed from: a  reason: collision with root package name */
    private final c f26864a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f26865b;

    /* renamed from: c  reason: collision with root package name */
    private final C2763G f26866c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f26867d;

    public C2724g(c cVar, C6798l lVar, C2763G g10, boolean z10) {
        this.f26864a = cVar;
        this.f26865b = lVar;
        this.f26866c = g10;
        this.f26867d = z10;
    }

    public final c a() {
        return this.f26864a;
    }

    public final C2763G b() {
        return this.f26866c;
    }

    public final boolean c() {
        return this.f26867d;
    }

    public final C6798l d() {
        return this.f26865b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2724g)) {
            return false;
        }
        C2724g gVar = (C2724g) obj;
        if (C6496s.c(this.f26864a, gVar.f26864a) && C6496s.c(this.f26865b, gVar.f26865b) && C6496s.c(this.f26866c, gVar.f26866c) && this.f26867d == gVar.f26867d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f26864a.hashCode() * 31) + this.f26865b.hashCode()) * 31) + this.f26866c.hashCode()) * 31) + Boolean.hashCode(this.f26867d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f26864a + ", size=" + this.f26865b + ", animationSpec=" + this.f26866c + ", clip=" + this.f26867d + ')';
    }
}
