package qe;

import Ff.d;
import Ff.p;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

public final class O implements p {

    /* renamed from: a  reason: collision with root package name */
    private final d f61395a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f61396b;

    /* renamed from: c  reason: collision with root package name */
    private final C6787a f61397c;

    /* renamed from: d  reason: collision with root package name */
    private p f61398d;

    public O(d dVar, boolean z10, C6787a aVar) {
        C6496s.h(dVar, "classifier");
        C6496s.h(aVar, "kTypeProvider");
        this.f61395a = dVar;
        this.f61396b = z10;
        this.f61397c = aVar;
    }

    private final p i() {
        if (this.f61398d == null) {
            this.f61398d = (p) this.f61397c.invoke();
        }
        p pVar = this.f61398d;
        C6496s.e(pVar);
        return pVar;
    }

    public List c() {
        return i().c();
    }

    public boolean e() {
        return this.f61396b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return C6496s.c(i(), obj);
        }
        O o10 = (O) obj;
        if (!C6496s.c(b(), o10.b()) || e() != o10.e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public d b() {
        return this.f61395a;
    }

    public List getAnnotations() {
        return i().getAnnotations();
    }

    public int hashCode() {
        return (b().hashCode() * 31) + Boolean.hashCode(e());
    }

    public String toString() {
        return i().toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(d dVar, boolean z10, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? false : z10, aVar);
    }
}
