package Rf;

import Fg.C;
import Fg.E0;
import Fg.G0;
import Fg.N0;
import Fg.S;
import Of.C5483a;
import Of.C5484b;
import Of.C5495m;
import Of.C5497o;
import Of.C5501t;
import Of.C5502u;
import Of.C5504w;
import Of.C5507z;
import Of.E;
import Of.Y;
import Of.Z;
import Of.a0;
import Of.b0;
import Of.c0;
import Of.h0;
import Of.t0;
import Pf.h;
import Pg.l;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ng.f;
import vg.C6755e;
import yf.C6787a;
import zg.C6836c;
import zg.C6837d;
import zg.C6839f;

public class K extends Y implements Z {

    /* renamed from: A  reason: collision with root package name */
    private C5504w f64763A;

    /* renamed from: B  reason: collision with root package name */
    private C5504w f64764B;

    /* renamed from: i  reason: collision with root package name */
    private final E f64765i;

    /* renamed from: j  reason: collision with root package name */
    private C5502u f64766j;

    /* renamed from: k  reason: collision with root package name */
    private Collection f64767k;

    /* renamed from: l  reason: collision with root package name */
    private final Z f64768l;

    /* renamed from: m  reason: collision with root package name */
    private final C5484b.a f64769m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f64770n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f64771o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f64772p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f64773q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f64774r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f64775s;

    /* renamed from: t  reason: collision with root package name */
    private List f64776t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public c0 f64777u;

    /* renamed from: v  reason: collision with root package name */
    private c0 f64778v;

    /* renamed from: w  reason: collision with root package name */
    private List f64779w;

    /* renamed from: x  reason: collision with root package name */
    private L f64780x;

    /* renamed from: y  reason: collision with root package name */
    private b0 f64781y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f64782z;

    public class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C5495m f64783a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public E f64784b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public C5502u f64785c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Z f64786d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f64787e = false;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C5484b.a f64788f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public E0 f64789g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f64790h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public c0 f64791i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public List f64792j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public f f64793k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public S f64794l;

        public a() {
            this.f64783a = K.this.b();
            this.f64784b = K.this.r();
            this.f64785c = K.this.getVisibility();
            this.f64788f = K.this.h();
            this.f64789g = E0.f62924b;
            this.f64790h = true;
            this.f64791i = K.this.f64777u;
            this.f64792j = null;
            this.f64793k = K.this.getName();
            this.f64794l = K.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str;
            int i11;
            Throwable th2;
            int i12 = i10;
            if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 7 || i12 == 9 || i12 == 11 || i12 == 19 || i12 == 13 || i12 == 14 || i12 == 16 || i12 == 17) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 7 || i12 == 9 || i12 == 11 || i12 == 19 || i12 == 13 || i12 == 14 || i12 == 16 || i12 == 17) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            Object[] objArr = new Object[i11];
            switch (i12) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_URL:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i12 == 1) {
                objArr[1] = "setOwner";
            } else if (i12 == 2) {
                objArr[1] = "setOriginal";
            } else if (i12 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i12 == 5) {
                objArr[1] = "setReturnType";
            } else if (i12 == 7) {
                objArr[1] = "setModality";
            } else if (i12 == 9) {
                objArr[1] = "setVisibility";
            } else if (i12 == 11) {
                objArr[1] = "setKind";
            } else if (i12 == 19) {
                objArr[1] = "setName";
            } else if (i12 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i12 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i12 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i12 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i12) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case StdKeyDeserializer.TYPE_URL:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case StdKeyDeserializer.TYPE_CLASS:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 7 || i12 == 9 || i12 == 11 || i12 == 19 || i12 == 13 || i12 == 14 || i12 == 16 || i12 == 17) {
                th2 = new IllegalStateException(format);
            } else {
                th2 = new IllegalArgumentException(format);
            }
            throw th2;
        }

        public Z n() {
            return K.this.Q0(this);
        }

        /* access modifiers changed from: package-private */
        public a0 o() {
            Z z10 = this.f64786d;
            if (z10 == null) {
                return null;
            }
            return z10.d();
        }

        /* access modifiers changed from: package-private */
        public b0 p() {
            Z z10 = this.f64786d;
            if (z10 == null) {
                return null;
            }
            return z10.g();
        }

        public a q(boolean z10) {
            this.f64790h = z10;
            return this;
        }

        public a r(C5484b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f64788f = aVar;
            return this;
        }

        public a s(E e10) {
            if (e10 == null) {
                a(6);
            }
            this.f64784b = e10;
            return this;
        }

        public a t(C5484b bVar) {
            this.f64786d = (Z) bVar;
            return this;
        }

        public a u(C5495m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f64783a = mVar;
            return this;
        }

        public a v(E0 e02) {
            if (e02 == null) {
                a(15);
            }
            this.f64789g = e02;
            return this;
        }

        public a w(C5502u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f64785c = uVar;
            return this;
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [Of.Z] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected K(Of.C5495m r12, Of.Z r13, Pf.h r14, Of.E r15, Of.C5502u r16, boolean r17, ng.f r18, Of.C5484b.a r19, Of.h0 r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r11 = this;
            r7 = r11
            r8 = r15
            r9 = r16
            r10 = r19
            if (r12 != 0) goto L_0x000c
            r0 = 0
            i0(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 1
            i0(r0)
        L_0x0012:
            if (r8 != 0) goto L_0x0018
            r0 = 2
            i0(r0)
        L_0x0018:
            if (r9 != 0) goto L_0x001e
            r0 = 3
            i0(r0)
        L_0x001e:
            if (r18 != 0) goto L_0x0024
            r0 = 4
            i0(r0)
        L_0x0024:
            if (r10 != 0) goto L_0x002a
            r0 = 5
            i0(r0)
        L_0x002a:
            if (r20 != 0) goto L_0x0030
            r0 = 6
            i0(r0)
        L_0x0030:
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r18
            r5 = r17
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r7.f64767k = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r7.f64776t = r0
            r7.f64765i = r8
            r7.f64766j = r9
            if (r13 != 0) goto L_0x004e
            r0 = r7
            goto L_0x004f
        L_0x004e:
            r0 = r13
        L_0x004f:
            r7.f64768l = r0
            r7.f64769m = r10
            r0 = r21
            r7.f64770n = r0
            r0 = r22
            r7.f64771o = r0
            r0 = r23
            r7.f64772p = r0
            r0 = r24
            r7.f64773q = r0
            r0 = r25
            r7.f64774r = r0
            r0 = r26
            r7.f64775s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rf.K.<init>(Of.m, Of.Z, Pf.h, Of.E, Of.u, boolean, ng.f, Of.b$a, Of.h0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static K O0(C5495m mVar, h hVar, E e10, C5502u uVar, boolean z10, f fVar, C5484b.a aVar, h0 h0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (mVar == null) {
            i0(7);
        }
        if (hVar == null) {
            i0(8);
        }
        if (e10 == null) {
            i0(9);
        }
        if (uVar == null) {
            i0(10);
        }
        if (fVar == null) {
            i0(11);
        }
        if (aVar == null) {
            i0(12);
        }
        if (h0Var == null) {
            i0(13);
        }
        return new K(mVar, (Z) null, hVar, e10, uVar, z10, fVar, aVar, h0Var, z11, z12, z13, z14, z15, z16);
    }

    private h0 S0(boolean z10, Z z11) {
        h0 h0Var;
        if (z10) {
            if (z11 == null) {
                z11 = a();
            }
            h0Var = z11.i();
        } else {
            h0Var = h0.f64497a;
        }
        if (h0Var == null) {
            i0(28);
        }
        return h0Var;
    }

    private static C5507z T0(G0 g02, Y y10) {
        if (g02 == null) {
            i0(30);
        }
        if (y10 == null) {
            i0(31);
        }
        if (y10.t0() != null) {
            return y10.t0().c(g02);
        }
        return null;
    }

    private static C5502u Y0(C5502u uVar, C5484b.a aVar) {
        if (aVar != C5484b.a.FAKE_OVERRIDE || !C5501t.g(uVar.f())) {
            return uVar;
        }
        return C5501t.f64512h;
    }

    private static c0 d1(G0 g02, Z z10, c0 c0Var) {
        S p10 = g02.p(c0Var.getType(), N0.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new N(z10, new C6836c(z10, p10, ((C6839f) c0Var.getValue()).a(), c0Var.getValue()), c0Var.getAnnotations());
    }

    private static c0 e1(G0 g02, Z z10, c0 c0Var) {
        S p10 = g02.p(c0Var.getType(), N0.IN_VARIANCE);
        if (p10 == null) {
            return null;
        }
        return new N(z10, new C6837d(z10, p10, c0Var.getValue()), c0Var.getAnnotations());
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 28 || i10 == 38 || i10 == 39 || i10 == 41 || i10 == 42)) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 28 || i10 == 38 || i10 == 39 || i10 == 41 || i10 == 42)) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "inType";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case c.f37660h:
                objArr[0] = "newOwner";
                break;
            case CharsToNameCanonicalizer.HASH_MULT:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "setInType";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 28 || i10 == 38 || i10 == 39 || i10 == 41 || i10 == 42)) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    public Object B(C5483a.C0945a aVar) {
        return null;
    }

    public boolean C() {
        return this.f64775s;
    }

    public void E0(Collection collection) {
        if (collection == null) {
            i0(40);
        }
        this.f64767k = collection;
    }

    public c0 M() {
        return this.f64777u;
    }

    /* renamed from: N0 */
    public Z p0(C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, boolean z10) {
        Z n10 = X0().u(mVar).t((C5484b) null).s(e10).w(uVar).r(aVar).q(z10).n();
        if (n10 == null) {
            i0(42);
        }
        return n10;
    }

    public c0 P() {
        return this.f64778v;
    }

    /* access modifiers changed from: protected */
    public K P0(C5495m mVar, E e10, C5502u uVar, Z z10, C5484b.a aVar, f fVar, h0 h0Var) {
        if (mVar == null) {
            i0(32);
        }
        if (e10 == null) {
            i0(33);
        }
        if (uVar == null) {
            i0(34);
        }
        if (aVar == null) {
            i0(35);
        }
        if (fVar == null) {
            i0(36);
        }
        if (h0Var == null) {
            i0(37);
        }
        return new K(mVar, z10, getAnnotations(), e10, uVar, O(), fVar, aVar, h0Var, y0(), c0(), k0(), Z(), isExternal(), C());
    }

    public C5504w Q() {
        return this.f64764B;
    }

    /* access modifiers changed from: protected */
    public Z Q0(a aVar) {
        List list;
        c0 c0Var;
        c0 c0Var2;
        L l10;
        M m10;
        r rVar;
        C6787a aVar2;
        S s10;
        if (aVar == null) {
            i0(29);
        }
        K P02 = P0(aVar.f64783a, aVar.f64784b, aVar.f64785c, aVar.f64786d, aVar.f64788f, aVar.f64793k, S0(aVar.f64787e, aVar.f64786d));
        if (aVar.f64792j == null) {
            list = getTypeParameters();
        } else {
            list = aVar.f64792j;
        }
        ArrayList arrayList = new ArrayList(list.size());
        G0 b10 = C.b(list, aVar.f64789g, P02, arrayList);
        S c10 = aVar.f64794l;
        S p10 = b10.p(c10, N0.OUT_VARIANCE);
        r rVar2 = null;
        if (p10 == null) {
            return null;
        }
        S p11 = b10.p(c10, N0.IN_VARIANCE);
        if (p11 != null) {
            P02.Z0(p11);
        }
        c0 d10 = aVar.f64791i;
        if (d10 != null) {
            c0 c11 = d10.c(b10);
            if (c11 == null) {
                return null;
            }
            c0Var = c11;
        } else {
            c0Var = null;
        }
        c0 c0Var3 = this.f64778v;
        if (c0Var3 != null) {
            c0Var2 = e1(b10, P02, c0Var3);
        } else {
            c0Var2 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (c0 d12 : this.f64776t) {
            c0 d13 = d1(b10, P02, d12);
            if (d13 != null) {
                arrayList2.add(d13);
            }
        }
        P02.b1(p10, arrayList, c0Var, c0Var2, arrayList2);
        if (this.f64780x == null) {
            l10 = null;
        } else {
            l10 = new L(P02, this.f64780x.getAnnotations(), aVar.f64784b, Y0(this.f64780x.getVisibility(), aVar.f64788f), this.f64780x.G(), this.f64780x.isExternal(), this.f64780x.isInline(), aVar.f64788f, aVar.o(), h0.f64497a);
        }
        if (l10 != null) {
            S returnType = this.f64780x.getReturnType();
            l10.M0(T0(b10, this.f64780x));
            if (returnType != null) {
                s10 = b10.p(returnType, N0.OUT_VARIANCE);
            } else {
                s10 = null;
            }
            l10.P0(s10);
        }
        if (this.f64781y == null) {
            m10 = null;
        } else {
            m10 = new M(P02, this.f64781y.getAnnotations(), aVar.f64784b, Y0(this.f64781y.getVisibility(), aVar.f64788f), this.f64781y.G(), this.f64781y.isExternal(), this.f64781y.isInline(), aVar.f64788f, aVar.p(), h0.f64497a);
        }
        if (m10 != null) {
            List P03 = C5529s.P0(m10, this.f64781y.k(), b10, false, false, (boolean[]) null);
            if (P03 == null) {
                P02.a1(true);
                P03 = Collections.singletonList(M.O0(m10, C6755e.m(aVar.f64783a).H(), ((t0) this.f64781y.k().get(0)).getAnnotations()));
            }
            if (P03.size() == 1) {
                m10.M0(T0(b10, this.f64781y));
                m10.Q0((t0) P03.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        C5504w wVar = this.f64763A;
        if (wVar == null) {
            rVar = null;
        } else {
            rVar = new r(wVar.getAnnotations(), P02);
        }
        C5504w wVar2 = this.f64764B;
        if (wVar2 != null) {
            rVar2 = new r(wVar2.getAnnotations(), P02);
        }
        P02.V0(l10, m10, rVar, rVar2);
        if (aVar.f64790h) {
            l b11 = l.b();
            for (Z c12 : e()) {
                b11.add(c12.c(b10));
            }
            P02.E0(b11);
        }
        if (c0() && (aVar2 = this.f64827h) != null) {
            P02.K0(this.f64826g, aVar2);
        }
        return P02;
    }

    /* renamed from: R0 */
    public L d() {
        return this.f64780x;
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.l(this, obj);
    }

    public void U0(L l10, b0 b0Var) {
        V0(l10, b0Var, (C5504w) null, (C5504w) null);
    }

    public void V0(L l10, b0 b0Var, C5504w wVar, C5504w wVar2) {
        this.f64780x = l10;
        this.f64781y = b0Var;
        this.f64763A = wVar;
        this.f64764B = wVar2;
    }

    public boolean W0() {
        return this.f64782z;
    }

    public a X0() {
        return new a();
    }

    public boolean Z() {
        return this.f64773q;
    }

    public void Z0(S s10) {
        if (s10 == null) {
            i0(14);
        }
    }

    public void a1(boolean z10) {
        this.f64782z = z10;
    }

    public void b1(S s10, List list, c0 c0Var, c0 c0Var2, List list2) {
        if (s10 == null) {
            i0(17);
        }
        if (list == null) {
            i0(18);
        }
        if (list2 == null) {
            i0(19);
        }
        H0(s10);
        this.f64779w = new ArrayList(list);
        this.f64778v = c0Var2;
        this.f64777u = c0Var;
        this.f64776t = list2;
    }

    public boolean c0() {
        return this.f64771o;
    }

    public void c1(C5502u uVar) {
        if (uVar == null) {
            i0(20);
        }
        this.f64766j = uVar;
    }

    public Collection e() {
        Collection collection = this.f64767k;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            i0(41);
        }
        return collection;
    }

    public b0 g() {
        return this.f64781y;
    }

    public S getReturnType() {
        S type = getType();
        if (type == null) {
            i0(23);
        }
        return type;
    }

    public List getTypeParameters() {
        List list = this.f64779w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public C5502u getVisibility() {
        C5502u uVar = this.f64766j;
        if (uVar == null) {
            i0(25);
        }
        return uVar;
    }

    public C5484b.a h() {
        C5484b.a aVar = this.f64769m;
        if (aVar == null) {
            i0(39);
        }
        return aVar;
    }

    public boolean isExternal() {
        return this.f64774r;
    }

    public boolean k0() {
        return this.f64772p;
    }

    public E r() {
        E e10 = this.f64765i;
        if (e10 == null) {
            i0(24);
        }
        return e10;
    }

    public List w() {
        ArrayList arrayList = new ArrayList(2);
        L l10 = this.f64780x;
        if (l10 != null) {
            arrayList.add(l10);
        }
        b0 b0Var = this.f64781y;
        if (b0Var != null) {
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    public C5504w w0() {
        return this.f64763A;
    }

    public List x0() {
        List list = this.f64776t;
        if (list == null) {
            i0(22);
        }
        return list;
    }

    public boolean y0() {
        return this.f64770n;
    }

    public Z c(G0 g02) {
        if (g02 == null) {
            i0(27);
        }
        if (g02.k()) {
            return this;
        }
        return X0().v(g02.j()).t(a()).n();
    }

    public Z a() {
        Z z10 = this.f64768l;
        Z a10 = z10 == this ? this : z10.a();
        if (a10 == null) {
            i0(38);
        }
        return a10;
    }
}
