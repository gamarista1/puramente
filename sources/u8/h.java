package u8;

import android.graphics.Bitmap;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.facebook.C3459v;
import com.facebook.I;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.W;
import o7.X;
import v8.e;
import v8.g;
import v8.i;
import v8.j;
import v8.k;
import v8.l;
import v8.m;
import v8.n;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f48638a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final c f48639b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final c f48640c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final c f48641d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final c f48642e = new b();

    private static final class a extends c {
        public void b(g gVar) {
            C6496s.h(gVar, "linkContent");
            if (!W.e0(gVar.h())) {
                throw new C3459v("Cannot share link content with quote using the share api");
            }
        }

        public void d(i iVar) {
            C6496s.h(iVar, "mediaContent");
            throw new C3459v("Cannot share ShareMediaContent using the share api");
        }

        public void e(j jVar) {
            C6496s.h(jVar, "photo");
            h.f48638a.v(jVar, this);
        }

        public void i(n nVar) {
            C6496s.h(nVar, "videoContent");
            if (!W.e0(nVar.d())) {
                throw new C3459v("Cannot share video content with place IDs using the share api");
            } else if (!W.f0(nVar.c())) {
                throw new C3459v("Cannot share video content with people IDs using the share api");
            } else if (!W.e0(nVar.e())) {
                throw new C3459v("Cannot share video content with referrer URL using the share api");
            }
        }
    }

    private static final class b extends c {
        public void g(l lVar) {
            h.f48638a.y(lVar, this);
        }
    }

    public static class c {
        public void a(v8.d dVar) {
            C6496s.h(dVar, "cameraEffectContent");
            h.f48638a.l(dVar);
        }

        public void b(g gVar) {
            C6496s.h(gVar, "linkContent");
            h.f48638a.q(gVar, this);
        }

        public void c(v8.h hVar) {
            C6496s.h(hVar, Constants.MEDIUM);
            h.s(hVar, this);
        }

        public void d(i iVar) {
            C6496s.h(iVar, "mediaContent");
            h.f48638a.r(iVar, this);
        }

        public void e(j jVar) {
            C6496s.h(jVar, "photo");
            h.f48638a.w(jVar, this);
        }

        public void f(k kVar) {
            C6496s.h(kVar, "photoContent");
            h.f48638a.u(kVar, this);
        }

        public void g(l lVar) {
            h.f48638a.y(lVar, this);
        }

        public void h(m mVar) {
            h.f48638a.z(mVar, this);
        }

        public void i(n nVar) {
            C6496s.h(nVar, "videoContent");
            h.f48638a.A(nVar, this);
        }
    }

    private static final class d extends c {
        public void d(i iVar) {
            C6496s.h(iVar, "mediaContent");
            throw new C3459v("Cannot share ShareMediaContent via web sharing dialogs");
        }

        public void e(j jVar) {
            C6496s.h(jVar, "photo");
            h.f48638a.x(jVar, this);
        }

        public void i(n nVar) {
            C6496s.h(nVar, "videoContent");
            throw new C3459v("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    private h() {
    }

    /* access modifiers changed from: private */
    public final void A(n nVar, c cVar) {
        cVar.h(nVar.k());
        j j10 = nVar.j();
        if (j10 != null) {
            cVar.e(j10);
        }
    }

    private final void k(e eVar, c cVar) {
        if (eVar == null) {
            throw new C3459v("Must provide non-null content to share");
        } else if (eVar instanceof g) {
            cVar.b((g) eVar);
        } else if (eVar instanceof k) {
            cVar.f((k) eVar);
        } else if (eVar instanceof n) {
            cVar.i((n) eVar);
        } else if (eVar instanceof i) {
            cVar.d((i) eVar);
        } else if (eVar instanceof v8.d) {
            cVar.a((v8.d) eVar);
        } else if (eVar instanceof l) {
            cVar.g((l) eVar);
        }
    }

    /* access modifiers changed from: private */
    public final void l(v8.d dVar) {
        if (W.e0(dVar.i())) {
            throw new C3459v("Must specify a non-empty effectId");
        }
    }

    public static final void m(e eVar) {
        f48638a.k(eVar, f48640c);
    }

    public static final void n(e eVar) {
        f48638a.k(eVar, f48640c);
    }

    public static final void o(e eVar) {
        f48638a.k(eVar, f48642e);
    }

    public static final void p(e eVar) {
        f48638a.k(eVar, f48639b);
    }

    /* access modifiers changed from: private */
    public final void q(g gVar, c cVar) {
        Uri a10 = gVar.a();
        if (a10 != null && !W.g0(a10)) {
            throw new C3459v("Content Url must be an http:// or https:// url");
        }
    }

    /* access modifiers changed from: private */
    public final void r(i iVar, c cVar) {
        List<v8.h> h10 = iVar.h();
        if (h10 == null || h10.isEmpty()) {
            throw new C3459v("Must specify at least one medium in ShareMediaContent.");
        } else if (h10.size() <= 6) {
            for (v8.h c10 : h10) {
                cVar.c(c10);
            }
        } else {
            U u10 = U.f71764a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            C6496s.g(format, "format(locale, format, *args)");
            throw new C3459v(format);
        }
    }

    public static final void s(v8.h hVar, c cVar) {
        C6496s.h(hVar, Constants.MEDIUM);
        C6496s.h(cVar, "validator");
        if (hVar instanceof j) {
            cVar.e((j) hVar);
        } else if (hVar instanceof m) {
            cVar.h((m) hVar);
        } else {
            U u10 = U.f71764a;
            String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{hVar.getClass().getSimpleName()}, 1));
            C6496s.g(format, "format(locale, format, *args)");
            throw new C3459v(format);
        }
    }

    private final void t(j jVar) {
        if (jVar != null) {
            Bitmap c10 = jVar.c();
            Uri e10 = jVar.e();
            if (c10 == null && e10 == null) {
                throw new C3459v("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new C3459v("Cannot share a null SharePhoto");
    }

    /* access modifiers changed from: private */
    public final void u(k kVar, c cVar) {
        List<j> h10 = kVar.h();
        if (h10 == null || h10.isEmpty()) {
            throw new C3459v("Must specify at least one Photo in SharePhotoContent.");
        } else if (h10.size() <= 6) {
            for (j e10 : h10) {
                cVar.e(e10);
            }
        } else {
            U u10 = U.f71764a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            C6496s.g(format, "format(locale, format, *args)");
            throw new C3459v(format);
        }
    }

    /* access modifiers changed from: private */
    public final void v(j jVar, c cVar) {
        t(jVar);
        Bitmap c10 = jVar.c();
        Uri e10 = jVar.e();
        if (c10 == null && W.g0(e10)) {
            throw new C3459v("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* access modifiers changed from: private */
    public final void w(j jVar, c cVar) {
        v(jVar, cVar);
        if (jVar.c() != null || !W.g0(jVar.e())) {
            X.d(I.l());
        }
    }

    /* access modifiers changed from: private */
    public final void x(j jVar, c cVar) {
        t(jVar);
    }

    /* access modifiers changed from: private */
    public final void y(l lVar, c cVar) {
        if (lVar == null || (lVar.i() == null && lVar.k() == null)) {
            throw new C3459v("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (lVar.i() != null) {
            cVar.c(lVar.i());
        }
        if (lVar.k() != null) {
            cVar.e(lVar.k());
        }
    }

    /* access modifiers changed from: private */
    public final void z(m mVar, c cVar) {
        if (mVar != null) {
            Uri c10 = mVar.c();
            if (c10 == null) {
                throw new C3459v("ShareVideo does not have a LocalUrl specified");
            } else if (!W.Z(c10) && !W.c0(c10)) {
                throw new C3459v("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new C3459v("Cannot share a null ShareVideo");
        }
    }
}
