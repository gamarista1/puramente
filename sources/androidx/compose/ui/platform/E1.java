package androidx.compose.ui.platform;

import D0.C1128t;
import D0.N;
import Y.C1510r0;
import Y.o1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class E1 implements D1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13512b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C1510r0 f13513c = u1.d(N.a(C1128t.a()), (o1) null, 2, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f13514a = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public boolean a() {
        return ((Boolean) this.f13514a.getValue()).booleanValue();
    }

    public void b(int i10) {
        f13513c.setValue(N.a(i10));
    }

    public void c(boolean z10) {
        this.f13514a.setValue(Boolean.valueOf(z10));
    }
}
