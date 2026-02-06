package Kc;

import Lc.e;
import Yb.a;
import android.net.Uri;
import com.revenuecat.purchases.common.Constants;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f51479a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f51480b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f51481c;

    public h(Uri uri, a aVar) {
        Uri uri2;
        this.f51481c = uri;
        if (aVar == null) {
            uri2 = e.f51970k;
        } else {
            uri2 = Uri.parse("http://" + aVar.a() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + aVar.b() + "/v0");
        }
        this.f51479a = uri2;
        Uri.Builder appendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String a10 = d.a(uri.getPath());
        if (a10.length() > 0 && !"/".equals(a10)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(a10);
        }
        this.f51480b = appendEncodedPath.build();
    }

    public Uri a() {
        return this.f51481c;
    }

    public Uri b() {
        return this.f51479a;
    }

    public Uri c() {
        return this.f51480b;
    }
}
