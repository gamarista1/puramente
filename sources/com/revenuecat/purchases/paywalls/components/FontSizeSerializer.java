package com.revenuecat.purchases.paywalls.components;

import gh.C5978b;
import ih.e;
import ih.f;
import ih.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/FontSizeSerializer;", "Lgh/b;", "", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;I)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/lang/Integer;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FontSizeSerializer implements C5978b {
    public static final FontSizeSerializer INSTANCE = new FontSizeSerializer();
    private static final f descriptor = i.a("FontSize", e.f.f68479a);

    private FontSizeSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [lh.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        throw new gh.C5986j("Unknown font size name: " + r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer deserialize(jh.e r4) {
        /*
            r3 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            boolean r0 = r4 instanceof lh.h
            r1 = 0
            if (r0 == 0) goto L_0x000d
            lh.h r4 = (lh.h) r4
            goto L_0x000e
        L_0x000d:
            r4 = r1
        L_0x000e:
            if (r4 == 0) goto L_0x00c9
            lh.i r4 = r4.g()
            boolean r0 = r4 instanceof lh.x
            if (r0 == 0) goto L_0x001b
            r1 = r4
            lh.x r1 = (lh.x) r1
        L_0x001b:
            if (r1 == 0) goto L_0x00c1
            boolean r4 = r1.b()
            if (r4 == 0) goto L_0x00b8
            java.lang.String r4 = r1.a()
            int r0 = r4.hashCode()
            switch(r0) {
                case -1383701233: goto L_0x0096;
                case -1383701232: goto L_0x008b;
                case -1383701226: goto L_0x0080;
                case -209710737: goto L_0x0075;
                case -209710736: goto L_0x006a;
                case -209710730: goto L_0x005f;
                case 54935217: goto L_0x0054;
                case 331460015: goto L_0x0048;
                case 2088902225: goto L_0x003c;
                case 2088902232: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x00a1
        L_0x0030:
            java.lang.String r0 = "heading_xs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 16
            goto L_0x00bc
        L_0x003c:
            java.lang.String r0 = "heading_xl"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 34
            goto L_0x00bc
        L_0x0048:
            java.lang.String r0 = "heading_xxl"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 40
            goto L_0x00bc
        L_0x0054:
            java.lang.String r0 = "body_xl"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 18
            goto L_0x00bc
        L_0x005f:
            java.lang.String r0 = "heading_s"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 20
            goto L_0x00bc
        L_0x006a:
            java.lang.String r0 = "heading_m"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 24
            goto L_0x00bc
        L_0x0075:
            java.lang.String r0 = "heading_l"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 28
            goto L_0x00bc
        L_0x0080:
            java.lang.String r0 = "body_s"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 13
            goto L_0x00bc
        L_0x008b:
            java.lang.String r0 = "body_m"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 15
            goto L_0x00bc
        L_0x0096:
            java.lang.String r0 = "body_l"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a1
            r4 = 17
            goto L_0x00bc
        L_0x00a1:
            gh.j r0 = new gh.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown font size name: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x00b8:
            int r4 = lh.j.k(r1)
        L_0x00bc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x00c1:
            gh.j r4 = new gh.j
            java.lang.String r0 = "Expected font_size to be a JsonPrimitive"
            r4.<init>(r0)
            throw r4
        L_0x00c9:
            gh.j r4 = new gh.j
            java.lang.String r0 = "Expected font_size to be part of a JSON object"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.FontSizeSerializer.deserialize(jh.e):java.lang.Integer");
    }

    public void serialize(jh.f fVar, int i10) {
        C6496s.h(fVar, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
