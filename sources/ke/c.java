package ke;

import expo.modules.kotlin.views.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import le.d;
import yf.p;

public final class c extends d {

    /* renamed from: i  reason: collision with root package name */
    private final b f60950i;

    /* renamed from: j  reason: collision with root package name */
    private String f60951j;

    /* renamed from: k  reason: collision with root package name */
    private n f60952k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f60953l = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    private p f60954m;

    /* renamed from: n  reason: collision with root package name */
    private List f60955n = new ArrayList();

    public c(b bVar) {
        this.f60950i = bVar;
    }

    public final void o(String str) {
        C6496s.h(str, "name");
        this.f60951j = str;
    }

    public final d p() {
        String str = this.f60951j;
        if (str == null) {
            b bVar = this.f60950i;
            if (bVar != null) {
                str = bVar.getClass().getSimpleName();
            } else {
                str = null;
            }
        }
        String str2 = str;
        if (str2 != null) {
            return new d(str2, i(), this.f60952k, this.f60953l, this.f60954m, this.f60955n);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List q() {
        return this.f60955n;
    }

    public final Map r() {
        return this.f60953l;
    }

    public final n s() {
        return this.f60952k;
    }

    public final void t(n nVar) {
        this.f60952k = nVar;
    }
}
