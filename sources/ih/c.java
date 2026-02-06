package ih;

import Ff.d;
import java.util.List;
import kotlin.jvm.internal.C6496s;

final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f68469a;

    /* renamed from: b  reason: collision with root package name */
    public final d f68470b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68471c;

    public c(f fVar, d dVar) {
        C6496s.h(fVar, "original");
        C6496s.h(dVar, "kClass");
        this.f68469a = fVar;
        this.f68470b = dVar;
        this.f68471c = fVar.i() + '<' + dVar.w() + '>';
    }

    public boolean b() {
        return this.f68469a.b();
    }

    public int c(String str) {
        C6496s.h(str, "name");
        return this.f68469a.c(str);
    }

    public int d() {
        return this.f68469a.d();
    }

    public String e(int i10) {
        return this.f68469a.e(i10);
    }

    public boolean equals(Object obj) {
        c cVar;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null && C6496s.c(this.f68469a, cVar.f68469a) && C6496s.c(cVar.f68470b, this.f68470b)) {
            return true;
        }
        return false;
    }

    public List f(int i10) {
        return this.f68469a.f(i10);
    }

    public f g(int i10) {
        return this.f68469a.g(i10);
    }

    public List getAnnotations() {
        return this.f68469a.getAnnotations();
    }

    public j h() {
        return this.f68469a.h();
    }

    public int hashCode() {
        return (this.f68470b.hashCode() * 31) + i().hashCode();
    }

    public String i() {
        return this.f68471c;
    }

    public boolean isInline() {
        return this.f68469a.isInline();
    }

    public boolean j(int i10) {
        return this.f68469a.j(i10);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f68470b + ", original: " + this.f68469a + ')';
    }
}
