package nb;

/* renamed from: nb.d  reason: case insensitive filesystem */
public abstract class C5109d implements p {

    /* renamed from: nb.d$a */
    static abstract class a extends C5109d {
        a() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5109d.super.b((Character) obj);
        }
    }

    /* renamed from: nb.d$b */
    private static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final char f61080a;

        b(char c10) {
            this.f61080a = c10;
        }

        public boolean e(char c10) {
            if (c10 == this.f61080a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "CharMatcher.is('" + C5109d.g(this.f61080a) + "')";
        }
    }

    /* renamed from: nb.d$c */
    static abstract class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f61081a;

        c(String str) {
            this.f61081a = (String) o.j(str);
        }

        public final String toString() {
            return this.f61081a;
        }
    }

    /* renamed from: nb.d$d  reason: collision with other inner class name */
    private static final class C0898d extends c {

        /* renamed from: b  reason: collision with root package name */
        static final C5109d f61082b = new C0898d();

        private C0898d() {
            super("CharMatcher.none()");
        }

        public int c(CharSequence charSequence, int i10) {
            o.l(i10, charSequence.length());
            return -1;
        }

        public boolean e(char c10) {
            return false;
        }
    }

    protected C5109d() {
    }

    public static C5109d d(char c10) {
        return new b(c10);
    }

    public static C5109d f() {
        return C0898d.f61082b;
    }

    /* access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        o.l(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
