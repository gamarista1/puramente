package va;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class r {

    /* renamed from: d  reason: collision with root package name */
    private static r f61740d;

    /* renamed from: a  reason: collision with root package name */
    final C5244c f61741a;

    /* renamed from: b  reason: collision with root package name */
    GoogleSignInAccount f61742b;

    /* renamed from: c  reason: collision with root package name */
    GoogleSignInOptions f61743c;

    private r(Context context) {
        C5244c b10 = C5244c.b(context);
        this.f61741a = b10;
        this.f61742b = b10.c();
        this.f61743c = b10.d();
    }

    public static synchronized r c(Context context) {
        r f10;
        synchronized (r.class) {
            f10 = f(context.getApplicationContext());
        }
        return f10;
    }

    private static synchronized r f(Context context) {
        synchronized (r.class) {
            r rVar = f61740d;
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r(context);
            f61740d = rVar2;
            return rVar2;
        }
    }

    public final synchronized GoogleSignInAccount a() {
        return this.f61742b;
    }

    public final synchronized GoogleSignInOptions b() {
        return this.f61743c;
    }

    public final synchronized void d() {
        this.f61741a.a();
        this.f61742b = null;
        this.f61743c = null;
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f61741a.f(googleSignInAccount, googleSignInOptions);
        this.f61742b = googleSignInAccount;
        this.f61743c = googleSignInOptions;
    }
}
