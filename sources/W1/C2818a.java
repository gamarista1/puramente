package w1;

import android.text.SpannableStringBuilder;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.util.Locale;

/* renamed from: w1.a  reason: case insensitive filesystem */
public final class C2818a {

    /* renamed from: d  reason: collision with root package name */
    static final n f27669d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f27670e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f27671f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final C2818a f27672g;

    /* renamed from: h  reason: collision with root package name */
    static final C2818a f27673h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f27674a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27675b;

    /* renamed from: c  reason: collision with root package name */
    private final n f27676c;

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    public static final class C0459a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f27677a;

        /* renamed from: b  reason: collision with root package name */
        private int f27678b;

        /* renamed from: c  reason: collision with root package name */
        private n f27679c;

        public C0459a() {
            c(C2818a.e(Locale.getDefault()));
        }

        private static C2818a b(boolean z10) {
            if (z10) {
                return C2818a.f27673h;
            }
            return C2818a.f27672g;
        }

        private void c(boolean z10) {
            this.f27677a = z10;
            this.f27679c = C2818a.f27669d;
            this.f27678b = 2;
        }

        public C2818a a() {
            if (this.f27678b == 2 && this.f27679c == C2818a.f27669d) {
                return b(this.f27677a);
            }
            return new C2818a(this.f27677a, this.f27678b, this.f27679c);
        }
    }

    /* renamed from: w1.a$b */
    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f27680f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f27681a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f27682b;

        /* renamed from: c  reason: collision with root package name */
        private final int f27683c;

        /* renamed from: d  reason: collision with root package name */
        private int f27684d;

        /* renamed from: e  reason: collision with root package name */
        private char f27685e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f27680f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f27681a = charSequence;
            this.f27682b = z10;
            this.f27683c = charSequence.length();
        }

        private static byte c(char c10) {
            if (c10 < 1792) {
                return f27680f[c10];
            }
            return Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f27684d;
            do {
                int i11 = this.f27684d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f27681a;
                int i12 = i11 - 1;
                this.f27684d = i12;
                charAt = charSequence.charAt(i12);
                this.f27685e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f27684d = i10;
            this.f27685e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f27684d;
                if (i10 >= this.f27683c) {
                    return 12;
                }
                CharSequence charSequence = this.f27681a;
                this.f27684d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f27685e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f27684d;
            while (true) {
                int i11 = this.f27684d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f27681a;
                int i12 = i11 - 1;
                this.f27684d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f27685e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f27684d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f27681a;
                        int i14 = i13 - 1;
                        this.f27684d = i14;
                        charAt = charSequence2.charAt(i14);
                        this.f27685e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f27684d = i10;
            this.f27685e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f27684d;
            while (true) {
                int i11 = this.f27684d;
                if (i11 < this.f27683c) {
                    CharSequence charSequence = this.f27681a;
                    this.f27684d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f27685e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f27684d;
                            if (i12 >= this.f27683c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f27681a;
                            this.f27684d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f27685e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f27684d = i10;
                    this.f27685e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f27681a.charAt(this.f27684d - 1);
            this.f27685e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f27681a, this.f27684d);
                this.f27684d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f27684d--;
            byte c10 = c(this.f27685e);
            if (!this.f27682b) {
                return c10;
            }
            char c11 = this.f27685e;
            if (c11 == '>') {
                return h();
            }
            if (c11 == ';') {
                return f();
            }
            return c10;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f27681a.charAt(this.f27684d);
            this.f27685e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f27681a, this.f27684d);
                this.f27684d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f27684d++;
            byte c10 = c(this.f27685e);
            if (!this.f27682b) {
                return c10;
            }
            char c11 = this.f27685e;
            if (c11 == '<') {
                return i();
            }
            if (c11 == '&') {
                return g();
            }
            return c10;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f27684d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f27684d < this.f27683c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case StdKeyDeserializer.TYPE_URL /*14*/:
                            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f27684d > 0) {
                switch (a()) {
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            this.f27684d = this.f27683c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f27684d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case StdKeyDeserializer.TYPE_URL /*14*/:
                                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i10--;
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        n nVar = o.f27697c;
        f27669d = nVar;
        f27672g = new C2818a(false, 2, nVar);
        f27673h = new C2818a(true, 2, nVar);
    }

    C2818a(boolean z10, int i10, n nVar) {
        this.f27674a = z10;
        this.f27675b = i10;
        this.f27676c = nVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C2818a c() {
        return new C0459a().a();
    }

    static boolean e(Locale locale) {
        if (p.a(locale) == 1) {
            return true;
        }
        return false;
    }

    private String f(CharSequence charSequence, n nVar) {
        boolean a10 = nVar.a(charSequence, 0, charSequence.length());
        if (!this.f27674a && (a10 || b(charSequence) == 1)) {
            return f27670e;
        }
        if (!this.f27674a) {
            return "";
        }
        if (!a10 || b(charSequence) == -1) {
            return f27671f;
        }
        return "";
    }

    private String g(CharSequence charSequence, n nVar) {
        boolean a10 = nVar.a(charSequence, 0, charSequence.length());
        if (!this.f27674a && (a10 || a(charSequence) == 1)) {
            return f27670e;
        }
        if (!this.f27674a) {
            return "";
        }
        if (!a10 || a(charSequence) == -1) {
            return f27671f;
        }
        return "";
    }

    public boolean d() {
        if ((this.f27675b & 2) != 0) {
            return true;
        }
        return false;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f27676c, true);
    }

    public CharSequence i(CharSequence charSequence, n nVar, boolean z10) {
        n nVar2;
        char c10;
        n nVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a10 = nVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            if (a10) {
                nVar3 = o.f27696b;
            } else {
                nVar3 = o.f27695a;
            }
            spannableStringBuilder.append(g(charSequence, nVar3));
        }
        if (a10 != this.f27674a) {
            if (a10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            if (a10) {
                nVar2 = o.f27696b;
            } else {
                nVar2 = o.f27695a;
            }
            spannableStringBuilder.append(f(charSequence, nVar2));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f27676c, true);
    }

    public String k(String str, n nVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, nVar, z10).toString();
    }
}
