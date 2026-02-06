package C9;

import C9.l;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import ja.J;
import java.nio.ByteBuffer;
import n9.C3867c;
import nb.u;

final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f30105a;

    /* renamed from: b  reason: collision with root package name */
    private final g f30106b;

    /* renamed from: c  reason: collision with root package name */
    private final e f30107c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f30108d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30109e;

    /* renamed from: f  reason: collision with root package name */
    private int f30110f;

    /* renamed from: C9.b$b  reason: collision with other inner class name */
    public static final class C0502b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        private final u f30111a;

        /* renamed from: b  reason: collision with root package name */
        private final u f30112b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f30113c;

        public C0502b(int i10, boolean z10) {
            this(new c(i10), new d(i10), z10);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.s(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.t(i10));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9.b a(C9.l.a r10) {
            /*
                r9 = this;
                C9.n r0 = r10.f30158a
                java.lang.String r0 = r0.f30166a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
                r2.<init>()     // Catch:{ Exception -> 0x004d }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x004d }
                r2.append(r0)     // Catch:{ Exception -> 0x004d }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004d }
                ja.J.a(r2)     // Catch:{ Exception -> 0x004d }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x004d }
                C9.b r2 = new C9.b     // Catch:{ Exception -> 0x004b }
                nb.u r3 = r9.f30111a     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x004b }
                nb.u r3 = r9.f30112b     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x004b }
                boolean r7 = r9.f30113c     // Catch:{ Exception -> 0x004b }
                r8 = 0
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x004b }
                ja.J.c()     // Catch:{ Exception -> 0x0048 }
                android.media.MediaFormat r1 = r10.f30159b     // Catch:{ Exception -> 0x0048 }
                android.view.Surface r3 = r10.f30161d     // Catch:{ Exception -> 0x0048 }
                android.media.MediaCrypto r4 = r10.f30162e     // Catch:{ Exception -> 0x0048 }
                int r10 = r10.f30163f     // Catch:{ Exception -> 0x0048 }
                r2.v(r1, r3, r4, r10)     // Catch:{ Exception -> 0x0048 }
                return r2
            L_0x0048:
                r10 = move-exception
                r1 = r2
                goto L_0x004f
            L_0x004b:
                r10 = move-exception
                goto L_0x004f
            L_0x004d:
                r10 = move-exception
                r0 = r1
            L_0x004f:
                if (r1 != 0) goto L_0x0057
                if (r0 == 0) goto L_0x005a
                r0.release()
                goto L_0x005a
            L_0x0057:
                r1.release()
            L_0x005a:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: C9.b.C0502b.a(C9.l$a):C9.b");
        }

        C0502b(u uVar, u uVar2, boolean z10) {
            this.f30111a = uVar;
            this.f30112b = uVar2;
            this.f30113c = z10;
        }
    }

    /* access modifiers changed from: private */
    public static String s(int i10) {
        return u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String t(int i10) {
        return u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f30106b.h(this.f30105a);
        J.a("configureCodec");
        this.f30105a.configure(mediaFormat, surface, mediaCrypto, i10);
        J.c();
        this.f30107c.q();
        J.a("startCodec");
        this.f30105a.start();
        J.c();
        this.f30110f = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void x() {
        if (this.f30108d) {
            try {
                this.f30107c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f30107c.m(i10, i11, i12, j10, i13);
    }

    public void b(Bundle bundle) {
        x();
        this.f30105a.setParameters(bundle);
    }

    public MediaFormat c() {
        return this.f30106b.g();
    }

    public void d(int i10) {
        x();
        this.f30105a.setVideoScalingMode(i10);
    }

    public ByteBuffer e(int i10) {
        return this.f30105a.getInputBuffer(i10);
    }

    public void f(Surface surface) {
        x();
        this.f30105a.setOutputSurface(surface);
    }

    public void flush() {
        this.f30107c.i();
        this.f30105a.flush();
        this.f30106b.e();
        this.f30105a.start();
    }

    public boolean h() {
        return false;
    }

    public void i(int i10, long j10) {
        this.f30105a.releaseOutputBuffer(i10, j10);
    }

    public int j() {
        return this.f30106b.c();
    }

    public int k(MediaCodec.BufferInfo bufferInfo) {
        return this.f30106b.d(bufferInfo);
    }

    public void l(int i10, boolean z10) {
        this.f30105a.releaseOutputBuffer(i10, z10);
    }

    public ByteBuffer m(int i10) {
        return this.f30105a.getOutputBuffer(i10);
    }

    public void n(l.c cVar, Handler handler) {
        x();
        this.f30105a.setOnFrameRenderedListener(new a(this, cVar), handler);
    }

    public void o(int i10, int i11, C3867c cVar, long j10, int i12) {
        this.f30107c.n(i10, i11, cVar, j10, i12);
    }

    public void release() {
        try {
            if (this.f30110f == 1) {
                this.f30107c.p();
                this.f30106b.o();
            }
            this.f30110f = 2;
            if (!this.f30109e) {
                this.f30105a.release();
                this.f30109e = true;
            }
        } catch (Throwable th2) {
            if (!this.f30109e) {
                this.f30105a.release();
                this.f30109e = true;
            }
            throw th2;
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f30105a = mediaCodec;
        this.f30106b = new g(handlerThread);
        this.f30107c = new e(mediaCodec, handlerThread2);
        this.f30108d = z10;
        this.f30110f = 0;
    }
}
