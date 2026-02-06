package Xf;

import fg.C5916k;
import fg.C5918l;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final C5918l f66397a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection f66398b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f66399c;

    public w(C5918l lVar, Collection collection, boolean z10) {
        C6496s.h(lVar, "nullabilityQualifier");
        C6496s.h(collection, "qualifierApplicabilityTypes");
        this.f66397a = lVar;
        this.f66398b = collection;
        this.f66399c = z10;
    }

    public static /* synthetic */ w b(w wVar, C5918l lVar, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = wVar.f66397a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f66398b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f66399c;
        }
        return wVar.a(lVar, collection, z10);
    }

    public final w a(C5918l lVar, Collection collection, boolean z10) {
        C6496s.h(lVar, "nullabilityQualifier");
        C6496s.h(collection, "qualifierApplicabilityTypes");
        return new w(lVar, collection, z10);
    }

    public final boolean c() {
        return this.f66399c;
    }

    public final C5918l d() {
        return this.f66397a;
    }

    public final Collection e() {
        return this.f66398b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (C6496s.c(this.f66397a, wVar.f66397a) && C6496s.c(this.f66398b, wVar.f66398b) && this.f66399c == wVar.f66399c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f66397a.hashCode() * 31) + this.f66398b.hashCode()) * 31) + Boolean.hashCode(this.f66399c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f66397a + ", qualifierApplicabilityTypes=" + this.f66398b + ", definitelyNotNull=" + this.f66399c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(C5918l lVar, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, collection, (i10 & 4) != 0 ? lVar.c() == C5916k.NOT_NULL : z10);
    }
}
