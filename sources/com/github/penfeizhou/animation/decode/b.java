package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public abstract class b {

    /* renamed from: u  reason: collision with root package name */
    private static final String f42712u = "b";
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final Rect f42713v = new Rect();

    /* renamed from: a  reason: collision with root package name */
    private final int f42714a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final N8.b f42715b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Handler f42716c;

    /* renamed from: d  reason: collision with root package name */
    protected List f42717d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    protected int f42718e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f42719f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f42720g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Set f42721h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f42722i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f42723j;

    /* renamed from: k  reason: collision with root package name */
    protected int f42724k;

    /* renamed from: l  reason: collision with root package name */
    private final Set f42725l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f42726m;

    /* renamed from: n  reason: collision with root package name */
    protected Map f42727n;

    /* renamed from: o  reason: collision with root package name */
    protected ByteBuffer f42728o;

    /* renamed from: p  reason: collision with root package name */
    protected volatile Rect f42729p;

    /* renamed from: q  reason: collision with root package name */
    private com.github.penfeizhou.animation.io.e f42730q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public Reader f42731r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f42732s;

    /* renamed from: t  reason: collision with root package name */
    private volatile k f42733t;

    class a implements Runnable {
        a() {
        }

        public void run() {
            if (!b.this.f42722i.get()) {
                if (b.this.q()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long g10 = b.this.Q();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    b.this.f42716c.removeCallbacks(b.this.f42723j);
                    b.this.f42716c.postDelayed(this, Math.max(0, g10 - currentTimeMillis2));
                    for (j jVar : b.this.f42721h) {
                        ByteBuffer byteBuffer = b.this.f42728o;
                        if (byteBuffer != null) {
                            jVar.a(byteBuffer);
                        }
                    }
                    return;
                }
                b.this.R();
            }
        }
    }

    /* renamed from: com.github.penfeizhou.animation.decode.b$b  reason: collision with other inner class name */
    class C0658b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f42735a;

        C0658b(j jVar) {
            this.f42735a = jVar;
        }

        public void run() {
            b.this.f42721h.add(this.f42735a);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f42737a;

        c(j jVar) {
            this.f42737a = jVar;
        }

        public void run() {
            b.this.f42721h.remove(this.f42737a);
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            if (b.this.f42721h.size() == 0) {
                b.this.R();
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread f42740a;

        e(Thread thread) {
            this.f42740a = thread;
        }

        public void run() {
            try {
                if (b.this.f42729p == null) {
                    if (b.this.f42731r == null) {
                        b bVar = b.this;
                        Reader unused = bVar.f42731r = bVar.A(bVar.f42715b.a());
                    } else {
                        b.this.f42731r.reset();
                    }
                    b bVar2 = b.this;
                    bVar2.D(bVar2.I(bVar2.f42731r));
                }
            } catch (Exception e10) {
                e = e10;
                try {
                    e.printStackTrace();
                    b.this.f42729p = b.f42713v;
                    LockSupport.unpark(this.f42740a);
                } catch (Throwable th2) {
                    LockSupport.unpark(this.f42740a);
                    throw th2;
                }
            } catch (OutOfMemoryError e11) {
                e = e11;
                e.printStackTrace();
                b.this.f42729p = b.f42713v;
                LockSupport.unpark(this.f42740a);
            }
            LockSupport.unpark(this.f42740a);
        }
    }

    class f implements Runnable {
        f() {
        }

        public void run() {
            b.this.E();
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            b.this.F();
        }
    }

    class h implements Runnable {
        h() {
        }

        public void run() {
            int unused = b.this.f42719f = 0;
            b bVar = b.this;
            bVar.f42718e = -1;
            boolean unused2 = bVar.f42732s = false;
        }
    }

    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f42746b;

        i(int i10, boolean z10) {
            this.f42745a = i10;
            this.f42746b = z10;
        }

        public void run() {
            b.this.F();
            try {
                b bVar = b.this;
                bVar.f42724k = this.f42745a;
                bVar.D(bVar.I(bVar.A(bVar.f42715b.a())));
                if (this.f42746b) {
                    b.this.E();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public interface j {
        void a(ByteBuffer byteBuffer);

        void b();

        void onStart();
    }

    private enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public b(N8.b bVar, j jVar) {
        HashSet hashSet = new HashSet();
        this.f42721h = hashSet;
        this.f42722i = new AtomicBoolean(true);
        this.f42723j = new a();
        this.f42724k = 1;
        this.f42725l = new HashSet();
        this.f42726m = new Object();
        this.f42727n = new WeakHashMap();
        this.f42730q = C();
        this.f42731r = null;
        this.f42732s = false;
        this.f42733t = k.IDLE;
        this.f42715b = bVar;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int a10 = I8.a.b().a();
        this.f42714a = a10;
        this.f42716c = new Handler(I8.a.b().c(a10));
    }

    /* access modifiers changed from: private */
    public void D(Rect rect) {
        this.f42729p = rect;
        int i10 = this.f42724k;
        long width = (((((long) rect.width()) * ((long) rect.height())) / (((long) i10) * ((long) i10))) + 1) * 4;
        try {
            this.f42728o = ByteBuffer.allocate((int) width);
            if (this.f42730q == null) {
                this.f42730q = C();
            }
        } catch (OutOfMemoryError e10) {
            Log.e(f42712u, String.format("OutOfMemoryError in FrameSeqDecoder: Buffer needed: %.2fMB (%,d bytes)", new Object[]{Double.valueOf(((double) width) / 1048576.0d), Long.valueOf(width)}));
            this.f42728o = null;
            this.f42729p = f42713v;
            throw e10;
        }
    }

    /* access modifiers changed from: private */
    public void E() {
        this.f42722i.compareAndSet(true, false);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (w() == 0) {
                Reader reader = this.f42731r;
                if (reader == null) {
                    this.f42731r = A(this.f42715b.a());
                } else {
                    reader.reset();
                }
                D(I(this.f42731r));
            }
        } catch (Throwable th2) {
            String str = f42712u;
            Log.i(str, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.f42733t = k.RUNNING;
            throw th2;
        }
        String str2 = f42712u;
        Log.i(str2, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
        this.f42733t = k.RUNNING;
        if (z() == 0 || !this.f42732s) {
            this.f42718e = -1;
            this.f42716c.removeCallbacks(this.f42723j);
            this.f42723j.run();
            for (j onStart : this.f42721h) {
                onStart.onStart();
            }
            return;
        }
        Log.i(str2, r() + " No need to started");
    }

    /* access modifiers changed from: private */
    public void F() {
        this.f42716c.removeCallbacks(this.f42723j);
        this.f42717d.clear();
        synchronized (this.f42726m) {
            try {
                for (Bitmap bitmap : this.f42725l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f42725l.clear();
            } finally {
                while (true) {
                }
            }
        }
        if (this.f42728o != null) {
            this.f42728o = null;
        }
        this.f42727n.clear();
        try {
            Reader reader = this.f42731r;
            if (reader != null) {
                reader.close();
                this.f42731r = null;
            }
            com.github.penfeizhou.animation.io.e eVar = this.f42730q;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        K();
        this.f42733t = k.IDLE;
        for (j b10 : this.f42721h) {
            b10.b();
        }
    }

    /* access modifiers changed from: private */
    public long Q() {
        int i10 = this.f42718e + 1;
        this.f42718e = i10;
        if (i10 >= w()) {
            this.f42718e = 0;
            this.f42719f++;
        }
        a u10 = u(this.f42718e);
        if (u10 == null) {
            return 0;
        }
        M(u10);
        return (long) u10.frameDuration;
    }

    /* access modifiers changed from: private */
    public boolean q() {
        if (!G() || w() == 0) {
            return false;
        }
        if (z() <= 0 || this.f42719f < z() - 1) {
            return true;
        }
        if (this.f42719f == z() - 1 && this.f42718e < w() - 1) {
            return true;
        }
        this.f42732s = true;
        return false;
    }

    private String r() {
        return "";
    }

    private int z() {
        Integer num = this.f42720g;
        if (num != null) {
            return num.intValue();
        }
        return x();
    }

    /* access modifiers changed from: protected */
    public abstract Reader A(Reader reader);

    public int B() {
        return this.f42724k;
    }

    /* access modifiers changed from: protected */
    public abstract com.github.penfeizhou.animation.io.e C();

    public boolean G() {
        if (this.f42733t == k.RUNNING || this.f42733t == k.INITIALIZING) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0060, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap H(int r7, int r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f42726m
            monitor-enter(r0)
            java.util.Set r1 = r6.f42725l     // Catch:{ all -> 0x0033 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0033 }
            r2 = 0
            r3 = r2
        L_0x000b:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0046
            int r3 = r7 * r8
            int r3 = r3 * 4
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0033 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0044
            int r5 = r4.getAllocationByteCount()     // Catch:{ all -> 0x0033 }
            if (r5 < r3) goto L_0x0044
            r1.remove()     // Catch:{ all -> 0x0033 }
            int r1 = r4.getWidth()     // Catch:{ all -> 0x0033 }
            if (r1 != r7) goto L_0x0035
            int r1 = r4.getHeight()     // Catch:{ all -> 0x0033 }
            if (r1 == r8) goto L_0x003e
            goto L_0x0035
        L_0x0033:
            r7 = move-exception
            goto L_0x0061
        L_0x0035:
            if (r7 <= 0) goto L_0x003e
            if (r8 <= 0) goto L_0x003e
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0033 }
            r4.reconfigure(r7, r8, r1)     // Catch:{ all -> 0x0033 }
        L_0x003e:
            r7 = 0
            r4.eraseColor(r7)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0044:
            r3 = r4
            goto L_0x000b
        L_0x0046:
            if (r7 <= 0) goto L_0x005f
            if (r8 > 0) goto L_0x004b
            goto L_0x005f
        L_0x004b:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0054, OutOfMemoryError -> 0x0052 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r7, r8, r1)     // Catch:{ Exception -> 0x0054, OutOfMemoryError -> 0x0052 }
            goto L_0x005d
        L_0x0052:
            r7 = move-exception
            goto L_0x0056
        L_0x0054:
            r7 = move-exception
            goto L_0x005a
        L_0x0056:
            r7.printStackTrace()     // Catch:{ all -> 0x0033 }
            goto L_0x005d
        L_0x005a:
            r7.printStackTrace()     // Catch:{ all -> 0x0033 }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r3
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r2
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.penfeizhou.animation.decode.b.H(int, int):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    public abstract Rect I(Reader reader);

    /* access modifiers changed from: protected */
    public void J(Bitmap bitmap) {
        synchronized (this.f42726m) {
            if (bitmap != null) {
                try {
                    this.f42725l.add(bitmap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void K();

    public void L(j jVar) {
        this.f42716c.post(new c(jVar));
    }

    /* access modifiers changed from: protected */
    public abstract void M(a aVar);

    public void N() {
        this.f42716c.post(new h());
    }

    public int O(int i10, int i11) {
        int t10 = t(i10, i11);
        if (t10 != B()) {
            boolean G10 = G();
            this.f42716c.removeCallbacks(this.f42723j);
            this.f42716c.post(new i(t10, G10));
        }
        return t10;
    }

    public void P() {
        k kVar;
        if (this.f42729p != f42713v) {
            if (this.f42733t == k.RUNNING || this.f42733t == (kVar = k.INITIALIZING)) {
                String str = f42712u;
                Log.i(str, r() + " Already started");
                return;
            }
            if (this.f42733t == k.FINISHING) {
                String str2 = f42712u;
                Log.e(str2, r() + " Processing,wait for finish at " + this.f42733t);
            }
            this.f42733t = kVar;
            if (Looper.myLooper() == this.f42716c.getLooper()) {
                E();
            } else {
                this.f42716c.post(new f());
            }
        }
    }

    public void R() {
        if (this.f42729p != f42713v) {
            k kVar = this.f42733t;
            k kVar2 = k.FINISHING;
            if (kVar == kVar2 || this.f42733t == k.IDLE) {
                String str = f42712u;
                Log.i(str, r() + "No need to stop");
                return;
            }
            if (this.f42733t == k.INITIALIZING) {
                String str2 = f42712u;
                Log.e(str2, r() + "Processing,wait for finish at " + this.f42733t);
            }
            this.f42733t = kVar2;
            if (Looper.myLooper() == this.f42716c.getLooper()) {
                F();
            } else {
                this.f42716c.post(new g());
            }
        }
    }

    public void S() {
        this.f42716c.post(new d());
    }

    public void p(j jVar) {
        this.f42716c.post(new C0658b(jVar));
    }

    public Rect s() {
        if (this.f42729p == null) {
            if (this.f42733t == k.FINISHING) {
                Log.e(f42712u, "In finishing,do not interrupt");
            }
            Thread currentThread = Thread.currentThread();
            this.f42716c.post(new e(currentThread));
            LockSupport.park(currentThread);
        }
        if (this.f42729p == null) {
            return f42713v;
        }
        return this.f42729p;
    }

    /* access modifiers changed from: protected */
    public int t(int i10, int i11) {
        int i12 = 1;
        if (i10 != 0 && i11 != 0) {
            int min = Math.min(s().width() / i10, s().height() / i11);
            while (true) {
                int i13 = i12 * 2;
                if (i13 > min) {
                    break;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    public a u(int i10) {
        if (i10 < 0 || i10 >= this.f42717d.size()) {
            return null;
        }
        return (a) this.f42717d.get(i10);
    }

    public Bitmap v(int i10) {
        if (this.f42733t != k.IDLE) {
            String str = f42712u;
            Log.e(str, r() + ",stop first");
            return null;
        }
        this.f42733t = k.RUNNING;
        int i11 = 0;
        this.f42722i.compareAndSet(true, false);
        if (this.f42717d.size() == 0) {
            Reader reader = this.f42731r;
            if (reader == null) {
                this.f42731r = A(this.f42715b.a());
            } else {
                reader.reset();
            }
            D(I(this.f42731r));
        }
        if (i10 < 0) {
            i10 += this.f42717d.size();
        }
        if (i10 >= 0) {
            i11 = i10;
        }
        this.f42718e = -1;
        while (this.f42718e < i11 && q()) {
            Q();
        }
        this.f42728o.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(this.f42728o);
        F();
        return createBitmap;
    }

    public int w() {
        return this.f42717d.size();
    }

    /* access modifiers changed from: protected */
    public abstract int x();

    public int y() {
        int i10;
        synchronized (this.f42726m) {
            try {
                i10 = 0;
                for (Bitmap bitmap : this.f42725l) {
                    if (!bitmap.isRecycled()) {
                        i10 += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f42728o;
                if (byteBuffer != null) {
                    i10 += byteBuffer.capacity();
                }
            } finally {
            }
        }
        return i10;
    }
}
