package S8;

import S8.e;
import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.core.content.c;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

public abstract class g {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1790m f33951a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1795s f33952b;

        /* renamed from: S8.g$a$a  reason: collision with other inner class name */
        public static final class C0553a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1790m f33953a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1795s f33954b;

            public C0553a(C1790m mVar, C1795s sVar) {
                this.f33953a = mVar;
                this.f33954b = sVar;
            }

            public void dispose() {
                this.f33953a.d(this.f33954b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1790m mVar, C1795s sVar) {
            super(1);
            this.f33951a = mVar;
            this.f33952b = sVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C6496s.h(m10, "$this$DisposableEffect");
            this.f33951a.a(this.f33952b);
            return new C0553a(this.f33951a, this.f33952b);
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1790m.a f33956b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33957c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, C1790m.a aVar2, int i10, int i11) {
            super(2);
            this.f33955a = aVar;
            this.f33956b = aVar2;
            this.f33957c = i10;
            this.f33958d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            g.b(this.f33955a, this.f33956b, mVar, M0.a(this.f33957c | 1), this.f33958d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void b(a aVar, C1790m.a aVar2, C1500m mVar, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        C6496s.h(aVar, "permissionState");
        C1500m h10 = mVar.h(-1770945943);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (h10.S(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !h10.i()) {
            if (i15 != 0) {
                aVar2 = C1790m.a.ON_RESUME;
            }
            if (C1506p.H()) {
                C1506p.Q(-1770945943, i12, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:74)");
            }
            h10.z(-899069829);
            if ((i12 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object A10 = h10.A();
            if (z10 || A10 == C1500m.f10026a.a()) {
                A10 = new f(aVar2, aVar);
                h10.r(A10);
            }
            C1795s sVar = (C1795s) A10;
            h10.R();
            C1790m lifecycle = ((C1798v) h10.m(X1.a.a())).getLifecycle();
            P.b(lifecycle, sVar, new a(lifecycle, sVar), h10, 72);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(aVar, aVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final void c(C1790m.a aVar, a aVar2, C1798v vVar, C1790m.a aVar3) {
        C6496s.h(aVar2, "$permissionState");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar3, "event");
        if (aVar3 == aVar && !C6496s.c(aVar2.getStatus(), e.b.f33948a)) {
            aVar2.c();
        }
    }

    public static final boolean d(Context context, String str) {
        C6496s.h(context, "<this>");
        C6496s.h(str, "permission");
        if (c.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }

    public static final Activity e(Context context) {
        C6496s.h(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C6496s.g(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean f(e eVar) {
        C6496s.h(eVar, "<this>");
        return C6496s.c(eVar, e.b.f33948a);
    }

    public static final boolean g(Activity activity, String str) {
        C6496s.h(activity, "<this>");
        C6496s.h(str, "permission");
        return androidx.core.app.b.k(activity, str);
    }
}
