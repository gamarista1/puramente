package w1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import x1.c;

public abstract class m implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f27686a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f27687b;

        /* renamed from: c  reason: collision with root package name */
        private final int f27688c;

        /* renamed from: d  reason: collision with root package name */
        private final int f27689d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f27690e;

        /* renamed from: w1.m$a$a  reason: collision with other inner class name */
        public static class C0460a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f27691a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f27692b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c  reason: collision with root package name */
            private int f27693c = 1;

            /* renamed from: d  reason: collision with root package name */
            private int f27694d = 1;

            public C0460a(TextPaint textPaint) {
                this.f27691a = textPaint;
            }

            public a a() {
                return new a(this.f27691a, this.f27692b, this.f27693c, this.f27694d);
            }

            public C0460a b(int i10) {
                this.f27693c = i10;
                return this;
            }

            public C0460a c(int i10) {
                this.f27694d = i10;
                return this;
            }

            public C0460a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f27692b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f27690e = l.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f27690e = null;
            }
            this.f27686a = textPaint;
            this.f27687b = textDirectionHeuristic;
            this.f27688c = i10;
            this.f27689d = i11;
        }

        public boolean a(a aVar) {
            if (this.f27688c != aVar.b() || this.f27689d != aVar.c() || this.f27686a.getTextSize() != aVar.e().getTextSize() || this.f27686a.getTextScaleX() != aVar.e().getTextScaleX() || this.f27686a.getTextSkewX() != aVar.e().getTextSkewX() || this.f27686a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f27686a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f27686a.getFlags() != aVar.e().getFlags() || !this.f27686a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f27686a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f27686a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f27688c;
        }

        public int c() {
            return this.f27689d;
        }

        public TextDirectionHeuristic d() {
            return this.f27687b;
        }

        public TextPaint e() {
            return this.f27686a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            if (this.f27687b == aVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return c.b(Float.valueOf(this.f27686a.getTextSize()), Float.valueOf(this.f27686a.getTextScaleX()), Float.valueOf(this.f27686a.getTextSkewX()), Float.valueOf(this.f27686a.getLetterSpacing()), Integer.valueOf(this.f27686a.getFlags()), this.f27686a.getTextLocales(), this.f27686a.getTypeface(), Boolean.valueOf(this.f27686a.isElegantTextHeight()), this.f27687b, Integer.valueOf(this.f27688c), Integer.valueOf(this.f27689d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f27686a.getTextSize());
            sb2.append(", textScaleX=" + this.f27686a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f27686a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f27686a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f27686a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f27686a.getTextLocales());
            sb2.append(", typeface=" + this.f27686a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f27686a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f27687b);
            sb2.append(", breakStrategy=" + this.f27688c);
            sb2.append(", hyphenationFrequency=" + this.f27689d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f27686a = params.getTextPaint();
            this.f27687b = params.getTextDirection();
            this.f27688c = params.getBreakStrategy();
            this.f27689d = params.getHyphenationFrequency();
            this.f27690e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
