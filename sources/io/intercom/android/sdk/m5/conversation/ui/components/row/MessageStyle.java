package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.N;
import I.g;
import c1.h;
import k0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.g2;
import x.C2868g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001:\u0001)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\r¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "bubbleStyle", "Lk0/c$b;", "rowAlignment", "LC/N;", "rowPadding", "Lr0/g2;", "defaultContentShape", "<init>", "(Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;Lk0/c$b;LC/N;Lr0/g2;)V", "component4", "()Lr0/g2;", "component1", "()Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "component2", "()Lk0/c$b;", "component3", "()LC/N;", "copy", "(Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;Lk0/c$b;LC/N;Lr0/g2;)Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "getBubbleStyle", "Lk0/c$b;", "getRowAlignment", "LC/N;", "getRowPadding", "Lr0/g2;", "getContentShape", "contentShape", "BubbleStyle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class MessageStyle {
    private final BubbleStyle bubbleStyle;
    private final g2 defaultContentShape;
    private final c.b rowAlignment;
    private final N rowPadding;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0014¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "", "Lr0/x0;", "color", "LC/N;", "padding", "Lr0/g2;", "shape", "Lx/g;", "borderStroke", "<init>", "(JLC/N;Lr0/g2;Lx/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2", "()LC/N;", "component3", "()Lr0/g2;", "component4", "()Lx/g;", "copy-Iv8Zu3U", "(JLC/N;Lr0/g2;Lx/g;)Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle$BubbleStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "LC/N;", "getPadding", "Lr0/g2;", "getShape", "Lx/g;", "getBorderStroke", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BubbleStyle {
        public static final int $stable = 0;
        private final C2868g borderStroke;
        private final long color;
        private final N padding;
        private final g2 shape;

        public /* synthetic */ BubbleStyle(long j10, N n10, g2 g2Var, C2868g gVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, n10, g2Var, gVar);
        }

        /* renamed from: copy-Iv8Zu3U$default  reason: not valid java name */
        public static /* synthetic */ BubbleStyle m322copyIv8Zu3U$default(BubbleStyle bubbleStyle, long j10, N n10, g2 g2Var, C2868g gVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bubbleStyle.color;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                n10 = bubbleStyle.padding;
            }
            N n11 = n10;
            if ((i10 & 4) != 0) {
                g2Var = bubbleStyle.shape;
            }
            g2 g2Var2 = g2Var;
            if ((i10 & 8) != 0) {
                gVar = bubbleStyle.borderStroke;
            }
            return bubbleStyle.m324copyIv8Zu3U(j11, n11, g2Var2, gVar);
        }

        /* renamed from: component1-0d7_KjU  reason: not valid java name */
        public final long m323component10d7_KjU() {
            return this.color;
        }

        public final N component2() {
            return this.padding;
        }

        public final g2 component3() {
            return this.shape;
        }

        public final C2868g component4() {
            return this.borderStroke;
        }

        /* renamed from: copy-Iv8Zu3U  reason: not valid java name */
        public final BubbleStyle m324copyIv8Zu3U(long j10, N n10, g2 g2Var, C2868g gVar) {
            C6496s.h(n10, "padding");
            C6496s.h(g2Var, "shape");
            return new BubbleStyle(j10, n10, g2Var, gVar, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleStyle)) {
                return false;
            }
            BubbleStyle bubbleStyle = (BubbleStyle) obj;
            return C2544x0.q(this.color, bubbleStyle.color) && C6496s.c(this.padding, bubbleStyle.padding) && C6496s.c(this.shape, bubbleStyle.shape) && C6496s.c(this.borderStroke, bubbleStyle.borderStroke);
        }

        public final C2868g getBorderStroke() {
            return this.borderStroke;
        }

        /* renamed from: getColor-0d7_KjU  reason: not valid java name */
        public final long m325getColor0d7_KjU() {
            return this.color;
        }

        public final N getPadding() {
            return this.padding;
        }

        public final g2 getShape() {
            return this.shape;
        }

        public int hashCode() {
            int w10 = ((((C2544x0.w(this.color) * 31) + this.padding.hashCode()) * 31) + this.shape.hashCode()) * 31;
            C2868g gVar = this.borderStroke;
            return w10 + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "BubbleStyle(color=" + C2544x0.x(this.color) + ", padding=" + this.padding + ", shape=" + this.shape + ", borderStroke=" + this.borderStroke + ')';
        }

        private BubbleStyle(long j10, N n10, g2 g2Var, C2868g gVar) {
            C6496s.h(n10, "padding");
            C6496s.h(g2Var, "shape");
            this.color = j10;
            this.padding = n10;
            this.shape = g2Var;
            this.borderStroke = gVar;
        }
    }

    public MessageStyle(BubbleStyle bubbleStyle2, c.b bVar, N n10, g2 g2Var) {
        C6496s.h(bubbleStyle2, "bubbleStyle");
        C6496s.h(bVar, "rowAlignment");
        C6496s.h(n10, "rowPadding");
        C6496s.h(g2Var, "defaultContentShape");
        this.bubbleStyle = bubbleStyle2;
        this.rowAlignment = bVar;
        this.rowPadding = n10;
        this.defaultContentShape = g2Var;
    }

    private final g2 component4() {
        return this.defaultContentShape;
    }

    public static /* synthetic */ MessageStyle copy$default(MessageStyle messageStyle, BubbleStyle bubbleStyle2, c.b bVar, N n10, g2 g2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bubbleStyle2 = messageStyle.bubbleStyle;
        }
        if ((i10 & 2) != 0) {
            bVar = messageStyle.rowAlignment;
        }
        if ((i10 & 4) != 0) {
            n10 = messageStyle.rowPadding;
        }
        if ((i10 & 8) != 0) {
            g2Var = messageStyle.defaultContentShape;
        }
        return messageStyle.copy(bubbleStyle2, bVar, n10, g2Var);
    }

    public final BubbleStyle component1() {
        return this.bubbleStyle;
    }

    public final c.b component2() {
        return this.rowAlignment;
    }

    public final N component3() {
        return this.rowPadding;
    }

    public final MessageStyle copy(BubbleStyle bubbleStyle2, c.b bVar, N n10, g2 g2Var) {
        C6496s.h(bubbleStyle2, "bubbleStyle");
        C6496s.h(bVar, "rowAlignment");
        C6496s.h(n10, "rowPadding");
        C6496s.h(g2Var, "defaultContentShape");
        return new MessageStyle(bubbleStyle2, bVar, n10, g2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageStyle)) {
            return false;
        }
        MessageStyle messageStyle = (MessageStyle) obj;
        return C6496s.c(this.bubbleStyle, messageStyle.bubbleStyle) && C6496s.c(this.rowAlignment, messageStyle.rowAlignment) && C6496s.c(this.rowPadding, messageStyle.rowPadding) && C6496s.c(this.defaultContentShape, messageStyle.defaultContentShape);
    }

    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    public final g2 getContentShape() {
        return g.c(h.j((float) 8));
    }

    public final c.b getRowAlignment() {
        return this.rowAlignment;
    }

    public final N getRowPadding() {
        return this.rowPadding;
    }

    public int hashCode() {
        return (((((this.bubbleStyle.hashCode() * 31) + this.rowAlignment.hashCode()) * 31) + this.rowPadding.hashCode()) * 31) + this.defaultContentShape.hashCode();
    }

    public String toString() {
        return "MessageStyle(bubbleStyle=" + this.bubbleStyle + ", rowAlignment=" + this.rowAlignment + ", rowPadding=" + this.rowPadding + ", defaultContentShape=" + this.defaultContentShape + ')';
    }
}
