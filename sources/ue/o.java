package Ue;

import android.content.SharedPreferences;
import io.invertase.firebase.app.a;

public class o {

    /* renamed from: b  reason: collision with root package name */
    private static o f65210b = new o();

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f65211a;

    private SharedPreferences d() {
        if (this.f65211a == null) {
            this.f65211a = a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f65211a;
    }

    public static o e() {
        return f65210b;
    }

    public boolean a(String str) {
        return d().contains(str);
    }

    public boolean b(String str, boolean z10) {
        return d().getBoolean(str, z10);
    }

    public long c(String str, long j10) {
        return d().getLong(str, j10);
    }

    public String f(String str, String str2) {
        return d().getString(str, str2);
    }

    public SharedPreferences.Editor g(String str) {
        return d().edit().remove(str);
    }

    public void h(String str, boolean z10) {
        d().edit().putBoolean(str, z10).apply();
    }

    public void i(String str, long j10) {
        d().edit().putLong(str, j10).apply();
    }

    public void j(String str, String str2) {
        d().edit().putString(str, str2).apply();
    }
}
