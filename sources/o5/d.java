package o5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final Queue f47036c = l.g(0);

    /* renamed from: a  reason: collision with root package name */
    private InputStream f47037a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f47038b;

    d() {
    }

    public static d b(InputStream inputStream) {
        d dVar;
        Queue queue = f47036c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.n(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f47038b;
    }

    public int available() {
        return this.f47037a.available();
    }

    public void close() {
        this.f47037a.close();
    }

    public void f() {
        this.f47038b = null;
        this.f47037a = null;
        Queue queue = f47036c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void mark(int i10) {
        this.f47037a.mark(i10);
    }

    public boolean markSupported() {
        return this.f47037a.markSupported();
    }

    /* access modifiers changed from: package-private */
    public void n(InputStream inputStream) {
        this.f47037a = inputStream;
    }

    public int read() {
        try {
            return this.f47037a.read();
        } catch (IOException e10) {
            this.f47038b = e10;
            throw e10;
        }
    }

    public synchronized void reset() {
        this.f47037a.reset();
    }

    public long skip(long j10) {
        try {
            return this.f47037a.skip(j10);
        } catch (IOException e10) {
            this.f47038b = e10;
            throw e10;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f47037a.read(bArr);
        } catch (IOException e10) {
            this.f47038b = e10;
            throw e10;
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f47037a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f47038b = e10;
            throw e10;
        }
    }
}
