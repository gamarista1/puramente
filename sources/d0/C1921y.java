package d0;

import f0.C1957a;
import java.util.Map;

/* renamed from: d0.y  reason: case insensitive filesystem */
public final class C1921y extends C1917u {

    /* renamed from: d  reason: collision with root package name */
    private final C1905i f19437d;

    public C1921y(C1905i iVar) {
        this.f19437d = iVar;
    }

    /* renamed from: r */
    public Map.Entry next() {
        C1957a.a(g());
        q(e() + 2);
        return new C1899c(this.f19437d, c()[e() - 2], c()[e() - 1]);
    }
}
