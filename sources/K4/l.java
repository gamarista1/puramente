package K4;

import L4.d;
import L4.e;
import L4.g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.adjust.sdk.AdjustConfig;
import com.bugsnag.android.C3230d1;
import com.bugsnag.android.C3247j0;
import com.bugsnag.android.C3259n0;
import com.bugsnag.android.E1;
import com.bugsnag.android.G;
import com.bugsnag.android.H;
import com.bugsnag.android.N;
import com.bugsnag.android.O;
import com.bugsnag.android.Q;
import com.bugsnag.android.S0;
import java.io.File;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import lf.v;
import lf.w;
import mf.C6565s;
import mf.Y;
import yf.C6787a;

public abstract class l {

    public static final class a extends e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationInfo f32393e;

        public a(ApplicationInfo applicationInfo) {
            this.f32393e = applicationInfo;
        }

        public Object e() {
            return h.f32346a.c(this.f32393e);
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f32394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f32395b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(G g10, Context context) {
            super(0);
            this.f32394a = g10;
            this.f32395b = context;
        }

        /* renamed from: a */
        public final File invoke() {
            File w10 = this.f32394a.w();
            if (w10 == null) {
                return this.f32395b.getCacheDir();
            }
            return w10;
        }
    }

    private static final d a(ApplicationInfo applicationInfo, b bVar) {
        Bundle bundle;
        String str = null;
        if (applicationInfo == null) {
            bundle = null;
        } else {
            bundle = applicationInfo.metaData;
        }
        if (bundle != null && bundle.containsKey("com.bugsnag.android.BUILD_UUID")) {
            String string = bundle.getString("com.bugsnag.android.BUILD_UUID");
            if (string == null) {
                string = String.valueOf(bundle.getInt("com.bugsnag.android.BUILD_UUID"));
            }
            if (string.length() > 0) {
                str = string;
            }
            return new g(str);
        } else if (applicationInfo == null) {
            return null;
        } else {
            t tVar = t.IO;
            a aVar = new a(applicationInfo);
            bVar.b(tVar, aVar);
            return aVar;
        }
    }

    public static final k b(G g10, d dVar, PackageInfo packageInfo, ApplicationInfo applicationInfo, Lazy lazy) {
        C3259n0 n0Var;
        Set set;
        if (g10.d()) {
            n0Var = g10.j().a();
        } else {
            n0Var = new C3259n0(false);
        }
        C3259n0 n0Var2 = n0Var;
        String a10 = g10.a();
        boolean d10 = g10.d();
        boolean e10 = g10.e();
        E1 C10 = g10.C();
        Set j12 = C6565s.j1(g10.h());
        Set k10 = g10.k();
        Set set2 = null;
        if (k10 == null) {
            set = null;
        } else {
            set = C6565s.j1(k10);
        }
        Set j13 = C6565s.j1(g10.y());
        String A10 = g10.A();
        String c10 = g10.c();
        Integer G10 = g10.G();
        String b10 = g10.b();
        Q g11 = g10.g();
        C3247j0 l10 = g10.l();
        boolean v10 = g10.v();
        boolean m10 = g10.m();
        long n10 = g10.n();
        S0 o10 = g10.o();
        C6496s.e(o10);
        int p10 = g10.p();
        int q10 = g10.q();
        int r10 = g10.r();
        int s10 = g10.s();
        int t10 = g10.t();
        long E10 = g10.E();
        Set i10 = g10.i();
        if (i10 != null) {
            set2 = C6565s.j1(i10);
        }
        return new k(a10, d10, n0Var2, e10, C10, j12, set, j13, set2, C6565s.j1(g10.D()), A10, dVar, c10, G10, b10, g11, l10, v10, n10, o10, p10, q10, r10, s10, t10, E10, lazy, g10.B(), g10.H(), m10, packageInfo, applicationInfo, C6565s.j1(g10.z()));
    }

    public static final boolean c(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("No Bugsnag API Key set");
        } else if (str.length() != 32) {
            return true;
        } else {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= str.length()) {
                    z10 = true;
                    break;
                }
                char charAt = str.charAt(i10);
                i10++;
                if (!Character.isDigit(charAt) && ('a' > charAt || charAt >= 'g')) {
                    break;
                }
            }
            return !z10;
        }
    }

    public static final k d(Context context, G g10, H h10, b bVar) {
        Object obj;
        Object obj2;
        Integer G10;
        e(g10.a());
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            v.a aVar = v.f71841b;
            obj = v.b(packageManager.getPackageInfo(packageName, 0));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        Integer num = null;
        if (v.g(obj)) {
            obj = null;
        }
        PackageInfo packageInfo = (PackageInfo) obj;
        try {
            obj2 = v.b(packageManager.getApplicationInfo(packageName, 128));
        } catch (Throwable th3) {
            v.a aVar3 = v.f71841b;
            obj2 = v.b(w.a(th3));
        }
        if (v.g(obj2)) {
            obj2 = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj2;
        if (g10.A() == null) {
            g10.d0((applicationInfo == null || (applicationInfo.flags & 2) == 0) ? AdjustConfig.ENVIRONMENT_PRODUCTION : "development");
        }
        if (g10.o() == null || C6496s.c(g10.o(), N.f38552a)) {
            if (!C6496s.c(AdjustConfig.ENVIRONMENT_PRODUCTION, g10.A())) {
                g10.V(N.f38552a);
            } else {
                g10.V(C3230d1.f38688a);
            }
        }
        if (g10.G() == null || ((G10 = g10.G()) != null && G10.intValue() == 0)) {
            if (packageInfo != null) {
                num = Integer.valueOf(packageInfo.versionCode);
            }
            g10.h0(num);
        }
        if (g10.y().isEmpty()) {
            g10.b0(Y.d(packageName));
        }
        d a10 = a(applicationInfo, bVar);
        if (g10.g() == null) {
            S0 o10 = g10.o();
            C6496s.e(o10);
            g10.P(new O(h10, o10));
        }
        return b(g10, a10, packageInfo, applicationInfo, C6531o.b(new b(g10, context)));
    }

    private static final void e(String str) {
        if (c(str)) {
            N.f38552a.e(C6496s.o("Invalid configuration. apiKey should be a 32-character hexademical string, got ", str));
        }
    }
}
