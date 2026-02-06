package Jf;

import Jf.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.T;
import lf.C6514M;
import mf.C6559l;

public abstract class i implements h {

    /* renamed from: e  reason: collision with root package name */
    public static final d f63802e = new d((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Member f63803a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f63804b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f63805c;

    /* renamed from: d  reason: collision with root package name */
    private final List f63806d;

    public static final class a extends i implements g {

        /* renamed from: f  reason: collision with root package name */
        private final Object f63807f;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.reflect.Constructor r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C6496s.h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C6496s.g(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C6496s.g(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = mf.C6559l.s(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f63807f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C6496s.h(objArr, "args");
            b(objArr);
            T t10 = new T(3);
            t10.a(this.f63807f);
            t10.b(objArr);
            t10.a((Object) null);
            return ((Constructor) getMember()).newInstance(t10.d(new Object[t10.c()]));
        }
    }

    public static final class b extends i {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.reflect.Constructor r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C6496s.h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C6496s.g(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C6496s.g(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0025
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = mf.C6559l.s(r0, r2, r1)
            L_0x0025:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C6496s.h(objArr, "args");
            b(objArr);
            T t10 = new T(2);
            t10.b(objArr);
            t10.a((Object) null);
            return ((Constructor) getMember()).newInstance(t10.d(new Object[t10.c()]));
        }
    }

    public static final class c extends i implements g {

        /* renamed from: f  reason: collision with root package name */
        private final Object f63808f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.reflect.Constructor r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C6496s.h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C6496s.g(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C6496s.g(r5, r0)
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f63808f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C6496s.h(objArr, "args");
            b(objArr);
            T t10 = new T(2);
            t10.a(this.f63808f);
            t10.b(objArr);
            return ((Constructor) getMember()).newInstance(t10.d(new Object[t10.c()]));
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e extends i {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(java.lang.reflect.Constructor r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C6496s.h(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C6496s.g(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C6496s.g(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.e.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C6496s.h(objArr, "args");
            b(objArr);
            return ((Constructor) getMember()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static abstract class f extends i {

        public static final class a extends f implements g {

            /* renamed from: f  reason: collision with root package name */
            private final Object f63809f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
                this.f63809f = obj;
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                return ((Field) getMember()).get(this.f63809f);
            }
        }

        public static final class b extends f implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }
        }

        public static final class c extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }
        }

        public static final class d extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }

            public void b(Object[] objArr) {
                C6496s.h(objArr, "args");
                i.super.b(objArr);
                c(C6559l.c0(objArr));
            }
        }

        public static final class e extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        public Object call(Object[] objArr) {
            Object obj;
            C6496s.h(objArr, "args");
            b(objArr);
            Field field = (Field) getMember();
            if (d() != null) {
                obj = C6559l.b0(objArr);
            } else {
                obj = null;
            }
            return field.get(obj);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "getGenericType(...)"
                kotlin.jvm.internal.C6496s.g(r2, r0)
                if (r8 == 0) goto L_0x0011
                java.lang.Class r8 = r7.getDeclaringClass()
            L_0x000f:
                r3 = r8
                goto L_0x0013
            L_0x0011:
                r8 = 0
                goto L_0x000f
            L_0x0013:
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    public static abstract class g extends i {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f63810f;

        public static final class a extends g implements g {

            /* renamed from: g  reason: collision with root package name */
            private final Object f63811g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
                this.f63811g = obj;
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                ((Field) getMember()).set(this.f63811g, C6559l.b0(objArr));
                return C6514M.f71813a;
            }
        }

        public static final class b extends g implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                ((Field) getMember()).set((Object) null, C6559l.O0(objArr));
                return C6514M.f71813a;
            }
        }

        public static final class c extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }
        }

        public static final class d extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }

            public void b(Object[] objArr) {
                C6496s.h(objArr, "args");
                super.b(objArr);
                c(C6559l.c0(objArr));
            }
        }

        public static final class e extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, (DefaultConstructorMarker) null);
                C6496s.h(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        public void b(Object[] objArr) {
            C6496s.h(objArr, "args");
            i.super.b(objArr);
            if (this.f63810f && C6559l.O0(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object call(Object[] objArr) {
            Object obj;
            C6496s.h(objArr, "args");
            b(objArr);
            Field field = (Field) getMember();
            if (d() != null) {
                obj = C6559l.b0(objArr);
            } else {
                obj = null;
            }
            field.set(obj, C6559l.O0(objArr));
            return C6514M.f71813a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "TYPE"
                kotlin.jvm.internal.C6496s.g(r2, r0)
                if (r9 == 0) goto L_0x000f
                java.lang.Class r9 = r7.getDeclaringClass()
            L_0x000d:
                r3 = r9
                goto L_0x0011
            L_0x000f:
                r9 = 0
                goto L_0x000d
            L_0x0011:
                java.lang.reflect.Type r9 = r7.getGenericType()
                r0 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r0]
                r0 = 0
                r4[r0] = r9
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f63810f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    public static abstract class h extends i {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f63812f;

        public static final class a extends h implements g {

            /* renamed from: g  reason: collision with root package name */
            private final Object f63813g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C6496s.h(method, "method");
                this.f63813g = obj;
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                return e(this.f63813g, objArr);
            }
        }

        public static final class b extends h implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C6496s.h(method, "method");
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                return e((Object) null, objArr);
            }
        }

        public static final class c extends h implements g {

            /* renamed from: g  reason: collision with root package name */
            private final Object f63814g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C6496s.h(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.C6496s.g(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = mf.C6559l.s(r0, r3, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.f63814g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Jf.i.h.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                T t10 = new T(2);
                t10.a(this.f63814g);
                t10.b(objArr);
                return e((Object) null, t10.d(new Object[t10.c()]));
            }

            public final Object f() {
                return this.f63814g;
            }
        }

        public static final class d extends h implements g {

            /* renamed from: g  reason: collision with root package name */
            private final Object[] f63815g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d(java.lang.reflect.Method r4, java.lang.Object[] r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C6496s.h(r4, r0)
                    java.lang.String r0 = "boundReceiverComponents"
                    kotlin.jvm.internal.C6496s.h(r5, r0)
                    java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.C6496s.g(r0, r1)
                    int r1 = r5.length
                    java.util.List r0 = mf.C6559l.Y(r0, r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    r1 = 0
                    java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r2 = 0
                    r3.<init>(r4, r1, r0, r2)
                    r3.f63815g = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Jf.i.h.d.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                T t10 = new T(2);
                t10.b(this.f63815g);
                t10.b(objArr);
                return e((Object) null, t10.d(new Object[t10.c()]));
            }

            public final Object[] f() {
                return this.f63815g;
            }

            public final int g() {
                return this.f63815g.length;
            }
        }

        public static final class e extends h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                C6496s.h(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                C6496s.h(objArr, "args");
                b(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C6559l.s(objArr, 1, objArr.length);
                }
                return e(obj, objArr2);
            }
        }

        public static final class f extends h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C6496s.h(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                C6496s.h(objArr, "args");
                b(objArr);
                c(C6559l.c0(objArr));
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C6559l.s(objArr, 1, objArr.length);
                }
                return e((Object) null, objArr2);
            }
        }

        public static final class g extends h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                C6496s.h(method, "method");
            }

            public Object call(Object[] objArr) {
                C6496s.h(objArr, "args");
                b(objArr);
                return e((Object) null, objArr);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        /* access modifiers changed from: protected */
        public final Object e(Object obj, Object[] objArr) {
            C6496s.h(objArr, "args");
            Object invoke = ((Method) getMember()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (this.f63812f) {
                return C6514M.f71813a;
            }
            return invoke;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "getGenericReturnType(...)"
                kotlin.jvm.internal.C6496s.g(r2, r0)
                if (r8 == 0) goto L_0x0011
                java.lang.Class r8 = r7.getDeclaringClass()
            L_0x000f:
                r3 = r8
                goto L_0x0013
            L_0x0011:
                r8 = 0
                goto L_0x000f
            L_0x0013:
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r8)
                r6.f63812f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.i.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    public List a() {
        return this.f63806d;
    }

    public void b(Object[] objArr) {
        h.a.a(this, objArr);
    }

    /* access modifiers changed from: protected */
    public final void c(Object obj) {
        if (obj == null || !this.f63803a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class d() {
        return this.f63805c;
    }

    public final Member getMember() {
        return this.f63803a;
    }

    public final Type getReturnType() {
        return this.f63804b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f63803a = r1
            r0.f63804b = r2
            r0.f63805c = r3
            if (r3 == 0) goto L_0x0027
            kotlin.jvm.internal.T r1 = new kotlin.jvm.internal.T
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = mf.C6565s.q(r1)
            if (r1 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r1 = mf.C6559l.n1(r4)
        L_0x002b:
            r0.f63806d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
