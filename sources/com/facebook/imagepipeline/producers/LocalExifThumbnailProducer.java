package com.facebook.imagepipeline.producers;

import T5.g;
import T5.k;
import W5.h;
import W5.i;
import W5.j;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import b6.f;
import c7.C3189i;
import com.facebook.soloader.C3456g;
import i7.C3593b;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import m7.C3783c;
import m7.C3786f;

public class LocalExifThumbnailProducer implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f39851a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f39852b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f39853c;

    @C3456g
    private class Api24Utils {
        /* access modifiers changed from: package-private */
        public ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }

        private Api24Utils() {
        }
    }

    class a extends m0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C3593b f39855f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3308n nVar, g0 g0Var, e0 e0Var, String str, C3593b bVar) {
            super(nVar, g0Var, e0Var, str);
            this.f39855f = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void b(C3189i iVar) {
            C3189i.f(iVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public Map i(C3189i iVar) {
            boolean z10;
            if (iVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return g.of("createdThumbnail", Boolean.toString(z10));
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public C3189i c() {
            ExifInterface g10 = LocalExifThumbnailProducer.this.g(this.f39855f.v());
            if (g10 == null || !g10.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f39852b.d((byte[]) k.g(g10.getThumbnail())), g10);
        }
    }

    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f39857a;

        b(m0 m0Var) {
            this.f39857a = m0Var;
        }

        public void b() {
            this.f39857a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, i iVar, ContentResolver contentResolver) {
        this.f39851a = executor;
        this.f39852b = iVar;
        this.f39853c = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public C3189i e(h hVar, ExifInterface exifInterface) {
        int i10;
        Pair d10 = C3783c.d(new j(hVar));
        int h10 = h(exifInterface);
        int i11 = -1;
        if (d10 != null) {
            i10 = ((Integer) d10.first).intValue();
        } else {
            i10 = -1;
        }
        if (d10 != null) {
            i11 = ((Integer) d10.second).intValue();
        }
        X5.a U10 = X5.a.U(hVar);
        try {
            C3189i iVar = new C3189i(U10);
            X5.a.E(U10);
            iVar.L0(O6.b.f33373b);
            iVar.P0(h10);
            iVar.n1(i10);
            iVar.I0(i11);
            return iVar;
        } catch (Throwable th2) {
            X5.a.E(U10);
            throw th2;
        }
    }

    private int h(ExifInterface exifInterface) {
        return C3786f.a(Integer.parseInt((String) k.g(exifInterface.getAttribute("Orientation"))));
    }

    public boolean a(W6.g gVar) {
        return v0.b(512, 512, gVar);
    }

    public void b(C3308n nVar, e0 e0Var) {
        g0 y10 = e0Var.y();
        C3593b F10 = e0Var.F();
        e0Var.n("local", "exif");
        a aVar = new a(nVar, y10, e0Var, "LocalExifThumbnailProducer", F10);
        e0Var.b(new b(aVar));
        this.f39851a.execute(aVar);
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public ExifInterface g(Uri uri) {
        String e10 = f.e(this.f39853c, uri);
        if (e10 == null) {
            return null;
        }
        try {
            if (f(e10)) {
                return new ExifInterface(e10);
            }
            AssetFileDescriptor a10 = f.a(this.f39853c, uri);
            if (a10 != null) {
                ExifInterface a11 = new Api24Utils().a(a10.getFileDescriptor());
                a10.close();
                return a11;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            U5.a.i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }
}
