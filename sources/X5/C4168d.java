package x5;

import Sg.C5538a;
import Sg.m;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import t7.C4049a;

/* renamed from: x5.d  reason: case insensitive filesystem */
public final class C4168d {

    /* renamed from: a  reason: collision with root package name */
    public static final C4168d f49467a = new C4168d();

    private C4168d() {
    }

    private final boolean a(TextView textView) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            String e10 = new m("\\s").e(C4170f.k(textView), "");
            int length = e10.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = length - 1; -1 < i11; i11--) {
                char charAt = e10.charAt(i11);
                if (!Character.isDigit(charAt)) {
                    return false;
                }
                int d10 = C5538a.d(charAt);
                if (z10 && (d10 = d10 * 2) > 9) {
                    d10 = (d10 % 10) + 1;
                }
                i10 += d10;
                z10 = !z10;
            }
            if (i10 % 10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String k10 = C4170f.k(textView);
            if (k10 == null) {
                return false;
            }
            if (k10.length() == 0) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(k10).matches();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 96) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 3) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 112) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        Class<C4168d> cls = C4168d.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            C4168d dVar = f49467a;
            if (dVar.c((TextView) view) || dVar.a((TextView) view) || dVar.d((TextView) view) || dVar.f((TextView) view) || dVar.e((TextView) view) || dVar.b((TextView) view)) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }
}
