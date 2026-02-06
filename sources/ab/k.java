package Ab;

import Eb.w;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4536s;
import zb.C5299a;

public class k {

    /* renamed from: b  reason: collision with root package name */
    private static final Bb.b f50201b = new Bb.b(k.class.getSimpleName());

    /* renamed from: a  reason: collision with root package name */
    private w f50202a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f50203a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                Ab.k$b[] r0 = Ab.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50203a = r0
                Ab.k$b r1 = Ab.k.b.DEFAULT_APP_CHECK_TOKEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50203a     // Catch:{ NoSuchFieldError -> 0x001d }
                Ab.k$b r1 = Ab.k.b.UNKNOWN_APP_CHECK_TOKEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ab.k.a.<clinit>():void");
        }
    }

    enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public k(Context context, String str) {
        C4536s.l(context);
        C4536s.f(str);
        this.f50202a = new w(new j(context, String.format("com.google.firebase.appcheck.store.%s", new Object[]{str})));
    }

    /* access modifiers changed from: package-private */
    public void b() {
        ((SharedPreferences) this.f50202a.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    public C5299a d() {
        String string = ((SharedPreferences) this.f50202a.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", (String) null);
        String string2 = ((SharedPreferences) this.f50202a.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", (String) null);
        if (!(string == null || string2 == null)) {
            try {
                int i10 = a.f50203a[b.valueOf(string).ordinal()];
                if (i10 == 1) {
                    return a.d(string2);
                }
                if (i10 == 2) {
                    return a.c(string2);
                }
                f50201b.d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e10) {
                Bb.b bVar = f50201b;
                bVar.d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e10.getMessage());
                b();
            }
        }
        return null;
    }
}
