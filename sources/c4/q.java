package C4;

import D4.b;
import java.util.Arrays;
import java.util.List;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.C4119d;

public class q implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29999a;

    /* renamed from: b  reason: collision with root package name */
    private final List f30000b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30001c;

    public q(String str, List list, boolean z10) {
        this.f29999a = str;
        this.f30000b = list;
        this.f30001c = z10;
    }

    public C4118c a(L l10, C4071k kVar, b bVar) {
        return new C4119d(l10, bVar, this, kVar);
    }

    public List b() {
        return this.f30000b;
    }

    public String c() {
        return this.f29999a;
    }

    public boolean d() {
        return this.f30001c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f29999a + "' Shapes: " + Arrays.toString(this.f30000b.toArray()) + '}';
    }
}
