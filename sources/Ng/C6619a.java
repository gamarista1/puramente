package ng;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ng.a  reason: case insensitive filesystem */
public final class C6619a {

    /* renamed from: f  reason: collision with root package name */
    public static final C1042a f72275f = new C1042a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final f f72276g;

    /* renamed from: h  reason: collision with root package name */
    private static final c f72277h;

    /* renamed from: a  reason: collision with root package name */
    private final c f72278a;

    /* renamed from: b  reason: collision with root package name */
    private final c f72279b;

    /* renamed from: c  reason: collision with root package name */
    private final f f72280c;

    /* renamed from: d  reason: collision with root package name */
    private final b f72281d;

    /* renamed from: e  reason: collision with root package name */
    private final c f72282e;

    /* renamed from: ng.a$a  reason: collision with other inner class name */
    public static final class C1042a {
        public /* synthetic */ C1042a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1042a() {
        }
    }

    static {
        f fVar = h.f72315m;
        f72276g = fVar;
        c k10 = c.k(fVar);
        C6496s.g(k10, "topLevel(...)");
        f72277h = k10;
    }

    private C6619a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f72278a = cVar;
        this.f72279b = cVar2;
        this.f72280c = fVar;
        this.f72281d = bVar;
        this.f72282e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6619a) {
            C6619a aVar = (C6619a) obj;
            if (C6496s.c(this.f72278a, aVar.f72278a) && C6496s.c(this.f72279b, aVar.f72279b) && C6496s.c(this.f72280c, aVar.f72280c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = (527 + this.f72278a.hashCode()) * 31;
        c cVar = this.f72279b;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + this.f72280c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String b10 = this.f72278a.b();
        C6496s.g(b10, "asString(...)");
        sb2.append(p.C(b10, '.', '/', false, 4, (Object) null));
        sb2.append("/");
        c cVar = this.f72279b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f72280c);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6619a(c cVar, f fVar) {
        this(cVar, (c) null, fVar, (b) null, (c) null);
        C6496s.h(cVar, "packageName");
        C6496s.h(fVar, "callableName");
    }
}
