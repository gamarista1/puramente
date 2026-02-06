package E;

import Ef.i;
import Ef.m;
import Y.A1;
import Y.C1510r0;
import Y.p1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class B implements A1 {

    /* renamed from: e  reason: collision with root package name */
    private static final a f1538e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f1539a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1540b;

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f1541c;

    /* renamed from: d  reason: collision with root package name */
    private int f1542d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final i b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return m.u(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        private a() {
        }
    }

    public B(int i10, int i11, int i12) {
        this.f1539a = i11;
        this.f1540b = i12;
        this.f1541c = p1.h(f1538e.b(i10, i11, i12), p1.q());
        this.f1542d = i10;
    }

    private void k(i iVar) {
        this.f1541c.setValue(iVar);
    }

    /* renamed from: g */
    public i getValue() {
        return (i) this.f1541c.getValue();
    }

    public final void m(int i10) {
        if (i10 != this.f1542d) {
            this.f1542d = i10;
            k(f1538e.b(i10, this.f1539a, this.f1540b));
        }
    }
}
