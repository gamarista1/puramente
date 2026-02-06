package C4;

import B4.b;
import B4.c;
import B4.d;
import B4.f;
import android.graphics.Path;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.C4123h;

public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final g f29899a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f29900b;

    /* renamed from: c  reason: collision with root package name */
    private final c f29901c;

    /* renamed from: d  reason: collision with root package name */
    private final d f29902d;

    /* renamed from: e  reason: collision with root package name */
    private final f f29903e;

    /* renamed from: f  reason: collision with root package name */
    private final f f29904f;

    /* renamed from: g  reason: collision with root package name */
    private final String f29905g;

    /* renamed from: h  reason: collision with root package name */
    private final b f29906h;

    /* renamed from: i  reason: collision with root package name */
    private final b f29907i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f29908j;

    public e(String str, g gVar, Path.FillType fillType, c cVar, d dVar, f fVar, f fVar2, b bVar, b bVar2, boolean z10) {
        this.f29899a = gVar;
        this.f29900b = fillType;
        this.f29901c = cVar;
        this.f29902d = dVar;
        this.f29903e = fVar;
        this.f29904f = fVar2;
        this.f29905g = str;
        this.f29906h = bVar;
        this.f29907i = bVar2;
        this.f29908j = z10;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new C4123h(l10, kVar, bVar, this);
    }

    public f b() {
        return this.f29904f;
    }

    public Path.FillType c() {
        return this.f29900b;
    }

    public c d() {
        return this.f29901c;
    }

    public g e() {
        return this.f29899a;
    }

    public String f() {
        return this.f29905g;
    }

    public d g() {
        return this.f29902d;
    }

    public f h() {
        return this.f29903e;
    }

    public boolean i() {
        return this.f29908j;
    }
}
