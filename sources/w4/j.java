package W4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class j implements d {

    /* renamed from: k  reason: collision with root package name */
    private static final Bitmap.Config f34829k = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    private final k f34830a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f34831b;

    /* renamed from: c  reason: collision with root package name */
    private final long f34832c;

    /* renamed from: d  reason: collision with root package name */
    private final a f34833d;

    /* renamed from: e  reason: collision with root package name */
    private long f34834e;

    /* renamed from: f  reason: collision with root package name */
    private long f34835f;

    /* renamed from: g  reason: collision with root package name */
    private int f34836g;

    /* renamed from: h  reason: collision with root package name */
    private int f34837h;

    /* renamed from: i  reason: collision with root package name */
    private int f34838i;

    /* renamed from: j  reason: collision with root package name */
    private int f34839j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    j(long j10, k kVar, Set set) {
        this.f34832c = j10;
        this.f34834e = j10;
        this.f34830a = kVar;
        this.f34831b = set;
        this.f34833d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f34829k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f34836g + ", misses=" + this.f34837h + ", puts=" + this.f34838i + ", evictions=" + this.f34839j + ", currentSize=" + this.f34835f + ", maxSize=" + this.f34834e + "\nStrategy=" + this.f34830a);
    }

    private void j() {
        q(this.f34834e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap d10;
        try {
            f(config);
            k kVar = this.f34830a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f34829k;
            }
            d10 = kVar.d(i10, i11, config2);
            if (d10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f34830a.b(i10, i11, config));
                }
                this.f34837h++;
            } else {
                this.f34836g++;
                this.f34835f -= (long) this.f34830a.e(d10);
                this.f34833d.a(d10);
                p(d10);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f34830a.b(i10, i11, config));
            }
            h();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return d10;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f34835f > j10) {
            try {
                Bitmap removeLast = this.f34830a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f34835f = 0;
                    return;
                }
                this.f34833d.a(removeLast);
                this.f34835f -= (long) this.f34830a.e(removeLast);
                this.f34839j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f34830a.a(removeLast));
                }
                h();
                removeLast.recycle();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0);
    }

    public synchronized void c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f34830a.e(bitmap)) <= this.f34834e) {
                        if (this.f34831b.contains(bitmap.getConfig())) {
                            int e10 = this.f34830a.e(bitmap);
                            this.f34830a.c(bitmap);
                            this.f34833d.b(bitmap);
                            this.f34838i++;
                            this.f34835f += (long) e10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f34830a.a(bitmap));
                            }
                            h();
                            j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f34830a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f34831b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        m10.eraseColor(0);
        return m10;
    }

    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        return m10;
    }

    public long n() {
        return this.f34834e;
    }

    public j(long j10) {
        this(j10, l(), k());
    }

    private static final class b implements a {
        b() {
        }

        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }
}
