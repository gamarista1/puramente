package R1;

import R1.b;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.common.api.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f5586A = {4};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f5587B = {8};

    /* renamed from: C  reason: collision with root package name */
    static final byte[] f5588C = {-1, -40, -1};

    /* renamed from: D  reason: collision with root package name */
    private static final byte[] f5589D = {102, 116, 121, 112};

    /* renamed from: E  reason: collision with root package name */
    private static final byte[] f5590E = {109, 105, 102, 49};

    /* renamed from: F  reason: collision with root package name */
    private static final byte[] f5591F = {104, 101, 105, 99};

    /* renamed from: G  reason: collision with root package name */
    private static final byte[] f5592G = {97, 118, 105, 102};

    /* renamed from: H  reason: collision with root package name */
    private static final byte[] f5593H = {97, 118, 105, 115};

    /* renamed from: I  reason: collision with root package name */
    private static final byte[] f5594I = {79, 76, 89, 77, 80, 0};

    /* renamed from: J  reason: collision with root package name */
    private static final byte[] f5595J = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: K  reason: collision with root package name */
    private static final byte[] f5596K = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: L  reason: collision with root package name */
    static final byte[] f5597L = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: M  reason: collision with root package name */
    private static final byte[] f5598M = {82, 73, 70, 70};

    /* renamed from: N  reason: collision with root package name */
    private static final byte[] f5599N = {87, 69, 66, 80};

    /* renamed from: O  reason: collision with root package name */
    private static final byte[] f5600O = {69, 88, 73, 70};

    /* renamed from: P  reason: collision with root package name */
    private static final byte[] f5601P = {-99, 1, 42};

    /* renamed from: Q  reason: collision with root package name */
    private static final byte[] f5602Q = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: R  reason: collision with root package name */
    private static final byte[] f5603R = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: S  reason: collision with root package name */
    private static final byte[] f5604S = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: T  reason: collision with root package name */
    private static final byte[] f5605T = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: U  reason: collision with root package name */
    private static final byte[] f5606U = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V  reason: collision with root package name */
    private static final SimpleDateFormat f5607V;

    /* renamed from: W  reason: collision with root package name */
    private static final SimpleDateFormat f5608W;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public static final String[] f5609X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public static final int[] f5610Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public static final byte[] f5611Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a0  reason: collision with root package name */
    private static final e[] f5612a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final e[] f5613b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final e[] f5614c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final e[] f5615d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final e[] f5616e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final e f5617f0 = new e("StripOffsets", 273, 3);

    /* renamed from: g0  reason: collision with root package name */
    private static final e[] f5618g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final e[] f5619h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final e[] f5620i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final e[] f5621j0;

    /* renamed from: k0  reason: collision with root package name */
    static final e[][] f5622k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final e[] f5623l0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: m0  reason: collision with root package name */
    private static final HashMap[] f5624m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final HashMap[] f5625n0;

    /* renamed from: o0  reason: collision with root package name */
    private static final Set f5626o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance"})));

    /* renamed from: p0  reason: collision with root package name */
    private static final HashMap f5627p0 = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public static final Charset f5628q0;

    /* renamed from: r0  reason: collision with root package name */
    static final byte[] f5629r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final byte[] f5630s0;

    /* renamed from: t0  reason: collision with root package name */
    private static final Pattern f5631t0 = Pattern.compile(".*[1-9].*");

    /* renamed from: u0  reason: collision with root package name */
    private static final Pattern f5632u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: v0  reason: collision with root package name */
    private static final Pattern f5633v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: w  reason: collision with root package name */
    private static final boolean f5634w = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w0  reason: collision with root package name */
    private static final Pattern f5635w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: x  reason: collision with root package name */
    private static final List f5636x = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: y  reason: collision with root package name */
    private static final List f5637y = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f5638z = {8, 8, 8};

    /* renamed from: a  reason: collision with root package name */
    private String f5639a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f5640b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f5641c;

    /* renamed from: d  reason: collision with root package name */
    private int f5642d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5643e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap[] f5644f;

    /* renamed from: g  reason: collision with root package name */
    private Set f5645g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f5646h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5647i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5648j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5649k;

    /* renamed from: l  reason: collision with root package name */
    private int f5650l;

    /* renamed from: m  reason: collision with root package name */
    private int f5651m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f5652n;

    /* renamed from: o  reason: collision with root package name */
    private int f5653o;

    /* renamed from: p  reason: collision with root package name */
    private int f5654p;

    /* renamed from: q  reason: collision with root package name */
    private int f5655q;

    /* renamed from: r  reason: collision with root package name */
    private int f5656r;

    /* renamed from: s  reason: collision with root package name */
    private int f5657s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5658t;

    /* renamed from: u  reason: collision with root package name */
    private d f5659u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5660v;

    private static class c extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        final DataOutputStream f5669a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f5670b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f5669a = new DataOutputStream(outputStream);
            this.f5670b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f5670b = byteOrder;
        }

        public void b(int i10) {
            this.f5669a.write(i10);
        }

        public void f(int i10) {
            ByteOrder byteOrder = this.f5670b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f5669a.write(i10 & 255);
                this.f5669a.write((i10 >>> 8) & 255);
                this.f5669a.write((i10 >>> 16) & 255);
                this.f5669a.write((i10 >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f5669a.write((i10 >>> 24) & 255);
                this.f5669a.write((i10 >>> 16) & 255);
                this.f5669a.write((i10 >>> 8) & 255);
                this.f5669a.write(i10 & 255);
            }
        }

        public void n(short s10) {
            ByteOrder byteOrder = this.f5670b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f5669a.write(s10 & 255);
                this.f5669a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f5669a.write((s10 >>> 8) & 255);
                this.f5669a.write(s10 & 255);
            }
        }

        public void o(long j10) {
            if (j10 <= 4294967295L) {
                f((int) j10);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }

        public void q(int i10) {
            if (i10 <= 65535) {
                n((short) i10);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }

        public void write(byte[] bArr) {
            this.f5669a.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            this.f5669a.write(bArr, i10, i11);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f5671a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5672b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5673c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f5674d;

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1, bArr);
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.f5628q0);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5610Y[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5610Y[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5610Y[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f5679a);
                wrap.putInt((int) fVar.f5680b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + 0).getBytes(a.f5628q0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5610Y[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5610Y[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f5679a);
                wrap.putInt((int) fVar.f5680b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5610Y[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof double[]) {
                    double[] dArr = (double[]) o10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof f[]) {
                    f[] fVarArr = (f[]) o10;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f37529a);
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f37529a);
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f37529a);
                    }
                }
                return sb2.toString();
            } else if (!(o10 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o10;
                while (i10 < fVarArr.length) {
                    sb2.append(fVarArr[i10].f5679a);
                    sb2.append('/');
                    sb2.append(fVarArr[i10].f5680b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f37529a);
                    }
                }
                return sb2.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x01a1 A[SYNTHETIC, Splitter:B:162:0x01a1] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object o(java.nio.ByteOrder r14) {
            /*
                r13 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "IOException occurred while closing InputStream"
                java.lang.String r3 = "ExifInterface"
                r4 = 0
                R1.a$b r5 = new R1.a$b     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                byte[] r6 = r13.f5674d     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r5.<init>((byte[]) r6)     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r5.o(r14)     // Catch:{ IOException -> 0x0033 }
                int r14 = r13.f5671a     // Catch:{ IOException -> 0x0033 }
                switch(r14) {
                    case 1: goto L_0x0159;
                    case 2: goto L_0x0107;
                    case 3: goto L_0x00ee;
                    case 4: goto L_0x00d5;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x0159;
                    case 7: goto L_0x0107;
                    case 8: goto L_0x0098;
                    case 9: goto L_0x007f;
                    case 10: goto L_0x0059;
                    case 11: goto L_0x003f;
                    case 12: goto L_0x001f;
                    default: goto L_0x0016;
                }
            L_0x0016:
                r5.close()     // Catch:{ IOException -> 0x001a }
                goto L_0x001e
            L_0x001a:
                r14 = move-exception
                android.util.Log.e(r3, r2, r14)
            L_0x001e:
                return r4
            L_0x001f:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                double[] r14 = new double[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x0023:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0036
                double r6 = r5.readDouble()     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x002f:
                r14 = move-exception
                r4 = r5
                goto L_0x019f
            L_0x0033:
                r14 = move-exception
                goto L_0x018f
            L_0x0036:
                r5.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x003e
            L_0x003a:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x003e:
                return r14
            L_0x003f:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                double[] r14 = new double[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x0043:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0050
                float r6 = r5.readFloat()     // Catch:{ IOException -> 0x0033 }
                double r6 = (double) r6     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0043
            L_0x0050:
                r5.close()     // Catch:{ IOException -> 0x0054 }
                goto L_0x0058
            L_0x0054:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0058:
                return r14
            L_0x0059:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                R1.a$f[] r14 = new R1.a.f[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x005d:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0076
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r8 = (long) r6     // Catch:{ IOException -> 0x0033 }
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r10 = (long) r6     // Catch:{ IOException -> 0x0033 }
                R1.a$f r6 = new R1.a$f     // Catch:{ IOException -> 0x0033 }
                r12 = 0
                r7 = r6
                r7.<init>(r8, r10, r12)     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x005d
            L_0x0076:
                r5.close()     // Catch:{ IOException -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x007e:
                return r14
            L_0x007f:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                int[] r14 = new int[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x0083:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x008f
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0083
            L_0x008f:
                r5.close()     // Catch:{ IOException -> 0x0093 }
                goto L_0x0097
            L_0x0093:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0097:
                return r14
            L_0x0098:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                int[] r14 = new int[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x009c:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00a8
                short r6 = r5.readShort()     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x009c
            L_0x00a8:
                r5.close()     // Catch:{ IOException -> 0x00ac }
                goto L_0x00b0
            L_0x00ac:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00b0:
                return r14
            L_0x00b1:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                R1.a$f[] r14 = new R1.a.f[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x00b5:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00cc
                long r8 = r5.n()     // Catch:{ IOException -> 0x0033 }
                long r10 = r5.n()     // Catch:{ IOException -> 0x0033 }
                R1.a$f r6 = new R1.a$f     // Catch:{ IOException -> 0x0033 }
                r12 = 0
                r7 = r6
                r7.<init>(r8, r10, r12)     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00b5
            L_0x00cc:
                r5.close()     // Catch:{ IOException -> 0x00d0 }
                goto L_0x00d4
            L_0x00d0:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00d4:
                return r14
            L_0x00d5:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                long[] r14 = new long[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x00d9:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00e5
                long r6 = r5.n()     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00d9
            L_0x00e5:
                r5.close()     // Catch:{ IOException -> 0x00e9 }
                goto L_0x00ed
            L_0x00e9:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00ed:
                return r14
            L_0x00ee:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                int[] r14 = new int[r14]     // Catch:{ IOException -> 0x0033 }
            L_0x00f2:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00fe
                int r6 = r5.readUnsignedShort()     // Catch:{ IOException -> 0x0033 }
                r14[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00f2
            L_0x00fe:
                r5.close()     // Catch:{ IOException -> 0x0102 }
                goto L_0x0106
            L_0x0102:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0106:
                return r14
            L_0x0107:
                int r14 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                byte[] r6 = R1.a.f5611Z     // Catch:{ IOException -> 0x0033 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r14 < r6) goto L_0x012c
                r14 = r0
            L_0x0111:
                byte[] r6 = R1.a.f5611Z     // Catch:{ IOException -> 0x0033 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r14 >= r6) goto L_0x0127
                byte[] r6 = r13.f5674d     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r14]     // Catch:{ IOException -> 0x0033 }
                byte[] r7 = R1.a.f5611Z     // Catch:{ IOException -> 0x0033 }
                byte r7 = r7[r14]     // Catch:{ IOException -> 0x0033 }
                if (r6 == r7) goto L_0x0125
                goto L_0x012c
            L_0x0125:
                int r14 = r14 + r1
                goto L_0x0111
            L_0x0127:
                byte[] r14 = R1.a.f5611Z     // Catch:{ IOException -> 0x0033 }
                int r0 = r14.length     // Catch:{ IOException -> 0x0033 }
            L_0x012c:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0033 }
                r14.<init>()     // Catch:{ IOException -> 0x0033 }
            L_0x0131:
                int r6 = r13.f5672b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x014c
                byte[] r6 = r13.f5674d     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 != 0) goto L_0x013c
                goto L_0x014c
            L_0x013c:
                r7 = 32
                if (r6 < r7) goto L_0x0145
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                r14.append(r6)     // Catch:{ IOException -> 0x0033 }
                goto L_0x014a
            L_0x0145:
                r6 = 63
                r14.append(r6)     // Catch:{ IOException -> 0x0033 }
            L_0x014a:
                int r0 = r0 + r1
                goto L_0x0131
            L_0x014c:
                java.lang.String r14 = r14.toString()     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0154 }
                goto L_0x0158
            L_0x0154:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0158:
                return r14
            L_0x0159:
                byte[] r14 = r13.f5674d     // Catch:{ IOException -> 0x0033 }
                int r6 = r14.length     // Catch:{ IOException -> 0x0033 }
                if (r6 != r1) goto L_0x0179
                byte r6 = r14[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 < 0) goto L_0x0179
                if (r6 > r1) goto L_0x0179
                java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0033 }
                r1[r0] = r6     // Catch:{ IOException -> 0x0033 }
                r14.<init>(r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0174 }
                goto L_0x0178
            L_0x0174:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0178:
                return r14
            L_0x0179:
                java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                java.nio.charset.Charset r1 = R1.a.f5628q0     // Catch:{ IOException -> 0x0033 }
                r0.<init>(r14, r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0186 }
                goto L_0x018a
            L_0x0186:
                r14 = move-exception
                android.util.Log.e(r3, r2, r14)
            L_0x018a:
                return r0
            L_0x018b:
                r14 = move-exception
                goto L_0x019f
            L_0x018d:
                r14 = move-exception
                r5 = r4
            L_0x018f:
                java.lang.String r0 = "IOException occurred during reading a value"
                android.util.Log.w(r3, r0, r14)     // Catch:{ all -> 0x002f }
                if (r5 == 0) goto L_0x019e
                r5.close()     // Catch:{ IOException -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r14 = move-exception
                android.util.Log.e(r3, r2, r14)
            L_0x019e:
                return r4
            L_0x019f:
                if (r4 == 0) goto L_0x01a9
                r4.close()     // Catch:{ IOException -> 0x01a5 }
                goto L_0x01a9
            L_0x01a5:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x01a9:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: R1.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.f5610Y[this.f5671a] * this.f5672b;
        }

        public String toString() {
            return "(" + a.f5609X[this.f5671a] + ", data length:" + this.f5674d.length + ")";
        }

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f5671a = i10;
            this.f5672b = i11;
            this.f5673c = j10;
            this.f5674d = bArr;
        }
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f5679a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5680b;

        /* synthetic */ f(long j10, long j11, C0138a aVar) {
            this(j10, j11);
        }

        public static f b(double d10) {
            long j10;
            long j11;
            long j12;
            long j13 = 1;
            if (d10 >= 9.223372036854776E18d || d10 <= -9.223372036854776E18d) {
                if (d10 > 0.0d) {
                    j10 = Long.MAX_VALUE;
                } else {
                    j10 = Long.MIN_VALUE;
                }
                return new f(j10, 1);
            }
            double abs = Math.abs(d10);
            long j14 = 0;
            long j15 = 1;
            double d11 = abs;
            long j16 = 0;
            while (true) {
                double d12 = d11 % 1.0d;
                long j17 = (long) (d11 - d12);
                j11 = j16 + (j17 * j13);
                j12 = (j17 * j14) + j15;
                d11 = 1.0d / d12;
                long j18 = j13;
                if (Math.abs(abs - (((double) j11) / ((double) j12))) <= 1.0E-8d * abs) {
                    break;
                }
                j15 = j14;
                j13 = j11;
                j16 = j18;
                j14 = j12;
            }
            if (d10 < 0.0d) {
                j11 = -j11;
            }
            return new f(j11, j12);
        }

        public double a() {
            return ((double) this.f5679a) / ((double) this.f5680b);
        }

        public String toString() {
            return this.f5679a + "/" + this.f5680b;
        }

        private f(long j10, long j11) {
            if (j11 == 0) {
                this.f5679a = 0;
                this.f5680b = 1;
                return;
            }
            this.f5679a = j10;
            this.f5680b = j11;
        }
    }

    static {
        e eVar = r12;
        e eVar2 = new e("NewSubfileType", 254, 4);
        e eVar3 = r6;
        e eVar4 = new e("SubfileType", 255, 4);
        e eVar5 = r6;
        e eVar6 = new e("ImageWidth", 256, 3, 4);
        e eVar7 = r6;
        e eVar8 = new e("ImageLength", 257, 3, 4);
        e eVar9 = r6;
        e eVar10 = new e("BitsPerSample", 258, 3);
        e eVar11 = r6;
        e eVar12 = new e("Compression", 259, 3);
        e eVar13 = r6;
        e eVar14 = new e("PhotometricInterpretation", 262, 3);
        e eVar15 = r6;
        e eVar16 = new e("ImageDescription", 270, 2);
        e eVar17 = r6;
        e eVar18 = new e("Make", 271, 2);
        e eVar19 = r6;
        e eVar20 = new e("Model", 272, 2);
        e eVar21 = r6;
        e eVar22 = new e("StripOffsets", 273, 3, 4);
        e eVar23 = r6;
        e eVar24 = new e("Orientation", 274, 3);
        e eVar25 = r0;
        e eVar26 = new e("SamplesPerPixel", 277, 3);
        e eVar27 = r0;
        e eVar28 = new e("RowsPerStrip", 278, 3, 4);
        e eVar29 = r0;
        e eVar30 = new e("StripByteCounts", 279, 3, 4);
        e eVar31 = r0;
        e eVar32 = new e("XResolution", 282, 5);
        e eVar33 = r0;
        e eVar34 = new e("YResolution", 283, 5);
        e eVar35 = r0;
        e eVar36 = new e("PlanarConfiguration", 284, 3);
        e eVar37 = r0;
        e eVar38 = new e("ResolutionUnit", 296, 3);
        e eVar39 = r0;
        e eVar40 = new e("TransferFunction", 301, 3);
        e eVar41 = r0;
        e eVar42 = new e("Software", 305, 2);
        e eVar43 = r0;
        e eVar44 = new e("DateTime", 306, 2);
        e eVar45 = r0;
        e eVar46 = new e("Artist", 315, 2);
        e eVar47 = r0;
        e eVar48 = new e("WhitePoint", 318, 5);
        e eVar49 = r0;
        e eVar50 = new e("PrimaryChromaticities", 319, 5);
        e eVar51 = r0;
        e eVar52 = new e("SubIFDPointer", 330, 4);
        e eVar53 = r0;
        e eVar54 = new e("JPEGInterchangeFormat", 513, 4);
        e eVar55 = r0;
        e eVar56 = new e("JPEGInterchangeFormatLength", 514, 4);
        e eVar57 = r0;
        e eVar58 = new e("YCbCrCoefficients", 529, 5);
        e eVar59 = r0;
        e eVar60 = new e("YCbCrSubSampling", 530, 3);
        e eVar61 = r0;
        e eVar62 = new e("YCbCrPositioning", 531, 3);
        e eVar63 = r0;
        e eVar64 = new e("ReferenceBlackWhite", 532, 5);
        e eVar65 = r0;
        e eVar66 = new e("Copyright", 33432, 2);
        e eVar67 = r0;
        e eVar68 = new e("ExifIFDPointer", 34665, 4);
        e eVar69 = r0;
        e eVar70 = new e("GPSInfoIFDPointer", 34853, 4);
        e eVar71 = r0;
        e eVar72 = new e("SensorTopBorder", 4, 4);
        e eVar73 = r0;
        e eVar74 = new e("SensorLeftBorder", 5, 4);
        e eVar75 = r0;
        e eVar76 = new e("SensorBottomBorder", 6, 4);
        e eVar77 = r0;
        e eVar78 = new e("SensorRightBorder", 7, 4);
        e eVar79 = r0;
        e eVar80 = new e("ISO", 23, 3);
        e eVar81 = r0;
        e eVar82 = new e("JpgFromRaw", 46, 7);
        e eVar83 = r0;
        e eVar84 = new e("Xmp", 700, 1);
        e[] eVarArr = {eVar, eVar3, eVar5, eVar7, eVar9, eVar11, eVar13, eVar15, eVar17, eVar19, eVar21, eVar23, eVar25, eVar27, eVar29, eVar31, eVar33, eVar35, eVar37, eVar39, eVar41, eVar43, eVar45, eVar47, eVar49, eVar51, eVar53, eVar55, eVar57, eVar59, eVar61, eVar63, eVar65, eVar67, eVar69, eVar71, eVar73, eVar75, eVar77, eVar79, eVar81, eVar83};
        f5612a0 = eVarArr;
        e eVar85 = r0;
        e eVar86 = new e("ExposureTime", 33434, 5);
        e eVar87 = r0;
        e eVar88 = new e("FNumber", 33437, 5);
        e eVar89 = r0;
        e eVar90 = new e("ExposureProgram", 34850, 3);
        e eVar91 = r0;
        e eVar92 = new e("SpectralSensitivity", 34852, 2);
        e eVar93 = r0;
        e eVar94 = new e("PhotographicSensitivity", 34855, 3);
        e eVar95 = r0;
        e eVar96 = new e("OECF", 34856, 7);
        e eVar97 = r0;
        e eVar98 = new e("SensitivityType", 34864, 3);
        e eVar99 = r0;
        e eVar100 = new e("StandardOutputSensitivity", 34865, 4);
        e eVar101 = r0;
        e eVar102 = new e("RecommendedExposureIndex", 34866, 4);
        e eVar103 = r0;
        e eVar104 = new e("ISOSpeed", 34867, 4);
        e eVar105 = r0;
        e eVar106 = new e("ISOSpeedLatitudeyyy", 34868, 4);
        e eVar107 = r0;
        e eVar108 = new e("ISOSpeedLatitudezzz", 34869, 4);
        e eVar109 = r0;
        e eVar110 = new e("ExifVersion", 36864, 2);
        e eVar111 = r0;
        e eVar112 = new e("DateTimeOriginal", 36867, 2);
        e eVar113 = r0;
        e eVar114 = new e("DateTimeDigitized", 36868, 2);
        e eVar115 = r0;
        e eVar116 = new e("OffsetTime", 36880, 2);
        e eVar117 = r0;
        e eVar118 = new e("OffsetTimeOriginal", 36881, 2);
        e eVar119 = r0;
        e eVar120 = new e("OffsetTimeDigitized", 36882, 2);
        e eVar121 = r0;
        e eVar122 = new e("ComponentsConfiguration", 37121, 7);
        e eVar123 = r0;
        e eVar124 = new e("CompressedBitsPerPixel", 37122, 5);
        e eVar125 = r0;
        e eVar126 = new e("ShutterSpeedValue", 37377, 10);
        e eVar127 = r0;
        e eVar128 = new e("ApertureValue", 37378, 5);
        e eVar129 = r0;
        e eVar130 = new e("BrightnessValue", 37379, 10);
        e eVar131 = r0;
        e eVar132 = new e("ExposureBiasValue", 37380, 10);
        e eVar133 = r0;
        e eVar134 = new e("MaxApertureValue", 37381, 5);
        e eVar135 = r0;
        e eVar136 = new e("SubjectDistance", 37382, 5);
        e eVar137 = r0;
        e eVar138 = new e("MeteringMode", 37383, 3);
        e eVar139 = r0;
        e eVar140 = new e("LightSource", 37384, 3);
        e eVar141 = r0;
        e eVar142 = new e("Flash", 37385, 3);
        e eVar143 = r0;
        e eVar144 = new e("FocalLength", 37386, 5);
        e eVar145 = r0;
        e eVar146 = new e("SubjectArea", 37396, 3);
        e eVar147 = r0;
        e eVar148 = new e("MakerNote", 37500, 7);
        e eVar149 = r0;
        e eVar150 = new e("UserComment", 37510, 7);
        e eVar151 = r0;
        e eVar152 = new e("SubSecTime", 37520, 2);
        e eVar153 = r0;
        e eVar154 = new e("SubSecTimeOriginal", 37521, 2);
        e eVar155 = r0;
        e eVar156 = new e("SubSecTimeDigitized", 37522, 2);
        e eVar157 = r0;
        e eVar158 = new e("FlashpixVersion", 40960, 7);
        e eVar159 = r0;
        e eVar160 = new e("ColorSpace", 40961, 3);
        e eVar161 = r0;
        e eVar162 = new e("PixelXDimension", 40962, 3, 4);
        e eVar163 = r0;
        e eVar164 = new e("PixelYDimension", 40963, 3, 4);
        e eVar165 = r0;
        e eVar166 = new e("RelatedSoundFile", 40964, 2);
        e eVar167 = r0;
        e eVar168 = new e("InteroperabilityIFDPointer", 40965, 4);
        e eVar169 = r0;
        e eVar170 = new e("FlashEnergy", 41483, 5);
        e eVar171 = r0;
        e eVar172 = new e("SpatialFrequencyResponse", 41484, 7);
        e eVar173 = r0;
        e eVar174 = new e("FocalPlaneXResolution", 41486, 5);
        e eVar175 = r0;
        e eVar176 = new e("FocalPlaneYResolution", 41487, 5);
        e eVar177 = r0;
        e eVar178 = new e("FocalPlaneResolutionUnit", 41488, 3);
        e eVar179 = r0;
        e eVar180 = new e("SubjectLocation", 41492, 3);
        e eVar181 = r0;
        e eVar182 = new e("ExposureIndex", 41493, 5);
        e eVar183 = r0;
        e eVar184 = new e("SensingMethod", 41495, 3);
        e eVar185 = r0;
        e eVar186 = new e("FileSource", 41728, 7);
        e eVar187 = r0;
        e eVar188 = new e("SceneType", 41729, 7);
        e eVar189 = r0;
        e eVar190 = new e("CFAPattern", 41730, 7);
        e eVar191 = r0;
        e eVar192 = new e("CustomRendered", 41985, 3);
        e eVar193 = r0;
        e eVar194 = new e("ExposureMode", 41986, 3);
        e eVar195 = r0;
        e eVar196 = new e("WhiteBalance", 41987, 3);
        e eVar197 = r0;
        e eVar198 = new e("DigitalZoomRatio", 41988, 5);
        e eVar199 = r0;
        e eVar200 = new e("FocalLengthIn35mmFilm", 41989, 3);
        e eVar201 = r0;
        e eVar202 = new e("SceneCaptureType", 41990, 3);
        e eVar203 = r0;
        e eVar204 = new e("GainControl", 41991, 3);
        e eVar205 = r0;
        e eVar206 = new e("Contrast", 41992, 3);
        e eVar207 = r0;
        e eVar208 = new e("Saturation", 41993, 3);
        e eVar209 = r0;
        e eVar210 = new e("Sharpness", 41994, 3);
        e eVar211 = r0;
        e eVar212 = new e("DeviceSettingDescription", 41995, 7);
        e eVar213 = r0;
        e eVar214 = new e("SubjectDistanceRange", 41996, 3);
        e eVar215 = r0;
        e eVar216 = new e("ImageUniqueID", 42016, 2);
        e eVar217 = r0;
        e eVar218 = new e("CameraOwnerName", 42032, 2);
        e eVar219 = r0;
        e eVar220 = new e("BodySerialNumber", 42033, 2);
        e eVar221 = r0;
        e eVar222 = new e("LensSpecification", 42034, 5);
        e eVar223 = r0;
        e eVar224 = new e("LensMake", 42035, 2);
        e eVar225 = r0;
        e eVar226 = new e("LensModel", 42036, 2);
        e eVar227 = r0;
        e eVar228 = new e("Gamma", 42240, 5);
        e eVar229 = r0;
        e eVar230 = new e("DNGVersion", 50706, 1);
        e eVar231 = r0;
        e eVar232 = new e("DefaultCropSize", 50720, 3, 4);
        e[] eVarArr2 = {eVar85, eVar87, eVar89, eVar91, eVar93, eVar95, eVar97, eVar99, eVar101, eVar103, eVar105, eVar107, eVar109, eVar111, eVar113, eVar115, eVar117, eVar119, eVar121, eVar123, eVar125, eVar127, eVar129, eVar131, eVar133, eVar135, eVar137, eVar139, eVar141, eVar143, eVar145, eVar147, eVar149, eVar151, eVar153, eVar155, eVar157, eVar159, eVar161, eVar163, eVar165, eVar167, eVar169, eVar171, eVar173, eVar175, eVar177, eVar179, eVar181, eVar183, eVar185, eVar187, eVar189, eVar191, eVar193, eVar195, eVar197, eVar199, eVar201, eVar203, eVar205, eVar207, eVar209, eVar211, eVar213, eVar215, eVar217, eVar219, eVar221, eVar223, eVar225, eVar227, eVar229, eVar231};
        f5613b0 = eVarArr2;
        e eVar233 = r0;
        e eVar234 = new e("GPSVersionID", 0, 1);
        e eVar235 = r0;
        e eVar236 = new e("GPSLatitudeRef", 1, 2);
        e eVar237 = r0;
        e eVar238 = new e("GPSLatitude", 2, 5, 10);
        e eVar239 = r0;
        e eVar240 = new e("GPSLongitudeRef", 3, 2);
        e eVar241 = r0;
        e eVar242 = new e("GPSLongitude", 4, 5, 10);
        e eVar243 = r0;
        e eVar244 = new e("GPSAltitudeRef", 5, 1);
        e eVar245 = r0;
        e eVar246 = new e("GPSAltitude", 6, 5);
        e eVar247 = r0;
        e eVar248 = new e("GPSTimeStamp", 7, 5);
        e eVar249 = r0;
        e eVar250 = new e("GPSSatellites", 8, 2);
        e eVar251 = r0;
        e eVar252 = new e("GPSStatus", 9, 2);
        e eVar253 = r0;
        e eVar254 = new e("GPSMeasureMode", 10, 2);
        e eVar255 = r0;
        e eVar256 = new e("GPSDOP", 11, 5);
        e eVar257 = r0;
        e eVar258 = new e("GPSSpeedRef", 12, 2);
        e eVar259 = r0;
        e eVar260 = new e("GPSSpeed", 13, 5);
        e eVar261 = r0;
        e eVar262 = new e("GPSTrackRef", 14, 2);
        e eVar263 = r0;
        e eVar264 = new e("GPSTrack", 15, 5);
        e eVar265 = r0;
        e eVar266 = new e("GPSImgDirectionRef", 16, 2);
        e eVar267 = r0;
        e eVar268 = new e("GPSImgDirection", 17, 5);
        e eVar269 = r0;
        e eVar270 = new e("GPSMapDatum", 18, 2);
        e eVar271 = r0;
        e eVar272 = new e("GPSDestLatitudeRef", 19, 2);
        e eVar273 = r0;
        e eVar274 = new e("GPSDestLatitude", 20, 5);
        e eVar275 = r0;
        e eVar276 = new e("GPSDestLongitudeRef", 21, 2);
        e eVar277 = r0;
        e eVar278 = new e("GPSDestLongitude", 22, 5);
        e eVar279 = r0;
        e eVar280 = new e("GPSDestBearingRef", 23, 2);
        e eVar281 = r0;
        e eVar282 = new e("GPSDestBearing", 24, 5);
        e eVar283 = r0;
        e eVar284 = new e("GPSDestDistanceRef", 25, 2);
        e eVar285 = r0;
        e eVar286 = new e("GPSDestDistance", 26, 5);
        e eVar287 = r0;
        e eVar288 = new e("GPSProcessingMethod", 27, 7);
        e eVar289 = r0;
        e eVar290 = new e("GPSAreaInformation", 28, 7);
        e eVar291 = r0;
        e eVar292 = new e("GPSDateStamp", 29, 2);
        e eVar293 = r0;
        e eVar294 = new e("GPSDifferential", 30, 3);
        e eVar295 = r0;
        e eVar296 = new e("GPSHPositioningError", 31, 5);
        e[] eVarArr3 = {eVar233, eVar235, eVar237, eVar239, eVar241, eVar243, eVar245, eVar247, eVar249, eVar251, eVar253, eVar255, eVar257, eVar259, eVar261, eVar263, eVar265, eVar267, eVar269, eVar271, eVar273, eVar275, eVar277, eVar279, eVar281, eVar283, eVar285, eVar287, eVar289, eVar291, eVar293, eVar295};
        f5614c0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f5615d0 = eVarArr4;
        e eVar297 = r0;
        e eVar298 = new e("NewSubfileType", 254, 4);
        e eVar299 = r0;
        e eVar300 = new e("SubfileType", 255, 4);
        e eVar301 = r0;
        e eVar302 = new e("ThumbnailImageWidth", 256, 3, 4);
        e eVar303 = r0;
        e eVar304 = new e("ThumbnailImageLength", 257, 3, 4);
        e eVar305 = r0;
        e eVar306 = new e("BitsPerSample", 258, 3);
        e eVar307 = r0;
        e eVar308 = new e("Compression", 259, 3);
        e eVar309 = r0;
        e eVar310 = new e("PhotometricInterpretation", 262, 3);
        e eVar311 = r0;
        e eVar312 = new e("ImageDescription", 270, 2);
        e eVar313 = r0;
        e eVar314 = new e("Make", 271, 2);
        e eVar315 = r0;
        e eVar316 = new e("Model", 272, 2);
        e eVar317 = r0;
        e eVar318 = new e("StripOffsets", 273, 3, 4);
        e eVar319 = r0;
        e eVar320 = new e("ThumbnailOrientation", 274, 3);
        e eVar321 = r0;
        e eVar322 = new e("SamplesPerPixel", 277, 3);
        e eVar323 = r0;
        e eVar324 = new e("RowsPerStrip", 278, 3, 4);
        e eVar325 = r0;
        e eVar326 = new e("StripByteCounts", 279, 3, 4);
        e eVar327 = r0;
        e eVar328 = new e("XResolution", 282, 5);
        e eVar329 = r0;
        e eVar330 = new e("YResolution", 283, 5);
        e eVar331 = r0;
        e eVar332 = new e("PlanarConfiguration", 284, 3);
        e eVar333 = r0;
        e eVar334 = new e("ResolutionUnit", 296, 3);
        e eVar335 = r0;
        e eVar336 = new e("TransferFunction", 301, 3);
        e eVar337 = r0;
        e eVar338 = new e("Software", 305, 2);
        e eVar339 = r0;
        e eVar340 = new e("DateTime", 306, 2);
        e eVar341 = r0;
        e eVar342 = new e("Artist", 315, 2);
        e eVar343 = r0;
        e eVar344 = new e("WhitePoint", 318, 5);
        e eVar345 = r0;
        e eVar346 = new e("PrimaryChromaticities", 319, 5);
        e eVar347 = r0;
        e eVar348 = new e("SubIFDPointer", 330, 4);
        e eVar349 = r0;
        e eVar350 = new e("JPEGInterchangeFormat", 513, 4);
        e eVar351 = r0;
        e eVar352 = new e("JPEGInterchangeFormatLength", 514, 4);
        e eVar353 = r0;
        e eVar354 = new e("YCbCrCoefficients", 529, 5);
        e eVar355 = r0;
        e eVar356 = new e("YCbCrSubSampling", 530, 3);
        e eVar357 = r0;
        e eVar358 = new e("YCbCrPositioning", 531, 3);
        e eVar359 = r0;
        e eVar360 = new e("ReferenceBlackWhite", 532, 5);
        e eVar361 = r0;
        e eVar362 = new e("Copyright", 33432, 2);
        e eVar363 = r0;
        e eVar364 = new e("ExifIFDPointer", 34665, 4);
        e eVar365 = r0;
        e eVar366 = new e("GPSInfoIFDPointer", 34853, 4);
        e eVar367 = r0;
        e eVar368 = new e("DNGVersion", 50706, 1);
        e eVar369 = r0;
        e eVar370 = new e("DefaultCropSize", 50720, 3, 4);
        e[] eVarArr5 = {eVar297, eVar299, eVar301, eVar303, eVar305, eVar307, eVar309, eVar311, eVar313, eVar315, eVar317, eVar319, eVar321, eVar323, eVar325, eVar327, eVar329, eVar331, eVar333, eVar335, eVar337, eVar339, eVar341, eVar343, eVar345, eVar347, eVar349, eVar351, eVar353, eVar355, eVar357, eVar359, eVar361, eVar363, eVar365, eVar367, eVar369};
        f5616e0 = eVarArr5;
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f5618g0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f5619h0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f5620i0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f5621j0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f5622k0 = eVarArr10;
        f5624m0 = new HashMap[eVarArr10.length];
        f5625n0 = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f5628q0 = forName;
        f5629r0 = "Exif\u0000\u0000".getBytes(forName);
        f5630s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f5607V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f5608W = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f5622k0;
            if (i10 < eVarArr11.length) {
                f5624m0[i10] = new HashMap();
                f5625n0[i10] = new HashMap();
                for (e eVar371 : eVarArr11[i10]) {
                    f5624m0[i10].put(Integer.valueOf(eVar371.f5675a), eVar371);
                    f5625n0[i10].put(eVar371.f5676b, eVar371);
                }
                i10++;
            } else {
                HashMap hashMap = f5627p0;
                e[] eVarArr12 = f5623l0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f5675a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f5675a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f5675a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f5675a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f5675a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f5675a), 8);
                return;
            }
        }
    }

    public a(File file) {
        e[][] eVarArr = f5622k0;
        this.f5644f = new HashMap[eVarArr.length];
        this.f5645g = new HashSet(eVarArr.length);
        this.f5646h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            B(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    private void A(b bVar, HashMap hashMap) {
        byte[] bArr;
        b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        d dVar = (d) hashMap2.get("StripOffsets");
        d dVar2 = (d) hashMap2.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] c10 = b.c(dVar.o(this.f5646h));
            long[] c11 = b.c(dVar2.o(this.f5646h));
            if (c10 == null || c10.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (c11 == null || c11.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (c10.length != c11.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j10 = 0;
                for (long j11 : c11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr2 = new byte[i10];
                this.f5649k = true;
                this.f5648j = true;
                this.f5647i = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < c10.length) {
                    int i14 = (int) c10[i11];
                    int i15 = (int) c11[i11];
                    if (i11 < c10.length - 1) {
                        bArr = bArr2;
                        if (((long) (i14 + i15)) != c10[i11 + 1]) {
                            this.f5649k = false;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    int i16 = i14 - i12;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar2.q(i16);
                        int i17 = i12 + i16;
                        byte[] bArr3 = new byte[i15];
                        try {
                            bVar2.readFully(bArr3);
                            i12 = i17 + i15;
                            byte[] bArr4 = bArr;
                            System.arraycopy(bArr3, 0, bArr4, i13, i15);
                            i13 += i15;
                            i11++;
                            bArr2 = bArr4;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                }
                this.f5652n = bArr2;
                if (this.f5649k) {
                    this.f5650l = (int) c10[0];
                    this.f5651m = i10;
                }
            }
        }
    }

    private void B(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f5641c = null;
            this.f5639a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (J(fileInputStream2.getFD())) {
                        this.f5640b = fileInputStream2.getFD();
                    } else {
                        this.f5640b = null;
                    }
                    O(fileInputStream2);
                    b.b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    b.b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b.b(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ae A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int D(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            R1.a$b r2 = new R1.a$b     // Catch:{ Exception -> 0x00a9 }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x00a9 }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            byte[] r6 = f5589D     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x003c
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x003d
            r2.close()
            return r0
        L_0x0034:
            r15 = move-exception
            r1 = r2
            goto L_0x00bb
        L_0x0038:
            r15 = move-exception
            r1 = r2
            goto L_0x00aa
        L_0x003c:
            r10 = r8
        L_0x003d:
            int r7 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            int r15 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r15
        L_0x0045:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x004e
            r2.close()
            return r0
        L_0x004e:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r7 = 0
            r1 = r0
            r9 = r1
            r10 = r9
        L_0x0055:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a3
            r2.readFully(r15)     // Catch:{ EOFException -> 0x009f }
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0065
            goto L_0x009d
        L_0x0065:
            byte[] r11 = f5590E     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r12 = 1
            if (r11 == 0) goto L_0x0070
            r1 = r12
            goto L_0x008b
        L_0x0070:
            byte[] r11 = f5591F     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r11 == 0) goto L_0x007a
            r9 = r12
            goto L_0x008b
        L_0x007a:
            byte[] r11 = f5592G     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r11 != 0) goto L_0x008a
            byte[] r11 = f5593H     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r11 == 0) goto L_0x008b
        L_0x008a:
            r10 = r12
        L_0x008b:
            if (r1 == 0) goto L_0x009d
            if (r9 == 0) goto L_0x0095
            r2.close()
            r15 = 12
            return r15
        L_0x0095:
            if (r10 == 0) goto L_0x009d
            r2.close()
            r15 = 15
            return r15
        L_0x009d:
            long r7 = r7 + r5
            goto L_0x0055
        L_0x009f:
            r2.close()
            return r0
        L_0x00a3:
            r2.close()
            goto L_0x00ba
        L_0x00a7:
            r15 = move-exception
            goto L_0x00bb
        L_0x00a9:
            r15 = move-exception
        L_0x00aa:
            boolean r2 = f5634w     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x00b5
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x00a7 }
        L_0x00b5:
            if (r1 == 0) goto L_0x00ba
            r1.close()
        L_0x00ba:
            return r0
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            r1.close()
        L_0x00c0:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.D(byte[]):int");
    }

    private static boolean E(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f5588C;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean F(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            R1.a$b r2 = new R1.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.R(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f5646h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.o(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.F(byte[]):boolean");
    }

    private boolean G(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f5596K;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean H(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean I(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            R1.a$b r2 = new R1.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.R(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f5646h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.o(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.I(byte[]):boolean");
    }

    private static boolean J(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f5634w) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean K(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f5646h);
            int[] iArr2 = f5638z;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f5642d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f5646h)) == 1 && Arrays.equals(iArr, f5587B)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f5634w) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean L(int i10) {
        if (i10 == 4 || i10 == 13 || i10 == 14) {
            return true;
        }
        return false;
    }

    private boolean M(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        int m10 = dVar.m(this.f5646h);
        int m11 = dVar2.m(this.f5646h);
        if (m10 > 512 || m11 > 512) {
            return false;
        }
        return true;
    }

    private boolean N(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f5598M;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f5599N;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f5598M.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void O(java.io.InputStream r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            R1.a$e[][] r2 = f5622k0     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            if (r1 >= r2) goto L_0x001c
            java.util.HashMap[] r2 = r4.f5644f     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r3.<init>()     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            r5 = move-exception
            goto L_0x00bd
        L_0x0016:
            r5 = move-exception
            goto L_0x00ab
        L_0x0019:
            r5 = move-exception
            goto L_0x00ab
        L_0x001c:
            boolean r1 = r4.f5643e     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            if (r1 != 0) goto L_0x002e
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            int r5 = r4.m(r1)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r4.f5642d = r5     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r5 = r1
        L_0x002e:
            int r1 = r4.f5642d     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            boolean r1 = d0(r1)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            if (r1 == 0) goto L_0x007b
            R1.a$g r0 = new R1.a$g     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r0.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            boolean r5 = r4.f5643e     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            if (r5 == 0) goto L_0x0050
            boolean r5 = r4.t(r0)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            if (r5 != 0) goto L_0x0071
            r4.e()
            boolean r5 = f5634w
            if (r5 == 0) goto L_0x004f
            r4.Q()
        L_0x004f:
            return
        L_0x0050:
            int r5 = r4.f5642d     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r1 = 12
            if (r5 == r1) goto L_0x006e
            r1 = 15
            if (r5 != r1) goto L_0x005b
            goto L_0x006e
        L_0x005b:
            r1 = 7
            if (r5 != r1) goto L_0x0062
            r4.n(r0)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x0071
        L_0x0062:
            r1 = 10
            if (r5 != r1) goto L_0x006a
            r4.s(r0)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x0071
        L_0x006a:
            r4.q(r0)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x0071
        L_0x006e:
            r4.k(r0, r5)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
        L_0x0071:
            int r5 = r4.f5654p     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            long r1 = (long) r5     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r0.t(r1)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r4.c0(r0)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x00a0
        L_0x007b:
            R1.a$b r1 = new R1.a$b     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            int r5 = r4.f5642d     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            r2 = 4
            if (r5 != r2) goto L_0x0089
            r4.l(r1, r0, r0)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x00a0
        L_0x0089:
            r0 = 13
            if (r5 != r0) goto L_0x0091
            r4.o(r1)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x00a0
        L_0x0091:
            r0 = 9
            if (r5 != r0) goto L_0x0099
            r4.p(r1)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
            goto L_0x00a0
        L_0x0099:
            r0 = 14
            if (r5 != r0) goto L_0x00a0
            r4.w(r1)     // Catch:{ IOException -> 0x0019, UnsupportedOperationException -> 0x0016 }
        L_0x00a0:
            r4.e()
            boolean r5 = f5634w
            if (r5 == 0) goto L_0x00bc
        L_0x00a7:
            r4.Q()
            goto L_0x00bc
        L_0x00ab:
            boolean r0 = f5634w     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch:{ all -> 0x0013 }
        L_0x00b6:
            r4.e()
            if (r0 == 0) goto L_0x00bc
            goto L_0x00a7
        L_0x00bc:
            return
        L_0x00bd:
            r4.e()
            boolean r0 = f5634w
            if (r0 == 0) goto L_0x00c7
            r4.Q()
        L_0x00c7:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.O(java.io.InputStream):void");
    }

    private void P(b bVar) {
        ByteOrder R10 = R(bVar);
        this.f5646h = R10;
        bVar.o(R10);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f5642d;
        if (i10 == 7 || i10 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i11 = readInt - 8;
                if (i11 > 0) {
                    bVar.q(i11);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void Q() {
        for (int i10 = 0; i10 < this.f5644f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f5644f[i10].size());
            for (Map.Entry entry : this.f5644f[i10].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f5646h) + "'");
            }
        }
    }

    private ByteOrder R(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f5634w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f5634w) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void S(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        P(gVar);
        T(gVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0280  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void T(R1.a.g r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.util.Set r3 = r0.f5645g
            int r4 = r26.b()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r26.readShort()
            boolean r4 = f5634w
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0031
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0031:
            if (r3 > 0) goto L_0x0034
            return
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r6 >= r3) goto L_0x0341
            int r10 = r26.readUnsignedShort()
            int r11 = r26.readUnsignedShort()
            int r14 = r26.readInt()
            int r12 = r26.b()
            long r12 = (long) r12
            r15 = 4
            long r12 = r12 + r15
            java.util.HashMap[] r17 = f5624m0
            r4 = r17[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r9)
            R1.a$e r4 = (R1.a.e) r4
            boolean r9 = f5634w
            if (r9 == 0) goto L_0x0086
            java.lang.Integer r15 = java.lang.Integer.valueOf(r27)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            if (r4 == 0) goto L_0x006c
            java.lang.String r8 = r4.f5676b
        L_0x0069:
            r20 = r3
            goto L_0x006e
        L_0x006c:
            r8 = 0
            goto L_0x0069
        L_0x006e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r21 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[]{r15, r7, r8, r3, r6}
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r5, r3)
            goto L_0x008a
        L_0x0086:
            r20 = r3
            r21 = r6
        L_0x008a:
            r3 = 7
            if (r4 != 0) goto L_0x00a7
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a3:
            r22 = r4
            goto L_0x0125
        L_0x00a7:
            if (r11 <= 0) goto L_0x00ae
            int[] r6 = f5610Y
            int r7 = r6.length
            if (r11 < r7) goto L_0x00b1
        L_0x00ae:
            r22 = r4
            goto L_0x010f
        L_0x00b1:
            boolean r7 = r4.a(r11)
            if (r7 != 0) goto L_0x00dc
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f5609X
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f5676b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto L_0x00a3
        L_0x00dc:
            if (r11 != r3) goto L_0x00e0
            int r11 = r4.f5677c
        L_0x00e0:
            long r7 = (long) r14
            r6 = r6[r11]
            r22 = r4
            long r3 = (long) r6
            long r3 = r3 * r7
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00f7
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = 1
            goto L_0x0128
        L_0x00f7:
            if (r9 == 0) goto L_0x010d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x010d:
            r6 = 0
            goto L_0x0128
        L_0x010f:
            if (r9 == 0) goto L_0x0125
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0125:
            r3 = 0
            goto L_0x010d
        L_0x0128:
            if (r6 != 0) goto L_0x012f
            r1.t(r12)
            goto L_0x0338
        L_0x012f:
            r6 = 4
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x01bb
            int r6 = r26.readInt()
            if (r9 == 0) goto L_0x0151
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "seek to data offset: "
            r8.append(r15)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
        L_0x0151:
            int r8 = r0.f5642d
            r15 = 7
            if (r8 != r15) goto L_0x01b0
            r8 = r22
            java.lang.String r15 = r8.f5676b
            r18 = r12
            java.lang.String r12 = "MakerNote"
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0169
            r0.f5655q = r6
        L_0x0166:
            r16 = r14
            goto L_0x01b6
        L_0x0169:
            r12 = 6
            if (r2 != r12) goto L_0x0166
            java.lang.String r13 = "ThumbnailImage"
            java.lang.String r15 = r8.f5676b
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0166
            r0.f5656r = r6
            r0.f5657s = r14
            java.nio.ByteOrder r13 = r0.f5646h
            R1.a$d r12 = R1.a.d.j(r12, r13)
            int r13 = r0.f5656r
            r15 = r14
            long r13 = (long) r13
            java.nio.ByteOrder r2 = r0.f5646h
            R1.a$d r2 = R1.a.d.f(r13, r2)
            int r13 = r0.f5657s
            long r13 = (long) r13
            r16 = r15
            java.nio.ByteOrder r15 = r0.f5646h
            R1.a$d r13 = R1.a.d.f(r13, r15)
            java.util.HashMap[] r14 = r0.f5644f
            r15 = 4
            r14 = r14[r15]
            r14.put(r7, r12)
            java.util.HashMap[] r12 = r0.f5644f
            r12 = r12[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r12.put(r14, r2)
            java.util.HashMap[] r2 = r0.f5644f
            r2 = r2[r15]
            java.lang.String r12 = "JPEGInterchangeFormatLength"
            r2.put(r12, r13)
            goto L_0x01b6
        L_0x01b0:
            r18 = r12
            r16 = r14
            r8 = r22
        L_0x01b6:
            long r12 = (long) r6
            r1.t(r12)
            goto L_0x01c1
        L_0x01bb:
            r18 = r12
            r16 = r14
            r8 = r22
        L_0x01c1:
            java.util.HashMap r2 = f5627p0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r9 == 0) goto L_0x01eb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "nextIfdType: "
            r6.append(r10)
            r6.append(r2)
            java.lang.String r10 = " byteCount: "
            r6.append(r10)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x01eb:
            r6 = 8
            r10 = 3
            if (r2 == 0) goto L_0x02bd
            if (r11 == r10) goto L_0x0212
            r3 = 4
            if (r11 == r3) goto L_0x020d
            if (r11 == r6) goto L_0x0208
            r3 = 9
            if (r11 == r3) goto L_0x0202
            r3 = 13
            if (r11 == r3) goto L_0x0202
            r3 = -1
            goto L_0x0217
        L_0x0202:
            int r3 = r26.readInt()
        L_0x0206:
            long r3 = (long) r3
            goto L_0x0217
        L_0x0208:
            short r3 = r26.readShort()
            goto L_0x0206
        L_0x020d:
            long r3 = r26.n()
            goto L_0x0217
        L_0x0212:
            int r3 = r26.readUnsignedShort()
            goto L_0x0206
        L_0x0217:
            if (r9 == 0) goto L_0x022c
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.String r7 = r8.f5676b
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x022c:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = ")"
            r8 = -1
            if (r6 <= 0) goto L_0x0280
            int r6 = r26.a()
            if (r6 == r8) goto L_0x0244
            int r6 = r26.a()
            long r10 = (long) r6
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0280
        L_0x0244:
            java.util.Set r6 = r0.f5645g
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x025e
            r1.t(r3)
            int r2 = r2.intValue()
            r0.T(r1, r2)
        L_0x025b:
            r12 = r18
            goto L_0x02b8
        L_0x025e:
            if (r9 == 0) goto L_0x025b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x025b
        L_0x0280:
            if (r9 == 0) goto L_0x025b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r26.a()
            if (r3 == r8) goto L_0x02b4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " (total length: "
            r3.append(r2)
            int r2 = r26.a()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
        L_0x02b4:
            android.util.Log.d(r5, r2)
            goto L_0x025b
        L_0x02b8:
            r1.t(r12)
            goto L_0x0338
        L_0x02bd:
            r12 = r18
            int r2 = r26.b()
            int r9 = r0.f5654p
            int r2 = r2 + r9
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            R1.a$d r4 = new R1.a$d
            long r14 = (long) r2
            r23 = r12
            r12 = r4
            r13 = r11
            r18 = r14
            r14 = r16
            r15 = r18
            r17 = r3
            r12.<init>(r13, r14, r15, r17)
            java.util.HashMap[] r2 = r0.f5644f
            r2 = r2[r27]
            java.lang.String r3 = r8.f5676b
            r2.put(r3, r4)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r3 = r8.f5676b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02f3
            r0.f5642d = r10
        L_0x02f3:
            java.lang.String r2 = "Make"
            java.lang.String r3 = r8.f5676b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0307
            java.lang.String r2 = "Model"
            java.lang.String r3 = r8.f5676b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0315
        L_0x0307:
            java.nio.ByteOrder r2 = r0.f5646h
            java.lang.String r2 = r4.n(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0328
        L_0x0315:
            java.lang.String r2 = r8.f5676b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x032a
            java.nio.ByteOrder r2 = r0.f5646h
            int r2 = r4.m(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x032a
        L_0x0328:
            r0.f5642d = r6
        L_0x032a:
            int r2 = r26.b()
            long r2 = (long) r2
            r12 = r23
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0338
            r1.t(r12)
        L_0x0338:
            int r6 = r21 + 1
            short r6 = (short) r6
            r2 = r27
            r3 = r20
            goto L_0x0035
        L_0x0341:
            int r2 = r26.readInt()
            boolean r3 = f5634w
            if (r3 == 0) goto L_0x035a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x035a:
            long r6 = (long) r2
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x03a5
            java.util.Set r4 = r0.f5645g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x038e
            r1.t(r6)
            java.util.HashMap[] r2 = r0.f5644f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x037f
            r0.T(r1, r3)
            goto L_0x03bb
        L_0x037f:
            java.util.HashMap[] r2 = r0.f5644f
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03bb
            r0.T(r1, r3)
            goto L_0x03bb
        L_0x038e:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            goto L_0x03bb
        L_0x03a5:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.T(R1.a$g, int):void");
    }

    private void U(String str) {
        for (int i10 = 0; i10 < f5622k0.length; i10++) {
            this.f5644f[i10].remove(str);
        }
    }

    private void V(int i10, String str, String str2) {
        if (!this.f5644f[i10].isEmpty() && this.f5644f[i10].get(str) != null) {
            HashMap hashMap = this.f5644f[i10];
            hashMap.put(str2, (d) hashMap.get(str));
            this.f5644f[i10].remove(str);
        }
    }

    private void W(g gVar, int i10) {
        d dVar = (d) this.f5644f[i10].get("ImageLength");
        d dVar2 = (d) this.f5644f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f5644f[i10].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f5644f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m10 = dVar3.m(this.f5646h);
                int m11 = dVar3.m(this.f5646h);
                gVar.t((long) m10);
                byte[] bArr = new byte[m11];
                gVar.readFully(bArr);
                l(new b(bArr), m10, i10);
            }
        }
    }

    private void Y(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr;
        if (f5634w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.b(-1);
            if (bVar.readByte() == -40) {
                cVar.b(-40);
                cVar.b(-1);
                cVar.b(-31);
                this.f5654p = i0(cVar);
                if (this.f5659u != null) {
                    cVar.write(-1);
                    cVar.b(-31);
                    byte[] bArr2 = f5630s0;
                    cVar.q(bArr2.length + 2 + this.f5659u.f5674d.length);
                    cVar.write(bArr2);
                    cVar.write(this.f5659u.f5674d);
                    this.f5660v = true;
                }
                byte[] bArr3 = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.b(-1);
                        cVar.b(readByte);
                        b.d(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.b(-1);
                        cVar.b(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.q(readUnsignedShort);
                        int i10 = readUnsignedShort - 2;
                        if (i10 >= 0) {
                            while (i10 > 0) {
                                int read = bVar.read(bArr3, 0, Math.min(i10, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr3, 0, read);
                                i10 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort();
                        int i11 = readUnsignedShort2 - 2;
                        if (i11 >= 0) {
                            byte[] bArr4 = f5630s0;
                            if (i11 >= bArr4.length) {
                                bArr = new byte[bArr4.length];
                            } else {
                                byte[] bArr5 = f5629r0;
                                if (i11 >= bArr5.length) {
                                    bArr = new byte[bArr5.length];
                                } else {
                                    bArr = null;
                                }
                            }
                            if (bArr != null) {
                                bVar.readFully(bArr);
                                if (b.f(bArr, f5629r0) || b.f(bArr, bArr4)) {
                                    bVar.q(i11 - bArr.length);
                                }
                            }
                            cVar.b(-1);
                            cVar.b(readByte);
                            cVar.q(readUnsignedShort2);
                            if (bArr != null) {
                                i11 -= bArr.length;
                                cVar.write(bArr);
                            }
                            while (i11 > 0) {
                                int read2 = bVar.read(bArr3, 0, Math.min(i11, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr3, 0, read2);
                                i11 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046 A[ADDED_TO_REGION] */
    private void Z(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = f5634w
            if (r0 == 0) goto L_0x0027
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L_0x0027:
            R1.a$b r0 = new R1.a$b
            r0.<init>((java.io.InputStream) r9)
            R1.a$c r9 = new R1.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = f5596K
            int r10 = r10.length
            R1.b.e(r0, r9, r10)
            R1.a$d r10 = r8.f5659u
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L_0x0043
            boolean r10 = r8.f5660v
            if (r10 == 0) goto L_0x0078
        L_0x0043:
            r10 = r1
        L_0x0044:
            if (r1 != 0) goto L_0x004d
            if (r10 == 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            R1.b.d(r0, r9)
            return
        L_0x004d:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L_0x007a
            r9.f(r3)
            r9.f(r4)
            int r3 = r3 + 4
            R1.b.e(r0, r9, r3)
            int r3 = r8.f5654p
            if (r3 != 0) goto L_0x006d
            r8.j0(r9)
            r1 = r2
        L_0x006d:
            R1.a$d r3 = r8.f5659u
            if (r3 == 0) goto L_0x0044
            boolean r3 = r8.f5660v
            if (r3 != 0) goto L_0x0044
            r8.k0(r9)
        L_0x0078:
            r10 = r2
            goto L_0x0044
        L_0x007a:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            r8.j0(r9)
            int r3 = r3 + 4
            r0.q(r3)
            r1 = r2
            goto L_0x0044
        L_0x008b:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto L_0x00bd
            byte[] r5 = f5597L
            int r6 = r5.length
            if (r3 < r6) goto L_0x00bd
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L_0x00b0
            R1.a$d r10 = r8.f5659u
            if (r10 == 0) goto L_0x00ac
            r8.k0(r9)
        L_0x00ac:
            r0.q(r6)
            goto L_0x0078
        L_0x00b0:
            r9.f(r3)
            r9.f(r4)
            r9.write(r7)
            R1.b.e(r0, r9, r6)
            goto L_0x0044
        L_0x00bd:
            r9.f(r3)
            r9.f(r4)
            int r3 = r3 + 4
            R1.b.e(r0, r9, r3)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.Z(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0182 A[Catch:{ Exception -> 0x0081, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cb A[Catch:{ Exception -> 0x0081, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d7 A[Catch:{ Exception -> 0x0081, all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020c A[Catch:{ Exception -> 0x0081, all -> 0x007d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a0(java.io.InputStream r22, java.io.OutputStream r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            boolean r3 = f5634w
            if (r3 == 0) goto L_0x002d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveWebpAttributes starting with (inputStream: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", outputStream: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ExifInterface"
            android.util.Log.d(r4, r3)
        L_0x002d:
            R1.a$b r3 = new R1.a$b
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r3.<init>(r0, r4)
            R1.a$c r0 = new R1.a$c
            r0.<init>(r2, r4)
            byte[] r2 = f5598M
            int r5 = r2.length
            R1.b.e(r3, r0, r5)
            int r5 = r3.readInt()
            byte[] r6 = f5599N
            int r7 = r6.length
            r3.q(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0221 }
            r8.<init>()     // Catch:{ Exception -> 0x0221 }
            R1.a$c r9 = new R1.a$c     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.<init>(r8, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r4 = r1.f5654p     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r11 = 4
            r12 = 8
            if (r4 == 0) goto L_0x0085
            int r2 = r2.length     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r2 = r2 + r11
            int r6 = r6.length     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r2 = r2 + r6
            int r4 = r4 - r2
            int r4 = r4 - r12
            R1.b.e(r3, r9, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r3.q(r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r2 = r3.readInt()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r4 = r2 % 2
            if (r4 == 0) goto L_0x0071
            int r2 = r2 + 1
        L_0x0071:
            r3.q(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r2 = r1.i0(r9)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0078:
            r18 = r0
            r0 = r12
            goto L_0x01f0
        L_0x007d:
            r0 = move-exception
            r7 = r8
            goto L_0x022a
        L_0x0081:
            r0 = move-exception
            r7 = r8
            goto L_0x0222
        L_0x0085:
            byte[] r2 = new byte[r11]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r3.readFully(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r4 = f5602Q     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r6 = java.util.Arrays.equals(r2, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r13 = 0
            r14 = 1
            if (r6 == 0) goto L_0x00e5
            int r2 = r3.readInt()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r6 = r2 % 2
            if (r6 != r14) goto L_0x009f
            int r6 = r2 + 1
            goto L_0x00a0
        L_0x009f:
            r6 = r2
        L_0x00a0:
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r3.readFully(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte r15 = r6[r13]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r15 = r15 | r12
            byte r15 = (byte) r15     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r6[r13] = r15     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r15 = r15 >> r14
            r15 = r15 & r14
            if (r15 != r14) goto L_0x00b0
            r13 = r14
        L_0x00b0:
            r9.write(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.f(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.write(r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r13 == 0) goto L_0x00d9
            byte[] r2 = f5605T     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r1.f(r3, r9, r2, r7)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x00c0:
            byte[] r2 = new byte[r11]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r3.readFully(r2)     // Catch:{ EOFException -> 0x00cd }
            byte[] r4 = f5606U     // Catch:{ EOFException -> 0x00cd }
            boolean r4 = java.util.Arrays.equals(r2, r4)     // Catch:{ EOFException -> 0x00cd }
            r4 = r4 ^ r14
            goto L_0x00ce
        L_0x00cd:
            r4 = r14
        L_0x00ce:
            if (r4 == 0) goto L_0x00d5
            int r2 = r1.i0(r9)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x0078
        L_0x00d5:
            r1.g(r3, r9, r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x00c0
        L_0x00d9:
            byte[] r2 = f5604S     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r4 = f5603R     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r1.f(r3, r9, r2, r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r2 = r1.i0(r9)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x0078
        L_0x00e5:
            byte[] r6 = f5604S     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r7 = java.util.Arrays.equals(r2, r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r7 != 0) goto L_0x00fc
            byte[] r7 = f5603R     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r7 = java.util.Arrays.equals(r2, r7)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r7 == 0) goto L_0x00f6
            goto L_0x00fc
        L_0x00f6:
            r18 = r0
            r0 = r12
            r2 = -1
            goto L_0x01f0
        L_0x00fc:
            int r7 = r3.readInt()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r15 = r7 % 2
            if (r15 != r14) goto L_0x0107
            int r15 = r7 + 1
            goto L_0x0108
        L_0x0107:
            r15 = r7
        L_0x0108:
            r11 = 3
            byte[] r10 = new byte[r11]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r16 = java.util.Arrays.equals(r2, r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = 47
            if (r16 == 0) goto L_0x013a
            r3.readFully(r10)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r11 = new byte[r11]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r3.readFully(r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r14 = f5601P     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r11 = java.util.Arrays.equals(r14, r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r11 == 0) goto L_0x0132
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r14 = r11 & 16383(0x3fff, float:2.2957E-41)
            int r13 = r11 >> 16
            r13 = r13 & 16383(0x3fff, float:2.2957E-41)
            int r15 = r15 + -10
        L_0x012f:
            r18 = 0
            goto L_0x0176
        L_0x0132:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r2 = "Error checking VP8 signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            throw r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x013a:
            byte[] r11 = f5603R     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r11 = java.util.Arrays.equals(r2, r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r11 == 0) goto L_0x0172
            byte r11 = r3.readByte()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r11 != r12) goto L_0x016a
            int r11 = r3.readInt()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r13 = r11 & 16383(0x3fff, float:2.2957E-41)
            int r13 = r13 + r14
            r18 = 268419072(0xfffc000, float:2.5218897E-29)
            r18 = r11 & r18
            int r18 = r18 >>> 14
            int r18 = r18 + 1
            r19 = 268435456(0x10000000, float:2.5243549E-29)
            r19 = r11 & r19
            if (r19 == 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r14 = 0
        L_0x0160:
            int r15 = r15 + -5
            r20 = r14
            r14 = r13
            r13 = r18
            r18 = r20
            goto L_0x0176
        L_0x016a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            java.lang.String r2 = "Error checking VP8L signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            throw r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0172:
            r11 = 0
            r13 = 0
            r14 = 0
            goto L_0x012f
        L_0x0176:
            r9.write(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r4 = 10
            r9.f(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r18 == 0) goto L_0x018b
            r16 = 0
            byte r18 = r4[r16]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = r18 | 16
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r4[r16] = r12     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x018b:
            r12 = 0
            byte r16 = r4[r12]     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r18 = r0
            r17 = 8
            r0 = r16 | 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r4[r12] = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0 = -1
            int r14 = r14 + r0
            int r13 = r13 + r0
            byte r0 = (byte) r14     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = 4
            r4[r12] = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r14 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = 5
            r4[r12] = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r14 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = 6
            r4[r12] = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0 = 7
            byte r12 = (byte) r13     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r4[r0] = r12     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r13 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = 8
            r4[r12] = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r13 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r12 = 9
            r4[r12] = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.write(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.write(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.f(r7)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r0 = java.util.Arrays.equals(r2, r6)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r0 == 0) goto L_0x01d7
            r9.write(r10)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r0 = f5601P     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.write(r0)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.f(r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            goto L_0x01e7
        L_0x01d7:
            byte[] r0 = f5603R     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            if (r0 == 0) goto L_0x01e7
            r0 = 47
            r9.write(r0)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r9.f(r11)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x01e7:
            R1.b.e(r3, r9, r15)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r2 = r1.i0(r9)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0 = 8
        L_0x01f0:
            int r5 = r5 + r0
            int r0 = r3.b()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r5 = r5 - r0
            R1.b.e(r3, r9, r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r8.size()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            byte[] r4 = f5599N     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r5 = r4.length     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r0 + r5
            r5 = r18
            r5.f(r0)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r5.write(r4)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            r0 = -1
            if (r2 == r0) goto L_0x0215
            java.io.DataOutputStream r0 = r5.f5669a     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            int r0 = r0 + r2
            r1.f5654p = r0     // Catch:{ Exception -> 0x0081, all -> 0x007d }
        L_0x0215:
            r8.writeTo(r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            R1.b.d(r3, r5)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
            R1.b.b(r8)
            return
        L_0x021f:
            r0 = move-exception
            goto L_0x022a
        L_0x0221:
            r0 = move-exception
        L_0x0222:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x021f }
            throw r2     // Catch:{ all -> 0x021f }
        L_0x022a:
            R1.b.b(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.a0(java.io.InputStream, java.io.OutputStream):void");
    }

    private void c0(b bVar) {
        HashMap hashMap = this.f5644f[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar != null) {
            int m10 = dVar.m(this.f5646h);
            this.f5653o = m10;
            if (m10 != 1) {
                if (m10 == 6) {
                    z(bVar, hashMap);
                    return;
                } else if (m10 != 7) {
                    return;
                }
            }
            if (K(hashMap)) {
                A(bVar, hashMap);
                return;
            }
            return;
        }
        this.f5653o = 6;
        z(bVar, hashMap);
    }

    private static boolean d0(int i10) {
        if (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) {
            return false;
        }
        return true;
    }

    private void e() {
        String h10 = h("DateTimeOriginal");
        if (h10 != null && h("DateTime") == null) {
            this.f5644f[0].put("DateTime", d.e(h10));
        }
        if (h("ImageWidth") == null) {
            this.f5644f[0].put("ImageWidth", d.f(0, this.f5646h));
        }
        if (h("ImageLength") == null) {
            this.f5644f[0].put("ImageLength", d.f(0, this.f5646h));
        }
        if (h("Orientation") == null) {
            this.f5644f[0].put("Orientation", d.f(0, this.f5646h));
        }
        if (h("LightSource") == null) {
            this.f5644f[1].put("LightSource", d.f(0, this.f5646h));
        }
    }

    private void e0(int i10, int i11) {
        if (!this.f5644f[i10].isEmpty() && !this.f5644f[i11].isEmpty()) {
            d dVar = (d) this.f5644f[i10].get("ImageLength");
            d dVar2 = (d) this.f5644f[i10].get("ImageWidth");
            d dVar3 = (d) this.f5644f[i11].get("ImageLength");
            d dVar4 = (d) this.f5644f[i11].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f5634w) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m10 = dVar.m(this.f5646h);
                int m11 = dVar2.m(this.f5646h);
                int m12 = dVar3.m(this.f5646h);
                int m13 = dVar4.m(this.f5646h);
                if (m10 < m12 && m11 < m13) {
                    HashMap[] hashMapArr = this.f5644f;
                    HashMap hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            } else if (f5634w) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f5634w) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void f(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            g(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private static void f0(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    private void g(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.f(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        b.e(bVar, cVar, readInt);
    }

    private void g0(g gVar, int i10) {
        d dVar;
        d dVar2;
        d dVar3 = (d) this.f5644f[i10].get("DefaultCropSize");
        d dVar4 = (d) this.f5644f[i10].get("SensorTopBorder");
        d dVar5 = (d) this.f5644f[i10].get("SensorLeftBorder");
        d dVar6 = (d) this.f5644f[i10].get("SensorBottomBorder");
        d dVar7 = (d) this.f5644f[i10].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f5671a == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.f5646h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = d.h(fVarArr[0], this.f5646h);
                dVar = d.h(fVarArr[1], this.f5646h);
            } else {
                int[] iArr = (int[]) dVar3.o(this.f5646h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVar2 = d.j(iArr[0], this.f5646h);
                dVar = d.j(iArr[1], this.f5646h);
            }
            this.f5644f[i10].put("ImageWidth", dVar2);
            this.f5644f[i10].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            W(gVar, i10);
        } else {
            int m10 = dVar4.m(this.f5646h);
            int m11 = dVar6.m(this.f5646h);
            int m12 = dVar7.m(this.f5646h);
            int m13 = dVar5.m(this.f5646h);
            if (m11 > m10 && m12 > m13) {
                d j10 = d.j(m11 - m10, this.f5646h);
                d j11 = d.j(m12 - m13, this.f5646h);
                this.f5644f[i10].put("ImageLength", j10);
                this.f5644f[i10].put("ImageWidth", j11);
            }
        }
    }

    private void h0() {
        e0(0, 5);
        e0(0, 4);
        e0(5, 4);
        d dVar = (d) this.f5644f[1].get("PixelXDimension");
        d dVar2 = (d) this.f5644f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f5644f[0].put("ImageWidth", dVar);
            this.f5644f[0].put("ImageLength", dVar2);
        }
        if (this.f5644f[4].isEmpty() && M(this.f5644f[5])) {
            HashMap[] hashMapArr = this.f5644f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!M(this.f5644f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        V(0, "ThumbnailOrientation", "Orientation");
        V(0, "ThumbnailImageLength", "ImageLength");
        V(0, "ThumbnailImageWidth", "ImageWidth");
        V(5, "ThumbnailOrientation", "Orientation");
        V(5, "ThumbnailImageLength", "ImageLength");
        V(5, "ThumbnailImageWidth", "ImageWidth");
        V(4, "Orientation", "ThumbnailOrientation");
        V(4, "ImageLength", "ThumbnailImageLength");
        V(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int i0(c cVar) {
        short s10;
        c cVar2 = cVar;
        e[][] eVarArr = f5622k0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f5623l0) {
            U(eVar.f5676b);
        }
        if (this.f5647i) {
            if (this.f5648j) {
                U("StripOffsets");
                U("StripByteCounts");
            } else {
                U("JPEGInterchangeFormat");
                U("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f5622k0.length; i10++) {
            Iterator it = this.f5644f[i10].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
        }
        if (!this.f5644f[1].isEmpty()) {
            this.f5644f[0].put(f5623l0[1].f5676b, d.f(0, this.f5646h));
        }
        if (!this.f5644f[2].isEmpty()) {
            this.f5644f[0].put(f5623l0[2].f5676b, d.f(0, this.f5646h));
        }
        if (!this.f5644f[3].isEmpty()) {
            this.f5644f[1].put(f5623l0[3].f5676b, d.f(0, this.f5646h));
        }
        if (this.f5647i) {
            if (this.f5648j) {
                this.f5644f[4].put("StripOffsets", d.j(0, this.f5646h));
                this.f5644f[4].put("StripByteCounts", d.j(this.f5651m, this.f5646h));
            } else {
                this.f5644f[4].put("JPEGInterchangeFormat", d.f(0, this.f5646h));
                this.f5644f[4].put("JPEGInterchangeFormatLength", d.f((long) this.f5651m, this.f5646h));
            }
        }
        for (int i11 = 0; i11 < f5622k0.length; i11++) {
            int i12 = 0;
            for (Map.Entry value : this.f5644f[i11].entrySet()) {
                int p10 = ((d) value.getValue()).p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f5622k0.length; i14++) {
            if (!this.f5644f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f5644f[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.f5647i) {
            if (this.f5648j) {
                this.f5644f[4].put("StripOffsets", d.j(i13, this.f5646h));
            } else {
                this.f5644f[4].put("JPEGInterchangeFormat", d.f((long) i13, this.f5646h));
            }
            this.f5650l = i13;
            i13 += this.f5651m;
        }
        if (this.f5642d == 4) {
            i13 += 8;
        }
        if (f5634w) {
            for (int i15 = 0; i15 < f5622k0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f5644f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)}));
            }
        }
        if (!this.f5644f[1].isEmpty()) {
            this.f5644f[0].put(f5623l0[1].f5676b, d.f((long) iArr[1], this.f5646h));
        }
        if (!this.f5644f[2].isEmpty()) {
            this.f5644f[0].put(f5623l0[2].f5676b, d.f((long) iArr[2], this.f5646h));
        }
        if (!this.f5644f[3].isEmpty()) {
            this.f5644f[1].put(f5623l0[3].f5676b, d.f((long) iArr[3], this.f5646h));
        }
        int i16 = this.f5642d;
        if (i16 != 4) {
            if (i16 == 13) {
                cVar2.f(i13);
                cVar2.f(1700284774);
            } else if (i16 == 14) {
                cVar2.write(f5600O);
                cVar2.f(i13);
            }
        } else if (i13 <= 65535) {
            cVar2.q(i13);
            cVar2.write(f5629r0);
        } else {
            throw new IllegalStateException("Size of exif data (" + i13 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
        }
        int size = cVar2.f5669a.size();
        if (this.f5646h == ByteOrder.BIG_ENDIAN) {
            s10 = 19789;
        } else {
            s10 = 18761;
        }
        cVar2.n(s10);
        cVar2.a(this.f5646h);
        cVar2.q(42);
        cVar2.o(8);
        for (int i17 = 0; i17 < f5622k0.length; i17++) {
            if (!this.f5644f[i17].isEmpty()) {
                cVar2.q(this.f5644f[i17].size());
                int size2 = iArr[i17] + 2 + (this.f5644f[i17].size() * 12) + 4;
                for (Map.Entry entry : this.f5644f[i17].entrySet()) {
                    int i18 = ((e) f5625n0[i17].get(entry.getKey())).f5675a;
                    d dVar = (d) entry.getValue();
                    int p11 = dVar.p();
                    cVar2.q(i18);
                    cVar2.q(dVar.f5671a);
                    cVar2.f(dVar.f5672b);
                    if (p11 > 4) {
                        cVar2.o((long) size2);
                        size2 += p11;
                    } else {
                        cVar2.write(dVar.f5674d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar2.b(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f5644f[4].isEmpty()) {
                    cVar2.o(0);
                } else {
                    cVar2.o((long) iArr[4]);
                }
                for (Map.Entry value2 : this.f5644f[i17].entrySet()) {
                    byte[] bArr = ((d) value2.getValue()).f5674d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f5647i) {
            cVar2.write(v());
        }
        if (this.f5642d == 14 && i13 % 2 == 1) {
            cVar2.b(0);
        }
        cVar2.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    private d j(String str) {
        d dVar;
        d dVar2;
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f5634w) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            if ("Xmp".equals(str) && x(this.f5642d) == 2 && (dVar2 = this.f5659u) != null) {
                return dVar2;
            }
            for (int i10 = 0; i10 < f5622k0.length; i10++) {
                d dVar3 = (d) this.f5644f[i10].get(str);
                if (dVar3 != null) {
                    return dVar3;
                }
            }
            if (!"Xmp".equals(str) || (dVar = this.f5659u) == null) {
                return null;
            }
            return dVar;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void j0(c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f5654p = cVar.f5669a.size() + i0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.f((int) crc32.getValue());
    }

    private void k(g gVar, int i10) {
        String str;
        String str2;
        String str3;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        } else if (i10 != 15 || i12 >= 31) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                b.a.a(mediaMetadataRetriever, new C0138a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (str3 != null) {
                    this.f5644f[0].put("ImageWidth", d.j(Integer.parseInt(str3), this.f5646h));
                }
                if (str != null) {
                    this.f5644f[0].put("ImageLength", d.j(Integer.parseInt(str), this.f5646h));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt == 90) {
                        i11 = 6;
                    } else if (parseInt == 180) {
                        i11 = 3;
                    } else if (parseInt != 270) {
                        i11 = 1;
                    } else {
                        i11 = 8;
                    }
                    this.f5644f[0].put("Orientation", d.j(i11, this.f5646h));
                }
                if (!(extractMetadata == null || extractMetadata2 == null)) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 > 6) {
                        gVar.t((long) parseInt2);
                        byte[] bArr = new byte[6];
                        gVar.readFully(bArr);
                        int i13 = parseInt2 + 6;
                        int i14 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f5629r0)) {
                            byte[] bArr2 = new byte[i14];
                            gVar.readFully(bArr2);
                            this.f5654p = i13;
                            S(bArr2, 0);
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Invalid exif length");
                    }
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (!(extractMetadata5 == null || extractMetadata6 == null)) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j10 = (long) parseInt4;
                    gVar.t(j10);
                    byte[] bArr3 = new byte[parseInt5];
                    gVar.readFully(bArr3);
                    this.f5659u = new d(1, parseInt5, j10, bArr3);
                    this.f5660v = true;
                }
                if (f5634w) {
                    Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        } else {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
    }

    private void k0(c cVar) {
        cVar.f(this.f5659u.f5674d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.f(1767135348);
        f0(crc32, 1767135348);
        byte[] bArr = f5597L;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f5659u.f5674d);
        crc32.update(this.f5659u.f5674d);
        cVar.f((int) crc32.getValue());
        this.f5660v = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015c A[LOOP:0: B:8:0x0037->B:51:0x015c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0162 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(R1.a.b r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            boolean r3 = f5634w
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.o(r3)
            byte r3 = r21.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01ac
            byte r7 = r21.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x0191
            r3 = 2
        L_0x0037:
            byte r5 = r21.readByte()
            if (r5 != r6) goto L_0x0174
            byte r5 = r21.readByte()
            boolean r7 = f5634w
            if (r7 == 0) goto L_0x005f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L_0x005f:
            r8 = -39
            if (r5 == r8) goto L_0x016e
            r8 = -38
            if (r5 != r8) goto L_0x0069
            goto L_0x016e
        L_0x0069:
            int r8 = r21.readUnsignedShort()
            int r9 = r8 + -2
            r10 = 4
            int r3 = r3 + r10
            if (r7 == 0) goto L_0x009a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "JPEG segment: "
            r7.append(r11)
            r11 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r7.append(r11)
            java.lang.String r11 = " (length: "
            r7.append(r11)
            r7.append(r8)
            java.lang.String r11 = ")"
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
        L_0x009a:
            java.lang.String r7 = "Invalid length"
            if (r9 < 0) goto L_0x0168
            r11 = -31
            r12 = 0
            r13 = 1
            if (r5 == r11) goto L_0x010f
            r11 = -2
            if (r5 == r11) goto L_0x00ee
            switch(r5) {
                case -64: goto L_0x00b5;
                case -63: goto L_0x00b5;
                case -62: goto L_0x00b5;
                case -61: goto L_0x00b5;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            switch(r5) {
                case -59: goto L_0x00b5;
                case -58: goto L_0x00b5;
                case -57: goto L_0x00b5;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r5) {
                case -55: goto L_0x00b5;
                case -54: goto L_0x00b5;
                case -53: goto L_0x00b5;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r5) {
                case -51: goto L_0x00b5;
                case -50: goto L_0x00b5;
                case -49: goto L_0x00b5;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x015a
        L_0x00b5:
            r1.q(r13)
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r2]
            if (r2 == r10) goto L_0x00c1
            java.lang.String r9 = "ImageLength"
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r9 = "ThumbnailImageLength"
        L_0x00c3:
            int r11 = r21.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f5646h
            R1.a$d r11 = R1.a.d.f(r11, r13)
            r5.put(r9, r11)
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r2]
            if (r2 == r10) goto L_0x00da
            java.lang.String r9 = "ImageWidth"
            goto L_0x00dc
        L_0x00da:
            java.lang.String r9 = "ThumbnailImageWidth"
        L_0x00dc:
            int r10 = r21.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f5646h
            R1.a$d r10 = R1.a.d.f(r10, r12)
            r5.put(r9, r10)
            int r9 = r8 + -7
            goto L_0x015a
        L_0x00ee:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.h(r8)
            if (r9 != 0) goto L_0x010d
            java.util.HashMap[] r9 = r0.f5644f
            r9 = r9[r13]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = f5628q0
            r10.<init>(r5, r11)
            R1.a$d r5 = R1.a.d.e(r10)
            r9.put(r8, r5)
        L_0x010d:
            r9 = r12
            goto L_0x015a
        L_0x010f:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r8 = r3 + r9
            byte[] r10 = f5629r0
            boolean r11 = R1.b.f(r5, r10)
            if (r11 == 0) goto L_0x0135
            int r11 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            int r3 = r22 + r3
            int r9 = r10.length
            int r3 = r3 + r9
            r0.f5654p = r3
            r0.S(r5, r2)
            R1.a$b r3 = new R1.a$b
            r3.<init>((byte[]) r5)
            r0.c0(r3)
            goto L_0x0158
        L_0x0135:
            byte[] r10 = f5630s0
            boolean r11 = R1.b.f(r5, r10)
            if (r11 == 0) goto L_0x0158
            int r11 = r10.length
            int r3 = r3 + r11
            int r10 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r9)
            R1.a$d r9 = new R1.a$d
            int r10 = r5.length
            long r14 = (long) r3
            r3 = 1
            r17 = r14
            r14 = r9
            r15 = r3
            r16 = r10
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            r0.f5659u = r9
            r0.f5660v = r13
        L_0x0158:
            r3 = r8
            goto L_0x010d
        L_0x015a:
            if (r9 < 0) goto L_0x0162
            r1.q(r9)
            int r3 = r3 + r9
            goto L_0x0037
        L_0x0162:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            throw r1
        L_0x0168:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r7)
            throw r1
        L_0x016e:
            java.nio.ByteOrder r2 = r0.f5646h
            r1.o(r2)
            return
        L_0x0174:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0191:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ac:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.l(R1.a$b, int, int):void");
    }

    private int m(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (E(bArr)) {
            return 4;
        }
        if (H(bArr)) {
            return 9;
        }
        int D10 = D(bArr);
        if (D10 != 0) {
            return D10;
        }
        if (F(bArr)) {
            return 7;
        }
        if (I(bArr)) {
            return 10;
        }
        if (G(bArr)) {
            return 13;
        }
        if (N(bArr)) {
            return 14;
        }
        return 0;
    }

    private void n(g gVar) {
        int i10;
        int i11;
        q(gVar);
        d dVar = (d) this.f5644f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f5674d);
            gVar2.o(this.f5646h);
            byte[] bArr = f5594I;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.t(0);
            byte[] bArr3 = f5595J;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.t(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.t(12);
            }
            T(gVar2, 6);
            d dVar2 = (d) this.f5644f[7].get("PreviewImageStart");
            d dVar3 = (d) this.f5644f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f5644f[5].put("JPEGInterchangeFormat", dVar2);
                this.f5644f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) this.f5644f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f5646h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                    int i14 = (i12 - i13) + 1;
                    int i15 = (i10 - i11) + 1;
                    if (i14 < i15) {
                        int i16 = i14 + i15;
                        i15 = i16 - i15;
                        i14 = i16 - i15;
                    }
                    d j10 = d.j(i14, this.f5646h);
                    d j11 = d.j(i15, this.f5646h);
                    this.f5644f[0].put("ImageWidth", j10);
                    this.f5644f[0].put("ImageLength", j11);
                }
            }
        }
    }

    private void o(b bVar) {
        b bVar2 = bVar;
        if (f5634w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar2);
        }
        bVar2.o(ByteOrder.BIG_ENDIAN);
        int b10 = bVar.b();
        bVar2.q(f5596K.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                break;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int b11 = bVar.b() + readInt + 4;
                if (bVar.b() - b10 == 16) {
                    if (readInt2 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z10) {
                    this.f5654p = bVar.b() - b10;
                    byte[] bArr = new byte[readInt];
                    bVar2.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    f0(crc32, readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) == readInt3) {
                        S(bArr, 0);
                        h0();
                        c0(new b(bArr));
                        z10 = true;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                } else if (readInt2 == 1767135348 && !z11) {
                    byte[] bArr2 = f5597L;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar2.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i10 = readInt - length;
                            byte[] bArr4 = new byte[i10];
                            bVar2.readFully(bArr4);
                            this.f5659u = new d(1, i10, (long) (bVar.b() - b10), bArr4);
                            z11 = true;
                        }
                    }
                }
                bVar2.q(b11 - bVar.b());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f5660v = z11;
    }

    private void p(b bVar) {
        boolean z10 = f5634w;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.q(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.q(i10 - bVar.b());
        bVar.readFully(bArr4);
        l(new b(bArr4), i10, 5);
        bVar.q(i12 - bVar.b());
        bVar.o(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f5617f0.f5675a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f5646h);
                d j11 = d.j(readShort2, this.f5646h);
                this.f5644f[0].put("ImageLength", j10);
                this.f5644f[0].put("ImageWidth", j11);
                if (f5634w) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.q(readUnsignedShort2);
        }
    }

    private void q(g gVar) {
        d dVar;
        P(gVar);
        T(gVar, 0);
        g0(gVar, 0);
        g0(gVar, 5);
        g0(gVar, 4);
        h0();
        if (this.f5642d == 8 && (dVar = (d) this.f5644f[1].get("MakerNote")) != null) {
            g gVar2 = new g(dVar.f5674d);
            gVar2.o(this.f5646h);
            gVar2.q(6);
            T(gVar2, 9);
            d dVar2 = (d) this.f5644f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f5644f[1].put("ColorSpace", dVar2);
            }
        }
    }

    private void s(g gVar) {
        if (f5634w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        q(gVar);
        d dVar = (d) this.f5644f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f5674d), (int) dVar.f5673c, 5);
        }
        d dVar2 = (d) this.f5644f[0].get("ISO");
        d dVar3 = (d) this.f5644f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f5644f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    private boolean t(g gVar) {
        byte[] bArr = f5629r0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] f10 = gVar.f();
        this.f5654p = bArr.length;
        S(f10, 0);
        return true;
    }

    private void w(b bVar) {
        if (f5634w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.o(ByteOrder.LITTLE_ENDIAN);
        bVar.q(f5598M.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f5599N;
        bVar.q(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(f5600O, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f5629r0;
                    if (b.f(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f5654p = i10;
                    S(bArr3, 0);
                    c0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length != readInt) {
                    if (length <= readInt) {
                        bVar.q(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    return;
                }
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    private static int x(int i10) {
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) {
            return 2;
        }
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair y(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = y(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r10[r3]
            android.util.Pair r1 = y(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x00ff
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto L_0x00f5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto L_0x00eb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00eb:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00f5:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00ff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L_0x0124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0124
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0124:
            if (r2 >= 0) goto L_0x0132
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0132:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x013c:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
            return r10
        L_0x014b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.y(java.lang.String):android.util.Pair");
    }

    private void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m10 = dVar.m(this.f5646h);
            int m11 = dVar2.m(this.f5646h);
            if (this.f5642d == 7) {
                m10 += this.f5655q;
            }
            if (m10 > 0 && m11 > 0) {
                this.f5647i = true;
                if (this.f5639a == null && this.f5641c == null && this.f5640b == null) {
                    byte[] bArr = new byte[m11];
                    bVar.q(m10);
                    bVar.readFully(bArr);
                    this.f5652n = bArr;
                }
                this.f5650l = m10;
                this.f5651m = m11;
            }
            if (f5634w) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
            }
        }
    }

    public boolean C() {
        int i10 = i("Orientation", 1);
        if (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0152, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        r8 = null;
        r9 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        r9 = null;
        r1 = r6;
        r6 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f1, code lost:
        r1 = new java.io.FileOutputStream(r13.f5639a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00ff, code lost:
        android.system.Os.lseek(r13.f5640b, 0, android.system.OsConstants.SEEK_SET);
        r1 = new java.io.FileOutputStream(r13.f5640b);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084 A[Catch:{ Exception -> 0x0088, all -> 0x0084 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1 A[Catch:{ Exception -> 0x00fd, all -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ff A[Catch:{ Exception -> 0x00fd, all -> 0x00fa }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X() {
        /*
            r13 = this;
            int r0 = r13.f5642d
            boolean r0 = L(r0)
            if (r0 == 0) goto L_0x0172
            java.io.FileDescriptor r0 = r13.f5640b
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r13.f5639a
            if (r0 == 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0019:
            boolean r0 = r13.f5647i
            if (r0 == 0) goto L_0x002e
            boolean r0 = r13.f5648j
            if (r0 == 0) goto L_0x002e
            boolean r0 = r13.f5649k
            if (r0 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            r0 = 1
            r13.f5658t = r0
            byte[] r1 = r13.u()
            r13.f5652n = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.lang.String r3 = r13.f5639a     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            r4 = 0
            if (r3 == 0) goto L_0x0056
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.lang.String r6 = r13.f5639a     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            goto L_0x0064
        L_0x004e:
            r0 = move-exception
            r6 = r1
            goto L_0x016b
        L_0x0052:
            r0 = move-exception
            r6 = r1
            goto L_0x0162
        L_0x0056:
            java.io.FileDescriptor r3 = r13.f5640b     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            android.system.Os.lseek(r3, r4, r6)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.io.FileDescriptor r6 = r13.f5640b     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
        L_0x0064:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            r6.<init>(r2)     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            R1.b.d(r3, r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            R1.b.b(r3)
            R1.b.b(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00e4, all -> 0x0084 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x00e4, all -> 0x0084 }
            java.lang.String r7 = r13.f5639a     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            if (r7 == 0) goto L_0x0090
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            java.lang.String r8 = r13.f5639a     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            goto L_0x009e
        L_0x0084:
            r0 = move-exception
            r9 = r1
            goto L_0x014a
        L_0x0088:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
        L_0x008c:
            r6 = r7
            r7 = r9
            goto L_0x00e8
        L_0x0090:
            java.io.FileDescriptor r7 = r13.f5640b     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            int r8 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            android.system.Os.lseek(r7, r4, r8)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            java.io.FileDescriptor r8 = r13.f5640b     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
        L_0x009e:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00de, all -> 0x0084 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00de, all -> 0x0084 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            int r10 = r13.f5642d     // Catch:{ Exception -> 0x00b5 }
            r11 = 4
            if (r10 != r11) goto L_0x00ba
            r13.Y(r8, r9)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00c9
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            r1 = r8
            goto L_0x014a
        L_0x00b5:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto L_0x00e8
        L_0x00ba:
            r11 = 13
            if (r10 != r11) goto L_0x00c2
            r13.Z(r8, r9)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00c9
        L_0x00c2:
            r11 = 14
            if (r10 != r11) goto L_0x00c9
            r13.a0(r8, r9)     // Catch:{ Exception -> 0x00b5 }
        L_0x00c9:
            R1.b.b(r8)
            R1.b.b(r9)
            r2.delete()
            r13.f5652n = r1
            return
        L_0x00d5:
            r0 = move-exception
            r9 = r1
            goto L_0x00b2
        L_0x00d8:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto L_0x00e8
        L_0x00de:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto L_0x00e8
        L_0x00e4:
            r7 = move-exception
            r8 = r1
            r9 = r8
            goto L_0x008c
        L_0x00e8:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            r10.<init>(r2)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            java.lang.String r1 = r13.f5639a     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            if (r1 == 0) goto L_0x00ff
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            java.lang.String r4 = r13.f5639a     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
        L_0x00f8:
            r7 = r1
            goto L_0x010e
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            r1 = r10
            goto L_0x0143
        L_0x00fd:
            r1 = move-exception
            goto L_0x0124
        L_0x00ff:
            java.io.FileDescriptor r1 = r13.f5640b     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            android.system.Os.lseek(r1, r4, r11)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            java.io.FileDescriptor r4 = r13.f5640b     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            goto L_0x00f8
        L_0x010e:
            R1.b.d(r10, r7)     // Catch:{ Exception -> 0x00fd, all -> 0x00fa }
            R1.b.b(r10)     // Catch:{ all -> 0x00b1 }
            R1.b.b(r7)     // Catch:{ all -> 0x00b1 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x011f:
            r0 = move-exception
            goto L_0x0143
        L_0x0121:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L_0x0124:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x013f }
            r4.<init>()     // Catch:{ all -> 0x013f }
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch:{ all -> 0x013f }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ all -> 0x013f }
            r4.append(r5)     // Catch:{ all -> 0x013f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x013f }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x013f }
            throw r3     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x00fb
        L_0x0143:
            R1.b.b(r1)     // Catch:{ all -> 0x00b1 }
            R1.b.b(r7)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x014a:
            R1.b.b(r1)
            R1.b.b(r9)
            if (r3 != 0) goto L_0x0155
            r2.delete()
        L_0x0155:
            throw r0
        L_0x0156:
            r0 = move-exception
        L_0x0157:
            r1 = r3
            goto L_0x016b
        L_0x0159:
            r0 = move-exception
        L_0x015a:
            r1 = r3
            goto L_0x0162
        L_0x015c:
            r0 = move-exception
            r6 = r1
            goto L_0x0157
        L_0x015f:
            r0 = move-exception
            r6 = r1
            goto L_0x015a
        L_0x0162:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x016a }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x016a }
            throw r2     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
        L_0x016b:
            R1.b.b(r1)
            R1.b.b(r6)
            throw r0
        L_0x0172:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.X():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02e3, code lost:
        r21 = r6;
        r20 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            if (r1 == 0) goto L_0x03cf
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x001d
            boolean r1 = f5634w
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r4, r1)
        L_0x001b:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x001d:
            r3 = 3
            r5 = 2
            java.lang.String r6 = "/"
            r7 = 1
            if (r2 == 0) goto L_0x011f
            java.util.Set r8 = f5626o0
            boolean r8 = r8.contains(r1)
            java.lang.String r9 = " : "
            java.lang.String r10 = "Invalid value for "
            if (r8 == 0) goto L_0x005d
            boolean r8 = r2.contains(r6)
            if (r8 != 0) goto L_0x005d
            double r11 = java.lang.Double.parseDouble(r24)     // Catch:{ NumberFormatException -> 0x0044 }
            R1.a$f r8 = R1.a.f.b(r11)     // Catch:{ NumberFormatException -> 0x0044 }
            java.lang.String r2 = r8.toString()     // Catch:{ NumberFormatException -> 0x0044 }
            goto L_0x011f
        L_0x0044:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L_0x005d:
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00c2
            java.util.regex.Pattern r8 = f5632u0
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r11 = r8.find()
            if (r11 != 0) goto L_0x008a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L_0x008a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = r8.group(r7)
            int r9 = java.lang.Integer.parseInt(r9)
            r2.append(r9)
            java.lang.String r9 = "/1,"
            r2.append(r9)
            java.lang.String r10 = r8.group(r5)
            int r10 = java.lang.Integer.parseInt(r10)
            r2.append(r10)
            r2.append(r9)
            java.lang.String r8 = r8.group(r3)
            int r8 = java.lang.Integer.parseInt(r8)
            r2.append(r8)
            java.lang.String r8 = "/1"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            goto L_0x011f
        L_0x00c2:
            java.lang.String r8 = "DateTime"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x00da
            java.lang.String r8 = "DateTimeOriginal"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x00da
            java.lang.String r8 = "DateTimeDigitized"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x011f
        L_0x00da:
            java.util.regex.Pattern r8 = f5633v0
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r8 = r8.find()
            java.util.regex.Pattern r11 = f5635w0
            java.util.regex.Matcher r11 = r11.matcher(r2)
            boolean r11 = r11.find()
            int r12 = r24.length()
            r13 = 19
            if (r12 != r13) goto L_0x0106
            if (r8 != 0) goto L_0x00fb
            if (r11 != 0) goto L_0x00fb
            goto L_0x0106
        L_0x00fb:
            if (r11 == 0) goto L_0x011f
            java.lang.String r8 = "-"
            java.lang.String r9 = ":"
            java.lang.String r2 = r2.replaceAll(r8, r9)
            goto L_0x011f
        L_0x0106:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L_0x011f:
            java.lang.String r8 = "Xmp"
            boolean r9 = r8.equals(r1)
            r10 = 0
            if (r9 == 0) goto L_0x015e
            java.util.HashMap[] r9 = r0.f5644f
            r9 = r9[r10]
            boolean r9 = r9.containsKey(r8)
            if (r9 != 0) goto L_0x0140
            java.util.HashMap[] r9 = r0.f5644f
            r11 = 5
            r9 = r9[r11]
            boolean r8 = r9.containsKey(r8)
            if (r8 == 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r8 = r10
            goto L_0x0141
        L_0x0140:
            r8 = r7
        L_0x0141:
            int r9 = r0.f5642d
            int r9 = x(r9)
            if (r9 != r5) goto L_0x014f
            R1.a$d r11 = r0.f5659u
            if (r11 != 0) goto L_0x0153
            if (r8 == 0) goto L_0x0153
        L_0x014f:
            if (r9 != r3) goto L_0x015e
            if (r8 != 0) goto L_0x015e
        L_0x0153:
            if (r2 == 0) goto L_0x015a
            R1.a$d r1 = R1.a.d.a(r2)
            goto L_0x015b
        L_0x015a:
            r1 = 0
        L_0x015b:
            r0.f5659u = r1
            return
        L_0x015e:
            r3 = r10
        L_0x015f:
            R1.a$e[][] r8 = f5622k0
            int r8 = r8.length
            if (r3 >= r8) goto L_0x03ce
            r8 = 4
            if (r3 != r8) goto L_0x0171
            boolean r8 = r0.f5647i
            if (r8 != 0) goto L_0x0171
        L_0x016b:
            r21 = r6
            r20 = r7
            goto L_0x03c5
        L_0x0171:
            java.util.HashMap[] r8 = f5625n0
            r8 = r8[r3]
            java.lang.Object r8 = r8.get(r1)
            R1.a$e r8 = (R1.a.e) r8
            if (r8 == 0) goto L_0x016b
            if (r2 != 0) goto L_0x0187
            java.util.HashMap[] r8 = r0.f5644f
            r8 = r8[r3]
            r8.remove(r1)
            goto L_0x016b
        L_0x0187:
            android.util.Pair r9 = y(r2)
            int r11 = r8.f5677c
            java.lang.Object r12 = r9.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = -1
            if (r11 == r12) goto L_0x025b
            int r11 = r8.f5677c
            java.lang.Object r12 = r9.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L_0x01a6
            goto L_0x025b
        L_0x01a6:
            int r11 = r8.f5678d
            if (r11 == r13) goto L_0x01c4
            java.lang.Object r12 = r9.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 == r12) goto L_0x01c0
            int r11 = r8.f5678d
            java.lang.Object r12 = r9.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L_0x01c4
        L_0x01c0:
            int r8 = r8.f5678d
            goto L_0x025d
        L_0x01c4:
            int r11 = r8.f5677c
            if (r11 == r7) goto L_0x0259
            r12 = 7
            if (r11 == r12) goto L_0x0259
            if (r11 != r5) goto L_0x01cf
            goto L_0x0259
        L_0x01cf:
            boolean r11 = f5634w
            if (r11 == 0) goto L_0x016b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Given tag ("
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = ") value didn't match with one of expected formats: "
            r11.append(r12)
            java.lang.String[] r12 = f5609X
            int r14 = r8.f5677c
            r14 = r12[r14]
            r11.append(r14)
            int r14 = r8.f5678d
            java.lang.String r15 = ", "
            java.lang.String r16 = ""
            if (r14 != r13) goto L_0x01f9
            r8 = r16
            goto L_0x020c
        L_0x01f9:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            int r8 = r8.f5678d
            r8 = r12[r8]
            r14.append(r8)
            java.lang.String r8 = r14.toString()
        L_0x020c:
            r11.append(r8)
            java.lang.String r8 = " (guess: "
            r11.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r12[r8]
            r11.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r13) goto L_0x022e
        L_0x022b:
            r8 = r16
            goto L_0x0248
        L_0x022e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r12[r9]
            r8.append(r9)
            java.lang.String r16 = r8.toString()
            goto L_0x022b
        L_0x0248:
            r11.append(r8)
            java.lang.String r8 = ")"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            android.util.Log.d(r4, r8)
            goto L_0x016b
        L_0x0259:
            r8 = r11
            goto L_0x025d
        L_0x025b:
            int r8 = r8.f5677c
        L_0x025d:
            java.lang.String r9 = ","
            switch(r8) {
                case 1: goto L_0x03b6;
                case 2: goto L_0x03a6;
                case 3: goto L_0x037e;
                case 4: goto L_0x0356;
                case 5: goto L_0x030d;
                case 6: goto L_0x0262;
                case 7: goto L_0x03a6;
                case 8: goto L_0x0262;
                case 9: goto L_0x02e9;
                case 10: goto L_0x02a1;
                case 11: goto L_0x0262;
                case 12: goto L_0x027c;
                default: goto L_0x0262;
            }
        L_0x0262:
            boolean r9 = f5634w
            if (r9 == 0) goto L_0x016b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Data format isn't one of expected formats: "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r4, r8)
            goto L_0x016b
        L_0x027c:
            java.lang.String[] r8 = r2.split(r9, r13)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r11 = r10
        L_0x0284:
            int r12 = r8.length
            if (r11 >= r12) goto L_0x0292
            r12 = r8[r11]
            double r12 = java.lang.Double.parseDouble(r12)
            r9[r11] = r12
            int r11 = r11 + 1
            goto L_0x0284
        L_0x0292:
            java.util.HashMap[] r8 = r0.f5644f
            r8 = r8[r3]
            java.nio.ByteOrder r11 = r0.f5646h
            R1.a$d r9 = R1.a.d.b(r9, r11)
            r8.put(r1, r9)
            goto L_0x016b
        L_0x02a1:
            java.lang.String[] r8 = r2.split(r9, r13)
            int r9 = r8.length
            R1.a$f[] r9 = new R1.a.f[r9]
            r11 = r10
        L_0x02a9:
            int r12 = r8.length
            if (r11 >= r12) goto L_0x02d6
            r12 = r8[r11]
            java.lang.String[] r12 = r12.split(r6, r13)
            R1.a$f r20 = new R1.a$f
            r14 = r12[r10]
            double r14 = java.lang.Double.parseDouble(r14)
            long r14 = (long) r14
            r12 = r12[r7]
            r24 = r8
            double r7 = java.lang.Double.parseDouble(r12)
            long r7 = (long) r7
            r19 = 0
            r15 = r14
            r14 = r20
            r17 = r7
            r14.<init>(r15, r17, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            r8 = r24
            r7 = 1
            goto L_0x02a9
        L_0x02d6:
            java.util.HashMap[] r7 = r0.f5644f
            r7 = r7[r3]
            java.nio.ByteOrder r8 = r0.f5646h
            R1.a$d r8 = R1.a.d.d(r9, r8)
            r7.put(r1, r8)
        L_0x02e3:
            r21 = r6
            r20 = 1
            goto L_0x03c5
        L_0x02e9:
            java.lang.String[] r7 = r2.split(r9, r13)
            int r8 = r7.length
            int[] r8 = new int[r8]
            r9 = r10
        L_0x02f1:
            int r11 = r7.length
            if (r9 >= r11) goto L_0x02ff
            r11 = r7[r9]
            int r11 = java.lang.Integer.parseInt(r11)
            r8[r9] = r11
            int r9 = r9 + 1
            goto L_0x02f1
        L_0x02ff:
            java.util.HashMap[] r7 = r0.f5644f
            r7 = r7[r3]
            java.nio.ByteOrder r9 = r0.f5646h
            R1.a$d r8 = R1.a.d.c(r8, r9)
            r7.put(r1, r8)
            goto L_0x02e3
        L_0x030d:
            java.lang.String[] r7 = r2.split(r9, r13)
            int r8 = r7.length
            R1.a$f[] r8 = new R1.a.f[r8]
            r9 = r10
        L_0x0315:
            int r11 = r7.length
            if (r9 >= r11) goto L_0x0343
            r11 = r7[r9]
            java.lang.String[] r11 = r11.split(r6, r13)
            R1.a$f r12 = new R1.a$f
            r14 = r11[r10]
            double r14 = java.lang.Double.parseDouble(r14)
            long r14 = (long) r14
            r20 = 1
            r11 = r11[r20]
            r21 = r6
            double r5 = java.lang.Double.parseDouble(r11)
            long r5 = (long) r5
            r19 = 0
            r15 = r14
            r14 = r12
            r17 = r5
            r14.<init>(r15, r17, r19)
            r8[r9] = r12
            int r9 = r9 + 1
            r6 = r21
            r5 = 2
            goto L_0x0315
        L_0x0343:
            r21 = r6
            r20 = 1
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r3]
            java.nio.ByteOrder r6 = r0.f5646h
            R1.a$d r6 = R1.a.d.i(r8, r6)
            r5.put(r1, r6)
            goto L_0x03c5
        L_0x0356:
            r21 = r6
            r20 = r7
            java.lang.String[] r5 = r2.split(r9, r13)
            int r6 = r5.length
            long[] r6 = new long[r6]
            r7 = r10
        L_0x0362:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0370
            r8 = r5[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0362
        L_0x0370:
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r3]
            java.nio.ByteOrder r7 = r0.f5646h
            R1.a$d r6 = R1.a.d.g(r6, r7)
            r5.put(r1, r6)
            goto L_0x03c5
        L_0x037e:
            r21 = r6
            r20 = r7
            java.lang.String[] r5 = r2.split(r9, r13)
            int r6 = r5.length
            int[] r6 = new int[r6]
            r7 = r10
        L_0x038a:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x0398
            r8 = r5[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x038a
        L_0x0398:
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r3]
            java.nio.ByteOrder r7 = r0.f5646h
            R1.a$d r6 = R1.a.d.k(r6, r7)
            r5.put(r1, r6)
            goto L_0x03c5
        L_0x03a6:
            r21 = r6
            r20 = r7
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r3]
            R1.a$d r6 = R1.a.d.e(r2)
            r5.put(r1, r6)
            goto L_0x03c5
        L_0x03b6:
            r21 = r6
            r20 = r7
            java.util.HashMap[] r5 = r0.f5644f
            r5 = r5[r3]
            R1.a$d r6 = R1.a.d.a(r2)
            r5.put(r1, r6)
        L_0x03c5:
            int r3 = r3 + 1
            r7 = r20
            r6 = r21
            r5 = 2
            goto L_0x015f
        L_0x03ce:
            return
        L_0x03cf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "tag shouldn't be null"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.b0(java.lang.String, java.lang.String):void");
    }

    public String h(String str) {
        if (str != null) {
            d j10 = j(str);
            if (j10 == null) {
                return null;
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = j10.f5671a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) j10.o(this.f5646h);
                    if (fVarArr == null || fVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                        return null;
                    }
                    f fVar = fVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) fVar.f5679a) / ((float) fVar.f5680b)));
                    f fVar2 = fVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) fVar2.f5679a) / ((float) fVar2.f5680b)));
                    f fVar3 = fVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) fVar3.f5679a) / ((float) fVar3.f5680b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j10.f5671a);
                return null;
            } else if (!f5626o0.contains(str)) {
                return j10.n(this.f5646h);
            } else {
                try {
                    return Double.toString(j10.l(this.f5646h));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    public int i(String str, int i10) {
        if (str != null) {
            d j10 = j(str);
            if (j10 == null) {
                return i10;
            }
            try {
                return j10.m(this.f5646h);
            } catch (NumberFormatException unused) {
                return i10;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    public int r() {
        switch (i("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] u() {
        int i10 = this.f5653o;
        if (i10 == 6 || i10 == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] v() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f5647i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r8.f5652n
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f5641c     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x002f
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0021, all -> 0x001c }
            if (r3 == 0) goto L_0x0026
            r1.reset()     // Catch:{ Exception -> 0x0021, all -> 0x001c }
        L_0x001a:
            r3 = r2
            goto L_0x0058
        L_0x001c:
            r0 = move-exception
            r3 = r2
        L_0x001e:
            r2 = r1
            goto L_0x0090
        L_0x0021:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x0082
        L_0x0026:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0021, all -> 0x001c }
            R1.b.b(r1)
            return r2
        L_0x002f:
            java.lang.String r1 = r8.f5639a     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x0043
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r3 = r8.f5639a     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            r1.<init>(r3)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            goto L_0x001a
        L_0x003b:
            r0 = move-exception
            r3 = r2
            goto L_0x0090
        L_0x003e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L_0x0082
        L_0x0043:
            java.io.FileDescriptor r1 = r8.f5640b     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            int r3 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x0058:
            R1.a$b r4 = new R1.a$b     // Catch:{ Exception -> 0x0079 }
            r4.<init>((java.io.InputStream) r1)     // Catch:{ Exception -> 0x0079 }
            int r5 = r8.f5650l     // Catch:{ Exception -> 0x0079 }
            int r6 = r8.f5654p     // Catch:{ Exception -> 0x0079 }
            int r5 = r5 + r6
            r4.q(r5)     // Catch:{ Exception -> 0x0079 }
            int r5 = r8.f5651m     // Catch:{ Exception -> 0x0079 }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0079 }
            r4.readFully(r5)     // Catch:{ Exception -> 0x0079 }
            r8.f5652n = r5     // Catch:{ Exception -> 0x0079 }
            R1.b.b(r1)
            if (r3 == 0) goto L_0x0076
            R1.b.a(r3)
        L_0x0076:
            return r5
        L_0x0077:
            r0 = move-exception
            goto L_0x001e
        L_0x0079:
            r4 = move-exception
            goto L_0x0082
        L_0x007b:
            r0 = move-exception
            r3 = r1
            goto L_0x0090
        L_0x007e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L_0x0082:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x0077 }
            R1.b.b(r1)
            if (r3 == 0) goto L_0x008f
            R1.b.a(r3)
        L_0x008f:
            return r2
        L_0x0090:
            R1.b.b(r2)
            if (r3 == 0) goto L_0x0098
            R1.b.a(r3)
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.a.v():byte[]");
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: a  reason: collision with root package name */
        protected final DataInputStream f5664a;

        /* renamed from: b  reason: collision with root package name */
        protected int f5665b;

        /* renamed from: c  reason: collision with root package name */
        private ByteOrder f5666c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f5667d;

        /* renamed from: e  reason: collision with root package name */
        private int f5668e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f5668e = bArr.length;
        }

        public int a() {
            return this.f5668e;
        }

        public int available() {
            return this.f5664a.available();
        }

        public int b() {
            return this.f5665b;
        }

        public byte[] f() {
            byte[] bArr = new byte[1024];
            int i10 = 0;
            while (true) {
                if (i10 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
                int read = this.f5664a.read(bArr, i10, bArr.length - i10);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i10);
                }
                i10 += read;
                this.f5665b += read;
            }
        }

        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public long n() {
            return ((long) readInt()) & 4294967295L;
        }

        public void o(ByteOrder byteOrder) {
            this.f5666c = byteOrder;
        }

        public void q(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f5664a.skip((long) i12);
                if (skip <= 0) {
                    if (this.f5667d == null) {
                        this.f5667d = new byte[8192];
                    }
                    skip = this.f5664a.read(this.f5667d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f5665b += i11;
        }

        public int read() {
            this.f5665b++;
            return this.f5664a.read();
        }

        public boolean readBoolean() {
            this.f5665b++;
            return this.f5664a.readBoolean();
        }

        public byte readByte() {
            this.f5665b++;
            int read = this.f5664a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f5665b += 2;
            return this.f5664a.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i10, int i11) {
            this.f5665b += i11;
            this.f5664a.readFully(bArr, i10, i11);
        }

        public int readInt() {
            this.f5665b += 4;
            int read = this.f5664a.read();
            int read2 = this.f5664a.read();
            int read3 = this.f5664a.read();
            int read4 = this.f5664a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f5666c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f5666c);
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            this.f5665b += 8;
            int read = this.f5664a.read();
            int read2 = this.f5664a.read();
            int read3 = this.f5664a.read();
            int read4 = this.f5664a.read();
            int read5 = this.f5664a.read();
            int read6 = this.f5664a.read();
            int read7 = this.f5664a.read();
            int read8 = this.f5664a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f5666c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i10 = read2;
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (((long) read) << 56) + (((long) i10) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f5666c);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f5665b += 2;
            int read = this.f5664a.read();
            int read2 = this.f5664a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f5666c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f5666c);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f5665b += 2;
            return this.f5664a.readUTF();
        }

        public int readUnsignedByte() {
            this.f5665b++;
            return this.f5664a.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f5665b += 2;
            int read = this.f5664a.read();
            int read2 = this.f5664a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f5666c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f5666c);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f5664a.read(bArr, i10, i11);
            this.f5665b += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            this.f5665b += bArr.length;
            this.f5664a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f5664a = dataInputStream;
            dataInputStream.mark(0);
            this.f5665b = 0;
            this.f5666c = byteOrder;
            this.f5668e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f5664a.mark(a.e.API_PRIORITY_OTHER);
        }

        public void t(long j10) {
            int i10 = this.f5665b;
            if (((long) i10) > j10) {
                this.f5665b = 0;
                this.f5664a.reset();
            } else {
                j10 -= (long) i10;
            }
            q((int) j10);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f5664a.mark(a.e.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f5675a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5676b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5677c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5678d;

        e(String str, int i10, int i11) {
            this.f5676b = str;
            this.f5675a = i10;
            this.f5677c = i11;
            this.f5678d = -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i10) {
            int i11;
            int i12 = this.f5677c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f5678d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            if ((i12 == 12 || i11 == 12) && i10 == 11) {
                return true;
            }
            return false;
        }

        e(String str, int i10, int i11, int i12) {
            this.f5676b = str;
            this.f5675a = i10;
            this.f5677c = i11;
            this.f5678d = i12;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f5622k0;
        this.f5644f = new HashMap[eVarArr.length];
        this.f5645g = new HashSet(eVarArr.length);
        this.f5646h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f5639a = null;
            boolean z10 = i10 != 1 ? false : true;
            this.f5643e = z10;
            if (z10) {
                this.f5641c = null;
                this.f5640b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f5641c = (AssetManager.AssetInputStream) inputStream;
                this.f5640b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (J(fileInputStream.getFD())) {
                        this.f5641c = null;
                        this.f5640b = fileInputStream.getFD();
                    }
                }
                this.f5641c = null;
                this.f5640b = null;
            }
            O(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* renamed from: R1.a$a  reason: collision with other inner class name */
    class C0138a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        long f5661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f5662b;

        C0138a(g gVar) {
            this.f5662b = gVar;
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f5661a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f5662b.available())) {
                        return -1;
                    }
                    this.f5662b.t(j10);
                    this.f5661a = j10;
                }
                if (i11 > this.f5662b.available()) {
                    i11 = this.f5662b.available();
                }
                int read = this.f5662b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f5661a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f5661a = -1;
            return -1;
        }

        public void close() {
        }
    }
}
