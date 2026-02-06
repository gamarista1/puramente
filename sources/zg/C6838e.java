package zg;

import Fg.C5366d0;
import Of.C5487e;
import kotlin.jvm.internal.C6496s;

/* renamed from: zg.e  reason: case insensitive filesystem */
public class C6838e implements C6840g, C6841h {

    /* renamed from: a  reason: collision with root package name */
    private final C5487e f74005a;

    /* renamed from: b  reason: collision with root package name */
    private final C6838e f74006b;

    /* renamed from: c  reason: collision with root package name */
    private final C5487e f74007c;

    public C6838e(C5487e eVar, C6838e eVar2) {
        C6496s.h(eVar, "classDescriptor");
        this.f74005a = eVar;
        this.f74006b = eVar2 == null ? this : eVar2;
        this.f74007c = eVar;
    }

    /* renamed from: b */
    public C5366d0 getType() {
        C5366d0 p10 = this.f74005a.p();
        C6496s.g(p10, "getDefaultType(...)");
        return p10;
    }

    public boolean equals(Object obj) {
        C6838e eVar;
        C5487e eVar2 = this.f74005a;
        C5487e eVar3 = null;
        if (obj instanceof C6838e) {
            eVar = (C6838e) obj;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar3 = eVar.f74005a;
        }
        return C6496s.c(eVar2, eVar3);
    }

    public int hashCode() {
        return this.f74005a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    public final C5487e u() {
        return this.f74005a;
    }
}
