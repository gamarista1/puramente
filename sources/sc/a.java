package Sc;

import Pc.H;
import Pc.y;
import com.amazon.a.a.o.b;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.gson.internal.bind.g;
import com.google.gson.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Reader f52383a;

    /* renamed from: b  reason: collision with root package name */
    private q f52384b = q.LEGACY_STRICT;

    /* renamed from: c  reason: collision with root package name */
    private int f52385c = 255;

    /* renamed from: d  reason: collision with root package name */
    private final char[] f52386d = new char[1024];

    /* renamed from: e  reason: collision with root package name */
    private int f52387e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f52388f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f52389g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f52390h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f52391i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f52392j;

    /* renamed from: k  reason: collision with root package name */
    private int f52393k;

    /* renamed from: l  reason: collision with root package name */
    private String f52394l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f52395m;

    /* renamed from: n  reason: collision with root package name */
    private int f52396n;

    /* renamed from: o  reason: collision with root package name */
    private String[] f52397o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f52398p;

    /* renamed from: Sc.a$a  reason: collision with other inner class name */
    class C0803a extends y {
        C0803a() {
        }

        public void a(a aVar) {
            if (aVar instanceof g) {
                ((g) aVar).L1();
                return;
            }
            int i10 = aVar.f52391i;
            if (i10 == 0) {
                i10 = aVar.q();
            }
            if (i10 == 13) {
                aVar.f52391i = 9;
            } else if (i10 == 12) {
                aVar.f52391i = 8;
            } else if (i10 == 14) {
                aVar.f52391i = 10;
            } else {
                throw aVar.F1("a name");
            }
        }
    }

    static {
        y.f52236a = new C0803a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f52395m = iArr;
        this.f52396n = 1;
        iArr[0] = 6;
        this.f52397o = new String[32];
        this.f52398p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f52383a = reader;
    }

    private boolean A1(String str) {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.f52387e + length > this.f52388f && !y(length)) {
                return false;
            }
            char[] cArr = this.f52386d;
            int i11 = this.f52387e;
            if (cArr[i11] == 10) {
                this.f52389g++;
                this.f52390h = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.f52386d[this.f52387e + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.f52387e++;
        }
    }

    private void B1() {
        char c10;
        do {
            if (this.f52387e < this.f52388f || y(1)) {
                char[] cArr = this.f52386d;
                int i10 = this.f52387e;
                int i11 = i10 + 1;
                this.f52387e = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f52389g++;
                    this.f52390h = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        n();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C1() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f52387e
            int r2 = r1 + r0
            int r3 = r4.f52388f
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f52386d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.n()
        L_0x004b:
            int r1 = r4.f52387e
            int r1 = r1 + r0
            r4.f52387e = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f52387e = r1
            r0 = 1
            boolean r0 = r4.y(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.a.C1():void");
    }

    private String E(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f52396n;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f52395m[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f52398p[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f52397o[i10];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        n();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String E0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f52387e
            int r4 = r3 + r2
            int r5 = r6.f52388f
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f52386d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.n()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f52386d
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.y(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f52386d
            int r4 = r6.f52387e
            r0.append(r3, r4, r2)
            int r3 = r6.f52387e
            int r3 = r3 + r2
            r6.f52387e = r3
            r2 = 1
            boolean r2 = r6.y(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f52386d
            int r3 = r6.f52387e
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f52386d
            int r3 = r6.f52387e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f52387e
            int r2 = r2 + r1
            r6.f52387e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.a.E0():java.lang.String");
    }

    private d E1(String str) {
        throw new d(str + U() + "\nSee " + H.a("malformed-json"));
    }

    /* access modifiers changed from: private */
    public IllegalStateException F1(String str) {
        String str2;
        if (I0() == b.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        return new IllegalStateException("Expected " + str + " but was " + I0() + U() + "\nSee " + H.a(str2));
    }

    private int L0() {
        int i10;
        String str;
        String str2;
        boolean z10;
        char c10 = this.f52386d[this.f52387e];
        if (c10 == 't' || c10 == 'T') {
            str2 = b.f37475af;
            str = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str2 = b.f37476ag;
            str = "FALSE";
            i10 = 6;
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i10 = 7;
        }
        if (this.f52384b != q.STRICT) {
            z10 = true;
        } else {
            z10 = false;
        }
        int length = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f52387e + i11 >= this.f52388f && !y(i11 + 1)) {
                return 0;
            }
            char c11 = this.f52386d[this.f52387e + i11];
            if (c11 != str2.charAt(i11) && (!z10 || c11 != str.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f52387e + length < this.f52388f || y(length + 1)) && T(this.f52386d[this.f52387e + length])) {
            return 0;
        }
        this.f52387e += length;
        this.f52391i = i10;
        return i10;
    }

    private int P0() {
        char c10;
        char c11;
        boolean z10;
        char[] cArr = this.f52386d;
        int i10 = this.f52387e;
        int i11 = this.f52388f;
        int i12 = 0;
        int i13 = 0;
        char c12 = 0;
        boolean z11 = false;
        boolean z12 = true;
        long j10 = 0;
        while (true) {
            if (i10 + i13 == i11) {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!y(i13 + 1)) {
                    break;
                }
                i10 = this.f52387e;
                i11 = this.f52388f;
            }
            c10 = cArr[i10 + i13];
            if (c10 == '+') {
                c11 = 6;
                i12 = 0;
                if (c12 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i12 = 0;
                if (c12 != 2 && c12 != 4) {
                    return 0;
                }
                c12 = 5;
                i13++;
            } else if (c10 != '-') {
                c11 = 3;
                if (c10 == '.') {
                    i12 = 0;
                    if (c12 != 2) {
                        return 0;
                    }
                } else if (c10 >= '0' && c10 <= '9') {
                    if (c12 == 1 || c12 == 0) {
                        j10 = (long) (-(c10 - '0'));
                        c12 = 2;
                    } else if (c12 != 2) {
                        if (c12 == 3) {
                            i12 = 0;
                            c12 = 4;
                        } else if (c12 == 5 || c12 == 6) {
                            i12 = 0;
                            c12 = 7;
                        }
                        i13++;
                    } else if (j10 == 0) {
                        return 0;
                    } else {
                        long j11 = (10 * j10) - ((long) (c10 - '0'));
                        int i14 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                        if (i14 > 0 || (i14 == 0 && j11 < j10)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z12 &= z10;
                        j10 = j11;
                    }
                    i12 = 0;
                    i13++;
                }
            } else {
                c11 = 6;
                i12 = 0;
                if (c12 == 0) {
                    c12 = 1;
                    z11 = true;
                    i13++;
                } else if (c12 != 5) {
                    return 0;
                }
            }
            c12 = c11;
            i13++;
        }
        if (T(c10)) {
            return 0;
        }
        if (c12 == 2 && z12 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
            if (!z11) {
                j10 = -j10;
            }
            this.f52392j = j10;
            this.f52387e += i13;
            this.f52391i = 15;
            return 15;
        } else if (c12 != 2 && c12 != 4 && c12 != 7) {
            return 0;
        } else {
            this.f52393k = i13;
            this.f52391i = 16;
            return 16;
        }
    }

    private void R0(int i10) {
        int i11 = this.f52396n;
        if (i11 - 1 < this.f52385c) {
            int[] iArr = this.f52395m;
            if (i11 == iArr.length) {
                int i12 = i11 * 2;
                this.f52395m = Arrays.copyOf(iArr, i12);
                this.f52398p = Arrays.copyOf(this.f52398p, i12);
                this.f52397o = (String[]) Arrays.copyOf(this.f52397o, i12);
            }
            int[] iArr2 = this.f52395m;
            int i13 = this.f52396n;
            this.f52396n = i13 + 1;
            iArr2[i13] = i10;
            return;
        }
        throw new d("Nesting limit " + this.f52385c + " reached" + U());
    }

    private boolean T(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        n();
        return false;
    }

    private char W0() {
        int i10;
        if (this.f52387e != this.f52388f || y(1)) {
            char[] cArr = this.f52386d;
            int i11 = this.f52387e;
            int i12 = i11 + 1;
            this.f52387e = i12;
            char c10 = cArr[i11];
            if (c10 != 10) {
                if (c10 != '\"') {
                    if (c10 != '\'') {
                        if (!(c10 == '/' || c10 == '\\')) {
                            if (c10 == 'b') {
                                return 8;
                            }
                            if (c10 == 'f') {
                                return 12;
                            }
                            if (c10 == 'n') {
                                return 10;
                            }
                            if (c10 == 'r') {
                                return 13;
                            }
                            if (c10 == 't') {
                                return 9;
                            }
                            if (c10 != 'u') {
                                throw E1("Invalid escape sequence");
                            } else if (i11 + 5 <= this.f52388f || y(4)) {
                                int i13 = this.f52387e;
                                int i14 = i13 + 4;
                                int i15 = 0;
                                while (i13 < i14) {
                                    char c11 = this.f52386d[i13];
                                    int i16 = i15 << 4;
                                    if (c11 >= '0' && c11 <= '9') {
                                        i10 = c11 - '0';
                                    } else if (c11 >= 'a' && c11 <= 'f') {
                                        i10 = c11 - 'W';
                                    } else if (c11 < 'A' || c11 > 'F') {
                                        throw E1("Malformed Unicode escape \\u" + new String(this.f52386d, this.f52387e, 4));
                                    } else {
                                        i10 = c11 - '7';
                                    }
                                    i15 = i16 + i10;
                                    i13++;
                                }
                                this.f52387e += 4;
                                return (char) i15;
                            } else {
                                throw E1("Unterminated escape sequence");
                            }
                        }
                    }
                }
                return c10;
            } else if (this.f52384b != q.STRICT) {
                this.f52389g++;
                this.f52390h = i12;
            } else {
                throw E1("Cannot escape a newline character in strict mode");
            }
            if (this.f52384b == q.STRICT) {
                throw E1("Invalid escaped character \"'\" in strict mode");
            }
            return c10;
        }
        throw E1("Unterminated escape sequence");
    }

    private void n() {
        if (this.f52384b != q.LENIENT) {
            throw E1("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void o() {
        o0(true);
        int i10 = this.f52387e;
        this.f52387e = i10 - 1;
        if (i10 + 4 <= this.f52388f || y(5)) {
            int i11 = this.f52387e;
            char[] cArr = this.f52386d;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == 10) {
                this.f52387e = i11 + 5;
            }
        }
    }

    private int o0(boolean z10) {
        char[] cArr = this.f52386d;
        int i10 = this.f52387e;
        int i11 = this.f52388f;
        while (true) {
            if (i10 == i11) {
                this.f52387e = i10;
                if (y(1)) {
                    i10 = this.f52387e;
                    i11 = this.f52388f;
                } else if (!z10) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + U());
                }
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == 10) {
                this.f52389g++;
                this.f52390h = i12;
            } else if (!(c10 == ' ' || c10 == 13 || c10 == 9)) {
                if (c10 == '/') {
                    this.f52387e = i12;
                    if (i12 == i11) {
                        this.f52387e = i10;
                        boolean y10 = y(2);
                        this.f52387e++;
                        if (!y10) {
                            return c10;
                        }
                    }
                    n();
                    int i13 = this.f52387e;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f52387e = i13 + 1;
                        if (A1("*/")) {
                            i10 = this.f52387e + 2;
                            i11 = this.f52388f;
                        } else {
                            throw E1("Unterminated comment");
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f52387e = i13 + 1;
                        B1();
                        i10 = this.f52387e;
                        i11 = this.f52388f;
                    }
                } else if (c10 == '#') {
                    this.f52387e = i12;
                    n();
                    B1();
                    i10 = this.f52387e;
                    i11 = this.f52388f;
                } else {
                    this.f52387e = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r1 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.f52387e = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String x0(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f52386d
            r1 = 0
        L_0x0003:
            int r2 = r10.f52387e
            int r3 = r10.f52388f
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x006c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.q r8 = r10.f52384b
            com.google.gson.q r9 = com.google.gson.q.STRICT
            if (r8 != r9) goto L_0x0024
            r8 = 32
            if (r2 < r8) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            Sc.d r11 = r10.E1(r11)
            throw r11
        L_0x0024:
            if (r2 != r11) goto L_0x003a
            r10.f52387e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0032
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L_0x0032:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x003a:
            r8 = 92
            if (r2 != r8) goto L_0x005f
            r10.f52387e = r7
            int r7 = r7 - r3
            int r2 = r7 + -1
            if (r1 != 0) goto L_0x0050
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L_0x0050:
            r1.append(r0, r3, r2)
            char r2 = r10.W0()
            r1.append(r2)
            int r2 = r10.f52387e
            int r3 = r10.f52388f
            goto L_0x0007
        L_0x005f:
            r5 = 10
            if (r2 != r5) goto L_0x006a
            int r2 = r10.f52389g
            int r2 = r2 + r6
            r10.f52389g = r2
            r10.f52390h = r7
        L_0x006a:
            r2 = r7
            goto L_0x0009
        L_0x006c:
            if (r1 != 0) goto L_0x007c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x007c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f52387e = r2
            boolean r2 = r10.y(r6)
            if (r2 == 0) goto L_0x008b
            goto L_0x0003
        L_0x008b:
            java.lang.String r11 = "Unterminated string"
            Sc.d r11 = r10.E1(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.a.x0(char):java.lang.String");
    }

    private boolean y(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f52386d;
        int i13 = this.f52390h;
        int i14 = this.f52387e;
        this.f52390h = i13 - i14;
        int i15 = this.f52388f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f52388f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f52388f = 0;
        }
        this.f52387e = 0;
        do {
            Reader reader = this.f52383a;
            int i17 = this.f52388f;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f52388f + read;
            this.f52388f = i11;
            if (this.f52389g == 0 && (i12 = this.f52390h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f52387e++;
                this.f52390h = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private void z1(char c10) {
        char[] cArr = this.f52386d;
        do {
            int i10 = this.f52387e;
            int i11 = this.f52388f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f52387e = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f52387e = i12;
                    W0();
                    i10 = this.f52387e;
                    i11 = this.f52388f;
                } else {
                    if (c11 == 10) {
                        this.f52389g++;
                        this.f52390h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f52387e = i10;
        } while (y(1));
        throw E1("Unterminated string");
    }

    public String B0() {
        String str;
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 10) {
            str = E0();
        } else if (i10 == 8) {
            str = x0('\'');
        } else if (i10 == 9) {
            str = x0('\"');
        } else if (i10 == 11) {
            str = this.f52394l;
            this.f52394l = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f52392j);
        } else if (i10 == 16) {
            str = new String(this.f52386d, this.f52387e, this.f52393k);
            this.f52387e += this.f52393k;
        } else {
            throw F1("a string");
        }
        this.f52391i = 0;
        int[] iArr = this.f52398p;
        int i11 = this.f52396n - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r7.f52391i = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D1() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f52391i
            if (r2 != 0) goto L_0x000a
            int r2 = r7.q()
        L_0x000a:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006f;
                case 2: goto L_0x005f;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0074
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.f52387e
            int r3 = r7.f52393k
            int r2 = r2 + r3
            r7.f52387e = r2
            goto L_0x0074
        L_0x001e:
            r7.C1()
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f52397o
            int r3 = r7.f52396n
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x002b:
            r7.z1(r4)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f52397o
            int r3 = r7.f52396n
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0038:
            r7.z1(r3)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f52397o
            int r3 = r7.f52396n
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0045:
            r7.C1()
            goto L_0x0074
        L_0x0049:
            r7.z1(r4)
            goto L_0x0074
        L_0x004d:
            r7.z1(r3)
            goto L_0x0074
        L_0x0051:
            int r2 = r7.f52396n
            int r2 = r2 - r6
            r7.f52396n = r2
        L_0x0056:
            int r1 = r1 + -1
            goto L_0x0074
        L_0x0059:
            r7.R0(r6)
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x0074
        L_0x005f:
            if (r1 != 0) goto L_0x0069
            java.lang.String[] r2 = r7.f52397o
            int r3 = r7.f52396n
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L_0x0069:
            int r2 = r7.f52396n
            int r2 = r2 - r6
            r7.f52396n = r2
            goto L_0x0056
        L_0x006f:
            r2 = 3
            r7.R0(r2)
            goto L_0x005c
        L_0x0074:
            r7.f52391i = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f52398p
            int r1 = r7.f52396n
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.a.D1():void");
    }

    public String F() {
        return E(true);
    }

    public final q I() {
        return this.f52384b;
    }

    public b I0() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                return b.NAME;
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean M() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2 || i10 == 4 || i10 == 17) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        if (this.f52384b == q.LENIENT) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public String U() {
        return " at line " + (this.f52389g + 1) + " column " + ((this.f52387e - this.f52390h) + 1) + " path " + m();
    }

    public boolean V() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 5) {
            this.f52391i = 0;
            int[] iArr = this.f52398p;
            int i11 = this.f52396n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f52391i = 0;
            int[] iArr2 = this.f52398p;
            int i12 = this.f52396n - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw F1("a boolean");
        }
    }

    public void b() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 3) {
            R0(1);
            this.f52398p[this.f52396n - 1] = 0;
            this.f52391i = 0;
            return;
        }
        throw F1("BEGIN_ARRAY");
    }

    public void close() {
        this.f52391i = 0;
        this.f52395m[0] = 8;
        this.f52396n = 1;
        this.f52383a.close();
    }

    public void f() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 1) {
            R0(3);
            this.f52391i = 0;
            return;
        }
        throw F1("BEGIN_OBJECT");
    }

    public double f0() {
        char c10;
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f52391i = 0;
            int[] iArr = this.f52398p;
            int i11 = this.f52396n - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f52392j;
        }
        if (i10 == 16) {
            this.f52394l = new String(this.f52386d, this.f52387e, this.f52393k);
            this.f52387e += this.f52393k;
        } else if (i10 == 8 || i10 == 9) {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f52394l = x0(c10);
        } else if (i10 == 10) {
            this.f52394l = E0();
        } else if (i10 != 11) {
            throw F1("a double");
        }
        this.f52391i = 11;
        double parseDouble = Double.parseDouble(this.f52394l);
        if (this.f52384b == q.LENIENT || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f52394l = null;
            this.f52391i = 0;
            int[] iArr2 = this.f52398p;
            int i12 = this.f52396n - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw E1("JSON forbids NaN and infinities: " + parseDouble);
    }

    public int g0() {
        char c10;
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            long j10 = this.f52392j;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f52391i = 0;
                int[] iArr = this.f52398p;
                int i12 = this.f52396n - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f52392j + U());
        }
        if (i10 == 16) {
            this.f52394l = new String(this.f52386d, this.f52387e, this.f52393k);
            this.f52387e += this.f52393k;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f52394l = E0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f52394l = x0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f52394l);
                this.f52391i = 0;
                int[] iArr2 = this.f52398p;
                int i13 = this.f52396n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw F1("an int");
        }
        this.f52391i = 11;
        double parseDouble = Double.parseDouble(this.f52394l);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f52394l = null;
            this.f52391i = 0;
            int[] iArr3 = this.f52398p;
            int i15 = this.f52396n - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f52394l + U());
    }

    public long h0() {
        char c10;
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f52391i = 0;
            int[] iArr = this.f52398p;
            int i11 = this.f52396n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f52392j;
        }
        if (i10 == 16) {
            this.f52394l = new String(this.f52386d, this.f52387e, this.f52393k);
            this.f52387e += this.f52393k;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f52394l = E0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f52394l = x0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f52394l);
                this.f52391i = 0;
                int[] iArr2 = this.f52398p;
                int i12 = this.f52396n - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw F1("a long");
        }
        this.f52391i = 11;
        double parseDouble = Double.parseDouble(this.f52394l);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f52394l = null;
            this.f52391i = 0;
            int[] iArr3 = this.f52398p;
            int i13 = this.f52396n - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f52394l + U());
    }

    public String j0() {
        String str;
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 14) {
            str = E0();
        } else if (i10 == 12) {
            str = x0('\'');
        } else if (i10 == 13) {
            str = x0('\"');
        } else {
            throw F1("a name");
        }
        this.f52391i = 0;
        this.f52397o[this.f52396n - 1] = str;
        return str;
    }

    public String m() {
        return E(false);
    }

    public final void n1(q qVar) {
        Objects.requireNonNull(qVar);
        this.f52384b = qVar;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        int o02;
        int[] iArr = this.f52395m;
        int i10 = this.f52396n;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int o03 = o0(true);
            if (o03 != 44) {
                if (o03 == 59) {
                    n();
                } else if (o03 == 93) {
                    this.f52391i = 4;
                    return 4;
                } else {
                    throw E1("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (o02 = o0(true)) != 44) {
                if (o02 == 59) {
                    n();
                } else if (o02 == 125) {
                    this.f52391i = 2;
                    return 2;
                } else {
                    throw E1("Unterminated object");
                }
            }
            int o04 = o0(true);
            if (o04 == 34) {
                this.f52391i = 13;
                return 13;
            } else if (o04 == 39) {
                n();
                this.f52391i = 12;
                return 12;
            } else if (o04 != 125) {
                n();
                this.f52387e--;
                if (T((char) o04)) {
                    this.f52391i = 14;
                    return 14;
                }
                throw E1("Expected name");
            } else if (i11 != 5) {
                this.f52391i = 2;
                return 2;
            } else {
                throw E1("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int o05 = o0(true);
            if (o05 != 58) {
                if (o05 == 61) {
                    n();
                    if (this.f52387e < this.f52388f || y(1)) {
                        char[] cArr = this.f52386d;
                        int i12 = this.f52387e;
                        if (cArr[i12] == '>') {
                            this.f52387e = i12 + 1;
                        }
                    }
                } else {
                    throw E1("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            if (this.f52384b == q.LENIENT) {
                o();
            }
            this.f52395m[this.f52396n - 1] = 7;
        } else if (i11 == 7) {
            if (o0(false) == -1) {
                this.f52391i = 17;
                return 17;
            }
            n();
            this.f52387e--;
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int o06 = o0(true);
        if (o06 == 34) {
            this.f52391i = 9;
            return 9;
        } else if (o06 != 39) {
            if (!(o06 == 44 || o06 == 59)) {
                if (o06 == 91) {
                    this.f52391i = 3;
                    return 3;
                } else if (o06 != 93) {
                    if (o06 != 123) {
                        this.f52387e--;
                        int L02 = L0();
                        if (L02 != 0) {
                            return L02;
                        }
                        int P02 = P0();
                        if (P02 != 0) {
                            return P02;
                        }
                        if (T(this.f52386d[this.f52387e])) {
                            n();
                            this.f52391i = 10;
                            return 10;
                        }
                        throw E1("Expected value");
                    }
                    this.f52391i = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f52391i = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                n();
                this.f52387e--;
                this.f52391i = 7;
                return 7;
            }
            throw E1("Unexpected value");
        } else {
            n();
            this.f52391i = 8;
            return 8;
        }
    }

    public void t() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 4) {
            int i11 = this.f52396n;
            this.f52396n = i11 - 1;
            int[] iArr = this.f52398p;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f52391i = 0;
            return;
        }
        throw F1("END_ARRAY");
    }

    public void t0() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 7) {
            this.f52391i = 0;
            int[] iArr = this.f52398p;
            int i11 = this.f52396n - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw F1("null");
    }

    public String toString() {
        return getClass().getSimpleName() + U();
    }

    public void v() {
        int i10 = this.f52391i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2) {
            int i11 = this.f52396n;
            int i12 = i11 - 1;
            this.f52396n = i12;
            this.f52397o[i12] = null;
            int[] iArr = this.f52398p;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f52391i = 0;
            return;
        }
        throw F1("END_OBJECT");
    }
}
