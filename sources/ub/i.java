package Ub;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class i {

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue f53368a;

    /* renamed from: b  reason: collision with root package name */
    private final Random f53369b = new Random();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f53370c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f53371d = false;

    /* renamed from: e  reason: collision with root package name */
    private c f53372e;

    /* renamed from: f  reason: collision with root package name */
    private WritableByteChannel f53373f;

    /* renamed from: g  reason: collision with root package name */
    private final Thread f53374g = c.j().newThread(new a());

    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.f();
        }
    }

    i(c cVar, String str, int i10) {
        b i11 = c.i();
        Thread d10 = d();
        i11.a(d10, str + "Writer-" + i10);
        this.f53372e = cVar;
        this.f53368a = new LinkedBlockingQueue();
    }

    private ByteBuffer b(byte b10, boolean z10, byte[] bArr) {
        int i10;
        int i11;
        if (z10) {
            i10 = 6;
        } else {
            i10 = 2;
        }
        int length = bArr.length;
        int i12 = 126;
        if (length >= 126) {
            if (length <= 65535) {
                i10 += 2;
            } else {
                i10 += 8;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i10);
        allocate.put((byte) (b10 | Byte.MIN_VALUE));
        if (length < 126) {
            if (z10) {
                length |= 128;
            }
            allocate.put((byte) length);
        } else if (length <= 65535) {
            if (z10) {
                i12 = 254;
            }
            allocate.put((byte) i12);
            allocate.putShort((short) length);
        } else {
            if (z10) {
                i11 = 255;
            } else {
                i11 = 127;
            }
            allocate.put((byte) i11);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z10) {
            byte[] c10 = c();
            allocate.put(c10);
            for (int i13 = 0; i13 < bArr.length; i13++) {
                allocate.put((byte) (bArr[i13] ^ c10[i13 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    private byte[] c() {
        byte[] bArr = new byte[4];
        this.f53369b.nextBytes(bArr);
        return bArr;
    }

    private void e(e eVar) {
        this.f53372e.k(eVar);
    }

    /* access modifiers changed from: private */
    public void f() {
        while (!this.f53370c && !Thread.interrupted()) {
            try {
                j();
            } catch (IOException e10) {
                e(new e("IO Exception", e10));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i10 = 0; i10 < this.f53368a.size(); i10++) {
            j();
        }
    }

    private void j() {
        this.f53373f.write((ByteBuffer) this.f53368a.take());
    }

    /* access modifiers changed from: package-private */
    public Thread d() {
        return this.f53374g;
    }

    /* access modifiers changed from: package-private */
    public synchronized void g(byte b10, boolean z10, byte[] bArr) {
        try {
            ByteBuffer b11 = b(b10, z10, bArr);
            if (this.f53370c) {
                if (this.f53371d || b10 != 8) {
                    throw new e("Shouldn't be sending");
                }
            }
            if (b10 == 8) {
                this.f53371d = true;
            }
            this.f53368a.add(b11);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(OutputStream outputStream) {
        this.f53373f = Channels.newChannel(outputStream);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.f53370c = true;
    }
}
