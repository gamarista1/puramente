package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import gh.C5978b;
import gh.C5992p;
import ih.f;
import jh.c;
import jh.d;
import jh.e;
import kh.C6458j0;
import kh.D;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ButtonComponent.Action.NavigateTo.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonComponent$Action$NavigateTo$$serializer implements D {
    public static final ButtonComponent$Action$NavigateTo$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        ButtonComponent$Action$NavigateTo$$serializer buttonComponent$Action$NavigateTo$$serializer = new ButtonComponent$Action$NavigateTo$$serializer();
        INSTANCE = buttonComponent$Action$NavigateTo$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo", buttonComponent$Action$NavigateTo$$serializer, 1);
        j0Var.l("destination", false);
        descriptor = j0Var;
    }

    private ButtonComponent$Action$NavigateTo$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{ButtonComponent.Action.NavigateTo.$childSerializers[0]};
    }

    public ButtonComponent.Action.NavigateTo deserialize(e eVar) {
        Object obj;
        C6496s.h(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar.b(descriptor2);
        C5978b[] access$get$childSerializers$cp = ButtonComponent.Action.NavigateTo.$childSerializers;
        int i10 = 1;
        if (b10.p()) {
            obj = b10.C(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj2 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj2 = b10.C(descriptor2, 0, access$get$childSerializers$cp[0], obj2);
                    i11 = 1;
                } else {
                    throw new C5992p(o10);
                }
            }
            obj = obj2;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new ButtonComponent.Action.NavigateTo(i10, (ButtonComponent.Destination) obj, (t0) null);
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, ButtonComponent.Action.NavigateTo navigateTo) {
        C6496s.h(fVar, "encoder");
        C6496s.h(navigateTo, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        b10.B(descriptor2, 0, ButtonComponent.Action.NavigateTo.$childSerializers[0], navigateTo.destination);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
