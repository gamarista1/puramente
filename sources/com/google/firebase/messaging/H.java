package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ic.C5027b;
import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import jc.C5046e;
import r3.m;
import ub.C5230g;
import xa.C5270c;

class H {

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f57416a;

    /* renamed from: b  reason: collision with root package name */
    private final M f57417b;

    /* renamed from: c  reason: collision with root package name */
    private final C5270c f57418c;

    /* renamed from: d  reason: collision with root package name */
    private final C5027b f57419d;

    /* renamed from: e  reason: collision with root package name */
    private final C5027b f57420e;

    /* renamed from: f  reason: collision with root package name */
    private final C5046e f57421f;

    H(C5230g gVar, M m10, C5027b bVar, C5027b bVar2, C5046e eVar) {
        this(gVar, m10, new C5270c(gVar.m()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task d(Task task) {
        return task.continueWith(new m(), new G(this));
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f57416a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean i(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String j(Task task) {
        return h((Bundle) task.getResult(IOException.class));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            ub.g r3 = r2.f57416a
            ub.p r3 = r3.r()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.M r3 = r2.f57417b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.M r3 = r2.f57417b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.M r3 = r2.f57417b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.e()
            r5.putString(r3, r4)
            jc.e r3 = r2.f57421f     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            r4 = 0
            com.google.android.gms.tasks.Task r3 = r3.a(r4)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            com.google.firebase.installations.g r3 = (com.google.firebase.installations.g) r3     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            java.lang.String r3 = r3.b()     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            if (r4 != 0) goto L_0x007a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0076:
            r3 = move-exception
            goto L_0x0080
        L_0x0078:
            r3 = move-exception
            goto L_0x0080
        L_0x007a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0080:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L_0x0085:
            jc.e r3 = r2.f57421f
            com.google.android.gms.tasks.Task r3 = r3.getId()
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.1.1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            ic.b r3 = r2.f57420e
            java.lang.Object r3 = r3.get()
            gc.j r3 = (gc.j) r3
            ic.b r4 = r2.f57419d
            java.lang.Object r4 = r4.get()
            Cc.i r4 = (Cc.i) r4
            if (r3 == 0) goto L_0x00e2
            if (r4 == 0) goto L_0x00e2
            java.lang.String r0 = "fire-iid"
            gc.j$a r3 = r3.b(r0)
            gc.j$a r0 = gc.j.a.NONE
            if (r3 == r0) goto L_0x00e2
            int r3 = r3.b()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.H.k(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private Task m(String str, String str2, Bundle bundle) {
        try {
            k(str, str2, bundle);
            return this.f57418c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public Task c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(m(M.c(this.f57416a), "*", bundle));
    }

    /* access modifiers changed from: package-private */
    public Task f() {
        return this.f57418c.a();
    }

    /* access modifiers changed from: package-private */
    public Task g() {
        return d(m(M.c(this.f57416a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public Task l(boolean z10) {
        return this.f57418c.d(z10);
    }

    /* access modifiers changed from: package-private */
    public Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(m(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    public Task o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(m(str, "/topics/" + str2, bundle));
    }

    H(C5230g gVar, M m10, C5270c cVar, C5027b bVar, C5027b bVar2, C5046e eVar) {
        this.f57416a = gVar;
        this.f57417b = m10;
        this.f57418c = cVar;
        this.f57419d = bVar;
        this.f57420e = bVar2;
        this.f57421f = eVar;
    }
}
