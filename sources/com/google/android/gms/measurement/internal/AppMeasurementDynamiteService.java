package com.google.android.gms.measurement.internal;

import Ha.C4294a;
import Ha.C4295b;
import Pa.r;
import Pa.t;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.C1587a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzdo;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzde {

    /* renamed from: a  reason: collision with root package name */
    E2 f54447a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map f54448b = new C1587a();

    class a implements t {

        /* renamed from: a  reason: collision with root package name */
        private zzdh f54449a;

        a(zzdh zzdh) {
            this.f54449a = zzdh;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f54449a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                E2 e22 = AppMeasurementDynamiteService.this.f54447a;
                if (e22 != null) {
                    e22.zzj().G().b("Event listener threw exception", e10);
                }
            }
        }
    }

    class b implements r {

        /* renamed from: a  reason: collision with root package name */
        private zzdh f54451a;

        b(zzdh zzdh) {
            this.f54451a = zzdh;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f54451a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                E2 e22 = AppMeasurementDynamiteService.this.f54447a;
                if (e22 != null) {
                    e22.zzj().G().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    private final void r1() {
        if (this.f54447a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void s1(zzdg zzdg, String str) {
        r1();
        this.f54447a.G().N(zzdg, str);
    }

    public void beginAdUnitExposure(String str, long j10) {
        r1();
        this.f54447a.t().u(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        r1();
        this.f54447a.C().b0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        r1();
        this.f54447a.C().V((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) {
        r1();
        this.f54447a.t().y(str, j10);
    }

    public void generateEventId(zzdg zzdg) {
        r1();
        long M02 = this.f54447a.G().M0();
        r1();
        this.f54447a.G().L(zzdg, M02);
    }

    public void getAppInstanceId(zzdg zzdg) {
        r1();
        this.f54447a.zzl().y(new V2(this, zzdg));
    }

    public void getCachedAppInstanceId(zzdg zzdg) {
        r1();
        s1(zzdg, this.f54447a.C().p0());
    }

    public void getConditionalUserProperties(String str, String str2, zzdg zzdg) {
        r1();
        this.f54447a.zzl().y(new N4(this, zzdg, str, str2));
    }

    public void getCurrentScreenClass(zzdg zzdg) {
        r1();
        s1(zzdg, this.f54447a.C().q0());
    }

    public void getCurrentScreenName(zzdg zzdg) {
        r1();
        s1(zzdg, this.f54447a.C().r0());
    }

    public void getGmpAppId(zzdg zzdg) {
        r1();
        s1(zzdg, this.f54447a.C().s0());
    }

    public void getMaxUserProperties(String str, zzdg zzdg) {
        r1();
        this.f54447a.C();
        C4643k3.y(str);
        r1();
        this.f54447a.G().K(zzdg, 25);
    }

    public void getSessionId(zzdg zzdg) {
        r1();
        this.f54447a.C().L(zzdg);
    }

    public void getTestFlag(zzdg zzdg, int i10) {
        r1();
        if (i10 == 0) {
            this.f54447a.G().N(zzdg, this.f54447a.C().t0());
        } else if (i10 == 1) {
            this.f54447a.G().L(zzdg, this.f54447a.C().o0().longValue());
        } else if (i10 == 2) {
            B5 G10 = this.f54447a.G();
            double doubleValue = this.f54447a.C().m0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzdg.zza(bundle);
            } catch (RemoteException e10) {
                G10.f55074a.zzj().G().b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            this.f54447a.G().K(zzdg, this.f54447a.C().n0().intValue());
        } else if (i10 == 4) {
            this.f54447a.G().P(zzdg, this.f54447a.C().l0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, zzdg zzdg) {
        r1();
        this.f54447a.zzl().y(new O3(this, zzdg, str, str2, z10));
    }

    public void initForTests(Map map) {
        r1();
    }

    public void initialize(C4294a aVar, zzdo zzdo, long j10) {
        E2 e22 = this.f54447a;
        if (e22 == null) {
            this.f54447a = E2.a((Context) C4536s.l((Context) C4295b.b(aVar)), zzdo, Long.valueOf(j10));
        } else {
            e22.zzj().G().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzdg zzdg) {
        r1();
        this.f54447a.zzl().y(new C4665n4(this, zzdg));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        r1();
        this.f54447a.C().d0(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzdg zzdg, long j10) {
        Bundle bundle2;
        r1();
        C4536s.f(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f54447a.zzl().y(new C4716w2(this, zzdg, new D(str2, new C(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, C4294a aVar, C4294a aVar2, C4294a aVar3) {
        Object obj;
        Object obj2;
        r1();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = C4295b.b(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C4295b.b(aVar2);
        }
        if (aVar3 != null) {
            obj3 = C4295b.b(aVar3);
        }
        this.f54447a.zzj().u(i10, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C4294a aVar, Bundle bundle, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivityCreated((Activity) C4295b.b(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C4294a aVar, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivityDestroyed((Activity) C4295b.b(aVar));
        }
    }

    public void onActivityPaused(C4294a aVar, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivityPaused((Activity) C4295b.b(aVar));
        }
    }

    public void onActivityResumed(C4294a aVar, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivityResumed((Activity) C4295b.b(aVar));
        }
    }

    public void onActivitySaveInstanceState(C4294a aVar, zzdg zzdg, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        Bundle bundle = new Bundle();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivitySaveInstanceState((Activity) C4295b.b(aVar), bundle);
        }
        try {
            zzdg.zza(bundle);
        } catch (RemoteException e10) {
            this.f54447a.zzj().G().b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(C4294a aVar, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivityStarted((Activity) C4295b.b(aVar));
        }
    }

    public void onActivityStopped(C4294a aVar, long j10) {
        r1();
        Application.ActivityLifecycleCallbacks j02 = this.f54447a.C().j0();
        if (j02 != null) {
            this.f54447a.C().w0();
            j02.onActivityStopped((Activity) C4295b.b(aVar));
        }
    }

    public void performAction(Bundle bundle, zzdg zzdg, long j10) {
        r1();
        zzdg.zza((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzdh zzdh) {
        t tVar;
        r1();
        synchronized (this.f54448b) {
            try {
                tVar = (t) this.f54448b.get(Integer.valueOf(zzdh.zza()));
                if (tVar == null) {
                    tVar = new a(zzdh);
                    this.f54448b.put(Integer.valueOf(zzdh.zza()), tVar);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f54447a.C().F(tVar);
    }

    public void resetAnalyticsData(long j10) {
        r1();
        this.f54447a.C().C(j10);
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        r1();
        if (bundle == null) {
            this.f54447a.zzj().B().a("Conditional user property must not be null");
        } else {
            this.f54447a.C().H0(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) {
        r1();
        this.f54447a.C().Q0(bundle, j10);
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        r1();
        this.f54447a.C().V0(bundle, j10);
    }

    public void setCurrentScreen(C4294a aVar, String str, String str2, long j10) {
        r1();
        this.f54447a.D().C((Activity) C4295b.b(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z10) {
        r1();
        this.f54447a.C().U0(z10);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        r1();
        this.f54447a.C().P0(bundle);
    }

    public void setEventInterceptor(zzdh zzdh) {
        r1();
        b bVar = new b(zzdh);
        if (this.f54447a.zzl().E()) {
            this.f54447a.C().E(bVar);
        } else {
            this.f54447a.zzl().y(new C4676p3(this, bVar));
        }
    }

    public void setInstanceIdProvider(zzdm zzdm) {
        r1();
    }

    public void setMeasurementEnabled(boolean z10, long j10) {
        r1();
        this.f54447a.C().V(Boolean.valueOf(z10));
    }

    public void setMinimumSessionDuration(long j10) {
        r1();
    }

    public void setSessionTimeoutDuration(long j10) {
        r1();
        this.f54447a.C().O0(j10);
    }

    public void setSgtmDebugInfo(Intent intent) {
        r1();
        this.f54447a.C().G(intent);
    }

    public void setUserId(String str, long j10) {
        r1();
        this.f54447a.C().X(str, j10);
    }

    public void setUserProperty(String str, String str2, C4294a aVar, boolean z10, long j10) {
        r1();
        this.f54447a.C().g0(str, str2, C4295b.b(aVar), z10, j10);
    }

    public void unregisterOnMeasurementEventListener(zzdh zzdh) {
        t tVar;
        r1();
        synchronized (this.f54448b) {
            tVar = (t) this.f54448b.remove(Integer.valueOf(zzdh.zza()));
        }
        if (tVar == null) {
            tVar = new a(zzdh);
        }
        this.f54447a.C().F0(tVar);
    }
}
