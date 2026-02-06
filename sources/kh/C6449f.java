package kh;

import gh.C5978b;
import ih.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.f  reason: case insensitive filesystem */
public final class C6449f extends r {

    /* renamed from: b  reason: collision with root package name */
    private final f f71655b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6449f(C5978b bVar) {
        super(bVar);
        C6496s.h(bVar, "element");
        this.f71655b = new C6447e(bVar.getDescriptor());
    }

    public f getDescriptor() {
        return this.f71655b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public ArrayList a() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int b(ArrayList arrayList) {
        C6496s.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void c(ArrayList arrayList, int i10) {
        C6496s.h(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void n(ArrayList arrayList, int i10, Object obj) {
        C6496s.h(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public ArrayList k(List list) {
        ArrayList arrayList;
        C6496s.h(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList(list);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public List l(ArrayList arrayList) {
        C6496s.h(arrayList, "<this>");
        return arrayList;
    }
}
