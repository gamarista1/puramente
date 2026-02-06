package Uf;

import Uf.C5555h;
import eg.C5828e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;

public final class l extends C5555h implements C5828e {

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f65250c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(f fVar, Object[] objArr) {
        super(fVar, (DefaultConstructorMarker) null);
        C6496s.h(objArr, "values");
        this.f65250c = objArr;
    }

    public List c() {
        Object[] objArr = this.f65250c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C5555h.a aVar = C5555h.f65247b;
            C6496s.e(obj);
            arrayList.add(aVar.a(obj, (f) null));
        }
        return arrayList;
    }
}
