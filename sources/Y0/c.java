package Y0;

import Q0.A;
import Q0.C1325h;
import Q0.T;
import Q0.y;
import Z0.b;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.f;
import b1.C1876h;
import b1.k;
import b1.q;
import c1.d;
import c1.w;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import yf.r;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f10219a = new a();

    public static final CharSequence a(String str, float f10, T t10, List list, List list2, d dVar, r rVar, boolean z10) {
        CharSequence charSequence;
        Spannable spannable;
        C1325h hVar;
        boolean z11;
        y a10;
        if (!z10 || !f.k()) {
            charSequence = str;
        } else {
            A w10 = t10.w();
            if (w10 == null || (a10 = w10.a()) == null) {
                hVar = null;
            } else {
                hVar = C1325h.d(a10.b());
            }
            int a11 = C1325h.f5340b.a();
            if (hVar == null) {
                z11 = false;
            } else {
                z11 = C1325h.g(hVar.j(), a11);
            }
            charSequence = f.c().u(str, 0, str.length(), a.e.API_PRIORITY_OTHER, z11 ? 1 : 0);
            C6496s.e(charSequence);
        }
        if (list.isEmpty() && list2.isEmpty() && C6496s.c(t10.D(), q.f19141c.a()) && w.g(t10.s())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = new SpannableString(charSequence);
        }
        if (C6496s.c(t10.A(), k.f19119b.d())) {
            Z0.c.u(spannable, f10219a, 0, str.length());
        }
        if (!b(t10) || t10.t() != null) {
            C1876h t11 = t10.t();
            if (t11 == null) {
                t11 = C1876h.f19093c.a();
            }
            Z0.c.q(spannable, t10.s(), f10, dVar, t11);
        } else {
            Z0.c.r(spannable, t10.s(), f10, dVar);
        }
        Z0.c.y(spannable, t10.D(), f10, dVar);
        Z0.c.w(spannable, t10, list, dVar, rVar);
        b.b(spannable, list2, dVar);
        return spannable;
    }

    public static final boolean b(T t10) {
        y a10;
        A w10 = t10.w();
        if (w10 == null || (a10 = w10.a()) == null) {
            return false;
        }
        return a10.c();
    }

    public static final class a extends CharacterStyle {
        a() {
        }

        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
