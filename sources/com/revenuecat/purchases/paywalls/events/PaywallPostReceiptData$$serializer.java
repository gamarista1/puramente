package com.revenuecat.purchases.paywalls.events;

import gh.C5978b;
import gh.C5992p;
import ih.f;
import jh.c;
import jh.d;
import jh.e;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.I;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallPostReceiptData.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallPostReceiptData$$serializer implements D {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 6);
        j0Var.l("session_id", false);
        j0Var.l("revision", false);
        j0Var.l("display_mode", false);
        j0Var.l("dark_mode", false);
        j0Var.l("locale", false);
        j0Var.l("offering_id", false);
        descriptor = j0Var;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    public C5978b[] childSerializers() {
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, I.f71604a, x0Var, C6455i.f71663a, x0Var, x0Var};
    }

    public PaywallPostReceiptData deserialize(e eVar) {
        String str;
        String str2;
        boolean z10;
        String str3;
        int i10;
        String str4;
        int i11;
        e eVar2 = eVar;
        C6496s.h(eVar2, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar2.b(descriptor2);
        if (b10.p()) {
            String A10 = b10.A(descriptor2, 0);
            int E10 = b10.E(descriptor2, 1);
            String A11 = b10.A(descriptor2, 2);
            boolean s10 = b10.s(descriptor2, 3);
            String A12 = b10.A(descriptor2, 4);
            str4 = A10;
            str = b10.A(descriptor2, 5);
            z10 = s10;
            str2 = A12;
            str3 = A11;
            i10 = E10;
            i11 = 63;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z11 = true;
            boolean z12 = false;
            int i12 = 0;
            int i13 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        str5 = b10.A(descriptor2, 0);
                        i13 |= 1;
                        continue;
                    case 1:
                        i12 = b10.E(descriptor2, 1);
                        i13 |= 2;
                        break;
                    case 2:
                        str8 = b10.A(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        z12 = b10.s(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        str7 = b10.A(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        str6 = b10.A(descriptor2, 5);
                        i13 |= 32;
                        break;
                    default:
                        throw new C5992p(o10);
                }
            }
            str4 = str5;
            str = str6;
            z10 = z12;
            str2 = str7;
            str3 = str8;
            i10 = i12;
            i11 = i13;
        }
        b10.c(descriptor2);
        return new PaywallPostReceiptData(i11, str4, i10, str3, z10, str2, str, (t0) null);
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallPostReceiptData paywallPostReceiptData) {
        C6496s.h(fVar, "encoder");
        C6496s.h(paywallPostReceiptData, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallPostReceiptData.write$Self(paywallPostReceiptData, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
