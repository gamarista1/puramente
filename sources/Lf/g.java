package Lf;

import Eg.f;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;

public final class g extends i {

    /* renamed from: h  reason: collision with root package name */
    public static final a f63871h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Lazy f63872i = C6531o.b(f.f63870a);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return (g) g.f63872i.getValue();
        }

        private a() {
        }
    }

    public g(boolean z10) {
        super(new f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    /* access modifiers changed from: private */
    public static final g F0() {
        return new g(false, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
