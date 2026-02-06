package O0;

import Ff.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.p;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f4657a;

    /* renamed from: b  reason: collision with root package name */
    private final p f4658b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4659c;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4660a = new a();

        a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return obj2;
            }
            return obj;
        }
    }

    public u(String str, p pVar) {
        this.f4657a = str;
        this.f4658b = pVar;
    }

    public final String a() {
        return this.f4657a;
    }

    public final boolean b() {
        return this.f4659c;
    }

    public final Object c(Object obj, Object obj2) {
        return this.f4658b.invoke(obj, obj2);
    }

    public final void d(v vVar, l lVar, Object obj) {
        vVar.a(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f4657a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(String str, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f4660a : pVar);
    }

    public u(String str, boolean z10) {
        this(str, (p) null, 2, (DefaultConstructorMarker) null);
        this.f4659c = z10;
    }

    public u(String str, boolean z10, p pVar) {
        this(str, pVar);
        this.f4659c = z10;
    }
}
