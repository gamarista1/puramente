package X7;

import O6.c;
import O6.f;
import Sg.p;
import a7.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b7.C3158a;
import c7.C3185e;
import c7.C3187g;
import c7.C3189i;
import c7.n;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f35380a = new e();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final O6.c f35381b = new O6.c("XML", "xml");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f35382c = {3, 0, 8, 0};

    private static final class a extends C3187g {

        /* renamed from: d  reason: collision with root package name */
        private final String f35383d;

        /* renamed from: e  reason: collision with root package name */
        private final Drawable f35384e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f35385f;

        public a(String str, Drawable drawable) {
            C6496s.h(str, "name");
            C6496s.h(drawable, "drawable");
            this.f35383d = str;
            this.f35384e = drawable;
        }

        public final Drawable U() {
            return this.f35384e;
        }

        public void close() {
            this.f35385f = true;
        }

        public int d() {
            Integer valueOf = Integer.valueOf(this.f35384e.getIntrinsicHeight());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
            return 0;
        }

        public int e() {
            Integer valueOf = Integer.valueOf(this.f35384e.getIntrinsicWidth());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
            return 0;
        }

        public boolean isClosed() {
            return this.f35385f;
        }

        public int p() {
            return e() * d() * 4;
        }
    }

    private static final class b implements C3158a {
        public Drawable a(C3185e eVar) {
            C6496s.h(eVar, AppearanceType.IMAGE);
            return ((a) eVar).U();
        }

        public boolean b(C3185e eVar) {
            C6496s.h(eVar, AppearanceType.IMAGE);
            return eVar instanceof a;
        }
    }

    private static final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f35386a = e.f35382c.length;

        public O6.c a(byte[] bArr, int i10) {
            C6496s.h(bArr, "headerBytes");
            if (i10 < e.f35382c.length) {
                return O6.c.f33387d;
            }
            if (f.c(bArr, e.f35382c)) {
                return e.f35381b;
            }
            return O6.c.f33387d;
        }

        public int b() {
            return this.f35386a;
        }
    }

    private static final class d implements a7.c {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35387a;

        public d(Context context) {
            C6496s.h(context, "context");
            this.f35387a = context;
        }

        private final int b(Uri uri) {
            Integer m10;
            List<String> pathSegments = uri.getPathSegments();
            C6496s.g(pathSegments, "getPathSegments(...)");
            String str = (String) C6565s.B0(pathSegments);
            if (str != null && (m10 = p.m(str)) != null) {
                return m10.intValue();
            }
            throw new IllegalStateException("Invalid resource id");
        }

        public C3185e a(C3189i iVar, int i10, n nVar, W6.d dVar) {
            C6496s.h(iVar, "encodedImage");
            C6496s.h(nVar, "qualityInfo");
            C6496s.h(dVar, "options");
            try {
                String Q10 = iVar.Q();
                if (Q10 != null) {
                    Uri parse = Uri.parse(Q10);
                    C6496s.e(parse);
                    Drawable drawable = this.f35387a.getApplicationContext().getResources().getDrawable(b(parse), (Resources.Theme) null);
                    C6496s.e(drawable);
                    return new a(Q10, drawable);
                }
                throw new IllegalStateException("No source in encoded image");
            } catch (Throwable th2) {
                U5.a.n("XmlFormat", "Cannot decode xml " + th2, th2);
                return null;
            }
        }
    }

    private e() {
    }

    public final d.a c(d.a aVar, Context context) {
        C6496s.h(aVar, "builder");
        C6496s.h(context, "context");
        d.a c10 = aVar.c(f35381b, new c(), new d(context));
        C6496s.g(c10, "addDecodingCapability(...)");
        return c10;
    }

    public final C3158a d() {
        return new b();
    }
}
