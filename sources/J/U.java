package J;

import B.i;
import B.l;
import B.n;
import D0.J;
import D0.T;
import Ug.C5600w0;
import Ug.K;
import Y.A1;
import Y.B;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.L;
import Y.M;
import Y.P;
import Y.o1;
import Y.p1;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;
import z.C2938B;
import z.r;

public abstract class U {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f2937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f2938b;

        /* renamed from: J.U$a$a  reason: collision with other inner class name */
        static final class C0055a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1510r0 f2939a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f2940b;

            /* renamed from: J.U$a$a$a  reason: collision with other inner class name */
            public static final class C0056a implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C1510r0 f2941a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ l f2942b;

                public C0056a(C1510r0 r0Var, l lVar) {
                    this.f2941a = r0Var;
                    this.f2942b = lVar;
                }

                public void dispose() {
                    n.b bVar = (n.b) this.f2941a.getValue();
                    if (bVar != null) {
                        n.a aVar = new n.a(bVar);
                        l lVar = this.f2942b;
                        if (lVar != null) {
                            lVar.a(aVar);
                        }
                        this.f2941a.setValue((Object) null);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0055a(C1510r0 r0Var, l lVar) {
                super(1);
                this.f2939a = r0Var;
                this.f2940b = lVar;
            }

            /* renamed from: a */
            public final L invoke(M m10) {
                return new C0056a(this.f2939a, this.f2940b);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f2943a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f2944b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f2945c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C1510r0 f2946d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ l f2947e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ A1 f2948f;

            /* renamed from: J.U$a$b$a  reason: collision with other inner class name */
            static final class C0057a extends kotlin.coroutines.jvm.internal.l implements q {

                /* renamed from: a  reason: collision with root package name */
                int f2949a;

                /* renamed from: b  reason: collision with root package name */
                private /* synthetic */ Object f2950b;

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ long f2951c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ K f2952d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1510r0 f2953e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ l f2954f;

                /* renamed from: J.U$a$b$a$a  reason: collision with other inner class name */
                static final class C0058a extends kotlin.coroutines.jvm.internal.l implements p {

                    /* renamed from: a  reason: collision with root package name */
                    Object f2955a;

                    /* renamed from: b  reason: collision with root package name */
                    int f2956b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ C1510r0 f2957c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ long f2958d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ l f2959e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0058a(C1510r0 r0Var, long j10, l lVar, C6658d dVar) {
                        super(2, dVar);
                        this.f2957c = r0Var;
                        this.f2958d = j10;
                        this.f2959e = lVar;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new C0058a(this.f2957c, this.f2958d, this.f2959e, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((C0058a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = rf.C6680b.f()
                            int r1 = r7.f2956b
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L_0x0027
                            if (r1 == r4) goto L_0x001f
                            if (r1 != r3) goto L_0x0017
                            java.lang.Object r0 = r7.f2955a
                            B.n$b r0 = (B.n.b) r0
                            lf.w.b(r8)
                            goto L_0x0066
                        L_0x0017:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L_0x001f:
                            java.lang.Object r1 = r7.f2955a
                            Y.r0 r1 = (Y.C1510r0) r1
                            lf.w.b(r8)
                            goto L_0x004b
                        L_0x0027:
                            lf.w.b(r8)
                            Y.r0 r8 = r7.f2957c
                            java.lang.Object r8 = r8.getValue()
                            B.n$b r8 = (B.n.b) r8
                            if (r8 == 0) goto L_0x004f
                            B.l r1 = r7.f2959e
                            Y.r0 r5 = r7.f2957c
                            B.n$a r6 = new B.n$a
                            r6.<init>(r8)
                            if (r1 == 0) goto L_0x004c
                            r7.f2955a = r5
                            r7.f2956b = r4
                            java.lang.Object r8 = r1.b(r6, r7)
                            if (r8 != r0) goto L_0x004a
                            return r0
                        L_0x004a:
                            r1 = r5
                        L_0x004b:
                            r5 = r1
                        L_0x004c:
                            r5.setValue(r2)
                        L_0x004f:
                            B.n$b r8 = new B.n$b
                            long r4 = r7.f2958d
                            r8.<init>(r4, r2)
                            B.l r1 = r7.f2959e
                            if (r1 == 0) goto L_0x0067
                            r7.f2955a = r8
                            r7.f2956b = r3
                            java.lang.Object r1 = r1.b(r8, r7)
                            if (r1 != r0) goto L_0x0065
                            return r0
                        L_0x0065:
                            r0 = r8
                        L_0x0066:
                            r8 = r0
                        L_0x0067:
                            Y.r0 r0 = r7.f2957c
                            r0.setValue(r8)
                            lf.M r8 = lf.C6514M.f71813a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: J.U.a.b.C0057a.C0058a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* renamed from: J.U$a$b$a$b  reason: collision with other inner class name */
                static final class C0059b extends kotlin.coroutines.jvm.internal.l implements p {

                    /* renamed from: a  reason: collision with root package name */
                    Object f2960a;

                    /* renamed from: b  reason: collision with root package name */
                    int f2961b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ C1510r0 f2962c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ boolean f2963d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ l f2964e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0059b(C1510r0 r0Var, boolean z10, l lVar, C6658d dVar) {
                        super(2, dVar);
                        this.f2962c = r0Var;
                        this.f2963d = z10;
                        this.f2964e = lVar;
                    }

                    public final C6658d create(Object obj, C6658d dVar) {
                        return new C0059b(this.f2962c, this.f2963d, this.f2964e, dVar);
                    }

                    public final Object invoke(K k10, C6658d dVar) {
                        return ((C0059b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C1510r0 r0Var;
                        C1510r0 r0Var2;
                        i iVar;
                        Object f10 = C6680b.f();
                        int i10 = this.f2961b;
                        if (i10 == 0) {
                            w.b(obj);
                            n.b bVar = (n.b) this.f2962c.getValue();
                            if (bVar != null) {
                                boolean z10 = this.f2963d;
                                l lVar = this.f2964e;
                                r0Var = this.f2962c;
                                if (z10) {
                                    iVar = new n.c(bVar);
                                } else {
                                    iVar = new n.a(bVar);
                                }
                                if (lVar != null) {
                                    this.f2960a = r0Var;
                                    this.f2961b = 1;
                                    if (lVar.b(iVar, this) == f10) {
                                        return f10;
                                    }
                                    r0Var2 = r0Var;
                                }
                                r0Var.setValue((Object) null);
                            }
                            return C6514M.f71813a;
                        } else if (i10 == 1) {
                            r0Var2 = (C1510r0) this.f2960a;
                            w.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r0Var = r0Var2;
                        r0Var.setValue((Object) null);
                        return C6514M.f71813a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0057a(K k10, C1510r0 r0Var, l lVar, C6658d dVar) {
                    super(3, dVar);
                    this.f2952d = k10;
                    this.f2953e = r0Var;
                    this.f2954f = lVar;
                }

                public final Object i(r rVar, long j10, C6658d dVar) {
                    C0057a aVar = new C0057a(this.f2952d, this.f2953e, this.f2954f, dVar);
                    aVar.f2950b = rVar;
                    aVar.f2951c = j10;
                    return aVar.invokeSuspend(C6514M.f71813a);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return i((r) obj, ((C2421g) obj2).v(), (C6658d) obj3);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f2949a;
                    if (i10 == 0) {
                        w.b(obj);
                        long j10 = this.f2951c;
                        C5600w0 unused = C5576k.d(this.f2952d, (g) null, (Ug.M) null, new C0058a(this.f2953e, j10, this.f2954f, (C6658d) null), 3, (Object) null);
                        this.f2949a = 1;
                        obj = ((r) this.f2950b).j1(this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        w.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5600w0 unused2 = C5576k.d(this.f2952d, (g) null, (Ug.M) null, new C0059b(this.f2953e, ((Boolean) obj).booleanValue(), this.f2954f, (C6658d) null), 3, (Object) null);
                    return C6514M.f71813a;
                }
            }

            /* renamed from: J.U$a$b$b  reason: collision with other inner class name */
            static final class C0060b extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ A1 f2965a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0060b(A1 a12) {
                    super(1);
                    this.f2965a = a12;
                }

                public final void a(long j10) {
                    ((C6798l) this.f2965a.getValue()).invoke(C2421g.d(j10));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C2421g) obj).v());
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(K k10, C1510r0 r0Var, l lVar, A1 a12, C6658d dVar) {
                super(2, dVar);
                this.f2945c = k10;
                this.f2946d = r0Var;
                this.f2947e = lVar;
                this.f2948f = a12;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                b bVar = new b(this.f2945c, this.f2946d, this.f2947e, this.f2948f, dVar);
                bVar.f2944b = obj;
                return bVar;
            }

            public final Object invoke(J j10, C6658d dVar) {
                return ((b) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f2943a;
                if (i10 == 0) {
                    w.b(obj);
                    C0057a aVar = new C0057a(this.f2945c, this.f2946d, this.f2947e, (C6658d) null);
                    C0060b bVar = new C0060b(this.f2948f);
                    this.f2943a = 1;
                    if (C2938B.h((J) this.f2944b, aVar, bVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6798l lVar, l lVar2) {
            super(3);
            this.f2937a = lVar;
            this.f2938b = lVar2;
        }

        public final k0.i a(k0.i iVar, C1500m mVar, int i10) {
            mVar.T(-102778667);
            if (C1506p.H()) {
                C1506p.Q(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object A10 = mVar.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                B b10 = new B(P.j(h.f72645a, mVar));
                mVar.r(b10);
                A10 = b10;
            }
            K a10 = ((B) A10).a();
            Object A11 = mVar.A();
            if (A11 == aVar.a()) {
                A11 = u1.d((Object) null, (o1) null, 2, (Object) null);
                mVar.r(A11);
            }
            C1510r0 r0Var = (C1510r0) A11;
            A1 o10 = p1.o(this.f2937a, mVar, 0);
            l lVar = this.f2938b;
            boolean S10 = mVar.S(this.f2938b);
            l lVar2 = this.f2938b;
            Object A12 = mVar.A();
            if (S10 || A12 == aVar.a()) {
                A12 = new C0055a(r0Var, lVar2);
                mVar.r(A12);
            }
            P.c(lVar, (C6798l) A12, mVar, 0);
            i.a aVar2 = k0.i.f23074a;
            l lVar3 = this.f2938b;
            boolean C10 = mVar.C(a10) | mVar.S(this.f2938b) | mVar.S(o10);
            l lVar4 = this.f2938b;
            Object A13 = mVar.A();
            if (C10 || A13 == aVar.a()) {
                b bVar = new b(a10, r0Var, lVar4, o10, (C6658d) null);
                mVar.r(bVar);
                A13 = bVar;
            }
            k0.i d10 = T.d(aVar2, lVar3, (p) A13);
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return d10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((k0.i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final k0.i a(k0.i iVar, l lVar, boolean z10, C6798l lVar2) {
        if (z10) {
            return k0.h.c(iVar, (C6798l) null, new a(lVar2, lVar), 1, (Object) null);
        }
        return iVar;
    }
}
