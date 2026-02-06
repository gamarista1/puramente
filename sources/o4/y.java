package o4;

import com.google.android.gms.common.api.a;
import k4.C3661c;
import k4.C3667i;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class y implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f47026a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public y(z zVar) {
    }

    public boolean a() {
        return u.f47015a.b((z) null);
    }

    public boolean b(C3667i iVar) {
        int i10;
        C3661c d10 = iVar.d();
        boolean z10 = d10 instanceof C3661c.a;
        int i11 = a.e.API_PRIORITY_OTHER;
        if (z10) {
            i10 = ((C3661c.a) d10).f45103a;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (i10 > 100) {
            C3661c c10 = iVar.c();
            if (c10 instanceof C3661c.a) {
                i11 = ((C3661c.a) c10).f45103a;
            }
            if (i11 > 100) {
                return true;
            }
        }
        return false;
    }
}
