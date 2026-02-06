package D0;

import androidx.collection.C1607v;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class B {

    /* renamed from: a  reason: collision with root package name */
    private final C1607v f1372a = new C1607v(0, 1, (DefaultConstructorMarker) null);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f1373a;

        /* renamed from: b  reason: collision with root package name */
        private final long f1374b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f1375c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1376d;

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f1375c;
        }

        public final long b() {
            return this.f1374b;
        }

        public final long c() {
            return this.f1373a;
        }

        private a(long j10, long j11, boolean z10, int i10) {
            this.f1373a = j10;
            this.f1374b = j11;
            this.f1375c = z10;
            this.f1376d = i10;
        }
    }

    public final void a() {
        this.f1372a.a();
    }

    public final C1116g b(C c10, P p10) {
        boolean z10;
        long j10;
        long j11;
        C1607v vVar = new C1607v(c10.b().size());
        List b10 = c10.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            D d10 = (D) b10.get(i10);
            a aVar = (a) this.f1372a.e(d10.d());
            if (aVar == null) {
                j11 = d10.k();
                j10 = d10.f();
                z10 = false;
                P p11 = p10;
            } else {
                long c11 = aVar.c();
                boolean a10 = aVar.a();
                j11 = c11;
                z10 = a10;
                j10 = p10.o(aVar.b());
            }
            vVar.j(d10.d(), new A(d10.d(), d10.k(), d10.f(), d10.b(), d10.h(), j11, j10, z10, false, d10.j(), d10.c(), d10.i(), d10.e(), (DefaultConstructorMarker) null));
            if (d10.b()) {
                C1607v vVar2 = this.f1372a;
                long d11 = d10.d();
                a aVar2 = r11;
                a aVar3 = new a(d10.k(), d10.g(), d10.b(), d10.j(), (DefaultConstructorMarker) null);
                vVar2.j(d11, aVar2);
            } else {
                this.f1372a.k(d10.d());
            }
        }
        return new C1116g(vVar, c10);
    }
}
