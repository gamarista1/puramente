package B0;

import android.view.KeyEvent;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final KeyEvent f764a;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.f764a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        if ((obj instanceof b) && C6496s.c(keyEvent, ((b) obj).f())) {
            return true;
        }
        return false;
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f764a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f764a;
    }

    public int hashCode() {
        return d(this.f764a);
    }

    public String toString() {
        return e(this.f764a);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }
}
