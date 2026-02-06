package j4;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;
import o4.C3880c;

/* renamed from: j4.s  reason: case insensitive filesystem */
public final class C3632s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f44782b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C3632s f44783c = new C3632s(O.i());

    /* renamed from: a  reason: collision with root package name */
    private final Map f44784a;

    /* renamed from: j4.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3632s a(Map map) {
            return new C3632s(C3880c.b(map), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C3632s(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map a() {
        return this.f44784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3632s) || !C6496s.c(this.f44784a, ((C3632s) obj).f44784a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f44784a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f44784a + ')';
    }

    private C3632s(Map map) {
        this.f44784a = map;
    }
}
