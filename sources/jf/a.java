package Jf;

import Jf.h;
import Uf.C5553f;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import sf.C6714a;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Class f63778a;

    /* renamed from: b  reason: collision with root package name */
    private final List f63779b;

    /* renamed from: c  reason: collision with root package name */
    private final C0940a f63780c;

    /* renamed from: d  reason: collision with root package name */
    private final List f63781d;

    /* renamed from: e  reason: collision with root package name */
    private final List f63782e;

    /* renamed from: f  reason: collision with root package name */
    private final List f63783f;

    /* renamed from: g  reason: collision with root package name */
    private final List f63784g;

    /* renamed from: Jf.a$a  reason: collision with other inner class name */
    public enum C0940a {
        CALL_BY_NAME,
        POSITIONAL_CALL;

        static {
            C0940a[] a10;
            f63788d = C6714a.a(a10);
        }
    }

    public enum b {
        JAVA,
        KOTLIN;

        static {
            b[] a10;
            f63792d = C6714a.a(a10);
        }
    }

    public a(Class cls, List list, C0940a aVar, b bVar, List list2) {
        C6496s.h(cls, "jClass");
        C6496s.h(list, "parameterNames");
        C6496s.h(aVar, "callMode");
        C6496s.h(bVar, "origin");
        C6496s.h(list2, "methods");
        this.f63778a = cls;
        this.f63779b = list;
        this.f63780c = aVar;
        this.f63781d = list2;
        Iterable<Method> iterable = list2;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Method genericReturnType : iterable) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.f63782e = arrayList;
        Iterable<Method> iterable2 = this.f63781d;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
        for (Method returnType : iterable2) {
            Class<?> returnType2 = returnType.getReturnType();
            C6496s.e(returnType2);
            Class<?> k10 = C5553f.k(returnType2);
            if (k10 != null) {
                returnType2 = k10;
            }
            arrayList2.add(returnType2);
        }
        this.f63783f = arrayList2;
        Iterable<Method> iterable3 = this.f63781d;
        ArrayList arrayList3 = new ArrayList(C6565s.y(iterable3, 10));
        for (Method defaultValue : iterable3) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.f63784g = arrayList3;
        if (this.f63780c == C0940a.POSITIONAL_CALL && bVar == b.JAVA && !C6565s.H0(this.f63779b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public List a() {
        return this.f63782e;
    }

    public void b(Object[] objArr) {
        h.a.a(this, objArr);
    }

    public Void c() {
        return null;
    }

    public Object call(Object[] objArr) {
        Object obj;
        C6496s.h(objArr, "args");
        b(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj2 = objArr[i10];
            int i12 = i11 + 1;
            if (obj2 == null && this.f63780c == C0940a.CALL_BY_NAME) {
                obj = this.f63784g.get(i11);
            } else {
                obj = f.q(obj2, (Class) this.f63783f.get(i11));
            }
            if (obj != null) {
                arrayList.add(obj);
                i10++;
                i11 = i12;
            } else {
                Void unused = f.p(i11, (String) this.f63779b.get(i11), (Class) this.f63783f.get(i11));
                throw null;
            }
        }
        return f.g(this.f63778a, O.w(C6565s.n1(this.f63779b, arrayList)), this.f63781d);
    }

    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) c();
    }

    public Type getReturnType() {
        return this.f63778a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.Class r7, java.util.List r8, Jf.a.C0940a r9, Jf.a.b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x002d
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = mf.C6565s.y(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L_0x0016:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x002b
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r12.add(r13)
            goto L_0x0016
        L_0x002b:
            r5 = r12
            goto L_0x002e
        L_0x002d:
            r5 = r11
        L_0x002e:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.a.<init>(java.lang.Class, java.util.List, Jf.a$a, Jf.a$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
