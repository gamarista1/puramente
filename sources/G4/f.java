package g4;

import Sg.p;
import android.content.res.Resources;
import android.net.Uri;
import j4.C3627n;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class f implements C3526d {
    private final boolean b(Uri uri) {
        String authority;
        if (!C6496s.c(uri.getScheme(), "android.resource") || (authority = uri.getAuthority()) == null || p.d0(authority) || uri.getPathSegments().size() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public Uri a(Uri uri, C3627n nVar) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = nVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            return Uri.parse("android.resource://" + authority + '/' + identifier);
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
