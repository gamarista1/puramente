package Db;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static n0 f50537a = new n0();

    private n0() {
    }

    public static n0 a() {
        return f50537a;
    }

    private static SharedPreferences c(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }

    private static void f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized Db.q0 b(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.common.internal.C4536s.f(r11)     // Catch:{ all -> 0x006b }
            com.google.android.gms.common.internal.C4536s.f(r12)     // Catch:{ all -> 0x006b }
            android.content.SharedPreferences r10 = c(r10, r11)     // Catch:{ all -> 0x006b }
            java.lang.String r11 = "com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID"
            java.lang.Object[] r0 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x006b }
            java.lang.String r11 = java.lang.String.format(r11, r0)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION"
            java.lang.Object[] r1 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x006b }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID"
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x006b }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch:{ all -> 0x006b }
            java.lang.String r12 = java.lang.String.format(r2, r12)     // Catch:{ all -> 0x006b }
            r2 = 0
            java.lang.String r4 = r10.getString(r11, r2)     // Catch:{ all -> 0x006b }
            java.lang.String r5 = r10.getString(r0, r2)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r10.getString(r1, r2)     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "com.google.firebase.auth.api.gms.config.tenant.id"
            java.lang.String r7 = r10.getString(r3, r2)     // Catch:{ all -> 0x006b }
            java.lang.String r8 = r10.getString(r12, r2)     // Catch:{ all -> 0x006b }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x006b }
            r10.remove(r11)     // Catch:{ all -> 0x006b }
            r10.remove(r0)     // Catch:{ all -> 0x006b }
            r10.remove(r1)     // Catch:{ all -> 0x006b }
            r10.remove(r12)     // Catch:{ all -> 0x006b }
            r10.apply()     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x006d
            if (r5 == 0) goto L_0x006d
            if (r6 == 0) goto L_0x006d
            Db.q0 r10 = new Db.q0     // Catch:{ all -> 0x006b }
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            return r10
        L_0x006b:
            r10 = move-exception
            goto L_0x006f
        L_0x006d:
            monitor-exit(r9)
            return r2
        L_0x006f:
            monitor-exit(r9)     // Catch:{ all -> 0x006b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Db.n0.b(android.content.Context, java.lang.String, java.lang.String):Db.q0");
    }

    public final synchronized void d(Context context, String str, String str2, String str3, String str4) {
        C4536s.f(str);
        C4536s.f(str2);
        SharedPreferences c10 = c(context, str);
        f(c10);
        SharedPreferences.Editor edit = c10.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2}), str4);
        edit.apply();
    }

    public final synchronized void e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.f(str3);
        C4536s.f(str7);
        SharedPreferences c10 = c(context, str);
        f(c10);
        SharedPreferences.Editor edit = c10.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{str2}), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2}), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{str2}), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2}), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    public final synchronized String g(Context context, String str, String str2) {
        C4536s.f(str);
        C4536s.f(str2);
        SharedPreferences c10 = c(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{str2});
        String string = c10.getString(format, (String) null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{str2});
        String string2 = c10.getString(format2, (String) null);
        SharedPreferences.Editor edit = c10.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
