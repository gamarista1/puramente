package com.facebook.imagepipeline.platform;

import T5.d;
import T5.k;
import W5.h;
import X5.a;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@d
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f39778c;

    @d
    public KitKatPurgeableDecoder(com.facebook.imagepipeline.memory.d dVar) {
        this.f39778c = dVar;
    }

    private static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    /* access modifiers changed from: protected */
    public Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.I();
        int size = hVar.size();
        a a10 = this.f39778c.a(size);
        try {
            byte[] bArr = (byte[]) a10.I();
            hVar.c(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.E(a10);
        }
    }

    /* access modifiers changed from: protected */
    public Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z10;
        if (DalvikPurgeableDecoder.e(aVar, i10)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f39764b;
        }
        h hVar = (h) aVar.I();
        if (i10 <= hVar.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        int i11 = i10 + 2;
        a a10 = this.f39778c.a(i11);
        try {
            byte[] bArr2 = (byte[]) a10.I();
            hVar.c(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            Bitmap bitmap = (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
            a.E(a10);
            return bitmap;
        } catch (Throwable th2) {
            a.E(a10);
            throw th2;
        }
    }
}
