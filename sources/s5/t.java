package s5;

import W6.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import d6.C3477c;
import i7.C3593b;
import i7.C3594c;
import java.util.concurrent.atomic.AtomicInteger;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f48064a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f48065b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f48066c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f48067d;

    /* renamed from: e  reason: collision with root package name */
    private d f48068e;

    class a extends Y6.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f48069a;

        a(t tVar) {
            this.f48069a = tVar;
        }

        public void e(C3477c cVar) {
            this.f48069a.e((Bitmap) null);
        }

        public void g(Bitmap bitmap) {
            this.f48069a.e(bitmap);
        }
    }

    class b extends Y6.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f48071a;

        b(t tVar) {
            this.f48071a = tVar;
        }

        public void e(C3477c cVar) {
            this.f48071a.g((Bitmap) null);
        }

        public void g(Bitmap bitmap) {
            this.f48071a.g(bitmap);
        }
    }

    class c extends Y6.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f48073a;

        c(t tVar) {
            this.f48073a = tVar;
        }

        public void e(C3477c cVar) {
            this.f48073a.c((Bitmap) null);
        }

        public void g(Bitmap bitmap) {
            this.f48073a.c(bitmap);
        }
    }

    interface d {
        void a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);
    }

    public t(d dVar) {
        this.f48068e = dVar;
    }

    private void a(Context context, Uri uri, Y6.b bVar) {
        C3593b a10 = C3594c.x(uri).M(f.HIGH).I(C3593b.c.FULL_FETCH).a();
        if (!j6.d.c()) {
            j6.d.d(context);
        }
        j6.d.a().k(a10, context).e(bVar, R5.a.a());
    }

    private void b() {
        d dVar;
        synchronized (this.f48064a) {
            try {
                if (this.f48064a.incrementAndGet() >= 3 && (dVar = this.f48068e) != null) {
                    dVar.a(this.f48065b, this.f48066c, this.f48067d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(Bitmap bitmap) {
        this.f48067d = bitmap;
        b();
    }

    public void d(Context context, String str) {
        if (str == null) {
            c((Bitmap) null);
            return;
        }
        try {
            a(context, Uri.parse(str), new c(this));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse bigLargeIconUrl", e10);
            c((Bitmap) null);
        }
    }

    public void e(Bitmap bitmap) {
        this.f48066c = bitmap;
        b();
    }

    public void f(Context context, String str) {
        if (str == null) {
            e((Bitmap) null);
            return;
        }
        try {
            a(context, Uri.parse(str), new a(this));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse bigPictureUrl", e10);
            e((Bitmap) null);
        }
    }

    public void g(Bitmap bitmap) {
        this.f48065b = bitmap;
        b();
    }

    public void h(Context context, String str) {
        if (str == null) {
            g((Bitmap) null);
            return;
        }
        try {
            a(context, Uri.parse(str), new b(this));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse largeIconUrl", e10);
            g((Bitmap) null);
        }
    }
}
