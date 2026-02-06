package va;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4536s;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: va.c  reason: case insensitive filesystem */
public class C5244c {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f61722c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static C5244c f61723d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f61724a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f61725b;

    C5244c(Context context) {
        this.f61725b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C5244c b(Context context) {
        C4536s.l(context);
        Lock lock = f61722c;
        lock.lock();
        try {
            if (f61723d == null) {
                f61723d = new C5244c(context.getApplicationContext());
            }
            C5244c cVar = f61723d;
            lock.unlock();
            return cVar;
        } catch (Throwable th2) {
            f61722c.unlock();
            throw th2;
        }
    }

    private static final String i(String str, String str2) {
        return str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
    }

    public void a() {
        this.f61724a.lock();
        try {
            this.f61725b.edit().clear().apply();
        } finally {
            this.f61724a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInAccount", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.x0(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInOptions", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.x0(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C4536s.l(googleSignInAccount);
        C4536s.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.y0());
        C4536s.l(googleSignInAccount);
        C4536s.l(googleSignInOptions);
        String y02 = googleSignInAccount.y0();
        h(i("googleSignInAccount", y02), googleSignInAccount.z0());
        h(i("googleSignInOptions", y02), googleSignInOptions.B0());
    }

    /* access modifiers changed from: protected */
    public final String g(String str) {
        this.f61724a.lock();
        try {
            return this.f61725b.getString(str, (String) null);
        } finally {
            this.f61724a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final void h(String str, String str2) {
        this.f61724a.lock();
        try {
            this.f61725b.edit().putString(str, str2).apply();
        } finally {
            this.f61724a.unlock();
        }
    }
}
