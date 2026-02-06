package W0;

import Ef.m;
import Q0.C1321d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: W0.a  reason: case insensitive filesystem */
public final class C1433a implements C1441i {

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f8545a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8546b;

    public C1433a(C1321d dVar, int i10) {
        this.f8545a = dVar;
        this.f8546b = i10;
    }

    public void a(C1444l lVar) {
        int i10;
        if (lVar.l()) {
            lVar.m(lVar.f(), lVar.e(), c());
        } else {
            lVar.m(lVar.k(), lVar.j(), c());
        }
        int g10 = lVar.g();
        int i11 = this.f8546b;
        if (i11 > 0) {
            i10 = (g10 + i11) - 1;
        } else {
            i10 = (g10 + i11) - c().length();
        }
        lVar.o(m.l(i10, 0, lVar.h()));
    }

    public final int b() {
        return this.f8546b;
    }

    public final String c() {
        return this.f8545a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1433a)) {
            return false;
        }
        C1433a aVar = (C1433a) obj;
        if (C6496s.c(c(), aVar.c()) && this.f8546b == aVar.f8546b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f8546b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.f8546b + ')';
    }

    public C1433a(String str, int i10) {
        this(new C1321d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i10);
    }
}
