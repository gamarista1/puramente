package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.c;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class e0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f57515a;

    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f57516d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f57517a;

        /* renamed from: b  reason: collision with root package name */
        final String f57518b;

        /* renamed from: c  reason: collision with root package name */
        final long f57519c;

        private a(String str, String str2, long j10) {
            this.f57517a = str;
            this.f57518b = str2;
            this.f57519c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        static a c(String str) {
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
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            if (System.currentTimeMillis() > this.f57519c + f57516d || !str.equals(this.f57518b)) {
                return true;
            }
            return false;
        }
    }

    public e0(Context context) {
        this.f57515a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(c.getNoBackupFilesDir(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    c();
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
                }
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + f.f37531c + "*";
    }

    public synchronized void c() {
        this.f57515a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b10 = b(str, str2);
        SharedPreferences.Editor edit = this.f57515a.edit();
        edit.remove(b10);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f57515a.getString(b(str, str2), (String) null));
    }

    public synchronized boolean f() {
        return this.f57515a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f57515a.edit();
            edit.putString(b(str, str2), a10);
            edit.commit();
        }
    }
}
