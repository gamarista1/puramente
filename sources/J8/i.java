package j8;

import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final j f44893a;

    /* renamed from: b  reason: collision with root package name */
    private final j f44894b;

    /* renamed from: c  reason: collision with root package name */
    private final j f44895c;

    /* renamed from: d  reason: collision with root package name */
    private final j f44896d;

    public i(j jVar, j jVar2, j jVar3, j jVar4) {
        C6496s.h(jVar, "topLeft");
        C6496s.h(jVar2, "topRight");
        C6496s.h(jVar3, "bottomLeft");
        C6496s.h(jVar4, "bottomRight");
        this.f44893a = jVar;
        this.f44894b = jVar2;
        this.f44895c = jVar3;
        this.f44896d = jVar4;
    }

    public final j a() {
        return this.f44895c;
    }

    public final j b() {
        return this.f44896d;
    }

    public final j c() {
        return this.f44893a;
    }

    public final j d() {
        return this.f44894b;
    }

    public final boolean e() {
        if (this.f44893a.a() > 0.0f || this.f44893a.b() > 0.0f || this.f44894b.a() > 0.0f || this.f44894b.b() > 0.0f || this.f44895c.a() > 0.0f || this.f44895c.b() > 0.0f || this.f44896d.a() > 0.0f) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (C6496s.c(this.f44893a, iVar.f44893a) && C6496s.c(this.f44894b, iVar.f44894b) && C6496s.c(this.f44895c, iVar.f44895c) && C6496s.c(this.f44896d, iVar.f44896d)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (!C6496s.c(this.f44893a, this.f44894b) || !C6496s.c(this.f44893a, this.f44895c) || !C6496s.c(this.f44893a, this.f44896d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f44893a.hashCode() * 31) + this.f44894b.hashCode()) * 31) + this.f44895c.hashCode()) * 31) + this.f44896d.hashCode();
    }

    public String toString() {
        j jVar = this.f44893a;
        j jVar2 = this.f44894b;
        j jVar3 = this.f44895c;
        j jVar4 = this.f44896d;
        return "ComputedBorderRadius(topLeft=" + jVar + ", topRight=" + jVar2 + ", bottomLeft=" + jVar3 + ", bottomRight=" + jVar4 + ")";
    }

    public i() {
        this(new j(0.0f, 0.0f), new j(0.0f, 0.0f), new j(0.0f, 0.0f), new j(0.0f, 0.0f));
    }
}
