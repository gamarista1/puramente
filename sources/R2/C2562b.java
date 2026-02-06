package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import f2.C1960A;
import f2.s;
import i2.H;
import i2.L;
import java.nio.ByteBuffer;
import l2.c;
import nb.u;
import r2.j;

/* renamed from: r2.b  reason: case insensitive filesystem */
final class C2562b implements j {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f25598a;

    /* renamed from: b  reason: collision with root package name */
    private final C2567g f25599b;

    /* renamed from: c  reason: collision with root package name */
    private final k f25600c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25601d;

    /* renamed from: e  reason: collision with root package name */
    private int f25602e;

    /* renamed from: r2.b$b  reason: collision with other inner class name */
    public static final class C0430b implements j.b {

        /* renamed from: a  reason: collision with root package name */
        private final u f25603a;

        /* renamed from: b  reason: collision with root package name */
        private final u f25604b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f25605c;

        public C0430b(int i10) {
            this(new C2563c(i10), new C2564d(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(C2562b.t(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread g(int i10) {
            return new HandlerThread(C2562b.u(i10));
        }

        private static boolean h(s sVar) {
            int i10 = L.f22072a;
            if (i10 < 34) {
                return false;
            }
            if (i10 >= 35 || C1960A.o(sVar.f20083n)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public r2.C2562b a(r2.j.a r7) {
            /*
                r6 = this;
                r2.m r0 = r7.f25645a
                java.lang.String r0 = r0.f25654a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
                r2.<init>()     // Catch:{ Exception -> 0x005f }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x005f }
                r2.append(r0)     // Catch:{ Exception -> 0x005f }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x005f }
                i2.H.a(r2)     // Catch:{ Exception -> 0x005f }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x005f }
                int r2 = r7.f25650f     // Catch:{ Exception -> 0x0033 }
                boolean r3 = r6.f25605c     // Catch:{ Exception -> 0x0033 }
                if (r3 == 0) goto L_0x0035
                f2.s r3 = r7.f25647c     // Catch:{ Exception -> 0x0033 }
                boolean r3 = h(r3)     // Catch:{ Exception -> 0x0033 }
                if (r3 == 0) goto L_0x0035
                r2.I r3 = new r2.I     // Catch:{ Exception -> 0x0033 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0033 }
                r2 = r2 | 4
                goto L_0x0042
            L_0x0033:
                r7 = move-exception
                goto L_0x0061
            L_0x0035:
                r2.e r3 = new r2.e     // Catch:{ Exception -> 0x0033 }
                nb.u r4 = r6.f25604b     // Catch:{ Exception -> 0x0033 }
                java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0033 }
                android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch:{ Exception -> 0x0033 }
                r3.<init>(r0, r4)     // Catch:{ Exception -> 0x0033 }
            L_0x0042:
                r2.b r4 = new r2.b     // Catch:{ Exception -> 0x0033 }
                nb.u r5 = r6.f25603a     // Catch:{ Exception -> 0x0033 }
                java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0033 }
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0033 }
                r4.<init>(r0, r5, r3)     // Catch:{ Exception -> 0x0033 }
                i2.H.b()     // Catch:{ Exception -> 0x005c }
                android.media.MediaFormat r1 = r7.f25646b     // Catch:{ Exception -> 0x005c }
                android.view.Surface r3 = r7.f25648d     // Catch:{ Exception -> 0x005c }
                android.media.MediaCrypto r7 = r7.f25649e     // Catch:{ Exception -> 0x005c }
                r4.w(r1, r3, r7, r2)     // Catch:{ Exception -> 0x005c }
                return r4
            L_0x005c:
                r7 = move-exception
                r1 = r4
                goto L_0x0061
            L_0x005f:
                r7 = move-exception
                r0 = r1
            L_0x0061:
                if (r1 != 0) goto L_0x0069
                if (r0 == 0) goto L_0x006c
                r0.release()
                goto L_0x006c
            L_0x0069:
                r1.release()
            L_0x006c:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.C2562b.C0430b.a(r2.j$a):r2.b");
        }

        public void e(boolean z10) {
            this.f25605c = z10;
        }

        C0430b(u uVar, u uVar2) {
            this.f25603a = uVar;
            this.f25604b = uVar2;
            this.f25605c = true;
        }
    }

    /* access modifiers changed from: private */
    public static String t(int i10) {
        return v(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String u(int i10) {
        return v(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String v(int i10, String str) {
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
    public void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f25599b.h(this.f25598a);
        H.a("configureCodec");
        this.f25598a.configure(mediaFormat, surface, mediaCrypto, i10);
        H.b();
        this.f25600c.start();
        H.a("startCodec");
        this.f25598a.start();
        H.b();
        this.f25602e = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(j.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f25600c.a(i10, i11, i12, j10, i13);
    }

    public void b(Bundle bundle) {
        this.f25600c.b(bundle);
    }

    public MediaFormat c() {
        return this.f25599b.g();
    }

    public void d(int i10) {
        this.f25598a.setVideoScalingMode(i10);
    }

    public ByteBuffer e(int i10) {
        return this.f25598a.getInputBuffer(i10);
    }

    public void f(Surface surface) {
        this.f25598a.setOutputSurface(surface);
    }

    public void flush() {
        this.f25600c.flush();
        this.f25598a.flush();
        this.f25599b.e();
        this.f25598a.start();
    }

    public void g(int i10, int i11, c cVar, long j10, int i12) {
        this.f25600c.g(i10, i11, cVar, j10, i12);
    }

    public boolean h() {
        return false;
    }

    public void i(int i10, long j10) {
        this.f25598a.releaseOutputBuffer(i10, j10);
    }

    public int j() {
        this.f25600c.c();
        return this.f25599b.c();
    }

    public int k(MediaCodec.BufferInfo bufferInfo) {
        this.f25600c.c();
        return this.f25599b.d(bufferInfo);
    }

    public void l(int i10, boolean z10) {
        this.f25598a.releaseOutputBuffer(i10, z10);
    }

    public ByteBuffer m(int i10) {
        return this.f25598a.getOutputBuffer(i10);
    }

    public boolean n(j.c cVar) {
        this.f25599b.p(cVar);
        return true;
    }

    public void o(j.d dVar, Handler handler) {
        this.f25598a.setOnFrameRenderedListener(new C2561a(this, dVar), handler);
    }

    public void release() {
        try {
            if (this.f25602e == 1) {
                this.f25600c.shutdown();
                this.f25599b.q();
            }
            this.f25602e = 2;
            if (!this.f25601d) {
                try {
                    int i10 = L.f22072a;
                    if (i10 >= 30 && i10 < 33) {
                        this.f25598a.stop();
                    }
                } finally {
                    this.f25598a.release();
                    this.f25601d = true;
                }
            }
        } catch (Throwable th2) {
            if (!this.f25601d) {
                int i11 = L.f22072a;
                if (i11 >= 30 && i11 < 33) {
                    this.f25598a.stop();
                }
            }
            throw th2;
        } finally {
            this.f25598a.release();
            this.f25601d = true;
        }
    }

    private C2562b(MediaCodec mediaCodec, HandlerThread handlerThread, k kVar) {
        this.f25598a = mediaCodec;
        this.f25599b = new C2567g(handlerThread);
        this.f25600c = kVar;
        this.f25602e = 0;
    }
}
