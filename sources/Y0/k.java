package Y0;

import Y.A1;
import Y.C1510r0;
import Y.o1;
import androidx.emoji2.text.f;
import kotlin.jvm.internal.C6496s;

final class k implements n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public A1 f10245a;

    public static final class a extends f.C0294f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1510r0 f10246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f10247b;

        a(C1510r0 r0Var, k kVar) {
            this.f10246a = r0Var;
            this.f10247b = kVar;
        }

        public void a(Throwable th2) {
            this.f10247b.f10245a = o.f10252a;
        }

        public void b() {
            this.f10246a.setValue(Boolean.TRUE);
            this.f10247b.f10245a = new p(true);
        }
    }

    public k() {
        A1 a12;
        if (f.k()) {
            a12 = c();
        } else {
            a12 = null;
        }
        this.f10245a = a12;
    }

    private final A1 c() {
        f c10 = f.c();
        if (c10.g() == 1) {
            return new p(true);
        }
        C1510r0 i10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
        c10.v(new a(i10, this));
        return i10;
    }

    public A1 a() {
        A1 a12 = this.f10245a;
        if (a12 != null) {
            C6496s.e(a12);
            return a12;
        } else if (!f.k()) {
            return o.f10252a;
        } else {
            A1 c10 = c();
            this.f10245a = c10;
            C6496s.e(c10);
            return c10;
        }
    }
}
