package r2;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import i2.C2076a;
import i2.C2081f;
import i2.L;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import l2.c;
import w.C2780Y;

/* renamed from: r2.e  reason: case insensitive filesystem */
class C2565e implements k {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque f25608g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f25609h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f25610a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f25611b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f25612c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f25613d;

    /* renamed from: e  reason: collision with root package name */
    private final C2081f f25614e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25615f;

    /* renamed from: r2.e$a */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C2565e.this.j(message);
        }
    }

    /* renamed from: r2.e$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f25617a;

        /* renamed from: b  reason: collision with root package name */
        public int f25618b;

        /* renamed from: c  reason: collision with root package name */
        public int f25619c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f25620d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f25621e;

        /* renamed from: f  reason: collision with root package name */
        public int f25622f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f25617a = i10;
            this.f25618b = i11;
            this.f25619c = i12;
            this.f25621e = j10;
            this.f25622f = i13;
        }
    }

    public C2565e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C2081f());
    }

    private void e() {
        this.f25614e.c();
        ((Handler) C2076a.e(this.f25612c)).obtainMessage(3).sendToTarget();
        this.f25614e.a();
    }

    private static void f(c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f23511f;
        cryptoInfo.numBytesOfClearData = i(cVar.f23509d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f23510e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C2076a.e(h(cVar.f23507b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C2076a.e(h(cVar.f23506a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f23508c;
        if (L.f22072a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f23512g, cVar.f23513h));
        }
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: r2.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: r2.e$b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            if (r0 == r1) goto L_0x0042
            r1 = 2
            if (r0 == r1) goto L_0x002e
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L_0x0028
            r1 = 4
            if (r0 == r1) goto L_0x0020
            java.util.concurrent.atomic.AtomicReference r0 = r10.f25613d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            w.C2780Y.a(r0, r2, r1)
            goto L_0x0055
        L_0x0020:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            r10.m(r11)
            goto L_0x0055
        L_0x0028:
            i2.f r11 = r10.f25614e
            r11.e()
            goto L_0x0055
        L_0x002e:
            java.lang.Object r11 = r11.obj
            r2 = r11
            r2.e$b r2 = (r2.C2565e.b) r2
            int r4 = r2.f25617a
            int r5 = r2.f25618b
            android.media.MediaCodec$CryptoInfo r6 = r2.f25620d
            long r7 = r2.f25621e
            int r9 = r2.f25622f
            r3 = r10
            r3.l(r4, r5, r6, r7, r9)
            goto L_0x0055
        L_0x0042:
            java.lang.Object r11 = r11.obj
            r2 = r11
            r2.e$b r2 = (r2.C2565e.b) r2
            int r4 = r2.f25617a
            int r5 = r2.f25618b
            int r6 = r2.f25619c
            long r7 = r2.f25621e
            int r9 = r2.f25622f
            r3 = r10
            r3.k(r4, r5, r6, r7, r9)
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            p(r2)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C2565e.j(android.os.Message):void");
    }

    private void k(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f25610a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            C2780Y.a(this.f25613d, (Object) null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f25609h) {
                this.f25610a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            C2780Y.a(this.f25613d, (Object) null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f25610a.setParameters(bundle);
        } catch (RuntimeException e10) {
            C2780Y.a(this.f25613d, (Object) null, e10);
        }
    }

    private void n() {
        ((Handler) C2076a.e(this.f25612c)).removeCallbacksAndMessages((Object) null);
        e();
    }

    private static b o() {
        ArrayDeque arrayDeque = f25608g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    b bVar = new b();
                    return bVar;
                }
                b bVar2 = (b) arrayDeque.removeFirst();
                return bVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque arrayDeque = f25608g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        c();
        b o10 = o();
        o10.a(i10, i11, i12, j10, i13);
        ((Handler) L.h(this.f25612c)).obtainMessage(1, o10).sendToTarget();
    }

    public void b(Bundle bundle) {
        c();
        ((Handler) L.h(this.f25612c)).obtainMessage(4, bundle).sendToTarget();
    }

    public void c() {
        RuntimeException runtimeException = (RuntimeException) this.f25613d.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void flush() {
        if (this.f25615f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void g(int i10, int i11, c cVar, long j10, int i12) {
        c();
        b o10 = o();
        o10.a(i10, i11, 0, j10, i12);
        f(cVar, o10.f25620d);
        ((Handler) L.h(this.f25612c)).obtainMessage(2, o10).sendToTarget();
    }

    public void shutdown() {
        if (this.f25615f) {
            flush();
            this.f25611b.quit();
        }
        this.f25615f = false;
    }

    public void start() {
        if (!this.f25615f) {
            this.f25611b.start();
            this.f25612c = new a(this.f25611b.getLooper());
            this.f25615f = true;
        }
    }

    C2565e(MediaCodec mediaCodec, HandlerThread handlerThread, C2081f fVar) {
        this.f25610a = mediaCodec;
        this.f25611b = handlerThread;
        this.f25614e = fVar;
        this.f25613d = new AtomicReference();
    }
}
