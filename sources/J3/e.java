package J3;

import K3.c;
import K3.r;
import K3.s;
import K3.t;
import K3.u;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f3962a = Uri.parse("*");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f3963b = Uri.parse("");

    /* renamed from: c  reason: collision with root package name */
    private static boolean f3964c = true;

    /* renamed from: d  reason: collision with root package name */
    private static final WeakHashMap f3965d = new WeakHashMap();

    public interface a {
        void a(WebView webView, b bVar, Uri uri, boolean z10, a aVar);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (r.f4049V.d()) {
            f(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
            return;
        }
        throw r.a();
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return d().createWebView(webView);
    }

    public static PackageInfo c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a();
        }
        try {
            return e();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static u d() {
        return s.d();
    }

    private static PackageInfo e() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    private static t f(WebView webView) {
        if (!r.f4091s0.d() || !f3964c) {
            return new t(b(webView));
        }
        WeakHashMap weakHashMap = f3965d;
        t tVar = (t) weakHashMap.get(webView);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(b(webView));
        weakHashMap.put(webView, tVar2);
        return tVar2;
    }

    public static boolean g() {
        if (r.f4046S.d()) {
            return d().getStatics().isMultiProcessEnabled();
        }
        throw r.a();
    }
}
