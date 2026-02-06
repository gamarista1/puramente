package S0;

import R0.H;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5828e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f5829f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5830a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5831b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5832c;

    /* renamed from: d  reason: collision with root package name */
    private final BreakIterator f5833d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }

    public i(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.f5830a = charSequence;
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        } else if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            this.f5833d = wordInstance;
            this.f5831b = Math.max(0, i10 - 50);
            this.f5832c = Math.min(charSequence.length(), i11 + 50);
            wordInstance.setText(new H(charSequence, i10, i11));
        }
    }

    private final void a(int i10) {
        int i11 = this.f5831b;
        if (i10 > this.f5832c || i11 > i10) {
            throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.f5831b + " , " + this.f5832c + ']').toString());
        }
    }

    private final int b(int i10, boolean z10) {
        a(i10);
        if (j(i10)) {
            if (!this.f5833d.isBoundary(i10) || (h(i10) && z10)) {
                return this.f5833d.preceding(i10);
            }
            return i10;
        } else if (h(i10)) {
            return this.f5833d.preceding(i10);
        } else {
            return -1;
        }
    }

    private final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            if (!this.f5833d.isBoundary(i10) || (j(i10) && z10)) {
                return this.f5833d.following(i10);
            }
            return i10;
        } else if (j(i10)) {
            return this.f5833d.following(i10);
        } else {
            return -1;
        }
    }

    private final boolean h(int i10) {
        int i11 = this.f5831b + 1;
        if (i10 > this.f5832c || i11 > i10 || !Character.isLetterOrDigit(Character.codePointBefore(this.f5830a, i10))) {
            return false;
        }
        return true;
    }

    private final boolean j(int i10) {
        int i11 = this.f5831b;
        if (i10 >= this.f5832c || i11 > i10 || !Character.isLetterOrDigit(Character.codePointAt(this.f5830a, i10))) {
            return false;
        }
        return true;
    }

    private final boolean l(int i10) {
        if (k(i10) || !i(i10)) {
            return false;
        }
        return true;
    }

    private final boolean m(int i10) {
        if (!k(i10) || i(i10)) {
            return false;
        }
        return true;
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !m(i10)) {
            i10 = o(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !l(i10)) {
            i10 = n(i10);
        }
        return i10;
    }

    public final boolean i(int i10) {
        int i11 = this.f5831b + 1;
        if (i10 > this.f5832c || i11 > i10) {
            return false;
        }
        return f5828e.a(Character.codePointBefore(this.f5830a, i10));
    }

    public final boolean k(int i10) {
        int i11 = this.f5831b;
        if (i10 >= this.f5832c || i11 > i10) {
            return false;
        }
        return f5828e.a(Character.codePointAt(this.f5830a, i10));
    }

    public final int n(int i10) {
        a(i10);
        return this.f5833d.following(i10);
    }

    public final int o(int i10) {
        a(i10);
        return this.f5833d.preceding(i10);
    }
}
