package va;

import Ba.C4246a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C4495g;
import ua.C5219b;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final C4246a f61739a = new C4246a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f61739a.a("getFallbackSignInIntent()", new Object[0]);
        Intent c10 = c(context, googleSignInOptions);
        c10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return c10;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f61739a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent c10 = c(context, googleSignInOptions);
        c10.setAction("com.google.android.gms.auth.NO_IMPL");
        return c10;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f61739a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static C5219b d(Intent intent) {
        if (intent == null) {
            return new C5219b((GoogleSignInAccount) null, Status.f53909h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C5219b(googleSignInAccount, Status.f53907f);
        }
        if (status == null) {
            status = Status.f53909h;
        }
        return new C5219b((GoogleSignInAccount) null, status);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.g e(com.google.android.gms.common.api.f r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            Ba.a r0 = f61739a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.a(r3, r2)
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.a(r2, r3)
            com.google.android.gms.common.internal.C4536s.l(r8)
            va.r r2 = va.r.c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.b()
            r3 = 0
            if (r2 != 0) goto L_0x0022
        L_0x001f:
            r4 = r3
            goto L_0x0089
        L_0x0022:
            android.accounts.Account r4 = r2.o0()
            android.accounts.Account r5 = r8.o0()
            if (r4 != 0) goto L_0x002f
            if (r5 != 0) goto L_0x001f
            goto L_0x0036
        L_0x002f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0036
            goto L_0x001f
        L_0x0036:
            boolean r4 = r8.v0()
            if (r4 == 0) goto L_0x003d
            goto L_0x001f
        L_0x003d:
            boolean r4 = r8.u0()
            if (r4 == 0) goto L_0x0059
            boolean r4 = r2.u0()
            if (r4 != 0) goto L_0x004a
            goto L_0x001f
        L_0x004a:
            java.lang.String r4 = r8.s0()
            java.lang.String r5 = r2.s0()
            boolean r4 = com.google.android.gms.common.internal.C4535q.b(r4, r5)
            if (r4 != 0) goto L_0x0059
            goto L_0x001f
        L_0x0059:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.r0()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.r0()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L_0x0072
            goto L_0x001f
        L_0x0072:
            va.r r2 = va.r.c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.a()
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.v0()
            if (r4 != 0) goto L_0x001f
            ua.b r4 = new ua.b
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f53907f
            r4.<init>(r2, r5)
        L_0x0089:
            if (r4 == 0) goto L_0x0097
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.a(r8, r7)
            com.google.android.gms.common.api.g r6 = com.google.android.gms.common.api.i.b(r4, r6)
            return r6
        L_0x0097:
            if (r9 == 0) goto L_0x00a9
            ua.b r7 = new ua.b
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            com.google.android.gms.common.api.g r6 = com.google.android.gms.common.api.i.b(r7, r6)
            return r6
        L_0x00a9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.a(r1, r9)
            va.k r9 = new va.k
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.d r6 = r6.a(r9)
            com.google.android.gms.common.api.internal.o r7 = new com.google.android.gms.common.api.internal.o
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: va.q.e(com.google.android.gms.common.api.f, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.g");
    }

    public static h f(f fVar, Context context, boolean z10) {
        f61739a.a("Revoking access", new Object[0]);
        String e10 = C5244c.b(context).e();
        h(context);
        if (z10) {
            return f.a(e10);
        }
        return fVar.b(new o(fVar));
    }

    public static h g(f fVar, Context context, boolean z10) {
        f61739a.a("Signing out", new Object[0]);
        h(context);
        if (z10) {
            return i.c(Status.f53907f, fVar);
        }
        return fVar.b(new m(fVar));
    }

    private static void h(Context context) {
        r.c(context).d();
        for (f h10 : f.c()) {
            h10.h();
        }
        C4495g.a();
    }
}
