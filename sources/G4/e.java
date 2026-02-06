package G4;

import G4.c;
import Gh.C5404e;
import Gh.C5406g;
import Gh.C5407h;
import com.amazon.a.a.o.b;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.EOFException;

final class e extends c {

    /* renamed from: n  reason: collision with root package name */
    private static final C5407h f31450n = C5407h.f("'\\");

    /* renamed from: o  reason: collision with root package name */
    private static final C5407h f31451o = C5407h.f("\"\\");

    /* renamed from: p  reason: collision with root package name */
    private static final C5407h f31452p = C5407h.f("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q  reason: collision with root package name */
    private static final C5407h f31453q = C5407h.f("\n\r");

    /* renamed from: r  reason: collision with root package name */
    private static final C5407h f31454r = C5407h.f("*/");

    /* renamed from: h  reason: collision with root package name */
    private final C5406g f31455h;

    /* renamed from: i  reason: collision with root package name */
    private final C5404e f31456i;

    /* renamed from: j  reason: collision with root package name */
    private int f31457j = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f31458k;

    /* renamed from: l  reason: collision with root package name */
    private int f31459l;

    /* renamed from: m  reason: collision with root package name */
    private String f31460m;

    e(C5406g gVar) {
        if (gVar != null) {
            this.f31455h = gVar;
            this.f31456i = gVar.x();
            Q(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private String B0(C5407h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long Z10 = this.f31455h.Z(hVar);
            if (Z10 == -1) {
                throw g0("Unterminated string");
            } else if (this.f31456i.I(Z10) == 92) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f31456i.z0(Z10));
                this.f31456i.readByte();
                sb2.append(P0());
            } else if (sb2 == null) {
                String z02 = this.f31456i.z0(Z10);
                this.f31456i.readByte();
                return z02;
            } else {
                sb2.append(this.f31456i.z0(Z10));
                this.f31456i.readByte();
                return sb2.toString();
            }
        }
    }

    private String E0() {
        long Z10 = this.f31455h.Z(f31452p);
        if (Z10 != -1) {
            return this.f31456i.z0(Z10);
        }
        return this.f31456i.p1();
    }

    private int I0() {
        int i10;
        String str;
        String str2;
        byte I10 = this.f31456i.I(0);
        if (I10 == 116 || I10 == 84) {
            str2 = b.f37475af;
            str = "TRUE";
            i10 = 5;
        } else if (I10 == 102 || I10 == 70) {
            str2 = b.f37476ag;
            str = "FALSE";
            i10 = 6;
        } else if (I10 != 110 && I10 != 78) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i10 = 7;
        }
        int length = str2.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f31455h.e0((long) i12)) {
                return 0;
            }
            byte I11 = this.f31456i.I((long) i11);
            if (I11 != str2.charAt(i11) && I11 != str.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f31455h.e0((long) (length + 1)) && t0(this.f31456i.I((long) length))) {
            return 0;
        }
        this.f31456i.skip((long) length);
        this.f31457j = i10;
        return i10;
    }

    private int L0() {
        byte I10;
        char c10;
        boolean z10;
        boolean z11 = true;
        long j10 = 0;
        int i10 = 0;
        char c11 = 0;
        boolean z12 = false;
        boolean z13 = true;
        while (true) {
            int i11 = i10 + 1;
            if (!this.f31455h.e0((long) i11)) {
                break;
            }
            I10 = this.f31456i.I((long) i10);
            if (I10 == 43) {
                c10 = 6;
                if (c11 != 5) {
                    return 0;
                }
            } else if (I10 != 69 && I10 != 101) {
                if (I10 == 45) {
                    c10 = 6;
                    if (c11 == 0) {
                        c11 = 1;
                        z12 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                } else if (I10 != 46) {
                    if (I10 >= 48 && I10 <= 57) {
                        if (c11 == z11 || c11 == 0) {
                            j10 = (long) (-(I10 - 48));
                            c11 = 2;
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return 0;
                            }
                            long j11 = (10 * j10) - ((long) (I10 - 48));
                            int i12 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                            if (i12 > 0 || (i12 == 0 && j11 < j10)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z13 &= z10;
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    }
                } else if (c11 != 2) {
                    return 0;
                } else {
                    c11 = 3;
                }
                i10 = i11;
                z11 = true;
            } else if (c11 != 2 && c11 != 4) {
                return 0;
            } else {
                c11 = 5;
                i10 = i11;
                z11 = true;
            }
            c11 = c10;
            i10 = i11;
            z11 = true;
        }
        if (t0(I10)) {
            return 0;
        }
        if (c11 == 2 && z13 && ((j10 != Long.MIN_VALUE || z12) && (j10 != 0 || !z12))) {
            if (!z12) {
                j10 = -j10;
            }
            this.f31458k = j10;
            this.f31456i.skip((long) i10);
            this.f31457j = 16;
            return 16;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.f31459l = i10;
            this.f31457j = 17;
            return 17;
        }
    }

    private char P0() {
        int i10;
        if (this.f31455h.e0(1)) {
            byte readByte = this.f31456i.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f31435e) {
                    return (char) readByte;
                }
                throw g0("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f31455h.e0(4)) {
                char c10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    byte I10 = this.f31456i.I((long) i11);
                    char c11 = (char) (c10 << 4);
                    if (I10 >= 48 && I10 <= 57) {
                        i10 = I10 - 48;
                    } else if (I10 >= 97 && I10 <= 102) {
                        i10 = I10 - 87;
                    } else if (I10 < 65 || I10 > 70) {
                        throw g0("\\u" + this.f31456i.z0(4));
                    } else {
                        i10 = I10 - 55;
                    }
                    c10 = (char) (c11 + i10);
                }
                this.f31456i.skip(4);
                return c10;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + m());
            }
        } else {
            throw g0("Unterminated escape sequence");
        }
    }

    private void R0(C5407h hVar) {
        while (true) {
            long Z10 = this.f31455h.Z(hVar);
            if (Z10 == -1) {
                throw g0("Unterminated string");
            } else if (this.f31456i.I(Z10) == 92) {
                this.f31456i.skip(Z10 + 1);
                P0();
            } else {
                this.f31456i.skip(Z10 + 1);
                return;
            }
        }
    }

    private boolean W0() {
        boolean z10;
        long j10;
        C5406g gVar = this.f31455h;
        C5407h hVar = f31454r;
        long N02 = gVar.N0(hVar);
        if (N02 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C5404e eVar = this.f31456i;
        if (z10) {
            j10 = N02 + ((long) hVar.O());
        } else {
            j10 = eVar.B0();
        }
        eVar.skip(j10);
        return z10;
    }

    private void h0() {
        if (!this.f31435e) {
            throw g0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int j0() {
        int[] iArr = this.f31432b;
        int i10 = this.f31431a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int x02 = x0(true);
            this.f31456i.readByte();
            if (x02 != 44) {
                if (x02 == 59) {
                    h0();
                } else if (x02 == 93) {
                    this.f31457j = 4;
                    return 4;
                } else {
                    throw g0("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5) {
                int x03 = x0(true);
                this.f31456i.readByte();
                if (x03 != 44) {
                    if (x03 == 59) {
                        h0();
                    } else if (x03 == 125) {
                        this.f31457j = 2;
                        return 2;
                    } else {
                        throw g0("Unterminated object");
                    }
                }
            }
            int x04 = x0(true);
            if (x04 == 34) {
                this.f31456i.readByte();
                this.f31457j = 13;
                return 13;
            } else if (x04 == 39) {
                this.f31456i.readByte();
                h0();
                this.f31457j = 12;
                return 12;
            } else if (x04 != 125) {
                h0();
                if (t0((char) x04)) {
                    this.f31457j = 14;
                    return 14;
                }
                throw g0("Expected name");
            } else if (i11 != 5) {
                this.f31456i.readByte();
                this.f31457j = 2;
                return 2;
            } else {
                throw g0("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int x05 = x0(true);
            this.f31456i.readByte();
            if (x05 != 58) {
                if (x05 == 61) {
                    h0();
                    if (this.f31455h.e0(1) && this.f31456i.I(0) == 62) {
                        this.f31456i.readByte();
                    }
                } else {
                    throw g0("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            iArr[i10 - 1] = 7;
        } else if (i11 == 7) {
            if (x0(false) == -1) {
                this.f31457j = 18;
                return 18;
            }
            h0();
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int x06 = x0(true);
        if (x06 == 34) {
            this.f31456i.readByte();
            this.f31457j = 9;
            return 9;
        } else if (x06 != 39) {
            if (!(x06 == 44 || x06 == 59)) {
                if (x06 == 91) {
                    this.f31456i.readByte();
                    this.f31457j = 3;
                    return 3;
                } else if (x06 != 93) {
                    if (x06 != 123) {
                        int I02 = I0();
                        if (I02 != 0) {
                            return I02;
                        }
                        int L02 = L0();
                        if (L02 != 0) {
                            return L02;
                        }
                        if (t0(this.f31456i.I(0))) {
                            h0();
                            this.f31457j = 10;
                            return 10;
                        }
                        throw g0("Expected value");
                    }
                    this.f31456i.readByte();
                    this.f31457j = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f31456i.readByte();
                    this.f31457j = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                h0();
                this.f31457j = 7;
                return 7;
            }
            throw g0("Unexpected value");
        } else {
            h0();
            this.f31456i.readByte();
            this.f31457j = 8;
            return 8;
        }
    }

    private void n1() {
        long j10;
        long Z10 = this.f31455h.Z(f31453q);
        C5404e eVar = this.f31456i;
        if (Z10 != -1) {
            j10 = Z10 + 1;
        } else {
            j10 = eVar.B0();
        }
        eVar.skip(j10);
    }

    private int o0(String str, c.a aVar) {
        int length = aVar.f31437a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f31437a[i10])) {
                this.f31457j = 0;
                this.f31433c[this.f31431a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean t0(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (!(i10 == 47 || i10 == 61)) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f31456i.skip((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r6.f31455h.e0(2) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        h0();
        r3 = r6.f31456i.I(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r3 == 42) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3 == 47) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r6.f31456i.readByte();
        r6.f31456i.readByte();
        n1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r6.f31456i.readByte();
        r6.f31456i.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (W0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        throw g0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r2 != 35) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        h0();
        n1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            Gh.g r2 = r6.f31455h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.e0(r4)
            if (r2 == 0) goto L_0x0080
            Gh.e r2 = r6.f31456i
            long r4 = (long) r1
            byte r2 = r2.I(r4)
            r4 = 10
            if (r2 == r4) goto L_0x007e
            r4 = 32
            if (r2 == r4) goto L_0x007e
            r4 = 13
            if (r2 == r4) goto L_0x007e
            r4 = 9
            if (r2 != r4) goto L_0x0025
            goto L_0x007e
        L_0x0025:
            Gh.e r3 = r6.f31456i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L_0x0072
            Gh.g r3 = r6.f31455h
            r4 = 2
            boolean r3 = r3.e0(r4)
            if (r3 != 0) goto L_0x003a
            return r2
        L_0x003a:
            r6.h0()
            Gh.e r3 = r6.f31456i
            r4 = 1
            byte r3 = r3.I(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005a
            if (r3 == r1) goto L_0x004c
            return r2
        L_0x004c:
            Gh.e r1 = r6.f31456i
            r1.readByte()
            Gh.e r1 = r6.f31456i
            r1.readByte()
            r6.n1()
            goto L_0x0001
        L_0x005a:
            Gh.e r1 = r6.f31456i
            r1.readByte()
            Gh.e r1 = r6.f31456i
            r1.readByte()
            boolean r1 = r6.W0()
            if (r1 == 0) goto L_0x006b
            goto L_0x0001
        L_0x006b:
            java.lang.String r7 = "Unterminated comment"
            G4.b r7 = r6.g0(r7)
            throw r7
        L_0x0072:
            r1 = 35
            if (r2 != r1) goto L_0x007d
            r6.h0()
            r6.n1()
            goto L_0x0001
        L_0x007d:
            return r2
        L_0x007e:
            r1 = r3
            goto L_0x0002
        L_0x0080:
            if (r7 != 0) goto L_0x0084
            r7 = -1
            return r7
        L_0x0084:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.e.x0(boolean):int");
    }

    private void z1() {
        long Z10 = this.f31455h.Z(f31452p);
        C5404e eVar = this.f31456i;
        if (Z10 == -1) {
            Z10 = eVar.B0();
        }
        eVar.skip(Z10);
    }

    public String E() {
        String str;
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 14) {
            str = E0();
        } else if (i10 == 13) {
            str = B0(f31451o);
        } else if (i10 == 12) {
            str = B0(f31450n);
        } else if (i10 == 15) {
            str = this.f31460m;
        } else {
            throw new a("Expected a name but was " + M() + " at path " + m());
        }
        this.f31457j = 0;
        this.f31433c[this.f31431a - 1] = str;
        return str;
    }

    public String F() {
        String str;
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 10) {
            str = E0();
        } else if (i10 == 9) {
            str = B0(f31451o);
        } else if (i10 == 8) {
            str = B0(f31450n);
        } else if (i10 == 11) {
            str = this.f31460m;
            this.f31460m = null;
        } else if (i10 == 16) {
            str = Long.toString(this.f31458k);
        } else if (i10 == 17) {
            str = this.f31456i.z0((long) this.f31459l);
        } else {
            throw new a("Expected a string but was " + M() + " at path " + m());
        }
        this.f31457j = 0;
        int[] iArr = this.f31434d;
        int i11 = this.f31431a - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public c.b M() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL /*14*/:
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public int T(c.a aVar) {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return o0(this.f31460m, aVar);
        }
        int r12 = this.f31455h.r1(aVar.f31438b);
        if (r12 != -1) {
            this.f31457j = 0;
            this.f31433c[this.f31431a - 1] = aVar.f31437a[r12];
            return r12;
        }
        String str = this.f31433c[this.f31431a - 1];
        String E10 = E();
        int o02 = o0(E10, aVar);
        if (o02 == -1) {
            this.f31457j = 15;
            this.f31460m = E10;
            this.f31433c[this.f31431a - 1] = str;
        }
        return o02;
    }

    public void U() {
        if (!this.f31436f) {
            int i10 = this.f31457j;
            if (i10 == 0) {
                i10 = j0();
            }
            if (i10 == 14) {
                z1();
            } else if (i10 == 13) {
                R0(f31451o);
            } else if (i10 == 12) {
                R0(f31450n);
            } else if (i10 != 15) {
                throw new a("Expected a name but was " + M() + " at path " + m());
            }
            this.f31457j = 0;
            this.f31433c[this.f31431a - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + M() + " at " + m());
    }

    public void V() {
        if (!this.f31436f) {
            int i10 = 0;
            do {
                int i11 = this.f31457j;
                if (i11 == 0) {
                    i11 = j0();
                }
                if (i11 == 3) {
                    Q(1);
                } else if (i11 == 1) {
                    Q(3);
                } else {
                    if (i11 == 4) {
                        i10--;
                        if (i10 >= 0) {
                            this.f31431a--;
                        } else {
                            throw new a("Expected a value but was " + M() + " at path " + m());
                        }
                    } else if (i11 == 2) {
                        i10--;
                        if (i10 >= 0) {
                            this.f31431a--;
                        } else {
                            throw new a("Expected a value but was " + M() + " at path " + m());
                        }
                    } else if (i11 == 14 || i11 == 10) {
                        z1();
                    } else if (i11 == 9 || i11 == 13) {
                        R0(f31451o);
                    } else if (i11 == 8 || i11 == 12) {
                        R0(f31450n);
                    } else if (i11 == 17) {
                        this.f31456i.skip((long) this.f31459l);
                    } else if (i11 == 18) {
                        throw new a("Expected a value but was " + M() + " at path " + m());
                    }
                    this.f31457j = 0;
                }
                i10++;
                this.f31457j = 0;
            } while (i10 != 0);
            int[] iArr = this.f31434d;
            int i12 = this.f31431a;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f31433c[i12 - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + M() + " at " + m());
    }

    public void b() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 3) {
            Q(1);
            this.f31434d[this.f31431a - 1] = 0;
            this.f31457j = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + M() + " at path " + m());
    }

    public void close() {
        this.f31457j = 0;
        this.f31432b[0] = 8;
        this.f31431a = 1;
        this.f31456i.a();
        this.f31455h.close();
    }

    public void f() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 1) {
            Q(3);
            this.f31457j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + M() + " at path " + m());
    }

    public void n() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 4) {
            int i11 = this.f31431a;
            this.f31431a = i11 - 1;
            int[] iArr = this.f31434d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f31457j = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + M() + " at path " + m());
    }

    public void o() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 2) {
            int i11 = this.f31431a;
            int i12 = i11 - 1;
            this.f31431a = i12;
            this.f31433c[i12] = null;
            int[] iArr = this.f31434d;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.f31457j = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + M() + " at path " + m());
    }

    public boolean q() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 2 || i10 == 4 || i10 == 18) {
            return false;
        }
        return true;
    }

    public boolean t() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 5) {
            this.f31457j = 0;
            int[] iArr = this.f31434d;
            int i11 = this.f31431a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f31457j = 0;
            int[] iArr2 = this.f31434d;
            int i12 = this.f31431a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + M() + " at path " + m());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f31455h + ")";
    }

    public double v() {
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 16) {
            this.f31457j = 0;
            int[] iArr = this.f31434d;
            int i11 = this.f31431a - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f31458k;
        }
        if (i10 == 17) {
            this.f31460m = this.f31456i.z0((long) this.f31459l);
        } else if (i10 == 9) {
            this.f31460m = B0(f31451o);
        } else if (i10 == 8) {
            this.f31460m = B0(f31450n);
        } else if (i10 == 10) {
            this.f31460m = E0();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + M() + " at path " + m());
        }
        this.f31457j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f31460m);
            if (this.f31435e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f31460m = null;
                this.f31457j = 0;
                int[] iArr2 = this.f31434d;
                int i12 = this.f31431a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + m());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f31460m + " at path " + m());
        }
    }

    public int y() {
        String str;
        int i10 = this.f31457j;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 16) {
            long j10 = this.f31458k;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f31457j = 0;
                int[] iArr = this.f31434d;
                int i12 = this.f31431a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f31458k + " at path " + m());
        }
        if (i10 == 17) {
            this.f31460m = this.f31456i.z0((long) this.f31459l);
        } else if (i10 == 9 || i10 == 8) {
            if (i10 == 9) {
                str = B0(f31451o);
            } else {
                str = B0(f31450n);
            }
            this.f31460m = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f31457j = 0;
                int[] iArr2 = this.f31434d;
                int i13 = this.f31431a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + M() + " at path " + m());
        }
        this.f31457j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f31460m);
            int i14 = (int) parseDouble;
            if (((double) i14) == parseDouble) {
                this.f31460m = null;
                this.f31457j = 0;
                int[] iArr3 = this.f31434d;
                int i15 = this.f31431a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f31460m + " at path " + m());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f31460m + " at path " + m());
        }
    }
}
