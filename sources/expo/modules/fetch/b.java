package expo.modules.fetch;

import Gh.C5406g;
import Gh.H;
import Sd.f;
import Sg.p;
import android.content.Context;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.B;
import rh.C;
import rh.E;
import rh.F;
import rh.v;
import rh.w;
import rh.y;

public final class b implements w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60413b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f60414a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL a(URL url) {
            C6496s.h(url, "url");
            if (!C6496s.c(url.getProtocol(), "file")) {
                return url;
            }
            String path = url.getPath();
            return new URL("http://filesystem.local" + path);
        }

        private a() {
        }
    }

    public b(Context context) {
        C6496s.h(context, "context");
        this.f60414a = new WeakReference(context);
    }

    private final E b(C c10) {
        return new E.a().r(c10).p(B.HTTP_1_1).g(RCHTTPStatusCodes.NOT_FOUND).m("File not found").b(F.f73180b.b("File not found", y.f73499e.a("text/plain"))).c();
    }

    private final y c(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName == null) {
            guessContentTypeFromName = "application/octet-stream";
        }
        y.a aVar = y.f73499e;
        y b10 = aVar.b(guessContentTypeFromName);
        if (b10 == null) {
            return aVar.a("application/octet-stream");
        }
        return b10;
    }

    private final String d(v vVar) {
        return p.F(vVar.toString(), "http://filesystem.local", "file://", false, 4, (Object) null);
    }

    public final F a(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "fileName");
        InputStream open = context.getAssets().open(str);
        C6496s.g(open, "open(...)");
        return F.b.f(F.f73180b, H.d(H.l(open)), c(str), 0, 2, (Object) null);
    }

    public E intercept(w.a aVar) {
        C6496s.h(aVar, "chain");
        C request = aVar.request();
        String d10 = d(request.l());
        if (!p.J(d10, "file://", false, 2, (Object) null)) {
            return aVar.a(request);
        }
        if (p.J(d10, "file:///android_asset/", false, 2, (Object) null)) {
            String v02 = p.v0(d10, "file:///android_asset/");
            Context context = (Context) this.f60414a.get();
            if (context != null) {
                try {
                    return new E.a().r(request).p(B.HTTP_1_1).g(200).m("OK").b(a(context, v02)).c();
                } catch (IOException unused) {
                    return b(request);
                }
            } else {
                throw new f();
            }
        } else {
            String substring = d10.substring(7);
            C6496s.g(substring, "substring(...)");
            File file = new File(substring);
            if (!file.exists()) {
                return b(request);
            }
            F.b bVar = F.f73180b;
            C5406g d11 = H.d(H.k(file));
            String name = file.getName();
            C6496s.g(name, "getName(...)");
            return new E.a().r(request).p(B.HTTP_1_1).g(200).m("OK").b(bVar.a(d11, c(name), file.length())).c();
        }
    }
}
