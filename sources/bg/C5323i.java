package Bg;

import Of.h0;
import ig.c;
import kg.C6434a;
import kg.C6436c;
import kotlin.jvm.internal.C6496s;

/* renamed from: Bg.i  reason: case insensitive filesystem */
public final class C5323i {

    /* renamed from: a  reason: collision with root package name */
    private final C6436c f62531a;

    /* renamed from: b  reason: collision with root package name */
    private final c f62532b;

    /* renamed from: c  reason: collision with root package name */
    private final C6434a f62533c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f62534d;

    public C5323i(C6436c cVar, c cVar2, C6434a aVar, h0 h0Var) {
        C6496s.h(cVar, "nameResolver");
        C6496s.h(cVar2, "classProto");
        C6496s.h(aVar, "metadataVersion");
        C6496s.h(h0Var, "sourceElement");
        this.f62531a = cVar;
        this.f62532b = cVar2;
        this.f62533c = aVar;
        this.f62534d = h0Var;
    }

    public final C6436c a() {
        return this.f62531a;
    }

    public final c b() {
        return this.f62532b;
    }

    public final C6434a c() {
        return this.f62533c;
    }

    public final h0 d() {
        return this.f62534d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5323i)) {
            return false;
        }
        C5323i iVar = (C5323i) obj;
        if (C6496s.c(this.f62531a, iVar.f62531a) && C6496s.c(this.f62532b, iVar.f62532b) && C6496s.c(this.f62533c, iVar.f62533c) && C6496s.c(this.f62534d, iVar.f62534d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f62531a.hashCode() * 31) + this.f62532b.hashCode()) * 31) + this.f62533c.hashCode()) * 31) + this.f62534d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f62531a + ", classProto=" + this.f62532b + ", metadataVersion=" + this.f62533c + ", sourceElement=" + this.f62534d + ')';
    }
}
