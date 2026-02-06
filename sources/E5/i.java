package e5;

import T4.h;
import T4.k;
import V4.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public class i implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final h f43344b = h.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a  reason: collision with root package name */
    private final Context f43345a;

    public i(Context context) {
        this.f43345a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f43345a.getPackageName())) {
            return this.f43345a;
        }
        try {
            return this.f43345a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f43345a.getPackageName())) {
                return this.f43345a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public v b(Uri uri, int i10, int i11, T4.i iVar) {
        Resources.Theme theme;
        Drawable drawable;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d10 = d(uri, authority);
            int g10 = g(d10, uri);
            if (((String) o5.k.d(authority)).equals(this.f43345a.getPackageName())) {
                theme = (Resources.Theme) iVar.c(f43344b);
            } else {
                theme = null;
            }
            if (theme == null) {
                drawable = C3495f.b(this.f43345a, d10, g10);
            } else {
                drawable = C3495f.a(this.f43345a, g10, theme);
            }
            return C3497h.c(drawable);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    /* renamed from: h */
    public boolean a(Uri uri, T4.i iVar) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equals("android.resource")) {
            return false;
        }
        return true;
    }
}
