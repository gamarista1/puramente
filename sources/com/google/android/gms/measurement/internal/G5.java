package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;

public final class G5 {

    /* renamed from: a  reason: collision with root package name */
    private final E2 f54707a;

    public G5(E2 e22) {
        this.f54707a = e22;
    }

    private final boolean d() {
        if (this.f54707a.A().f55112z.a() > 0) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        if (d() && this.f54707a.zzb().currentTimeMillis() - this.f54707a.A().f55112z.a() > this.f54707a.u().u((String) null, F.f54623U)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        String str;
        this.f54707a.zzl().i();
        if (d()) {
            if (e()) {
                this.f54707a.A().f55111y.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f54707a.C().T0("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f54707a.A().f55111y.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f54707a.zzj().D().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f54707a.A().f55112z.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f54707a.C().T0(str, "_cmp", (Bundle) pair.second);
                }
                this.f54707a.A().f55111y.b((String) null);
            }
            this.f54707a.A().f55112z.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f54707a.zzl().i();
        if (!this.f54707a.k()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f54707a.A().f55111y.b(str2);
                this.f54707a.A().f55112z.b(this.f54707a.zzb().currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f54707a.A().f55111y.b((String) null);
        }
    }
}
