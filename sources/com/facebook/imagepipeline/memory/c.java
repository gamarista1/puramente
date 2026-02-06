package com.facebook.imagepipeline.memory;

import T5.k;
import W5.d;
import android.graphics.Bitmap;
import f7.E;
import f7.F;
import f7.i;

public class c extends a implements i {
    public c(d dVar, E e10, F f10, boolean z10) {
        super(dVar, e10, f10, z10);
        t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Bitmap h(int i10) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void l(Bitmap bitmap) {
        k.g(bitmap);
        bitmap.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int p(Bitmap bitmap) {
        k.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Bitmap r(b bVar) {
        Bitmap bitmap = (Bitmap) super.r(bVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean v(Bitmap bitmap) {
        k.g(bitmap);
        if (bitmap.isRecycled() || !bitmap.isMutable()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int o(int i10) {
        return i10;
    }

    /* access modifiers changed from: protected */
    public int q(int i10) {
        return i10;
    }
}
