package vh;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: vh.a  reason: case insensitive filesystem */
public abstract class C6756a {

    /* renamed from: a  reason: collision with root package name */
    private final String f73683a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73684b;

    /* renamed from: c  reason: collision with root package name */
    private C6759d f73685c;

    /* renamed from: d  reason: collision with root package name */
    private long f73686d;

    public C6756a(String str, boolean z10) {
        C6496s.h(str, "name");
        this.f73683a = str;
        this.f73684b = z10;
        this.f73686d = -1;
    }

    public final boolean a() {
        return this.f73684b;
    }

    public final String b() {
        return this.f73683a;
    }

    public final long c() {
        return this.f73686d;
    }

    public final C6759d d() {
        return this.f73685c;
    }

    public final void e(C6759d dVar) {
        C6496s.h(dVar, "queue");
        C6759d dVar2 = this.f73685c;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f73685c = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues");
        }
    }

    public abstract long f();

    public final void g(long j10) {
        this.f73686d = j10;
    }

    public String toString() {
        return this.f73683a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6756a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
