package wc;

import Bc.c;
import uc.C5233a;

/* renamed from: wc.a  reason: case insensitive filesystem */
public class C5263a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final C5233a f62077b = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final c f62078a;

    C5263a(c cVar) {
        this.f62078a = cVar;
    }

    private boolean g() {
        c cVar = this.f62078a;
        if (cVar == null) {
            f62077b.j("ApplicationInfo is null");
            return false;
        } else if (!cVar.f0()) {
            f62077b.j("GoogleAppId is null");
            return false;
        } else if (!this.f62078a.d0()) {
            f62077b.j("AppInstanceId is null");
            return false;
        } else if (!this.f62078a.e0()) {
            f62077b.j("ApplicationProcessState is null");
            return false;
        } else if (!this.f62078a.c0()) {
            return true;
        } else {
            if (!this.f62078a.Z().Y()) {
                f62077b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f62078a.Z().Z()) {
                return true;
            } else {
                f62077b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
    }

    public boolean c() {
        if (g()) {
            return true;
        }
        f62077b.j("ApplicationInfo is invalid");
        return false;
    }
}
