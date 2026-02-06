package Jf;

import Ef.i;
import Fg.F0;
import Fg.S;
import If.C5432d0;
import If.j1;
import Of.C5487e;
import Of.C5490h;
import Of.C5507z;
import Of.W;
import Sg.p;
import Uf.C5553f;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;
import rf.C6680b;
import rg.C6693k;

public final class n implements h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63822a;

    /* renamed from: b  reason: collision with root package name */
    private final h f63823b;

    /* renamed from: c  reason: collision with root package name */
    private final Member f63824c;

    /* renamed from: d  reason: collision with root package name */
    private final a f63825d;

    /* renamed from: e  reason: collision with root package name */
    private final i[] f63826e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63827f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final i f63828a;

        /* renamed from: b  reason: collision with root package name */
        private final List[] f63829b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f63830c;

        public a(i iVar, List[] listArr, Method method) {
            C6496s.h(iVar, "argumentRange");
            C6496s.h(listArr, "unboxParameters");
            this.f63828a = iVar;
            this.f63829b = listArr;
            this.f63830c = method;
        }

        public final i a() {
            return this.f63828a;
        }

        public final Method b() {
            return this.f63830c;
        }

        public final List[] c() {
            return this.f63829b;
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private final Method f63831a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f63832b;

        /* renamed from: c  reason: collision with root package name */
        private final List f63833c;

        /* renamed from: d  reason: collision with root package name */
        private final List f63834d;

        /* renamed from: e  reason: collision with root package name */
        private final List f63835e;

        public b(C5507z zVar, C5432d0 d0Var, String str, List list) {
            List list2;
            C6496s.h(zVar, "descriptor");
            C6496s.h(d0Var, "container");
            C6496s.h(str, "constructorDesc");
            C6496s.h(list, "originalParameters");
            Method D10 = d0Var.D("constructor-impl", str);
            C6496s.e(D10);
            this.f63831a = D10;
            Method D11 = d0Var.D("box-impl", p.w0(str, "V") + C5553f.f(d0Var.f()));
            C6496s.e(D11);
            this.f63832b = D11;
            Iterable<W> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (W type : iterable) {
                S type2 = type.getType();
                C6496s.g(type2, "getType(...)");
                arrayList.add(o.p(F0.a(type2), zVar));
            }
            this.f63833c = arrayList;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
            int i10 = 0;
            for (Object next : iterable) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                C5490h o10 = ((W) next).getType().N0().o();
                C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                C5487e eVar = (C5487e) o10;
                Iterable iterable2 = (List) this.f63833c.get(i10);
                if (iterable2 != null) {
                    Iterable<Method> iterable3 = iterable2;
                    list2 = new ArrayList(C6565s.y(iterable3, 10));
                    for (Method returnType : iterable3) {
                        list2.add(returnType.getReturnType());
                    }
                } else {
                    Class q10 = j1.q(eVar);
                    C6496s.e(q10);
                    list2 = C6565s.e(q10);
                }
                arrayList2.add(list2);
                i10 = i11;
            }
            this.f63834d = arrayList2;
            this.f63835e = C6565s.A(arrayList2);
        }

        public List a() {
            return this.f63835e;
        }

        public Void b() {
            return null;
        }

        public final List c() {
            return this.f63834d;
        }

        public Object call(Object[] objArr) {
            List list;
            C6496s.h(objArr, "args");
            ArrayList arrayList = new ArrayList();
            for (Pair pair : C6559l.C1(objArr, this.f63833c)) {
                Object a10 = pair.a();
                Iterable iterable = (List) pair.b();
                if (iterable != null) {
                    Iterable<Method> iterable2 = iterable;
                    list = new ArrayList(C6565s.y(iterable2, 10));
                    for (Method invoke : iterable2) {
                        list.add(invoke.invoke(a10, (Object[]) null));
                    }
                } else {
                    list = C6565s.e(a10);
                }
                C6565s.D(arrayList, list);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f63831a.invoke((Object) null, Arrays.copyOf(array, array.length));
            return this.f63832b.invoke((Object) null, Arrays.copyOf(array, array.length));
        }

        public /* bridge */ /* synthetic */ Member getMember() {
            return (Member) b();
        }

        public Type getReturnType() {
            Class<?> returnType = this.f63832b.getReturnType();
            C6496s.g(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0105, code lost:
        if ((r12 instanceof Jf.g) != false) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[LOOP:1: B:22:0x007c->B:24:0x0082, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(Of.C5484b r11, Jf.h r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "oldCaller"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r10.<init>()
            r10.f63822a = r13
            boolean r0 = r12 instanceof Jf.i.h.c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00ab
            Of.c0 r0 = r11.P()
            if (r0 != 0) goto L_0x001f
            Of.c0 r0 = r11.M()
        L_0x001f:
            if (r0 == 0) goto L_0x0026
            Fg.S r0 = r0.getType()
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 == 0) goto L_0x00ab
            boolean r3 = rg.C6693k.i(r0)
            if (r3 == 0) goto L_0x00ab
            if (r13 == 0) goto L_0x0060
            java.util.List r13 = r11.k()
            java.lang.String r3 = "getValueParameters(...)"
            kotlin.jvm.internal.C6496s.g(r13, r3)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r3 = r13 instanceof java.util.Collection
            if (r3 == 0) goto L_0x004a
            r3 = r13
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x004a
            goto L_0x00ab
        L_0x004a:
            java.util.Iterator r13 = r13.iterator()
        L_0x004e:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r13.next()
            Of.t0 r3 = (Of.t0) r3
            boolean r3 = r3.A0()
            if (r3 == 0) goto L_0x004e
        L_0x0060:
            Fg.d0 r13 = Fg.F0.a(r0)
            java.util.List r13 = Jf.o.n(r13)
            kotlin.jvm.internal.C6496s.e(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = mf.C6565s.y(r13, r3)
            r0.<init>(r3)
            java.util.Iterator r13 = r13.iterator()
        L_0x007c:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0097
            java.lang.Object r3 = r13.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r4 = r12
            Jf.i$h$c r4 = (Jf.i.h.c) r4
            java.lang.Object r4 = r4.f()
            java.lang.Object r3 = r3.invoke(r4, r1)
            r0.add(r3)
            goto L_0x007c
        L_0x0097:
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Object[] r13 = r0.toArray(r13)
            Jf.i$h$d r0 = new Jf.i$h$d
            Jf.i$h r12 = (Jf.i.h) r12
            java.lang.reflect.Member r12 = r12.getMember()
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r0.<init>(r12, r13)
            r12 = r0
        L_0x00ab:
            r10.f63823b = r12
            java.lang.reflect.Member r13 = r12.getMember()
            r10.f63824c = r13
            Fg.S r13 = r11.getReturnType()
            kotlin.jvm.internal.C6496s.e(r13)
            boolean r0 = r11 instanceof Of.C5507z
            r3 = 1
            if (r0 == 0) goto L_0x00d6
            r4 = r11
            Of.z r4 = (Of.C5507z) r4
            boolean r4 = r4.isSuspend()
            if (r4 == 0) goto L_0x00d6
            Fg.S r4 = rg.C6693k.j(r13)
            if (r4 == 0) goto L_0x00d6
            boolean r4 = Lf.i.s0(r4)
            if (r4 != r3) goto L_0x00d6
        L_0x00d4:
            r13 = r1
            goto L_0x00e0
        L_0x00d6:
            java.lang.Class r13 = Jf.o.s(r13)
            if (r13 == 0) goto L_0x00d4
            java.lang.reflect.Method r13 = Jf.o.k(r13, r11)
        L_0x00e0:
            boolean r4 = rg.C6693k.a(r11)
            if (r4 == 0) goto L_0x00f5
            Jf.n$a r11 = new Jf.n$a
            Ef.i$a r12 = Ef.i.f62825e
            Ef.i r12 = r12.a()
            java.util.List[] r0 = new java.util.List[r2]
            r11.<init>(r12, r0, r13)
            goto L_0x01cc
        L_0x00f5:
            boolean r4 = r12 instanceof Jf.i.h.c
            r5 = -1
            if (r4 != 0) goto L_0x0125
            boolean r4 = r12 instanceof Jf.i.h.d
            if (r4 == 0) goto L_0x00ff
            goto L_0x0125
        L_0x00ff:
            boolean r4 = r11 instanceof Of.C5494l
            if (r4 == 0) goto L_0x010a
            boolean r4 = r12 instanceof Jf.g
            if (r4 == 0) goto L_0x0108
            goto L_0x0125
        L_0x0108:
            r5 = r2
            goto L_0x0125
        L_0x010a:
            Of.c0 r4 = r11.M()
            if (r4 == 0) goto L_0x0108
            boolean r4 = r12 instanceof Jf.g
            if (r4 != 0) goto L_0x0108
            Of.m r4 = r11.b()
            java.lang.String r5 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C6496s.g(r4, r5)
            boolean r4 = rg.C6693k.g(r4)
            if (r4 == 0) goto L_0x0124
            goto L_0x0108
        L_0x0124:
            r5 = r3
        L_0x0125:
            boolean r4 = r12 instanceof Jf.i.h.d
            if (r4 == 0) goto L_0x0132
            r4 = r12
            Jf.i$h$d r4 = (Jf.i.h.d) r4
            int r4 = r4.g()
            int r4 = -r4
            goto L_0x0133
        L_0x0132:
            r4 = r5
        L_0x0133:
            java.lang.reflect.Member r12 = r12.getMember()
            Jf.m r6 = Jf.m.f63821a
            java.util.List r12 = Jf.o.r(r11, r12, r6)
            boolean r6 = r10.f63822a
            if (r6 == 0) goto L_0x0161
            r6 = r12
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r2
        L_0x0149:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x015b
            java.lang.Object r8 = r6.next()
            Fg.S r8 = (Fg.S) r8
            int r8 = d(r8)
            int r7 = r7 + r8
            goto L_0x0149
        L_0x015b:
            int r7 = r7 + 31
            int r7 = r7 / 32
            int r7 = r7 + r3
            goto L_0x0162
        L_0x0161:
            r7 = r2
        L_0x0162:
            if (r0 == 0) goto L_0x016f
            r0 = r11
            Of.z r0 = (Of.C5507z) r0
            boolean r0 = r0.isSuspend()
            if (r0 == 0) goto L_0x016f
            r0 = r3
            goto L_0x0170
        L_0x016f:
            r0 = r2
        L_0x0170:
            int r7 = r7 + r0
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r6 = r2
        L_0x0179:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x018b
            java.lang.Object r8 = r0.next()
            Fg.S r8 = (Fg.S) r8
            int r8 = d(r8)
            int r6 = r6 + r8
            goto L_0x0179
        L_0x018b:
            int r6 = r6 + r4
            int r6 = r6 + r7
            boolean r0 = r10.f63822a
            Jf.o.g(r10, r6, r11, r0)
            int r0 = java.lang.Math.max(r5, r2)
            int r4 = r12.size()
            int r4 = r4 + r5
            Ef.i r0 = Ef.m.u(r0, r4)
            java.util.List[] r4 = new java.util.List[r6]
            r7 = r2
        L_0x01a2:
            if (r7 >= r6) goto L_0x01c7
            int r8 = r0.k()
            int r9 = r0.n()
            if (r7 > r9) goto L_0x01c1
            if (r8 > r7) goto L_0x01c1
            int r8 = r7 - r5
            java.lang.Object r8 = r12.get(r8)
            Fg.S r8 = (Fg.S) r8
            Fg.d0 r8 = Fg.F0.a(r8)
            java.util.List r8 = Jf.o.p(r8, r11)
            goto L_0x01c2
        L_0x01c1:
            r8 = r1
        L_0x01c2:
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x01a2
        L_0x01c7:
            Jf.n$a r11 = new Jf.n$a
            r11.<init>(r0, r4, r13)
        L_0x01cc:
            r10.f63825d = r11
            java.util.List r12 = mf.C6565s.c()
            Jf.h r13 = r10.f63823b
            boolean r0 = r13 instanceof Jf.i.h.d
            if (r0 == 0) goto L_0x01e0
            Jf.i$h$d r13 = (Jf.i.h.d) r13
            java.lang.Object[] r13 = r13.f()
            int r13 = r13.length
            goto L_0x01e7
        L_0x01e0:
            boolean r13 = r13 instanceof Jf.i.h.c
            if (r13 == 0) goto L_0x01e6
            r13 = r3
            goto L_0x01e7
        L_0x01e6:
            r13 = r2
        L_0x01e7:
            if (r13 <= 0) goto L_0x01f0
            Ef.i r0 = Ef.m.u(r2, r13)
            r12.add(r0)
        L_0x01f0:
            java.util.List[] r11 = r11.c()
            int r0 = r11.length
            r1 = r2
        L_0x01f6:
            if (r1 >= r0) goto L_0x020e
            r4 = r11[r1]
            if (r4 == 0) goto L_0x0201
            int r4 = r4.size()
            goto L_0x0202
        L_0x0201:
            r4 = r3
        L_0x0202:
            int r4 = r4 + r13
            Ef.i r13 = Ef.m.u(r13, r4)
            r12.add(r13)
            int r1 = r1 + 1
            r13 = r4
            goto L_0x01f6
        L_0x020e:
            java.util.List r11 = mf.C6565s.a(r12)
            java.util.Collection r11 = (java.util.Collection) r11
            Ef.i[] r12 = new Ef.i[r2]
            java.lang.Object[] r11 = r11.toArray(r12)
            Ef.i[] r11 = (Ef.i[]) r11
            r10.f63826e = r11
            Jf.n$a r11 = r10.f63825d
            Ef.i r11 = r11.a()
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L_0x0232
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0232
            goto L_0x0255
        L_0x0232:
            java.util.Iterator r11 = r11.iterator()
        L_0x0236:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0255
            r12 = r11
            mf.L r12 = (mf.L) r12
            int r12 = r12.a()
            Jf.n$a r13 = r10.f63825d
            java.util.List[] r13 = r13.c()
            r12 = r13[r12]
            if (r12 != 0) goto L_0x024e
            goto L_0x0236
        L_0x024e:
            int r12 = r12.size()
            if (r12 <= r3) goto L_0x0236
            r2 = r3
        L_0x0255:
            r10.f63827f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.n.<init>(Of.b, Jf.h, boolean):void");
    }

    /* access modifiers changed from: private */
    public static final boolean c(C5487e eVar) {
        C6496s.h(eVar, "$this$makeKotlinParameterTypes");
        return C6693k.g(eVar);
    }

    private static final int d(S s10) {
        List n10 = o.n(F0.a(s10));
        if (n10 != null) {
            return n10.size();
        }
        return 1;
    }

    public List a() {
        return this.f63823b.a();
    }

    public Object call(Object[] objArr) {
        Object invoke;
        Object obj;
        Method method;
        Object obj2;
        C6496s.h(objArr, "args");
        i a10 = this.f63825d.a();
        List[] c10 = this.f63825d.c();
        Method b10 = this.f63825d.b();
        if (!a10.isEmpty()) {
            if (this.f63827f) {
                List d10 = C6565s.d(objArr.length);
                int k10 = a10.k();
                for (int i10 = 0; i10 < k10; i10++) {
                    d10.add(objArr[i10]);
                }
                int k11 = a10.k();
                int n10 = a10.n();
                if (k11 <= n10) {
                    while (true) {
                        List<Method> list = c10[k11];
                        Object obj3 = objArr[k11];
                        if (list != null) {
                            for (Method method2 : list) {
                                Collection collection = d10;
                                if (obj3 != null) {
                                    obj2 = method2.invoke(obj3, (Object[]) null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    C6496s.g(returnType, "getReturnType(...)");
                                    obj2 = j1.g(returnType);
                                }
                                collection.add(obj2);
                            }
                            Collection collection2 = d10;
                        } else {
                            d10.add(obj3);
                        }
                        if (k11 == n10) {
                            break;
                        }
                        k11++;
                    }
                }
                int n11 = a10.n() + 1;
                int j02 = C6559l.j0(objArr);
                if (n11 <= j02) {
                    while (true) {
                        d10.add(objArr[n11]);
                        if (n11 == j02) {
                            break;
                        }
                        n11++;
                    }
                }
                objArr = C6565s.a(d10).toArray(new Object[0]);
            } else {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int k12 = a10.k();
                    if (i11 > a10.n() || k12 > i11) {
                        obj = objArr[i11];
                    } else {
                        List list2 = c10[i11];
                        if (list2 != null) {
                            method = (Method) C6565s.P0(list2);
                        } else {
                            method = null;
                        }
                        obj = objArr[i11];
                        if (method != null) {
                            if (obj != null) {
                                obj = method.invoke(obj, (Object[]) null);
                            } else {
                                Class<?> returnType2 = method.getReturnType();
                                C6496s.g(returnType2, "getReturnType(...)");
                                obj = j1.g(returnType2);
                            }
                        }
                    }
                    objArr2[i11] = obj;
                }
                objArr = objArr2;
            }
        }
        Object call = this.f63823b.call(objArr);
        if (call == C6680b.f() || b10 == null || (invoke = b10.invoke((Object) null, new Object[]{call})) == null) {
            return call;
        }
        return invoke;
    }

    public final i e(int i10) {
        i iVar;
        if (i10 >= 0) {
            i[] iVarArr = this.f63826e;
            if (i10 < iVarArr.length) {
                return iVarArr[i10];
            }
        }
        i[] iVarArr2 = this.f63826e;
        if (iVarArr2.length == 0) {
            iVar = new i(i10, i10);
        } else {
            int length = (i10 - iVarArr2.length) + ((i) C6559l.O0(iVarArr2)).n() + 1;
            iVar = new i(length, length);
        }
        return iVar;
    }

    public Member getMember() {
        return this.f63824c;
    }

    public Type getReturnType() {
        return this.f63823b.getReturnType();
    }
}
