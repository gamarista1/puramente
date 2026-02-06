package W0;

import Ef.m;
import Q0.C1321d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class O implements C1441i {

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f8501a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8502b;

    public O(C1321d dVar, int i10) {
        this.f8501a = dVar;
        this.f8502b = i10;
    }

    public void a(C1444l lVar) {
        int i10;
        if (lVar.l()) {
            int f10 = lVar.f();
            lVar.m(lVar.f(), lVar.e(), c());
            if (c().length() > 0) {
                lVar.n(f10, c().length() + f10);
            }
        } else {
            int k10 = lVar.k();
            lVar.m(lVar.k(), lVar.j(), c());
            if (c().length() > 0) {
                lVar.n(k10, c().length() + k10);
            }
        }
        int g10 = lVar.g();
        int i11 = this.f8502b;
        if (i11 > 0) {
            i10 = (g10 + i11) - 1;
        } else {
            i10 = (g10 + i11) - c().length();
        }
        lVar.o(m.l(i10, 0, lVar.h()));
    }

    public final int b() {
        return this.f8502b;
    }

    public final String c() {
        return this.f8501a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        if (C6496s.c(c(), o10.c()) && this.f8502b == o10.f8502b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f8502b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f8502b + ')';
    }

    public O(String str, int i10) {
        this(new C1321d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i10);
    }
}
