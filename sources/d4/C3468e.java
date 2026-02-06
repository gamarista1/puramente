package d4;

import Gh.H;
import X3.g;
import a4.C3113f;
import a4.C3114g;
import a4.V;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import d4.C3472i;
import j4.C3627n;
import java.io.InputStream;
import k4.C3661c;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

/* renamed from: d4.e  reason: case insensitive filesystem */
public final class C3468e implements C3472i {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f43102a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43103b;

    /* renamed from: d4.e$a */
    public static final class a implements C3472i.a {
        private final boolean c(Uri uri) {
            return C6496s.c(uri.getScheme(), "content");
        }

        /* renamed from: b */
        public C3472i a(Uri uri, C3627n nVar, g gVar) {
            if (!c(uri)) {
                return null;
            }
            return new C3468e(uri, nVar);
        }
    }

    public C3468e(Uri uri, C3627n nVar) {
        this.f43102a = uri;
        this.f43103b = nVar;
    }

    private final Bundle d() {
        C3661c.a aVar;
        C3661c.a aVar2;
        C3661c d10 = this.f43103b.o().d();
        if (d10 instanceof C3661c.a) {
            aVar = (C3661c.a) d10;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.f45103a;
        C3661c c10 = this.f43103b.o().c();
        if (c10 instanceof C3661c.a) {
            aVar2 = (C3661c.a) c10;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.f45103a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    public Object a(C6658d dVar) {
        ContentResolver contentResolver = this.f43103b.g().getContentResolver();
        InputStream inputStream = null;
        if (b(this.f43102a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f43102a, "r");
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f43102a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f43102a)) {
            inputStream = contentResolver.openInputStream(this.f43102a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f43102a + "'.").toString());
            }
        } else {
            AssetFileDescriptor a10 = contentResolver.openTypedAssetFile(this.f43102a, "image/*", d(), (CancellationSignal) null);
            if (a10 != null) {
                inputStream = a10.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f43102a + "'.").toString());
            }
        }
        return new m(V.f(H.d(H.l(inputStream)), this.f43103b.g(), new C3113f(this.f43102a)), contentResolver.getType(this.f43102a), C3114g.DISK);
    }

    public final boolean b(Uri uri) {
        if (!C6496s.c(uri.getAuthority(), "com.android.contacts") || !C6496s.c(uri.getLastPathSegment(), "display_photo")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = r5.getPathSegments();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r1 = "media"
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = r5.getPathSegments()
            int r0 = r5.size()
            r2 = 3
            if (r0 < r2) goto L_0x0036
            int r2 = r0 + -3
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "audio"
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r3)
            if (r2 == 0) goto L_0x0036
            int r0 = r0 + -2
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "albums"
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r0)
            if (r5 == 0) goto L_0x0036
            r1 = 1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.C3468e.c(android.net.Uri):boolean");
    }
}
