package Rf;

import Fg.S;
import Of.C5497o;
import Of.a0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class L extends J implements a0 {

    /* renamed from: m  reason: collision with root package name */
    private S f64796m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f64797n;

    /* JADX WARNING: type inference failed for: r20v0, types: [Of.a0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public L(Of.Z r12, Pf.h r13, Of.E r14, Of.C5502u r15, boolean r16, boolean r17, boolean r18, Of.C5484b.a r19, Of.a0 r20, Of.h0 r21) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0006
            r0 = 0
            i0(r0)
        L_0x0006:
            if (r13 != 0) goto L_0x000c
            r0 = 1
            i0(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 2
            i0(r0)
        L_0x0012:
            if (r15 != 0) goto L_0x0018
            r0 = 3
            i0(r0)
        L_0x0018:
            if (r19 != 0) goto L_0x001e
            r0 = 4
            i0(r0)
        L_0x001e:
            if (r21 != 0) goto L_0x0024
            r0 = 5
            i0(r0)
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            ng.f r1 = r12.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ng.f r5 = ng.f.m(r0)
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r12
            r4 = r13
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r20 == 0) goto L_0x005a
            r1 = r11
            r0 = r20
            goto L_0x005c
        L_0x005a:
            r0 = r11
            r1 = r0
        L_0x005c:
            r1.f64797n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rf.L.<init>(Of.Z, Pf.h, Of.E, Of.u, boolean, boolean, boolean, Of.b$a, Of.a0, Of.h0):void");
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i10 == 6 || i10 == 7 || i10 == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    /* renamed from: O0 */
    public a0 a() {
        a0 a0Var = this.f64797n;
        if (a0Var == null) {
            i0(8);
        }
        return a0Var;
    }

    public void P0(S s10) {
        if (s10 == null) {
            s10 = X().getType();
        }
        this.f64796m = s10;
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.g(this, obj);
    }

    public Collection e() {
        Collection K02 = super.K0(true);
        if (K02 == null) {
            i0(6);
        }
        return K02;
    }

    public S getReturnType() {
        return this.f64796m;
    }

    public List k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            i0(7);
        }
        return emptyList;
    }
}
