package com.facebook.imagepipeline.producers;

import T5.g;
import U6.f;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import c7.C3186f;
import c7.m;
import i7.C3593b;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

public class S implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39862a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f39863b;

    class a extends m0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g0 f39864f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e0 f39865g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C3593b f39866h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ CancellationSignal f39867i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3308n nVar, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, C3593b bVar, CancellationSignal cancellationSignal) {
            super(nVar, g0Var, e0Var, str);
            this.f39864f = g0Var2;
            this.f39865g = e0Var2;
            this.f39866h = bVar;
            this.f39867i = cancellationSignal;
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            this.f39867i.cancel();
        }

        /* access modifiers changed from: protected */
        public void e(Exception exc) {
            super.e(exc);
            this.f39864f.b(this.f39865g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f39865g.n("local", "thumbnail_bitmap");
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void b(X5.a aVar) {
            X5.a.E(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public Map i(X5.a aVar) {
            boolean z10;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return g.of("createdThumbnail", String.valueOf(z10));
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public X5.a c() {
            String str;
            Bitmap bitmap;
            Size size = new Size(this.f39866h.n(), this.f39866h.m());
            try {
                str = S.this.e(this.f39866h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str == null) {
                bitmap = null;
            } else if (V5.a.c(V5.a.b(str))) {
                bitmap = ThumbnailUtils.createVideoThumbnail(new File(str), size, this.f39867i);
            } else {
                bitmap = ThumbnailUtils.createImageThumbnail(new File(str), size, this.f39867i);
            }
            if (bitmap == null) {
                bitmap = S.this.f39863b.loadThumbnail(this.f39866h.v(), size, this.f39867i);
            }
            if (bitmap == null) {
                return null;
            }
            C3186f k12 = C3186f.k1(bitmap, f.b(), m.f36558d, 0);
            this.f39865g.t("image_format", "thumbnail");
            k12.I(this.f39865g.getExtras());
            return X5.a.U(k12);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void f(X5.a aVar) {
            boolean z10;
            super.f(aVar);
            g0 g0Var = this.f39864f;
            e0 e0Var = this.f39865g;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0Var.b(e0Var, "LocalThumbnailBitmapSdk29Producer", z10);
            this.f39865g.n("local", "thumbnail_bitmap");
        }
    }

    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f39869a;

        b(m0 m0Var) {
            this.f39869a = m0Var;
        }

        public void b() {
            this.f39869a.a();
        }
    }

    public S(Executor executor, ContentResolver contentResolver) {
        this.f39862a = executor;
        this.f39863b = contentResolver;
    }

    /* access modifiers changed from: private */
    public String e(C3593b bVar) {
        return b6.f.e(this.f39863b, bVar.v());
    }

    public void b(C3308n nVar, e0 e0Var) {
        g0 y10 = e0Var.y();
        C3593b F10 = e0Var.F();
        e0Var.n("local", "thumbnail_bitmap");
        a aVar = new a(nVar, y10, e0Var, "LocalThumbnailBitmapSdk29Producer", y10, e0Var, F10, new CancellationSignal());
        e0Var.b(new b(aVar));
        this.f39862a.execute(aVar);
    }
}
