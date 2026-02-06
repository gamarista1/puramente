package a4;

import Sg.p;
import X3.g;
import a4.C3117j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import d4.m;
import j4.C3627n;
import j4.C3633t;
import k4.C3661c;
import k4.C3667i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Y implements C3117j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36028c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final S f36029a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f36030b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements C3117j.a {
        private final boolean a(String str) {
            if (str == null || !p.J(str, "video/", false, 2, (Object) null)) {
                return false;
            }
            return true;
        }

        public C3117j create(m mVar, C3627n nVar, g gVar) {
            if (!a(mVar.b())) {
                return null;
            }
            return new Y(mVar.c(), nVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }
    }

    public Y(S s10, C3627n nVar) {
        this.f36029a = s10;
        this.f36030b = nVar;
    }

    private final long a(MediaMetadataRetriever mediaMetadataRetriever) {
        Long o10;
        Long a10 = C3633t.a(this.f36030b.l());
        if (a10 != null) {
            return a10.longValue();
        }
        Double c10 = C3633t.c(this.f36030b.l());
        long j10 = 0;
        if (c10 == null) {
            return 0;
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (!(extractMetadata == null || (o10 = p.o(extractMetadata)) == null)) {
            j10 = o10.longValue();
        }
        return ((long) 1000) * Af.a.e(c10.doubleValue() * ((double) j10));
    }

    private final boolean b(Bitmap bitmap, C3627n nVar) {
        if (Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.HARDWARE || nVar.f() == Bitmap.Config.HARDWARE) {
            return true;
        }
        return false;
    }

    private final boolean c(Bitmap bitmap, C3627n nVar, C3667i iVar) {
        int i10;
        int i11;
        if (nVar.c()) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C3661c d10 = iVar.d();
        if (d10 instanceof C3661c.a) {
            i10 = ((C3661c.a) d10).f45103a;
        } else {
            i10 = bitmap.getWidth();
        }
        C3661c c10 = iVar.c();
        if (c10 instanceof C3661c.a) {
            i11 = ((C3661c.a) c10).f45103a;
        } else {
            i11 = bitmap.getHeight();
        }
        if (C3116i.c(width, height, i10, i11, nVar.n()) == 1.0d) {
            return true;
        }
        return false;
    }

    private final Bitmap d(Bitmap bitmap, C3667i iVar) {
        int i10;
        int i11;
        Bitmap.Config config;
        if (b(bitmap, this.f36030b) && c(bitmap, this.f36030b, iVar)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C3661c d10 = iVar.d();
        if (d10 instanceof C3661c.a) {
            i10 = ((C3661c.a) d10).f45103a;
        } else {
            i10 = bitmap.getWidth();
        }
        C3661c c10 = iVar.c();
        if (c10 instanceof C3661c.a) {
            i11 = ((C3661c.a) c10).f45103a;
        } else {
            i11 = bitmap.getHeight();
        }
        float c11 = (float) C3116i.c(width, height, i10, i11, this.f36030b.n());
        int d11 = Af.a.d(((float) bitmap.getWidth()) * c11);
        int d12 = Af.a.d(((float) bitmap.getHeight()) * c11);
        if (Build.VERSION.SDK_INT < 26 || this.f36030b.f() != Bitmap.Config.HARDWARE) {
            config = this.f36030b.f();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Paint paint = new Paint(3);
        Bitmap createBitmap = Bitmap.createBitmap(d11, d12, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(c11, c11);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        wf.C6763c.a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e(android.media.MediaMetadataRetriever r7, a4.S r8) {
        /*
            r6 = this;
            r8.f()
            a4.S$a r0 = r8.f()
            boolean r1 = r0 instanceof a4.C3108a
            if (r1 == 0) goto L_0x003d
            j4.n r8 = r6.f36030b
            android.content.Context r8 = r8.g()
            android.content.res.AssetManager r8 = r8.getAssets()
            a4.a r0 = (a4.C3108a) r0
            java.lang.String r0 = r0.a()
            android.content.res.AssetFileDescriptor r8 = r8.openFd(r0)
            java.io.FileDescriptor r1 = r8.getFileDescriptor()     // Catch:{ all -> 0x0036 }
            long r2 = r8.getStartOffset()     // Catch:{ all -> 0x0036 }
            long r4 = r8.getLength()     // Catch:{ all -> 0x0036 }
            r0 = r7
            r0.setDataSource(r1, r2, r4)     // Catch:{ all -> 0x0036 }
            lf.M r7 = lf.C6514M.f71813a     // Catch:{ all -> 0x0036 }
            r7 = 0
            wf.C6763c.a(r8, r7)
            goto L_0x008b
        L_0x0036:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            wf.C6763c.a(r8, r7)
            throw r0
        L_0x003d:
            boolean r1 = r0 instanceof a4.C3113f
            if (r1 == 0) goto L_0x0051
            j4.n r8 = r6.f36030b
            android.content.Context r8 = r8.g()
            a4.f r0 = (a4.C3113f) r0
            android.net.Uri r0 = r0.a()
            r7.setDataSource(r8, r0)
            goto L_0x008b
        L_0x0051:
            boolean r1 = r0 instanceof a4.W
            if (r1 == 0) goto L_0x007c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "android.resource://"
            r8.append(r1)
            a4.W r0 = (a4.W) r0
            java.lang.String r1 = r0.b()
            r8.append(r1)
            r1 = 47
            r8.append(r1)
            int r0 = r0.c()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.setDataSource(r8)
            goto L_0x008b
        L_0x007c:
            Gh.M r8 = r8.a()
            java.io.File r8 = r8.s()
            java.lang.String r8 = r8.getPath()
            r7.setDataSource(r8)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.Y.e(android.media.MediaMetadataRetriever, a4.S):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094 A[ADDED_TO_REGION, Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012e A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014a A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018b A[SYNTHETIC, Splitter:B:85:0x018b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object decode(qf.C6658d r20) {
        /*
            r19 = this;
            r1 = r19
            android.media.MediaMetadataRetriever r9 = new android.media.MediaMetadataRetriever
            r9.<init>()
            a4.S r0 = r1.f36029a     // Catch:{ all -> 0x001e }
            r1.e(r9, r0)     // Catch:{ all -> 0x001e }
            j4.n r0 = r1.f36030b     // Catch:{ all -> 0x001e }
            j4.o r0 = r0.l()     // Catch:{ all -> 0x001e }
            java.lang.Integer r0 = j4.C3633t.b(r0)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0021
            int r0 = r0.intValue()     // Catch:{ all -> 0x001e }
        L_0x001c:
            r5 = r0
            goto L_0x0023
        L_0x001e:
            r0 = move-exception
            goto L_0x01ab
        L_0x0021:
            r0 = 2
            goto L_0x001c
        L_0x0023:
            long r11 = r1.a(r9)     // Catch:{ all -> 0x001e }
            r0 = 24
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = Sg.p.m(r0)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x003a
            int r0 = r0.intValue()     // Catch:{ all -> 0x001e }
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r2 = 90
            r3 = 19
            r4 = 18
            if (r0 == r2) goto L_0x006d
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 == r2) goto L_0x006d
            java.lang.String r0 = r9.extractMetadata(r4)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0058
            java.lang.Integer r0 = Sg.p.m(r0)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0058
            int r0 = r0.intValue()     // Catch:{ all -> 0x001e }
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.String r2 = r9.extractMetadata(r3)     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x006a
            java.lang.Integer r2 = Sg.p.m(r2)     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x006a
            int r2 = r2.intValue()     // Catch:{ all -> 0x001e }
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            r14 = r2
            goto L_0x0090
        L_0x006d:
            java.lang.String r0 = r9.extractMetadata(r3)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x007e
            java.lang.Integer r0 = Sg.p.m(r0)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x007e
            int r0 = r0.intValue()     // Catch:{ all -> 0x001e }
            goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            java.lang.String r2 = r9.extractMetadata(r4)     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x006a
            java.lang.Integer r2 = Sg.p.m(r2)     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x006a
            int r2 = r2.intValue()     // Catch:{ all -> 0x001e }
            goto L_0x006b
        L_0x0090:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 <= 0) goto L_0x00f6
            if (r14 <= 0) goto L_0x00f6
            j4.n r2 = r1.f36030b     // Catch:{ all -> 0x001e }
            k4.i r2 = r2.o()     // Catch:{ all -> 0x001e }
            j4.n r3 = r1.f36030b     // Catch:{ all -> 0x001e }
            k4.h r3 = r3.n()     // Catch:{ all -> 0x001e }
            boolean r4 = k4.C3660b.b(r2)     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x00aa
            r2 = r0
            goto L_0x00b2
        L_0x00aa:
            k4.c r2 = r2.d()     // Catch:{ all -> 0x001e }
            int r2 = o4.r.c(r2, r3)     // Catch:{ all -> 0x001e }
        L_0x00b2:
            j4.n r3 = r1.f36030b     // Catch:{ all -> 0x001e }
            k4.i r3 = r3.o()     // Catch:{ all -> 0x001e }
            j4.n r4 = r1.f36030b     // Catch:{ all -> 0x001e }
            k4.h r4 = r4.n()     // Catch:{ all -> 0x001e }
            boolean r6 = k4.C3660b.b(r3)     // Catch:{ all -> 0x001e }
            if (r6 == 0) goto L_0x00c6
            r3 = r14
            goto L_0x00ce
        L_0x00c6:
            k4.c r3 = r3.c()     // Catch:{ all -> 0x001e }
            int r3 = o4.r.c(r3, r4)     // Catch:{ all -> 0x001e }
        L_0x00ce:
            j4.n r4 = r1.f36030b     // Catch:{ all -> 0x001e }
            k4.h r4 = r4.n()     // Catch:{ all -> 0x001e }
            double r2 = a4.C3116i.c(r0, r14, r2, r3, r4)     // Catch:{ all -> 0x001e }
            j4.n r4 = r1.f36030b     // Catch:{ all -> 0x001e }
            boolean r4 = r4.c()     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x00e4
            double r2 = Ef.m.f(r2, r7)     // Catch:{ all -> 0x001e }
        L_0x00e4:
            double r7 = (double) r0     // Catch:{ all -> 0x001e }
            double r7 = r7 * r2
            int r4 = Af.a.c(r7)     // Catch:{ all -> 0x001e }
            double r6 = (double) r14     // Catch:{ all -> 0x001e }
            double r2 = r2 * r6
            int r2 = Af.a.c(r2)     // Catch:{ all -> 0x001e }
            k4.i r2 = k4.C3660b.a(r4, r2)     // Catch:{ all -> 0x001e }
        L_0x00f4:
            r8 = r2
            goto L_0x00f9
        L_0x00f6:
            k4.i r2 = k4.C3667i.f45119d     // Catch:{ all -> 0x001e }
            goto L_0x00f4
        L_0x00f9:
            k4.c r2 = r8.a()     // Catch:{ all -> 0x001e }
            k4.c r3 = r8.b()     // Catch:{ all -> 0x001e }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001e }
            r4 = 27
            if (r7 < r4) goto L_0x012e
            boolean r4 = r2 instanceof k4.C3661c.a     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x012e
            boolean r4 = r3 instanceof k4.C3661c.a     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x012e
            k4.c$a r2 = (k4.C3661c.a) r2     // Catch:{ all -> 0x001e }
            int r6 = r2.f45103a     // Catch:{ all -> 0x001e }
            k4.c$a r3 = (k4.C3661c.a) r3     // Catch:{ all -> 0x001e }
            int r3 = r3.f45103a     // Catch:{ all -> 0x001e }
            j4.n r2 = r1.f36030b     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap$Config r17 = r2.f()     // Catch:{ all -> 0x001e }
            r2 = r9
            r18 = r3
            r3 = r11
            r13 = r7
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7 = r18
            r10 = r8
            r8 = r17
            android.graphics.Bitmap r2 = o4.r.b(r2, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x001e }
            goto L_0x0148
        L_0x012e:
            r13 = r7
            r10 = r8
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            j4.n r2 = r1.f36030b     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap$Config r2 = r2.f()     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap r2 = o4.r.a(r9, r11, r5, r2)     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x0147
            int r0 = r2.getWidth()     // Catch:{ all -> 0x001e }
            int r14 = r2.getHeight()     // Catch:{ all -> 0x001e }
            goto L_0x0148
        L_0x0147:
            r2 = 0
        L_0x0148:
            if (r2 == 0) goto L_0x018b
            android.graphics.Bitmap r2 = r1.d(r2, r10)     // Catch:{ all -> 0x001e }
            r3 = 1
            if (r0 <= 0) goto L_0x016b
            if (r14 <= 0) goto L_0x016b
            int r4 = r2.getWidth()     // Catch:{ all -> 0x001e }
            int r5 = r2.getHeight()     // Catch:{ all -> 0x001e }
            j4.n r6 = r1.f36030b     // Catch:{ all -> 0x001e }
            k4.h r6 = r6.n()     // Catch:{ all -> 0x001e }
            double r4 = a4.C3116i.c(r0, r14, r4, r5, r6)     // Catch:{ all -> 0x001e }
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            a4.h r0 = new a4.h     // Catch:{ all -> 0x001e }
            j4.n r4 = r1.f36030b     // Catch:{ all -> 0x001e }
            android.content.Context r4 = r4.g()     // Catch:{ all -> 0x001e }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x001e }
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x001e }
            r5.<init>(r4, r2)     // Catch:{ all -> 0x001e }
            r0.<init>(r5, r3)     // Catch:{ all -> 0x001e }
            r2 = 29
            if (r13 < r2) goto L_0x0187
            r9.release()
            goto L_0x018a
        L_0x0187:
            r9.release()
        L_0x018a:
            return r0
        L_0x018b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            java.lang.String r2 = "Failed to decode frame at "
            r0.append(r2)     // Catch:{ all -> 0x001e }
            r0.append(r11)     // Catch:{ all -> 0x001e }
            java.lang.String r2 = " microseconds."
            r0.append(r2)     // Catch:{ all -> 0x001e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x001e }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x001e }
            r2.<init>(r0)     // Catch:{ all -> 0x001e }
            throw r2     // Catch:{ all -> 0x001e }
        L_0x01ab:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x01b5
            r9.release()
            goto L_0x01b8
        L_0x01b5:
            r9.release()
        L_0x01b8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.Y.decode(qf.d):java.lang.Object");
    }
}
