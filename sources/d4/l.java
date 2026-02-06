package d4;

import Gh.H;
import Sg.p;
import X3.g;
import a4.C3114g;
import a4.V;
import a4.W;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import d4.C3472i;
import j4.C3627n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6527k;
import mf.C6565s;
import o4.C3881d;
import o4.t;
import qf.C6658d;

public final class l implements C3472i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f43130c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Uri f43131a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43132b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements C3472i.a {
        private final boolean c(Uri uri) {
            return C6496s.c(uri.getScheme(), "android.resource");
        }

        /* renamed from: b */
        public C3472i a(Uri uri, C3627n nVar, g gVar) {
            if (!c(uri)) {
                return null;
            }
            return new l(uri, nVar);
        }
    }

    public l(Uri uri, C3627n nVar) {
        this.f43131a = uri;
        this.f43132b = nVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    public Object a(C6658d dVar) {
        Integer m10;
        Resources resources;
        Drawable d10;
        String authority = this.f43131a.getAuthority();
        if (authority != null) {
            if (p.d0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) C6565s.B0(this.f43131a.getPathSegments());
                if (str == null || (m10 = p.m(str)) == null) {
                    b(this.f43131a);
                    throw new C6527k();
                }
                int intValue = m10.intValue();
                Context g10 = this.f43132b.g();
                if (C6496s.c(authority, g10.getPackageName())) {
                    resources = g10.getResources();
                } else {
                    resources = g10.getPackageManager().getResourcesForApplication(authority);
                }
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String j10 = o4.l.j(MimeTypeMap.getSingleton(), charSequence.subSequence(p.g0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (C6496s.c(j10, "text/xml")) {
                    if (C6496s.c(authority, g10.getPackageName())) {
                        d10 = C3881d.a(g10, intValue);
                    } else {
                        d10 = C3881d.d(g10, resources, intValue);
                    }
                    Drawable drawable = d10;
                    boolean u10 = o4.l.u(drawable);
                    if (u10) {
                        drawable = new BitmapDrawable(g10.getResources(), t.f47014a.a(drawable, this.f43132b.f(), this.f43132b.o(), this.f43132b.n(), this.f43132b.c()));
                    }
                    return new C3470g(drawable, u10, C3114g.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new m(V.f(H.d(H.l(resources.openRawResource(intValue, typedValue2))), g10, new W(authority, intValue, typedValue2.density)), j10, C3114g.DISK);
            }
        }
        b(this.f43131a);
        throw new C6527k();
    }
}
