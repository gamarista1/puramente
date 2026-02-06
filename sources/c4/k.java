package C4;

import B4.b;
import B4.o;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.n;

public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29963a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29964b;

    /* renamed from: c  reason: collision with root package name */
    private final b f29965c;

    /* renamed from: d  reason: collision with root package name */
    private final o f29966d;

    /* renamed from: e  reason: collision with root package name */
    private final b f29967e;

    /* renamed from: f  reason: collision with root package name */
    private final b f29968f;

    /* renamed from: g  reason: collision with root package name */
    private final b f29969g;

    /* renamed from: h  reason: collision with root package name */
    private final b f29970h;

    /* renamed from: i  reason: collision with root package name */
    private final b f29971i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f29972j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f29973k;

    public enum a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29977a;

        private a(int i10) {
            this.f29977a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f29977a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, b bVar, o oVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z10, boolean z11) {
        this.f29963a = str;
        this.f29964b = aVar;
        this.f29965c = bVar;
        this.f29966d = oVar;
        this.f29967e = bVar2;
        this.f29968f = bVar3;
        this.f29969g = bVar4;
        this.f29970h = bVar5;
        this.f29971i = bVar6;
        this.f29972j = z10;
        this.f29973k = z11;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new n(l10, bVar, this);
    }

    public b b() {
        return this.f29968f;
    }

    public b c() {
        return this.f29970h;
    }

    public String d() {
        return this.f29963a;
    }

    public b e() {
        return this.f29969g;
    }

    public b f() {
        return this.f29971i;
    }

    public b g() {
        return this.f29965c;
    }

    public o h() {
        return this.f29966d;
    }

    public b i() {
        return this.f29967e;
    }

    public a j() {
        return this.f29964b;
    }

    public boolean k() {
        return this.f29972j;
    }

    public boolean l() {
        return this.f29973k;
    }
}
