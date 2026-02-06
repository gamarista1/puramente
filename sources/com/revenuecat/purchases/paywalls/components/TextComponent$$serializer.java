package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import io.intercom.android.sdk.models.AttributeType;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TextComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/TextComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextComponent$$serializer implements D {
    public static final TextComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        TextComponent$$serializer textComponent$$serializer = new TextComponent$$serializer();
        INSTANCE = textComponent$$serializer;
        C6458j0 j0Var = new C6458j0(AttributeType.TEXT, textComponent$$serializer, 11);
        j0Var.l("text_lid", false);
        j0Var.l("color", false);
        j0Var.l("background_color", true);
        j0Var.l("font_name", true);
        j0Var.l("font_weight", true);
        j0Var.l("font_size", true);
        j0Var.l("horizontal_alignment", true);
        j0Var.l("size", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private TextComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = TextComponent.$childSerializers;
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        C5978b u10 = C5998a.u(colorScheme$$serializer);
        C5978b u11 = C5998a.u(FontAlias$$serializer.INSTANCE);
        C5978b bVar = access$get$childSerializers$cp[4];
        C5978b bVar2 = access$get$childSerializers$cp[6];
        C5978b bVar3 = access$get$childSerializers$cp[10];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{LocalizationKey$$serializer.INSTANCE, colorScheme$$serializer, u10, u11, bVar, FontSizeSerializer.INSTANCE, bVar2, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVar3};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e3, code lost:
        r3 = 10;
        r4 = 9;
        r5 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012e, code lost:
        r3 = 10;
        r4 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0132, code lost:
        r5 = 7;
        r8 = 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.TextComponent deserialize(jh.e r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r26.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.TextComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 9
            r5 = 7
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 2
            r11 = 6
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x007c
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r3 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            java.lang.Object r3 = r0.C(r1, r14, r3, r15)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r10 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r13, r10, r15)
            java.lang.Object r9 = r0.i(r1, r9, r10, r15)
            com.revenuecat.purchases.FontAlias$$serializer r10 = com.revenuecat.purchases.FontAlias$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r7, r10, r15)
            r10 = r2[r12]
            java.lang.Object r10 = r0.C(r1, r12, r10, r15)
            com.revenuecat.purchases.paywalls.components.FontSizeSerializer r12 = com.revenuecat.purchases.paywalls.components.FontSizeSerializer.INSTANCE
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r6 = r0.C(r1, r6, r12, r14)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r12 = r2[r11]
            java.lang.Object r11 = r0.C(r1, r11, r12, r15)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r5, r12, r15)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r8, r12, r15)
            java.lang.Object r4 = r0.C(r1, r4, r12, r15)
            r12 = 10
            r2 = r2[r12]
            java.lang.Object r2 = r0.C(r1, r12, r2, r15)
            r12 = 2047(0x7ff, float:2.868E-42)
            r25 = r13
            r13 = r6
            r6 = r9
            r9 = r7
            r7 = r12
            r12 = r25
            goto L_0x0166
        L_0x007c:
            r3 = 10
            r24 = r13
            r6 = r14
            r18 = r6
            r7 = r15
            r9 = r7
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r21 = r14
            r22 = r21
            r23 = r22
        L_0x008f:
            if (r24 == 0) goto L_0x0154
            int r11 = r0.o(r1)
            switch(r11) {
                case -1: goto L_0x0148;
                case 0: goto L_0x0137;
                case 1: goto L_0x011d;
                case 2: goto L_0x0105;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00e9;
                case 5: goto L_0x00cf;
                case 6: goto L_0x00c3;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00b1;
                case 9: goto L_0x00a8;
                case 10: goto L_0x009e;
                default: goto L_0x0098;
            }
        L_0x0098:
            gh.p r0 = new gh.p
            r0.<init>((int) r11)
            throw r0
        L_0x009e:
            r11 = r2[r3]
            java.lang.Object r10 = r0.C(r1, r3, r11, r10)
            r6 = r6 | 1024(0x400, float:1.435E-42)
        L_0x00a6:
            r11 = 6
            goto L_0x008f
        L_0x00a8:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r14 = r0.C(r1, r4, r11, r14)
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x00a6
        L_0x00b1:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r7 = r0.C(r1, r8, r11, r7)
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x00a6
        L_0x00ba:
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r5, r11, r13)
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x00a6
        L_0x00c3:
            r11 = 6
            r3 = r2[r11]
            java.lang.Object r12 = r0.C(r1, r11, r3, r12)
            r6 = r6 | 64
            r3 = 10
            goto L_0x008f
        L_0x00cf:
            r11 = 6
            com.revenuecat.purchases.paywalls.components.FontSizeSerializer r3 = com.revenuecat.purchases.paywalls.components.FontSizeSerializer.INSTANCE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r5 = 5
            java.lang.Object r3 = r0.C(r1, r5, r3, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r18 = r3.intValue()
            r6 = r6 | 32
        L_0x00e3:
            r3 = 10
            r4 = 9
            r5 = 7
            goto L_0x008f
        L_0x00e9:
            r3 = 4
            r5 = 5
            r11 = 6
            r4 = r2[r3]
            r5 = r22
            java.lang.Object r22 = r0.C(r1, r3, r4, r5)
            r6 = r6 | 16
            goto L_0x00e3
        L_0x00f7:
            r5 = r22
            r3 = 4
            r11 = 6
            com.revenuecat.purchases.FontAlias$$serializer r4 = com.revenuecat.purchases.FontAlias$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r9 = r0.i(r1, r3, r4, r9)
            r6 = r6 | 8
            goto L_0x00e3
        L_0x0105:
            r5 = r22
            r3 = 3
            r11 = 6
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r3 = r21
            r8 = 2
            java.lang.Object r21 = r0.i(r1, r8, r4, r3)
            r6 = r6 | 4
            r3 = 10
            r4 = 9
            r5 = 7
            r8 = 8
            goto L_0x008f
        L_0x011d:
            r3 = r21
            r5 = r22
            r8 = 2
            r11 = 6
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r8 = r23
            r11 = 1
            java.lang.Object r23 = r0.C(r1, r11, r4, r8)
            r6 = r6 | 2
        L_0x012e:
            r3 = 10
            r4 = 9
        L_0x0132:
            r5 = 7
            r8 = 8
            goto L_0x00a6
        L_0x0137:
            r3 = r21
            r5 = r22
            r8 = r23
            r11 = 1
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r4 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            r11 = 0
            java.lang.Object r15 = r0.C(r1, r11, r4, r15)
            r6 = r6 | 1
            goto L_0x012e
        L_0x0148:
            r3 = r21
            r5 = r22
            r8 = r23
            r11 = 0
            r24 = r11
            r3 = 10
            goto L_0x0132
        L_0x0154:
            r3 = r21
            r5 = r22
            r8 = r23
            r2 = r10
            r11 = r12
            r4 = r14
            r10 = r5
            r12 = r8
            r5 = r13
            r13 = r18
            r8 = r7
            r7 = r6
            r6 = r3
            r3 = r15
        L_0x0166:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.TextComponent r0 = new com.revenuecat.purchases.paywalls.components.TextComponent
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey r3 = (com.revenuecat.purchases.paywalls.components.common.LocalizationKey) r3
            if (r3 == 0) goto L_0x0174
            java.lang.String r1 = r3.m118unboximpl()
            goto L_0x0175
        L_0x0174:
            r1 = 0
        L_0x0175:
            r3 = r12
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r3
            r12 = r6
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r12 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r12
            com.revenuecat.purchases.FontAlias r9 = (com.revenuecat.purchases.FontAlias) r9
            if (r9 == 0) goto L_0x0184
            java.lang.String r15 = r9.m42unboximpl()
            goto L_0x0185
        L_0x0184:
            r15 = 0
        L_0x0185:
            r14 = r10
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r14 = (com.revenuecat.purchases.paywalls.components.properties.FontWeight) r14
            r16 = r11
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r16 = (com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment) r16
            com.revenuecat.purchases.paywalls.components.properties.Size r5 = (com.revenuecat.purchases.paywalls.components.properties.Size) r5
            r17 = r8
            com.revenuecat.purchases.paywalls.components.properties.Padding r17 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r17
            com.revenuecat.purchases.paywalls.components.properties.Padding r4 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r4
            r18 = r2
            java.util.List r18 = (java.util.List) r18
            r19 = 0
            r20 = 0
            r6 = r0
            r8 = r1
            r9 = r3
            r10 = r12
            r11 = r15
            r12 = r14
            r14 = r16
            r15 = r5
            r16 = r17
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TextComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.TextComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, TextComponent textComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(textComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        TextComponent.write$Self(textComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
