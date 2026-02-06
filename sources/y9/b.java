package Y9;

import W9.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import ja.A;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f35785h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f35786i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f35787j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f35788a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f35789b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f35790c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    private final C0582b f35791d = new C0582b(719, 575, 0, 719, 0, 575);

    /* renamed from: e  reason: collision with root package name */
    private final a f35792e = new a(0, c(), d(), e());

    /* renamed from: f  reason: collision with root package name */
    private final h f35793f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f35794g;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f35795a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f35796b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f35797c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f35798d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f35795a = i10;
            this.f35796b = iArr;
            this.f35797c = iArr2;
            this.f35798d = iArr3;
        }
    }

    /* renamed from: Y9.b$b  reason: collision with other inner class name */
    private static final class C0582b {

        /* renamed from: a  reason: collision with root package name */
        public final int f35799a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35800b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35801c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35802d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35803e;

        /* renamed from: f  reason: collision with root package name */
        public final int f35804f;

        public C0582b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f35799a = i10;
            this.f35800b = i11;
            this.f35801c = i12;
            this.f35802d = i13;
            this.f35803e = i14;
            this.f35804f = i15;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f35805a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35806b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f35807c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f35808d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f35805a = i10;
            this.f35806b = z10;
            this.f35807c = bArr;
            this.f35808d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f35809a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35810b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35811c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray f35812d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f35809a = i10;
            this.f35810b = i11;
            this.f35811c = i12;
            this.f35812d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f35813a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35814b;

        public e(int i10, int i11) {
            this.f35813a = i10;
            this.f35814b = i11;
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f35815a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35816b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35817c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35818d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35819e;

        /* renamed from: f  reason: collision with root package name */
        public final int f35820f;

        /* renamed from: g  reason: collision with root package name */
        public final int f35821g;

        /* renamed from: h  reason: collision with root package name */
        public final int f35822h;

        /* renamed from: i  reason: collision with root package name */
        public final int f35823i;

        /* renamed from: j  reason: collision with root package name */
        public final int f35824j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray f35825k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f35815a = i10;
            this.f35816b = z10;
            this.f35817c = i11;
            this.f35818d = i12;
            this.f35819e = i13;
            this.f35820f = i14;
            this.f35821g = i15;
            this.f35822h = i16;
            this.f35823i = i17;
            this.f35824j = i18;
            this.f35825k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f35825k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f35825k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f35826a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35827b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35828c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35829d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35830e;

        /* renamed from: f  reason: collision with root package name */
        public final int f35831f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f35826a = i10;
            this.f35827b = i11;
            this.f35828c = i12;
            this.f35829d = i13;
            this.f35830e = i14;
            this.f35831f = i15;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f35832a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35833b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray f35834c = new SparseArray();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray f35835d = new SparseArray();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray f35836e = new SparseArray();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray f35837f = new SparseArray();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray f35838g = new SparseArray();

        /* renamed from: h  reason: collision with root package name */
        public C0582b f35839h;

        /* renamed from: i  reason: collision with root package name */
        public d f35840i;

        public h(int i10, int i11) {
            this.f35832a = i10;
            this.f35833b = i11;
        }

        public void a() {
            this.f35834c.clear();
            this.f35835d.clear();
            this.f35836e.clear();
            this.f35837f.clear();
            this.f35838g.clear();
            this.f35839h = null;
            this.f35840i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f35788a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f35789b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f35793f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, A a10) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) a10.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
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
                iArr[i15] = f(255, i12, i13, i14);
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
                iArr[i15] = f(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    private static int[] e() {
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
                iArr[i28] = f(63, i26, i27, i29);
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
                    iArr[i28] = f(255, i33, i34, i32 + i31);
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
                        iArr[i28] = f(255, i37, i39, i40 + i32);
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
                        iArr[i28] = f(255, i41, i42, i35 + i32);
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
                    iArr[i28] = f(127, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(ja.A r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: Y9.b.g(ja.A, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(ja.A r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: Y9.b.h(ja.A, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int i(ja.A r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: Y9.b.i(ja.A, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i13 = i10;
        byte[] bArr6 = bArr;
        A a10 = new A(bArr);
        int i14 = i11;
        int i15 = i12;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        byte[] bArr9 = null;
        while (a10.b() != 0) {
            int h10 = a10.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i13 != 3) {
                            if (i13 != 2) {
                                bArr2 = null;
                                i14 = g(a10, iArr, bArr2, i14, i15, paint, canvas);
                                a10.c();
                                break;
                            } else if (bArr9 == null) {
                                bArr3 = f35785h;
                            } else {
                                bArr3 = bArr9;
                            }
                        } else if (bArr7 == null) {
                            bArr3 = f35786i;
                        } else {
                            bArr3 = bArr7;
                        }
                        bArr2 = bArr3;
                        i14 = g(a10, iArr, bArr2, i14, i15, paint, canvas);
                        a10.c();
                    case 17:
                        if (i13 == 3) {
                            if (bArr8 == null) {
                                bArr5 = f35787j;
                            } else {
                                bArr5 = bArr8;
                            }
                            bArr4 = bArr5;
                        } else {
                            bArr4 = null;
                        }
                        i14 = h(a10, iArr, bArr4, i14, i15, paint, canvas);
                        a10.c();
                        break;
                    case 18:
                        i14 = i(a10, iArr, (byte[]) null, i14, i15, paint, canvas);
                        break;
                    default:
                        switch (h10) {
                            case com.amazon.c.a.a.c.f37660h /*32*/:
                                bArr9 = a(4, 4, a10);
                                break;
                            case CharsToNameCanonicalizer.HASH_MULT /*33*/:
                                bArr7 = a(4, 8, a10);
                                break;
                            case 34:
                                bArr8 = a(16, 8, a10);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f35798d;
        } else if (i10 == 2) {
            iArr = aVar.f35797c;
        } else {
            iArr = aVar.f35796b;
        }
        int[] iArr2 = iArr;
        int i13 = i10;
        int i14 = i11;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        j(cVar.f35807c, iArr2, i13, i14, i12, paint2, canvas2);
        j(cVar.f35808d, iArr2, i13, i14, i12 + 1, paint2, canvas2);
    }

    private static a l(A a10, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        A a11 = a10;
        int i16 = 8;
        int h10 = a11.h(8);
        a11.r(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i18 > 0) {
            int h11 = a11.h(i16);
            int h12 = a11.h(i16);
            if ((h12 & 128) != 0) {
                iArr = c10;
            } else if ((h12 & 64) != 0) {
                iArr = d10;
            } else {
                iArr = e10;
            }
            if ((h12 & 1) != 0) {
                i14 = a11.h(i16);
                i13 = a11.h(i16);
                i12 = a11.h(i16);
                i11 = a11.h(i16);
                i15 = i18 - 6;
            } else {
                i12 = a11.h(4) << 4;
                i15 = i18 - 4;
                int h13 = a11.h(4) << 4;
                i11 = a11.h(i17) << 6;
                i14 = a11.h(6) << i17;
                i13 = h13;
            }
            if (i14 == 0) {
                i11 = 255;
                i13 = 0;
                i12 = 0;
            }
            double d11 = (double) i14;
            double d12 = (double) (i13 - 128);
            double d13 = (double) (i12 - 128);
            iArr[h11] = f((byte) (255 - (i11 & 255)), M.q((int) (d11 + (1.402d * d12)), 0, 255), M.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), M.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i18 = i15;
            h10 = h10;
            i16 = 8;
            i17 = 2;
        }
        return new a(h10, c10, d10, e10);
    }

    private static C0582b m(A a10) {
        int i10;
        int i11;
        int i12;
        int i13;
        a10.r(4);
        boolean g10 = a10.g();
        a10.r(3);
        int h10 = a10.h(16);
        int h11 = a10.h(16);
        if (g10) {
            int h12 = a10.h(16);
            int h13 = a10.h(16);
            int h14 = a10.h(16);
            i10 = a10.h(16);
            i12 = h13;
            i11 = h14;
            i13 = h12;
        } else {
            i13 = 0;
            i11 = 0;
            i12 = h10;
            i10 = h11;
        }
        return new C0582b(h10, h11, i13, i12, i11, i10);
    }

    private static c n(A a10) {
        byte[] bArr;
        int h10 = a10.h(16);
        a10.r(4);
        int h11 = a10.h(2);
        boolean g10 = a10.g();
        a10.r(1);
        byte[] bArr2 = M.f44986f;
        if (h11 == 1) {
            a10.r(a10.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = a10.h(16);
            int h13 = a10.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                a10.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                a10.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(A a10, int i10) {
        int h10 = a10.h(8);
        int h11 = a10.h(4);
        int h12 = a10.h(2);
        a10.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = a10.h(8);
            a10.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(a10.h(16), a10.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(A a10, int i10) {
        int i11;
        int i12;
        int i13;
        A a11 = a10;
        int h10 = a11.h(8);
        a11.r(4);
        boolean g10 = a10.g();
        a11.r(3);
        int i14 = 16;
        int h11 = a11.h(16);
        int h12 = a11.h(16);
        int h13 = a11.h(3);
        int h14 = a11.h(3);
        int i15 = 2;
        a11.r(2);
        int h15 = a11.h(8);
        int h16 = a11.h(8);
        int h17 = a11.h(4);
        int h18 = a11.h(2);
        a11.r(2);
        int i16 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i16 > 0) {
            int h19 = a11.h(i14);
            int h20 = a11.h(i15);
            int h21 = a11.h(i15);
            int h22 = a11.h(12);
            int i17 = h18;
            a11.r(4);
            int h23 = a11.h(12);
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
            i12 = a11.h(8);
            i11 = a11.h(8);
            sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
            i15 = i13;
            h18 = i17;
            i14 = 16;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    private static void q(A a10, h hVar) {
        f fVar;
        int h10 = a10.h(8);
        int h11 = a10.h(16);
        int h12 = a10.h(16);
        int d10 = a10.d() + h12;
        if (h12 * 8 > a10.b()) {
            s.i("DvbParser", "Data field length exceeds limit");
            a10.r(a10.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f35832a) {
                    d dVar = hVar.f35840i;
                    d o10 = o(a10, h12);
                    if (o10.f35811c == 0) {
                        if (!(dVar == null || dVar.f35810b == o10.f35810b)) {
                            hVar.f35840i = o10;
                            break;
                        }
                    } else {
                        hVar.f35840i = o10;
                        hVar.f35834c.clear();
                        hVar.f35835d.clear();
                        hVar.f35836e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f35840i;
                if (h11 == hVar.f35832a && dVar2 != null) {
                    f p10 = p(a10, h12);
                    if (dVar2.f35811c == 0 && (fVar = (f) hVar.f35834c.get(p10.f35815a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f35834c.put(p10.f35815a, p10);
                    break;
                }
            case 18:
                if (h11 != hVar.f35832a) {
                    if (h11 == hVar.f35833b) {
                        a l10 = l(a10, h12);
                        hVar.f35837f.put(l10.f35795a, l10);
                        break;
                    }
                } else {
                    a l11 = l(a10, h12);
                    hVar.f35835d.put(l11.f35795a, l11);
                    break;
                }
                break;
            case 19:
                if (h11 != hVar.f35832a) {
                    if (h11 == hVar.f35833b) {
                        c n10 = n(a10);
                        hVar.f35838g.put(n10.f35805a, n10);
                        break;
                    }
                } else {
                    c n11 = n(a10);
                    hVar.f35836e.put(n11.f35805a, n11);
                    break;
                }
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                if (h11 == hVar.f35832a) {
                    hVar.f35839h = m(a10);
                    break;
                }
                break;
        }
        a10.s(d10 - a10.d());
    }

    public List b(byte[] bArr, int i10) {
        int i11;
        c cVar;
        int i12;
        SparseArray sparseArray;
        Paint paint;
        A a10 = new A(bArr, i10);
        while (a10.b() >= 48 && a10.h(8) == 15) {
            q(a10, this.f35793f);
        }
        h hVar = this.f35793f;
        d dVar = hVar.f35840i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0582b bVar = hVar.f35839h;
        if (bVar == null) {
            bVar = this.f35791d;
        }
        Bitmap bitmap = this.f35794g;
        if (!(bitmap != null && bVar.f35799a + 1 == bitmap.getWidth() && bVar.f35800b + 1 == this.f35794g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f35799a + 1, bVar.f35800b + 1, Bitmap.Config.ARGB_8888);
            this.f35794g = createBitmap;
            this.f35790c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f35812d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f35790c.save();
            e eVar = (e) sparseArray2.valueAt(i13);
            f fVar = (f) this.f35793f.f35834c.get(sparseArray2.keyAt(i13));
            int i14 = eVar.f35813a + bVar.f35801c;
            int i15 = eVar.f35814b + bVar.f35803e;
            this.f35790c.clipRect(i14, i15, Math.min(fVar.f35817c + i14, bVar.f35802d), Math.min(fVar.f35818d + i15, bVar.f35804f));
            a aVar = (a) this.f35793f.f35835d.get(fVar.f35821g);
            if (aVar == null && (aVar = (a) this.f35793f.f35837f.get(fVar.f35821g)) == null) {
                aVar = this.f35792e;
            }
            SparseArray sparseArray3 = fVar.f35825k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g gVar = (g) sparseArray3.valueAt(i16);
                c cVar2 = (c) this.f35793f.f35836e.get(keyAt);
                if (cVar2 == null) {
                    cVar = (c) this.f35793f.f35838g.get(keyAt);
                } else {
                    cVar = cVar2;
                }
                if (cVar != null) {
                    if (cVar.f35806b) {
                        paint = null;
                    } else {
                        paint = this.f35788a;
                    }
                    Paint paint2 = paint;
                    int i17 = i15 + gVar.f35829d;
                    i12 = i16;
                    int i18 = i17;
                    sparseArray = sparseArray3;
                    k(cVar, aVar, fVar.f35820f, gVar.f35828c + i14, i18, paint2, this.f35790c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f35816b) {
                int i19 = fVar.f35820f;
                if (i19 == 3) {
                    i11 = aVar.f35798d[fVar.f35822h];
                } else if (i19 == 2) {
                    i11 = aVar.f35797c[fVar.f35823i];
                } else {
                    i11 = aVar.f35796b[fVar.f35824j];
                }
                this.f35789b.setColor(i11);
                this.f35790c.drawRect((float) i14, (float) i15, (float) (fVar.f35817c + i14), (float) (fVar.f35818d + i15), this.f35789b);
            }
            arrayList.add(new b.C0565b().f(Bitmap.createBitmap(this.f35794g, i14, i15, fVar.f35817c, fVar.f35818d)).k(((float) i14) / ((float) bVar.f35799a)).l(0).h(((float) i15) / ((float) bVar.f35800b), 0).i(0).n(((float) fVar.f35817c) / ((float) bVar.f35799a)).g(((float) fVar.f35818d) / ((float) bVar.f35800b)).a());
            this.f35790c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f35790c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f35793f.a();
    }
}
