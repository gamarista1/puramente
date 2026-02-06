package androidx.compose.ui.focus;

import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import a0.C1538b;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p0.k;
import yf.C6798l;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13345b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final o f13346c = new o();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final o f13347d = new o();

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f13348a = new C1538b(new k[16], 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return o.f13347d;
        }

        public final o b() {
            return o.f13346c;
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13349a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(s.j(focusTargetNode));
        }
    }

    public final boolean c(C6798l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        C6798l lVar2 = lVar;
        a aVar = f13345b;
        if (this == aVar.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        } else if (this == aVar.a()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        } else if (this.f13348a.t()) {
            C1538b bVar = this.f13348a;
            int q10 = bVar.q();
            if (q10 <= 0) {
                return false;
            }
            Object[] p10 = bVar.p();
            int i10 = 0;
            boolean z13 = false;
            do {
                k kVar = (k) p10[i10];
                int a10 = C1239e0.a(1024);
                if (kVar.v0().S1()) {
                    C1538b bVar2 = new C1538b(new i.c[16], 0);
                    i.c J12 = kVar.v0().J1();
                    if (J12 == null) {
                        C1245k.c(bVar2, kVar.v0());
                    } else {
                        bVar2.b(J12);
                    }
                    while (true) {
                        if (!bVar2.t()) {
                            break;
                        }
                        i.c cVar = (i.c) bVar2.y(bVar2.q() - 1);
                        if ((cVar.I1() & a10) == 0) {
                            C1245k.c(bVar2, cVar);
                        } else {
                            while (true) {
                                if (cVar == null) {
                                    continue;
                                    break;
                                } else if ((cVar.N1() & a10) != 0) {
                                    C1538b bVar3 = null;
                                    while (cVar != null) {
                                        if (cVar instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                            if (focusTargetNode.q2().j()) {
                                                z12 = ((Boolean) lVar2.invoke(focusTargetNode)).booleanValue();
                                            } else {
                                                z12 = w.k(focusTargetNode, d.f13315b.b(), lVar2);
                                            }
                                            if (z12) {
                                                z13 = true;
                                                break;
                                            }
                                        } else {
                                            if ((cVar.N1() & a10) != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10 && (cVar instanceof C1247m)) {
                                                int i11 = 0;
                                                for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                                    if ((m22.N1() & a10) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        i11++;
                                                        if (i11 == 1) {
                                                            cVar = m22;
                                                        } else {
                                                            if (bVar3 == null) {
                                                                bVar3 = new C1538b(new i.c[16], 0);
                                                            }
                                                            if (cVar != null) {
                                                                bVar3.b(cVar);
                                                                cVar = null;
                                                            }
                                                            bVar3.b(m22);
                                                        }
                                                    }
                                                }
                                                if (i11 == 1) {
                                                }
                                            }
                                        }
                                        cVar = C1245k.g(bVar3);
                                    }
                                    continue;
                                } else {
                                    cVar = cVar.J1();
                                }
                            }
                        }
                    }
                    i10++;
                } else {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
            } while (i10 < q10);
            return z13;
        } else {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
    }

    public final boolean d() {
        return c(b.f13349a);
    }

    public final C1538b e() {
        return this.f13348a;
    }

    public final void f() {
        d();
    }
}
