package g5;

import P4.a;
import P4.c;
import P4.d;
import P4.e;
import T4.i;
import T4.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import b5.C3155f;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import o5.g;
import o5.l;

/* renamed from: g5.a  reason: case insensitive filesystem */
public class C3528a implements k {

    /* renamed from: f  reason: collision with root package name */
    private static final C0671a f43603f = new C0671a();

    /* renamed from: g  reason: collision with root package name */
    private static final b f43604g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f43605a;

    /* renamed from: b  reason: collision with root package name */
    private final List f43606b;

    /* renamed from: c  reason: collision with root package name */
    private final b f43607c;

    /* renamed from: d  reason: collision with root package name */
    private final C0671a f43608d;

    /* renamed from: e  reason: collision with root package name */
    private final C3529b f43609e;

    /* renamed from: g5.a$a  reason: collision with other inner class name */
    static class C0671a {
        C0671a() {
        }

        /* access modifiers changed from: package-private */
        public a a(a.C0546a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
            return new e(aVar, cVar, byteBuffer, i10);
        }
    }

    /* renamed from: g5.a$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue f43610a = l.g(0);

        b() {
        }

        /* access modifiers changed from: package-private */
        public synchronized d a(ByteBuffer byteBuffer) {
            d dVar;
            try {
                dVar = (d) this.f43610a.poll();
                if (dVar == null) {
                    dVar = new d();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return dVar.p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        public synchronized void b(d dVar) {
            dVar.a();
            this.f43610a.offer(dVar);
        }
    }

    public C3528a(Context context, List list, W4.d dVar, W4.b bVar) {
        this(context, list, dVar, bVar, f43604g, f43603f);
    }

    private C3532e c(ByteBuffer byteBuffer, int i10, int i11, d dVar, i iVar) {
        Bitmap.Config config;
        long b10 = g.b();
        try {
            c c10 = dVar.c();
            if (c10.b() > 0) {
                if (c10.c() == 0) {
                    if (iVar.c(C3536i.f43650a) == T4.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    a a10 = this.f43608d.a(this.f43609e, c10, byteBuffer, e(c10, i10, i11));
                    a10.d(config);
                    a10.c();
                    Bitmap b11 = a10.b();
                    if (b11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g.a(b10));
                        }
                        return null;
                    }
                    C3532e eVar = new C3532e(new C3530c(this.f43605a, a10, C3155f.c(), i10, i11, b11));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g.a(b10));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g.a(b10));
            }
        }
    }

    private static int e(c cVar, int i10, int i11) {
        int i12;
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        if (min == 0) {
            i12 = 0;
        } else {
            i12 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i12);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C3532e b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        d a10 = this.f43607c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, iVar);
        } finally {
            this.f43607c.b(a10);
        }
    }

    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        if (((Boolean) iVar.c(C3536i.f43651b)).booleanValue() || com.bumptech.glide.load.a.g(this.f43606b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    C3528a(Context context, List list, W4.d dVar, W4.b bVar, b bVar2, C0671a aVar) {
        this.f43605a = context.getApplicationContext();
        this.f43606b = list;
        this.f43608d = aVar;
        this.f43609e = new C3529b(dVar, bVar);
        this.f43607c = bVar2;
    }
}
