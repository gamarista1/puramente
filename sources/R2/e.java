package R2;

import W2.s;
import android.util.Pair;
import android.util.SparseArray;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import f2.C1961B;
import f2.C1973h;
import f2.C1974i;
import f2.C1979n;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import i2.q;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import j2.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import z2.C2963g;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.O;
import z2.P;
import z2.r;
import z2.u;

public class e implements C2972p {

    /* renamed from: e0  reason: collision with root package name */
    public static final u f5690e0 = new d();

    /* renamed from: f0  reason: collision with root package name */
    private static final byte[] f5691f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public static final byte[] f5692g0 = L.q0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0  reason: collision with root package name */
    private static final byte[] f5693h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0  reason: collision with root package name */
    private static final byte[] f5694i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public static final UUID f5695j0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public static final Map f5696k0;

    /* renamed from: A  reason: collision with root package name */
    private boolean f5697A;

    /* renamed from: B  reason: collision with root package name */
    private long f5698B;

    /* renamed from: C  reason: collision with root package name */
    private long f5699C;

    /* renamed from: D  reason: collision with root package name */
    private long f5700D;

    /* renamed from: E  reason: collision with root package name */
    private q f5701E;

    /* renamed from: F  reason: collision with root package name */
    private q f5702F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f5703G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f5704H;

    /* renamed from: I  reason: collision with root package name */
    private int f5705I;

    /* renamed from: J  reason: collision with root package name */
    private long f5706J;

    /* renamed from: K  reason: collision with root package name */
    private long f5707K;

    /* renamed from: L  reason: collision with root package name */
    private int f5708L;

    /* renamed from: M  reason: collision with root package name */
    private int f5709M;

    /* renamed from: N  reason: collision with root package name */
    private int[] f5710N;

    /* renamed from: O  reason: collision with root package name */
    private int f5711O;

    /* renamed from: P  reason: collision with root package name */
    private int f5712P;

    /* renamed from: Q  reason: collision with root package name */
    private int f5713Q;

    /* renamed from: R  reason: collision with root package name */
    private int f5714R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f5715S;

    /* renamed from: T  reason: collision with root package name */
    private long f5716T;

    /* renamed from: U  reason: collision with root package name */
    private int f5717U;

    /* renamed from: V  reason: collision with root package name */
    private int f5718V;

    /* renamed from: W  reason: collision with root package name */
    private int f5719W;

    /* renamed from: X  reason: collision with root package name */
    private boolean f5720X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f5721Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f5722Z;

    /* renamed from: a  reason: collision with root package name */
    private final c f5723a;

    /* renamed from: a0  reason: collision with root package name */
    private int f5724a0;

    /* renamed from: b  reason: collision with root package name */
    private final g f5725b;

    /* renamed from: b0  reason: collision with root package name */
    private byte f5726b0;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f5727c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f5728c0;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5729d;

    /* renamed from: d0  reason: collision with root package name */
    private r f5730d0;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5731e;

    /* renamed from: f  reason: collision with root package name */
    private final s.a f5732f;

    /* renamed from: g  reason: collision with root package name */
    private final C2073A f5733g;

    /* renamed from: h  reason: collision with root package name */
    private final C2073A f5734h;

    /* renamed from: i  reason: collision with root package name */
    private final C2073A f5735i;

    /* renamed from: j  reason: collision with root package name */
    private final C2073A f5736j;

    /* renamed from: k  reason: collision with root package name */
    private final C2073A f5737k;

    /* renamed from: l  reason: collision with root package name */
    private final C2073A f5738l;

    /* renamed from: m  reason: collision with root package name */
    private final C2073A f5739m;

    /* renamed from: n  reason: collision with root package name */
    private final C2073A f5740n;

    /* renamed from: o  reason: collision with root package name */
    private final C2073A f5741o;

    /* renamed from: p  reason: collision with root package name */
    private final C2073A f5742p;

    /* renamed from: q  reason: collision with root package name */
    private ByteBuffer f5743q;

    /* renamed from: r  reason: collision with root package name */
    private long f5744r;

    /* renamed from: s  reason: collision with root package name */
    private long f5745s;

    /* renamed from: t  reason: collision with root package name */
    private long f5746t;

    /* renamed from: u  reason: collision with root package name */
    private long f5747u;

    /* renamed from: v  reason: collision with root package name */
    private long f5748v;

    /* renamed from: w  reason: collision with root package name */
    private c f5749w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f5750x;

    /* renamed from: y  reason: collision with root package name */
    private int f5751y;

    /* renamed from: z  reason: collision with root package name */
    private long f5752z;

    private final class b implements b {
        private b() {
        }

        public void a(int i10) {
            e.this.q(i10);
        }

        public void b(int i10, double d10) {
            e.this.t(i10, d10);
        }

        public void c(int i10, long j10) {
            e.this.z(i10, j10);
        }

        public int d(int i10) {
            return e.this.w(i10);
        }

        public boolean e(int i10) {
            return e.this.B(i10);
        }

        public void f(int i10, String str) {
            e.this.J(i10, str);
        }

        public void g(int i10, long j10, long j11) {
            e.this.I(i10, j10, j11);
        }

        public void h(int i10, int i11, C2973q qVar) {
            e.this.n(i10, i11, qVar);
        }
    }

    protected static final class c {

        /* renamed from: A  reason: collision with root package name */
        public int f5754A = -1;

        /* renamed from: B  reason: collision with root package name */
        public int f5755B = -1;

        /* renamed from: C  reason: collision with root package name */
        public int f5756C = 1000;

        /* renamed from: D  reason: collision with root package name */
        public int f5757D = 200;

        /* renamed from: E  reason: collision with root package name */
        public float f5758E = -1.0f;

        /* renamed from: F  reason: collision with root package name */
        public float f5759F = -1.0f;

        /* renamed from: G  reason: collision with root package name */
        public float f5760G = -1.0f;

        /* renamed from: H  reason: collision with root package name */
        public float f5761H = -1.0f;

        /* renamed from: I  reason: collision with root package name */
        public float f5762I = -1.0f;

        /* renamed from: J  reason: collision with root package name */
        public float f5763J = -1.0f;

        /* renamed from: K  reason: collision with root package name */
        public float f5764K = -1.0f;

        /* renamed from: L  reason: collision with root package name */
        public float f5765L = -1.0f;

        /* renamed from: M  reason: collision with root package name */
        public float f5766M = -1.0f;

        /* renamed from: N  reason: collision with root package name */
        public float f5767N = -1.0f;

        /* renamed from: O  reason: collision with root package name */
        public byte[] f5768O;

        /* renamed from: P  reason: collision with root package name */
        public int f5769P = 1;

        /* renamed from: Q  reason: collision with root package name */
        public int f5770Q = -1;

        /* renamed from: R  reason: collision with root package name */
        public int f5771R = 8000;

        /* renamed from: S  reason: collision with root package name */
        public long f5772S = 0;

        /* renamed from: T  reason: collision with root package name */
        public long f5773T = 0;

        /* renamed from: U  reason: collision with root package name */
        public P f5774U;

        /* renamed from: V  reason: collision with root package name */
        public boolean f5775V;

        /* renamed from: W  reason: collision with root package name */
        public boolean f5776W = true;
        /* access modifiers changed from: private */

        /* renamed from: X  reason: collision with root package name */
        public String f5777X = "eng";

        /* renamed from: Y  reason: collision with root package name */
        public O f5778Y;

        /* renamed from: Z  reason: collision with root package name */
        public int f5779Z;

        /* renamed from: a  reason: collision with root package name */
        public String f5780a;

        /* renamed from: b  reason: collision with root package name */
        public String f5781b;

        /* renamed from: c  reason: collision with root package name */
        public int f5782c;

        /* renamed from: d  reason: collision with root package name */
        public int f5783d;

        /* renamed from: e  reason: collision with root package name */
        public int f5784e;

        /* renamed from: f  reason: collision with root package name */
        public int f5785f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f5786g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5787h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f5788i;

        /* renamed from: j  reason: collision with root package name */
        public O.a f5789j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f5790k;

        /* renamed from: l  reason: collision with root package name */
        public C1979n f5791l;

        /* renamed from: m  reason: collision with root package name */
        public int f5792m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f5793n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f5794o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f5795p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f5796q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f5797r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f5798s = -1;

        /* renamed from: t  reason: collision with root package name */
        public float f5799t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f5800u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public float f5801v = 0.0f;

        /* renamed from: w  reason: collision with root package name */
        public byte[] f5802w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f5803x = -1;

        /* renamed from: y  reason: collision with root package name */
        public boolean f5804y = false;

        /* renamed from: z  reason: collision with root package name */
        public int f5805z = -1;

        protected c() {
        }

        /* access modifiers changed from: private */
        public void f() {
            C2076a.e(this.f5778Y);
        }

        private byte[] g(String str) {
            byte[] bArr = this.f5790k;
            if (bArr != null) {
                return bArr;
            }
            throw C1961B.a("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        private byte[] h() {
            if (this.f5758E == -1.0f || this.f5759F == -1.0f || this.f5760G == -1.0f || this.f5761H == -1.0f || this.f5762I == -1.0f || this.f5763J == -1.0f || this.f5764K == -1.0f || this.f5765L == -1.0f || this.f5766M == -1.0f || this.f5767N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.f5758E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5759F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5760G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5761H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5762I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5763J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5764K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f5765L * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f5766M + 0.5f)));
            order.putShort((short) ((int) (this.f5767N + 0.5f)));
            order.putShort((short) this.f5756C);
            order.putShort((short) this.f5757D);
            return bArr;
        }

        private static Pair k(C2073A a10) {
            try {
                a10.V(16);
                long x10 = a10.x();
                if (x10 == 1482049860) {
                    return new Pair("video/divx", (Object) null);
                }
                if (x10 == 859189832) {
                    return new Pair("video/3gpp", (Object) null);
                }
                if (x10 == 826496599) {
                    byte[] e10 = a10.e();
                    for (int f10 = a10.f() + 20; f10 < e10.length - 4; f10++) {
                        if (e10[f10] == 0 && e10[f10 + 1] == 0 && e10[f10 + 2] == 1 && e10[f10 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e10, f10, e10.length)));
                        }
                    }
                    throw C1961B.a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                p.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C1961B.a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static boolean l(C2073A a10) {
            try {
                int z10 = a10.z();
                if (z10 == 1) {
                    return true;
                }
                if (z10 != 65534) {
                    return false;
                }
                a10.U(24);
                if (a10.A() == e.f5695j0.getMostSignificantBits() && a10.A() == e.f5695j0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C1961B.a("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        private static List m(byte[] bArr) {
            byte b10;
            byte b11;
            try {
                if (bArr[0] == 2) {
                    int i10 = 0;
                    int i11 = 1;
                    while (true) {
                        b10 = bArr[i11];
                        if ((b10 & 255) != 255) {
                            break;
                        }
                        i10 += 255;
                        i11++;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 + (b10 & 255);
                    int i14 = 0;
                    while (true) {
                        b11 = bArr[i12];
                        if ((b11 & 255) != 255) {
                            break;
                        }
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (b11 & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i18)];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw C1961B.a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw C1961B.a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw C1961B.a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw C1961B.a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C1961B.a("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* access modifiers changed from: private */
        public boolean o(boolean z10) {
            if ("A_OPUS".equals(this.f5781b)) {
                return z10;
            }
            if (this.f5785f > 0) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0227, code lost:
            r14 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0236, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0237, code lost:
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0238, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x023c, code lost:
            r1 = null;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0265, code lost:
            r5 = 0;
            r6 = -1;
            r14 = -1;
            r18 = r2;
            r2 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a5, code lost:
            r1 = null;
            r2 = null;
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ab, code lost:
            r1 = null;
            r2 = null;
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ae, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x038b, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ac, code lost:
            r1 = null;
            r2 = null;
            r6 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x043d, code lost:
            if (r0.f5768O == null) goto L_0x0450;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x043f, code lost:
            r4 = z2.C2970n.a(new i2.C2073A(r0.f5768O));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x044a, code lost:
            if (r4 == null) goto L_0x0450;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x044c, code lost:
            r2 = r4.f29259c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x0450, code lost:
            r4 = r16;
            r15 = r0.f5776W;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0456, code lost:
            if (r0.f5775V == false) goto L_0x045a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0458, code lost:
            r3 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x045a, code lost:
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x045b, code lost:
            r3 = r3 | r15;
            r15 = new f2.s.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0465, code lost:
            if (f2.C1960A.l(r4) == false) goto L_0x0479;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0467, code lost:
            r15.N(r0.f5769P).p0(r0.f5771R).i0(r14);
            r5 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x047d, code lost:
            if (f2.C1960A.o(r4) == false) goto L_0x0573;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0481, code lost:
            if (r0.f5797r != 0) goto L_0x0495;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0483, code lost:
            r7 = r0.f5795p;
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0486, code lost:
            if (r7 != -1) goto L_0x048a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x0488, code lost:
            r7 = r0.f5792m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x048a, code lost:
            r0.f5795p = r7;
            r7 = r0.f5796q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x048e, code lost:
            if (r7 != -1) goto L_0x0492;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x0490, code lost:
            r7 = r0.f5793n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0492, code lost:
            r0.f5796q = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0495, code lost:
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0496, code lost:
            r7 = r0.f5795p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0498, code lost:
            if (r7 == r8) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x049a, code lost:
            r9 = r0.f5796q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x049c, code lost:
            if (r9 == r8) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x049e, code lost:
            r7 = ((float) (r0.f5793n * r7)) / ((float) (r0.f5792m * r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a8, code lost:
            r7 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04ac, code lost:
            if (r0.f5804y == false) goto L_0x04dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x04ae, code lost:
            r10 = new f2.C1974i.b().d(r0.f5805z).c(r0.f5755B).e(r0.f5754A).f(h()).g(r0.f5794o).b(r0.f5794o).a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x04df, code lost:
            if (r0.f5780a == null) goto L_0x04fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x04eb, code lost:
            if (R2.e.d().containsKey(r0.f5780a) == false) goto L_0x04fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ed, code lost:
            r8 = ((java.lang.Integer) R2.e.d().get(r0.f5780a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ff, code lost:
            if (r0.f5798s != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0508, code lost:
            if (java.lang.Float.compare(r0.f5799t, 0.0f) != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0510, code lost:
            if (java.lang.Float.compare(r0.f5800u, 0.0f) != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0518, code lost:
            if (java.lang.Float.compare(r0.f5801v, 0.0f) != 0) goto L_0x051b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0523, code lost:
            if (java.lang.Float.compare(r0.f5801v, 90.0f) != 0) goto L_0x0528;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0525, code lost:
            r5 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0530, code lost:
            if (java.lang.Float.compare(r0.f5801v, -180.0f) == 0) goto L_0x054a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x053a, code lost:
            if (java.lang.Float.compare(r0.f5801v, 180.0f) != 0) goto L_0x053d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0545, code lost:
            if (java.lang.Float.compare(r0.f5801v, -90.0f) != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0547, code lost:
            r5 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x054a, code lost:
            r5 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x054d, code lost:
            r5 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x054e, code lost:
            r15.t0(r0.f5792m).Y(r0.f5793n).k0(r7).n0(r5).l0(r0.f5802w).r0(r0.f5803x).P(r10);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0577, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x057d, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x0583, code lost:
            if ("text/vtt".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0589, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x058f, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x0595, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x059e, code lost:
            throw f2.C1961B.a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x059f, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x05a2, code lost:
            if (r0.f5780a == null) goto L_0x05b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x05ae, code lost:
            if (R2.e.d().containsKey(r0.f5780a) != false) goto L_0x05b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x05b0, code lost:
            r15.c0(r0.f5780a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b5, code lost:
            r1 = r15.Z(r21).o0(r4).f0(r6).e0(r0.f5777X).q0(r3).b0(r1).O(r2).U(r0.f5791l).K();
            r2 = r20.d(r0.f5782c, r5);
            r0.f5778Y = r2;
            r2.c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x05ec, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(z2.r r20, int r21) {
            /*
                r19 = this;
                r0 = r19
                r2 = 16
                java.lang.String r5 = r0.f5781b
                r5.hashCode()
                java.lang.String r7 = "application/dvbsubs"
                java.lang.String r8 = "application/vobsub"
                java.lang.String r9 = "application/pgs"
                java.lang.String r11 = "text/x-ssa"
                java.lang.String r12 = "text/vtt"
                java.lang.String r13 = "application/x-subrip"
                r15 = 8
                r3 = 3
                java.lang.String r6 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r4 = "MatroskaExtractor"
                java.lang.String r14 = "audio/x-unknown"
                r10 = 0
                int r17 = r5.hashCode()
                switch(r17) {
                    case -2095576542: goto L_0x01d2;
                    case -2095575984: goto L_0x01c6;
                    case -1985379776: goto L_0x01ba;
                    case -1784763192: goto L_0x01ae;
                    case -1730367663: goto L_0x01a2;
                    case -1482641358: goto L_0x0196;
                    case -1482641357: goto L_0x018a;
                    case -1373388978: goto L_0x017e;
                    case -933872740: goto L_0x0171;
                    case -538363189: goto L_0x0163;
                    case -538363109: goto L_0x0155;
                    case -425012669: goto L_0x0147;
                    case -356037306: goto L_0x0139;
                    case 62923557: goto L_0x012b;
                    case 62923603: goto L_0x011d;
                    case 62927045: goto L_0x010f;
                    case 82318131: goto L_0x0102;
                    case 82338133: goto L_0x00f4;
                    case 82338134: goto L_0x00e6;
                    case 99146302: goto L_0x00d8;
                    case 444813526: goto L_0x00ca;
                    case 542569478: goto L_0x00bc;
                    case 635596514: goto L_0x00ae;
                    case 725948237: goto L_0x00a0;
                    case 725957860: goto L_0x0093;
                    case 738597099: goto L_0x0086;
                    case 855502857: goto L_0x0079;
                    case 1045209816: goto L_0x006c;
                    case 1422270023: goto L_0x005f;
                    case 1809237540: goto L_0x0052;
                    case 1950749482: goto L_0x0045;
                    case 1950789798: goto L_0x0038;
                    case 1951062397: goto L_0x002b;
                    default: goto L_0x0028;
                }
            L_0x0028:
                r1 = -1
                goto L_0x01dd
            L_0x002b:
                java.lang.String r1 = "A_OPUS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0034
                goto L_0x0028
            L_0x0034:
                r1 = 32
                goto L_0x01dd
            L_0x0038:
                java.lang.String r1 = "A_FLAC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0041
                goto L_0x0028
            L_0x0041:
                r1 = 31
                goto L_0x01dd
            L_0x0045:
                java.lang.String r1 = "A_EAC3"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x004e
                goto L_0x0028
            L_0x004e:
                r1 = 30
                goto L_0x01dd
            L_0x0052:
                java.lang.String r1 = "V_MPEG2"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x005b
                goto L_0x0028
            L_0x005b:
                r1 = 29
                goto L_0x01dd
            L_0x005f:
                java.lang.String r1 = "S_TEXT/UTF8"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0068
                goto L_0x0028
            L_0x0068:
                r1 = 28
                goto L_0x01dd
            L_0x006c:
                java.lang.String r1 = "S_TEXT/WEBVTT"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0075
                goto L_0x0028
            L_0x0075:
                r1 = 27
                goto L_0x01dd
            L_0x0079:
                java.lang.String r1 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0082
                goto L_0x0028
            L_0x0082:
                r1 = 26
                goto L_0x01dd
            L_0x0086:
                java.lang.String r1 = "S_TEXT/ASS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x008f
                goto L_0x0028
            L_0x008f:
                r1 = 25
                goto L_0x01dd
            L_0x0093:
                java.lang.String r1 = "A_PCM/INT/LIT"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x009c
                goto L_0x0028
            L_0x009c:
                r1 = 24
                goto L_0x01dd
            L_0x00a0:
                java.lang.String r1 = "A_PCM/INT/BIG"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00aa
                goto L_0x0028
            L_0x00aa:
                r1 = 23
                goto L_0x01dd
            L_0x00ae:
                java.lang.String r1 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00b8
                goto L_0x0028
            L_0x00b8:
                r1 = 22
                goto L_0x01dd
            L_0x00bc:
                java.lang.String r1 = "A_DTS/EXPRESS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00c6
                goto L_0x0028
            L_0x00c6:
                r1 = 21
                goto L_0x01dd
            L_0x00ca:
                java.lang.String r1 = "V_THEORA"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00d4
                goto L_0x0028
            L_0x00d4:
                r1 = 20
                goto L_0x01dd
            L_0x00d8:
                java.lang.String r1 = "S_HDMV/PGS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00e2
                goto L_0x0028
            L_0x00e2:
                r1 = 19
                goto L_0x01dd
            L_0x00e6:
                java.lang.String r1 = "V_VP9"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00f0
                goto L_0x0028
            L_0x00f0:
                r1 = 18
                goto L_0x01dd
            L_0x00f4:
                java.lang.String r1 = "V_VP8"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00fe
                goto L_0x0028
            L_0x00fe:
                r1 = 17
                goto L_0x01dd
            L_0x0102:
                java.lang.String r1 = "V_AV1"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x010c
                goto L_0x0028
            L_0x010c:
                r1 = r2
                goto L_0x01dd
            L_0x010f:
                java.lang.String r1 = "A_DTS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0119
                goto L_0x0028
            L_0x0119:
                r1 = 15
                goto L_0x01dd
            L_0x011d:
                java.lang.String r1 = "A_AC3"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0127
                goto L_0x0028
            L_0x0127:
                r1 = 14
                goto L_0x01dd
            L_0x012b:
                java.lang.String r1 = "A_AAC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0135
                goto L_0x0028
            L_0x0135:
                r1 = 13
                goto L_0x01dd
            L_0x0139:
                java.lang.String r1 = "A_DTS/LOSSLESS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0143
                goto L_0x0028
            L_0x0143:
                r1 = 12
                goto L_0x01dd
            L_0x0147:
                java.lang.String r1 = "S_VOBSUB"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0151
                goto L_0x0028
            L_0x0151:
                r1 = 11
                goto L_0x01dd
            L_0x0155:
                java.lang.String r1 = "V_MPEG4/ISO/AVC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x015f
                goto L_0x0028
            L_0x015f:
                r1 = 10
                goto L_0x01dd
            L_0x0163:
                java.lang.String r1 = "V_MPEG4/ISO/ASP"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x016d
                goto L_0x0028
            L_0x016d:
                r1 = 9
                goto L_0x01dd
            L_0x0171:
                java.lang.String r1 = "S_DVBSUB"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x017b
                goto L_0x0028
            L_0x017b:
                r1 = r15
                goto L_0x01dd
            L_0x017e:
                java.lang.String r1 = "V_MS/VFW/FOURCC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0188
                goto L_0x0028
            L_0x0188:
                r1 = 7
                goto L_0x01dd
            L_0x018a:
                java.lang.String r1 = "A_MPEG/L3"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0194
                goto L_0x0028
            L_0x0194:
                r1 = 6
                goto L_0x01dd
            L_0x0196:
                java.lang.String r1 = "A_MPEG/L2"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01a0
                goto L_0x0028
            L_0x01a0:
                r1 = 5
                goto L_0x01dd
            L_0x01a2:
                java.lang.String r1 = "A_VORBIS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01ac
                goto L_0x0028
            L_0x01ac:
                r1 = 4
                goto L_0x01dd
            L_0x01ae:
                java.lang.String r1 = "A_TRUEHD"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01b8
                goto L_0x0028
            L_0x01b8:
                r1 = r3
                goto L_0x01dd
            L_0x01ba:
                java.lang.String r1 = "A_MS/ACM"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01c4
                goto L_0x0028
            L_0x01c4:
                r1 = 2
                goto L_0x01dd
            L_0x01c6:
                java.lang.String r1 = "V_MPEG4/ISO/SP"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01d0
                goto L_0x0028
            L_0x01d0:
                r1 = 1
                goto L_0x01dd
            L_0x01d2:
                java.lang.String r1 = "V_MPEG4/ISO/AP"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01dc
                goto L_0x0028
            L_0x01dc:
                r1 = 0
            L_0x01dd:
                switch(r1) {
                    case 0: goto L_0x042c;
                    case 1: goto L_0x042c;
                    case 2: goto L_0x03d6;
                    case 3: goto L_0x03c8;
                    case 4: goto L_0x03b6;
                    case 5: goto L_0x03b2;
                    case 6: goto L_0x03a9;
                    case 7: goto L_0x038e;
                    case 8: goto L_0x0378;
                    case 9: goto L_0x042c;
                    case 10: goto L_0x035d;
                    case 11: goto L_0x034f;
                    case 12: goto L_0x034b;
                    case 13: goto L_0x032d;
                    case 14: goto L_0x0329;
                    case 15: goto L_0x0325;
                    case 16: goto L_0x0321;
                    case 17: goto L_0x031d;
                    case 18: goto L_0x0319;
                    case 19: goto L_0x0315;
                    case 20: goto L_0x0311;
                    case 21: goto L_0x0325;
                    case 22: goto L_0x02e7;
                    case 23: goto L_0x02b1;
                    case 24: goto L_0x0281;
                    case 25: goto L_0x026f;
                    case 26: goto L_0x024c;
                    case 27: goto L_0x0247;
                    case 28: goto L_0x0242;
                    case 29: goto L_0x023f;
                    case 30: goto L_0x023a;
                    case 31: goto L_0x022a;
                    case 32: goto L_0x01e7;
                    default: goto L_0x01e0;
                }
            L_0x01e0:
                java.lang.String r1 = "Unrecognized codec identifier."
                f2.B r1 = f2.C1961B.a(r1, r10)
                throw r1
            L_0x01e7:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r3)
                java.lang.String r2 = r0.f5781b
                byte[] r2 = r0.g(r2)
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r15)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r4)
                long r5 = r0.f5772S
                java.nio.ByteBuffer r2 = r2.putLong(r5)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r15)
                java.nio.ByteBuffer r2 = r2.order(r4)
                long r4 = r0.f5773T
                java.nio.ByteBuffer r2 = r2.putLong(r4)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                r6 = 5760(0x1680, float:8.071E-42)
                r2 = r10
                r5 = 0
            L_0x0227:
                r14 = -1
                goto L_0x043b
            L_0x022a:
                java.lang.String r1 = r0.f5781b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
            L_0x0236:
                r2 = r10
            L_0x0237:
                r5 = 0
            L_0x0238:
                r6 = -1
                goto L_0x0227
            L_0x023a:
                java.lang.String r16 = "audio/eac3"
            L_0x023c:
                r1 = r10
                r2 = r1
                goto L_0x0237
            L_0x023f:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x023c
            L_0x0242:
                r1 = r10
                r2 = r1
                r16 = r13
                goto L_0x0237
            L_0x0247:
                r1 = r10
                r2 = r1
                r16 = r12
                goto L_0x0237
            L_0x024c:
                i2.A r1 = new i2.A
                java.lang.String r2 = r0.f5781b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                z2.C r1 = z2.C.a(r1)
                java.util.List r2 = r1.f29075a
                int r4 = r1.f29076b
                r0.f5779Z = r4
                java.lang.String r1 = r1.f29086l
                java.lang.String r16 = "video/hevc"
            L_0x0265:
                r5 = 0
                r6 = -1
                r14 = -1
                r18 = r2
                r2 = r1
                r1 = r18
                goto L_0x043b
            L_0x026f:
                byte[] r1 = R2.e.f5692g0
                java.lang.String r2 = r0.f5781b
                byte[] r2 = r0.g(r2)
                com.google.common.collect.v r1 = com.google.common.collect.C4770v.I(r1, r2)
                r2 = r10
                r16 = r11
                goto L_0x0237
            L_0x0281:
                int r1 = r0.f5770Q
                int r1 = i2.L.d0(r1)
                if (r1 != 0) goto L_0x02aa
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported little endian PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f5770Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                i2.p.h(r4, r1)
            L_0x02a5:
                r1 = r10
                r2 = r1
                r16 = r14
                goto L_0x0237
            L_0x02aa:
                r14 = r1
            L_0x02ab:
                r1 = r10
                r2 = r1
                r5 = 0
            L_0x02ae:
                r6 = -1
                goto L_0x043b
            L_0x02b1:
                int r1 = r0.f5770Q
                if (r1 != r15) goto L_0x02b7
                r14 = r3
                goto L_0x02ab
            L_0x02b7:
                if (r1 != r2) goto L_0x02bc
                r14 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x02ab
            L_0x02bc:
                r2 = 24
                if (r1 != r2) goto L_0x02c3
                r14 = 1342177280(0x50000000, float:8.5899346E9)
                goto L_0x02ab
            L_0x02c3:
                r2 = 32
                if (r1 != r2) goto L_0x02ca
                r14 = 1610612736(0x60000000, float:3.6893488E19)
                goto L_0x02ab
            L_0x02ca:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported big endian PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f5770Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                i2.p.h(r4, r1)
                goto L_0x02a5
            L_0x02e7:
                int r1 = r0.f5770Q
                r2 = 32
                if (r1 != r2) goto L_0x02f4
                r1 = r10
                r2 = r1
                r5 = 0
                r6 = -1
                r14 = 4
                goto L_0x043b
            L_0x02f4:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported floating point PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f5770Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                i2.p.h(r4, r1)
                goto L_0x02a5
            L_0x0311:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x023c
            L_0x0315:
                r16 = r9
                goto L_0x023c
            L_0x0319:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x023c
            L_0x031d:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
                goto L_0x023c
            L_0x0321:
                java.lang.String r16 = "video/av01"
                goto L_0x023c
            L_0x0325:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x023c
            L_0x0329:
                java.lang.String r16 = "audio/ac3"
                goto L_0x023c
            L_0x032d:
                java.lang.String r1 = r0.f5781b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r2 = r0.f5790k
                z2.a$b r2 = z2.C2957a.e(r2)
                int r4 = r2.f29157a
                r0.f5771R = r4
                int r4 = r2.f29158b
                r0.f5769P = r4
                java.lang.String r2 = r2.f29159c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0237
            L_0x034b:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x023c
            L_0x034f:
                java.lang.String r1 = r0.f5781b
                byte[] r1 = r0.g(r1)
                com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r1)
                r16 = r8
                goto L_0x0236
            L_0x035d:
                i2.A r1 = new i2.A
                java.lang.String r2 = r0.f5781b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                z2.d r1 = z2.C2960d.b(r1)
                java.util.List r2 = r1.f29179a
                int r4 = r1.f29180b
                r0.f5779Z = r4
                java.lang.String r1 = r1.f29190l
                java.lang.String r16 = "video/avc"
                goto L_0x0265
            L_0x0378:
                r1 = 4
                byte[] r2 = new byte[r1]
                java.lang.String r4 = r0.f5781b
                byte[] r4 = r0.g(r4)
                r5 = 0
                java.lang.System.arraycopy(r4, r5, r2, r5, r1)
                com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r2)
                r16 = r7
            L_0x038b:
                r2 = r10
                goto L_0x0238
            L_0x038e:
                r5 = 0
                i2.A r1 = new i2.A
                java.lang.String r2 = r0.f5781b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = k(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x038b
            L_0x03a9:
                r5 = 0
                java.lang.String r16 = "audio/mpeg"
            L_0x03ac:
                r1 = r10
                r2 = r1
                r6 = 4096(0x1000, float:5.74E-42)
                goto L_0x0227
            L_0x03b2:
                r5 = 0
                java.lang.String r16 = "audio/mpeg-L2"
                goto L_0x03ac
            L_0x03b6:
                r5 = 0
                java.lang.String r1 = r0.f5781b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = m(r1)
                java.lang.String r16 = "audio/vorbis"
                r6 = 8192(0x2000, float:1.14794E-41)
                r2 = r10
                goto L_0x0227
            L_0x03c8:
                r5 = 0
                z2.P r1 = new z2.P
                r1.<init>()
                r0.f5774U = r1
                java.lang.String r16 = "audio/true-hd"
                r1 = r10
                r2 = r1
                goto L_0x0238
            L_0x03d6:
                r5 = 0
                i2.A r1 = new i2.A
                java.lang.String r2 = r0.f5781b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                boolean r1 = l(r1)
                if (r1 == 0) goto L_0x0417
                int r1 = r0.f5770Q
                int r1 = i2.L.d0(r1)
                if (r1 != 0) goto L_0x0412
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f5770Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                i2.p.h(r4, r1)
            L_0x040c:
                r1 = r10
                r2 = r1
                r16 = r14
                goto L_0x0238
            L_0x0412:
                r14 = r1
                r1 = r10
                r2 = r1
                goto L_0x02ae
            L_0x0417:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r2)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                i2.p.h(r4, r1)
                goto L_0x040c
            L_0x042c:
                r5 = 0
                byte[] r1 = r0.f5790k
                if (r1 != 0) goto L_0x0433
                r1 = r10
                goto L_0x0437
            L_0x0433:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0437:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x038b
            L_0x043b:
                byte[] r4 = r0.f5768O
                if (r4 == 0) goto L_0x0450
                i2.A r4 = new i2.A
                byte[] r15 = r0.f5768O
                r4.<init>((byte[]) r15)
                z2.n r4 = z2.C2970n.a(r4)
                if (r4 == 0) goto L_0x0450
                java.lang.String r2 = r4.f29259c
                java.lang.String r16 = "video/dolby-vision"
            L_0x0450:
                r4 = r16
                boolean r15 = r0.f5776W
                boolean r3 = r0.f5775V
                if (r3 == 0) goto L_0x045a
                r3 = 2
                goto L_0x045b
            L_0x045a:
                r3 = r5
            L_0x045b:
                r3 = r3 | r15
                f2.s$b r15 = new f2.s$b
                r15.<init>()
                boolean r16 = f2.C1960A.l(r4)
                if (r16 == 0) goto L_0x0479
                int r5 = r0.f5769P
                f2.s$b r5 = r15.N(r5)
                int r7 = r0.f5771R
                f2.s$b r5 = r5.p0(r7)
                r5.i0(r14)
                r5 = 1
                goto L_0x05a0
            L_0x0479:
                boolean r14 = f2.C1960A.o(r4)
                if (r14 == 0) goto L_0x0573
                int r7 = r0.f5797r
                if (r7 != 0) goto L_0x0495
                int r7 = r0.f5795p
                r8 = -1
                if (r7 != r8) goto L_0x048a
                int r7 = r0.f5792m
            L_0x048a:
                r0.f5795p = r7
                int r7 = r0.f5796q
                if (r7 != r8) goto L_0x0492
                int r7 = r0.f5793n
            L_0x0492:
                r0.f5796q = r7
                goto L_0x0496
            L_0x0495:
                r8 = -1
            L_0x0496:
                int r7 = r0.f5795p
                if (r7 == r8) goto L_0x04a8
                int r9 = r0.f5796q
                if (r9 == r8) goto L_0x04a8
                int r11 = r0.f5793n
                int r11 = r11 * r7
                float r7 = (float) r11
                int r11 = r0.f5792m
                int r11 = r11 * r9
                float r9 = (float) r11
                float r7 = r7 / r9
                goto L_0x04aa
            L_0x04a8:
                r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x04aa:
                boolean r9 = r0.f5804y
                if (r9 == 0) goto L_0x04dd
                byte[] r9 = r19.h()
                f2.i$b r10 = new f2.i$b
                r10.<init>()
                int r11 = r0.f5805z
                f2.i$b r10 = r10.d(r11)
                int r11 = r0.f5755B
                f2.i$b r10 = r10.c(r11)
                int r11 = r0.f5754A
                f2.i$b r10 = r10.e(r11)
                f2.i$b r9 = r10.f(r9)
                int r10 = r0.f5794o
                f2.i$b r9 = r9.g(r10)
                int r10 = r0.f5794o
                f2.i$b r9 = r9.b(r10)
                f2.i r10 = r9.a()
            L_0x04dd:
                java.lang.String r9 = r0.f5780a
                if (r9 == 0) goto L_0x04fd
                java.util.Map r9 = R2.e.f5696k0
                java.lang.String r11 = r0.f5780a
                boolean r9 = r9.containsKey(r11)
                if (r9 == 0) goto L_0x04fd
                java.util.Map r8 = R2.e.f5696k0
                java.lang.String r9 = r0.f5780a
                java.lang.Object r8 = r8.get(r9)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
            L_0x04fd:
                int r9 = r0.f5798s
                if (r9 != 0) goto L_0x054d
                float r9 = r0.f5799t
                r11 = 0
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 != 0) goto L_0x054d
                float r9 = r0.f5800u
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 != 0) goto L_0x054d
                float r9 = r0.f5801v
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 != 0) goto L_0x051b
                goto L_0x054e
            L_0x051b:
                float r5 = r0.f5801v
                r9 = 1119092736(0x42b40000, float:90.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 != 0) goto L_0x0528
                r5 = 90
                goto L_0x054e
            L_0x0528:
                float r5 = r0.f5801v
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 == 0) goto L_0x054a
                float r5 = r0.f5801v
                r9 = 1127481344(0x43340000, float:180.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 != 0) goto L_0x053d
                goto L_0x054a
            L_0x053d:
                float r5 = r0.f5801v
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 != 0) goto L_0x054d
                r5 = 270(0x10e, float:3.78E-43)
                goto L_0x054e
            L_0x054a:
                r5 = 180(0xb4, float:2.52E-43)
                goto L_0x054e
            L_0x054d:
                r5 = r8
            L_0x054e:
                int r8 = r0.f5792m
                f2.s$b r8 = r15.t0(r8)
                int r9 = r0.f5793n
                f2.s$b r8 = r8.Y(r9)
                f2.s$b r7 = r8.k0(r7)
                f2.s$b r5 = r7.n0(r5)
                byte[] r7 = r0.f5802w
                f2.s$b r5 = r5.l0(r7)
                int r7 = r0.f5803x
                f2.s$b r5 = r5.r0(r7)
                r5.P(r10)
                r5 = 2
                goto L_0x05a0
            L_0x0573:
                boolean r5 = r13.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r11.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r12.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r8.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r9.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r7.equals(r4)
                if (r5 == 0) goto L_0x0598
                goto L_0x059f
            L_0x0598:
                java.lang.String r1 = "Unexpected MIME type."
                f2.B r1 = f2.C1961B.a(r1, r10)
                throw r1
            L_0x059f:
                r5 = 3
            L_0x05a0:
                java.lang.String r7 = r0.f5780a
                if (r7 == 0) goto L_0x05b5
                java.util.Map r7 = R2.e.f5696k0
                java.lang.String r8 = r0.f5780a
                boolean r7 = r7.containsKey(r8)
                if (r7 != 0) goto L_0x05b5
                java.lang.String r7 = r0.f5780a
                r15.c0(r7)
            L_0x05b5:
                r7 = r21
                f2.s$b r7 = r15.Z(r7)
                f2.s$b r4 = r7.o0(r4)
                f2.s$b r4 = r4.f0(r6)
                java.lang.String r6 = r0.f5777X
                f2.s$b r4 = r4.e0(r6)
                f2.s$b r3 = r4.q0(r3)
                f2.s$b r1 = r3.b0(r1)
                f2.s$b r1 = r1.O(r2)
                f2.n r2 = r0.f5791l
                f2.s$b r1 = r1.U(r2)
                f2.s r1 = r1.K()
                int r2 = r0.f5782c
                r3 = r20
                z2.O r2 = r3.d(r2, r5)
                r0.f5778Y = r2
                r2.c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: R2.e.c.i(z2.r, int):void");
        }

        public void j() {
            P p10 = this.f5774U;
            if (p10 != null) {
                p10.a(this.f5778Y, this.f5789j);
            }
        }

        public void n() {
            P p10 = this.f5774U;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f5696k0 = Collections.unmodifiableMap(hashMap);
    }

    public e(s.a aVar, int i10) {
        this(new a(), i10, aVar);
    }

    private static boolean A(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL /*14*/:
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h /*32*/:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] C() {
        return new C2972p[]{new e(s.a.f8664a, 2)};
    }

    private boolean D(I i10, long j10) {
        if (this.f5697A) {
            this.f5699C = j10;
            i10.f29106a = this.f5698B;
            this.f5697A = false;
            return true;
        }
        if (this.f5750x) {
            long j11 = this.f5699C;
            if (j11 != -1) {
                i10.f29106a = j11;
                this.f5699C = -1;
                return true;
            }
        }
        return false;
    }

    private void E(C2973q qVar, int i10) {
        if (this.f5735i.g() < i10) {
            if (this.f5735i.b() < i10) {
                C2073A a10 = this.f5735i;
                a10.c(Math.max(a10.b() * 2, i10));
            }
            qVar.readFully(this.f5735i.e(), this.f5735i.g(), i10 - this.f5735i.g());
            this.f5735i.T(i10);
        }
    }

    private void F() {
        this.f5717U = 0;
        this.f5718V = 0;
        this.f5719W = 0;
        this.f5720X = false;
        this.f5721Y = false;
        this.f5722Z = false;
        this.f5724a0 = 0;
        this.f5726b0 = 0;
        this.f5728c0 = false;
        this.f5738l.Q(0);
    }

    private long G(long j10) {
        long j11 = this.f5746t;
        if (j11 != -9223372036854775807L) {
            return L.U0(j10, j11, 1000);
        }
        throw C1961B.a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private static void H(String str, long j10, byte[] bArr) {
        int i10;
        byte[] bArr2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bArr2 = u(j10, "%01d:%02d:%02d:%02d", 10000);
                i10 = 21;
                break;
            case 1:
                bArr2 = u(j10, "%02d:%02d:%02d.%03d", 1000);
                i10 = 25;
                break;
            case 2:
                bArr2 = u(j10, "%02d:%02d:%02d,%03d", 1000);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    private int K(C2973q qVar, c cVar, int i10, boolean z10) {
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f5781b)) {
            L(qVar, f5691f0, i10);
            return s();
        } else if ("S_TEXT/ASS".equals(cVar.f5781b)) {
            L(qVar, f5693h0, i10);
            return s();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f5781b)) {
            L(qVar, f5694i0, i10);
            return s();
        } else {
            O o10 = cVar.f5778Y;
            boolean z12 = true;
            if (!this.f5720X) {
                if (cVar.f5787h) {
                    this.f5713Q &= -1073741825;
                    int i12 = 128;
                    if (!this.f5721Y) {
                        qVar.readFully(this.f5735i.e(), 0, 1);
                        this.f5717U++;
                        if ((this.f5735i.e()[0] & 128) != 128) {
                            this.f5726b0 = this.f5735i.e()[0];
                            this.f5721Y = true;
                        } else {
                            throw C1961B.a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b10 = this.f5726b0;
                    if ((b10 & 1) == 1) {
                        if ((b10 & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f5713Q |= 1073741824;
                        if (!this.f5728c0) {
                            qVar.readFully(this.f5740n.e(), 0, 8);
                            this.f5717U += 8;
                            this.f5728c0 = true;
                            byte[] e10 = this.f5735i.e();
                            if (!z11) {
                                i12 = 0;
                            }
                            e10[0] = (byte) (i12 | 8);
                            this.f5735i.U(0);
                            o10.e(this.f5735i, 1, 1);
                            this.f5718V++;
                            this.f5740n.U(0);
                            o10.e(this.f5740n, 8, 1);
                            this.f5718V += 8;
                        }
                        if (z11) {
                            if (!this.f5722Z) {
                                qVar.readFully(this.f5735i.e(), 0, 1);
                                this.f5717U++;
                                this.f5735i.U(0);
                                this.f5724a0 = this.f5735i.H();
                                this.f5722Z = true;
                            }
                            int i13 = this.f5724a0 * 4;
                            this.f5735i.Q(i13);
                            qVar.readFully(this.f5735i.e(), 0, i13);
                            this.f5717U += i13;
                            short s10 = (short) ((this.f5724a0 / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f5743q;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f5743q = ByteBuffer.allocate(i14);
                            }
                            this.f5743q.position(0);
                            this.f5743q.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.f5724a0;
                                if (i15 >= i11) {
                                    break;
                                }
                                int L10 = this.f5735i.L();
                                if (i15 % 2 == 0) {
                                    this.f5743q.putShort((short) (L10 - i16));
                                } else {
                                    this.f5743q.putInt(L10 - i16);
                                }
                                i15++;
                                i16 = L10;
                            }
                            int i17 = (i10 - this.f5717U) - i16;
                            if (i11 % 2 == 1) {
                                this.f5743q.putInt(i17);
                            } else {
                                this.f5743q.putShort((short) i17);
                                this.f5743q.putInt(0);
                            }
                            this.f5741o.S(this.f5743q.array(), i14);
                            o10.e(this.f5741o, i14, 1);
                            this.f5718V += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f5788i;
                    if (bArr != null) {
                        this.f5738l.S(bArr, bArr.length);
                    }
                }
                if (cVar.o(z10)) {
                    this.f5713Q |= 268435456;
                    this.f5742p.Q(0);
                    int g10 = (this.f5738l.g() + i10) - this.f5717U;
                    this.f5735i.Q(4);
                    this.f5735i.e()[0] = (byte) ((g10 >> 24) & 255);
                    this.f5735i.e()[1] = (byte) ((g10 >> 16) & 255);
                    this.f5735i.e()[2] = (byte) ((g10 >> 8) & 255);
                    this.f5735i.e()[3] = (byte) (g10 & 255);
                    o10.e(this.f5735i, 4, 2);
                    this.f5718V += 4;
                }
                this.f5720X = true;
            }
            int g11 = i10 + this.f5738l.g();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f5781b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f5781b)) {
                if (cVar.f5774U != null) {
                    if (this.f5738l.g() != 0) {
                        z12 = false;
                    }
                    C2076a.g(z12);
                    cVar.f5774U.d(qVar);
                }
                while (true) {
                    int i18 = this.f5717U;
                    if (i18 >= g11) {
                        break;
                    }
                    int M10 = M(qVar, o10, g11 - i18);
                    this.f5717U += M10;
                    this.f5718V += M10;
                }
            } else {
                byte[] e11 = this.f5734h.e();
                e11[0] = 0;
                e11[1] = 0;
                e11[2] = 0;
                int i19 = cVar.f5779Z;
                int i20 = 4 - i19;
                while (this.f5717U < g11) {
                    int i21 = this.f5719W;
                    if (i21 == 0) {
                        N(qVar, e11, i20, i19);
                        this.f5717U += i19;
                        this.f5734h.U(0);
                        this.f5719W = this.f5734h.L();
                        this.f5733g.U(0);
                        o10.f(this.f5733g, 4);
                        this.f5718V += 4;
                    } else {
                        int M11 = M(qVar, o10, i21);
                        this.f5717U += M11;
                        this.f5718V += M11;
                        this.f5719W -= M11;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f5781b)) {
                this.f5736j.U(0);
                o10.f(this.f5736j, 4);
                this.f5718V += 4;
            }
            return s();
        }
    }

    private void L(C2973q qVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f5739m.b() < length) {
            this.f5739m.R(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f5739m.e(), 0, bArr.length);
        }
        qVar.readFully(this.f5739m.e(), bArr.length, i10);
        this.f5739m.U(0);
        this.f5739m.T(length);
    }

    private int M(C2973q qVar, O o10, int i10) {
        int a10 = this.f5738l.a();
        if (a10 <= 0) {
            return o10.a(qVar, i10, false);
        }
        int min = Math.min(i10, a10);
        o10.f(this.f5738l, min);
        return min;
    }

    private void N(C2973q qVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f5738l.a());
        qVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f5738l.l(bArr, i10, min);
        }
    }

    private void g(int i10) {
        if (this.f5701E == null || this.f5702F == null) {
            throw C1961B.a("Element " + i10 + " must be in a Cues", (Throwable) null);
        }
    }

    private void l(int i10) {
        if (this.f5749w == null) {
            throw C1961B.a("Element " + i10 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    private void m() {
        C2076a.i(this.f5730d0);
    }

    private J o(q qVar, q qVar2) {
        int i10;
        if (this.f5745s == -1 || this.f5748v == -9223372036854775807L || qVar == null || qVar.c() == 0 || qVar2 == null || qVar2.c() != qVar.c()) {
            return new J.b(this.f5748v);
        }
        int c10 = qVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = qVar.b(i12);
            jArr[i12] = this.f5745s + qVar2.b(i12);
        }
        while (true) {
            i10 = c10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f5745s + this.f5744r) - jArr[i10]);
        long j10 = this.f5748v - jArr3[i10];
        jArr2[i10] = j10;
        if (j10 <= 0) {
            p.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new C2963g(iArr, jArr, jArr2, jArr3);
    }

    private void p(c cVar, long j10, int i10, int i11, int i12) {
        P p10 = cVar.f5774U;
        if (p10 != null) {
            p10.c(cVar.f5778Y, j10, i10, i11, i12, cVar.f5789j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f5781b) || "S_TEXT/ASS".equals(cVar.f5781b) || "S_TEXT/WEBVTT".equals(cVar.f5781b)) {
                if (this.f5709M > 1) {
                    p.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f5707K;
                    if (j11 == -9223372036854775807L) {
                        p.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        H(cVar.f5781b, j11, this.f5739m.e());
                        int f10 = this.f5739m.f();
                        while (true) {
                            if (f10 >= this.f5739m.g()) {
                                break;
                            } else if (this.f5739m.e()[f10] == 0) {
                                this.f5739m.T(f10);
                                break;
                            } else {
                                f10++;
                            }
                        }
                        O o10 = cVar.f5778Y;
                        C2073A a10 = this.f5739m;
                        o10.f(a10, a10.g());
                        i11 += this.f5739m.g();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.f5709M > 1) {
                    this.f5742p.Q(0);
                } else {
                    int g10 = this.f5742p.g();
                    cVar.f5778Y.e(this.f5742p, g10, 2);
                    i11 += g10;
                }
            }
            cVar.f5778Y.d(j10, i10, i11, i12, cVar.f5789j);
        }
        this.f5704H = true;
    }

    private static int[] r(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    private int s() {
        int i10 = this.f5718V;
        F();
        return i10;
    }

    private static byte[] u(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return L.q0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    /* access modifiers changed from: protected */
    public boolean B(int i10) {
        if (i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void I(int i10, long j10, long j11) {
        m();
        if (i10 == 160) {
            this.f5715S = false;
            this.f5716T = 0;
        } else if (i10 == 174) {
            this.f5749w = new c();
        } else if (i10 == 187) {
            this.f5703G = false;
        } else if (i10 == 19899) {
            this.f5751y = -1;
            this.f5752z = -1;
        } else if (i10 == 20533) {
            v(i10).f5787h = true;
        } else if (i10 == 21968) {
            v(i10).f5804y = true;
        } else if (i10 == 408125543) {
            long j12 = this.f5745s;
            if (j12 == -1 || j12 == j10) {
                this.f5745s = j10;
                this.f5744r = j11;
                return;
            }
            throw C1961B.a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.f5701E = new q();
            this.f5702F = new q();
        } else if (i10 != 524531317 || this.f5750x) {
        } else {
            if (!this.f5729d || this.f5698B == -1) {
                this.f5730d0.u(new J.b(this.f5748v));
                this.f5750x = true;
                return;
            }
            this.f5697A = true;
        }
    }

    /* access modifiers changed from: protected */
    public void J(int i10, String str) {
        if (i10 == 134) {
            v(i10).f5781b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f5780a = str;
            } else if (i10 == 2274716) {
                String unused = v(i10).f5777X = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw C1961B.a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public void a(long j10, long j11) {
        this.f5700D = -9223372036854775807L;
        this.f5705I = 0;
        this.f5723a.reset();
        this.f5725b.e();
        F();
        for (int i10 = 0; i10 < this.f5727c.size(); i10++) {
            ((c) this.f5727c.valueAt(i10)).n();
        }
    }

    public final void f(r rVar) {
        this.f5730d0 = rVar;
        if (this.f5731e) {
            rVar = new W2.u(rVar, this.f5732f);
        }
        this.f5730d0 = rVar;
    }

    public final int i(C2973q qVar, I i10) {
        this.f5704H = false;
        boolean z10 = true;
        while (z10 && !this.f5704H) {
            z10 = this.f5723a.a(qVar);
            if (z10 && D(i10, qVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f5727c.size(); i11++) {
            c cVar = (c) this.f5727c.valueAt(i11);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    public final boolean j(C2973q qVar) {
        return new f().b(qVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0231, code lost:
        throw f2.C1961B.a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(int r22, int r23, z2.C2973q r24) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            r1 = r23
            r8 = r24
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 0
            r5 = 2
            r9 = 0
            r10 = 1
            if (r0 == r2) goto L_0x00c5
            if (r0 == r3) goto L_0x00c5
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00af
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00a6
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x0098
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x0086
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0062
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0054
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x003e
            r21.l(r22)
            R2.e$c r0 = r7.f5749w
            byte[] r2 = new byte[r1]
            r0.f5802w = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            f2.B r0 = f2.C1961B.a(r0, r4)
            throw r0
        L_0x0054:
            r21.l(r22)
            R2.e$c r0 = r7.f5749w
            byte[] r2 = new byte[r1]
            r0.f5790k = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x0062:
            i2.A r0 = r7.f5737k
            byte[] r0 = r0.e()
            java.util.Arrays.fill(r0, r9)
            i2.A r0 = r7.f5737k
            byte[] r0 = r0.e()
            int r2 = 4 - r1
            r8.readFully(r0, r2, r1)
            i2.A r0 = r7.f5737k
            r0.U(r9)
            i2.A r0 = r7.f5737k
            long r0 = r0.J()
            int r0 = (int) r0
            r7.f5751y = r0
            goto L_0x02ec
        L_0x0086:
            byte[] r2 = new byte[r1]
            r8.readFully(r2, r9, r1)
            R2.e$c r0 = r21.v(r22)
            z2.O$a r1 = new z2.O$a
            r1.<init>(r10, r2, r9, r9)
            r0.f5789j = r1
            goto L_0x02ec
        L_0x0098:
            r21.l(r22)
            R2.e$c r0 = r7.f5749w
            byte[] r2 = new byte[r1]
            r0.f5788i = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x00a6:
            R2.e$c r0 = r21.v(r22)
            r7.x(r0, r8, r1)
            goto L_0x02ec
        L_0x00af:
            int r0 = r7.f5705I
            if (r0 == r5) goto L_0x00b4
            return
        L_0x00b4:
            android.util.SparseArray r0 = r7.f5727c
            int r2 = r7.f5711O
            java.lang.Object r0 = r0.get(r2)
            R2.e$c r0 = (R2.e.c) r0
            int r2 = r7.f5714R
            r7.y(r0, r2, r8, r1)
            goto L_0x02ec
        L_0x00c5:
            int r2 = r7.f5705I
            r6 = 8
            if (r2 != 0) goto L_0x00ea
            R2.g r2 = r7.f5725b
            long r11 = r2.d(r8, r9, r10, r6)
            int r2 = (int) r11
            r7.f5711O = r2
            R2.g r2 = r7.f5725b
            int r2 = r2.b()
            r7.f5712P = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f5707K = r11
            r7.f5705I = r10
            i2.A r2 = r7.f5735i
            r2.Q(r9)
        L_0x00ea:
            android.util.SparseArray r2 = r7.f5727c
            int r11 = r7.f5711O
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            R2.e$c r11 = (R2.e.c) r11
            if (r11 != 0) goto L_0x0101
            int r0 = r7.f5712P
            int r0 = r1 - r0
            r8.j(r0)
            r7.f5705I = r9
            return
        L_0x0101:
            r11.f()
            int r2 = r7.f5705I
            if (r2 != r10) goto L_0x02a3
            r2 = 3
            r7.E(r8, r2)
            i2.A r12 = r7.f5735i
            byte[] r12 = r12.e()
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r10
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x012f
            r7.f5709M = r10
            int[] r4 = r7.f5710N
            int[] r4 = r(r4, r10)
            r7.f5710N = r4
            int r12 = r7.f5712P
            int r1 = r1 - r12
            int r1 = r1 - r2
            r4[r9] = r1
        L_0x012b:
            r18 = r11
            goto L_0x0246
        L_0x012f:
            r14 = 4
            r7.E(r8, r14)
            i2.A r15 = r7.f5735i
            byte[] r15 = r15.e()
            byte r15 = r15[r2]
            r15 = r15 & r13
            int r15 = r15 + r10
            r7.f5709M = r15
            int[] r3 = r7.f5710N
            int[] r3 = r(r3, r15)
            r7.f5710N = r3
            if (r12 != r5) goto L_0x0154
            int r2 = r7.f5712P
            int r1 = r1 - r2
            int r1 = r1 - r14
            int r2 = r7.f5709M
            int r1 = r1 / r2
            java.util.Arrays.fill(r3, r9, r2, r1)
            goto L_0x012b
        L_0x0154:
            if (r12 != r10) goto L_0x018b
            r2 = r9
            r3 = r2
        L_0x0158:
            int r4 = r7.f5709M
            int r12 = r4 + -1
            if (r2 >= r12) goto L_0x0180
            int[] r4 = r7.f5710N
            r4[r2] = r9
        L_0x0162:
            int r4 = r14 + 1
            r7.E(r8, r4)
            i2.A r12 = r7.f5735i
            byte[] r12 = r12.e()
            byte r12 = r12[r14]
            r12 = r12 & r13
            int[] r14 = r7.f5710N
            r15 = r14[r2]
            int r15 = r15 + r12
            r14[r2] = r15
            if (r12 == r13) goto L_0x017e
            int r3 = r3 + r15
            int r2 = r2 + 1
            r14 = r4
            goto L_0x0158
        L_0x017e:
            r14 = r4
            goto L_0x0162
        L_0x0180:
            int[] r2 = r7.f5710N
            int r4 = r4 - r10
            int r12 = r7.f5712P
            int r1 = r1 - r12
            int r1 = r1 - r14
            int r1 = r1 - r3
            r2[r4] = r1
            goto L_0x012b
        L_0x018b:
            if (r12 != r2) goto L_0x028d
            r2 = r9
            r3 = r2
        L_0x018f:
            int r12 = r7.f5709M
            int r15 = r12 + -1
            if (r2 >= r15) goto L_0x0239
            int[] r12 = r7.f5710N
            r12[r2] = r9
            int r12 = r14 + 1
            r7.E(r8, r12)
            i2.A r15 = r7.f5735i
            byte[] r15 = r15.e()
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x0232
            r15 = r9
        L_0x01a9:
            if (r15 >= r6) goto L_0x01ff
            int r16 = 7 - r15
            int r5 = r10 << r16
            i2.A r9 = r7.f5735i
            byte[] r9 = r9.e()
            byte r9 = r9[r14]
            r9 = r9 & r5
            if (r9 == 0) goto L_0x01f5
            int r12 = r12 + r15
            r7.E(r8, r12)
            i2.A r9 = r7.f5735i
            byte[] r9 = r9.e()
            int r17 = r14 + 1
            byte r9 = r9[r14]
            r9 = r9 & r13
            int r5 = ~r5
            r5 = r5 & r9
            r18 = r11
            long r10 = (long) r5
            r5 = r17
        L_0x01d0:
            if (r5 >= r12) goto L_0x01e5
            long r10 = r10 << r6
            i2.A r14 = r7.f5735i
            byte[] r14 = r14.e()
            int r17 = r5 + 1
            byte r5 = r14[r5]
            r5 = r5 & r13
            long r13 = (long) r5
            long r10 = r10 | r13
            r5 = r17
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01d0
        L_0x01e5:
            if (r2 <= 0) goto L_0x01f3
            int r15 = r15 * 7
            int r15 = r15 + 6
            r13 = 1
            long r19 = r13 << r15
            long r19 = r19 - r13
            long r10 = r10 - r19
        L_0x01f3:
            r14 = r12
            goto L_0x0204
        L_0x01f5:
            r18 = r11
            int r15 = r15 + 1
            r5 = 2
            r9 = 0
            r10 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01a9
        L_0x01ff:
            r18 = r11
            r10 = 0
            goto L_0x01f3
        L_0x0204:
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x022b
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x022b
            int r5 = (int) r10
            int[] r10 = r7.f5710N
            if (r2 != 0) goto L_0x0218
            goto L_0x021d
        L_0x0218:
            int r11 = r2 + -1
            r11 = r10[r11]
            int r5 = r5 + r11
        L_0x021d:
            r10[r2] = r5
            int r3 = r3 + r5
            int r2 = r2 + 1
            r11 = r18
            r5 = 2
            r9 = 0
            r10 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x018f
        L_0x022b:
            java.lang.String r0 = "EBML lacing sample size out of range."
            f2.B r0 = f2.C1961B.a(r0, r4)
            throw r0
        L_0x0232:
            java.lang.String r0 = "No valid varint length mask found"
            f2.B r0 = f2.C1961B.a(r0, r4)
            throw r0
        L_0x0239:
            r18 = r11
            int[] r2 = r7.f5710N
            r4 = 1
            int r12 = r12 - r4
            int r4 = r7.f5712P
            int r1 = r1 - r4
            int r1 = r1 - r14
            int r1 = r1 - r3
            r2[r12] = r1
        L_0x0246:
            i2.A r1 = r7.f5735i
            byte[] r1 = r1.e()
            r2 = 0
            byte r1 = r1[r2]
            int r1 = r1 << r6
            i2.A r2 = r7.f5735i
            byte[] r2 = r2.e()
            r3 = 1
            byte r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r1 = r1 | r2
            long r2 = r7.f5700D
            long r4 = (long) r1
            long r4 = r7.G(r4)
            long r2 = r2 + r4
            r7.f5706J = r2
            r10 = r18
            int r1 = r10.f5783d
            r2 = 2
            if (r1 == r2) goto L_0x0282
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0280
            i2.A r1 = r7.f5735i
            byte[] r1 = r1.e()
            byte r1 = r1[r2]
            r3 = 128(0x80, float:1.794E-43)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r1 = 0
            goto L_0x0283
        L_0x0282:
            r1 = 1
        L_0x0283:
            r7.f5713Q = r1
            r7.f5705I = r2
            r1 = 0
            r7.f5708L = r1
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x02a5
        L_0x028d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected lacing value: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            f2.B r0 = f2.C1961B.a(r0, r4)
            throw r0
        L_0x02a3:
            r10 = r11
            r1 = r3
        L_0x02a5:
            if (r0 != r1) goto L_0x02d5
        L_0x02a7:
            int r0 = r7.f5708L
            int r1 = r7.f5709M
            if (r0 >= r1) goto L_0x02d1
            int[] r1 = r7.f5710N
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.K(r8, r10, r0, r1)
            long r0 = r7.f5706J
            int r2 = r7.f5708L
            int r3 = r10.f5784e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f5713Q
            r6 = 0
            r0 = r21
            r1 = r10
            r0.p(r1, r2, r4, r5, r6)
            int r0 = r7.f5708L
            r1 = 1
            int r0 = r0 + r1
            r7.f5708L = r0
            goto L_0x02a7
        L_0x02d1:
            r0 = 0
            r7.f5705I = r0
            goto L_0x02ec
        L_0x02d5:
            r1 = 1
        L_0x02d6:
            int r0 = r7.f5708L
            int r2 = r7.f5709M
            if (r0 >= r2) goto L_0x02ec
            int[] r2 = r7.f5710N
            r3 = r2[r0]
            int r3 = r7.K(r8, r10, r3, r1)
            r2[r0] = r3
            int r0 = r7.f5708L
            int r0 = r0 + r1
            r7.f5708L = r0
            goto L_0x02d6
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.e.n(int, int, z2.q):void");
    }

    /* access modifiers changed from: protected */
    public void q(int i10) {
        m();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) C2076a.i(this.f5749w);
                String str = cVar.f5781b;
                if (str != null) {
                    if (A(str)) {
                        cVar.i(this.f5730d0, cVar.f5782c);
                        this.f5727c.put(cVar.f5782c, cVar);
                    }
                    this.f5749w = null;
                    return;
                }
                throw C1961B.a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i10 == 19899) {
                int i11 = this.f5751y;
                if (i11 != -1) {
                    long j10 = this.f5752z;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f5698B = j10;
                            return;
                        }
                        return;
                    }
                }
                throw C1961B.a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i10 == 25152) {
                l(i10);
                c cVar2 = this.f5749w;
                if (!cVar2.f5787h) {
                    return;
                }
                if (cVar2.f5789j != null) {
                    cVar2.f5791l = new C1979n(new C1979n.b(C1973h.f19972a, "video/webm", this.f5749w.f5789j.f29124b));
                    return;
                }
                throw C1961B.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i10 == 28032) {
                l(i10);
                c cVar3 = this.f5749w;
                if (cVar3.f5787h && cVar3.f5788i != null) {
                    throw C1961B.a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i10 == 357149030) {
                if (this.f5746t == -9223372036854775807L) {
                    this.f5746t = 1000000;
                }
                long j11 = this.f5747u;
                if (j11 != -9223372036854775807L) {
                    this.f5748v = G(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f5750x) {
                        this.f5730d0.u(o(this.f5701E, this.f5702F));
                        this.f5750x = true;
                    }
                    this.f5701E = null;
                    this.f5702F = null;
                }
            } else if (this.f5727c.size() != 0) {
                this.f5730d0.k();
            } else {
                throw C1961B.a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.f5705I == 2) {
            c cVar4 = (c) this.f5727c.get(this.f5711O);
            cVar4.f();
            if (this.f5716T > 0 && "A_OPUS".equals(cVar4.f5781b)) {
                this.f5742p.R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f5716T).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f5709M; i13++) {
                i12 += this.f5710N[i13];
            }
            int i14 = 0;
            while (i14 < this.f5709M) {
                long j12 = this.f5706J + ((long) ((cVar4.f5784e * i14) / 1000));
                int i15 = this.f5713Q;
                if (i14 == 0 && !this.f5715S) {
                    i15 |= 1;
                }
                int i16 = this.f5710N[i14];
                int i17 = i12 - i16;
                p(cVar4, j12, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.f5705I = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void t(int i10, double d10) {
        if (i10 == 181) {
            v(i10).f5771R = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    v(i10).f5758E = (float) d10;
                    return;
                case 21970:
                    v(i10).f5759F = (float) d10;
                    return;
                case 21971:
                    v(i10).f5760G = (float) d10;
                    return;
                case 21972:
                    v(i10).f5761H = (float) d10;
                    return;
                case 21973:
                    v(i10).f5762I = (float) d10;
                    return;
                case 21974:
                    v(i10).f5763J = (float) d10;
                    return;
                case 21975:
                    v(i10).f5764K = (float) d10;
                    return;
                case 21976:
                    v(i10).f5765L = (float) d10;
                    return;
                case 21977:
                    v(i10).f5766M = (float) d10;
                    return;
                case 21978:
                    v(i10).f5767N = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            v(i10).f5799t = (float) d10;
                            return;
                        case 30324:
                            v(i10).f5800u = (float) d10;
                            return;
                        case 30325:
                            v(i10).f5801v = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f5747u = (long) d10;
        }
    }

    /* access modifiers changed from: protected */
    public c v(int i10) {
        l(i10);
        return this.f5749w;
    }

    /* access modifiers changed from: protected */
    public int w(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void x(c cVar, C2973q qVar, int i10) {
        if (cVar.f5786g == 1685485123 || cVar.f5786g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.f5768O = bArr;
            qVar.readFully(bArr, 0, i10);
            return;
        }
        qVar.j(i10);
    }

    /* access modifiers changed from: protected */
    public void y(c cVar, int i10, C2973q qVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f5781b)) {
            qVar.j(i11);
            return;
        }
        this.f5742p.Q(i11);
        qVar.readFully(this.f5742p.e(), 0, i11);
    }

    /* access modifiers changed from: protected */
    public void z(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        v(i10).f5783d = (int) j10;
                        return;
                    case 136:
                        c v10 = v(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        v10.f5776W = z10;
                        return;
                    case 155:
                        this.f5707K = G(j10);
                        return;
                    case 159:
                        v(i10).f5769P = (int) j10;
                        return;
                    case 176:
                        v(i10).f5792m = (int) j10;
                        return;
                    case 179:
                        g(i10);
                        this.f5701E.a(G(j10));
                        return;
                    case 186:
                        v(i10).f5793n = (int) j10;
                        return;
                    case 215:
                        v(i10).f5782c = (int) j10;
                        return;
                    case 231:
                        this.f5700D = G(j10);
                        return;
                    case 238:
                        this.f5714R = (int) j10;
                        return;
                    case 241:
                        if (!this.f5703G) {
                            g(i10);
                            this.f5702F.a(j10);
                            this.f5703G = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f5715S = true;
                        return;
                    case 16871:
                        int unused = v(i10).f5786g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw C1961B.a("ContentCompAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw C1961B.a("DocTypeReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw C1961B.a("EBMLReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw C1961B.a("ContentEncAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw C1961B.a("AESSettingsCipherMode " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f5752z = j10 + this.f5745s;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        l(i10);
                        if (i11 == 0) {
                            this.f5749w.f5803x = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f5749w.f5803x = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f5749w.f5803x = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f5749w.f5803x = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        v(i10).f5795p = (int) j10;
                        return;
                    case 21682:
                        v(i10).f5797r = (int) j10;
                        return;
                    case 21690:
                        v(i10).f5796q = (int) j10;
                        return;
                    case 21930:
                        c v11 = v(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        v11.f5775V = z10;
                        return;
                    case 21938:
                        l(i10);
                        c cVar = this.f5749w;
                        cVar.f5804y = true;
                        cVar.f5794o = (int) j10;
                        return;
                    case 21998:
                        v(i10).f5785f = (int) j10;
                        return;
                    case 22186:
                        v(i10).f5772S = j10;
                        return;
                    case 22203:
                        v(i10).f5773T = j10;
                        return;
                    case 25188:
                        v(i10).f5770Q = (int) j10;
                        return;
                    case 30114:
                        this.f5716T = j10;
                        return;
                    case 30321:
                        l(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f5749w.f5798s = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f5749w.f5798s = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f5749w.f5798s = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f5749w.f5798s = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        v(i10).f5784e = (int) j10;
                        return;
                    case 2807729:
                        this.f5746t = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                l(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f5749w.f5755B = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f5749w.f5755B = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                l(i10);
                                int k10 = C1974i.k((int) j10);
                                if (k10 != -1) {
                                    this.f5749w.f5754A = k10;
                                    return;
                                }
                                return;
                            case 21947:
                                l(i10);
                                this.f5749w.f5804y = true;
                                int j11 = C1974i.j((int) j10);
                                if (j11 != -1) {
                                    this.f5749w.f5805z = j11;
                                    return;
                                }
                                return;
                            case 21948:
                                v(i10).f5756C = (int) j10;
                                return;
                            case 21949:
                                v(i10).f5757D = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw C1961B.a("ContentEncodingScope " + j10 + " not supported", (Throwable) null);
            }
        } else if (j10 != 0) {
            throw C1961B.a("ContentEncodingOrder " + j10 + " not supported", (Throwable) null);
        }
    }

    e(c cVar, int i10, s.a aVar) {
        this.f5745s = -1;
        this.f5746t = -9223372036854775807L;
        this.f5747u = -9223372036854775807L;
        this.f5748v = -9223372036854775807L;
        this.f5698B = -1;
        this.f5699C = -1;
        this.f5700D = -9223372036854775807L;
        this.f5723a = cVar;
        cVar.b(new b());
        this.f5732f = aVar;
        boolean z10 = false;
        this.f5729d = (i10 & 1) == 0;
        this.f5731e = (i10 & 2) == 0 ? true : z10;
        this.f5725b = new g();
        this.f5727c = new SparseArray();
        this.f5735i = new C2073A(4);
        this.f5736j = new C2073A(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5737k = new C2073A(4);
        this.f5733g = new C2073A(d.f22705a);
        this.f5734h = new C2073A(4);
        this.f5738l = new C2073A();
        this.f5739m = new C2073A();
        this.f5740n = new C2073A(8);
        this.f5741o = new C2073A();
        this.f5742p = new C2073A();
        this.f5710N = new int[1];
    }

    public final void release() {
    }
}
