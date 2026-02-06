package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.C6496s;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final a f60034a;

    /* renamed from: b  reason: collision with root package name */
    private final o f60035b;

    /* renamed from: c  reason: collision with root package name */
    private final m f60036c;

    public n(a aVar, o oVar, m mVar) {
        C6496s.h(aVar, "insets");
        C6496s.h(oVar, "mode");
        C6496s.h(mVar, "edges");
        this.f60034a = aVar;
        this.f60035b = oVar;
        this.f60036c = mVar;
    }

    public final m a() {
        return this.f60036c;
    }

    public final a b() {
        return this.f60034a;
    }

    public final o c() {
        return this.f60035b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C6496s.c(this.f60034a, nVar.f60034a) && this.f60035b == nVar.f60035b && C6496s.c(this.f60036c, nVar.f60036c);
    }

    public int hashCode() {
        return (((this.f60034a.hashCode() * 31) + this.f60035b.hashCode()) * 31) + this.f60036c.hashCode();
    }

    public String toString() {
        a aVar = this.f60034a;
        o oVar = this.f60035b;
        m mVar = this.f60036c;
        return "SafeAreaViewLocalData(insets=" + aVar + ", mode=" + oVar + ", edges=" + mVar + ")";
    }
}
