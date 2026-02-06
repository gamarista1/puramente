package k0;

import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import yf.p;

public final class f implements i {

    /* renamed from: b  reason: collision with root package name */
    private final i f23068b;

    /* renamed from: c  reason: collision with root package name */
    private final i f23069c;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23070a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, i.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public f(i iVar, i iVar2) {
        this.f23068b = iVar;
        this.f23069c = iVar2;
    }

    public final i a() {
        return this.f23069c;
    }

    public final i b() {
        return this.f23068b;
    }

    public boolean c(C6798l lVar) {
        if (!this.f23068b.c(lVar) || !this.f23069c.c(lVar)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!C6496s.c(this.f23068b, fVar.f23068b) || !C6496s.c(this.f23069c, fVar.f23069c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Object f(Object obj, p pVar) {
        return this.f23069c.f(this.f23068b.f(obj, pVar), pVar);
    }

    public int hashCode() {
        return this.f23068b.hashCode() + (this.f23069c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) f("", a.f23070a)) + ']';
    }
}
