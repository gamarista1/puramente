package C4;

import B4.a;
import B4.d;
import D4.b;
import android.graphics.Path;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.C4122g;

public class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29993a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f29994b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29995c;

    /* renamed from: d  reason: collision with root package name */
    private final a f29996d;

    /* renamed from: e  reason: collision with root package name */
    private final d f29997e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f29998f;

    public p(String str, boolean z10, Path.FillType fillType, a aVar, d dVar, boolean z11) {
        this.f29995c = str;
        this.f29993a = z10;
        this.f29994b = fillType;
        this.f29996d = aVar;
        this.f29997e = dVar;
        this.f29998f = z11;
    }

    public C4118c a(L l10, C4071k kVar, b bVar) {
        return new C4122g(l10, bVar, this);
    }

    public a b() {
        return this.f29996d;
    }

    public Path.FillType c() {
        return this.f29994b;
    }

    public String d() {
        return this.f29995c;
    }

    public d e() {
        return this.f29997e;
    }

    public boolean f() {
        return this.f29998f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f29993a + '}';
    }
}
