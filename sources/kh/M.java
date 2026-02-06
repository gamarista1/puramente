package kh;

import gh.C5978b;
import ih.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class M extends W {

    /* renamed from: c  reason: collision with root package name */
    private final f f71615c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public M(C5978b bVar, C5978b bVar2) {
        super(bVar, bVar2, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "kSerializer");
        C6496s.h(bVar2, "vSerializer");
        this.f71615c = new L(bVar.getDescriptor(), bVar2.getDescriptor());
    }

    public f getDescriptor() {
        return this.f71615c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public LinkedHashMap a() {
        return new LinkedHashMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int b(LinkedHashMap linkedHashMap) {
        C6496s.h(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void c(LinkedHashMap linkedHashMap, int i10) {
        C6496s.h(linkedHashMap, "<this>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Iterator d(Map map) {
        C6496s.h(map, "<this>");
        return map.entrySet().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int e(Map map) {
        C6496s.h(map, "<this>");
        return map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public LinkedHashMap k(Map map) {
        LinkedHashMap linkedHashMap;
        C6496s.h(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap(map);
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Map l(LinkedHashMap linkedHashMap) {
        C6496s.h(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
