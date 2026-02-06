package Hc;

import Ic.b;
import Jc.f;
import Zb.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.support.v4.media.session.c;
import bc.C4471d;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import ub.C5230g;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public static final B f50908a = new B();

    /* renamed from: b  reason: collision with root package name */
    private static final a f50909b;

    static {
        a i10 = new C4471d().j(C4300c.f50968a).k(true).i();
        C6496s.g(i10, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f50909b = i10;
    }

    private B() {
    }

    private final C4301d d(b bVar) {
        if (bVar == null) {
            return C4301d.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (bVar.a()) {
            return C4301d.COLLECTION_ENABLED;
        }
        return C4301d.COLLECTION_DISABLED;
    }

    public final A a(C5230g gVar, z zVar, f fVar, Map map, String str, String str2) {
        Map map2 = map;
        C6496s.h(gVar, "firebaseApp");
        C6496s.h(zVar, "sessionDetails");
        C6496s.h(fVar, "sessionsSettings");
        C6496s.h(map2, "subscribers");
        String str3 = str;
        C6496s.h(str3, "firebaseInstallationId");
        String str4 = str2;
        C6496s.h(str4, "firebaseAuthenticationToken");
        C4306i iVar = C4306i.SESSION_START;
        String b10 = zVar.b();
        String a10 = zVar.a();
        int c10 = zVar.c();
        long d10 = zVar.d();
        c.a(map2.get(b.a.PERFORMANCE));
        C4301d d11 = d((b) null);
        c.a(map2.get(b.a.CRASHLYTICS));
        return new A(iVar, new D(b10, a10, c10, d10, new C4302e(d11, d((b) null), fVar.b()), str3, str4), b(gVar));
    }

    public final C4299b b(C5230g gVar) {
        String valueOf;
        String str;
        C6496s.h(gVar, "firebaseApp");
        Context m10 = gVar.m();
        C6496s.g(m10, "firebaseApp.applicationContext");
        String packageName = m10.getPackageName();
        PackageInfo packageInfo = m10.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        String c10 = gVar.r().c();
        C6496s.g(c10, "firebaseApp.options.applicationId");
        String str3 = Build.MODEL;
        C6496s.g(str3, "MODEL");
        String str4 = Build.VERSION.RELEASE;
        C6496s.g(str4, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        C6496s.g(packageName, "packageName");
        String str5 = packageInfo.versionName;
        if (str5 == null) {
            str = str2;
        } else {
            str = str5;
        }
        String str6 = Build.MANUFACTURER;
        C6496s.g(str6, "MANUFACTURER");
        w wVar = w.f51047a;
        Context m11 = gVar.m();
        C6496s.g(m11, "firebaseApp.applicationContext");
        u d10 = wVar.d(m11);
        Context m12 = gVar.m();
        C6496s.g(m12, "firebaseApp.applicationContext");
        return new C4299b(c10, str3, "2.0.0", str4, tVar, new C4298a(packageName, str, str2, str6, d10, wVar.c(m12)));
    }

    public final a c() {
        return f50909b;
    }
}
