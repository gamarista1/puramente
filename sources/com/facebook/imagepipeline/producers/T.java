package com.facebook.imagepipeline.producers;

import T5.g;
import T5.k;
import U6.f;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c7.C3186f;
import c7.m;
import i7.C3593b;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

public class T implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39871a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f39872b;

    class a extends m0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g0 f39873f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e0 f39874g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C3593b f39875h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3308n nVar, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, C3593b bVar) {
            super(nVar, g0Var, e0Var, str);
            this.f39873f = g0Var2;
            this.f39874g = e0Var2;
            this.f39875h = bVar;
        }

        /* access modifiers changed from: protected */
        public void e(Exception exc) {
            super.e(exc);
            this.f39873f.b(this.f39874g, "VideoThumbnailProducer", false);
            this.f39874g.n("local", "video");
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
            try {
                str = T.this.i(this.f39875h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                bitmap = ThumbnailUtils.createVideoThumbnail(str, T.g(this.f39875h));
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                bitmap = T.h(T.this.f39872b, this.f39875h.v());
            }
            if (bitmap == null) {
                return null;
            }
            C3186f k12 = C3186f.k1(bitmap, f.b(), m.f36558d, 0);
            this.f39874g.t("image_format", "thumbnail");
            k12.I(this.f39874g.getExtras());
            return X5.a.U(k12);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void f(X5.a aVar) {
            boolean z10;
            super.f(aVar);
            g0 g0Var = this.f39873f;
            e0 e0Var = this.f39874g;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0Var.b(e0Var, "VideoThumbnailProducer", z10);
            this.f39874g.n("local", "video");
        }
    }

    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f39877a;

        b(m0 m0Var) {
            this.f39877a = m0Var;
        }

        public void b() {
            this.f39877a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f39871a = executor;
        this.f39872b = contentResolver;
    }

    /* access modifiers changed from: private */
    public static int g(C3593b bVar) {
        if (bVar.n() > 96 || bVar.m() > 96) {
            return 1;
        }
        return 3;
    }

    /* access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            k.g(openFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public String i(C3593b bVar) {
        return b6.f.e(this.f39872b, bVar.v());
    }

    public void b(C3308n nVar, e0 e0Var) {
        g0 y10 = e0Var.y();
        C3593b F10 = e0Var.F();
        e0Var.n("local", "video");
        a aVar = new a(nVar, y10, e0Var, "VideoThumbnailProducer", y10, e0Var, F10);
        e0Var.b(new b(aVar));
        this.f39871a.execute(aVar);
    }
}
