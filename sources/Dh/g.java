package dh;

import Zg.D;
import java.util.concurrent.atomic.AtomicReferenceArray;

final class g extends D {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f67440e = new AtomicReferenceArray(f.f67439f);

    public g(long j10, g gVar, int i10) {
        super(j10, gVar, i10);
    }

    public int r() {
        return f.f67439f;
    }

    public void s(int i10, Throwable th2, qf.g gVar) {
        v().set(i10, f.f67438e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f66948c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f67440e;
    }
}
