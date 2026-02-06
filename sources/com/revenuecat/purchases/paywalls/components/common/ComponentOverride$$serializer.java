package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import gh.C5978b;
import gh.C5992p;
import ih.f;
import java.util.List;
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
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ComponentOverride.$serializer", "T", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "<init>", "()V", "Lgh/b;", "typeSerial0", "(Lgh/b;)V", "", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;)V", "typeParametersSerializers", "getTypeSerial0", "()Lgh/b;", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComponentOverride$$serializer<T> implements D {
    private final /* synthetic */ C6458j0 descriptor;
    private final /* synthetic */ C5978b typeSerial0;

    private ComponentOverride$$serializer() {
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", this, 2);
        j0Var.l("conditions", false);
        j0Var.l(DiagnosticsEntry.PROPERTIES_KEY, false);
        this.descriptor = j0Var;
    }

    private final C5978b getTypeSerial0() {
        return this.typeSerial0;
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{ComponentOverride.$childSerializers[0], this.typeSerial0};
    }

    public ComponentOverride<T> deserialize(e eVar) {
        int i10;
        Object obj;
        Object obj2;
        C6496s.h(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar.b(descriptor2);
        C5978b[] access$get$childSerializers$cp = ComponentOverride.$childSerializers;
        if (b10.p()) {
            obj2 = b10.C(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            obj = b10.C(descriptor2, 1, this.typeSerial0, (Object) null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj3 = null;
            Object obj4 = null;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    obj3 = b10.C(descriptor2, 0, access$get$childSerializers$cp[0], obj3);
                    i11 |= 1;
                } else if (o10 == 1) {
                    obj4 = b10.C(descriptor2, 1, this.typeSerial0, obj4);
                    i11 |= 2;
                } else {
                    throw new C5992p(o10);
                }
            }
            obj2 = obj3;
            obj = obj4;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new ComponentOverride<>(i10, (List) obj2, (PartialComponent) obj, (t0) null);
    }

    public f getDescriptor() {
        return this.descriptor;
    }

    public void serialize(jh.f fVar, ComponentOverride<T> componentOverride) {
        C6496s.h(fVar, "encoder");
        C6496s.h(componentOverride, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        ComponentOverride.write$Self(componentOverride, b10, descriptor2, this.typeSerial0);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return new C5978b[]{this.typeSerial0};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C6521e
    public /* synthetic */ ComponentOverride$$serializer(C5978b bVar) {
        this();
        C6496s.h(bVar, "typeSerial0");
        this.typeSerial0 = bVar;
    }
}
