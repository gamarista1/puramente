package Bb;

import android.util.Log;

public class b {

    /* renamed from: c  reason: collision with root package name */
    static final b f50317c = new b("FirebaseAppCheck");

    /* renamed from: a  reason: collision with root package name */
    private final String f50318a;

    /* renamed from: b  reason: collision with root package name */
    private int f50319b = 4;

    public b(String str) {
        this.f50318a = str;
    }

    private boolean a(int i10) {
        if (this.f50319b <= i10 || Log.isLoggable(this.f50318a, i10)) {
            return true;
        }
        return false;
    }

    public static b f() {
        return f50317c;
    }

    public void b(String str) {
        c(str, (Throwable) null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f50318a, str, th2);
        }
    }

    public void d(String str) {
        e(str, (Throwable) null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f50318a, str, th2);
        }
    }
}
