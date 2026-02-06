package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/CustomizationColorsModel;", "", "backgroundColor", "", "foregroundColor", "foregroundLowContrastColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundColor", "getForegroundLowContrastColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomizationColorsModel {
    public static final int $stable = 0;
    @c("background_color")
    private final String backgroundColor;
    @c("foreground_color")
    private final String foregroundColor;
    @c("foreground_color_low_contrast")
    private final String foregroundLowContrastColor;

    public CustomizationColorsModel() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CustomizationColorsModel copy$default(CustomizationColorsModel customizationColorsModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customizationColorsModel.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = customizationColorsModel.foregroundColor;
        }
        if ((i10 & 4) != 0) {
            str3 = customizationColorsModel.foregroundLowContrastColor;
        }
        return customizationColorsModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.foregroundColor;
    }

    public final String component3() {
        return this.foregroundLowContrastColor;
    }

    public final CustomizationColorsModel copy(String str, String str2, String str3) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "foregroundColor");
        C6496s.h(str3, "foregroundLowContrastColor");
        return new CustomizationColorsModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationColorsModel)) {
            return false;
        }
        CustomizationColorsModel customizationColorsModel = (CustomizationColorsModel) obj;
        return C6496s.c(this.backgroundColor, customizationColorsModel.backgroundColor) && C6496s.c(this.foregroundColor, customizationColorsModel.foregroundColor) && C6496s.c(this.foregroundLowContrastColor, customizationColorsModel.foregroundLowContrastColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getForegroundLowContrastColor() {
        return this.foregroundLowContrastColor;
    }

    public int hashCode() {
        return (((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31) + this.foregroundLowContrastColor.hashCode();
    }

    public String toString() {
        return "CustomizationColorsModel(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", foregroundLowContrastColor=" + this.foregroundLowContrastColor + ')';
    }

    public CustomizationColorsModel(String str, String str2, String str3) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "foregroundColor");
        C6496s.h(str3, "foregroundLowContrastColor");
        this.backgroundColor = str;
        this.foregroundColor = str2;
        this.foregroundLowContrastColor = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CustomizationColorsModel(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = "#FFFFFF"
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.lang.String r2 = "#000000"
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0011
            r3 = r2
        L_0x0011:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.CustomizationColorsModel.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
