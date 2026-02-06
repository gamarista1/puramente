package K4;

import Ef.m;
import com.bugsnag.android.C3227c1;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import lf.C6502A;
import mf.C6565s;
import mf.O;

public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Map f32396a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f32397b;

    /* renamed from: c  reason: collision with root package name */
    private int f32398c;

    /* renamed from: d  reason: collision with root package name */
    private int f32399d;

    /* renamed from: e  reason: collision with root package name */
    private int f32400e;

    /* renamed from: f  reason: collision with root package name */
    private int f32401f;

    public n() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    private final Map g() {
        Integer num;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f32397b);
        C3227c1 c1Var = C3227c1.f38676a;
        Map a10 = c1Var.a();
        if (!(a10 == null || (num = (Integer) a10.get("ndkOnError")) == null)) {
            hashMap.put("ndkOnError", num);
        }
        Map b10 = c1Var.b();
        if (b10 != null) {
            hashMap.putAll(b10);
        }
        return hashMap;
    }

    private final void h(String str, int i10) {
        int i11;
        Integer num = (Integer) this.f32397b.get(str);
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.intValue();
        }
        this.f32397b.put(str, Integer.valueOf(m.d(i11 + i10, 0)));
    }

    public void a(Map map) {
        this.f32397b.clear();
        this.f32397b.putAll(map);
        C3227c1.f38676a.d(map);
    }

    public void b(int i10, int i11) {
        this.f32398c = i10;
        this.f32399d = i11;
    }

    public void c(Map map) {
        this.f32396a.clear();
        this.f32396a.putAll(map);
        C3227c1.f38676a.h(O.f(C6502A.a("config", this.f32396a)));
    }

    public void d(String str) {
        h(str, 1);
        C3227c1.f38676a.e(str);
    }

    public void e(int i10, int i11) {
        this.f32400e = i10;
        this.f32401f = i11;
    }

    public Map f() {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        Pair pair5;
        Pair pair6;
        Map g10 = g();
        int i10 = this.f32398c;
        Pair pair7 = null;
        if (i10 > 0) {
            pair = C6502A.a("stringsTruncated", Integer.valueOf(i10));
        } else {
            pair = null;
        }
        int i11 = this.f32399d;
        if (i11 > 0) {
            pair2 = C6502A.a("stringCharsTruncated", Integer.valueOf(i11));
        } else {
            pair2 = null;
        }
        int i12 = this.f32400e;
        if (i12 > 0) {
            pair3 = C6502A.a("breadcrumbsRemoved", Integer.valueOf(i12));
        } else {
            pair3 = null;
        }
        int i13 = this.f32401f;
        if (i13 > 0) {
            pair4 = C6502A.a("breadcrumbBytesRemoved", Integer.valueOf(i13));
        } else {
            pair4 = null;
        }
        Map w10 = O.w(C6565s.s(pair, pair2, pair3, pair4));
        if (!this.f32396a.isEmpty()) {
            pair5 = C6502A.a("config", this.f32396a);
        } else {
            pair5 = null;
        }
        if (!g10.isEmpty()) {
            pair6 = C6502A.a("callbacks", g10);
        } else {
            pair6 = null;
        }
        if (!w10.isEmpty()) {
            pair7 = C6502A.a("system", w10);
        }
        return O.w(C6565s.s(pair5, pair6, pair7));
    }

    public n(Map map) {
        if (map != null) {
            Map d10 = V.d(map.get("config"));
            this.f32396a = d10 == null ? new HashMap() : d10;
            Map d11 = V.d(map.get("callbacks"));
            this.f32397b = d11 == null ? new HashMap() : d11;
            Map d12 = V.d(map.get("system"));
            if (d12 != null) {
                Number number = (Number) d12.get("stringsTruncated");
                int i10 = 0;
                this.f32398c = number == null ? 0 : number.intValue();
                Number number2 = (Number) d12.get("stringCharsTruncated");
                this.f32399d = number2 == null ? 0 : number2.intValue();
                Number number3 = (Number) d12.get("breadcrumbsRemovedCount");
                this.f32400e = number3 == null ? 0 : number3.intValue();
                Number number4 = (Number) d12.get("breadcrumbBytesRemoved");
                this.f32401f = number4 != null ? number4.intValue() : i10;
                return;
            }
            return;
        }
        this.f32396a = new HashMap();
        this.f32397b = new HashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map);
    }
}
