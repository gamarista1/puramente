package com.facebook.imagepipeline.platform;

import T5.b;
import T5.d;
import T5.k;
import T5.p;
import W5.h;
import W5.j;
import X5.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import c6.C3179b;
import c6.C3180c;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;

@d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d  reason: collision with root package name */
    private static Method f39776d;

    /* renamed from: c  reason: collision with root package name */
    private final C3179b f39777c = C3180c.i();

    private static MemoryFile h(a aVar, int i10, byte[] bArr) {
        int i11;
        Closeable closeable;
        Z5.a aVar2;
        if (bArr == null) {
            i11 = 0;
        } else {
            i11 = bArr.length;
        }
        j jVar = null;
        MemoryFile memoryFile = new MemoryFile((String) null, i11 + i10);
        memoryFile.allowPurging(false);
        try {
            j jVar2 = new j((h) aVar.I());
            try {
                aVar2 = new Z5.a(jVar2, i10);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    T5.a.a(aVar2, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i10, bArr.length);
                    }
                    a.E(aVar);
                    b.b(jVar2);
                    b.b(aVar2);
                    b.a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    jVar = jVar2;
                    a.E(aVar);
                    b.b(jVar);
                    b.b(aVar2);
                    b.a(closeable, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                aVar2 = null;
                jVar = jVar2;
                a.E(aVar);
                b.b(jVar);
                b.b(aVar2);
                b.a(closeable, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            aVar2 = null;
            a.E(aVar);
            b.b(jVar);
            b.b(aVar2);
            b.a(closeable, true);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap i(X5.a r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = h(r2, r3, r4)     // Catch:{ IOException -> 0x002f }
            java.io.FileDescriptor r3 = r1.k(r2)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            c6.b r4 = r1.f39777c     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            if (r4 == 0) goto L_0x0025
            android.graphics.Bitmap r3 = r4.b(r3, r0, r5)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = T5.k.h(r3, r4)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            if (r2 == 0) goto L_0x001e
            r2.close()
        L_0x001e:
            return r3
        L_0x001f:
            r3 = move-exception
            r0 = r2
            goto L_0x0035
        L_0x0022:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x0025:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            throw r3     // Catch:{ IOException -> 0x0022, all -> 0x001f }
        L_0x002d:
            r3 = move-exception
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.RuntimeException r2 = T5.p.a(r3)     // Catch:{ all -> 0x002d }
            throw r2     // Catch:{ all -> 0x002d }
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.i(X5.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private synchronized Method j() {
        if (f39776d == null) {
            try {
                f39776d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", (Class[]) null);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f39776d;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, (Object[]) null));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }

    /* access modifiers changed from: protected */
    public Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.I()).size(), (byte[]) null, options);
    }

    /* access modifiers changed from: protected */
    public Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.e(aVar, i10)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f39764b;
        }
        return i(aVar, i10, bArr, options);
    }
}
