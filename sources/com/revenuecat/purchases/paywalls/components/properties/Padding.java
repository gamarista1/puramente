package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "", "", "top", "bottom", "leading", "trailing", "<init>", "(DDDD)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IDDDDLkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljh/d;Lih/f;)V", "D", "getTop", "()D", "getBottom", "getLeading", "getTrailing", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class Padding {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: default  reason: not valid java name */
    public static final Padding f4default = new Padding(10.0d, 10.0d, 20.0d, 20.0d);
    /* access modifiers changed from: private */
    public static final Padding zero = new Padding(0.0d, 0.0d, 0.0d, 0.0d);
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Padding$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "serializer", "()Lgh/b;", "zero", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getZero", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "default", "getDefault", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Padding getDefault() {
            return Padding.f4default;
        }

        public final /* synthetic */ Padding getZero() {
            return Padding.zero;
        }

        public final C5978b serializer() {
            return Padding$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Padding() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void write$Self(Padding padding, d dVar, f fVar) {
        if (dVar.q(fVar, 0) || Double.compare(padding.top, 0.0d) != 0) {
            dVar.g(fVar, 0, padding.top);
        }
        if (dVar.q(fVar, 1) || Double.compare(padding.bottom, 0.0d) != 0) {
            dVar.g(fVar, 1, padding.bottom);
        }
        if (dVar.q(fVar, 2) || Double.compare(padding.leading, 0.0d) != 0) {
            dVar.g(fVar, 2, padding.leading);
        }
        if (dVar.q(fVar, 3) || Double.compare(padding.trailing, 0.0d) != 0) {
            dVar.g(fVar, 3, padding.trailing);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Double.compare(this.top, padding.top) == 0 && Double.compare(this.bottom, padding.bottom) == 0 && Double.compare(this.leading, padding.leading) == 0 && Double.compare(this.trailing, padding.trailing) == 0;
    }

    public final /* synthetic */ double getBottom() {
        return this.bottom;
    }

    public final /* synthetic */ double getLeading() {
        return this.leading;
    }

    public final /* synthetic */ double getTop() {
        return this.top;
    }

    public final /* synthetic */ double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.top) * 31) + Double.hashCode(this.bottom)) * 31) + Double.hashCode(this.leading)) * 31) + Double.hashCode(this.trailing);
    }

    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ')';
    }

    public Padding(double d10, double d11, double d12, double d13) {
        this.top = d10;
        this.bottom = d11;
        this.leading = d12;
        this.trailing = d13;
    }

    @C6521e
    public /* synthetic */ Padding(int i10, double d10, double d11, double d12, double d13, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.top = 0.0d;
        } else {
            this.top = d10;
        }
        if ((i10 & 2) == 0) {
            this.bottom = 0.0d;
        } else {
            this.bottom = d11;
        }
        if ((i10 & 4) == 0) {
            this.leading = 0.0d;
        } else {
            this.leading = d12;
        }
        if ((i10 & 8) == 0) {
            this.trailing = 0.0d;
        } else {
            this.trailing = d13;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Padding(double r10, double r12, double r14, double r16, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r10
        L_0x0009:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r12
        L_0x0010:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0016
            r7 = r1
            goto L_0x0017
        L_0x0016:
            r7 = r14
        L_0x0017:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = r16
        L_0x001e:
            r10 = r9
            r11 = r3
            r13 = r5
            r15 = r7
            r17 = r1
            r10.<init>(r11, r13, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.properties.Padding.<init>(double, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
