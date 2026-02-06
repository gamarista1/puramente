package J0;

import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

public final class j0 implements n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f3882b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f3883c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C6798l f3884d = a.f3886a;

    /* renamed from: a  reason: collision with root package name */
    private final h0 f3885a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3886a = new a();

        a() {
            super(1);
        }

        public final void a(j0 j0Var) {
            if (j0Var.Y0()) {
                j0Var.b().A0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((j0) obj);
            return C6514M.f71813a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6798l a() {
            return j0.f3884d;
        }

        private b() {
        }
    }

    public j0(h0 h0Var) {
        this.f3885a = h0Var;
    }

    public boolean Y0() {
        return this.f3885a.v0().S1();
    }

    public final h0 b() {
        return this.f3885a;
    }
}
