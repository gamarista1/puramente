package com.facebook.imagepipeline.memory;

import T5.d;
import T5.k;
import android.util.Log;
import f7.v;
import f7.w;
import java.io.Closeable;
import java.nio.ByteBuffer;
import w8.C4145a;

@d
public class NativeMemoryChunk implements v, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final long f39734a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39735b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39736c;

    static {
        C4145a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f39735b = i10;
        this.f39734a = nativeAllocate(i10);
        this.f39736c = false;
    }

    private void n(int i10, v vVar, int i11, int i12) {
        if (vVar instanceof NativeMemoryChunk) {
            k.i(!isClosed());
            k.i(!vVar.isClosed());
            w.b(i10, vVar.getSize(), i11, i12, this.f39735b);
            nativeMemcpy(vVar.s() + ((long) i11), this.f39734a + ((long) i10), i12);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @d
    private static native long nativeAllocate(int i10);

    @d
    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    @d
    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    @d
    private static native void nativeFree(long j10);

    @d
    private static native void nativeMemcpy(long j10, long j11, int i10);

    @d
    private static native byte nativeReadByte(long j10);

    public long a() {
        return this.f39734a;
    }

    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.i(!isClosed());
        a10 = w.a(i10, i12, this.f39735b);
        w.b(i10, bArr.length, i11, a10, this.f39735b);
        nativeCopyFromByteArray(this.f39734a + ((long) i10), bArr, i11, a10);
        return a10;
    }

    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.i(!isClosed());
        a10 = w.a(i10, i12, this.f39735b);
        w.b(i10, bArr.length, i11, a10, this.f39735b);
        nativeCopyToByteArray(this.f39734a + ((long) i10), bArr, i11, a10);
        return a10;
    }

    public synchronized void close() {
        if (!this.f39736c) {
            this.f39736c = true;
            nativeFree(this.f39734a);
        }
    }

    public void f(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.a() == a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(vVar)) + " which share the same address " + Long.toHexString(this.f39734a));
            k.b(Boolean.FALSE);
        }
        if (vVar.a() < a()) {
            synchronized (vVar) {
                synchronized (this) {
                    n(i10, vVar, i11, i12);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (vVar) {
                n(i10, vVar, i11, i12);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public int getSize() {
        return this.f39735b;
    }

    public synchronized boolean isClosed() {
        return this.f39736c;
    }

    public ByteBuffer l() {
        return null;
    }

    public synchronized byte r(int i10) {
        boolean z10;
        boolean z11 = false;
        k.i(!isClosed());
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i10 < this.f39735b) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        return nativeReadByte(this.f39734a + ((long) i10));
    }

    public long s() {
        return this.f39734a;
    }

    public NativeMemoryChunk() {
        this.f39735b = 0;
        this.f39734a = 0;
        this.f39736c = true;
    }
}
