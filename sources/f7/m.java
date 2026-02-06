package f7;

import T5.k;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class m implements v, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f43451a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43452b;

    /* renamed from: c  reason: collision with root package name */
    private final long f43453c = ((long) System.identityHashCode(this));

    public m(int i10) {
        this.f43451a = ByteBuffer.allocateDirect(i10);
        this.f43452b = i10;
    }

    private void n(int i10, v vVar, int i11, int i12) {
        if (vVar instanceof m) {
            k.i(!isClosed());
            k.i(!vVar.isClosed());
            k.g(this.f43451a);
            w.b(i10, vVar.getSize(), i11, i12, this.f43452b);
            this.f43451a.position(i10);
            ByteBuffer byteBuffer = (ByteBuffer) k.g(vVar.l());
            byteBuffer.position(i11);
            byte[] bArr = new byte[i12];
            this.f43451a.get(bArr, 0, i12);
            byteBuffer.put(bArr, 0, i12);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public long a() {
        return this.f43453c;
    }

    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.i(!isClosed());
        k.g(this.f43451a);
        a10 = w.a(i10, i12, this.f43452b);
        w.b(i10, bArr.length, i11, a10, this.f43452b);
        this.f43451a.position(i10);
        this.f43451a.put(bArr, i11, a10);
        return a10;
    }

    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.i(!isClosed());
        k.g(this.f43451a);
        a10 = w.a(i10, i12, this.f43452b);
        w.b(i10, bArr.length, i11, a10, this.f43452b);
        this.f43451a.position(i10);
        this.f43451a.get(bArr, i11, a10);
        return a10;
    }

    public synchronized void close() {
        this.f43451a = null;
    }

    public void f(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.a() == a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(a()) + " to BufferMemoryChunk " + Long.toHexString(vVar.a()) + " which are the same ");
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

    public int getSize() {
        return this.f43452b;
    }

    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f43451a == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized ByteBuffer l() {
        return this.f43451a;
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
        if (i10 < this.f43452b) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        k.g(this.f43451a);
        return this.f43451a.get(i10);
    }

    public long s() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }
}
