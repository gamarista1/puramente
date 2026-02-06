package Q0;

import q0.C2423i;

public interface I {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5255a = a.f5256a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f5256a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final I f5257b = new F();

        /* renamed from: c  reason: collision with root package name */
        private static final I f5258c = new G();

        /* renamed from: d  reason: collision with root package name */
        private static final I f5259d = new H();

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean d(C2423i iVar, C2423i iVar2) {
            return iVar.r(iVar2);
        }

        /* access modifiers changed from: private */
        public static final boolean e(C2423i iVar, C2423i iVar2) {
            if (iVar2.q() || iVar.i() < iVar2.i() || iVar.j() > iVar2.j() || iVar.l() < iVar2.l() || iVar.e() > iVar2.e()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public static final boolean f(C2423i iVar, C2423i iVar2) {
            return iVar2.b(iVar.g());
        }

        public final I g() {
            return f5257b;
        }

        public final I h() {
            return f5259d;
        }
    }

    boolean a(C2423i iVar, C2423i iVar2);
}
