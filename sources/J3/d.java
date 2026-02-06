package J3;

import K3.a;
import K3.g;
import K3.p;
import K3.q;
import K3.r;
import K3.s;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;

public abstract class d {
    private static p a(WebSettings webSettings) {
        try {
            return s.c().a(webSettings);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e10;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e10);
            return new q();
        }
    }

    public static void b(WebSettings webSettings, int i10) {
        a.h hVar = r.f4047T;
        if (hVar.c()) {
            g.a(webSettings, i10);
        } else if (hVar.d()) {
            a(webSettings).a(i10);
        } else {
            throw r.a();
        }
    }

    public static void c(WebSettings webSettings, int i10) {
        if (r.f4048U.d()) {
            a(webSettings).b(i10);
            return;
        }
        throw r.a();
    }

    public static void d(WebSettings webSettings, boolean z10) {
        if (r.f4093t0.d()) {
            a(webSettings).c(z10);
            return;
        }
        throw r.a();
    }
}
