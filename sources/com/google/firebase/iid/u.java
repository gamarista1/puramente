package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C1587a;
import androidx.core.content.c;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class u {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f57335a;

    /* renamed from: b  reason: collision with root package name */
    final Context f57336b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f57337c = new C1587a();

    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f57338d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f57339a;

        /* renamed from: b  reason: collision with root package name */
        final String f57340b;

        /* renamed from: c  reason: collision with root package name */
        final long f57341c;

        private a(String str, String str2, long j10) {
            this.f57339a = str;
            this.f57340b = str2;
            this.f57341c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        static String b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f57339a;
        }

        static a d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(DiagnosticsEntry.TIMESTAMP_KEY));
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(String str) {
            if (System.currentTimeMillis() > this.f57341c + f57338d || !str.equals(this.f57340b)) {
                return true;
            }
            return false;
        }
    }

    public u(Context context) {
        this.f57336b = context;
        this.f57335a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    private void a(String str) {
        String str2;
        File file = new File(c.getNoBackupFilesDir(this.f57336b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !h()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    d();
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e10.getMessage());
                    if (valueOf.length() != 0) {
                        str2 = "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        str2 = new String("Error creating file in no backup dir: ");
                    }
                    Log.d("FirebaseInstanceId", str2);
                }
            }
        }
    }

    static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
        sb2.append(str);
        sb2.append("|S|cre");
        return sb2.toString();
    }

    private String c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append(f.f37531c);
        sb2.append(str3);
        return sb2.toString();
    }

    private long f(String str) {
        String string = this.f57335a.getString(b(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private long k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f57335a.contains(b(str, "cre"))) {
            return f(str);
        }
        SharedPreferences.Editor edit = this.f57335a.edit();
        edit.putString(b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    public synchronized void d() {
        this.f57337c.clear();
        this.f57335a.edit().clear().commit();
    }

    public synchronized void e(String str, String str2, String str3) {
        String c10 = c(str, str2, str3);
        SharedPreferences.Editor edit = this.f57335a.edit();
        edit.remove(c10);
        edit.commit();
    }

    public synchronized a g(String str, String str2, String str3) {
        return a.d(this.f57335a.getString(c(str, str2, str3), (String) null));
    }

    public synchronized boolean h() {
        return this.f57335a.getAll().isEmpty();
    }

    public synchronized void i(String str, String str2, String str3, String str4, String str5) {
        String a10 = a.a(str4, str5, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f57335a.edit();
            edit.putString(c(str, str2, str3), a10);
            edit.commit();
        }
    }

    public synchronized long j(String str) {
        long k10;
        k10 = k(str);
        this.f57337c.put(str, Long.valueOf(k10));
        return k10;
    }
}
