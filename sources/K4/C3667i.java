package k4;

import k4.C3661c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: k4.i  reason: case insensitive filesystem */
public final class C3667i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f45118c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C3667i f45119d;

    /* renamed from: a  reason: collision with root package name */
    private final C3661c f45120a;

    /* renamed from: b  reason: collision with root package name */
    private final C3661c f45121b;

    /* renamed from: k4.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C3661c.b bVar = C3661c.b.f45104a;
        f45119d = new C3667i(bVar, bVar);
    }

    public C3667i(C3661c cVar, C3661c cVar2) {
        this.f45120a = cVar;
        this.f45121b = cVar2;
    }

    public final C3661c a() {
        return this.f45120a;
    }

    public final C3661c b() {
        return this.f45121b;
    }

    public final C3661c c() {
        return this.f45121b;
    }

    public final C3661c d() {
        return this.f45120a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3667i)) {
            return false;
        }
        C3667i iVar = (C3667i) obj;
        if (C6496s.c(this.f45120a, iVar.f45120a) && C6496s.c(this.f45121b, iVar.f45121b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f45120a.hashCode() * 31) + this.f45121b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f45120a + ", height=" + this.f45121b + ')';
    }
}
