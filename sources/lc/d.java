package Lc;

import Kc.h;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import ub.C5230g;

public class d extends e {

    /* renamed from: m  reason: collision with root package name */
    private final Integer f51968m;

    /* renamed from: n  reason: collision with root package name */
    private final String f51969n;

    public d(h hVar, C5230g gVar, Integer num, String str) {
        super(hVar, gVar);
        this.f51968m = num;
        this.f51969n = str;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public Map l() {
        HashMap hashMap = new HashMap();
        String j10 = j();
        if (!j10.isEmpty()) {
            hashMap.put("prefix", j10 + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f51968m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f51969n)) {
            hashMap.put("pageToken", this.f51969n);
        }
        return hashMap;
    }

    public Uri u() {
        String authority = s().a().getAuthority();
        return Uri.parse(s().b() + "/b/" + authority + "/o");
    }
}
