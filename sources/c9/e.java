package C9;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import ja.C3645a;
import ja.C3651g;
import ja.M;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import n9.C3867c;
import w.C2780Y;

class e {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque f30116g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f30117h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f30118a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f30119b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f30120c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f30121d;

    /* renamed from: e  reason: collision with root package name */
    private final C3651g f30122e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30123f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f30125a;

        /* renamed from: b  reason: collision with root package name */
        public int f30126b;

        /* renamed from: c  reason: collision with root package name */
        public int f30127c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f30128d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f30129e;

        /* renamed from: f  reason: collision with root package name */
        public int f30130f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f30125a = i10;
            this.f30126b = i11;
            this.f30127c = i12;
            this.f30129e = j10;
            this.f30130f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C3651g());
    }

    private void b() {
        this.f30122e.c();
        ((Handler) C3645a.e(this.f30120c)).obtainMessage(2).sendToTarget();
        this.f30122e.a();
    }

    private static void c(C3867c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f46930f;
        cryptoInfo.numBytesOfClearData = e(cVar.f46928d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f46929e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C3645a.e(d(cVar.f46926b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C3645a.e(d(cVar.f46925a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f46927c;
        if (M.f44981a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f46931g, cVar.f46932h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: C9.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: C9.e$b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            if (r0 == 0) goto L_0x0036
            r1 = 1
            if (r0 == r1) goto L_0x0022
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference r0 = r10.f30121d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            w.C2780Y.a(r0, r2, r1)
            goto L_0x0049
        L_0x001c:
            ja.g r11 = r10.f30122e
            r11.e()
            goto L_0x0049
        L_0x0022:
            java.lang.Object r11 = r11.obj
            r2 = r11
            C9.e$b r2 = (C9.e.b) r2
            int r4 = r2.f30125a
            int r5 = r2.f30126b
            android.media.MediaCodec$CryptoInfo r6 = r2.f30128d
            long r7 = r2.f30129e
            int r9 = r2.f30130f
            r3 = r10
            r3.h(r4, r5, r6, r7, r9)
            goto L_0x0049
        L_0x0036:
            java.lang.Object r11 = r11.obj
            r2 = r11
            C9.e$b r2 = (C9.e.b) r2
            int r4 = r2.f30125a
            int r5 = r2.f30126b
            int r6 = r2.f30127c
            long r7 = r2.f30129e
            int r9 = r2.f30130f
            r3 = r10
            r3.g(r4, r5, r6, r7, r9)
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            o(r2)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.e.f(android.os.Message):void");
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f30118a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            C2780Y.a(this.f30121d, (Object) null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f30117h) {
                this.f30118a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            C2780Y.a(this.f30121d, (Object) null, e10);
        }
    }

    private void j() {
        ((Handler) C3645a.e(this.f30120c)).removeCallbacksAndMessages((Object) null);
        b();
    }

    private static b k() {
        ArrayDeque arrayDeque = f30116g;
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

    private void l() {
        RuntimeException runtimeException = (RuntimeException) this.f30121d.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private static void o(b bVar) {
        ArrayDeque arrayDeque = f30116g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f30123f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) M.j(this.f30120c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, C3867c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f30128d);
        ((Handler) M.j(this.f30120c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f30123f) {
            i();
            this.f30119b.quit();
        }
        this.f30123f = false;
    }

    public void q() {
        if (!this.f30123f) {
            this.f30119b.start();
            this.f30120c = new a(this.f30119b.getLooper());
            this.f30123f = true;
        }
    }

    public void r() {
        b();
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, C3651g gVar) {
        this.f30118a = mediaCodec;
        this.f30119b = handlerThread;
        this.f30122e = gVar;
        this.f30121d = new AtomicReference();
    }
}
