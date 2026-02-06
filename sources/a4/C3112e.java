package a4;

import Gh.C5404e;
import Gh.C5414o;
import Gh.W;
import X3.g;
import a4.C3117j;
import a4.S;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.google.android.gms.common.api.a;
import com.reactnativecommunity.clipboard.ClipboardModule;
import d4.m;
import dh.f;
import j4.C3627n;
import k4.C3660b;
import k4.C3666h;
import k4.C3667i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o4.C3878a;
import o4.l;
import qf.C6658d;

/* renamed from: a4.e  reason: case insensitive filesystem */
public final class C3112e implements C3117j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36033e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final S f36034a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f36035b;

    /* renamed from: c  reason: collision with root package name */
    private final dh.d f36036c;

    /* renamed from: d  reason: collision with root package name */
    private final C3120m f36037d;

    /* renamed from: a4.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: a4.e$b */
    private static final class b extends C5414o {

        /* renamed from: b  reason: collision with root package name */
        private Exception f36038b;

        public b(W w10) {
            super(w10);
        }

        public final Exception b() {
            return this.f36038b;
        }

        public long y1(C5404e eVar, long j10) {
            try {
                return super.y1(eVar, j10);
            } catch (Exception e10) {
                this.f36038b = e10;
                throw e10;
            }
        }
    }

    /* renamed from: a4.e$c */
    public static final class c implements C3117j.a {

        /* renamed from: a  reason: collision with root package name */
        private final C3120m f36039a;

        /* renamed from: b  reason: collision with root package name */
        private final dh.d f36040b;

        public c(int i10, C3120m mVar) {
            this.f36039a = mVar;
            this.f36040b = f.b(i10, 0, 2, (Object) null);
        }

        public C3117j create(m mVar, C3627n nVar, g gVar) {
            return new C3112e(mVar.c(), nVar, this.f36040b, this.f36039a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    /* renamed from: a4.e$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f36041a;

        /* renamed from: b  reason: collision with root package name */
        Object f36042b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f36043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C3112e f36044d;

        /* renamed from: e  reason: collision with root package name */
        int f36045e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C3112e eVar, C6658d dVar) {
            super(dVar);
            this.f36044d = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36043c = obj;
            this.f36045e |= Integer.MIN_VALUE;
            return this.f36044d.decode(this);
        }
    }

    public C3112e(S s10, C3627n nVar, dh.d dVar, C3120m mVar) {
        this.f36034a = s10;
        this.f36035b = nVar;
        this.f36036c = dVar;
        this.f36037d = mVar;
    }

    private final void b(BitmapFactory.Options options, C3118k kVar) {
        Bitmap.Config f10 = this.f36035b.f();
        if (kVar.b() || C3122o.a(kVar)) {
            f10 = C3878a.e(f10);
        }
        if (this.f36035b.d() && f10 == Bitmap.Config.ARGB_8888 && C6496s.c(options.outMimeType, ClipboardModule.MIMETYPE_JPEG)) {
            f10 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && f10 != Bitmap.Config.HARDWARE) {
            f10 = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = f10;
    }

    private final void c(BitmapFactory.Options options, C3118k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        BitmapFactory.Options options2 = options;
        S.a f10 = this.f36034a.f();
        boolean z10 = true;
        if ((f10 instanceof W) && C3660b.b(this.f36035b.o())) {
            options2.inSampleSize = 1;
            options2.inScaled = true;
            options2.inDensity = ((W) f10).a();
            options2.inTargetDensity = this.f36035b.g().getResources().getDisplayMetrics().densityDpi;
        } else if (options2.outWidth <= 0 || options2.outHeight <= 0) {
            options2.inSampleSize = 1;
            options2.inScaled = false;
        } else {
            if (C3122o.b(kVar)) {
                i10 = options2.outHeight;
            } else {
                i10 = options2.outWidth;
            }
            if (C3122o.b(kVar)) {
                i11 = options2.outWidth;
            } else {
                i11 = options2.outHeight;
            }
            C3667i o10 = this.f36035b.o();
            C3666h n10 = this.f36035b.n();
            if (C3660b.b(o10)) {
                i12 = i10;
            } else {
                i12 = l.A(o10.d(), n10);
            }
            C3667i o11 = this.f36035b.o();
            C3666h n11 = this.f36035b.n();
            if (C3660b.b(o11)) {
                i13 = i11;
            } else {
                i13 = l.A(o11.c(), n11);
            }
            int a10 = C3116i.a(i10, i11, i12, i13, this.f36035b.n());
            options2.inSampleSize = a10;
            double b10 = C3116i.b(((double) i10) / ((double) a10), ((double) i11) / ((double) a10), (double) i12, (double) i13, this.f36035b.n());
            if (this.f36035b.c()) {
                b10 = Ef.m.f(b10, 1.0d);
            }
            if (b10 != 1.0d) {
                z10 = false;
            }
            options2.inScaled = !z10;
            if (z10) {
                return;
            }
            if (b10 > 1.0d) {
                options2.inDensity = Af.a.c(((double) a.e.API_PRIORITY_OTHER) / b10);
                options2.inTargetDensity = a.e.API_PRIORITY_OTHER;
                return;
            }
            options2.inDensity = a.e.API_PRIORITY_OTHER;
            options2.inTargetDensity = Af.a.c(((double) a.e.API_PRIORITY_OTHER) * b10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        wf.C6763c.a(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final a4.C3115h d(android.graphics.BitmapFactory.Options r10) {
        /*
            r9 = this;
            a4.e$b r0 = new a4.e$b
            a4.S r1 = r9.f36034a
            Gh.g r1 = r1.n()
            r0.<init>(r1)
            Gh.g r1 = Gh.H.d(r0)
            r2 = 1
            r10.inJustDecodeBounds = r2
            Gh.g r3 = r1.peek()
            java.io.InputStream r3 = r3.x1()
            r4 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r4, r10)
            java.lang.Exception r3 = r0.b()
            if (r3 != 0) goto L_0x00b8
            r3 = 0
            r10.inJustDecodeBounds = r3
            a4.n r5 = a4.C3121n.f36068a
            java.lang.String r6 = r10.outMimeType
            a4.m r7 = r9.f36037d
            a4.k r6 = r5.a(r6, r1, r7)
            java.lang.Exception r7 = r0.b()
            if (r7 != 0) goto L_0x00b7
            r10.inMutable = r3
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L_0x0050
            j4.n r7 = r9.f36035b
            android.graphics.ColorSpace r7 = r7.e()
            if (r7 == 0) goto L_0x0050
            j4.n r7 = r9.f36035b
            android.graphics.ColorSpace r7 = r7.e()
            r10.inPreferredColorSpace = r7
        L_0x0050:
            j4.n r7 = r9.f36035b
            boolean r7 = r7.m()
            r10.inPremultiplied = r7
            r9.b(r10, r6)
            r9.c(r10, r6)
            java.io.InputStream r7 = r1.x1()     // Catch:{ all -> 0x00b0 }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r4, r10)     // Catch:{ all -> 0x00b0 }
            wf.C6763c.a(r1, r4)
            java.lang.Exception r0 = r0.b()
            if (r0 != 0) goto L_0x00af
            if (r7 == 0) goto L_0x00a7
            j4.n r0 = r9.f36035b
            android.content.Context r0 = r0.g()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r7.setDensity(r0)
            android.graphics.Bitmap r0 = r5.b(r7, r6)
            a4.h r1 = new a4.h
            j4.n r4 = r9.f36035b
            android.content.Context r4 = r4.g()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r0)
            int r0 = r10.inSampleSize
            if (r0 > r2) goto L_0x00a3
            boolean r10 = r10.inScaled
            if (r10 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r2 = r3
        L_0x00a3:
            r1.<init>(r5, r2)
            return r1
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            r10.<init>(r0)
            throw r10
        L_0x00af:
            throw r0
        L_0x00b0:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            wf.C6763c.a(r1, r10)
            throw r0
        L_0x00b7:
            throw r7
        L_0x00b8:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C3112e.d(android.graphics.BitmapFactory$Options):a4.h");
    }

    /* access modifiers changed from: private */
    public static final C3115h e(C3112e eVar) {
        return eVar.d(new BitmapFactory.Options());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object decode(qf.C6658d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a4.C3112e.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a4.e$d r0 = (a4.C3112e.d) r0
            int r1 = r0.f36045e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36045e = r1
            goto L_0x0018
        L_0x0013:
            a4.e$d r0 = new a4.e$d
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f36043c
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f36045e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.f36041a
            dh.d r0 = (dh.d) r0
            lf.w.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0070
        L_0x0030:
            r8 = move-exception
            goto L_0x007a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.f36042b
            dh.d r2 = (dh.d) r2
            java.lang.Object r5 = r0.f36041a
            a4.e r5 = (a4.C3112e) r5
            lf.w.b(r8)
            r8 = r2
            goto L_0x005a
        L_0x0047:
            lf.w.b(r8)
            dh.d r8 = r7.f36036c
            r0.f36041a = r7
            r0.f36042b = r8
            r0.f36045e = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r7
        L_0x005a:
            a4.d r2 = new a4.d     // Catch:{ all -> 0x0076 }
            r2.<init>(r5)     // Catch:{ all -> 0x0076 }
            r0.f36041a = r8     // Catch:{ all -> 0x0076 }
            r5 = 0
            r0.f36042b = r5     // Catch:{ all -> 0x0076 }
            r0.f36045e = r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = Ug.C5594t0.c(r5, r2, r0, r4, r5)     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0070:
            a4.h r8 = (a4.C3115h) r8     // Catch:{ all -> 0x0030 }
            r0.release()
            return r8
        L_0x0076:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x007a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C3112e.decode(qf.d):java.lang.Object");
    }
}
