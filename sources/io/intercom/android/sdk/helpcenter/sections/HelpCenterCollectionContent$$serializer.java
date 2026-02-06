package io.intercom.android.sdk.helpcenter.sections;

import com.amazon.a.a.o.b;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kh.I;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent.$serializer", "Lkh/D;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class HelpCenterCollectionContent$$serializer implements D {
    public static final int $stable = 8;
    public static final HelpCenterCollectionContent$$serializer INSTANCE;
    private static final f descriptor;

    static {
        HelpCenterCollectionContent$$serializer helpCenterCollectionContent$$serializer = new HelpCenterCollectionContent$$serializer();
        INSTANCE = helpCenterCollectionContent$$serializer;
        C6458j0 j0Var = new C6458j0("io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent", helpCenterCollectionContent$$serializer, 8);
        j0Var.l("id", false);
        j0Var.l("name", true);
        j0Var.l(b.f37480c, true);
        j0Var.l("articles", true);
        j0Var.l("sections", true);
        j0Var.l("collections", true);
        j0Var.l("article_count", false);
        j0Var.l("authors", true);
        descriptor = j0Var;
    }

    private HelpCenterCollectionContent$$serializer() {
    }

    public final C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = HelpCenterCollectionContent.$childSerializers;
        C5978b bVar = access$get$childSerializers$cp[3];
        C5978b bVar2 = access$get$childSerializers$cp[4];
        C5978b bVar3 = access$get$childSerializers$cp[5];
        C5978b bVar4 = access$get$childSerializers$cp[7];
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, x0Var, x0Var, bVar, bVar2, bVar3, I.f71604a, bVar4};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b9, code lost:
        r4 = 6;
        r6 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent deserialize(jh.e r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = descriptor
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent.$childSerializers
            boolean r3 = r0.p()
            r4 = 6
            r5 = 2
            r6 = 7
            r7 = 5
            r8 = 3
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = r0.A(r1, r11)
            java.lang.String r10 = r0.A(r1, r10)
            java.lang.String r5 = r0.A(r1, r5)
            r11 = r2[r8]
            java.lang.Object r8 = r0.C(r1, r8, r11, r12)
            java.util.List r8 = (java.util.List) r8
            r11 = r2[r9]
            java.lang.Object r9 = r0.C(r1, r9, r11, r12)
            java.util.List r9 = (java.util.List) r9
            r11 = r2[r7]
            java.lang.Object r7 = r0.C(r1, r7, r11, r12)
            java.util.List r7 = (java.util.List) r7
            int r4 = r0.E(r1, r4)
            r2 = r2[r6]
            java.lang.Object r2 = r0.C(r1, r6, r2, r12)
            java.util.List r2 = (java.util.List) r2
            r6 = 255(0xff, float:3.57E-43)
            r28 = r2
            r21 = r3
            r27 = r4
            r23 = r5
            r20 = r6
            r26 = r7
            r24 = r8
            r25 = r9
            r22 = r10
            goto L_0x00fe
        L_0x0066:
            r18 = r10
            r3 = r11
            r5 = r12
            r8 = r5
            r10 = r8
            r13 = r10
            r14 = r13
            r15 = r14
            r11 = r15
            r12 = r3
        L_0x0071:
            if (r18 == 0) goto L_0x00ec
            int r9 = r0.o(r1)
            switch(r9) {
                case -1: goto L_0x00e2;
                case 0: goto L_0x00d3;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00ac;
                case 4: goto L_0x009e;
                case 5: goto L_0x0093;
                case 6: goto L_0x008c;
                case 7: goto L_0x0080;
                default: goto L_0x007a;
            }
        L_0x007a:
            gh.p r0 = new gh.p
            r0.<init>((int) r9)
            throw r0
        L_0x0080:
            r9 = r2[r6]
            java.lang.Object r8 = r0.C(r1, r6, r9, r8)
            java.util.List r8 = (java.util.List) r8
            r12 = r12 | 128(0x80, float:1.794E-43)
        L_0x008a:
            r9 = 4
            goto L_0x0071
        L_0x008c:
            int r3 = r0.E(r1, r4)
            r12 = r12 | 64
            goto L_0x008a
        L_0x0093:
            r9 = r2[r7]
            java.lang.Object r5 = r0.C(r1, r7, r9, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = r12 | 32
            goto L_0x008a
        L_0x009e:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r4 = r0.C(r1, r9, r4, r10)
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r12 = r12 | 16
            r4 = 6
            goto L_0x0071
        L_0x00ac:
            r4 = 3
            r9 = 4
            r6 = r2[r4]
            java.lang.Object r6 = r0.C(r1, r4, r6, r11)
            r11 = r6
            java.util.List r11 = (java.util.List) r11
            r12 = r12 | 8
        L_0x00b9:
            r4 = 6
            r6 = 7
            goto L_0x0071
        L_0x00bc:
            r4 = 3
            r6 = 2
            r9 = 4
            java.lang.String r15 = r0.A(r1, r6)
            r12 = r12 | 4
            goto L_0x00b9
        L_0x00c6:
            r4 = 3
            r6 = 2
            r9 = 4
            r14 = 1
            java.lang.String r16 = r0.A(r1, r14)
            r12 = r12 | 2
            r14 = r16
            goto L_0x00b9
        L_0x00d3:
            r4 = 3
            r6 = 2
            r9 = 4
            r13 = 0
            r16 = 1
            java.lang.String r17 = r0.A(r1, r13)
            r12 = r12 | 1
            r13 = r17
            goto L_0x00b9
        L_0x00e2:
            r4 = 3
            r6 = 2
            r9 = 4
            r16 = 1
            r17 = 0
            r18 = r17
            goto L_0x00b9
        L_0x00ec:
            r27 = r3
            r26 = r5
            r28 = r8
            r25 = r10
            r24 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00fe:
            r0.c(r1)
            io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent r0 = new io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent
            r29 = 0
            r19 = r0
            r19.<init>((int) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.util.List) r24, (java.util.List) r25, (java.util.List) r26, (int) r27, (java.util.List) r28, (kh.t0) r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent$$serializer.deserialize(jh.e):io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent");
    }

    public final f getDescriptor() {
        return descriptor;
    }

    public final void serialize(jh.f fVar, HelpCenterCollectionContent helpCenterCollectionContent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(helpCenterCollectionContent, "value");
        f fVar2 = descriptor;
        d b10 = fVar.b(fVar2);
        HelpCenterCollectionContent.write$Self$intercom_sdk_base_release(helpCenterCollectionContent, b10, fVar2);
        b10.c(fVar2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
