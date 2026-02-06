package o7;

import Sg.p;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.I;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public static final F f47103a = new F();

    public interface a {
        void a(String str);
    }

    private F() {
    }

    private final boolean b() {
        return I.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar) {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(I.l()).build();
        try {
            build.startConnection(new b(build, aVar));
        } catch (Exception unused) {
        }
    }

    public static final void d(a aVar) {
        C6496s.h(aVar, "callback");
        F f10 = f47103a;
        if (!f10.b()) {
            f10.c(aVar);
        }
    }

    /* access modifiers changed from: private */
    public final void e() {
        I.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f47104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f47105b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f47104a = installReferrerClient;
            this.f47105b = aVar;
        }

        public void onInstallReferrerSetupFinished(int i10) {
            if (!C4049a.d(this)) {
                if (i10 == 0) {
                    try {
                        ReferrerDetails installReferrer = this.f47104a.getInstallReferrer();
                        C6496s.g(installReferrer, "{\n                      …rer\n                    }");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (p.O(installReferrer2, "fb", false, 2, (Object) null) || p.O(installReferrer2, "facebook", false, 2, (Object) null))) {
                            this.f47105b.a(installReferrer2);
                        }
                        F.f47103a.e();
                    } catch (RemoteException unused) {
                        return;
                    }
                } else if (i10 == 2) {
                    try {
                        F.f47103a.e();
                    } catch (Throwable th2) {
                        C4049a.b(th2, this);
                        return;
                    }
                }
                try {
                    this.f47104a.endConnection();
                } catch (Exception unused2) {
                }
            }
        }

        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
