package C4;

import B4.f;
import B4.o;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.C4121f;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29892a;

    /* renamed from: b  reason: collision with root package name */
    private final o f29893b;

    /* renamed from: c  reason: collision with root package name */
    private final f f29894c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f29895d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29896e;

    public b(String str, o oVar, f fVar, boolean z10, boolean z11) {
        this.f29892a = str;
        this.f29893b = oVar;
        this.f29894c = fVar;
        this.f29895d = z10;
        this.f29896e = z11;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new C4121f(l10, bVar, this);
    }

    public String b() {
        return this.f29892a;
    }

    public o c() {
        return this.f29893b;
    }

    public f d() {
        return this.f29894c;
    }

    public boolean e() {
        return this.f29896e;
    }

    public boolean f() {
        return this.f29895d;
    }
}
