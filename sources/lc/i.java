package Lc;

import Kc.h;
import android.net.Uri;
import ub.C5230g;

public class i extends f {

    /* renamed from: m  reason: collision with root package name */
    private final Uri f51989m;

    public i(h hVar, C5230g gVar, Uri uri) {
        super(hVar, gVar);
        this.f51989m = uri;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "query");
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    public Uri u() {
        return this.f51989m;
    }
}
