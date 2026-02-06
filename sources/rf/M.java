package Rf;

import Fg.C5366d0;
import Fg.S;
import Of.C5497o;
import Of.b0;
import Of.h0;
import Of.t0;
import Pf.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import vg.C6755e;

public class M extends J implements b0 {

    /* renamed from: m  reason: collision with root package name */
    private t0 f64798m;

    /* renamed from: n  reason: collision with root package name */
    private final b0 f64799n;

    /* JADX WARNING: type inference failed for: r20v0, types: [Of.b0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public M(Of.Z r12, Pf.h r13, Of.E r14, Of.C5502u r15, boolean r16, boolean r17, boolean r18, Of.C5484b.a r19, Of.b0 r20, Of.h0 r21) {
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
            java.lang.String r1 = "<set-"
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
            r1.f64799n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rf.M.<init>(Of.Z, Pf.h, Of.E, Of.u, boolean, boolean, boolean, Of.b$a, Of.b0, Of.h0):void");
    }

    public static V O0(b0 b0Var, S s10, h hVar) {
        if (b0Var == null) {
            i0(7);
        }
        if (s10 == null) {
            i0(8);
        }
        if (hVar == null) {
            i0(9);
        }
        return new V(b0Var, (t0) null, 0, hVar, ng.h.f72317o, s10, false, false, false, (S) null, h0.f64497a);
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                th2 = new IllegalStateException(format);
                break;
            default:
                th2 = new IllegalArgumentException(format);
                break;
        }
        throw th2;
    }

    /* renamed from: P0 */
    public b0 a() {
        b0 b0Var = this.f64799n;
        if (b0Var == null) {
            i0(13);
        }
        return b0Var;
    }

    public void Q0(t0 t0Var) {
        if (t0Var == null) {
            i0(6);
        }
        this.f64798m = t0Var;
    }

    public Object U(C5497o oVar, Object obj) {
        return oVar.j(this, obj);
    }

    public Collection e() {
        Collection K02 = super.K0(false);
        if (K02 == null) {
            i0(10);
        }
        return K02;
    }

    public S getReturnType() {
        C5366d0 Z10 = C6755e.m(this).Z();
        if (Z10 == null) {
            i0(12);
        }
        return Z10;
    }

    public List k() {
        t0 t0Var = this.f64798m;
        if (t0Var != null) {
            List singletonList = Collections.singletonList(t0Var);
            if (singletonList == null) {
                i0(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }
}
