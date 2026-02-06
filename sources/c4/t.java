package C4;

import B4.b;
import u4.C4071k;
import u4.L;
import w4.C4118c;
import w4.u;

public class t implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f30026a;

    /* renamed from: b  reason: collision with root package name */
    private final a f30027b;

    /* renamed from: c  reason: collision with root package name */
    private final b f30028c;

    /* renamed from: d  reason: collision with root package name */
    private final b f30029d;

    /* renamed from: e  reason: collision with root package name */
    private final b f30030e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f30031f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, b bVar, b bVar2, b bVar3, boolean z10) {
        this.f30026a = str;
        this.f30027b = aVar;
        this.f30028c = bVar;
        this.f30029d = bVar2;
        this.f30030e = bVar3;
        this.f30031f = z10;
    }

    public C4118c a(L l10, C4071k kVar, D4.b bVar) {
        return new u(bVar, this);
    }

    public b b() {
        return this.f30029d;
    }

    public String c() {
        return this.f30026a;
    }

    public b d() {
        return this.f30030e;
    }

    public b e() {
        return this.f30028c;
    }

    public a f() {
        return this.f30027b;
    }

    public boolean g() {
        return this.f30031f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f30028c + ", end: " + this.f30029d + ", offset: " + this.f30030e + "}";
    }
}
