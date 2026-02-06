package x;

import B0.c;
import B0.d;
import B0.f;
import J0.C1244j;
import J0.C1246l;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: x.k  reason: case insensitive filesystem */
public abstract class C2872k {

    /* renamed from: a  reason: collision with root package name */
    private static final long f27968a = ((long) ViewConfiguration.getTapTimeout());

    public static final long a() {
        return f27968a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        if (!c.e(d.b(keyEvent), c.f765a.b()) || !d(keyEvent)) {
            return false;
        }
        return true;
    }

    public static final boolean c(C1244j jVar) {
        return e(C1246l.a(jVar));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int b10 = f.b(d.a(keyEvent));
        if (b10 == 23 || b10 == 66 || b10 == 160) {
            return true;
        }
        return false;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        if (!c.e(d.b(keyEvent), c.f765a.a()) || !d(keyEvent)) {
            return false;
        }
        return true;
    }
}
