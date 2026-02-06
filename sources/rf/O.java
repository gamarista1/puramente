package Rf;

import Fg.S;
import Of.C5484b;
import Of.C5495m;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.c0;
import Of.g0;
import Of.h0;
import Pf.h;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ng.f;

public class O extends C5529s implements g0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected O(C5495m mVar, g0 g0Var, h hVar, f fVar, C5484b.a aVar, h0 h0Var) {
        super(mVar, g0Var, hVar, fVar, aVar, h0Var);
        if (mVar == null) {
            i0(0);
        }
        if (hVar == null) {
            i0(1);
        }
        if (fVar == null) {
            i0(2);
        }
        if (aVar == null) {
            i0(3);
        }
        if (h0Var == null) {
            i0(4);
        }
    }

    private static /* synthetic */ void i0(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 10:
            case StdKeyDeserializer.TYPE_CLASS:
            case InboxPagingSource.PAGE_SIZE /*20*/:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case StdKeyDeserializer.TYPE_URL:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
            case 17:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) {
            th2 = new IllegalStateException(format);
        } else {
            th2 = new IllegalArgumentException(format);
        }
        throw th2;
    }

    public static O l1(C5495m mVar, h hVar, f fVar, C5484b.a aVar, h0 h0Var) {
        if (mVar == null) {
            i0(5);
        }
        if (hVar == null) {
            i0(6);
        }
        if (fVar == null) {
            i0(7);
        }
        if (aVar == null) {
            i0(8);
        }
        if (h0Var == null) {
            i0(9);
        }
        return new O(mVar, (g0) null, hVar, fVar, aVar, h0Var);
    }

    /* access modifiers changed from: protected */
    public C5529s L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var) {
        if (mVar == null) {
            i0(25);
        }
        if (aVar == null) {
            i0(26);
        }
        if (hVar == null) {
            i0(27);
        }
        if (h0Var == null) {
            i0(28);
        }
        g0 g0Var = (g0) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new O(mVar, g0Var, hVar, fVar, aVar, h0Var);
    }

    /* renamed from: k1 */
    public g0 p0(C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, boolean z10) {
        g0 g0Var = (g0) super.K0(mVar, e10, uVar, aVar, z10);
        if (g0Var == null) {
            i0(29);
        }
        return g0Var;
    }

    /* renamed from: m1 */
    public g0 a() {
        g0 g0Var = (g0) super.a();
        if (g0Var == null) {
            i0(24);
        }
        return g0Var;
    }

    /* renamed from: n1 */
    public O R0(c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, C5502u uVar) {
        if (list == null) {
            i0(14);
        }
        if (list2 == null) {
            i0(15);
        }
        if (list3 == null) {
            i0(16);
        }
        if (uVar == null) {
            i0(17);
        }
        O o12 = o1(c0Var, c0Var2, list, list2, list3, s10, e10, uVar, (Map) null);
        if (o12 == null) {
            i0(18);
        }
        return o12;
    }

    public O o1(c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, C5502u uVar, Map map) {
        if (list == null) {
            i0(19);
        }
        if (list2 == null) {
            i0(20);
        }
        if (list3 == null) {
            i0(21);
        }
        if (uVar == null) {
            i0(22);
        }
        super.R0(c0Var, c0Var2, list, list2, list3, s10, e10, uVar);
        if (map != null && !map.isEmpty()) {
            this.f64895D = new LinkedHashMap(map);
        }
        return this;
    }

    public C5507z.a v() {
        C5507z.a v10 = super.v();
        if (v10 == null) {
            i0(30);
        }
        return v10;
    }
}
