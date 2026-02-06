package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.W;
import i.C2037a;
import i.C2039c;
import i.C2040d;
import i.C2041e;
import j.C2115a;
import p1.C2387c;

/* renamed from: androidx.appcompat.widget.k  reason: case insensitive filesystem */
public final class C1572k {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f11924b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static C1572k f11925c;

    /* renamed from: a  reason: collision with root package name */
    private W f11926a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class a implements W.c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f11927a = {C2041e.f21323R, C2041e.f21321P, C2041e.f21325a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f11928b = {C2041e.f21339o, C2041e.f21307B, C2041e.f21344t, C2041e.f21340p, C2041e.f21341q, C2041e.f21343s, C2041e.f21342r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f11929c = {C2041e.f21320O, C2041e.f21322Q, C2041e.f21335k, C2041e.f21316K, C2041e.f21317L, C2041e.f21318M, C2041e.f21319N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f11930d = {C2041e.f21347w, C2041e.f21333i, C2041e.f21346v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f11931e = {C2041e.f21315J, C2041e.f21324S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f11932f = {C2041e.f21327c, C2041e.f21331g, C2041e.f21328d, C2041e.f21332h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = c0.c(context, C2037a.f21277t);
            int b10 = c0.b(context, C2037a.f21275r);
            return new ColorStateList(new int[][]{c0.f11867b, c0.f11870e, c0.f11868c, c0.f11874i}, new int[]{b10, C2387c.k(c10, i10), C2387c.k(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, c0.c(context, C2037a.f21274q));
        }

        private ColorStateList j(Context context) {
            return h(context, c0.c(context, C2037a.f21275r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e10 = c0.e(context, C2037a.f21279v);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = c0.f11867b;
                iArr2[0] = c0.b(context, C2037a.f21279v);
                iArr[1] = c0.f11871f;
                iArr2[1] = c0.c(context, C2037a.f21276s);
                iArr[2] = c0.f11874i;
                iArr2[2] = c0.c(context, C2037a.f21279v);
            } else {
                int[] iArr3 = c0.f11867b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = c0.f11871f;
                iArr2[1] = c0.c(context, C2037a.f21276s);
                iArr[2] = c0.f11874i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(W w10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable i11 = w10.i(context, C2041e.f21311F);
            Drawable i12 = w10.i(context, C2041e.f21312G);
            if ((i11 instanceof BitmapDrawable) && i11.getIntrinsicWidth() == dimensionPixelSize && i11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) i11;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i11.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((i12 instanceof BitmapDrawable) && i12.getIntrinsicWidth() == dimensionPixelSize && i12.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i12;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i12.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i12.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C1572k.f11924b;
            }
            mutate.setColorFilter(C1572k.e(i10, mode));
        }

        public Drawable a(W w10, Context context, int i10) {
            if (i10 == C2041e.f21334j) {
                return new LayerDrawable(new Drawable[]{w10.i(context, C2041e.f21333i), w10.i(context, C2041e.f21335k)});
            }
            if (i10 == C2041e.f21349y) {
                return l(w10, context, C2040d.f21299g);
            }
            if (i10 == C2041e.f21348x) {
                return l(w10, context, C2040d.f21300h);
            }
            if (i10 == C2041e.f21350z) {
                return l(w10, context, C2040d.f21301i);
            }
            return null;
        }

        public ColorStateList b(Context context, int i10) {
            if (i10 == C2041e.f21337m) {
                return C2115a.a(context, C2039c.f21289e);
            }
            if (i10 == C2041e.f21314I) {
                return C2115a.a(context, C2039c.f21292h);
            }
            if (i10 == C2041e.f21313H) {
                return k(context);
            }
            if (i10 == C2041e.f21330f) {
                return j(context);
            }
            if (i10 == C2041e.f21326b) {
                return g(context);
            }
            if (i10 == C2041e.f21329e) {
                return i(context);
            }
            if (i10 == C2041e.f21309D || i10 == C2041e.f21310E) {
                return C2115a.a(context, C2039c.f21291g);
            }
            if (f(this.f11928b, i10)) {
                return c0.e(context, C2037a.f21278u);
            }
            if (f(this.f11931e, i10)) {
                return C2115a.a(context, C2039c.f21288d);
            }
            if (f(this.f11932f, i10)) {
                return C2115a.a(context, C2039c.f21287c);
            }
            if (i10 == C2041e.f21306A) {
                return C2115a.a(context, C2039c.f21290f);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C1572k.f11924b
                int[] r1 = r7.f11927a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = i.C2037a.f21278u
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f11929c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = i.C2037a.f21276s
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f11930d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = i.C2041e.f21345u
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = i.C2041e.f21336l
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x0066
                android.graphics.drawable.Drawable r10 = r10.mutate()
                int r8 = androidx.appcompat.widget.c0.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C1572k.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x0065
                r10.setAlpha(r0)
            L_0x0065:
                return r2
            L_0x0066:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1572k.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode d(int i10) {
            if (i10 == C2041e.f21313H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == C2041e.f21308C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(16908288), c0.c(context, C2037a.f21278u), C1572k.f11924b);
                m(layerDrawable.findDrawableByLayerId(16908303), c0.c(context, C2037a.f21278u), C1572k.f11924b);
                m(layerDrawable.findDrawableByLayerId(16908301), c0.c(context, C2037a.f21276s), C1572k.f11924b);
                return true;
            } else if (i10 != C2041e.f21349y && i10 != C2041e.f21348x && i10 != C2041e.f21350z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), c0.b(context, C2037a.f21278u), C1572k.f11924b);
                m(layerDrawable2.findDrawableByLayerId(16908303), c0.c(context, C2037a.f21276s), C1572k.f11924b);
                m(layerDrawable2.findDrawableByLayerId(16908301), c0.c(context, C2037a.f21276s), C1572k.f11924b);
                return true;
            }
        }
    }

    public static synchronized C1572k b() {
        C1572k kVar;
        synchronized (C1572k.class) {
            try {
                if (f11925c == null) {
                    h();
                }
                kVar = f11925c;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter k10;
        synchronized (C1572k.class) {
            k10 = W.k(i10, mode);
        }
        return k10;
    }

    public static synchronized void h() {
        synchronized (C1572k.class) {
            if (f11925c == null) {
                C1572k kVar = new C1572k();
                f11925c = kVar;
                kVar.f11926a = W.g();
                f11925c.f11926a.t(new a());
            }
        }
    }

    static void i(Drawable drawable, e0 e0Var, int[] iArr) {
        W.v(drawable, e0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f11926a.i(context, i10);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f11926a.j(context, i10, z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f11926a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f11926a.r(context);
    }
}
