package Z4;

import T4.i;
import Z4.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

public final class t implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35932a;

    /* renamed from: b  reason: collision with root package name */
    private final n f35933b;

    t(Context context, n nVar) {
        this.f35932a = context.getApplicationContext();
        this.f35933b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i10, int i11, i iVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f35933b.a(Integer.valueOf(parseInt), i10, i11, iVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i10, int i11, i iVar) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.f35932a.getResources().getIdentifier(str, pathSegments.get(0), this.f35932a.getPackageName());
        if (identifier != 0) {
            return this.f35933b.a(Integer.valueOf(identifier), i10, i11, iVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, iVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, iVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        if (!"android.resource".equals(uri.getScheme()) || !this.f35932a.getPackageName().equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    private static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35934a;

        a(Context context) {
            this.f35934a = context;
        }

        public n c(r rVar) {
            return new t(this.f35934a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }

        public void teardown() {
        }
    }

    private static final class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f35935a;

        b(Context context) {
            this.f35935a = context;
        }

        public n c(r rVar) {
            return new t(this.f35935a, rVar.d(Integer.class, InputStream.class));
        }

        public void teardown() {
        }
    }
}
