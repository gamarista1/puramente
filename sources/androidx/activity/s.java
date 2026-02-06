package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.M;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private static final int f10825a = Color.argb(230, 255, 255, 255);

    /* renamed from: b  reason: collision with root package name */
    private static final int f10826b = Color.argb(128, 27, 27, 27);

    /* renamed from: c  reason: collision with root package name */
    private static C f10827c;

    public static final void a(C1554j jVar) {
        C6496s.h(jVar, "<this>");
        c(jVar, (M) null, (M) null, 3, (Object) null);
    }

    public static final void b(C1554j jVar, M m10, M m11) {
        C6496s.h(jVar, "<this>");
        C6496s.h(m10, "statusBarStyle");
        C6496s.h(m11, "navigationBarStyle");
        View decorView = jVar.getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        C6798l b10 = m10.b();
        Resources resources = decorView.getResources();
        C6496s.g(resources, "view.resources");
        boolean booleanValue = ((Boolean) b10.invoke(resources)).booleanValue();
        C6798l b11 = m11.b();
        Resources resources2 = decorView.getResources();
        C6496s.g(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) b11.invoke(resources2)).booleanValue();
        C c10 = f10827c;
        if (c10 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                c10 = new A();
            } else if (i10 >= 29) {
                c10 = new z();
            } else if (i10 >= 28) {
                c10 = new w();
            } else if (i10 >= 26) {
                c10 = new u();
            } else {
                c10 = new t();
            }
        }
        Window window = jVar.getWindow();
        C6496s.g(window, "window");
        c10.b(m10, m11, window, decorView, booleanValue, booleanValue2);
        Window window2 = jVar.getWindow();
        C6496s.g(window2, "window");
        c10.a(window2);
    }

    public static /* synthetic */ void c(C1554j jVar, M m10, M m11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            m10 = M.a.b(M.f10777e, 0, 0, (C6798l) null, 4, (Object) null);
        }
        if ((i10 & 2) != 0) {
            m11 = M.a.b(M.f10777e, f10825a, f10826b, (C6798l) null, 4, (Object) null);
        }
        b(jVar, m10, m11);
    }
}
