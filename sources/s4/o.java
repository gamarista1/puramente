package S4;

import T4.f;
import T4.h;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import l5.j;
import m5.C3775b;
import n5.C3861d;
import o5.k;

public class o {

    /* renamed from: s  reason: collision with root package name */
    public static final h f33908s = h.f("com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy", n.f33897d);

    /* renamed from: a  reason: collision with root package name */
    private final i f33909a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f33910b;

    /* renamed from: c  reason: collision with root package name */
    private final List f33911c;

    /* renamed from: d  reason: collision with root package name */
    final m f33912d;

    /* renamed from: e  reason: collision with root package name */
    private final W4.d f33913e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f33914f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f33915g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33916h;

    /* renamed from: i  reason: collision with root package name */
    private l f33917i;

    /* renamed from: j  reason: collision with root package name */
    private a f33918j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f33919k;

    /* renamed from: l  reason: collision with root package name */
    private a f33920l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f33921m;

    /* renamed from: n  reason: collision with root package name */
    private T4.m f33922n;

    /* renamed from: o  reason: collision with root package name */
    private a f33923o;

    /* renamed from: p  reason: collision with root package name */
    private int f33924p;

    /* renamed from: q  reason: collision with root package name */
    private int f33925q;

    /* renamed from: r  reason: collision with root package name */
    private int f33926r;

    static class a extends l5.c {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f33927d;

        /* renamed from: e  reason: collision with root package name */
        final int f33928e;

        /* renamed from: f  reason: collision with root package name */
        private final long f33929f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f33930g;

        a(Handler handler, int i10, long j10) {
            this.f33927d = handler;
            this.f33928e = i10;
            this.f33929f = j10;
        }

        public void d(Drawable drawable) {
            this.f33930g = null;
        }

        /* access modifiers changed from: package-private */
        public Bitmap e() {
            return this.f33930g;
        }

        /* renamed from: j */
        public void h(Bitmap bitmap, C3775b bVar) {
            this.f33930g = bitmap;
            this.f33927d.sendMessageAtTime(this.f33927d.obtainMessage(1, this), this.f33929f);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                o.this.n((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                o.this.f33912d.clear((j) (a) message.obj);
                return false;
            }
        }
    }

    private static class d implements f {

        /* renamed from: b  reason: collision with root package name */
        private final f f33932b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33933c;

        d(f fVar, int i10) {
            this.f33932b = fVar;
            this.f33933c = i10;
        }

        public void b(MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.f33933c).array());
            this.f33932b.b(messageDigest);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f33932b.equals(dVar.f33932b) || this.f33933c != dVar.f33933c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f33932b.hashCode() * 31) + this.f33933c;
        }
    }

    public o(com.bumptech.glide.c cVar, i iVar, int i10, int i11, T4.m mVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.D(cVar.j()), iVar, (Handler) null, j(com.bumptech.glide.c.D(cVar.j()), i10, i11), mVar, bitmap);
    }

    private f g(int i10) {
        return new d(new C3861d(this.f33909a), i10);
    }

    private static l j(m mVar, int i10, int i11) {
        return mVar.asBitmap().apply(((com.bumptech.glide.request.h) ((com.bumptech.glide.request.h) com.bumptech.glide.request.h.diskCacheStrategyOf(V4.j.f34539b).useAnimationPool(true)).skipMemoryCache(true)).override(i10, i11));
    }

    private void m() {
        boolean z10;
        if (this.f33914f && !this.f33915g) {
            if (this.f33916h) {
                if (this.f33923o == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k.a(z10, "Pending target must be null when starting from the first frame");
                this.f33909a.f();
                this.f33916h = false;
            }
            a aVar = this.f33923o;
            if (aVar != null) {
                this.f33923o = null;
                n(aVar);
                return;
            }
            this.f33915g = true;
            int e10 = this.f33909a.e();
            this.f33909a.c();
            int g10 = this.f33909a.g();
            this.f33920l = new a(this.f33910b, g10, SystemClock.uptimeMillis() + ((long) e10));
            this.f33917i.apply((com.bumptech.glide.request.a) (com.bumptech.glide.request.h) com.bumptech.glide.request.h.signatureOf(g(g10)).skipMemoryCache(this.f33909a.l().c())).load((Object) this.f33909a).into(this.f33920l);
        }
    }

    private void o() {
        Bitmap bitmap = this.f33921m;
        if (bitmap != null) {
            this.f33913e.c(bitmap);
            this.f33921m = null;
        }
    }

    private void q() {
        if (!this.f33914f) {
            this.f33914f = true;
            this.f33919k = false;
            m();
        }
    }

    private void r() {
        this.f33914f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f33911c.clear();
        o();
        r();
        a aVar = this.f33918j;
        if (aVar != null) {
            this.f33912d.clear((j) aVar);
            this.f33918j = null;
        }
        a aVar2 = this.f33920l;
        if (aVar2 != null) {
            this.f33912d.clear((j) aVar2);
            this.f33920l = null;
        }
        a aVar3 = this.f33923o;
        if (aVar3 != null) {
            this.f33912d.clear((j) aVar3);
            this.f33923o = null;
        }
        this.f33909a.clear();
        this.f33919k = true;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f33909a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f33918j;
        if (aVar != null) {
            return aVar.e();
        }
        return this.f33921m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f33918j;
        if (aVar != null) {
            return aVar.f33928e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f33921m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f33909a.a();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f33926r;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f33909a.n();
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f33909a.h() + this.f33924p;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f33925q;
    }

    /* access modifiers changed from: package-private */
    public void n(a aVar) {
        this.f33915g = false;
        if (this.f33919k) {
            this.f33910b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f33914f) {
            if (aVar.e() != null) {
                o();
                a aVar2 = this.f33918j;
                this.f33918j = aVar;
                for (int size = this.f33911c.size() - 1; size >= 0; size--) {
                    try {
                        b bVar = (b) this.f33911c.get(size);
                        if (bVar != null) {
                            bVar.a();
                        }
                    } catch (IndexOutOfBoundsException e10) {
                        e10.printStackTrace();
                    }
                }
                if (aVar2 != null) {
                    this.f33910b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m();
        } else if (this.f33916h) {
            this.f33910b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f33923o = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void p(T4.m mVar, Bitmap bitmap) {
        this.f33922n = (T4.m) k.d(mVar);
        this.f33921m = (Bitmap) k.d(bitmap);
        this.f33917i = this.f33917i.apply(new com.bumptech.glide.request.h().transform(mVar));
        this.f33924p = o5.l.i(bitmap);
        this.f33925q = bitmap.getWidth();
        this.f33926r = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        if (this.f33919k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f33911c.contains(bVar)) {
            boolean isEmpty = this.f33911c.isEmpty();
            this.f33911c.add(bVar);
            if (isEmpty) {
                q();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void t(b bVar) {
        this.f33911c.remove(bVar);
        if (this.f33911c.isEmpty()) {
            r();
        }
    }

    o(W4.d dVar, m mVar, i iVar, Handler handler, l lVar, T4.m mVar2, Bitmap bitmap) {
        this.f33911c = new ArrayList();
        this.f33914f = false;
        this.f33915g = false;
        this.f33916h = false;
        this.f33912d = mVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f33913e = dVar;
        this.f33910b = handler;
        this.f33917i = lVar;
        this.f33909a = iVar;
        p(mVar2, bitmap);
    }
}
