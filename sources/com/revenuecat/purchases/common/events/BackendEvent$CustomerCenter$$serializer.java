package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.BackendEvent;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.I;
import kh.T;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/events/BackendEvent.CustomerCenter.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackendEvent$CustomerCenter$$serializer implements D {
    public static final BackendEvent$CustomerCenter$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        BackendEvent$CustomerCenter$$serializer backendEvent$CustomerCenter$$serializer = new BackendEvent$CustomerCenter$$serializer();
        INSTANCE = backendEvent$CustomerCenter$$serializer;
        C6458j0 j0Var = new C6458j0("customer_center", backendEvent$CustomerCenter$$serializer, 13);
        j0Var.l("id", false);
        j0Var.l("revision_id", false);
        j0Var.l("type", false);
        j0Var.l("app_user_id", false);
        j0Var.l("app_session_id", false);
        j0Var.l(DiagnosticsEntry.TIMESTAMP_KEY, false);
        j0Var.l("dark_mode", false);
        j0Var.l("locale", false);
        j0Var.l("display_mode", false);
        j0Var.l("path", false);
        j0Var.l("url", false);
        j0Var.l("survey_option_id", false);
        j0Var.l("survey_option_title_key", false);
        descriptor = j0Var;
    }

    private BackendEvent$CustomerCenter$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = BackendEvent.CustomerCenter.$childSerializers;
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, I.f71604a, access$get$childSerializers$cp[2], x0Var, x0Var, T.f71627a, C6455i.f71663a, x0Var, access$get$childSerializers$cp[8], C5998a.u(access$get$childSerializers$cp[9]), C5998a.u(x0Var), C5998a.u(x0Var), C5998a.u(x0Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00ac, code lost:
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00de, code lost:
        r13 = r7;
        r6 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0129, code lost:
        r6 = 10;
        r10 = r10;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        r15 = r15;
        r10 = r10;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r15 = r15;
        r10 = r10;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        r10 = r10;
        r9 = r9;
        r15 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.common.events.BackendEvent.CustomerCenter deserialize(jh.e r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r26.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.common.events.BackendEvent.CustomerCenter.$childSerializers
            boolean r3 = r0.p()
            r6 = 10
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 4
            r12 = 9
            r13 = 8
            r14 = 2
            r15 = 1
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x007c
            java.lang.String r3 = r0.A(r1, r4)
            int r4 = r0.E(r1, r15)
            r15 = r2[r14]
            java.lang.Object r14 = r0.C(r1, r14, r15, r5)
            java.lang.String r10 = r0.A(r1, r10)
            java.lang.String r11 = r0.A(r1, r11)
            long r17 = r0.G(r1, r9)
            boolean r8 = r0.s(r1, r8)
            java.lang.String r7 = r0.A(r1, r7)
            r9 = r2[r13]
            java.lang.Object r9 = r0.C(r1, r13, r9, r5)
            r2 = r2[r12]
            java.lang.Object r2 = r0.i(r1, r12, r2, r5)
            kh.x0 r12 = kh.x0.f71726a
            java.lang.Object r6 = r0.i(r1, r6, r12, r5)
            r13 = 11
            java.lang.Object r13 = r0.i(r1, r13, r12, r5)
            r15 = 12
            java.lang.Object r5 = r0.i(r1, r15, r12, r5)
            r12 = 8191(0x1fff, float:1.1478E-41)
            r15 = r9
            r22 = r17
            r9 = r5
            r17 = r13
            r5 = r3
            r13 = r7
            r25 = r6
            r6 = r4
            r4 = r12
            r12 = r8
            r8 = r10
            r10 = r25
            goto L_0x0159
        L_0x007c:
            r17 = 0
            r3 = r4
            r8 = r3
            r21 = r8
            r4 = r5
            r9 = r4
            r10 = r9
            r11 = r10
            r14 = r11
            r19 = r14
            r20 = r19
            r24 = r15
            r22 = r17
            r15 = r20
            r18 = r15
        L_0x0093:
            if (r24 == 0) goto L_0x014b
            int r7 = r0.o(r1)
            switch(r7) {
                case -1: goto L_0x0145;
                case 0: goto L_0x0137;
                case 1: goto L_0x012c;
                case 2: goto L_0x011e;
                case 3: goto L_0x0113;
                case 4: goto L_0x0108;
                case 5: goto L_0x00fd;
                case 6: goto L_0x00f2;
                case 7: goto L_0x00e3;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00b0;
                case 12: goto L_0x00a2;
                default: goto L_0x009c;
            }
        L_0x009c:
            gh.p r0 = new gh.p
            r0.<init>((int) r7)
            throw r0
        L_0x00a2:
            kh.x0 r7 = kh.x0.f71726a
            r13 = 12
            java.lang.Object r9 = r0.i(r1, r13, r7, r9)
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x00ac:
            r7 = 7
            r13 = 8
            goto L_0x0093
        L_0x00b0:
            r13 = 12
            kh.x0 r7 = kh.x0.f71726a
            r13 = 11
            java.lang.Object r11 = r0.i(r1, r13, r7, r11)
            r8 = r8 | 2048(0x800, float:2.87E-42)
            goto L_0x00ac
        L_0x00bd:
            r13 = 11
            kh.x0 r7 = kh.x0.f71726a
            java.lang.Object r10 = r0.i(r1, r6, r7, r10)
            r8 = r8 | 1024(0x400, float:1.435E-42)
            goto L_0x00ac
        L_0x00c8:
            r13 = 11
            r7 = r2[r12]
            java.lang.Object r14 = r0.i(r1, r12, r7, r14)
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x00ac
        L_0x00d3:
            r7 = r13
            r13 = 11
            r6 = r2[r7]
            java.lang.Object r15 = r0.C(r1, r7, r6, r15)
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x00de:
            r13 = r7
            r6 = 10
            r7 = 7
            goto L_0x0093
        L_0x00e3:
            r7 = r13
            r6 = 7
            r13 = 11
            java.lang.String r20 = r0.A(r1, r6)
            r8 = r8 | 128(0x80, float:1.794E-43)
            r13 = r7
            r7 = r6
            r6 = 10
            goto L_0x0093
        L_0x00f2:
            r7 = r13
            r6 = 6
            r13 = 11
            boolean r21 = r0.s(r1, r6)
            r8 = r8 | 64
            goto L_0x00de
        L_0x00fd:
            r7 = r13
            r6 = 5
            r13 = 11
            long r22 = r0.G(r1, r6)
            r8 = r8 | 32
            goto L_0x00de
        L_0x0108:
            r7 = r13
            r6 = 4
            r13 = 11
            java.lang.String r19 = r0.A(r1, r6)
            r8 = r8 | 16
            goto L_0x00de
        L_0x0113:
            r7 = r13
            r6 = 3
            r13 = 11
            java.lang.String r18 = r0.A(r1, r6)
            r8 = r8 | 8
            goto L_0x00de
        L_0x011e:
            r6 = 2
            r13 = 11
            r7 = r2[r6]
            java.lang.Object r4 = r0.C(r1, r6, r7, r4)
            r8 = r8 | 4
        L_0x0129:
            r6 = 10
            goto L_0x00ac
        L_0x012c:
            r6 = 2
            r7 = 1
            r13 = 11
            int r3 = r0.E(r1, r7)
            r8 = r8 | 2
            goto L_0x0129
        L_0x0137:
            r5 = 0
            r6 = 2
            r7 = 1
            r13 = 11
            java.lang.String r17 = r0.A(r1, r5)
            r8 = r8 | 1
            r5 = r17
            goto L_0x0129
        L_0x0145:
            r17 = 0
            r24 = r17
            goto L_0x00ac
        L_0x014b:
            r6 = r3
            r17 = r11
            r2 = r14
            r11 = r19
            r13 = r20
            r12 = r21
            r14 = r4
            r4 = r8
            r8 = r18
        L_0x0159:
            r0.c(r1)
            com.revenuecat.purchases.common.events.BackendEvent$CustomerCenter r0 = new com.revenuecat.purchases.common.events.BackendEvent$CustomerCenter
            r3 = r0
            r7 = r14
            com.revenuecat.purchases.customercenter.events.CustomerCenterEventType r7 = (com.revenuecat.purchases.customercenter.events.CustomerCenterEventType) r7
            r14 = r15
            com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode r14 = (com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode) r14
            r15 = r2
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathType r15 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType) r15
            r16 = r10
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r17 = (java.lang.String) r17
            r18 = r9
            java.lang.String r18 = (java.lang.String) r18
            r19 = 0
            r9 = r11
            r10 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.events.BackendEvent$CustomerCenter$$serializer.deserialize(jh.e):com.revenuecat.purchases.common.events.BackendEvent$CustomerCenter");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, BackendEvent.CustomerCenter customerCenter) {
        C6496s.h(fVar, "encoder");
        C6496s.h(customerCenter, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        BackendEvent.CustomerCenter.write$Self(customerCenter, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
