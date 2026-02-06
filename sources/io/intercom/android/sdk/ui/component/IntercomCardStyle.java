package io.intercom.android.sdk.ui.component;

import I.a;
import I.f;
import I.g;
import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import x.C2869h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomCardStyle;", "", "<init>", "()V", "Lr0/g2;", "shape", "Lr0/x0;", "backgroundColor", "contentColor", "Lc1/h;", "elevation", "Lx/g;", "border", "shadowColor", "Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "defaultStyle-qUnfpCA", "(Lr0/g2;JJFLx/g;JLY/m;II)Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "defaultStyle", "conversationCardStyle-PEIptTM", "(Lr0/g2;JJFLx/g;LY/m;II)Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "conversationCardStyle", "Style", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomCardStyle {
    public static final int $stable = 0;
    public static final IntercomCardStyle INSTANCE = new IntercomCardStyle();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 H×\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H×\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001b¨\u00065"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "", "Lr0/g2;", "shape", "Lr0/x0;", "backgroundColor", "contentColor", "Lc1/h;", "elevation", "Lx/g;", "border", "shadowColor", "<init>", "(Lr0/g2;JJFLx/g;Lr0/x0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lr0/g2;", "component2-0d7_KjU", "()J", "component2", "component3-0d7_KjU", "component3", "component4-D9Ej5fM", "()F", "component4", "component5", "()Lx/g;", "component6-QN2ZGVo", "()Lr0/x0;", "component6", "copy-UBuVVS8", "(Lr0/g2;JJFLx/g;Lr0/x0;)Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr0/g2;", "getShape", "J", "getBackgroundColor-0d7_KjU", "getContentColor-0d7_KjU", "F", "getElevation-D9Ej5fM", "Lx/g;", "getBorder", "Lr0/x0;", "getShadowColor-QN2ZGVo", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final C2868g border;
        private final long contentColor;
        private final float elevation;
        private final C2544x0 shadowColor;
        private final g2 shape;

        public /* synthetic */ Style(g2 g2Var, long j10, long j11, float f10, C2868g gVar, C2544x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(g2Var, j10, j11, f10, gVar, x0Var);
        }

        /* renamed from: copy-UBuVVS8$default  reason: not valid java name */
        public static /* synthetic */ Style m592copyUBuVVS8$default(Style style, g2 g2Var, long j10, long j11, float f10, C2868g gVar, C2544x0 x0Var, int i10, Object obj) {
            g2 g2Var2;
            long j12;
            long j13;
            float f11;
            C2868g gVar2;
            C2544x0 x0Var2;
            Style style2 = style;
            if ((i10 & 1) != 0) {
                g2Var2 = style2.shape;
            } else {
                g2Var2 = g2Var;
            }
            if ((i10 & 2) != 0) {
                j12 = style2.backgroundColor;
            } else {
                j12 = j10;
            }
            if ((i10 & 4) != 0) {
                j13 = style2.contentColor;
            } else {
                j13 = j11;
            }
            if ((i10 & 8) != 0) {
                f11 = style2.elevation;
            } else {
                f11 = f10;
            }
            if ((i10 & 16) != 0) {
                gVar2 = style2.border;
            } else {
                gVar2 = gVar;
            }
            if ((i10 & 32) != 0) {
                x0Var2 = style2.shadowColor;
            } else {
                x0Var2 = x0Var;
            }
            return style.m597copyUBuVVS8(g2Var2, j12, j13, f11, gVar2, x0Var2);
        }

        public final g2 component1() {
            return this.shape;
        }

        /* renamed from: component2-0d7_KjU  reason: not valid java name */
        public final long m593component20d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: component3-0d7_KjU  reason: not valid java name */
        public final long m594component30d7_KjU() {
            return this.contentColor;
        }

        /* renamed from: component4-D9Ej5fM  reason: not valid java name */
        public final float m595component4D9Ej5fM() {
            return this.elevation;
        }

        public final C2868g component5() {
            return this.border;
        }

        /* renamed from: component6-QN2ZGVo  reason: not valid java name */
        public final C2544x0 m596component6QN2ZGVo() {
            return this.shadowColor;
        }

        /* renamed from: copy-UBuVVS8  reason: not valid java name */
        public final Style m597copyUBuVVS8(g2 g2Var, long j10, long j11, float f10, C2868g gVar, C2544x0 x0Var) {
            C6496s.h(g2Var, "shape");
            C2868g gVar2 = gVar;
            C6496s.h(gVar2, "border");
            return new Style(g2Var, j10, j11, f10, gVar2, x0Var, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return C6496s.c(this.shape, style.shape) && C2544x0.q(this.backgroundColor, style.backgroundColor) && C2544x0.q(this.contentColor, style.contentColor) && h.m(this.elevation, style.elevation) && C6496s.c(this.border, style.border) && C6496s.c(this.shadowColor, style.shadowColor);
        }

        /* renamed from: getBackgroundColor-0d7_KjU  reason: not valid java name */
        public final long m598getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        public final C2868g getBorder() {
            return this.border;
        }

        /* renamed from: getContentColor-0d7_KjU  reason: not valid java name */
        public final long m599getContentColor0d7_KjU() {
            return this.contentColor;
        }

        /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
        public final float m600getElevationD9Ej5fM() {
            return this.elevation;
        }

        /* renamed from: getShadowColor-QN2ZGVo  reason: not valid java name */
        public final C2544x0 m601getShadowColorQN2ZGVo() {
            return this.shadowColor;
        }

        public final g2 getShape() {
            return this.shape;
        }

        public int hashCode() {
            int hashCode = ((((((((this.shape.hashCode() * 31) + C2544x0.w(this.backgroundColor)) * 31) + C2544x0.w(this.contentColor)) * 31) + h.o(this.elevation)) * 31) + this.border.hashCode()) * 31;
            C2544x0 x0Var = this.shadowColor;
            return hashCode + (x0Var == null ? 0 : C2544x0.w(x0Var.y()));
        }

        public String toString() {
            return "Style(shape=" + this.shape + ", backgroundColor=" + C2544x0.x(this.backgroundColor) + ", contentColor=" + C2544x0.x(this.contentColor) + ", elevation=" + h.p(this.elevation) + ", border=" + this.border + ", shadowColor=" + this.shadowColor + ')';
        }

        private Style(g2 g2Var, long j10, long j11, float f10, C2868g gVar, C2544x0 x0Var) {
            C6496s.h(g2Var, "shape");
            C6496s.h(gVar, "border");
            this.shape = g2Var;
            this.backgroundColor = j10;
            this.contentColor = j11;
            this.elevation = f10;
            this.border = gVar;
            this.shadowColor = x0Var;
        }
    }

    private IntercomCardStyle() {
    }

    /* renamed from: conversationCardStyle-PEIptTM  reason: not valid java name */
    public final Style m590conversationCardStylePEIptTM(g2 g2Var, long j10, long j11, float f10, C2868g gVar, C1500m mVar, int i10, int i11) {
        f fVar;
        long j12;
        long j13;
        float f11;
        C2868g gVar2;
        C1500m mVar2 = mVar;
        mVar2.T(-1707188824);
        if ((i11 & 1) != 0) {
            fVar = g.c(h.j((float) 20));
        } else {
            fVar = g2Var;
        }
        if ((i11 & 2) != 0) {
            j12 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m678getBackground0d7_KjU();
        } else {
            j12 = j10;
        }
        if ((i11 & 4) != 0) {
            j13 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m700getPrimaryText0d7_KjU();
        } else {
            j13 = j11;
        }
        if ((i11 & 8) != 0) {
            f11 = h.j((float) 0);
        } else {
            f11 = f10;
        }
        if ((i11 & 16) != 0) {
            gVar2 = C2869h.a(h.j((float) 1), IntercomTheme.INSTANCE.getColors(mVar2, 6).m680getBorder0d7_KjU());
        } else {
            gVar2 = gVar;
        }
        Style style = new Style(fVar, j12, j13, f11, gVar2, (C2544x0) null, (DefaultConstructorMarker) null);
        mVar.M();
        return style;
    }

    /* renamed from: defaultStyle-qUnfpCA  reason: not valid java name */
    public final Style m591defaultStyleqUnfpCA(g2 g2Var, long j10, long j11, float f10, C2868g gVar, long j12, C1500m mVar, int i10, int i11) {
        a aVar;
        long j13;
        long j14;
        float f11;
        C2868g gVar2;
        long j15;
        C1500m mVar2 = mVar;
        mVar2.T(-952876659);
        if ((i11 & 1) != 0) {
            aVar = IntercomTheme.INSTANCE.getShapes(mVar2, 6).d();
        } else {
            aVar = g2Var;
        }
        if ((i11 & 2) != 0) {
            j13 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m678getBackground0d7_KjU();
        } else {
            j13 = j10;
        }
        if ((i11 & 4) != 0) {
            j14 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m700getPrimaryText0d7_KjU();
        } else {
            j14 = j11;
        }
        if ((i11 & 8) != 0) {
            f11 = h.j((float) 6);
        } else {
            f11 = f10;
        }
        if ((i11 & 16) != 0) {
            gVar2 = C2869h.a(h.j((float) 1), C2544x0.o(IntercomTheme.INSTANCE.getColors(mVar2, 6).m680getBorder0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
        } else {
            gVar2 = gVar;
        }
        if ((i11 & 32) != 0) {
            j15 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m702getShadow0d7_KjU();
        } else {
            j15 = j12;
        }
        Style style = new Style(aVar, j13, j14, f11, gVar2, C2544x0.k(j15), (DefaultConstructorMarker) null);
        mVar.M();
        return style;
    }
}
