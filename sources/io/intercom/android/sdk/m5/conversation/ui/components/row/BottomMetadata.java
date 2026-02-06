package io.intercom.android.sdk.m5.conversation.ui.components.row;

import c1.h;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;", "", "", "text", "Lc1/h;", "padding", "", "alwaysShow", "<init>", "(Ljava/lang/String;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-D9Ej5fM", "()F", "component2", "component3", "()Z", "copy-lG28NQ4", "(Ljava/lang/String;FZ)Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;", "copy", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "F", "getPadding-D9Ej5fM", "Z", "getAlwaysShow", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomMetadata {
    public static final int $stable = 0;
    private final boolean alwaysShow;
    private final float padding;
    private final String text;

    public /* synthetic */ BottomMetadata(String str, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, z10);
    }

    /* renamed from: copy-lG28NQ4$default  reason: not valid java name */
    public static /* synthetic */ BottomMetadata m276copylG28NQ4$default(BottomMetadata bottomMetadata, String str, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bottomMetadata.text;
        }
        if ((i10 & 2) != 0) {
            f10 = bottomMetadata.padding;
        }
        if ((i10 & 4) != 0) {
            z10 = bottomMetadata.alwaysShow;
        }
        return bottomMetadata.m278copylG28NQ4(str, f10, z10);
    }

    public final String component1() {
        return this.text;
    }

    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public final float m277component2D9Ej5fM() {
        return this.padding;
    }

    public final boolean component3() {
        return this.alwaysShow;
    }

    /* renamed from: copy-lG28NQ4  reason: not valid java name */
    public final BottomMetadata m278copylG28NQ4(String str, float f10, boolean z10) {
        C6496s.h(str, AttributeType.TEXT);
        return new BottomMetadata(str, f10, z10, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomMetadata)) {
            return false;
        }
        BottomMetadata bottomMetadata = (BottomMetadata) obj;
        return C6496s.c(this.text, bottomMetadata.text) && h.m(this.padding, bottomMetadata.padding) && this.alwaysShow == bottomMetadata.alwaysShow;
    }

    public final boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    /* renamed from: getPadding-D9Ej5fM  reason: not valid java name */
    public final float m279getPaddingD9Ej5fM() {
        return this.padding;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + h.o(this.padding)) * 31) + Boolean.hashCode(this.alwaysShow);
    }

    public String toString() {
        return "BottomMetadata(text=" + this.text + ", padding=" + h.p(this.padding) + ", alwaysShow=" + this.alwaysShow + ')';
    }

    private BottomMetadata(String str, float f10, boolean z10) {
        C6496s.h(str, AttributeType.TEXT);
        this.text = str;
        this.padding = f10;
        this.alwaysShow = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomMetadata(String str, float f10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? h.j((float) 4) : f10, (i10 & 4) != 0 ? false : z10, (DefaultConstructorMarker) null);
    }
}
