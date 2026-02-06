package mh;

import ih.f;
import kh.C6475w;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import yf.p;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final C6475w f72114a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f72115b;

    /* synthetic */ class a extends C6494p implements p {
        a(Object obj) {
            super(2, obj, C.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean i(f fVar, int i10) {
            C6496s.h(fVar, "p0");
            return Boolean.valueOf(((C) this.receiver).e(fVar, i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i((f) obj, ((Number) obj2).intValue());
        }
    }

    public C(f fVar) {
        C6496s.h(fVar, "descriptor");
        this.f72114a = new C6475w(fVar, new a(this));
    }

    /* access modifiers changed from: private */
    public final boolean e(f fVar, int i10) {
        boolean z10;
        if (fVar.j(i10) || !fVar.g(i10).b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f72115b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f72115b;
    }

    public final void c(int i10) {
        this.f72114a.a(i10);
    }

    public final int d() {
        return this.f72114a.d();
    }
}
