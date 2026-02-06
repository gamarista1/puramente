package S8;

import Y.C1500m;
import Y.C1506p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public abstract class d {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33946a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C6514M.f71813a;
        }

        public final void invoke(boolean z10) {
        }
    }

    public static final c a(String str, C6798l lVar, C1500m mVar, int i10, int i11) {
        C6496s.h(str, "permission");
        mVar.z(923020361);
        if ((i11 & 2) != 0) {
            lVar = a.f33946a;
        }
        if (C1506p.H()) {
            C1506p.Q(923020361, i10, -1, "com.google.accompanist.permissions.rememberPermissionState (PermissionState.kt:36)");
        }
        a a10 = b.a(str, lVar, mVar, i10 & 126, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.R();
        return a10;
    }
}
