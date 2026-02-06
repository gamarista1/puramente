package Db;

import Ea.h;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzaq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.A;
import com.google.firebase.auth.FirebaseAuth;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import za.e;

public final class L {

    /* renamed from: d  reason: collision with root package name */
    private static long f50458d = 3600000;

    /* renamed from: e  reason: collision with root package name */
    private static final zzaq f50459e = zzaq.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", DiagnosticsEntry.TIMESTAMP_KEY);

    /* renamed from: f  reason: collision with root package name */
    private static final L f50460f = new L();

    /* renamed from: a  reason: collision with root package name */
    private Task f50461a;

    /* renamed from: b  reason: collision with root package name */
    private Task f50462b;

    /* renamed from: c  reason: collision with root package name */
    private long f50463c = 0;

    private L() {
    }

    public static void c(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.p0());
        edit.putString("statusMessage", status.q0());
        edit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, h.c().currentTimeMillis());
        edit.commit();
    }

    public static void d(Context context, zzags zzags, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", e.f(zzags));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, h.c().currentTimeMillis());
        edit.commit();
    }

    public static void e(Context context, FirebaseAuth firebaseAuth) {
        C4536s.l(context);
        C4536s.l(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.j().q());
        edit.commit();
    }

    public static void f(Context context, FirebaseAuth firebaseAuth, A a10) {
        C4536s.l(context);
        C4536s.l(firebaseAuth);
        C4536s.l(a10);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.j().q());
        edit.putString("firebaseUserUid", a10.a());
        edit.commit();
    }

    public static void g(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, h.c().currentTimeMillis());
        edit.commit();
    }

    private static void h(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaq zzaq = f50459e;
        int size = zzaq.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = zzaq.get(i10);
            i10++;
            edit.remove((String) obj);
        }
        edit.commit();
    }

    public static L k() {
        return f50460f;
    }

    public final Task a() {
        if (h.c().currentTimeMillis() - this.f50463c < f50458d) {
            return this.f50461a;
        }
        return null;
    }

    public final void b(Context context) {
        C4536s.l(context);
        h(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f50461a = null;
        this.f50463c = 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C4536s.l(r12)
            ub.g r0 = r12.j()
            android.content.Context r0 = r0.m()
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r3 = ""
            java.lang.String r1 = r0.getString(r1, r3)
            ub.g r4 = r12.j()
            java.lang.String r4 = r4.q()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r4 = r0.contains(r1)
            java.lang.String r5 = "operation"
            r6 = 0
            java.lang.String r8 = "timestamp"
            r9 = 0
            if (r4 == 0) goto L_0x00e2
            java.lang.String r1 = r0.getString(r1, r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzags> r4 = com.google.android.gms.internal.p002firebaseauthapi.zzags.CREATOR
            za.d r1 = za.e.c(r1, r4)
            com.google.android.gms.internal.firebase-auth-api.zzags r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzags) r1
            java.lang.String r4 = r0.getString(r5, r3)
            java.lang.String r5 = "tenantId"
            java.lang.String r5 = r0.getString(r5, r9)
            java.lang.String r10 = "firebaseUserUid"
            java.lang.String r3 = r0.getString(r10, r3)
            long r6 = r0.getLong(r8, r6)
            r11.f50463c = r6
            if (r5 == 0) goto L_0x0062
            r12.y(r5)
            r1.zzb((java.lang.String) r5)
        L_0x0062:
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -98509410: goto L_0x0085;
                case 175006864: goto L_0x007a;
                case 1450464913: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            r2 = r5
            goto L_0x008e
        L_0x006f:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0078
            goto L_0x006d
        L_0x0078:
            r2 = 2
            goto L_0x008e
        L_0x007a:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0083
            goto L_0x006d
        L_0x0083:
            r2 = 1
            goto L_0x008e
        L_0x0085:
            java.lang.String r6 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x008e
            goto L_0x006d
        L_0x008e:
            switch(r2) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x009f;
                case 2: goto L_0x0094;
                default: goto L_0x0091;
            }
        L_0x0091:
            r11.f50461a = r9
            goto L_0x00de
        L_0x0094:
            com.google.firebase.auth.C0 r1 = com.google.firebase.auth.C0.v0(r1)
            com.google.android.gms.tasks.Task r12 = r12.A(r1)
            r11.f50461a = r12
            goto L_0x00de
        L_0x009f:
            com.google.firebase.auth.A r2 = r12.k()
            java.lang.String r2 = r2.a()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00bc
            com.google.firebase.auth.A r2 = r12.k()
            com.google.firebase.auth.C0 r1 = com.google.firebase.auth.C0.v0(r1)
            com.google.android.gms.tasks.Task r12 = r12.P(r2, r1)
            r11.f50461a = r12
            goto L_0x00de
        L_0x00bc:
            r11.f50461a = r9
            goto L_0x00de
        L_0x00bf:
            com.google.firebase.auth.A r2 = r12.k()
            java.lang.String r2 = r2.a()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00dc
            com.google.firebase.auth.A r2 = r12.k()
            com.google.firebase.auth.C0 r1 = com.google.firebase.auth.C0.v0(r1)
            com.google.android.gms.tasks.Task r12 = r12.s0(r2, r1)
            r11.f50461a = r12
            goto L_0x00de
        L_0x00dc:
            r11.f50461a = r9
        L_0x00de:
            h(r0)
            return
        L_0x00e2:
            java.lang.String r12 = "recaptchaToken"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x0110
            java.lang.String r12 = r0.getString(r12, r3)
            java.lang.String r1 = r0.getString(r5, r3)
            long r2 = r0.getLong(r8, r6)
            r11.f50463c = r2
            r1.hashCode()
            java.lang.String r2 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0106
            r11.f50462b = r9
            goto L_0x010c
        L_0x0106:
            com.google.android.gms.tasks.Task r12 = com.google.android.gms.tasks.Tasks.forResult(r12)
            r11.f50462b = r12
        L_0x010c:
            h(r0)
            return
        L_0x0110:
            java.lang.String r12 = "statusCode"
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L_0x013c
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r12 = r0.getInt(r12, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r1 = r0.getString(r1, r3)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>((int) r12, (java.lang.String) r1)
            long r3 = r0.getLong(r8, r6)
            r11.f50463c = r3
            h(r0)
            ub.m r12 = com.google.android.gms.internal.p002firebaseauthapi.zzach.zza((com.google.android.gms.common.api.Status) r2)
            com.google.android.gms.tasks.Task r12 = com.google.android.gms.tasks.Tasks.forException(r12)
            r11.f50461a = r12
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Db.L.i(com.google.firebase.auth.FirebaseAuth):void");
    }

    public final Task j() {
        if (h.c().currentTimeMillis() - this.f50463c < f50458d) {
            return this.f50462b;
        }
        return null;
    }
}
