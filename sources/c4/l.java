package C4;

import B4.b;
import B4.o;
import u4.C4071k;
import u4.L;
import w4.C4118c;

public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29978a;

    /* renamed from: b  reason: collision with root package name */
    private final o f29979b;

    /* renamed from: c  reason: collision with root package name */
    private final o f29980c;

    /* renamed from: d  reason: collision with root package name */
    private final b f29981d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29982e;

    public l(String str, o oVar, o oVar2, b bVar, boolean z10) {
        this.f29978a = str;
        this.f29979b = oVar;
        this.f29980c = oVar2;
        this.f29981d = bVar;
        this.f29982e = z10;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new w4.o(l10, bVar, this);
    }

    public b b() {
        return this.f29981d;
    }

    public String c() {
        return this.f29978a;
    }

    public o d() {
        return this.f29979b;
    }

    public o e() {
        return this.f29980c;
    }

    public boolean f() {
        return this.f29982e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f29979b + ", size=" + this.f29980c + '}';
    }
}
