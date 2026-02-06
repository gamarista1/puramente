package q6;

import android.graphics.drawable.Drawable;

/* renamed from: q6.e  reason: case insensitive filesystem */
public final class C3956e {

    /* renamed from: a  reason: collision with root package name */
    public static final C3956e f47628a = new C3956e();

    private C3956e() {
    }

    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static final int b(int i10) {
        int i11 = i10 >>> 24;
        if (i11 == 0) {
            return -2;
        }
        if (i11 != 255) {
            return -3;
        }
        return -1;
    }

    public static final int c(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    public static final void d(Drawable drawable, Drawable.Callback callback, C3950D d10) {
        C3949C c10;
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof C3949C) {
                c10 = (C3949C) drawable;
            } else {
                c10 = null;
            }
            if (c10 != null) {
                c10.k(d10);
            }
        }
    }

    public static final void e(Drawable drawable, C3955d dVar) {
        if (drawable != null && dVar != null) {
            dVar.a(drawable);
        }
    }
}
