package com.google.firebase.iid;

import Cc.i;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.g;
import gc.j;
import ic.C5027b;
import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import jc.C5046e;
import ub.C5230g;
import xa.C5270c;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final C5230g f57312a;

    /* renamed from: b  reason: collision with root package name */
    private final n f57313b;

    /* renamed from: c  reason: collision with root package name */
    private final C5270c f57314c;

    /* renamed from: d  reason: collision with root package name */
    private final C5027b f57315d;

    /* renamed from: e  reason: collision with root package name */
    private final C5027b f57316e;

    /* renamed from: f  reason: collision with root package name */
    private final C5046e f57317f;

    k(C5230g gVar, n nVar, C5270c cVar, C5027b bVar, C5027b bVar2, C5046e eVar) {
        this.f57312a = gVar;
        this.f57313b = nVar;
        this.f57314c = cVar;
        this.f57315d = bVar;
        this.f57316e = bVar2;
        this.f57317f = eVar;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task c(Task task) {
        return task.continueWith(b.a(), new j(this));
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f57312a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
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
                String valueOf = String.valueOf(bundle);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean g(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str)) {
            return true;
        }
        return false;
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        i iVar;
        j.a b10;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f57312a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f57313b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f57313b.a());
        bundle.putString("app_ver_name", this.f57313b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((g) Tasks.await(this.f57317f.a(false))).b();
            if (!TextUtils.isEmpty(b11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
            bundle.putString("cliv", "fiid-21.1.0");
            j jVar = (j) this.f57316e.get();
            iVar = (i) this.f57315d.get();
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.b()));
            bundle.putString("Firebase-Client", iVar.a());
            return bundle;
        } catch (InterruptedException e11) {
            e = e11;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
            bundle.putString("cliv", "fiid-21.1.0");
            j jVar2 = (j) this.f57316e.get();
            iVar = (i) this.f57315d.get();
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.b()));
            bundle.putString("Firebase-Client", iVar.a());
            return bundle;
        }
        bundle.putString("cliv", "fiid-21.1.0");
        j jVar22 = (j) this.f57316e.get();
        iVar = (i) this.f57315d.get();
        if (!(jVar22 == null || iVar == null || (b10 = jVar22.b("fire-iid")) == j.a.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.b()));
            bundle.putString("Firebase-Client", iVar.a());
        }
        return bundle;
    }

    private Task j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.f57314c.c(bundle);
    }

    public Task b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(j(str, str2, str3, bundle));
    }

    public Task e(String str, String str2, String str3) {
        return c(j(str, str2, str3, new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String h(Task task) {
        return f((Bundle) task.getResult(IOException.class));
    }

    public k(C5230g gVar, n nVar, C5027b bVar, C5027b bVar2, C5046e eVar) {
        this(gVar, nVar, new C5270c(gVar.m()), bVar, bVar2, eVar);
    }
}
