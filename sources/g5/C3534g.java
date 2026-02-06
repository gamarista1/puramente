package g5;

import T4.f;
import W4.d;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import com.bumptech.glide.request.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l5.j;
import m5.C3775b;
import n5.C3861d;
import o5.k;

/* renamed from: g5.g  reason: case insensitive filesystem */
class C3534g {

    /* renamed from: a  reason: collision with root package name */
    private final P4.a f43626a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f43627b;

    /* renamed from: c  reason: collision with root package name */
    private final List f43628c;

    /* renamed from: d  reason: collision with root package name */
    final m f43629d;

    /* renamed from: e  reason: collision with root package name */
    private final d f43630e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f43631f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f43632g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f43633h;

    /* renamed from: i  reason: collision with root package name */
    private l f43634i;

    /* renamed from: j  reason: collision with root package name */
    private a f43635j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f43636k;

    /* renamed from: l  reason: collision with root package name */
    private a f43637l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f43638m;

    /* renamed from: n  reason: collision with root package name */
    private T4.m f43639n;

    /* renamed from: o  reason: collision with root package name */
    private a f43640o;

    /* renamed from: p  reason: collision with root package name */
    private int f43641p;

    /* renamed from: q  reason: collision with root package name */
    private int f43642q;

    /* renamed from: r  reason: collision with root package name */
    private int f43643r;

    /* renamed from: g5.g$a */
    static class a extends l5.c {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f43644d;

        /* renamed from: e  reason: collision with root package name */
        final int f43645e;

        /* renamed from: f  reason: collision with root package name */
        private final long f43646f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f43647g;

        a(Handler handler, int i10, long j10) {
            this.f43644d = handler;
            this.f43645e = i10;
            this.f43646f = j10;
        }

        public void d(Drawable drawable) {
            this.f43647g = null;
        }

        /* access modifiers changed from: package-private */
        public Bitmap e() {
            return this.f43647g;
        }

        /* renamed from: j */
        public void h(Bitmap bitmap, C3775b bVar) {
            this.f43647g = bitmap;
            this.f43644d.sendMessageAtTime(this.f43644d.obtainMessage(1, this), this.f43646f);
        }
    }

    /* renamed from: g5.g$b */
    public interface b {
        void a();
    }

    /* renamed from: g5.g$c */
    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C3534g.this.m((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                C3534g.this.f43629d.clear((j) (a) message.obj);
                return false;
            }
        }
    }

    C3534g(com.bumptech.glide.c cVar, P4.a aVar, int i10, int i11, T4.m mVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.D(cVar.j()), aVar, (Handler) null, i(com.bumptech.glide.c.D(cVar.j()), i10, i11), mVar, bitmap);
    }

    private static f g() {
        return new C3861d(Double.valueOf(Math.random()));
    }

    private static l i(m mVar, int i10, int i11) {
        return mVar.asBitmap().apply(((h) ((h) h.diskCacheStrategyOf(V4.j.f34539b).useAnimationPool(true)).skipMemoryCache(true)).override(i10, i11));
    }

    private void l() {
        boolean z10;
        if (this.f43631f && !this.f43632g) {
            if (this.f43633h) {
                if (this.f43640o == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k.a(z10, "Pending target must be null when starting from the first frame");
                this.f43626a.f();
                this.f43633h = false;
            }
            a aVar = this.f43640o;
            if (aVar != null) {
                this.f43640o = null;
                m(aVar);
                return;
            }
            this.f43632g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f43626a.e());
            this.f43626a.c();
            this.f43637l = new a(this.f43627b, this.f43626a.g(), uptimeMillis);
            this.f43634i.apply((com.bumptech.glide.request.a) h.signatureOf(g())).load((Object) this.f43626a).into(this.f43637l);
        }
    }

    private void n() {
        Bitmap bitmap = this.f43638m;
        if (bitmap != null) {
            this.f43630e.c(bitmap);
            this.f43638m = null;
        }
    }

    private void p() {
        if (!this.f43631f) {
            this.f43631f = true;
            this.f43636k = false;
            l();
        }
    }

    private void q() {
        this.f43631f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f43628c.clear();
        n();
        q();
        a aVar = this.f43635j;
        if (aVar != null) {
            this.f43629d.clear((j) aVar);
            this.f43635j = null;
        }
        a aVar2 = this.f43637l;
        if (aVar2 != null) {
            this.f43629d.clear((j) aVar2);
            this.f43637l = null;
        }
        a aVar3 = this.f43640o;
        if (aVar3 != null) {
            this.f43629d.clear((j) aVar3);
            this.f43640o = null;
        }
        this.f43626a.clear();
        this.f43636k = true;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f43626a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f43635j;
        if (aVar != null) {
            return aVar.e();
        }
        return this.f43638m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f43635j;
        if (aVar != null) {
            return aVar.f43645e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f43638m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f43626a.a();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f43643r;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f43626a.h() + this.f43641p;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f43642q;
    }

    /* access modifiers changed from: package-private */
    public void m(a aVar) {
        this.f43632g = false;
        if (this.f43636k) {
            this.f43627b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f43631f) {
            if (aVar.e() != null) {
                n();
                a aVar2 = this.f43635j;
                this.f43635j = aVar;
                for (int size = this.f43628c.size() - 1; size >= 0; size--) {
                    ((b) this.f43628c.get(size)).a();
                }
                if (aVar2 != null) {
                    this.f43627b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        } else if (this.f43633h) {
            this.f43627b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f43640o = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void o(T4.m mVar, Bitmap bitmap) {
        this.f43639n = (T4.m) k.d(mVar);
        this.f43638m = (Bitmap) k.d(bitmap);
        this.f43634i = this.f43634i.apply(new h().transform(mVar));
        this.f43641p = o5.l.i(bitmap);
        this.f43642q = bitmap.getWidth();
        this.f43643r = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        if (this.f43636k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f43628c.contains(bVar)) {
            boolean isEmpty = this.f43628c.isEmpty();
            this.f43628c.add(bVar);
            if (isEmpty) {
                p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f43628c.remove(bVar);
        if (this.f43628c.isEmpty()) {
            q();
        }
    }

    C3534g(d dVar, m mVar, P4.a aVar, Handler handler, l lVar, T4.m mVar2, Bitmap bitmap) {
        this.f43628c = new ArrayList();
        this.f43629d = mVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f43630e = dVar;
        this.f43627b = handler;
        this.f43634i = lVar;
        this.f43626a = aVar;
        o(mVar2, bitmap);
    }
}
