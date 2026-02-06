package Y2;

import W2.s;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.google.common.collect.C4770v;
import h2.C2030a;
import i2.C2073A;
import i2.C2082g;
import i2.L;
import i2.p;
import i2.z;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.List;

public final class a implements s {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f10261h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f10262i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f10263j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f10264a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f10265b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f10266c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    private final b f10267d = new b(719, 575, 0, 719, 0, 575);

    /* renamed from: e  reason: collision with root package name */
    private final C0190a f10268e = new C0190a(0, e(), f(), g());

    /* renamed from: f  reason: collision with root package name */
    private final h f10269f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f10270g;

    /* renamed from: Y2.a$a  reason: collision with other inner class name */
    private static final class C0190a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10271a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f10272b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f10273c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f10274d;

        public C0190a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f10271a = i10;
            this.f10272b = iArr;
            this.f10273c = iArr2;
            this.f10274d = iArr3;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10275a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10276b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10277c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10278d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10279e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10280f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f10275a = i10;
            this.f10276b = i11;
            this.f10277c = i12;
            this.f10278d = i13;
            this.f10279e = i14;
            this.f10280f = i15;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f10281a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10282b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f10283c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f10284d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f10281a = i10;
            this.f10282b = z10;
            this.f10283c = bArr;
            this.f10284d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f10285a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10286b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10287c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray f10288d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f10285a = i10;
            this.f10286b = i11;
            this.f10287c = i12;
            this.f10288d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f10289a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10290b;

        public e(int i10, int i11) {
            this.f10289a = i10;
            this.f10290b = i11;
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f10291a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10292b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10293c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10294d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10295e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10296f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10297g;

        /* renamed from: h  reason: collision with root package name */
        public final int f10298h;

        /* renamed from: i  reason: collision with root package name */
        public final int f10299i;

        /* renamed from: j  reason: collision with root package name */
        public final int f10300j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray f10301k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f10291a = i10;
            this.f10292b = z10;
            this.f10293c = i11;
            this.f10294d = i12;
            this.f10295e = i13;
            this.f10296f = i14;
            this.f10297g = i15;
            this.f10298h = i16;
            this.f10299i = i17;
            this.f10300j = i18;
            this.f10301k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f10301k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f10301k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f10302a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10303b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10304c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10305d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10306e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10307f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f10302a = i10;
            this.f10303b = i11;
            this.f10304c = i12;
            this.f10305d = i13;
            this.f10306e = i14;
            this.f10307f = i15;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f10308a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10309b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray f10310c = new SparseArray();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray f10311d = new SparseArray();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray f10312e = new SparseArray();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray f10313f = new SparseArray();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray f10314g = new SparseArray();

        /* renamed from: h  reason: collision with root package name */
        public b f10315h;

        /* renamed from: i  reason: collision with root package name */
        public d f10316i;

        public h(int i10, int i11) {
            this.f10308a = i10;
            this.f10309b = i11;
        }

        public void a() {
            this.f10310c.clear();
            this.f10311d.clear();
            this.f10312e.clear();
            this.f10313f.clear();
            this.f10314g.clear();
            this.f10315h = null;
            this.f10316i = null;
        }
    }

    public a(List list) {
        C2073A a10 = new C2073A((byte[]) list.get(0));
        int N10 = a10.N();
        int N11 = a10.N();
        Paint paint = new Paint();
        this.f10264a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f10265b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f10269f = new h(N10, N11);
    }

    private static byte[] d(int i10, int i11, z zVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zVar.h(i11);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = h(255, i12, i13, i14);
            } else {
                int i16 = 127;
                if ((i15 & 1) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = h(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = h(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 == 0) {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i33 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i34 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = h(255, i33, i34, i32 + i31);
                } else if (i30 != 8) {
                    int i35 = 43;
                    if (i30 == 128) {
                        if ((i28 & 1) != 0) {
                            i18 = 43;
                        } else {
                            i18 = 0;
                        }
                        int i36 = i18 + 127;
                        if ((i28 & 16) != 0) {
                            i19 = 85;
                        } else {
                            i19 = 0;
                        }
                        int i37 = i36 + i19;
                        if ((i28 & 2) != 0) {
                            i20 = 43;
                        } else {
                            i20 = 0;
                        }
                        int i38 = i20 + 127;
                        if ((i28 & 32) != 0) {
                            i21 = 85;
                        } else {
                            i21 = 0;
                        }
                        int i39 = i38 + i21;
                        if ((i28 & 4) == 0) {
                            i35 = 0;
                        }
                        int i40 = i35 + 127;
                        if ((i28 & 64) == 0) {
                            i32 = 0;
                        }
                        iArr[i28] = h(255, i37, i39, i40 + i32);
                    } else if (i30 == 136) {
                        if ((i28 & 1) != 0) {
                            i22 = 43;
                        } else {
                            i22 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i23 = 85;
                        } else {
                            i23 = 0;
                        }
                        int i41 = i22 + i23;
                        if ((i28 & 2) != 0) {
                            i24 = 43;
                        } else {
                            i24 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i25 = 85;
                        } else {
                            i25 = 0;
                        }
                        int i42 = i24 + i25;
                        if ((i28 & 4) == 0) {
                            i35 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i32 = 0;
                        }
                        iArr[i28] = h(255, i41, i42, i35 + i32);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i14 = 85;
                    } else {
                        i14 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i15 = 170;
                    } else {
                        i15 = 0;
                    }
                    int i43 = i14 + i15;
                    if ((i28 & 2) != 0) {
                        i16 = 85;
                    } else {
                        i16 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i17 = 170;
                    } else {
                        i17 = 0;
                    }
                    int i44 = i16 + i17;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = h(127, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    private static int h(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int i(i2.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
            r12 = r5
            goto L_0x0060
        L_0x0014:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.h(r6)
            int r4 = r4 + r6
            int r3 = r13.h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0060
        L_0x0028:
            boolean r4 = r13.g()
            if (r4 == 0) goto L_0x0032
            r11 = r2
            r12 = r5
        L_0x0030:
            r4 = r9
            goto L_0x0060
        L_0x0032:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005b
            if (r4 == r3) goto L_0x004f
            if (r4 == r6) goto L_0x0042
            r11 = r2
        L_0x003f:
            r4 = r9
            r12 = r4
            goto L_0x0060
        L_0x0042:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            int r3 = r13.h(r3)
            goto L_0x0024
        L_0x004f:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            int r3 = r13.h(r3)
            goto L_0x0024
        L_0x005b:
            r11 = r2
            r12 = r3
            goto L_0x0030
        L_0x005e:
            r11 = r5
            goto L_0x003f
        L_0x0060:
            if (r12 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x007e
            if (r15 == 0) goto L_0x0068
            byte r4 = r15[r4]
        L_0x0068:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007e:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0082
            return r10
        L_0x0082:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.i(i2.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int j(i2.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x006c
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 != 0) goto L_0x002c
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0028
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
        L_0x0026:
            r4 = r9
            goto L_0x006c
        L_0x0028:
            r11 = r5
        L_0x0029:
            r4 = r9
            r12 = r4
            goto L_0x006c
        L_0x002c:
            boolean r4 = r13.g()
            r7 = 2
            if (r4 != 0) goto L_0x0040
            int r4 = r13.h(r7)
            int r4 = r4 + r3
            int r3 = r13.h(r3)
        L_0x003c:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x006c
        L_0x0040:
            int r4 = r13.h(r7)
            if (r4 == 0) goto L_0x0069
            if (r4 == r5) goto L_0x0066
            if (r4 == r7) goto L_0x005b
            if (r4 == r6) goto L_0x004e
            r11 = r2
            goto L_0x0029
        L_0x004e:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 25
            int r3 = r13.h(r3)
            goto L_0x003c
        L_0x005b:
            int r4 = r13.h(r3)
            int r4 = r4 + 9
            int r3 = r13.h(r3)
            goto L_0x003c
        L_0x0066:
            r11 = r2
            r12 = r7
            goto L_0x0026
        L_0x0069:
            r11 = r2
            r12 = r5
            goto L_0x0026
        L_0x006c:
            if (r12 == 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            if (r15 == 0) goto L_0x0074
            byte r4 = r15[r4]
        L_0x0074:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008a:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x008e
            return r10
        L_0x008e:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.j(i2.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int k(i2.z r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 8
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = r9
            goto L_0x0035
        L_0x0026:
            r11 = r5
            r4 = r9
            r12 = r4
            goto L_0x0035
        L_0x002a:
            int r4 = r13.h(r6)
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.a.k(i2.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static void l(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i13 = i10;
        byte[] bArr6 = bArr;
        z zVar = new z(bArr);
        int i14 = i11;
        int i15 = i12;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        byte[] bArr9 = null;
        while (zVar.b() != 0) {
            int h10 = zVar.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i13 != 3) {
                            if (i13 != 2) {
                                bArr2 = null;
                                i14 = i(zVar, iArr, bArr2, i14, i15, paint, canvas);
                                zVar.c();
                                break;
                            } else if (bArr9 == null) {
                                bArr3 = f10261h;
                            } else {
                                bArr3 = bArr9;
                            }
                        } else if (bArr7 == null) {
                            bArr3 = f10262i;
                        } else {
                            bArr3 = bArr7;
                        }
                        bArr2 = bArr3;
                        i14 = i(zVar, iArr, bArr2, i14, i15, paint, canvas);
                        zVar.c();
                    case 17:
                        if (i13 == 3) {
                            if (bArr8 == null) {
                                bArr5 = f10263j;
                            } else {
                                bArr5 = bArr8;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i14 = j(zVar, iArr, bArr4, i14, i15, paint, canvas);
                        zVar.c();
                        break;
                    case 18:
                        i14 = k(zVar, iArr, (byte[]) null, i14, i15, paint, canvas);
                        break;
                    default:
                        switch (h10) {
                            case com.amazon.c.a.a.c.f37660h /*32*/:
                                bArr9 = d(4, 4, zVar);
                                break;
                            case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                                bArr7 = d(4, 8, zVar);
                                break;
                            case 34:
                                bArr8 = d(16, 8, zVar);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i11;
            }
        }
    }

    private static void m(c cVar, C0190a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f10274d;
        } else if (i10 == 2) {
            iArr = aVar.f10273c;
        } else {
            iArr = aVar.f10272b;
        }
        int[] iArr2 = iArr;
        int i13 = i10;
        int i14 = i11;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        l(cVar.f10283c, iArr2, i13, i14, i12, paint2, canvas2);
        l(cVar.f10284d, iArr2, i13, i14, i12 + 1, paint2, canvas2);
    }

    private W2.e n(z zVar) {
        int i10;
        c cVar;
        int i11;
        SparseArray sparseArray;
        Paint paint;
        z zVar2 = zVar;
        while (zVar.b() >= 48 && zVar2.h(8) == 15) {
            t(zVar2, this.f10269f);
        }
        h hVar = this.f10269f;
        d dVar = hVar.f10316i;
        if (dVar == null) {
            return new W2.e(C4770v.E(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f10315h;
        if (bVar == null) {
            bVar = this.f10267d;
        }
        Bitmap bitmap = this.f10270g;
        if (!(bitmap != null && bVar.f10275a + 1 == bitmap.getWidth() && bVar.f10276b + 1 == this.f10270g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f10275a + 1, bVar.f10276b + 1, Bitmap.Config.ARGB_8888);
            this.f10270g = createBitmap;
            this.f10266c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f10288d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f10266c.save();
            e eVar = (e) sparseArray2.valueAt(i12);
            f fVar = (f) this.f10269f.f10310c.get(sparseArray2.keyAt(i12));
            int i13 = eVar.f10289a + bVar.f10277c;
            int i14 = eVar.f10290b + bVar.f10279e;
            this.f10266c.clipRect(i13, i14, Math.min(fVar.f10293c + i13, bVar.f10278d), Math.min(fVar.f10294d + i14, bVar.f10280f));
            C0190a aVar = (C0190a) this.f10269f.f10311d.get(fVar.f10297g);
            if (aVar == null && (aVar = (C0190a) this.f10269f.f10313f.get(fVar.f10297g)) == null) {
                aVar = this.f10268e;
            }
            SparseArray sparseArray3 = fVar.f10301k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g gVar = (g) sparseArray3.valueAt(i15);
                c cVar2 = (c) this.f10269f.f10312e.get(keyAt);
                if (cVar2 == null) {
                    cVar = (c) this.f10269f.f10314g.get(keyAt);
                } else {
                    cVar = cVar2;
                }
                if (cVar != null) {
                    if (cVar.f10282b) {
                        paint = null;
                    } else {
                        paint = this.f10264a;
                    }
                    Paint paint2 = paint;
                    int i16 = i14 + gVar.f10305d;
                    i11 = i15;
                    int i17 = i16;
                    sparseArray = sparseArray3;
                    m(cVar, aVar, fVar.f10296f, gVar.f10304c + i13, i17, paint2, this.f10266c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f10292b) {
                int i18 = fVar.f10296f;
                if (i18 == 3) {
                    i10 = aVar.f10274d[fVar.f10298h];
                } else if (i18 == 2) {
                    i10 = aVar.f10273c[fVar.f10299i];
                } else {
                    i10 = aVar.f10272b[fVar.f10300j];
                }
                this.f10265b.setColor(i10);
                this.f10266c.drawRect((float) i13, (float) i14, (float) (fVar.f10293c + i13), (float) (fVar.f10294d + i14), this.f10265b);
            }
            arrayList.add(new C2030a.b().f(Bitmap.createBitmap(this.f10270g, i13, i14, fVar.f10293c, fVar.f10294d)).k(((float) i13) / ((float) bVar.f10275a)).l(0).h(((float) i14) / ((float) bVar.f10276b), 0).i(0).n(((float) fVar.f10293c) / ((float) bVar.f10275a)).g(((float) fVar.f10294d) / ((float) bVar.f10276b)).a());
            this.f10266c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f10266c.restore();
        }
        return new W2.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0190a o(z zVar, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        z zVar2 = zVar;
        int i16 = 8;
        int h10 = zVar2.h(8);
        zVar2.r(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] e10 = e();
        int[] f10 = f();
        int[] g10 = g();
        while (i18 > 0) {
            int h11 = zVar2.h(i16);
            int h12 = zVar2.h(i16);
            if ((h12 & 128) != 0) {
                iArr = e10;
            } else if ((h12 & 64) != 0) {
                iArr = f10;
            } else {
                iArr = g10;
            }
            if ((h12 & 1) != 0) {
                i14 = zVar2.h(i16);
                i13 = zVar2.h(i16);
                i12 = zVar2.h(i16);
                i11 = zVar2.h(i16);
                i15 = i18 - 6;
            } else {
                i12 = zVar2.h(4) << 4;
                i15 = i18 - 4;
                int h13 = zVar2.h(4) << 4;
                i11 = zVar2.h(i17) << 6;
                i14 = zVar2.h(6) << i17;
                i13 = h13;
            }
            if (i14 == 0) {
                i11 = 255;
                i13 = 0;
                i12 = 0;
            }
            double d10 = (double) i14;
            double d11 = (double) (i13 - 128);
            double d12 = (double) (i12 - 128);
            iArr[h11] = h((byte) (255 - (i11 & 255)), L.o((int) (d10 + (1.402d * d11)), 0, 255), L.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), L.o((int) (d10 + (d12 * 1.772d)), 0, 255));
            i18 = i15;
            h10 = h10;
            i16 = 8;
            i17 = 2;
        }
        return new C0190a(h10, e10, f10, g10);
    }

    private static b p(z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int h10 = zVar.h(16);
        int h11 = zVar.h(16);
        if (g10) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            int h14 = zVar.h(16);
            i10 = zVar.h(16);
            i12 = h13;
            i11 = h14;
            i13 = h12;
        } else {
            i13 = 0;
            i11 = 0;
            i12 = h10;
            i10 = h11;
        }
        return new b(h10, h11, i13, i12, i11, i10);
    }

    private static c q(z zVar) {
        byte[] bArr;
        int h10 = zVar.h(16);
        zVar.r(4);
        int h11 = zVar.h(2);
        boolean g10 = zVar.g();
        zVar.r(1);
        byte[] bArr2 = L.f22077f;
        if (h11 == 1) {
            zVar.r(zVar.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                zVar.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                zVar.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d r(z zVar, int i10) {
        int h10 = zVar.h(8);
        int h11 = zVar.h(4);
        int h12 = zVar.h(2);
        zVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = zVar.h(8);
            zVar.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f s(z zVar, int i10) {
        int i11;
        int i12;
        int i13;
        z zVar2 = zVar;
        int h10 = zVar2.h(8);
        zVar2.r(4);
        boolean g10 = zVar.g();
        zVar2.r(3);
        int i14 = 16;
        int h11 = zVar2.h(16);
        int h12 = zVar2.h(16);
        int h13 = zVar2.h(3);
        int h14 = zVar2.h(3);
        int i15 = 2;
        zVar2.r(2);
        int h15 = zVar2.h(8);
        int h16 = zVar2.h(8);
        int h17 = zVar2.h(4);
        int h18 = zVar2.h(2);
        zVar2.r(2);
        int i16 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i16 > 0) {
            int h19 = zVar2.h(i14);
            int h20 = zVar2.h(i15);
            int h21 = zVar2.h(i15);
            int h22 = zVar2.h(12);
            int i17 = h18;
            zVar2.r(4);
            int h23 = zVar2.h(12);
            int i18 = i16 - 6;
            if (h20 != 1) {
                i13 = 2;
                if (h20 != 2) {
                    i12 = 0;
                    i11 = 0;
                    i16 = i18;
                    sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
                    i15 = i13;
                    h18 = i17;
                    i14 = 16;
                }
            } else {
                i13 = 2;
            }
            i16 -= 8;
            i12 = zVar2.h(8);
            i11 = zVar2.h(8);
            sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
            i15 = i13;
            h18 = i17;
            i14 = 16;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    private static void t(z zVar, h hVar) {
        f fVar;
        int h10 = zVar.h(8);
        int h11 = zVar.h(16);
        int h12 = zVar.h(16);
        int d10 = zVar.d() + h12;
        if (h12 * 8 > zVar.b()) {
            p.h("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f10308a) {
                    d dVar = hVar.f10316i;
                    d r10 = r(zVar, h12);
                    if (r10.f10287c == 0) {
                        if (!(dVar == null || dVar.f10286b == r10.f10286b)) {
                            hVar.f10316i = r10;
                            break;
                        }
                    } else {
                        hVar.f10316i = r10;
                        hVar.f10310c.clear();
                        hVar.f10311d.clear();
                        hVar.f10312e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f10316i;
                if (h11 == hVar.f10308a && dVar2 != null) {
                    f s10 = s(zVar, h12);
                    if (dVar2.f10287c == 0 && (fVar = (f) hVar.f10310c.get(s10.f10291a)) != null) {
                        s10.a(fVar);
                    }
                    hVar.f10310c.put(s10.f10291a, s10);
                    break;
                }
            case 18:
                if (h11 != hVar.f10308a) {
                    if (h11 == hVar.f10309b) {
                        C0190a o10 = o(zVar, h12);
                        hVar.f10313f.put(o10.f10271a, o10);
                        break;
                    }
                } else {
                    C0190a o11 = o(zVar, h12);
                    hVar.f10311d.put(o11.f10271a, o11);
                    break;
                }
                break;
            case 19:
                if (h11 != hVar.f10308a) {
                    if (h11 == hVar.f10309b) {
                        c q10 = q(zVar);
                        hVar.f10314g.put(q10.f10281a, q10);
                        break;
                    }
                } else {
                    c q11 = q(zVar);
                    hVar.f10312e.put(q11.f10281a, q11);
                    break;
                }
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                if (h11 == hVar.f10308a) {
                    hVar.f10315h = p(zVar);
                    break;
                }
                break;
        }
        zVar.s(d10 - zVar.d());
    }

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        z zVar = new z(bArr, i11 + i10);
        zVar.p(i10);
        gVar.accept(n(zVar));
    }

    public int c() {
        return 2;
    }

    public void reset() {
        this.f10269f.a();
    }
}
