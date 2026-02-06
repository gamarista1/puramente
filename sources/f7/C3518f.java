package f7;

import T5.k;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: f7.f  reason: case insensitive filesystem */
public class C3518f implements v, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private SharedMemory f43430a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f43431b;

    /* renamed from: c  reason: collision with root package name */
    private final long f43432c;

    public C3518f(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        try {
            SharedMemory a10 = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f43430a = a10;
            this.f43431b = a10.mapReadWrite();
            this.f43432c = (long) System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void n(int i10, v vVar, int i11, int i12) {
        if (vVar instanceof C3518f) {
            k.i(!isClosed());
            k.i(!vVar.isClosed());
            k.g(this.f43431b);
            k.g(vVar.l());
            w.b(i10, vVar.getSize(), i11, i12, getSize());
            this.f43431b.position(i10);
            vVar.l().position(i11);
            byte[] bArr = new byte[i12];
            this.f43431b.get(bArr, 0, i12);
            vVar.l().put(bArr, 0, i12);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public long a() {
        return this.f43432c;
    }

    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.g(this.f43431b);
        a10 = w.a(i10, i12, getSize());
        w.b(i10, bArr.length, i11, a10, getSize());
        this.f43431b.position(i10);
        this.f43431b.put(bArr, i11, a10);
        return a10;
    }

    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.g(this.f43431b);
        a10 = w.a(i10, i12, getSize());
        w.b(i10, bArr.length, i11, a10, getSize());
        this.f43431b.position(i10);
        this.f43431b.get(bArr, i11, a10);
        return a10;
    }

    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f43430a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f43431b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f43431b = null;
                this.f43430a = null;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void f(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.a() == a()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(a()) + " to AshmemMemoryChunk " + Long.toHexString(vVar.a()) + " which are the same ");
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
        k.g(this.f43430a);
        return this.f43430a.getSize();
    }

    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f43431b == null || this.f43430a == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public ByteBuffer l() {
        return this.f43431b;
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
        if (i10 < getSize()) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        k.g(this.f43431b);
        return this.f43431b.get(i10);
    }

    public long s() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }
}
