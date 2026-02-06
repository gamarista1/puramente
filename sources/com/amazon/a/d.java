package com.amazon.a;

import android.app.Activity;
import com.amazon.a.a.o.a.a;
import com.amazon.a.a.o.c;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37625a = new c("CrossPlatformPluginUtils");

    private static boolean a() {
        if (a.b() != null) {
            return a.b().h();
        }
        return false;
    }

    public static void a(Activity activity) {
        a.a(a.d(), "AppstoreSDK not initialized");
        if (!a()) {
            a.b().c(activity);
            if (c.f37534a) {
                c cVar = f37625a;
                cVar.a("Notified Visibility for activity:" + activity);
            }
        }
    }
}
