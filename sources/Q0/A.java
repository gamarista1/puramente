package Q0;

import kotlin.jvm.internal.C6496s;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final z f5158a;

    /* renamed from: b  reason: collision with root package name */
    private final y f5159b;

    public A(z zVar, y yVar) {
        this.f5158a = zVar;
        this.f5159b = yVar;
    }

    public final y a() {
        return this.f5159b;
    }

    public final z b() {
        return this.f5158a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        if (C6496s.c(this.f5159b, a10.f5159b) && C6496s.c(this.f5158a, a10.f5158a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        z zVar = this.f5158a;
        int i11 = 0;
        if (zVar != null) {
            i10 = zVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        y yVar = this.f5159b;
        if (yVar != null) {
            i11 = yVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f5158a + ", paragraphSyle=" + this.f5159b + ')';
    }

    public A(boolean z10) {
        this((z) null, new y(z10));
    }
}
