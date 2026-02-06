package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import gh.C5992p;
import hh.C5998a;
import ih.f;
import java.util.List;
import jh.c;
import jh.d;
import jh.e;
import kh.C6458j0;
import kh.D;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/IconComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/IconComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconComponent$$serializer implements D {
    public static final IconComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        IconComponent$$serializer iconComponent$$serializer = new IconComponent$$serializer();
        INSTANCE = iconComponent$$serializer;
        C6458j0 j0Var = new C6458j0("icon", iconComponent$$serializer, 9);
        j0Var.l("base_url", false);
        j0Var.l("icon_name", false);
        j0Var.l("formats", false);
        j0Var.l("size", true);
        j0Var.l("color", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("icon_background", true);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private IconComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = IconComponent.$childSerializers;
        C5978b u10 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b u11 = C5998a.u(IconComponent$IconBackground$$serializer.INSTANCE);
        C5978b bVar = access$get$childSerializers$cp[8];
        x0 x0Var = x0.f71726a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{x0Var, x0Var, IconComponent$Formats$$serializer.INSTANCE, Size$$serializer.INSTANCE, u10, padding$$serializer, padding$$serializer, u11, bVar};
    }

    public IconComponent deserialize(e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        String str2;
        int i10;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        e eVar2 = eVar;
        C6496s.h(eVar2, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar2.b(descriptor2);
        C5978b[] access$get$childSerializers$cp = IconComponent.$childSerializers;
        int i11 = 7;
        String str3 = null;
        if (b10.p()) {
            String A10 = b10.A(descriptor2, 0);
            String A11 = b10.A(descriptor2, 1);
            Object C10 = b10.C(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, (Object) null);
            Object C11 = b10.C(descriptor2, 3, Size$$serializer.INSTANCE, (Object) null);
            Object i12 = b10.i(descriptor2, 4, ColorScheme$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Object C12 = b10.C(descriptor2, 5, padding$$serializer, (Object) null);
            Object C13 = b10.C(descriptor2, 6, padding$$serializer, (Object) null);
            Object i13 = b10.i(descriptor2, 7, IconComponent$IconBackground$$serializer.INSTANCE, (Object) null);
            obj7 = b10.C(descriptor2, 8, access$get$childSerializers$cp[8], (Object) null);
            obj2 = C11;
            obj = C10;
            obj6 = C13;
            obj4 = C12;
            str = A11;
            str2 = A10;
            obj3 = i12;
            obj5 = i13;
            i10 = 511;
        } else {
            boolean z10 = true;
            int i14 = 0;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            obj3 = null;
            Object obj24 = null;
            String str4 = null;
            Object obj25 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        obj16 = obj25;
                        obj17 = obj24;
                        obj18 = obj23;
                        obj19 = obj22;
                        break;
                    case 0:
                        i14 |= 1;
                        str3 = b10.A(descriptor2, 0);
                        obj13 = obj25;
                        obj14 = obj24;
                        obj15 = obj23;
                        break;
                    case 1:
                        str4 = b10.A(descriptor2, 1);
                        i14 |= 2;
                        obj13 = obj25;
                        obj14 = obj24;
                        obj15 = obj23;
                        break;
                    case 2:
                        i14 |= 4;
                        obj14 = obj24;
                        obj15 = obj23;
                        obj13 = b10.C(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, obj25);
                        break;
                    case 3:
                        i14 |= 8;
                        obj13 = obj25;
                        obj15 = obj23;
                        obj14 = b10.C(descriptor2, 3, Size$$serializer.INSTANCE, obj24);
                        break;
                    case 4:
                        obj3 = b10.i(descriptor2, 4, ColorScheme$$serializer.INSTANCE, obj3);
                        i14 |= 16;
                        obj13 = obj25;
                        obj14 = obj24;
                        obj15 = obj23;
                        break;
                    case 5:
                        i14 |= 32;
                        obj13 = obj25;
                        obj14 = obj24;
                        obj15 = b10.C(descriptor2, 5, Padding$$serializer.INSTANCE, obj23);
                        break;
                    case 6:
                        i14 |= 64;
                        i11 = 7;
                        obj8 = obj25;
                        obj9 = obj24;
                        obj10 = obj23;
                        obj11 = obj22;
                        obj12 = b10.C(descriptor2, 6, Padding$$serializer.INSTANCE, obj21);
                        continue;
                    case 7:
                        i14 |= 128;
                        obj16 = obj25;
                        obj17 = obj24;
                        obj18 = obj23;
                        obj19 = b10.i(descriptor2, i11, IconComponent$IconBackground$$serializer.INSTANCE, obj22);
                        break;
                    case 8:
                        obj20 = b10.C(descriptor2, 8, access$get$childSerializers$cp[8], obj20);
                        i14 |= 256;
                        obj16 = obj25;
                        obj17 = obj24;
                        obj18 = obj23;
                        obj19 = obj22;
                        break;
                    default:
                        throw new C5992p(o10);
                }
                i11 = 7;
                obj19 = obj22;
                obj16 = obj13;
                obj17 = obj14;
                obj18 = obj15;
                obj12 = obj21;
                obj8 = obj16;
                obj9 = obj17;
                obj10 = obj18;
                obj11 = obj19;
                obj25 = obj8;
                obj24 = obj9;
                obj23 = obj10;
                obj22 = obj11;
                obj21 = obj12;
            }
            i10 = i14;
            obj7 = obj20;
            str2 = str3;
            str = str4;
            obj = obj25;
            obj2 = obj24;
            obj4 = obj23;
            obj5 = obj22;
            obj6 = obj21;
        }
        b10.c(descriptor2);
        return new IconComponent(i10, str2, str, (IconComponent.Formats) obj, (Size) obj2, (ColorScheme) obj3, (Padding) obj4, (Padding) obj6, (IconComponent.IconBackground) obj5, (List) obj7, (t0) null);
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, IconComponent iconComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(iconComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        IconComponent.write$Self(iconComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
