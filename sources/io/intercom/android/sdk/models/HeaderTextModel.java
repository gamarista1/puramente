package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/HeaderTextModel;", "", "text", "", "opacity", "", "color", "<init>", "(Ljava/lang/String;FLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getOpacity", "()F", "getColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeaderTextModel {
    public static final int $stable = 0;
    @c("text_color")
    private final String color;
    @c("opacity")
    private final float opacity;
    @c("content")
    private final String text;

    public HeaderTextModel() {
        this((String) null, 0.0f, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HeaderTextModel copy$default(HeaderTextModel headerTextModel, String str, float f10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerTextModel.text;
        }
        if ((i10 & 2) != 0) {
            f10 = headerTextModel.opacity;
        }
        if ((i10 & 4) != 0) {
            str2 = headerTextModel.color;
        }
        return headerTextModel.copy(str, f10, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final float component2() {
        return this.opacity;
    }

    public final String component3() {
        return this.color;
    }

    public final HeaderTextModel copy(String str, float f10, String str2) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(str2, "color");
        return new HeaderTextModel(str, f10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextModel)) {
            return false;
        }
        HeaderTextModel headerTextModel = (HeaderTextModel) obj;
        return C6496s.c(this.text, headerTextModel.text) && Float.compare(this.opacity, headerTextModel.opacity) == 0 && C6496s.c(this.color, headerTextModel.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Float.hashCode(this.opacity)) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "HeaderTextModel(text=" + this.text + ", opacity=" + this.opacity + ", color=" + this.color + ')';
    }

    public HeaderTextModel(String str, float f10, String str2) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(str2, "color");
        this.text = str;
        this.opacity = f10;
        this.color = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeaderTextModel(String str, float f10, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? "#000000" : str2);
    }
}
