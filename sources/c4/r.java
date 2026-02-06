package C4;

import B4.h;
import D4.b;
import u4.C4071k;
import u4.L;
import w4.C4118c;

public class r implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f30002a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30003b;

    /* renamed from: c  reason: collision with root package name */
    private final h f30004c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f30005d;

    public r(String str, int i10, h hVar, boolean z10) {
        this.f30002a = str;
        this.f30003b = i10;
        this.f30004c = hVar;
        this.f30005d = z10;
    }

    public C4118c a(L l10, C4071k kVar, b bVar) {
        return new w4.r(l10, bVar, this);
    }

    public String b() {
        return this.f30002a;
    }

    public h c() {
        return this.f30004c;
    }

    public boolean d() {
        return this.f30005d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f30002a + ", index=" + this.f30003b + '}';
    }
}
