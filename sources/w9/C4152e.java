package w9;

import android.util.Pair;
import android.util.SparseArray;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import ja.t;
import ja.x;
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
import k9.C3702j;
import k9.L0;
import o9.m;
import q9.C3962B;
import q9.C3963C;
import q9.C3968c;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

/* renamed from: w9.e  reason: case insensitive filesystem */
public class C4152e implements k {

    /* renamed from: c0  reason: collision with root package name */
    public static final p f49238c0 = new C4151d();

    /* renamed from: d0  reason: collision with root package name */
    private static final byte[] f49239d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f49240e0 = M.n0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0  reason: collision with root package name */
    private static final byte[] f49241f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0  reason: collision with root package name */
    private static final byte[] f49242g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public static final UUID f49243h0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public static final Map f49244i0;

    /* renamed from: A  reason: collision with root package name */
    private long f49245A;

    /* renamed from: B  reason: collision with root package name */
    private long f49246B;

    /* renamed from: C  reason: collision with root package name */
    private t f49247C;

    /* renamed from: D  reason: collision with root package name */
    private t f49248D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f49249E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f49250F;

    /* renamed from: G  reason: collision with root package name */
    private int f49251G;

    /* renamed from: H  reason: collision with root package name */
    private long f49252H;

    /* renamed from: I  reason: collision with root package name */
    private long f49253I;

    /* renamed from: J  reason: collision with root package name */
    private int f49254J;

    /* renamed from: K  reason: collision with root package name */
    private int f49255K;

    /* renamed from: L  reason: collision with root package name */
    private int[] f49256L;

    /* renamed from: M  reason: collision with root package name */
    private int f49257M;

    /* renamed from: N  reason: collision with root package name */
    private int f49258N;

    /* renamed from: O  reason: collision with root package name */
    private int f49259O;

    /* renamed from: P  reason: collision with root package name */
    private int f49260P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f49261Q;

    /* renamed from: R  reason: collision with root package name */
    private long f49262R;

    /* renamed from: S  reason: collision with root package name */
    private int f49263S;

    /* renamed from: T  reason: collision with root package name */
    private int f49264T;

    /* renamed from: U  reason: collision with root package name */
    private int f49265U;

    /* renamed from: V  reason: collision with root package name */
    private boolean f49266V;

    /* renamed from: W  reason: collision with root package name */
    private boolean f49267W;

    /* renamed from: X  reason: collision with root package name */
    private boolean f49268X;

    /* renamed from: Y  reason: collision with root package name */
    private int f49269Y;

    /* renamed from: Z  reason: collision with root package name */
    private byte f49270Z;

    /* renamed from: a  reason: collision with root package name */
    private final C4150c f49271a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f49272a0;

    /* renamed from: b  reason: collision with root package name */
    private final C4154g f49273b;

    /* renamed from: b0  reason: collision with root package name */
    private m f49274b0;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f49275c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f49276d;

    /* renamed from: e  reason: collision with root package name */
    private final B f49277e;

    /* renamed from: f  reason: collision with root package name */
    private final B f49278f;

    /* renamed from: g  reason: collision with root package name */
    private final B f49279g;

    /* renamed from: h  reason: collision with root package name */
    private final B f49280h;

    /* renamed from: i  reason: collision with root package name */
    private final B f49281i;

    /* renamed from: j  reason: collision with root package name */
    private final B f49282j;

    /* renamed from: k  reason: collision with root package name */
    private final B f49283k;

    /* renamed from: l  reason: collision with root package name */
    private final B f49284l;

    /* renamed from: m  reason: collision with root package name */
    private final B f49285m;

    /* renamed from: n  reason: collision with root package name */
    private final B f49286n;

    /* renamed from: o  reason: collision with root package name */
    private ByteBuffer f49287o;

    /* renamed from: p  reason: collision with root package name */
    private long f49288p;

    /* renamed from: q  reason: collision with root package name */
    private long f49289q;

    /* renamed from: r  reason: collision with root package name */
    private long f49290r;

    /* renamed from: s  reason: collision with root package name */
    private long f49291s;

    /* renamed from: t  reason: collision with root package name */
    private long f49292t;

    /* renamed from: u  reason: collision with root package name */
    private c f49293u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f49294v;

    /* renamed from: w  reason: collision with root package name */
    private int f49295w;

    /* renamed from: x  reason: collision with root package name */
    private long f49296x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f49297y;

    /* renamed from: z  reason: collision with root package name */
    private long f49298z;

    /* renamed from: w9.e$b */
    private final class b implements C4149b {
        private b() {
        }

        public void a(int i10) {
            C4152e.this.o(i10);
        }

        public void b(int i10, double d10) {
            C4152e.this.r(i10, d10);
        }

        public void c(int i10, long j10) {
            C4152e.this.x(i10, j10);
        }

        public int d(int i10) {
            return C4152e.this.u(i10);
        }

        public boolean e(int i10) {
            return C4152e.this.z(i10);
        }

        public void f(int i10, String str) {
            C4152e.this.H(i10, str);
        }

        public void g(int i10, long j10, long j11) {
            C4152e.this.G(i10, j10, j11);
        }

        public void h(int i10, int i11, l lVar) {
            C4152e.this.l(i10, i11, lVar);
        }
    }

    /* renamed from: w9.e$c */
    protected static final class c {

        /* renamed from: A  reason: collision with root package name */
        public int f49300A = -1;

        /* renamed from: B  reason: collision with root package name */
        public int f49301B = 1000;

        /* renamed from: C  reason: collision with root package name */
        public int f49302C = 200;

        /* renamed from: D  reason: collision with root package name */
        public float f49303D = -1.0f;

        /* renamed from: E  reason: collision with root package name */
        public float f49304E = -1.0f;

        /* renamed from: F  reason: collision with root package name */
        public float f49305F = -1.0f;

        /* renamed from: G  reason: collision with root package name */
        public float f49306G = -1.0f;

        /* renamed from: H  reason: collision with root package name */
        public float f49307H = -1.0f;

        /* renamed from: I  reason: collision with root package name */
        public float f49308I = -1.0f;

        /* renamed from: J  reason: collision with root package name */
        public float f49309J = -1.0f;

        /* renamed from: K  reason: collision with root package name */
        public float f49310K = -1.0f;

        /* renamed from: L  reason: collision with root package name */
        public float f49311L = -1.0f;

        /* renamed from: M  reason: collision with root package name */
        public float f49312M = -1.0f;

        /* renamed from: N  reason: collision with root package name */
        public byte[] f49313N;

        /* renamed from: O  reason: collision with root package name */
        public int f49314O = 1;

        /* renamed from: P  reason: collision with root package name */
        public int f49315P = -1;

        /* renamed from: Q  reason: collision with root package name */
        public int f49316Q = 8000;

        /* renamed from: R  reason: collision with root package name */
        public long f49317R = 0;

        /* renamed from: S  reason: collision with root package name */
        public long f49318S = 0;

        /* renamed from: T  reason: collision with root package name */
        public C3963C f49319T;

        /* renamed from: U  reason: collision with root package name */
        public boolean f49320U;

        /* renamed from: V  reason: collision with root package name */
        public boolean f49321V = true;
        /* access modifiers changed from: private */

        /* renamed from: W  reason: collision with root package name */
        public String f49322W = "eng";

        /* renamed from: X  reason: collision with root package name */
        public C3962B f49323X;

        /* renamed from: Y  reason: collision with root package name */
        public int f49324Y;

        /* renamed from: a  reason: collision with root package name */
        public String f49325a;

        /* renamed from: b  reason: collision with root package name */
        public String f49326b;

        /* renamed from: c  reason: collision with root package name */
        public int f49327c;

        /* renamed from: d  reason: collision with root package name */
        public int f49328d;

        /* renamed from: e  reason: collision with root package name */
        public int f49329e;

        /* renamed from: f  reason: collision with root package name */
        public int f49330f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f49331g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f49332h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f49333i;

        /* renamed from: j  reason: collision with root package name */
        public C3962B.a f49334j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f49335k;

        /* renamed from: l  reason: collision with root package name */
        public o9.m f49336l;

        /* renamed from: m  reason: collision with root package name */
        public int f49337m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f49338n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f49339o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f49340p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f49341q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f49342r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f49343s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f49344t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f49345u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f49346v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f49347w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f49348x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f49349y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f49350z = -1;

        protected c() {
        }

        /* access modifiers changed from: private */
        public void f() {
            C3645a.e(this.f49323X);
        }

        private byte[] g(String str) {
            byte[] bArr = this.f49335k;
            if (bArr != null) {
                return bArr;
            }
            throw L0.a("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        private byte[] h() {
            if (this.f49303D == -1.0f || this.f49304E == -1.0f || this.f49305F == -1.0f || this.f49306G == -1.0f || this.f49307H == -1.0f || this.f49308I == -1.0f || this.f49309J == -1.0f || this.f49310K == -1.0f || this.f49311L == -1.0f || this.f49312M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.f49303D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49304E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49305F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49306G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49307H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49308I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49309J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f49310K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f49311L + 0.5f)));
            order.putShort((short) ((int) (this.f49312M + 0.5f)));
            order.putShort((short) this.f49301B);
            order.putShort((short) this.f49302C);
            return bArr;
        }

        private static Pair k(B b10) {
            try {
                b10.Q(16);
                long t10 = b10.t();
                if (t10 == 1482049860) {
                    return new Pair("video/divx", (Object) null);
                }
                if (t10 == 859189832) {
                    return new Pair("video/3gpp", (Object) null);
                }
                if (t10 == 826496599) {
                    byte[] d10 = b10.d();
                    for (int e10 = b10.e() + 20; e10 < d10.length - 4; e10++) {
                        if (d10[e10] == 0 && d10[e10 + 1] == 0 && d10[e10 + 2] == 1 && d10[e10 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d10, e10, d10.length)));
                        }
                    }
                    throw L0.a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                s.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw L0.a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static boolean l(B b10) {
            try {
                int v10 = b10.v();
                if (v10 == 1) {
                    return true;
                }
                if (v10 != 65534) {
                    return false;
                }
                b10.P(24);
                if (b10.w() == C4152e.f49243h0.getMostSignificantBits() && b10.w() == C4152e.f49243h0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw L0.a("Error parsing MS/ACM codec private", (Throwable) null);
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
                            throw L0.a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw L0.a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw L0.a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw L0.a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw L0.a("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* access modifiers changed from: private */
        public boolean o(boolean z10) {
            if ("A_OPUS".equals(this.f49326b)) {
                return z10;
            }
            if (this.f49330f > 0) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0236, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0237, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0239, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x023e, code lost:
            r1 = null;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0263, code lost:
            r3 = -1;
            r6 = -1;
            r18 = r2;
            r2 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a2, code lost:
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a5, code lost:
            r3 = r1;
            r1 = null;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0375, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0376, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0397, code lost:
            r1 = null;
            r2 = null;
            r3 = -1;
            r6 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x03bf, code lost:
            r1 = null;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0424, code lost:
            r4 = r0.f49313N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0426, code lost:
            if (r4 == null) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0428, code lost:
            r4 = ka.d.a(new ja.B(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0431, code lost:
            if (r4 == null) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0433, code lost:
            r2 = r4.f45964c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x0437, code lost:
            r4 = r16;
            r14 = r0.f49321V;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x043d, code lost:
            if (r0.f49320U == false) goto L_0x0441;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x043f, code lost:
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0441, code lost:
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0442, code lost:
            r5 = r5 | r14;
            r14 = new k9.C3717q0.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x044c, code lost:
            if (ja.w.o(r4) == false) goto L_0x0460;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x044e, code lost:
            r14.H(r0.f49314O).f0(r0.f49316Q).Y(r3);
            r3 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0464, code lost:
            if (ja.w.s(r4) == false) goto L_0x0539;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0468, code lost:
            if (r0.f49341q != 0) goto L_0x047c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x046a, code lost:
            r3 = r0.f49339o;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x046d, code lost:
            if (r3 != -1) goto L_0x0471;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x046f, code lost:
            r3 = r0.f49337m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0471, code lost:
            r0.f49339o = r3;
            r3 = r0.f49340p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0475, code lost:
            if (r3 != -1) goto L_0x0479;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0477, code lost:
            r3 = r0.f49338n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0479, code lost:
            r0.f49340p = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x047c, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x047d, code lost:
            r3 = r0.f49339o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x047f, code lost:
            if (r3 == r7) goto L_0x048f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x0481, code lost:
            r8 = r0.f49340p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x0483, code lost:
            if (r8 == r7) goto L_0x048f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0485, code lost:
            r3 = ((float) (r0.f49338n * r3)) / ((float) (r0.f49337m * r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x048f, code lost:
            r3 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0493, code lost:
            if (r0.f49348x == false) goto L_0x04a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0495, code lost:
            r13 = new ka.c(r0.f49349y, r0.f49300A, r0.f49350z, h());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x04a6, code lost:
            if (r0.f49325a == null) goto L_0x04c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b2, code lost:
            if (w9.C4152e.d().containsKey(r0.f49325a) == false) goto L_0x04c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b4, code lost:
            r7 = ((java.lang.Integer) w9.C4152e.d().get(r0.f49325a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x04c6, code lost:
            if (r0.f49342r != 0) goto L_0x0514;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x04cf, code lost:
            if (java.lang.Float.compare(r0.f49343s, 0.0f) != 0) goto L_0x0514;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04d7, code lost:
            if (java.lang.Float.compare(r0.f49344t, 0.0f) != 0) goto L_0x0514;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04df, code lost:
            if (java.lang.Float.compare(r0.f49345u, 0.0f) != 0) goto L_0x04e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x04e1, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x04eb, code lost:
            if (java.lang.Float.compare(r0.f49344t, 90.0f) != 0) goto L_0x04f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x04ed, code lost:
            r7 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x04f8, code lost:
            if (java.lang.Float.compare(r0.f49344t, -180.0f) == 0) goto L_0x0512;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0502, code lost:
            if (java.lang.Float.compare(r0.f49344t, 180.0f) != 0) goto L_0x0505;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x050d, code lost:
            if (java.lang.Float.compare(r0.f49344t, -90.0f) != 0) goto L_0x0514;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x050f, code lost:
            r7 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0512, code lost:
            r7 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0514, code lost:
            r14.j0(r0.f49337m).Q(r0.f49338n).a0(r3).d0(r7).b0(r0.f49346v).h0(r0.f49347w).J(r13);
            r3 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x053d, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x0565;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0543, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x0565;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x0549, code lost:
            if ("text/vtt".equals(r4) != false) goto L_0x0565;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x054f, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x0565;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x0555, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x0565;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x055b, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x055e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0564, code lost:
            throw k9.L0.a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x0565, code lost:
            r3 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x0568, code lost:
            if (r0.f49325a == null) goto L_0x057b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x0574, code lost:
            if (w9.C4152e.d().containsKey(r0.f49325a) != false) goto L_0x057b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x0576, code lost:
            r14.U(r0.f49325a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x057b, code lost:
            r1 = r14.R(r21).e0(r4).W(r6).V(r0.f49322W).g0(r5).T(r1).I(r2).M(r0.f49336l).E();
            r2 = r20.d(r0.f49327c, r3);
            r0.f49323X = r2;
            r2.c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:248:0x05b2, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(q9.m r20, int r21) {
            /*
                r19 = this;
                r0 = r19
                r2 = 16
                java.lang.String r5 = r0.f49326b
                r5.hashCode()
                java.lang.String r7 = "application/dvbsubs"
                java.lang.String r8 = "application/vobsub"
                java.lang.String r9 = "application/pgs"
                java.lang.String r10 = "text/x-ssa"
                java.lang.String r11 = "text/vtt"
                java.lang.String r12 = "application/x-subrip"
                r14 = 8
                r15 = 3
                java.lang.String r4 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r6 = "MatroskaExtractor"
                java.lang.String r3 = "audio/x-unknown"
                r13 = 0
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
                r1 = r14
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
                r1 = r15
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
                    case 0: goto L_0x0415;
                    case 1: goto L_0x0415;
                    case 2: goto L_0x03c2;
                    case 3: goto L_0x03b5;
                    case 4: goto L_0x03a2;
                    case 5: goto L_0x039e;
                    case 6: goto L_0x0394;
                    case 7: goto L_0x0379;
                    case 8: goto L_0x0362;
                    case 9: goto L_0x0415;
                    case 10: goto L_0x0347;
                    case 11: goto L_0x0339;
                    case 12: goto L_0x0335;
                    case 13: goto L_0x0317;
                    case 14: goto L_0x0313;
                    case 15: goto L_0x030f;
                    case 16: goto L_0x030b;
                    case 17: goto L_0x0307;
                    case 18: goto L_0x0303;
                    case 19: goto L_0x02ff;
                    case 20: goto L_0x02fb;
                    case 21: goto L_0x030f;
                    case 22: goto L_0x02d3;
                    case 23: goto L_0x02a9;
                    case 24: goto L_0x027e;
                    case 25: goto L_0x026d;
                    case 26: goto L_0x024a;
                    case 27: goto L_0x0247;
                    case 28: goto L_0x0244;
                    case 29: goto L_0x0241;
                    case 30: goto L_0x023c;
                    case 31: goto L_0x022a;
                    case 32: goto L_0x01e7;
                    default: goto L_0x01e0;
                }
            L_0x01e0:
                java.lang.String r1 = "Unrecognized codec identifier."
                k9.L0 r1 = k9.L0.a(r1, r13)
                throw r1
            L_0x01e7:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r15)
                java.lang.String r2 = r0.f49326b
                byte[] r2 = r0.g(r2)
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r14)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r4 = r0.f49317R
                java.nio.ByteBuffer r2 = r2.putLong(r4)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r14)
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r3 = r0.f49318S
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                r6 = 5760(0x1680, float:8.071E-42)
                r2 = r13
                r3 = -1
                r5 = 0
                goto L_0x0424
            L_0x022a:
                java.lang.String r1 = r0.f49326b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
            L_0x0236:
                r2 = r13
            L_0x0237:
                r3 = -1
            L_0x0238:
                r5 = 0
            L_0x0239:
                r6 = -1
                goto L_0x0424
            L_0x023c:
                java.lang.String r16 = "audio/eac3"
            L_0x023e:
                r1 = r13
                r2 = r1
                goto L_0x0237
            L_0x0241:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x023e
            L_0x0244:
                r16 = r12
                goto L_0x023e
            L_0x0247:
                r16 = r11
                goto L_0x023e
            L_0x024a:
                ja.B r1 = new ja.B
                java.lang.String r2 = r0.f49326b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                ka.f r1 = ka.f.a(r1)
                java.util.List r2 = r1.f45979a
                int r3 = r1.f45980b
                r0.f49324Y = r3
                java.lang.String r1 = r1.f45984f
                java.lang.String r16 = "video/hevc"
            L_0x0263:
                r3 = -1
                r5 = 0
                r6 = -1
                r18 = r2
                r2 = r1
                r1 = r18
                goto L_0x0424
            L_0x026d:
                byte[] r1 = w9.C4152e.f49240e0
                java.lang.String r2 = r0.f49326b
                byte[] r2 = r0.g(r2)
                com.google.common.collect.v r1 = com.google.common.collect.C4770v.I(r1, r2)
                r16 = r10
                goto L_0x0236
            L_0x027e:
                int r1 = r0.f49315P
                int r1 = ja.M.c0(r1)
                if (r1 != 0) goto L_0x02a5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported little endian PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f49315P
                r1.append(r2)
                r1.append(r4)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                ja.s.i(r6, r1)
            L_0x02a2:
                r16 = r3
                goto L_0x023e
            L_0x02a5:
                r3 = r1
                r1 = r13
                r2 = r1
                goto L_0x0238
            L_0x02a9:
                int r1 = r0.f49315P
                if (r1 != r14) goto L_0x02b1
                r1 = r13
                r2 = r1
                r3 = r15
                goto L_0x0238
            L_0x02b1:
                if (r1 != r2) goto L_0x02b6
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x02a5
            L_0x02b6:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported big endian PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f49315P
                r1.append(r2)
                r1.append(r4)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                ja.s.i(r6, r1)
                goto L_0x02a2
            L_0x02d3:
                int r1 = r0.f49315P
                r2 = 32
                if (r1 != r2) goto L_0x02de
                r1 = r13
                r2 = r1
                r3 = 4
                goto L_0x0238
            L_0x02de:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported floating point PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f49315P
                r1.append(r2)
                r1.append(r4)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                ja.s.i(r6, r1)
                goto L_0x02a2
            L_0x02fb:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x023e
            L_0x02ff:
                r16 = r9
                goto L_0x023e
            L_0x0303:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x023e
            L_0x0307:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
                goto L_0x023e
            L_0x030b:
                java.lang.String r16 = "video/av01"
                goto L_0x023e
            L_0x030f:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x023e
            L_0x0313:
                java.lang.String r16 = "audio/ac3"
                goto L_0x023e
            L_0x0317:
                java.lang.String r1 = r0.f49326b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r2 = r0.f49335k
                m9.a$b r2 = m9.C3843a.f(r2)
                int r3 = r2.f46610a
                r0.f49316Q = r3
                int r3 = r2.f46611b
                r0.f49314O = r3
                java.lang.String r2 = r2.f46612c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0237
            L_0x0335:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x023e
            L_0x0339:
                java.lang.String r1 = r0.f49326b
                byte[] r1 = r0.g(r1)
                com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r1)
                r16 = r8
                goto L_0x0236
            L_0x0347:
                ja.B r1 = new ja.B
                java.lang.String r2 = r0.f49326b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                ka.a r1 = ka.a.b(r1)
                java.util.List r2 = r1.f45950a
                int r3 = r1.f45951b
                r0.f49324Y = r3
                java.lang.String r1 = r1.f45955f
                java.lang.String r16 = "video/avc"
                goto L_0x0263
            L_0x0362:
                r1 = 4
                byte[] r2 = new byte[r1]
                java.lang.String r3 = r0.f49326b
                byte[] r3 = r0.g(r3)
                r5 = 0
                java.lang.System.arraycopy(r3, r5, r2, r5, r1)
                com.google.common.collect.v r1 = com.google.common.collect.C4770v.H(r2)
                r16 = r7
            L_0x0375:
                r2 = r13
            L_0x0376:
                r3 = -1
                goto L_0x0239
            L_0x0379:
                r5 = 0
                ja.B r1 = new ja.B
                java.lang.String r2 = r0.f49326b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = k(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x0375
            L_0x0394:
                r5 = 0
                java.lang.String r16 = "audio/mpeg"
            L_0x0397:
                r1 = r13
                r2 = r1
                r3 = -1
                r6 = 4096(0x1000, float:5.74E-42)
                goto L_0x0424
            L_0x039e:
                r5 = 0
                java.lang.String r16 = "audio/mpeg-L2"
                goto L_0x0397
            L_0x03a2:
                r5 = 0
                java.lang.String r1 = r0.f49326b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = m(r1)
                java.lang.String r16 = "audio/vorbis"
                r6 = 8192(0x2000, float:1.14794E-41)
                r2 = r13
                r3 = -1
                goto L_0x0424
            L_0x03b5:
                r5 = 0
                q9.C r1 = new q9.C
                r1.<init>()
                r0.f49319T = r1
                java.lang.String r16 = "audio/true-hd"
            L_0x03bf:
                r1 = r13
                r2 = r1
                goto L_0x0376
            L_0x03c2:
                r5 = 0
                ja.B r1 = new ja.B
                java.lang.String r2 = r0.f49326b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                boolean r1 = l(r1)
                if (r1 == 0) goto L_0x0400
                int r1 = r0.f49315P
                int r1 = ja.M.c0(r1)
                if (r1 != 0) goto L_0x03fb
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f49315P
                r1.append(r2)
                r1.append(r4)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                ja.s.i(r6, r1)
            L_0x03f8:
                r16 = r3
                goto L_0x03bf
            L_0x03fb:
                r3 = r1
                r1 = r13
                r2 = r1
                goto L_0x0239
            L_0x0400:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                ja.s.i(r6, r1)
                goto L_0x03f8
            L_0x0415:
                r5 = 0
                byte[] r1 = r0.f49335k
                if (r1 != 0) goto L_0x041c
                r1 = r13
                goto L_0x0420
            L_0x041c:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0420:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x0375
            L_0x0424:
                byte[] r4 = r0.f49313N
                if (r4 == 0) goto L_0x0437
                ja.B r14 = new ja.B
                r14.<init>((byte[]) r4)
                ka.d r4 = ka.d.a(r14)
                if (r4 == 0) goto L_0x0437
                java.lang.String r2 = r4.f45964c
                java.lang.String r16 = "video/dolby-vision"
            L_0x0437:
                r4 = r16
                boolean r14 = r0.f49321V
                boolean r5 = r0.f49320U
                if (r5 == 0) goto L_0x0441
                r5 = 2
                goto L_0x0442
            L_0x0441:
                r5 = 0
            L_0x0442:
                r5 = r5 | r14
                k9.q0$b r14 = new k9.q0$b
                r14.<init>()
                boolean r16 = ja.w.o(r4)
                if (r16 == 0) goto L_0x0460
                int r7 = r0.f49314O
                k9.q0$b r7 = r14.H(r7)
                int r8 = r0.f49316Q
                k9.q0$b r7 = r7.f0(r8)
                r7.Y(r3)
                r3 = 1
                goto L_0x0566
            L_0x0460:
                boolean r3 = ja.w.s(r4)
                if (r3 == 0) goto L_0x0539
                int r3 = r0.f49341q
                if (r3 != 0) goto L_0x047c
                int r3 = r0.f49339o
                r7 = -1
                if (r3 != r7) goto L_0x0471
                int r3 = r0.f49337m
            L_0x0471:
                r0.f49339o = r3
                int r3 = r0.f49340p
                if (r3 != r7) goto L_0x0479
                int r3 = r0.f49338n
            L_0x0479:
                r0.f49340p = r3
                goto L_0x047d
            L_0x047c:
                r7 = -1
            L_0x047d:
                int r3 = r0.f49339o
                if (r3 == r7) goto L_0x048f
                int r8 = r0.f49340p
                if (r8 == r7) goto L_0x048f
                int r9 = r0.f49338n
                int r9 = r9 * r3
                float r3 = (float) r9
                int r9 = r0.f49337m
                int r9 = r9 * r8
                float r8 = (float) r9
                float r3 = r3 / r8
                goto L_0x0491
            L_0x048f:
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x0491:
                boolean r8 = r0.f49348x
                if (r8 == 0) goto L_0x04a4
                byte[] r8 = r19.h()
                ka.c r13 = new ka.c
                int r9 = r0.f49349y
                int r10 = r0.f49300A
                int r11 = r0.f49350z
                r13.<init>(r9, r10, r11, r8)
            L_0x04a4:
                java.lang.String r8 = r0.f49325a
                if (r8 == 0) goto L_0x04c4
                java.util.Map r8 = w9.C4152e.f49244i0
                java.lang.String r9 = r0.f49325a
                boolean r8 = r8.containsKey(r9)
                if (r8 == 0) goto L_0x04c4
                java.util.Map r7 = w9.C4152e.f49244i0
                java.lang.String r8 = r0.f49325a
                java.lang.Object r7 = r7.get(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
            L_0x04c4:
                int r8 = r0.f49342r
                if (r8 != 0) goto L_0x0514
                float r8 = r0.f49343s
                r9 = 0
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0514
                float r8 = r0.f49344t
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0514
                float r8 = r0.f49345u
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x04e3
                r7 = 0
                goto L_0x0514
            L_0x04e3:
                float r8 = r0.f49344t
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x04f0
                r7 = 90
                goto L_0x0514
            L_0x04f0:
                float r8 = r0.f49344t
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x0512
                float r8 = r0.f49344t
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0505
                goto L_0x0512
            L_0x0505:
                float r8 = r0.f49344t
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0514
                r7 = 270(0x10e, float:3.78E-43)
                goto L_0x0514
            L_0x0512:
                r7 = 180(0xb4, float:2.52E-43)
            L_0x0514:
                int r8 = r0.f49337m
                k9.q0$b r8 = r14.j0(r8)
                int r9 = r0.f49338n
                k9.q0$b r8 = r8.Q(r9)
                k9.q0$b r3 = r8.a0(r3)
                k9.q0$b r3 = r3.d0(r7)
                byte[] r7 = r0.f49346v
                k9.q0$b r3 = r3.b0(r7)
                int r7 = r0.f49347w
                k9.q0$b r3 = r3.h0(r7)
                r3.J(r13)
                r3 = 2
                goto L_0x0566
            L_0x0539:
                boolean r3 = r12.equals(r4)
                if (r3 != 0) goto L_0x0565
                boolean r3 = r10.equals(r4)
                if (r3 != 0) goto L_0x0565
                boolean r3 = r11.equals(r4)
                if (r3 != 0) goto L_0x0565
                boolean r3 = r8.equals(r4)
                if (r3 != 0) goto L_0x0565
                boolean r3 = r9.equals(r4)
                if (r3 != 0) goto L_0x0565
                boolean r3 = r7.equals(r4)
                if (r3 == 0) goto L_0x055e
                goto L_0x0565
            L_0x055e:
                java.lang.String r1 = "Unexpected MIME type."
                k9.L0 r1 = k9.L0.a(r1, r13)
                throw r1
            L_0x0565:
                r3 = r15
            L_0x0566:
                java.lang.String r7 = r0.f49325a
                if (r7 == 0) goto L_0x057b
                java.util.Map r7 = w9.C4152e.f49244i0
                java.lang.String r8 = r0.f49325a
                boolean r7 = r7.containsKey(r8)
                if (r7 != 0) goto L_0x057b
                java.lang.String r7 = r0.f49325a
                r14.U(r7)
            L_0x057b:
                r7 = r21
                k9.q0$b r7 = r14.R(r7)
                k9.q0$b r4 = r7.e0(r4)
                k9.q0$b r4 = r4.W(r6)
                java.lang.String r6 = r0.f49322W
                k9.q0$b r4 = r4.V(r6)
                k9.q0$b r4 = r4.g0(r5)
                k9.q0$b r1 = r4.T(r1)
                k9.q0$b r1 = r1.I(r2)
                o9.m r2 = r0.f49336l
                k9.q0$b r1 = r1.M(r2)
                k9.q0 r1 = r1.E()
                int r2 = r0.f49327c
                r4 = r20
                q9.B r2 = r4.d(r2, r3)
                r0.f49323X = r2
                r2.c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w9.C4152e.c.i(q9.m, int):void");
        }

        public void j() {
            C3963C c10 = this.f49319T;
            if (c10 != null) {
                c10.a(this.f49323X, this.f49334j);
            }
        }

        public void n() {
            C3963C c10 = this.f49319T;
            if (c10 != null) {
                c10.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f49244i0 = Collections.unmodifiableMap(hashMap);
    }

    public C4152e() {
        this(0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] A() {
        return new k[]{new C4152e()};
    }

    private boolean B(y yVar, long j10) {
        if (this.f49297y) {
            this.f49245A = j10;
            yVar.f47919a = this.f49298z;
            this.f49297y = false;
            return true;
        }
        if (this.f49294v) {
            long j11 = this.f49245A;
            if (j11 != -1) {
                yVar.f47919a = j11;
                this.f49245A = -1;
                return true;
            }
        }
        return false;
    }

    private void C(l lVar, int i10) {
        if (this.f49279g.f() < i10) {
            if (this.f49279g.b() < i10) {
                B b10 = this.f49279g;
                b10.c(Math.max(b10.b() * 2, i10));
            }
            lVar.readFully(this.f49279g.d(), this.f49279g.f(), i10 - this.f49279g.f());
            this.f49279g.O(i10);
        }
    }

    private void D() {
        this.f49263S = 0;
        this.f49264T = 0;
        this.f49265U = 0;
        this.f49266V = false;
        this.f49267W = false;
        this.f49268X = false;
        this.f49269Y = 0;
        this.f49270Z = 0;
        this.f49272a0 = false;
        this.f49282j.L(0);
    }

    private long E(long j10) {
        long j11 = this.f49290r;
        if (j11 != -9223372036854775807L) {
            return M.O0(j10, j11, 1000);
        }
        throw L0.a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private static void F(String str, long j10, byte[] bArr) {
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
                bArr2 = s(j10, "%01d:%02d:%02d:%02d", 10000);
                i10 = 21;
                break;
            case 1:
                bArr2 = s(j10, "%02d:%02d:%02d.%03d", 1000);
                i10 = 25;
                break;
            case 2:
                bArr2 = s(j10, "%02d:%02d:%02d,%03d", 1000);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    private int I(l lVar, c cVar, int i10, boolean z10) {
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f49326b)) {
            J(lVar, f49239d0, i10);
            return q();
        } else if ("S_TEXT/ASS".equals(cVar.f49326b)) {
            J(lVar, f49241f0, i10);
            return q();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f49326b)) {
            J(lVar, f49242g0, i10);
            return q();
        } else {
            C3962B b10 = cVar.f49323X;
            boolean z12 = true;
            if (!this.f49266V) {
                if (cVar.f49332h) {
                    this.f49259O &= -1073741825;
                    int i12 = 128;
                    if (!this.f49267W) {
                        lVar.readFully(this.f49279g.d(), 0, 1);
                        this.f49263S++;
                        if ((this.f49279g.d()[0] & 128) != 128) {
                            this.f49270Z = this.f49279g.d()[0];
                            this.f49267W = true;
                        } else {
                            throw L0.a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b11 = this.f49270Z;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f49259O |= 1073741824;
                        if (!this.f49272a0) {
                            lVar.readFully(this.f49284l.d(), 0, 8);
                            this.f49263S += 8;
                            this.f49272a0 = true;
                            byte[] d10 = this.f49279g.d();
                            if (!z11) {
                                i12 = 0;
                            }
                            d10[0] = (byte) (i12 | 8);
                            this.f49279g.P(0);
                            b10.b(this.f49279g, 1, 1);
                            this.f49264T++;
                            this.f49284l.P(0);
                            b10.b(this.f49284l, 8, 1);
                            this.f49264T += 8;
                        }
                        if (z11) {
                            if (!this.f49268X) {
                                lVar.readFully(this.f49279g.d(), 0, 1);
                                this.f49263S++;
                                this.f49279g.P(0);
                                this.f49269Y = this.f49279g.D();
                                this.f49268X = true;
                            }
                            int i13 = this.f49269Y * 4;
                            this.f49279g.L(i13);
                            lVar.readFully(this.f49279g.d(), 0, i13);
                            this.f49263S += i13;
                            short s10 = (short) ((this.f49269Y / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f49287o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f49287o = ByteBuffer.allocate(i14);
                            }
                            this.f49287o.position(0);
                            this.f49287o.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.f49269Y;
                                if (i15 >= i11) {
                                    break;
                                }
                                int H10 = this.f49279g.H();
                                if (i15 % 2 == 0) {
                                    this.f49287o.putShort((short) (H10 - i16));
                                } else {
                                    this.f49287o.putInt(H10 - i16);
                                }
                                i15++;
                                i16 = H10;
                            }
                            int i17 = (i10 - this.f49263S) - i16;
                            if (i11 % 2 == 1) {
                                this.f49287o.putInt(i17);
                            } else {
                                this.f49287o.putShort((short) i17);
                                this.f49287o.putInt(0);
                            }
                            this.f49285m.N(this.f49287o.array(), i14);
                            b10.b(this.f49285m, i14, 1);
                            this.f49264T += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f49333i;
                    if (bArr != null) {
                        this.f49282j.N(bArr, bArr.length);
                    }
                }
                if (cVar.o(z10)) {
                    this.f49259O |= 268435456;
                    this.f49286n.L(0);
                    int f10 = (this.f49282j.f() + i10) - this.f49263S;
                    this.f49279g.L(4);
                    this.f49279g.d()[0] = (byte) ((f10 >> 24) & 255);
                    this.f49279g.d()[1] = (byte) ((f10 >> 16) & 255);
                    this.f49279g.d()[2] = (byte) ((f10 >> 8) & 255);
                    this.f49279g.d()[3] = (byte) (f10 & 255);
                    b10.b(this.f49279g, 4, 2);
                    this.f49264T += 4;
                }
                this.f49266V = true;
            }
            int f11 = i10 + this.f49282j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f49326b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f49326b)) {
                if (cVar.f49319T != null) {
                    if (this.f49282j.f() != 0) {
                        z12 = false;
                    }
                    C3645a.f(z12);
                    cVar.f49319T.d(lVar);
                }
                while (true) {
                    int i18 = this.f49263S;
                    if (i18 >= f11) {
                        break;
                    }
                    int K10 = K(lVar, b10, f11 - i18);
                    this.f49263S += K10;
                    this.f49264T += K10;
                }
            } else {
                byte[] d11 = this.f49278f.d();
                d11[0] = 0;
                d11[1] = 0;
                d11[2] = 0;
                int i19 = cVar.f49324Y;
                int i20 = 4 - i19;
                while (this.f49263S < f11) {
                    int i21 = this.f49265U;
                    if (i21 == 0) {
                        L(lVar, d11, i20, i19);
                        this.f49263S += i19;
                        this.f49278f.P(0);
                        this.f49265U = this.f49278f.H();
                        this.f49277e.P(0);
                        b10.d(this.f49277e, 4);
                        this.f49264T += 4;
                    } else {
                        int K11 = K(lVar, b10, i21);
                        this.f49263S += K11;
                        this.f49264T += K11;
                        this.f49265U -= K11;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f49326b)) {
                this.f49280h.P(0);
                b10.d(this.f49280h, 4);
                this.f49264T += 4;
            }
            return q();
        }
    }

    private void J(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f49283k.b() < length) {
            this.f49283k.M(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f49283k.d(), 0, bArr.length);
        }
        lVar.readFully(this.f49283k.d(), bArr.length, i10);
        this.f49283k.P(0);
        this.f49283k.O(length);
    }

    private int K(l lVar, C3962B b10, int i10) {
        int a10 = this.f49282j.a();
        if (a10 <= 0) {
            return b10.a(lVar, i10, false);
        }
        int min = Math.min(i10, a10);
        b10.d(this.f49282j, min);
        return min;
    }

    private void L(l lVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f49282j.a());
        lVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f49282j.j(bArr, i10, min);
        }
    }

    private void g(int i10) {
        if (this.f49247C == null || this.f49248D == null) {
            throw L0.a("Element " + i10 + " must be in a Cues", (Throwable) null);
        }
    }

    private void j(int i10) {
        if (this.f49293u == null) {
            throw L0.a("Element " + i10 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    private void k() {
        C3645a.h(this.f49274b0);
    }

    private z m(t tVar, t tVar2) {
        int i10;
        if (this.f49289q == -1 || this.f49292t == -9223372036854775807L || tVar == null || tVar.c() == 0 || tVar2 == null || tVar2.c() != tVar.c()) {
            return new z.b(this.f49292t);
        }
        int c10 = tVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = tVar.b(i12);
            jArr[i12] = this.f49289q + tVar2.b(i12);
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
        iArr[i10] = (int) ((this.f49289q + this.f49288p) - jArr[i10]);
        long j10 = this.f49292t - jArr3[i10];
        jArr2[i10] = j10;
        if (j10 <= 0) {
            s.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new C3968c(iArr, jArr, jArr2, jArr3);
    }

    private void n(c cVar, long j10, int i10, int i11, int i12) {
        C3963C c10 = cVar.f49319T;
        if (c10 != null) {
            c10.c(cVar.f49323X, j10, i10, i11, i12, cVar.f49334j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f49326b) || "S_TEXT/ASS".equals(cVar.f49326b) || "S_TEXT/WEBVTT".equals(cVar.f49326b)) {
                if (this.f49255K > 1) {
                    s.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f49253I;
                    if (j11 == -9223372036854775807L) {
                        s.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f49326b, j11, this.f49283k.d());
                        int e10 = this.f49283k.e();
                        while (true) {
                            if (e10 >= this.f49283k.f()) {
                                break;
                            } else if (this.f49283k.d()[e10] == 0) {
                                this.f49283k.O(e10);
                                break;
                            } else {
                                e10++;
                            }
                        }
                        C3962B b10 = cVar.f49323X;
                        B b11 = this.f49283k;
                        b10.d(b11, b11.f());
                        i11 += this.f49283k.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.f49255K > 1) {
                    this.f49286n.L(0);
                } else {
                    int f10 = this.f49286n.f();
                    cVar.f49323X.b(this.f49286n, f10, 2);
                    i11 += f10;
                }
            }
            cVar.f49323X.f(j10, i10, i11, i12, cVar.f49334j);
        }
        this.f49250F = true;
    }

    private static int[] p(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    private int q() {
        int i10 = this.f49264T;
        D();
        return i10;
    }

    private static byte[] s(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return M.n0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    private static boolean y(String str) {
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
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
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
            case com.amazon.c.a.a.c.f37660h:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public void G(int i10, long j10, long j11) {
        k();
        if (i10 == 160) {
            this.f49261Q = false;
            this.f49262R = 0;
        } else if (i10 == 174) {
            this.f49293u = new c();
        } else if (i10 == 187) {
            this.f49249E = false;
        } else if (i10 == 19899) {
            this.f49295w = -1;
            this.f49296x = -1;
        } else if (i10 == 20533) {
            t(i10).f49332h = true;
        } else if (i10 == 21968) {
            t(i10).f49348x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f49289q;
            if (j12 == -1 || j12 == j10) {
                this.f49289q = j10;
                this.f49288p = j11;
                return;
            }
            throw L0.a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.f49247C = new t();
            this.f49248D = new t();
        } else if (i10 != 524531317 || this.f49294v) {
        } else {
            if (!this.f49276d || this.f49298z == -1) {
                this.f49274b0.q(new z.b(this.f49292t));
                this.f49294v = true;
                return;
            }
            this.f49297y = true;
        }
    }

    /* access modifiers changed from: protected */
    public void H(int i10, String str) {
        if (i10 == 134) {
            t(i10).f49326b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                t(i10).f49325a = str;
            } else if (i10 == 2274716) {
                String unused = t(i10).f49322W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw L0.a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public void a(long j10, long j11) {
        this.f49246B = -9223372036854775807L;
        this.f49251G = 0;
        this.f49271a.reset();
        this.f49273b.e();
        D();
        for (int i10 = 0; i10 < this.f49275c.size(); i10++) {
            ((c) this.f49275c.valueAt(i10)).n();
        }
    }

    public final void f(m mVar) {
        this.f49274b0 = mVar;
    }

    public final boolean h(l lVar) {
        return new C4153f().b(lVar);
    }

    public final int i(l lVar, y yVar) {
        this.f49250F = false;
        boolean z10 = true;
        while (z10 && !this.f49250F) {
            z10 = this.f49271a.a(lVar);
            if (z10 && B(yVar, lVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f49275c.size(); i10++) {
            c cVar = (c) this.f49275c.valueAt(i10);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0231, code lost:
        throw k9.L0.a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(int r22, int r23, q9.l r24) {
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
            r21.j(r22)
            w9.e$c r0 = r7.f49293u
            byte[] r2 = new byte[r1]
            r0.f49346v = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            k9.L0 r0 = k9.L0.a(r0, r4)
            throw r0
        L_0x0054:
            r21.j(r22)
            w9.e$c r0 = r7.f49293u
            byte[] r2 = new byte[r1]
            r0.f49335k = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x0062:
            ja.B r0 = r7.f49281i
            byte[] r0 = r0.d()
            java.util.Arrays.fill(r0, r9)
            ja.B r0 = r7.f49281i
            byte[] r0 = r0.d()
            int r2 = 4 - r1
            r8.readFully(r0, r2, r1)
            ja.B r0 = r7.f49281i
            r0.P(r9)
            ja.B r0 = r7.f49281i
            long r0 = r0.F()
            int r0 = (int) r0
            r7.f49295w = r0
            goto L_0x02ec
        L_0x0086:
            byte[] r2 = new byte[r1]
            r8.readFully(r2, r9, r1)
            w9.e$c r0 = r21.t(r22)
            q9.B$a r1 = new q9.B$a
            r1.<init>(r10, r2, r9, r9)
            r0.f49334j = r1
            goto L_0x02ec
        L_0x0098:
            r21.j(r22)
            w9.e$c r0 = r7.f49293u
            byte[] r2 = new byte[r1]
            r0.f49333i = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x00a6:
            w9.e$c r0 = r21.t(r22)
            r7.v(r0, r8, r1)
            goto L_0x02ec
        L_0x00af:
            int r0 = r7.f49251G
            if (r0 == r5) goto L_0x00b4
            return
        L_0x00b4:
            android.util.SparseArray r0 = r7.f49275c
            int r2 = r7.f49257M
            java.lang.Object r0 = r0.get(r2)
            w9.e$c r0 = (w9.C4152e.c) r0
            int r2 = r7.f49260P
            r7.w(r0, r2, r8, r1)
            goto L_0x02ec
        L_0x00c5:
            int r2 = r7.f49251G
            r6 = 8
            if (r2 != 0) goto L_0x00ea
            w9.g r2 = r7.f49273b
            long r11 = r2.d(r8, r9, r10, r6)
            int r2 = (int) r11
            r7.f49257M = r2
            w9.g r2 = r7.f49273b
            int r2 = r2.b()
            r7.f49258N = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f49253I = r11
            r7.f49251G = r10
            ja.B r2 = r7.f49279g
            r2.L(r9)
        L_0x00ea:
            android.util.SparseArray r2 = r7.f49275c
            int r11 = r7.f49257M
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            w9.e$c r11 = (w9.C4152e.c) r11
            if (r11 != 0) goto L_0x0101
            int r0 = r7.f49258N
            int r0 = r1 - r0
            r8.j(r0)
            r7.f49251G = r9
            return
        L_0x0101:
            r11.f()
            int r2 = r7.f49251G
            if (r2 != r10) goto L_0x02a3
            r2 = 3
            r7.C(r8, r2)
            ja.B r12 = r7.f49279g
            byte[] r12 = r12.d()
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r10
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x012f
            r7.f49255K = r10
            int[] r4 = r7.f49256L
            int[] r4 = p(r4, r10)
            r7.f49256L = r4
            int r12 = r7.f49258N
            int r1 = r1 - r12
            int r1 = r1 - r2
            r4[r9] = r1
        L_0x012b:
            r18 = r11
            goto L_0x0246
        L_0x012f:
            r14 = 4
            r7.C(r8, r14)
            ja.B r15 = r7.f49279g
            byte[] r15 = r15.d()
            byte r15 = r15[r2]
            r15 = r15 & r13
            int r15 = r15 + r10
            r7.f49255K = r15
            int[] r3 = r7.f49256L
            int[] r3 = p(r3, r15)
            r7.f49256L = r3
            if (r12 != r5) goto L_0x0154
            int r2 = r7.f49258N
            int r1 = r1 - r2
            int r1 = r1 - r14
            int r2 = r7.f49255K
            int r1 = r1 / r2
            java.util.Arrays.fill(r3, r9, r2, r1)
            goto L_0x012b
        L_0x0154:
            if (r12 != r10) goto L_0x018b
            r2 = r9
            r3 = r2
        L_0x0158:
            int r4 = r7.f49255K
            int r12 = r4 + -1
            if (r2 >= r12) goto L_0x0180
            int[] r4 = r7.f49256L
            r4[r2] = r9
        L_0x0162:
            int r4 = r14 + 1
            r7.C(r8, r4)
            ja.B r12 = r7.f49279g
            byte[] r12 = r12.d()
            byte r12 = r12[r14]
            r12 = r12 & r13
            int[] r14 = r7.f49256L
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
            int[] r2 = r7.f49256L
            int r4 = r4 - r10
            int r12 = r7.f49258N
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
            int r12 = r7.f49255K
            int r15 = r12 + -1
            if (r2 >= r15) goto L_0x0239
            int[] r12 = r7.f49256L
            r12[r2] = r9
            int r12 = r14 + 1
            r7.C(r8, r12)
            ja.B r15 = r7.f49279g
            byte[] r15 = r15.d()
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x0232
            r15 = r9
        L_0x01a9:
            if (r15 >= r6) goto L_0x01ff
            int r16 = 7 - r15
            int r5 = r10 << r16
            ja.B r9 = r7.f49279g
            byte[] r9 = r9.d()
            byte r9 = r9[r14]
            r9 = r9 & r5
            if (r9 == 0) goto L_0x01f5
            int r12 = r12 + r15
            r7.C(r8, r12)
            ja.B r9 = r7.f49279g
            byte[] r9 = r9.d()
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
            ja.B r14 = r7.f49279g
            byte[] r14 = r14.d()
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
            int[] r10 = r7.f49256L
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
            k9.L0 r0 = k9.L0.a(r0, r4)
            throw r0
        L_0x0232:
            java.lang.String r0 = "No valid varint length mask found"
            k9.L0 r0 = k9.L0.a(r0, r4)
            throw r0
        L_0x0239:
            r18 = r11
            int[] r2 = r7.f49256L
            r4 = 1
            int r12 = r12 - r4
            int r4 = r7.f49258N
            int r1 = r1 - r4
            int r1 = r1 - r14
            int r1 = r1 - r3
            r2[r12] = r1
        L_0x0246:
            ja.B r1 = r7.f49279g
            byte[] r1 = r1.d()
            r2 = 0
            byte r1 = r1[r2]
            int r1 = r1 << r6
            ja.B r2 = r7.f49279g
            byte[] r2 = r2.d()
            r3 = 1
            byte r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r1 = r1 | r2
            long r2 = r7.f49246B
            long r4 = (long) r1
            long r4 = r7.E(r4)
            long r2 = r2 + r4
            r7.f49252H = r2
            r10 = r18
            int r1 = r10.f49328d
            r2 = 2
            if (r1 == r2) goto L_0x0282
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0280
            ja.B r1 = r7.f49279g
            byte[] r1 = r1.d()
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
            r7.f49259O = r1
            r7.f49251G = r2
            r1 = 0
            r7.f49254J = r1
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x02a5
        L_0x028d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected lacing value: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            k9.L0 r0 = k9.L0.a(r0, r4)
            throw r0
        L_0x02a3:
            r10 = r11
            r1 = r3
        L_0x02a5:
            if (r0 != r1) goto L_0x02d5
        L_0x02a7:
            int r0 = r7.f49254J
            int r1 = r7.f49255K
            if (r0 >= r1) goto L_0x02d1
            int[] r1 = r7.f49256L
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.I(r8, r10, r0, r1)
            long r0 = r7.f49252H
            int r2 = r7.f49254J
            int r3 = r10.f49329e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f49259O
            r6 = 0
            r0 = r21
            r1 = r10
            r0.n(r1, r2, r4, r5, r6)
            int r0 = r7.f49254J
            r1 = 1
            int r0 = r0 + r1
            r7.f49254J = r0
            goto L_0x02a7
        L_0x02d1:
            r0 = 0
            r7.f49251G = r0
            goto L_0x02ec
        L_0x02d5:
            r1 = 1
        L_0x02d6:
            int r0 = r7.f49254J
            int r2 = r7.f49255K
            if (r0 >= r2) goto L_0x02ec
            int[] r2 = r7.f49256L
            r3 = r2[r0]
            int r3 = r7.I(r8, r10, r3, r1)
            r2[r0] = r3
            int r0 = r7.f49254J
            int r0 = r0 + r1
            r7.f49254J = r0
            goto L_0x02d6
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.C4152e.l(int, int, q9.l):void");
    }

    /* access modifiers changed from: protected */
    public void o(int i10) {
        k();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) C3645a.h(this.f49293u);
                String str = cVar.f49326b;
                if (str != null) {
                    if (y(str)) {
                        cVar.i(this.f49274b0, cVar.f49327c);
                        this.f49275c.put(cVar.f49327c, cVar);
                    }
                    this.f49293u = null;
                    return;
                }
                throw L0.a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i10 == 19899) {
                int i11 = this.f49295w;
                if (i11 != -1) {
                    long j10 = this.f49296x;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f49298z = j10;
                            return;
                        }
                        return;
                    }
                }
                throw L0.a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i10 == 25152) {
                j(i10);
                c cVar2 = this.f49293u;
                if (!cVar2.f49332h) {
                    return;
                }
                if (cVar2.f49334j != null) {
                    cVar2.f49336l = new o9.m(new m.b(C3702j.f45575a, "video/webm", this.f49293u.f49334j.f47792b));
                    return;
                }
                throw L0.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i10 == 28032) {
                j(i10);
                c cVar3 = this.f49293u;
                if (cVar3.f49332h && cVar3.f49333i != null) {
                    throw L0.a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i10 == 357149030) {
                if (this.f49290r == -9223372036854775807L) {
                    this.f49290r = 1000000;
                }
                long j11 = this.f49291s;
                if (j11 != -9223372036854775807L) {
                    this.f49292t = E(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f49294v) {
                        this.f49274b0.q(m(this.f49247C, this.f49248D));
                        this.f49294v = true;
                    }
                    this.f49247C = null;
                    this.f49248D = null;
                }
            } else if (this.f49275c.size() != 0) {
                this.f49274b0.k();
            } else {
                throw L0.a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.f49251G == 2) {
            c cVar4 = (c) this.f49275c.get(this.f49257M);
            cVar4.f();
            if (this.f49262R > 0 && "A_OPUS".equals(cVar4.f49326b)) {
                this.f49286n.M(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f49262R).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f49255K; i13++) {
                i12 += this.f49256L[i13];
            }
            int i14 = 0;
            while (i14 < this.f49255K) {
                long j12 = this.f49252H + ((long) ((cVar4.f49329e * i14) / 1000));
                int i15 = this.f49259O;
                if (i14 == 0 && !this.f49261Q) {
                    i15 |= 1;
                }
                int i16 = this.f49256L[i14];
                int i17 = i12 - i16;
                n(cVar4, j12, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.f49251G = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void r(int i10, double d10) {
        if (i10 == 181) {
            t(i10).f49316Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    t(i10).f49303D = (float) d10;
                    return;
                case 21970:
                    t(i10).f49304E = (float) d10;
                    return;
                case 21971:
                    t(i10).f49305F = (float) d10;
                    return;
                case 21972:
                    t(i10).f49306G = (float) d10;
                    return;
                case 21973:
                    t(i10).f49307H = (float) d10;
                    return;
                case 21974:
                    t(i10).f49308I = (float) d10;
                    return;
                case 21975:
                    t(i10).f49309J = (float) d10;
                    return;
                case 21976:
                    t(i10).f49310K = (float) d10;
                    return;
                case 21977:
                    t(i10).f49311L = (float) d10;
                    return;
                case 21978:
                    t(i10).f49312M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            t(i10).f49343s = (float) d10;
                            return;
                        case 30324:
                            t(i10).f49344t = (float) d10;
                            return;
                        case 30325:
                            t(i10).f49345u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f49291s = (long) d10;
        }
    }

    /* access modifiers changed from: protected */
    public c t(int i10) {
        j(i10);
        return this.f49293u;
    }

    /* access modifiers changed from: protected */
    public int u(int i10) {
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
    public void v(c cVar, l lVar, int i10) {
        if (cVar.f49331g == 1685485123 || cVar.f49331g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.f49313N = bArr;
            lVar.readFully(bArr, 0, i10);
            return;
        }
        lVar.j(i10);
    }

    /* access modifiers changed from: protected */
    public void w(c cVar, int i10, l lVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f49326b)) {
            lVar.j(i11);
            return;
        }
        this.f49286n.L(i11);
        lVar.readFully(this.f49286n.d(), 0, i11);
    }

    /* access modifiers changed from: protected */
    public void x(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        t(i10).f49328d = (int) j10;
                        return;
                    case 136:
                        c t10 = t(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        t10.f49321V = z10;
                        return;
                    case 155:
                        this.f49253I = E(j10);
                        return;
                    case 159:
                        t(i10).f49314O = (int) j10;
                        return;
                    case 176:
                        t(i10).f49337m = (int) j10;
                        return;
                    case 179:
                        g(i10);
                        this.f49247C.a(E(j10));
                        return;
                    case 186:
                        t(i10).f49338n = (int) j10;
                        return;
                    case 215:
                        t(i10).f49327c = (int) j10;
                        return;
                    case 231:
                        this.f49246B = E(j10);
                        return;
                    case 238:
                        this.f49260P = (int) j10;
                        return;
                    case 241:
                        if (!this.f49249E) {
                            g(i10);
                            this.f49248D.a(j10);
                            this.f49249E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f49261Q = true;
                        return;
                    case 16871:
                        int unused = t(i10).f49331g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw L0.a("ContentCompAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw L0.a("DocTypeReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw L0.a("EBMLReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw L0.a("ContentEncAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw L0.a("AESSettingsCipherMode " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f49296x = j10 + this.f49289q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        j(i10);
                        if (i11 == 0) {
                            this.f49293u.f49347w = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f49293u.f49347w = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f49293u.f49347w = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f49293u.f49347w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        t(i10).f49339o = (int) j10;
                        return;
                    case 21682:
                        t(i10).f49341q = (int) j10;
                        return;
                    case 21690:
                        t(i10).f49340p = (int) j10;
                        return;
                    case 21930:
                        c t11 = t(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        t11.f49320U = z10;
                        return;
                    case 21998:
                        t(i10).f49330f = (int) j10;
                        return;
                    case 22186:
                        t(i10).f49317R = j10;
                        return;
                    case 22203:
                        t(i10).f49318S = j10;
                        return;
                    case 25188:
                        t(i10).f49315P = (int) j10;
                        return;
                    case 30114:
                        this.f49262R = j10;
                        return;
                    case 30321:
                        j(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f49293u.f49342r = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f49293u.f49342r = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f49293u.f49342r = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f49293u.f49342r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        t(i10).f49329e = (int) j10;
                        return;
                    case 2807729:
                        this.f49290r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                j(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f49293u.f49300A = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f49293u.f49300A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                j(i10);
                                int c10 = ka.c.c((int) j10);
                                if (c10 != -1) {
                                    this.f49293u.f49350z = c10;
                                    return;
                                }
                                return;
                            case 21947:
                                j(i10);
                                this.f49293u.f49348x = true;
                                int b10 = ka.c.b((int) j10);
                                if (b10 != -1) {
                                    this.f49293u.f49349y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                t(i10).f49301B = (int) j10;
                                return;
                            case 21949:
                                t(i10).f49302C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw L0.a("ContentEncodingScope " + j10 + " not supported", (Throwable) null);
            }
        } else if (j10 != 0) {
            throw L0.a("ContentEncodingOrder " + j10 + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean z(int i10) {
        if (i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427) {
            return true;
        }
        return false;
    }

    public C4152e(int i10) {
        this(new C4148a(), i10);
    }

    C4152e(C4150c cVar, int i10) {
        this.f49289q = -1;
        this.f49290r = -9223372036854775807L;
        this.f49291s = -9223372036854775807L;
        this.f49292t = -9223372036854775807L;
        this.f49298z = -1;
        this.f49245A = -1;
        this.f49246B = -9223372036854775807L;
        this.f49271a = cVar;
        cVar.b(new b());
        this.f49276d = (i10 & 1) == 0;
        this.f49273b = new C4154g();
        this.f49275c = new SparseArray();
        this.f49279g = new B(4);
        this.f49280h = new B(ByteBuffer.allocate(4).putInt(-1).array());
        this.f49281i = new B(4);
        this.f49277e = new B(x.f45063a);
        this.f49278f = new B(4);
        this.f49282j = new B();
        this.f49283k = new B();
        this.f49284l = new B(8);
        this.f49285m = new B();
        this.f49286n = new B();
        this.f49256L = new int[1];
    }

    public final void release() {
    }
}
