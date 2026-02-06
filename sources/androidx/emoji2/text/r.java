package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import w1.m;

class r implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16680a = false;

    /* renamed from: b  reason: collision with root package name */
    private Spannable f16681b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof m;
        }
    }

    static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            if (s.a(charSequence) || (charSequence instanceof m)) {
                return true;
            }
            return false;
        }
    }

    r(Spannable spannable) {
        this.f16681b = spannable;
    }

    private void a() {
        Spannable spannable = this.f16681b;
        if (!this.f16680a && c().a(spannable)) {
            this.f16681b = new SpannableString(spannable);
        }
        this.f16680a = true;
    }

    static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    /* access modifiers changed from: package-private */
    public Spannable b() {
        return this.f16681b;
    }

    public char charAt(int i10) {
        return this.f16681b.charAt(i10);
    }

    public IntStream chars() {
        return a.a(this.f16681b);
    }

    public IntStream codePoints() {
        return a.b(this.f16681b);
    }

    public int getSpanEnd(Object obj) {
        return this.f16681b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f16681b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f16681b.getSpanStart(obj);
    }

    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f16681b.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f16681b.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f16681b.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f16681b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f16681b.setSpan(obj, i10, i11, i12);
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f16681b.subSequence(i10, i11);
    }

    public String toString() {
        return this.f16681b.toString();
    }

    r(CharSequence charSequence) {
        this.f16681b = new SpannableString(charSequence);
    }
}
