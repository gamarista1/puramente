package Q0;

import Ef.m;
import Q0.C1321d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: Q0.e  reason: case insensitive filesystem */
public abstract class C1322e {

    /* renamed from: a  reason: collision with root package name */
    private static final C1321d f5330a = new C1321d("", (List) null, (List) null, 6, (DefaultConstructorMarker) null);

    public static final boolean f(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i10 > i12 || i13 > i11) {
            return false;
        }
        if (i11 == i13) {
            if (i12 == i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
        }
        return true;
    }

    public static final C1321d g() {
        return f5330a;
    }

    /* access modifiers changed from: private */
    public static final List h(List list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        } else if (list == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                C1321d.c cVar = (C1321d.c) obj;
                if (l(i10, i11, cVar.h(), cVar.f())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                C1321d.c cVar2 = (C1321d.c) arrayList.get(i13);
                arrayList2.add(new C1321d.c(cVar2.g(), Math.max(i10, cVar2.h()) - i10, Math.min(i11, cVar2.f()) - i10, cVar2.i()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
    }

    /* access modifiers changed from: private */
    public static final List i(C1321d dVar, int i10, int i11) {
        List b10;
        if (i10 == i11 || (b10 = dVar.b()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.j().length()) {
            return b10;
        }
        ArrayList arrayList = new ArrayList(b10.size());
        int size = b10.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = b10.get(i12);
            C1321d.c cVar = (C1321d.c) obj;
            if (l(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1321d.c cVar2 = (C1321d.c) arrayList.get(i13);
            arrayList2.add(new C1321d.c(cVar2.g(), m.l(cVar2.h(), i10, i11) - i10, m.l(cVar2.f(), i10, i11) - i10, cVar2.i()));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static final List j(C1321d dVar, int i10, int i11) {
        List f10;
        if (i10 == i11 || (f10 = dVar.f()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.j().length()) {
            return f10;
        }
        ArrayList arrayList = new ArrayList(f10.size());
        int size = f10.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = f10.get(i12);
            C1321d.c cVar = (C1321d.c) obj;
            if (l(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1321d.c cVar2 = (C1321d.c) arrayList.get(i13);
            arrayList2.add(new C1321d.c(cVar2.g(), m.l(cVar2.h(), i10, i11) - i10, m.l(cVar2.f(), i10, i11) - i10));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static final List k(C1321d dVar, int i10, int i11) {
        List h10;
        if (i10 == i11 || (h10 = dVar.h()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.j().length()) {
            return h10;
        }
        ArrayList arrayList = new ArrayList(h10.size());
        int size = h10.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = h10.get(i12);
            C1321d.c cVar = (C1321d.c) obj;
            if (l(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1321d.c cVar2 = (C1321d.c) arrayList.get(i13);
            arrayList2.add(new C1321d.c(cVar2.g(), m.l(cVar2.h(), i10, i11) - i10, m.l(cVar2.f(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean l(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i12) < Math.min(i11, i13) || f(i10, i11, i12, i13) || f(i12, i13, i10, i11)) {
            return true;
        }
        return false;
    }

    public static final List m(C1321d dVar, C1338v vVar) {
        int length = dVar.j().length();
        List f10 = dVar.f();
        if (f10 == null) {
            f10 = C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        int size = f10.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C1321d.c cVar = (C1321d.c) f10.get(i10);
            C1338v vVar2 = (C1338v) cVar.a();
            int b10 = cVar.b();
            int c10 = cVar.c();
            if (b10 != i11) {
                arrayList.add(new C1321d.c(vVar, i11, b10));
            }
            arrayList.add(new C1321d.c(vVar.l(vVar2), b10, c10));
            i10++;
            i11 = c10;
        }
        if (i11 != length) {
            arrayList.add(new C1321d.c(vVar, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C1321d.c(vVar, 0, 0));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C1321d n(C1321d dVar, int i10, int i11) {
        String str;
        if (i10 != i11) {
            str = dVar.j().substring(i10, i11);
            C6496s.g(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new C1321d(str, k(dVar, i10, i11), (List) null, (List) null, 12, (DefaultConstructorMarker) null);
    }
}
