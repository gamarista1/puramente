package Lc;

import android.net.Uri;
import ub.C5230g;

public class h extends f {

    /* renamed from: n  reason: collision with root package name */
    public static boolean f51987n = false;

    /* renamed from: m  reason: collision with root package name */
    private final Uri f51988m;

    public h(Kc.h hVar, C5230g gVar, Uri uri) {
        super(hVar, gVar);
        f51987n = true;
        this.f51988m = uri;
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", "cancel");
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    public Uri u() {
        return this.f51988m;
    }
}
