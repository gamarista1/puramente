package Db;

import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import ub.C5230g;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    Map f50475a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public zzafn f50476b;

    /* renamed from: c  reason: collision with root package name */
    C5230g f50477c;

    /* renamed from: d  reason: collision with root package name */
    private FirebaseAuth f50478d;

    /* renamed from: e  reason: collision with root package name */
    Q f50479e;

    public W(C5230g gVar, FirebaseAuth firebaseAuth) {
        this(gVar, firebaseAuth, new U());
    }

    private final Task e(String str) {
        return (Task) this.f50475a.get(str);
    }

    private static String f(String str) {
        if (zzah.zzc(str)) {
            return "*";
        }
        return str;
    }

    public final Task a(String str, Boolean bool) {
        Task e10;
        String f10 = f(str);
        if (bool.booleanValue() || (e10 = e(f10)) == null) {
            return this.f50478d.V("RECAPTCHA_ENTERPRISE").continueWithTask(new V(this, f10));
        }
        return e10;
    }

    public final Task b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String f10 = f(str);
        Task e10 = e(f10);
        if (bool.booleanValue() || e10 == null) {
            e10 = a(f10, bool);
        }
        return e10.continueWithTask(new Y(this, recaptchaAction));
    }

    public final boolean d(String str) {
        zzafn zzafn = this.f50476b;
        if (zzafn == null || !zzafn.zzb(str)) {
            return false;
        }
        return true;
    }

    private W(C5230g gVar, FirebaseAuth firebaseAuth, Q q10) {
        this.f50475a = new HashMap();
        this.f50477c = gVar;
        this.f50478d = firebaseAuth;
        this.f50479e = q10;
    }
}
