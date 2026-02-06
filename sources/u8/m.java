package u8;

import Sg.p;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.C3286a;
import com.facebook.C3324n;
import com.facebook.C3459v;
import com.facebook.C3461x;
import com.facebook.I;
import com.facebook.M;
import com.facebook.T;
import com.facebook.r;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.branch.rnbranch.RNBranchModule;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import o7.C3885a;
import o7.C3889e;
import o7.K;
import o7.M;
import o7.W;
import t5.C4021N;
import t8.C4051b;
import v8.C4112b;
import v8.d;
import v8.h;
import v8.i;
import v8.j;
import v8.k;
import v8.l;
import v8.n;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f48662a = new m();

    public static final class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f48663b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar) {
            super(rVar);
            this.f48663b = rVar;
        }

        public void a(C3885a aVar) {
            C6496s.h(aVar, "appCall");
            m.q(this.f48663b);
        }

        public void b(C3885a aVar, C3459v vVar) {
            C6496s.h(aVar, "appCall");
            C6496s.h(vVar, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            m.r(this.f48663b, vVar);
        }

        public void c(C3885a aVar, Bundle bundle) {
            C6496s.h(aVar, "appCall");
            if (bundle != null) {
                String h10 = m.h(bundle);
                if (h10 == null || p.v("post", h10, true)) {
                    m.s(this.f48663b, m.j(bundle));
                } else if (p.v("cancel", h10, true)) {
                    m.q(this.f48663b);
                } else {
                    m.r(this.f48663b, new C3459v("UnknownError"));
                }
            }
        }
    }

    private m() {
    }

    private final C3885a c(int i10, int i11, Intent intent) {
        UUID r10 = M.r(intent);
        if (r10 == null) {
            return null;
        }
        return C3885a.f47176d.b(r10, i10);
    }

    private final K.a d(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return K.d(uuid, bitmap);
        }
        if (uri != null) {
            return K.e(uuid, uri);
        }
        return null;
    }

    private final K.a e(UUID uuid, h hVar) {
        Uri uri;
        Bitmap bitmap;
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            bitmap = jVar.c();
            uri = jVar.e();
        } else if (hVar instanceof v8.m) {
            uri = ((v8.m) hVar).c();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        return d(uuid, uri, bitmap);
    }

    public static final Bundle f(l lVar, UUID uuid) {
        C6496s.h(uuid, "appCallId");
        Bundle bundle = null;
        if (!(lVar == null || lVar.i() == null)) {
            h i10 = lVar.i();
            K.a e10 = f48662a.e(uuid, i10);
            if (e10 == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", i10.b().name());
            bundle.putString("uri", e10.b());
            String n10 = n(e10.e());
            if (n10 != null) {
                W.t0(bundle, "extension", n10);
            }
            K.a(C6565s.e(e10));
        }
        return bundle;
    }

    public static final List g(i iVar, UUID uuid) {
        List<h> h10;
        Bundle bundle;
        C6496s.h(uuid, "appCallId");
        if (iVar == null || (h10 = iVar.h()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (h hVar : h10) {
            K.a e10 = f48662a.e(uuid, hVar);
            if (e10 == null) {
                bundle = null;
            } else {
                arrayList.add(e10);
                bundle = new Bundle();
                bundle.putString("type", hVar.b().name());
                bundle.putString("uri", e10.b());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        K.a(arrayList);
        return arrayList2;
    }

    public static final String h(Bundle bundle) {
        C6496s.h(bundle, "result");
        if (bundle.containsKey("completionGesture")) {
            return bundle.getString("completionGesture");
        }
        return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static final List i(k kVar, UUID uuid) {
        List<j> h10;
        C6496s.h(uuid, "appCallId");
        if (kVar == null || (h10 = kVar.h()) == null) {
            return null;
        }
        ArrayList<K.a> arrayList = new ArrayList<>();
        for (j e10 : h10) {
            K.a e11 = f48662a.e(uuid, e10);
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (K.a b10 : arrayList) {
            arrayList2.add(b10.b());
        }
        K.a(arrayList);
        return arrayList2;
    }

    public static final String j(Bundle bundle) {
        C6496s.h(bundle, "result");
        if (bundle.containsKey("postId")) {
            return bundle.getString("postId");
        }
        if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        }
        return bundle.getString("post_id");
    }

    public static final g k(r rVar) {
        return new a(rVar);
    }

    public static final Bundle l(l lVar, UUID uuid) {
        C6496s.h(uuid, "appCallId");
        if (lVar == null || lVar.k() == null) {
            return null;
        }
        new ArrayList().add(lVar.k());
        K.a e10 = f48662a.e(uuid, lVar.k());
        if (e10 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uri", e10.b());
        String n10 = n(e10.e());
        if (n10 != null) {
            W.t0(bundle, "extension", n10);
        }
        K.a(C6565s.e(e10));
        return bundle;
    }

    public static final Bundle m(d dVar, UUID uuid) {
        C4112b j10;
        C6496s.h(uuid, "appCallId");
        if (dVar == null || (j10 = dVar.j()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : j10.d()) {
            K.a d10 = f48662a.d(uuid, j10.c(str), j10.b(str));
            if (d10 != null) {
                arrayList.add(d10);
                bundle.putString(str, d10.b());
            }
        }
        K.a(arrayList);
        return bundle;
    }

    public static final String n(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        C6496s.g(uri2, "uri.toString()");
        int g02 = p.g0(uri2, '.', 0, false, 6, (Object) null);
        if (g02 == -1) {
            return null;
        }
        String substring = uri2.substring(g02);
        C6496s.g(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String o(n nVar, UUID uuid) {
        v8.m k10;
        Uri c10;
        C6496s.h(uuid, "appCallId");
        if (nVar == null || (k10 = nVar.k()) == null || (c10 = k10.c()) == null) {
            return null;
        }
        K.a e10 = K.e(uuid, c10);
        K.a(C6565s.e(e10));
        return e10.b();
    }

    public static final boolean p(int i10, int i11, Intent intent, g gVar) {
        C3459v vVar;
        C3885a c10 = f48662a.c(i10, i11, intent);
        if (c10 == null) {
            return false;
        }
        K.c(c10.c());
        if (gVar == null) {
            return true;
        }
        Bundle bundle = null;
        if (intent != null) {
            vVar = M.t(M.s(intent));
        } else {
            vVar = null;
        }
        if (vVar == null) {
            if (intent != null) {
                bundle = M.A(intent);
            }
            gVar.c(c10, bundle);
        } else if (vVar instanceof C3461x) {
            gVar.a(c10);
        } else {
            gVar.b(c10, vVar);
        }
        return true;
    }

    public static final void q(r rVar) {
        f48662a.t("cancelled", (String) null);
        if (rVar != null) {
            rVar.onCancel();
        }
    }

    public static final void r(r rVar, C3459v vVar) {
        C6496s.h(vVar, "ex");
        f48662a.t(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, vVar.getMessage());
        if (rVar != null) {
            rVar.a(vVar);
        }
    }

    public static final void s(r rVar, String str) {
        f48662a.t("succeeded", (String) null);
        if (rVar != null) {
            rVar.onSuccess(new C4051b(str));
        }
    }

    private final void t(String str, String str2) {
        C4021N n10 = new C4021N(I.l());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        n10.g("fb_share_dialog_result", bundle);
    }

    public static final com.facebook.M u(C3286a aVar, Uri uri, M.b bVar) {
        C6496s.h(uri, "imageUri");
        String path = uri.getPath();
        if (W.c0(uri) && path != null) {
            return v(aVar, new File(path), bVar);
        }
        if (W.Z(uri)) {
            M.f fVar = new M.f((Parcelable) uri, ClipboardModule.MIMETYPE_PNG);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", fVar);
            return new com.facebook.M(aVar, "me/staging_resources", bundle, T.POST, bVar, (String) null, 32, (DefaultConstructorMarker) null);
        }
        throw new C3459v("The image Uri must be either a file:// or content:// Uri");
    }

    public static final com.facebook.M v(C3286a aVar, File file, M.b bVar) {
        M.f fVar = new M.f((Parcelable) ParcelFileDescriptor.open(file, 268435456), ClipboardModule.MIMETYPE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", fVar);
        return new com.facebook.M(aVar, "me/staging_resources", bundle, T.POST, bVar, (String) null, 32, (DefaultConstructorMarker) null);
    }

    public static final void w(int i10, C3324n nVar, r rVar) {
        if (nVar instanceof C3889e) {
            ((C3889e) nVar).c(i10, new k(i10, rVar));
            return;
        }
        throw new C3459v("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: private */
    public static final boolean x(int i10, r rVar, int i11, Intent intent) {
        return p(i10, i11, intent, k(rVar));
    }

    public static final void y(int i10) {
        C3889e.f47232b.c(i10, new l(i10));
    }

    /* access modifiers changed from: private */
    public static final boolean z(int i10, int i11, Intent intent) {
        return p(i10, i11, intent, k((r) null));
    }
}
