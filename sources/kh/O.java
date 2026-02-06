package kh;

import gh.C5978b;
import ih.f;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class O extends r {

    /* renamed from: b  reason: collision with root package name */
    private final f f71619b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(C5978b bVar) {
        super(bVar);
        C6496s.h(bVar, "eSerializer");
        this.f71619b = new N(bVar.getDescriptor());
    }

    public f getDescriptor() {
        return this.f71619b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public LinkedHashSet a() {
        return new LinkedHashSet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int b(LinkedHashSet linkedHashSet) {
        C6496s.h(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void c(LinkedHashSet linkedHashSet, int i10) {
        C6496s.h(linkedHashSet, "<this>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void n(LinkedHashSet linkedHashSet, int i10, Object obj) {
        C6496s.h(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public LinkedHashSet k(Set set) {
        LinkedHashSet linkedHashSet;
        C6496s.h(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet(set);
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Set l(LinkedHashSet linkedHashSet) {
        C6496s.h(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
