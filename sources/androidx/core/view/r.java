package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import p1.C2388d;
import x1.c;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final DisplayCutout f16147a;

    static class a {
        static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(DisplayCutout displayCutout) {
        this.f16147a = displayCutout;
    }

    static r f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(this.f16147a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f16147a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f16147a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f16147a);
        }
        return 0;
    }

    public C2388d e() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C2388d.d(b.a(this.f16147a));
        }
        return C2388d.f25149e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return c.a(this.f16147a, ((r) obj).f16147a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f16147a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f16147a + "}";
    }
}
