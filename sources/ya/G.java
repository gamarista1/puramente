package ya;

import android.util.Log;

class G {

    /* renamed from: e  reason: collision with root package name */
    private static final G f62263e = new G(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f62264a;

    /* renamed from: b  reason: collision with root package name */
    final String f62265b;

    /* renamed from: c  reason: collision with root package name */
    final Throwable f62266c;

    /* renamed from: d  reason: collision with root package name */
    final int f62267d;

    private G(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f62264a = z10;
        this.f62267d = i10;
        this.f62265b = str;
        this.f62266c = th2;
    }

    static G b() {
        return f62263e;
    }

    static G c(String str) {
        return new G(false, 1, 5, str, (Throwable) null);
    }

    static G d(String str, Throwable th2) {
        return new G(false, 1, 5, str, th2);
    }

    static G f(int i10) {
        return new G(true, i10, 1, (String) null, (Throwable) null);
    }

    static G g(int i10, int i11, String str, Throwable th2) {
        return new G(false, i10, i11, str, th2);
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f62265b;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (!this.f62264a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f62266c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f62266c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }

    /* synthetic */ G(boolean z10, int i10, int i11, String str, Throwable th2, F f10) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }
}
