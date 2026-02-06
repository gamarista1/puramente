package com.google.android.exoplayer2.ui;

import W9.b;
import aa.b;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import ja.C3645a;
import nb.p;

abstract class i {
    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
            return true;
        }
        return false;
    }

    public static void e(b.C0565b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) C3645a.e(bVar.e()), new g());
        }
        f(bVar);
    }

    public static void f(b.C0565b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            g((Spannable) C3645a.e(bVar.e()), new h());
        }
    }

    private static void g(Spannable spannable, p pVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (pVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = (float) i12;
        } else if (i10 == 1) {
            f11 = (float) i11;
        } else if (i10 != 2) {
            return -3.4028235E38f;
        } else {
            return f10;
        }
        return f10 * f11;
    }
}
