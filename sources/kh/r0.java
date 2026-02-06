package kh;

import Ff.d;
import gh.C5978b;
import ih.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class r0 extends C6470q {

    /* renamed from: b  reason: collision with root package name */
    private final d f71698b;

    /* renamed from: c  reason: collision with root package name */
    private final f f71699c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(d dVar, C5978b bVar) {
        super(bVar, (DefaultConstructorMarker) null);
        C6496s.h(dVar, "kClass");
        C6496s.h(bVar, "eSerializer");
        this.f71698b = dVar;
        this.f71699c = new C6445d(bVar.getDescriptor());
    }

    public f getDescriptor() {
        return this.f71699c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public ArrayList a() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int b(ArrayList arrayList) {
        C6496s.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void c(ArrayList arrayList, int i10) {
        C6496s.h(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Iterator d(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return C6481c.a(objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int e(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return objArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void n(ArrayList arrayList, int i10, Object obj) {
        C6496s.h(arrayList, "<this>");
        arrayList.add(i10, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public ArrayList k(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return new ArrayList(C6559l.e(objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object[] l(ArrayList arrayList) {
        C6496s.h(arrayList, "<this>");
        return C6452g0.o(arrayList, this.f71698b);
    }
}
