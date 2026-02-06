package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
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
import kh.T;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.Paywalls.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackendEvent$Paywalls$$serializer implements D {
    public static final BackendEvent$Paywalls$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        BackendEvent$Paywalls$$serializer backendEvent$Paywalls$$serializer = new BackendEvent$Paywalls$$serializer();
        INSTANCE = backendEvent$Paywalls$$serializer;
        C6458j0 j0Var = new C6458j0("paywalls", backendEvent$Paywalls$$serializer, 11);
        j0Var.l("id", false);
        j0Var.l(DiagnosticsEntry.VERSION_KEY, false);
        j0Var.l("type", false);
        j0Var.l("app_user_id", false);
        j0Var.l("session_id", false);
        j0Var.l("offering_id", false);
        j0Var.l("paywall_revision", false);
        j0Var.l(DiagnosticsEntry.TIMESTAMP_KEY, false);
        j0Var.l("display_mode", false);
        j0Var.l("dark_mode", false);
        j0Var.l("locale", false);
        descriptor = j0Var;
    }

    private BackendEvent$Paywalls$$serializer() {
    }

    public C5978b[] childSerializers() {
        x0 x0Var = x0.f71726a;
        I i10 = I.f71604a;
        return new C5978b[]{x0Var, i10, x0Var, x0Var, x0Var, x0Var, i10, T.f71627a, x0Var, C6455i.f71663a, x0Var};
    }

    public BackendEvent.Paywalls deserialize(e eVar) {
        String str;
        boolean z10;
        String str2;
        long j10;
        int i10;
        String str3;
        String str4;
        String str5;
        String str6;
        int i11;
        String str7;
        int i12;
        e eVar2 = eVar;
        C6496s.h(eVar2, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar2.b(descriptor2);
        int i13 = 0;
        if (b10.p()) {
            String A10 = b10.A(descriptor2, 0);
            int E10 = b10.E(descriptor2, 1);
            String A11 = b10.A(descriptor2, 2);
            String A12 = b10.A(descriptor2, 3);
            String A13 = b10.A(descriptor2, 4);
            String A14 = b10.A(descriptor2, 5);
            int E11 = b10.E(descriptor2, 6);
            long G10 = b10.G(descriptor2, 7);
            String A15 = b10.A(descriptor2, 8);
            boolean s10 = b10.s(descriptor2, 9);
            str7 = A10;
            str = b10.A(descriptor2, 10);
            z10 = s10;
            str2 = A15;
            i10 = E11;
            str3 = A14;
            str5 = A12;
            i12 = 2047;
            str4 = A13;
            str6 = A11;
            i11 = E10;
            j10 = G10;
        } else {
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            boolean z11 = true;
            int i14 = 0;
            int i15 = 0;
            long j11 = 0;
            String str14 = null;
            boolean z12 = false;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        str8 = b10.A(descriptor2, 0);
                        continue;
                    case 1:
                        i15 = b10.E(descriptor2, 1);
                        i13 |= 2;
                        continue;
                    case 2:
                        str13 = b10.A(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        str11 = b10.A(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        str12 = b10.A(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        str10 = b10.A(descriptor2, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        i14 = b10.E(descriptor2, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        j11 = b10.G(descriptor2, 7);
                        i13 |= 128;
                        break;
                    case 8:
                        str9 = b10.A(descriptor2, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        z12 = b10.s(descriptor2, 9);
                        i13 |= 512;
                        break;
                    case 10:
                        str14 = b10.A(descriptor2, 10);
                        i13 |= 1024;
                        break;
                    default:
                        throw new C5992p(o10);
                }
            }
            str7 = str8;
            i12 = i13;
            str = str14;
            z10 = z12;
            str2 = str9;
            i10 = i14;
            str3 = str10;
            str5 = str11;
            str4 = str12;
            str6 = str13;
            i11 = i15;
            j10 = j11;
        }
        b10.c(descriptor2);
        return new BackendEvent.Paywalls(i12, str7, i11, str6, str5, str4, str3, i10, j10, str2, z10, str, (t0) null);
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, BackendEvent.Paywalls paywalls) {
        C6496s.h(fVar, "encoder");
        C6496s.h(paywalls, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        BackendEvent.Paywalls.write$Self(paywalls, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
