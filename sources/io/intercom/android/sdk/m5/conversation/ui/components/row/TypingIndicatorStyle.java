package io.intercom.android.sdk.m5.conversation.ui.components.row;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.g2;
import x.C2868g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "", "Lr0/g2;", "shape", "Lx/g;", "borderStroke", "Lr0/x0;", "color", "<init>", "(Lr0/g2;Lx/g;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lr0/g2;", "component2", "()Lx/g;", "component3-0d7_KjU", "()J", "component3", "copy-mxwnekA", "(Lr0/g2;Lx/g;J)Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr0/g2;", "getShape", "Lx/g;", "getBorderStroke", "J", "getColor-0d7_KjU", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TypingIndicatorStyle {
    private final C2868g borderStroke;
    private final long color;
    private final g2 shape;

    public /* synthetic */ TypingIndicatorStyle(g2 g2Var, C2868g gVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g2Var, gVar, j10);
    }

    /* renamed from: copy-mxwnekA$default  reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m328copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, g2 g2Var, C2868g gVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g2Var = typingIndicatorStyle.shape;
        }
        if ((i10 & 2) != 0) {
            gVar = typingIndicatorStyle.borderStroke;
        }
        if ((i10 & 4) != 0) {
            j10 = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m330copymxwnekA(g2Var, gVar, j10);
    }

    public final g2 component1() {
        return this.shape;
    }

    public final C2868g component2() {
        return this.borderStroke;
    }

    /* renamed from: component3-0d7_KjU  reason: not valid java name */
    public final long m329component30d7_KjU() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA  reason: not valid java name */
    public final TypingIndicatorStyle m330copymxwnekA(g2 g2Var, C2868g gVar, long j10) {
        C6496s.h(g2Var, "shape");
        return new TypingIndicatorStyle(g2Var, gVar, j10, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) obj;
        return C6496s.c(this.shape, typingIndicatorStyle.shape) && C6496s.c(this.borderStroke, typingIndicatorStyle.borderStroke) && C2544x0.q(this.color, typingIndicatorStyle.color);
    }

    public final C2868g getBorderStroke() {
        return this.borderStroke;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m331getColor0d7_KjU() {
        return this.color;
    }

    public final g2 getShape() {
        return this.shape;
    }

    public int hashCode() {
        int hashCode = this.shape.hashCode() * 31;
        C2868g gVar = this.borderStroke;
        return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + C2544x0.w(this.color);
    }

    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + C2544x0.x(this.color) + ')';
    }

    private TypingIndicatorStyle(g2 g2Var, C2868g gVar, long j10) {
        C6496s.h(g2Var, "shape");
        this.shape = g2Var;
        this.borderStroke = gVar;
        this.color = j10;
    }
}
