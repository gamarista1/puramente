package mh;

import Sg.p;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;
import lf.C6535s;
import mf.C6565s;

/* renamed from: mh.a  reason: case insensitive filesystem */
public abstract class C6584a {

    /* renamed from: a  reason: collision with root package name */
    public int f72182a;

    /* renamed from: b  reason: collision with root package name */
    public final H f72183b = new H();

    /* renamed from: c  reason: collision with root package name */
    private String f72184c;

    /* renamed from: d  reason: collision with root package name */
    private StringBuilder f72185d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char charAt = charSequence.charAt(i10);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    private final String L() {
        String str = this.f72184c;
        C6496s.e(str);
        this.f72184c = null;
        return str;
    }

    public static /* synthetic */ boolean O(C6584a aVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.N(z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    private final boolean Q() {
        if (C().charAt(this.f72182a - 1) != '\"') {
            return true;
        }
        return false;
    }

    private final int a(int i10) {
        int H10 = H(i10);
        if (H10 != -1) {
            int i11 = H10 + 1;
            char charAt = C().charAt(H10);
            if (charAt == 'u') {
                return c(C(), i11);
            }
            char b10 = C6585b.b(charAt);
            if (b10 != 0) {
                this.f72185d.append(b10);
                return i11;
            }
            x(this, "Invalid escaped char '" + charAt + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
        x(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    private final int b(int i10, int i11) {
        d(i10, i11);
        return a(i11 + 1);
    }

    private final int c(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 >= charSequence.length()) {
            this.f72182a = i10;
            u();
            if (this.f72182a + 4 < charSequence.length()) {
                return c(charSequence, this.f72182a);
            }
            x(this, "Unexpected EOF during unicode escape", 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
        this.f72185d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
        return i11;
    }

    private final boolean f(int i10) {
        int H10 = H(i10);
        if (H10 >= C().length() || H10 == -1) {
            x(this, "EOF", 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
        int i11 = H10 + 1;
        char charAt = C().charAt(H10) | ' ';
        if (charAt == 'f') {
            h("alse", i11);
            return false;
        } else if (charAt == 't') {
            h("rue", i11);
            return true;
        } else {
            x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    private final void h(String str, int i10) {
        if (C().length() - i10 >= str.length()) {
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                if (str.charAt(i11) == (C().charAt(i10 + i11) | ' ')) {
                    i11++;
                } else {
                    x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6, (Object) null);
                    throw new C6527k();
                }
            }
            this.f72182a = i10 + str.length();
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    private static final double n(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -((double) j10));
        }
        if (z10) {
            return Math.pow(10.0d, (double) j10);
        }
        throw new C6535s();
    }

    private final String s(int i10, int i11) {
        d(i10, i11);
        String sb2 = this.f72185d.toString();
        C6496s.g(sb2, "toString(...)");
        this.f72185d.setLength(0);
        return sb2;
    }

    public static /* synthetic */ Void x(C6584a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = aVar.f72182a;
            }
            if ((i11 & 4) != 0) {
                str2 = "";
            }
            return aVar.w(str, i10, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public static /* synthetic */ Void z(C6584a aVar, byte b10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return aVar.y(b10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final void A(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        int h02 = p.h0(K(0, this.f72182a), str, 0, false, 6, (Object) null);
        w("Encountered an unknown key '" + str + '\'', h02, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C6527k();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence C();

    /* access modifiers changed from: protected */
    public final boolean D(char c10) {
        boolean z10;
        if (c10 == '}' || c10 == ']' || c10 == ':' || c10 == ',') {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    public abstract String E(String str, boolean z10);

    public final byte F() {
        CharSequence C10 = C();
        int i10 = this.f72182a;
        while (true) {
            int H10 = H(i10);
            if (H10 != -1) {
                char charAt = C10.charAt(H10);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i10 = H10 + 1;
                } else {
                    this.f72182a = H10;
                    return C6585b.a(charAt);
                }
            } else {
                this.f72182a = H10;
                return 10;
            }
        }
    }

    public final String G(boolean z10) {
        String str;
        byte F10 = F();
        if (z10) {
            if (F10 != 1 && F10 != 0) {
                return null;
            }
            str = q();
        } else if (F10 != 1) {
            return null;
        } else {
            str = o();
        }
        this.f72184c = str;
        return str;
    }

    public abstract int H(int i10);

    public final void I(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte F10 = F();
        if (F10 == 8 || F10 == 6) {
            while (true) {
                byte F11 = F();
                if (F11 != 1) {
                    if (F11 == 8 || F11 == 6) {
                        arrayList.add(Byte.valueOf(F11));
                    } else if (F11 == 9) {
                        if (((Number) C6565s.z0(arrayList)).byteValue() == 8) {
                            C6565s.N(arrayList);
                        } else {
                            int i10 = this.f72182a;
                            throw F.f(i10, "found ] instead of } at path: " + this.f72183b, C());
                        }
                    } else if (F11 == 7) {
                        if (((Number) C6565s.z0(arrayList)).byteValue() == 6) {
                            C6565s.N(arrayList);
                        } else {
                            int i11 = this.f72182a;
                            throw F.f(i11, "found } instead of ] at path: " + this.f72183b, C());
                        }
                    } else if (F11 == 10) {
                        x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6, (Object) null);
                        throw new C6527k();
                    }
                    j();
                    if (arrayList.size() == 0) {
                        return;
                    }
                } else if (z10) {
                    q();
                } else {
                    i();
                }
            }
        } else {
            q();
        }
    }

    public abstract int J();

    public String K(int i10, int i11) {
        return C().subSequence(i10, i11).toString();
    }

    public abstract boolean M();

    public final boolean N(boolean z10) {
        int H10 = H(J());
        int length = C().length() - H10;
        if (length < 4 || H10 == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != C().charAt(H10 + i10)) {
                return false;
            }
        }
        if (length > 4 && C6585b.a(C().charAt(H10 + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f72182a = H10 + 4;
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void P(char c10) {
        int i10 = this.f72182a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f72182a = i10 - 1;
                String q10 = q();
                this.f72182a = i10;
                if (C6496s.c(q10, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f72182a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C6527k();
                }
            } catch (Throwable th2) {
                this.f72182a = i10;
                throw th2;
            }
        }
        z(this, C6585b.a(c10), false, 2, (Object) null);
        throw new C6527k();
    }

    /* access modifiers changed from: protected */
    public void d(int i10, int i11) {
        this.f72185d.append(C(), i10, i11);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z10;
        int J10 = J();
        if (J10 != C().length()) {
            if (C().charAt(J10) == '\"') {
                J10++;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f10 = f(J10);
            if (z10) {
                if (this.f72182a == C().length()) {
                    x(this, "EOF", 0, (String) null, 6, (Object) null);
                    throw new C6527k();
                } else if (C().charAt(this.f72182a) == '\"') {
                    this.f72182a++;
                } else {
                    x(this, "Expected closing quotation mark", 0, (String) null, 6, (Object) null);
                    throw new C6527k();
                }
            }
            return f10;
        }
        x(this, "EOF", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b10) {
        byte j10 = j();
        if (j10 == b10) {
            return j10;
        }
        z(this, b10, false, 2, (Object) null);
        throw new C6527k();
    }

    public abstract void l(char c10);

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (r5 == r0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r0 == r5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r10 == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014d, code lost:
        if (r0 == (r5 - 1)) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        if (r1 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r3 == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015d, code lost:
        if (C().charAt(r5) != '\"') goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0162, code lost:
        x(r17, "Expected closing quotation mark", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw new lf.C6527k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0173, code lost:
        x(r17, "EOF", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        throw new lf.C6527k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        r6.f72182a = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        if (r9 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r0 = ((double) r11) * n(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r0 > 9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        if (r0 < -9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        if (java.lang.Math.floor(r0) != r0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a2, code lost:
        r11 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a4, code lost:
        x(r17, "Can't convert " + r0 + " to Long", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c8, code lost:
        throw new lf.C6527k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c9, code lost:
        x(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d9, code lost:
        throw new lf.C6527k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01da, code lost:
        if (r10 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r11 == Long.MIN_VALUE) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        x(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        throw new lf.C6527k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        x(r17, "Expected numeric literal", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0206, code lost:
        throw new lf.C6527k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r17.J()
            int r0 = r6.H(r0)
            java.lang.CharSequence r1 = r17.C()
            int r1 = r1.length()
            if (r0 >= r1) goto L_0x0207
            r1 = -1
            if (r0 == r1) goto L_0x0207
            java.lang.CharSequence r1 = r17.C()
            char r1 = r1.charAt(r0)
            r2 = 34
            if (r1 != r2) goto L_0x0042
            int r0 = r0 + 1
            java.lang.CharSequence r1 = r17.C()
            int r1 = r1.length()
            if (r0 == r1) goto L_0x0031
            r1 = 1
            goto L_0x0043
        L_0x0031:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x0042:
            r1 = 0
        L_0x0043:
            r7 = 0
            r5 = r0
            r11 = r7
            r13 = r11
            r9 = 0
            r10 = 0
        L_0x004a:
            r15 = 0
        L_0x004b:
            java.lang.CharSequence r16 = r17.C()
            int r3 = r16.length()
            if (r5 == r3) goto L_0x0142
            java.lang.CharSequence r3 = r17.C()
            char r3 = r3.charAt(r5)
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L_0x0065
            r4 = 69
            if (r3 != r4) goto L_0x0093
        L_0x0065:
            if (r9 != 0) goto L_0x0093
            if (r5 == r0) goto L_0x006e
            int r5 = r5 + 1
            r9 = 1
        L_0x006c:
            r15 = 1
            goto L_0x004b
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x0093:
            r4 = 45
            if (r3 != r4) goto L_0x00af
            if (r9 == 0) goto L_0x00af
            if (r5 == r0) goto L_0x009e
            int r5 = r5 + 1
            goto L_0x004a
        L_0x009e:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x00af:
            r2 = 43
            if (r3 != r2) goto L_0x00cd
            if (r9 == 0) goto L_0x00cd
            if (r5 == r0) goto L_0x00bc
            int r5 = r5 + 1
            r2 = 34
            goto L_0x006c
        L_0x00bc:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '+' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x00cd:
            if (r3 != r4) goto L_0x00e9
            if (r5 != r0) goto L_0x00d8
            int r5 = r5 + 1
            r2 = 34
            r10 = 1
            goto L_0x004b
        L_0x00d8:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x00e9:
            byte r2 = mh.C6585b.a(r3)
            if (r2 != 0) goto L_0x0142
            int r5 = r5 + 1
            int r2 = r3 + -48
            if (r2 < 0) goto L_0x011d
            r4 = 10
            if (r2 >= r4) goto L_0x011d
            if (r9 == 0) goto L_0x0103
            long r3 = (long) r4
            long r13 = r13 * r3
            long r2 = (long) r2
            long r13 = r13 + r2
        L_0x00ff:
            r2 = 34
            goto L_0x004b
        L_0x0103:
            long r3 = (long) r4
            long r11 = r11 * r3
            long r2 = (long) r2
            long r11 = r11 - r2
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x010c
            goto L_0x00ff
        L_0x010c:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "' in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x0142:
            if (r5 == r0) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r0 == r5) goto L_0x01f6
            if (r10 == 0) goto L_0x014f
            int r2 = r5 + -1
            if (r0 == r2) goto L_0x01f6
        L_0x014f:
            if (r1 == 0) goto L_0x0184
            if (r3 == 0) goto L_0x0173
            java.lang.CharSequence r0 = r17.C()
            char r0 = r0.charAt(r5)
            r1 = 34
            if (r0 != r1) goto L_0x0162
            int r5 = r5 + 1
            goto L_0x0184
        L_0x0162:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected closing quotation mark"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x0173:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x0184:
            r6.f72182a = r5
            if (r9 == 0) goto L_0x01da
            double r0 = (double) r11
            double r2 = n(r13, r15)
            double r0 = r0 * r2
            r2 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c9
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01c9
            double r2 = java.lang.Math.floor(r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            long r11 = (long) r0
            goto L_0x01da
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't convert "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " to Long"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x01c9:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x01da:
            if (r10 == 0) goto L_0x01dd
            goto L_0x01e4
        L_0x01dd:
            r0 = -9223372036854775808
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e5
            long r11 = -r11
        L_0x01e4:
            return r11
        L_0x01e5:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x01f6:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        L_0x0207:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            lf.k r0 = new lf.k
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.C6584a.m():long");
    }

    public final String o() {
        if (this.f72184c != null) {
            return L();
        }
        return i();
    }

    /* access modifiers changed from: protected */
    public final String p(CharSequence charSequence, int i10, int i11) {
        String str;
        int H10;
        C6496s.h(charSequence, "source");
        char charAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                H10 = H(b(i10, i11));
                if (H10 == -1) {
                    x(this, "Unexpected EOF", H10, (String) null, 4, (Object) null);
                    throw new C6527k();
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    d(i10, i11);
                    H10 = H(i11);
                    if (H10 == -1) {
                        x(this, "Unexpected EOF", H10, (String) null, 4, (Object) null);
                        throw new C6527k();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i11);
                }
            }
            z10 = true;
            i10 = H10;
            i11 = i10;
            charAt = charSequence.charAt(i11);
        }
        if (!z10) {
            str = K(i10, i11);
        } else {
            str = s(i10, i11);
        }
        this.f72182a = i11 + 1;
        return str;
    }

    public final String q() {
        String str;
        if (this.f72184c != null) {
            return L();
        }
        int J10 = J();
        if (J10 >= C().length() || J10 == -1) {
            x(this, "EOF", J10, (String) null, 4, (Object) null);
            throw new C6527k();
        }
        byte a10 = C6585b.a(C().charAt(J10));
        if (a10 == 1) {
            return o();
        }
        if (a10 == 0) {
            boolean z10 = false;
            while (C6585b.a(C().charAt(J10)) == 0) {
                J10++;
                if (J10 >= C().length()) {
                    d(this.f72182a, J10);
                    int H10 = H(J10);
                    if (H10 == -1) {
                        this.f72182a = J10;
                        return s(0, 0);
                    }
                    J10 = H10;
                    z10 = true;
                }
            }
            if (!z10) {
                str = K(this.f72182a, J10);
            } else {
                str = s(this.f72182a, J10);
            }
            this.f72182a = J10;
            return str;
        }
        x(this, "Expected beginning of the string, but got " + C().charAt(J10), 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    public final String r() {
        String q10 = q();
        if (!C6496s.c(q10, "null") || !Q()) {
            return q10;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    public final void t() {
        this.f72184c = null;
    }

    public String toString() {
        return "JsonReader(source='" + C() + "', currentPosition=" + this.f72182a + ')';
    }

    public final void v() {
        if (j() != 10) {
            x(this, "Expected EOF after parsing, but had " + C().charAt(this.f72182a - 1) + " instead", 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    public final Void w(String str, int i10, String str2) {
        String str3;
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = 10 + str2;
        }
        throw F.f(i10, str + " at path: " + this.f72183b.a() + str3, C());
    }

    public final Void y(byte b10, boolean z10) {
        int i10;
        String str;
        String c10 = C6585b.c(b10);
        if (z10) {
            i10 = this.f72182a - 1;
        } else {
            i10 = this.f72182a;
        }
        int i11 = i10;
        if (this.f72182a == C().length() || i11 < 0) {
            str = "EOF";
        } else {
            str = String.valueOf(C().charAt(i11));
        }
        x(this, "Expected " + c10 + ", but had '" + str + "' instead", i11, (String) null, 4, (Object) null);
        throw new C6527k();
    }

    public void u() {
    }
}
