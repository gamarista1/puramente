package rc;

import Ac.f;
import Ac.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import ic.C5027b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jc.C5046e;
import ub.C5230g;
import uc.C5233a;
import uc.b;
import vc.C5254g;
import zc.C5313k;

public class e {

    /* renamed from: i  reason: collision with root package name */
    private static final C5233a f61567i = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Map f61568a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f61569b;

    /* renamed from: c  reason: collision with root package name */
    private final f f61570c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f61571d = null;

    /* renamed from: e  reason: collision with root package name */
    private final C5230g f61572e;

    /* renamed from: f  reason: collision with root package name */
    private final C5027b f61573f;

    /* renamed from: g  reason: collision with root package name */
    private final C5046e f61574g;

    /* renamed from: h  reason: collision with root package name */
    private final C5027b f61575h;

    e(C5230g gVar, C5027b bVar, C5046e eVar, C5027b bVar2, RemoteConfigManager remoteConfigManager, a aVar, SessionManager sessionManager) {
        this.f61572e = gVar;
        this.f61573f = bVar;
        this.f61574g = eVar;
        this.f61575h = bVar2;
        if (gVar == null) {
            this.f61571d = Boolean.FALSE;
            this.f61569b = aVar;
            this.f61570c = new f(new Bundle());
            return;
        }
        C5313k.k().r(gVar, eVar, bVar2);
        Context m10 = gVar.m();
        f a10 = a(m10);
        this.f61570c = a10;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f61569b = aVar;
        aVar.Q(a10);
        aVar.O(m10);
        sessionManager.setApplicationContext(m10);
        this.f61571d = aVar.j();
        C5233a aVar2 = f61567i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{b.b(gVar.r().g(), m10.getPackageName())}));
        }
    }

    private static f a(Context context) {
        Bundle bundle;
        f fVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            fVar = new f();
        }
        return fVar;
    }

    public static e c() {
        return (e) C5230g.o().k(e.class);
    }

    public static Trace h(String str) {
        Trace c10 = Trace.c(str);
        c10.start();
        return c10;
    }

    public Map b() {
        return new HashMap(this.f61568a);
    }

    public boolean d() {
        Boolean bool = this.f61571d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C5230g.o().x();
    }

    public C5254g e(String str, String str2) {
        return new C5254g(str, str2, C5313k.k(), new l());
    }

    public Trace f(String str) {
        return Trace.c(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void g(java.lang.Boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            ub.C5230g.o()     // Catch:{ IllegalStateException -> 0x0054 }
            com.google.firebase.perf.config.a r0 = r1.f61569b     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r0 = r0.i()     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x001b
            uc.a r2 = f61567i     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "Firebase Performance is permanently disabled"
            r2.f(r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            goto L_0x0052
        L_0x001b:
            com.google.firebase.perf.config.a r0 = r1.f61569b     // Catch:{ all -> 0x0019 }
            r0.P(r2)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0025
            r1.f61571d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x002d
        L_0x0025:
            com.google.firebase.perf.config.a r2 = r1.f61569b     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r2 = r2.j()     // Catch:{ all -> 0x0019 }
            r1.f61571d = r2     // Catch:{ all -> 0x0019 }
        L_0x002d:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r0 = r1.f61571d     // Catch:{ all -> 0x0019 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x003f
            uc.a r2 = f61567i     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "Firebase Performance is Enabled"
            r2.f(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x0050
        L_0x003f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0019 }
            java.lang.Boolean r0 = r1.f61571d     // Catch:{ all -> 0x0019 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0050
            uc.a r2 = f61567i     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "Firebase Performance is Disabled"
            r2.f(r0)     // Catch:{ all -> 0x0019 }
        L_0x0050:
            monitor-exit(r1)
            return
        L_0x0052:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x0054:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.e.g(java.lang.Boolean):void");
    }
}
