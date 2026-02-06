package com.bumptech.glide;

import W4.b;
import W4.d;
import android.content.Context;
import j5.C3637a;
import j5.C3638b;
import java.util.Iterator;
import java.util.List;
import o5.f;

abstract class k {

    class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f39102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f39103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f39104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C3637a f39105d;

        a(c cVar, List list, C3637a aVar) {
            this.f39103b = cVar;
            this.f39104c = list;
            this.f39105d = aVar;
        }

        /* renamed from: a */
        public j get() {
            if (!this.f39102a) {
                D3.a.c("Glide registry");
                this.f39102a = true;
                try {
                    return k.a(this.f39103b, this.f39104c, this.f39105d);
                } finally {
                    this.f39102a = false;
                    D3.a.f();
                }
            } else {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
        }
    }

    static j a(c cVar, List list, C3637a aVar) {
        d h10 = cVar.h();
        b g10 = cVar.g();
        Context applicationContext = cVar.k().getApplicationContext();
        f g11 = cVar.k().g();
        j jVar = new j();
        b(applicationContext, jVar, h10, g10, g11);
        c(applicationContext, cVar, jVar, list, aVar);
        return jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.content.Context r24, com.bumptech.glide.j r25, W4.d r26, W4.b r27, com.bumptech.glide.f r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            c5.n r4 = new c5.n
            r4.<init>()
            r1.r(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L_0x001e
            c5.v r5 = new c5.v
            r5.<init>()
            r1.r(r5)
        L_0x001e:
            android.content.res.Resources r5 = r24.getResources()
            java.util.List r6 = r25.g()
            g5.a r7 = new g5.a
            r7.<init>(r0, r6, r2, r3)
            T4.k r8 = c5.H.m(r26)
            c5.s r9 = new c5.s
            java.util.List r10 = r25.g()
            android.util.DisplayMetrics r11 = r5.getDisplayMetrics()
            r9.<init>(r10, r11, r2, r3)
            r10 = 28
            if (r4 < r10) goto L_0x0055
            java.lang.Class<com.bumptech.glide.d$b> r11 = com.bumptech.glide.d.b.class
            r12 = r28
            boolean r11 = r12.a(r11)
            if (r11 == 0) goto L_0x0055
            c5.z r11 = new c5.z
            r11.<init>()
            c5.j r12 = new c5.j
            r12.<init>()
            goto L_0x005f
        L_0x0055:
            c5.i r12 = new c5.i
            r12.<init>(r9)
            c5.E r11 = new c5.E
            r11.<init>(r9, r3)
        L_0x005f:
            java.lang.String r13 = "Animation"
            java.lang.Class<java.nio.ByteBuffer> r14 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            r16 = r7
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            if (r4 < r10) goto L_0x0079
            T4.k r10 = e5.C3494e.f(r6, r3)
            r1.e(r13, r7, r15, r10)
            T4.k r10 = e5.C3494e.a(r6, r3)
            r1.e(r13, r14, r15, r10)
        L_0x0079:
            e5.i r10 = new e5.i
            r10.<init>(r0)
            r17 = r4
            c5.c r4 = new c5.c
            r4.<init>(r3)
            h5.a r0 = new h5.a
            r0.<init>()
            r28 = r0
            h5.d r0 = new h5.d
            r0.<init>()
            r18 = r0
            android.content.ContentResolver r0 = r24.getContentResolver()
            r19 = r0
            Z4.c r0 = new Z4.c
            r0.<init>()
            com.bumptech.glide.j r0 = r1.a(r14, r0)
            r20 = r10
            Z4.u r10 = new Z4.u
            r10.<init>(r3)
            com.bumptech.glide.j r0 = r0.a(r7, r10)
            java.lang.String r10 = "Bitmap"
            r21 = r15
            java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
            com.bumptech.glide.j r0 = r0.e(r10, r14, r15, r12)
            r0.e(r10, r7, r15, r11)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            r22 = r13
            java.lang.Class<android.os.ParcelFileDescriptor> r13 = android.os.ParcelFileDescriptor.class
            if (r0 == 0) goto L_0x00cc
            c5.B r0 = new c5.B
            r0.<init>(r9)
            r1.e(r10, r13, r15, r0)
        L_0x00cc:
            T4.k r0 = c5.H.c(r26)
            java.lang.Class<android.content.res.AssetFileDescriptor> r9 = android.content.res.AssetFileDescriptor.class
            r1.e(r10, r9, r15, r0)
            com.bumptech.glide.j r0 = r1.e(r10, r13, r15, r8)
            r23 = r9
            Z4.w$a r9 = Z4.w.a.a()
            com.bumptech.glide.j r0 = r0.d(r15, r15, r9)
            c5.G r9 = new c5.G
            r9.<init>()
            com.bumptech.glide.j r0 = r0.e(r10, r15, r15, r9)
            com.bumptech.glide.j r0 = r0.b(r15, r4)
            c5.a r9 = new c5.a
            r9.<init>(r5, r12)
            java.lang.String r12 = "BitmapDrawable"
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.j r0 = r0.e(r12, r14, r1, r9)
            c5.a r9 = new c5.a
            r9.<init>(r5, r11)
            com.bumptech.glide.j r0 = r0.e(r12, r7, r1, r9)
            c5.a r9 = new c5.a
            r9.<init>(r5, r8)
            com.bumptech.glide.j r0 = r0.e(r12, r13, r1, r9)
            c5.b r8 = new c5.b
            r8.<init>(r2, r4)
            com.bumptech.glide.j r0 = r0.b(r1, r8)
            g5.j r4 = new g5.j
            r8 = r16
            r4.<init>(r6, r8, r3)
            java.lang.Class<g5.c> r6 = g5.C3530c.class
            r9 = r22
            com.bumptech.glide.j r0 = r0.e(r9, r7, r6, r4)
            com.bumptech.glide.j r0 = r0.e(r9, r14, r6, r8)
            g5.d r4 = new g5.d
            r4.<init>()
            com.bumptech.glide.j r0 = r0.b(r6, r4)
            Z4.w$a r4 = Z4.w.a.a()
            java.lang.Class<P4.a> r8 = P4.a.class
            com.bumptech.glide.j r0 = r0.d(r8, r8, r4)
            g5.h r4 = new g5.h
            r4.<init>(r2)
            com.bumptech.glide.j r0 = r0.e(r10, r8, r15, r4)
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r9 = r20
            r8 = r21
            com.bumptech.glide.j r0 = r0.c(r4, r8, r9)
            c5.D r10 = new c5.D
            r10.<init>(r9, r2)
            com.bumptech.glide.j r0 = r0.c(r4, r15, r10)
            d5.a$a r9 = new d5.a$a
            r9.<init>()
            com.bumptech.glide.j r0 = r0.s(r9)
            Z4.d$b r9 = new Z4.d$b
            r9.<init>()
            java.lang.Class<java.io.File> r10 = java.io.File.class
            com.bumptech.glide.j r0 = r0.d(r10, r14, r9)
            Z4.g$e r9 = new Z4.g$e
            r9.<init>()
            com.bumptech.glide.j r0 = r0.d(r10, r7, r9)
            f5.a r9 = new f5.a
            r9.<init>()
            com.bumptech.glide.j r0 = r0.c(r10, r10, r9)
            Z4.g$b r9 = new Z4.g$b
            r9.<init>()
            com.bumptech.glide.j r0 = r0.d(r10, r13, r9)
            Z4.w$a r9 = Z4.w.a.a()
            com.bumptech.glide.j r0 = r0.d(r10, r10, r9)
            com.bumptech.glide.load.data.k$a r9 = new com.bumptech.glide.load.data.k$a
            r9.<init>(r3)
            r0.s(r9)
            boolean r0 = com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.c()
            if (r0 == 0) goto L_0x01ab
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r3 = r1
            r1 = r25
            r1.s(r0)
            goto L_0x01ae
        L_0x01ab:
            r3 = r1
            r1 = r25
        L_0x01ae:
            Z4.o r0 = Z4.f.g(r24)
            Z4.o r9 = Z4.f.c(r24)
            Z4.o r11 = Z4.f.e(r24)
            java.lang.Class r12 = java.lang.Integer.TYPE
            r16 = r6
            com.bumptech.glide.j r6 = r1.d(r12, r7, r0)
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.bumptech.glide.j r0 = r6.d(r2, r7, r0)
            r6 = r23
            com.bumptech.glide.j r0 = r0.d(r12, r6, r9)
            com.bumptech.glide.j r0 = r0.d(r2, r6, r9)
            com.bumptech.glide.j r0 = r0.d(r12, r8, r11)
            com.bumptech.glide.j r0 = r0.d(r2, r8, r11)
            Z4.o r9 = Z4.t.f(r24)
            com.bumptech.glide.j r0 = r0.d(r4, r7, r9)
            Z4.o r9 = Z4.t.e(r24)
            r0.d(r4, r6, r9)
            Z4.s$c r0 = new Z4.s$c
            r0.<init>(r5)
            Z4.s$a r9 = new Z4.s$a
            r9.<init>(r5)
            Z4.s$b r11 = new Z4.s$b
            r11.<init>(r5)
            r20 = r3
            com.bumptech.glide.j r3 = r1.d(r2, r4, r0)
            com.bumptech.glide.j r0 = r3.d(r12, r4, r0)
            com.bumptech.glide.j r0 = r0.d(r2, r6, r9)
            com.bumptech.glide.j r0 = r0.d(r12, r6, r9)
            com.bumptech.glide.j r0 = r0.d(r2, r7, r11)
            r0.d(r12, r7, r11)
            Z4.e$c r0 = new Z4.e$c
            r0.<init>()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            com.bumptech.glide.j r0 = r1.d(r2, r7, r0)
            Z4.e$c r3 = new Z4.e$c
            r3.<init>()
            com.bumptech.glide.j r0 = r0.d(r4, r7, r3)
            Z4.v$c r3 = new Z4.v$c
            r3.<init>()
            com.bumptech.glide.j r0 = r0.d(r2, r7, r3)
            Z4.v$b r3 = new Z4.v$b
            r3.<init>()
            com.bumptech.glide.j r0 = r0.d(r2, r13, r3)
            Z4.v$a r3 = new Z4.v$a
            r3.<init>()
            com.bumptech.glide.j r0 = r0.d(r2, r6, r3)
            Z4.a$c r2 = new Z4.a$c
            android.content.res.AssetManager r3 = r24.getAssets()
            r2.<init>(r3)
            com.bumptech.glide.j r0 = r0.d(r4, r7, r2)
            Z4.a$b r2 = new Z4.a$b
            android.content.res.AssetManager r3 = r24.getAssets()
            r2.<init>(r3)
            com.bumptech.glide.j r0 = r0.d(r4, r6, r2)
            a5.b$a r2 = new a5.b$a
            r3 = r24
            r9 = r28
            r2.<init>(r3)
            com.bumptech.glide.j r0 = r0.d(r4, r7, r2)
            a5.c$a r2 = new a5.c$a
            r2.<init>(r3)
            r0.d(r4, r7, r2)
            r0 = 29
            r2 = r17
            if (r2 < r0) goto L_0x0285
            a5.d$c r0 = new a5.d$c
            r0.<init>(r3)
            r1.d(r4, r7, r0)
            a5.d$b r0 = new a5.d$b
            r0.<init>(r3)
            r1.d(r4, r13, r0)
        L_0x0285:
            Z4.x$d r0 = new Z4.x$d
            r2 = r19
            r0.<init>(r2)
            com.bumptech.glide.j r0 = r1.d(r4, r7, r0)
            Z4.x$b r11 = new Z4.x$b
            r11.<init>(r2)
            com.bumptech.glide.j r0 = r0.d(r4, r13, r11)
            Z4.x$a r11 = new Z4.x$a
            r11.<init>(r2)
            com.bumptech.glide.j r0 = r0.d(r4, r6, r11)
            Z4.y$a r2 = new Z4.y$a
            r2.<init>()
            com.bumptech.glide.j r0 = r0.d(r4, r7, r2)
            a5.g$a r2 = new a5.g$a
            r2.<init>()
            java.lang.Class<java.net.URL> r6 = java.net.URL.class
            com.bumptech.glide.j r0 = r0.d(r6, r7, r2)
            Z4.l$a r2 = new Z4.l$a
            r2.<init>(r3)
            com.bumptech.glide.j r0 = r0.d(r4, r10, r2)
            a5.a$a r2 = new a5.a$a
            r2.<init>()
            java.lang.Class<Z4.h> r3 = Z4.h.class
            com.bumptech.glide.j r0 = r0.d(r3, r7, r2)
            Z4.b$a r2 = new Z4.b$a
            r2.<init>()
            java.lang.Class<byte[]> r3 = byte[].class
            com.bumptech.glide.j r0 = r0.d(r3, r14, r2)
            Z4.b$d r2 = new Z4.b$d
            r2.<init>()
            com.bumptech.glide.j r0 = r0.d(r3, r7, r2)
            Z4.w$a r2 = Z4.w.a.a()
            com.bumptech.glide.j r0 = r0.d(r4, r4, r2)
            Z4.w$a r2 = Z4.w.a.a()
            com.bumptech.glide.j r0 = r0.d(r8, r8, r2)
            e5.j r2 = new e5.j
            r2.<init>()
            com.bumptech.glide.j r0 = r0.c(r8, r8, r2)
            h5.b r2 = new h5.b
            r2.<init>(r5)
            r4 = r20
            com.bumptech.glide.j r0 = r0.t(r15, r4, r2)
            com.bumptech.glide.j r0 = r0.t(r15, r3, r9)
            h5.c r2 = new h5.c
            r6 = r26
            r7 = r18
            r2.<init>(r6, r9, r7)
            com.bumptech.glide.j r0 = r0.t(r8, r3, r2)
            r2 = r16
            r0.t(r2, r3, r7)
            T4.k r0 = c5.H.d(r26)
            r1.c(r14, r15, r0)
            c5.a r2 = new c5.a
            r2.<init>(r5, r0)
            r1.c(r14, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.b(android.content.Context, com.bumptech.glide.j, W4.d, W4.b, com.bumptech.glide.f):void");
    }

    private static void c(Context context, c cVar, j jVar, List list, C3637a aVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3638b bVar = (C3638b) it.next();
            try {
                bVar.b(context, cVar, jVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar.getClass().getName(), e10);
            }
        }
        if (aVar != null) {
            aVar.registerComponents(context, cVar, jVar);
        }
    }

    static f.b d(c cVar, List list, C3637a aVar) {
        return new a(cVar, list, aVar);
    }
}
