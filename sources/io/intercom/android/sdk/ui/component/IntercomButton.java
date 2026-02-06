package io.intercom.android.sdk.ui.component;

import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import x.C2868g;
import x.C2869h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomButton;", "", "<init>", "()V", "Lr0/x0;", "backgroundColor", "contentColor", "Lx/g;", "border", "Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "primaryStyle-Klgx-Pg", "(JJLx/g;LY/m;II)Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "primaryStyle", "outlinedStyle-Klgx-Pg", "outlinedStyle", "Style", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomButton {
    public static final int $stable = 0;
    public static final IntercomButton INSTANCE = new IntercomButton();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "", "Lr0/x0;", "backgroundColor", "contentColor", "Lx/g;", "border", "<init>", "(JJLx/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3", "()Lx/g;", "copy-jxsXWHM", "(JJLx/g;)Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBackgroundColor-0d7_KjU", "getContentColor-0d7_KjU", "Lx/g;", "getBorder", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final C2868g border;
        private final long contentColor;

        public /* synthetic */ Style(long j10, long j11, C2868g gVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, gVar);
        }

        /* renamed from: copy-jxsXWHM$default  reason: not valid java name */
        public static /* synthetic */ Style m584copyjxsXWHM$default(Style style, long j10, long j11, C2868g gVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = style.backgroundColor;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                j11 = style.contentColor;
            }
            long j13 = j11;
            if ((i10 & 4) != 0) {
                gVar = style.border;
            }
            return style.m587copyjxsXWHM(j12, j13, gVar);
        }

        /* renamed from: component1-0d7_KjU  reason: not valid java name */
        public final long m585component10d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: component2-0d7_KjU  reason: not valid java name */
        public final long m586component20d7_KjU() {
            return this.contentColor;
        }

        public final C2868g component3() {
            return this.border;
        }

        /* renamed from: copy-jxsXWHM  reason: not valid java name */
        public final Style m587copyjxsXWHM(long j10, long j11, C2868g gVar) {
            C6496s.h(gVar, "border");
            return new Style(j10, j11, gVar, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return C2544x0.q(this.backgroundColor, style.backgroundColor) && C2544x0.q(this.contentColor, style.contentColor) && C6496s.c(this.border, style.border);
        }

        /* renamed from: getBackgroundColor-0d7_KjU  reason: not valid java name */
        public final long m588getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        public final C2868g getBorder() {
            return this.border;
        }

        /* renamed from: getContentColor-0d7_KjU  reason: not valid java name */
        public final long m589getContentColor0d7_KjU() {
            return this.contentColor;
        }

        public int hashCode() {
            return (((C2544x0.w(this.backgroundColor) * 31) + C2544x0.w(this.contentColor)) * 31) + this.border.hashCode();
        }

        public String toString() {
            return "Style(backgroundColor=" + C2544x0.x(this.backgroundColor) + ", contentColor=" + C2544x0.x(this.contentColor) + ", border=" + this.border + ')';
        }

        private Style(long j10, long j11, C2868g gVar) {
            C6496s.h(gVar, "border");
            this.backgroundColor = j10;
            this.contentColor = j11;
            this.border = gVar;
        }
    }

    private IntercomButton() {
    }

    /* renamed from: outlinedStyle-Klgx-Pg  reason: not valid java name */
    public final Style m582outlinedStyleKlgxPg(long j10, long j11, C2868g gVar, C1500m mVar, int i10, int i11) {
        long j12;
        long j13;
        C2868g gVar2;
        C1500m mVar2 = mVar;
        mVar2.T(-1228695891);
        if ((i11 & 1) != 0) {
            j12 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m678getBackground0d7_KjU();
        } else {
            j12 = j10;
        }
        if ((i11 & 2) != 0) {
            j13 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m700getPrimaryText0d7_KjU();
        } else {
            j13 = j11;
        }
        if ((i11 & 4) != 0) {
            gVar2 = C2869h.a(h.j((float) 1), IntercomTheme.INSTANCE.getColors(mVar2, 6).m680getBorder0d7_KjU());
        } else {
            gVar2 = gVar;
        }
        Style style = new Style(j12, j13, gVar2, (DefaultConstructorMarker) null);
        mVar.M();
        return style;
    }

    /* renamed from: primaryStyle-Klgx-Pg  reason: not valid java name */
    public final Style m583primaryStyleKlgxPg(long j10, long j11, C2868g gVar, C1500m mVar, int i10, int i11) {
        long j12;
        long j13;
        C2868g gVar2;
        C1500m mVar2 = mVar;
        mVar2.T(-155594647);
        if ((i11 & 1) != 0) {
            j12 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m678getBackground0d7_KjU();
        } else {
            j12 = j10;
        }
        if ((i11 & 2) != 0) {
            j13 = IntercomTheme.INSTANCE.getColors(mVar2, 6).m700getPrimaryText0d7_KjU();
        } else {
            j13 = j11;
        }
        if ((i11 & 4) != 0) {
            gVar2 = C2869h.a(h.j((float) 1), IntercomTheme.INSTANCE.getColors(mVar2, 6).m680getBorder0d7_KjU());
        } else {
            gVar2 = gVar;
        }
        Style style = new Style(j12, j13, gVar2, (DefaultConstructorMarker) null);
        mVar.M();
        return style;
    }
}
