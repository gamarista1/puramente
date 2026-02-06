package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/CloseButtonModel;", "", "backgroundColor", "", "backgroundOpacity", "", "foregroundColor", "<init>", "(Ljava/lang/String;FLjava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundOpacity", "()F", "getForegroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloseButtonModel {
    public static final int $stable = 0;
    @c("background_color")
    private final String backgroundColor;
    @c("background_opacity")
    private final float backgroundOpacity;
    @c("foreground_color")
    private final String foregroundColor;

    public CloseButtonModel() {
        this((String) null, 0.0f, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CloseButtonModel copy$default(CloseButtonModel closeButtonModel, String str, float f10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = closeButtonModel.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            f10 = closeButtonModel.backgroundOpacity;
        }
        if ((i10 & 4) != 0) {
            str2 = closeButtonModel.foregroundColor;
        }
        return closeButtonModel.copy(str, f10, str2);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final float component2() {
        return this.backgroundOpacity;
    }

    public final String component3() {
        return this.foregroundColor;
    }

    public final CloseButtonModel copy(String str, float f10, String str2) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "foregroundColor");
        return new CloseButtonModel(str, f10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseButtonModel)) {
            return false;
        }
        CloseButtonModel closeButtonModel = (CloseButtonModel) obj;
        return C6496s.c(this.backgroundColor, closeButtonModel.backgroundColor) && Float.compare(this.backgroundOpacity, closeButtonModel.backgroundOpacity) == 0 && C6496s.c(this.foregroundColor, closeButtonModel.foregroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public int hashCode() {
        return (((this.backgroundColor.hashCode() * 31) + Float.hashCode(this.backgroundOpacity)) * 31) + this.foregroundColor.hashCode();
    }

    public String toString() {
        return "CloseButtonModel(backgroundColor=" + this.backgroundColor + ", backgroundOpacity=" + this.backgroundOpacity + ", foregroundColor=" + this.foregroundColor + ')';
    }

    public CloseButtonModel(String str, float f10, String str2) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "foregroundColor");
        this.backgroundColor = str;
        this.backgroundOpacity = f10;
        this.foregroundColor = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CloseButtonModel(String str, float f10, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "#FFFFFF" : str, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) != 0 ? "#000000" : str2);
    }
}
