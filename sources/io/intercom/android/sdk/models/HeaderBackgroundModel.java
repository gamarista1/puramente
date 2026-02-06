package io.intercom.android.sdk.models;

import Oc.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÇ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "", "color", "", "gradient", "", "imageUrl", "fade", "", "type", "Lio/intercom/android/sdk/models/HeaderBackdropType;", "enabled", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLio/intercom/android/sdk/models/HeaderBackdropType;Z)V", "getColor", "()Ljava/lang/String;", "getGradient", "()Ljava/util/List;", "getImageUrl", "getFade", "()Z", "getType", "()Lio/intercom/android/sdk/models/HeaderBackdropType;", "getEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeaderBackgroundModel {
    public static final int $stable = 8;
    @c("color")
    private final String color;
    @c("enabled")
    private final boolean enabled;
    @c("fade_to_white")
    private final boolean fade;
    @c("gradient")
    private final List<String> gradient;
    @c("image_url")
    private final String imageUrl;
    @c("type")
    private final HeaderBackdropType type;

    public HeaderBackgroundModel() {
        this((String) null, (List) null, (String) null, false, (HeaderBackdropType) null, false, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HeaderBackgroundModel copy$default(HeaderBackgroundModel headerBackgroundModel, String str, List<String> list, String str2, boolean z10, HeaderBackdropType headerBackdropType, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerBackgroundModel.color;
        }
        if ((i10 & 2) != 0) {
            list = headerBackgroundModel.gradient;
        }
        List<String> list2 = list;
        if ((i10 & 4) != 0) {
            str2 = headerBackgroundModel.imageUrl;
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z10 = headerBackgroundModel.fade;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            headerBackdropType = headerBackgroundModel.type;
        }
        HeaderBackdropType headerBackdropType2 = headerBackdropType;
        if ((i10 & 32) != 0) {
            z11 = headerBackgroundModel.enabled;
        }
        return headerBackgroundModel.copy(str, list2, str3, z12, headerBackdropType2, z11);
    }

    public final String component1() {
        return this.color;
    }

    public final List<String> component2() {
        return this.gradient;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final boolean component4() {
        return this.fade;
    }

    public final HeaderBackdropType component5() {
        return this.type;
    }

    public final boolean component6() {
        return this.enabled;
    }

    public final HeaderBackgroundModel copy(String str, List<String> list, String str2, boolean z10, HeaderBackdropType headerBackdropType, boolean z11) {
        C6496s.h(str, "color");
        C6496s.h(headerBackdropType, "type");
        return new HeaderBackgroundModel(str, list, str2, z10, headerBackdropType, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBackgroundModel)) {
            return false;
        }
        HeaderBackgroundModel headerBackgroundModel = (HeaderBackgroundModel) obj;
        return C6496s.c(this.color, headerBackgroundModel.color) && C6496s.c(this.gradient, headerBackgroundModel.gradient) && C6496s.c(this.imageUrl, headerBackgroundModel.imageUrl) && this.fade == headerBackgroundModel.fade && this.type == headerBackgroundModel.type && this.enabled == headerBackgroundModel.enabled;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFade() {
        return this.fade;
    }

    public final List<String> getGradient() {
        return this.gradient;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final HeaderBackdropType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        List<String> list = this.gradient;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.imageUrl;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((((hashCode2 + i10) * 31) + Boolean.hashCode(this.fade)) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "HeaderBackgroundModel(color=" + this.color + ", gradient=" + this.gradient + ", imageUrl=" + this.imageUrl + ", fade=" + this.fade + ", type=" + this.type + ", enabled=" + this.enabled + ')';
    }

    public HeaderBackgroundModel(String str, List<String> list, String str2, boolean z10, HeaderBackdropType headerBackdropType, boolean z11) {
        C6496s.h(str, "color");
        C6496s.h(headerBackdropType, "type");
        this.color = str;
        this.gradient = list;
        this.imageUrl = str2;
        this.fade = z10;
        this.type = headerBackdropType;
        this.enabled = z11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HeaderBackgroundModel(java.lang.String r5, java.util.List r6, java.lang.String r7, boolean r8, io.intercom.android.sdk.models.HeaderBackdropType r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = "#FFFFFF"
        L_0x0006:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000d
            r12 = r0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = r7
        L_0x0014:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0019
            r8 = 1
        L_0x0019:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0020
            io.intercom.android.sdk.models.HeaderBackdropType r9 = io.intercom.android.sdk.models.HeaderBackdropType.SOLID
        L_0x0020:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0026
            r10 = 0
        L_0x0026:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.HeaderBackgroundModel.<init>(java.lang.String, java.util.List, java.lang.String, boolean, io.intercom.android.sdk.models.HeaderBackdropType, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
