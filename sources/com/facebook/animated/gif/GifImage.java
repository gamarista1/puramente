package com.facebook.animated.gif;

import P6.b;
import P6.c;
import T5.d;
import T5.k;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import w8.C4145a;

@d
public class GifImage implements c, Q6.c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f39424b;

    /* renamed from: a  reason: collision with root package name */
    private Bitmap.Config f39425a = null;
    @d
    private long mNativeContext;

    @d
    public GifImage() {
    }

    public static GifImage h(ByteBuffer byteBuffer, W6.d dVar) {
        j();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, dVar.f34873b, dVar.f34878g);
        nativeCreateFromDirectByteBuffer.f39425a = dVar.f34880i;
        return nativeCreateFromDirectByteBuffer;
    }

    public static GifImage i(long j10, int i10, W6.d dVar) {
        boolean z10;
        j();
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10, dVar.f34873b, dVar.f34878g);
        nativeCreateFromNativeMemory.f39425a = dVar.f34880i;
        return nativeCreateFromNativeMemory;
    }

    private static synchronized void j() {
        synchronized (GifImage.class) {
            if (!f39424b) {
                f39424b = true;
                C4145a.d("gifimage");
            }
        }
    }

    private static b.C0547b k(int i10) {
        if (i10 == 0) {
            return b.C0547b.DISPOSE_DO_NOT;
        }
        if (i10 == 1) {
            return b.C0547b.DISPOSE_DO_NOT;
        }
        if (i10 == 2) {
            return b.C0547b.DISPOSE_TO_BACKGROUND;
        }
        if (i10 == 3) {
            return b.C0547b.DISPOSE_TO_PREVIOUS;
        }
        return b.C0547b.DISPOSE_DO_NOT;
    }

    @d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i10, boolean z10);

    @d
    private static native GifImage nativeCreateFromFileDescriptor(int i10, int i11, boolean z10);

    @d
    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10, int i11, boolean z10);

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDuration();

    @d
    private native GifFrame nativeGetFrame(int i10);

    @d
    private native int nativeGetFrameCount();

    @d
    private native int[] nativeGetFrameDurations();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetLoopCount();

    @d
    private native int nativeGetSizeInBytes();

    @d
    private native int nativeGetWidth();

    @d
    private native boolean nativeIsAnimated();

    public int a() {
        return nativeGetFrameCount();
    }

    public int b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    public b c(int i10) {
        GifFrame l10 = s(i10);
        try {
            return new b(i10, l10.b(), l10.c(), l10.e(), l10.d(), b.a.BLEND_WITH_PREVIOUS, k(l10.f()));
        } finally {
            l10.dispose();
        }
    }

    public int d() {
        return nativeGetHeight();
    }

    public int e() {
        return nativeGetWidth();
    }

    public c f(ByteBuffer byteBuffer, W6.d dVar) {
        return h(byteBuffer, dVar);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public c g(long j10, int i10, W6.d dVar) {
        return i(j10, i10, dVar);
    }

    /* renamed from: l */
    public GifFrame s(int i10) {
        return nativeGetFrame(i10);
    }

    public int p() {
        return nativeGetSizeInBytes();
    }

    public boolean q() {
        return false;
    }

    public Bitmap.Config r() {
        return this.f39425a;
    }

    public int[] t() {
        return nativeGetFrameDurations();
    }

    @d
    GifImage(long j10) {
        this.mNativeContext = j10;
    }
}
