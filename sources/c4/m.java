package C4;

import B4.b;
import B4.n;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.p;

public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29983a;

    /* renamed from: b  reason: collision with root package name */
    private final b f29984b;

    /* renamed from: c  reason: collision with root package name */
    private final b f29985c;

    /* renamed from: d  reason: collision with root package name */
    private final n f29986d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29987e;

    public m(String str, b bVar, b bVar2, n nVar, boolean z10) {
        this.f29983a = str;
        this.f29984b = bVar;
        this.f29985c = bVar2;
        this.f29986d = nVar;
        this.f29987e = z10;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new p(l10, bVar, this);
    }

    public b b() {
        return this.f29984b;
    }

    public String c() {
        return this.f29983a;
    }

    public b d() {
        return this.f29985c;
    }

    public n e() {
        return this.f29986d;
    }

    public boolean f() {
        return this.f29987e;
    }
}
