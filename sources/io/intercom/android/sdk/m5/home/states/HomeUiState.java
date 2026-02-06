package io.intercom.android.sdk.m5.home.states;

import com.BV.LinearGradient.LinearGradientManager;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "", "<init>", "()V", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "Loading", "Content", "Error", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HomeUiState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001)BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020&H×\u0001J\t\u0010'\u001a\u00020(H×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "cards", "", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "adminsAvatars", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "botAvatar", "teammateAccessEnabled", "", "header", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;ZLio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getCards", "()Ljava/util/List;", "getAdminsAvatars", "getBotAvatar", "()Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getTeammateAccessEnabled", "()Z", "getHeader", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ContentHeader", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends HomeUiState {
        public static final int $stable = 8;
        private final List<AvatarWrapper> adminsAvatars;
        private final AvatarWrapper botAvatar;
        private final List<HomeCards> cards;
        private final ContentHeader header;
        private final PoweredBy poweredBy;
        private final boolean teammateAccessEnabled;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0003/01BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Ja\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010,\u001a\u00020-H×\u0001J\t\u0010.\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "", "showLogo", "", "logoUrl", "", "greeting", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;", "intro", "headerBackdropStyle", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "showAvatars", "adminsAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "closeButtonColor", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;", "<init>", "(ZLjava/lang/String;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;ZLjava/util/List;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;)V", "getShowLogo", "()Z", "getLogoUrl", "()Ljava/lang/String;", "getGreeting", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;", "getIntro", "getHeaderBackdropStyle", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "getShowAvatars", "getAdminsAvatars", "()Ljava/util/List;", "getCloseButtonColor", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "CloseButtonColor", "ColoredText", "HeaderBackdropStyle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ContentHeader {
            public static final int $stable = 8;
            private final List<AvatarWrapper> adminsAvatars;
            private final CloseButtonColor closeButtonColor;
            private final ColoredText greeting;
            private final HeaderBackdropStyle headerBackdropStyle;
            private final ColoredText intro;
            private final String logoUrl;
            private final boolean showAvatars;
            private final boolean showLogo;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;", "", "backgroundColor", "", "foregroundColor", "backgroundOpacity", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundColor", "getBackgroundOpacity", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class CloseButtonColor {
                public static final int $stable = 0;
                private final String backgroundColor;
                private final float backgroundOpacity;
                private final String foregroundColor;

                public CloseButtonColor(String str, String str2, float f10) {
                    C6496s.h(str, "backgroundColor");
                    C6496s.h(str2, "foregroundColor");
                    this.backgroundColor = str;
                    this.foregroundColor = str2;
                    this.backgroundOpacity = f10;
                }

                public static /* synthetic */ CloseButtonColor copy$default(CloseButtonColor closeButtonColor, String str, String str2, float f10, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = closeButtonColor.backgroundColor;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = closeButtonColor.foregroundColor;
                    }
                    if ((i10 & 4) != 0) {
                        f10 = closeButtonColor.backgroundOpacity;
                    }
                    return closeButtonColor.copy(str, str2, f10);
                }

                public final String component1() {
                    return this.backgroundColor;
                }

                public final String component2() {
                    return this.foregroundColor;
                }

                public final float component3() {
                    return this.backgroundOpacity;
                }

                public final CloseButtonColor copy(String str, String str2, float f10) {
                    C6496s.h(str, "backgroundColor");
                    C6496s.h(str2, "foregroundColor");
                    return new CloseButtonColor(str, str2, f10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CloseButtonColor)) {
                        return false;
                    }
                    CloseButtonColor closeButtonColor = (CloseButtonColor) obj;
                    return C6496s.c(this.backgroundColor, closeButtonColor.backgroundColor) && C6496s.c(this.foregroundColor, closeButtonColor.foregroundColor) && Float.compare(this.backgroundOpacity, closeButtonColor.backgroundOpacity) == 0;
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
                    return (((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31) + Float.hashCode(this.backgroundOpacity);
                }

                public String toString() {
                    return "CloseButtonColor(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", backgroundOpacity=" + this.backgroundOpacity + ')';
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;", "", "text", "", "color", "opacity", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getText", "()Ljava/lang/String;", "getColor", "getOpacity", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ColoredText {
                public static final int $stable = 0;
                private final String color;
                private final float opacity;
                private final String text;

                public ColoredText(String str, String str2, float f10) {
                    C6496s.h(str, AttributeType.TEXT);
                    C6496s.h(str2, "color");
                    this.text = str;
                    this.color = str2;
                    this.opacity = f10;
                }

                public static /* synthetic */ ColoredText copy$default(ColoredText coloredText, String str, String str2, float f10, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = coloredText.text;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = coloredText.color;
                    }
                    if ((i10 & 4) != 0) {
                        f10 = coloredText.opacity;
                    }
                    return coloredText.copy(str, str2, f10);
                }

                public final String component1() {
                    return this.text;
                }

                public final String component2() {
                    return this.color;
                }

                public final float component3() {
                    return this.opacity;
                }

                public final ColoredText copy(String str, String str2, float f10) {
                    C6496s.h(str, AttributeType.TEXT);
                    C6496s.h(str2, "color");
                    return new ColoredText(str, str2, f10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ColoredText)) {
                        return false;
                    }
                    ColoredText coloredText = (ColoredText) obj;
                    return C6496s.c(this.text, coloredText.text) && C6496s.c(this.color, coloredText.color) && Float.compare(this.opacity, coloredText.opacity) == 0;
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
                    return (((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + Float.hashCode(this.opacity);
                }

                public String toString() {
                    return "ColoredText(text=" + this.text + ", color=" + this.color + ", opacity=" + this.opacity + ')';
                }
            }

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "", "<init>", "()V", "fade", "", "getFade", "()Z", "Solid", "Gradient", "Image", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Gradient;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class HeaderBackdropStyle {
                public static final int $stable = 0;

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Gradient;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "", "Lr0/x0;", "colors", "", "fade", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Gradient;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getColors", "Z", "getFade", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Gradient extends HeaderBackdropStyle {
                    public static final int $stable = 8;
                    private final List<C2544x0> colors;
                    private final boolean fade;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public Gradient(List<C2544x0> list, boolean z10) {
                        super((DefaultConstructorMarker) null);
                        C6496s.h(list, LinearGradientManager.PROP_COLORS);
                        this.colors = list;
                        this.fade = z10;
                    }

                    public static /* synthetic */ Gradient copy$default(Gradient gradient, List<C2544x0> list, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            list = gradient.colors;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = gradient.fade;
                        }
                        return gradient.copy(list, z10);
                    }

                    public final List<C2544x0> component1() {
                        return this.colors;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    public final Gradient copy(List<C2544x0> list, boolean z10) {
                        C6496s.h(list, LinearGradientManager.PROP_COLORS);
                        return new Gradient(list, z10);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Gradient)) {
                            return false;
                        }
                        Gradient gradient = (Gradient) obj;
                        return C6496s.c(this.colors, gradient.colors) && this.fade == gradient.fade;
                    }

                    public final List<C2544x0> getColors() {
                        return this.colors;
                    }

                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        return (this.colors.hashCode() * 31) + Boolean.hashCode(this.fade);
                    }

                    public String toString() {
                        return "Gradient(colors=" + this.colors + ", fade=" + this.fade + ')';
                    }
                }

                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "Lr0/x0;", "fallbackColor", "", "imageUrl", "", "fade", "<init>", "(JLjava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy-ek8zF_U", "(JLjava/lang/String;Z)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image;", "copy", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getFallbackColor-0d7_KjU", "Ljava/lang/String;", "getImageUrl", "Z", "getFade", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Image extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final boolean fade;
                    private final long fallbackColor;
                    private final String imageUrl;

                    public /* synthetic */ Image(long j10, String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j10, str, z10);
                    }

                    /* renamed from: copy-ek8zF_U$default  reason: not valid java name */
                    public static /* synthetic */ Image m361copyek8zF_U$default(Image image, long j10, String str, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            j10 = image.fallbackColor;
                        }
                        if ((i10 & 2) != 0) {
                            str = image.imageUrl;
                        }
                        if ((i10 & 4) != 0) {
                            z10 = image.fade;
                        }
                        return image.m363copyek8zF_U(j10, str, z10);
                    }

                    /* renamed from: component1-0d7_KjU  reason: not valid java name */
                    public final long m362component10d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String component2() {
                        return this.imageUrl;
                    }

                    public final boolean component3() {
                        return this.fade;
                    }

                    /* renamed from: copy-ek8zF_U  reason: not valid java name */
                    public final Image m363copyek8zF_U(long j10, String str, boolean z10) {
                        return new Image(j10, str, z10, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Image)) {
                            return false;
                        }
                        Image image = (Image) obj;
                        return C2544x0.q(this.fallbackColor, image.fallbackColor) && C6496s.c(this.imageUrl, image.imageUrl) && this.fade == image.fade;
                    }

                    public boolean getFade() {
                        return this.fade;
                    }

                    /* renamed from: getFallbackColor-0d7_KjU  reason: not valid java name */
                    public final long m364getFallbackColor0d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String getImageUrl() {
                        return this.imageUrl;
                    }

                    public int hashCode() {
                        int w10 = C2544x0.w(this.fallbackColor) * 31;
                        String str = this.imageUrl;
                        return ((w10 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.fade);
                    }

                    public String toString() {
                        return "Image(fallbackColor=" + C2544x0.x(this.fallbackColor) + ", imageUrl=" + this.imageUrl + ", fade=" + this.fade + ')';
                    }

                    private Image(long j10, String str, boolean z10) {
                        super((DefaultConstructorMarker) null);
                        this.fallbackColor = j10;
                        this.imageUrl = str;
                        this.fade = z10;
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "Lr0/x0;", "color", "", "fade", "<init>", "(JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2", "()Z", "copy-DxMtmZc", "(JZ)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "Z", "getFade", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Solid extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final long color;
                    private final boolean fade;

                    public /* synthetic */ Solid(long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j10, z10);
                    }

                    /* renamed from: copy-DxMtmZc$default  reason: not valid java name */
                    public static /* synthetic */ Solid m365copyDxMtmZc$default(Solid solid, long j10, boolean z10, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            j10 = solid.color;
                        }
                        if ((i10 & 2) != 0) {
                            z10 = solid.fade;
                        }
                        return solid.m367copyDxMtmZc(j10, z10);
                    }

                    /* renamed from: component1-0d7_KjU  reason: not valid java name */
                    public final long m366component10d7_KjU() {
                        return this.color;
                    }

                    public final boolean component2() {
                        return this.fade;
                    }

                    /* renamed from: copy-DxMtmZc  reason: not valid java name */
                    public final Solid m367copyDxMtmZc(long j10, boolean z10) {
                        return new Solid(j10, z10, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Solid)) {
                            return false;
                        }
                        Solid solid = (Solid) obj;
                        return C2544x0.q(this.color, solid.color) && this.fade == solid.fade;
                    }

                    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
                    public final long m368getColor0d7_KjU() {
                        return this.color;
                    }

                    public boolean getFade() {
                        return this.fade;
                    }

                    public int hashCode() {
                        return (C2544x0.w(this.color) * 31) + Boolean.hashCode(this.fade);
                    }

                    public String toString() {
                        return "Solid(color=" + C2544x0.x(this.color) + ", fade=" + this.fade + ')';
                    }

                    private Solid(long j10, boolean z10) {
                        super((DefaultConstructorMarker) null);
                        this.color = j10;
                        this.fade = z10;
                    }
                }

                public /* synthetic */ HeaderBackdropStyle(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract boolean getFade();

                private HeaderBackdropStyle() {
                }
            }

            public ContentHeader(boolean z10, String str, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List<AvatarWrapper> list, CloseButtonColor closeButtonColor2) {
                C6496s.h(coloredText, "greeting");
                C6496s.h(coloredText2, "intro");
                C6496s.h(headerBackdropStyle2, "headerBackdropStyle");
                C6496s.h(list, "adminsAvatars");
                C6496s.h(closeButtonColor2, "closeButtonColor");
                this.showLogo = z10;
                this.logoUrl = str;
                this.greeting = coloredText;
                this.intro = coloredText2;
                this.headerBackdropStyle = headerBackdropStyle2;
                this.showAvatars = z11;
                this.adminsAvatars = list;
                this.closeButtonColor = closeButtonColor2;
            }

            public static /* synthetic */ ContentHeader copy$default(ContentHeader contentHeader, boolean z10, String str, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List list, CloseButtonColor closeButtonColor2, int i10, Object obj) {
                ContentHeader contentHeader2 = contentHeader;
                int i11 = i10;
                return contentHeader.copy((i11 & 1) != 0 ? contentHeader2.showLogo : z10, (i11 & 2) != 0 ? contentHeader2.logoUrl : str, (i11 & 4) != 0 ? contentHeader2.greeting : coloredText, (i11 & 8) != 0 ? contentHeader2.intro : coloredText2, (i11 & 16) != 0 ? contentHeader2.headerBackdropStyle : headerBackdropStyle2, (i11 & 32) != 0 ? contentHeader2.showAvatars : z11, (i11 & 64) != 0 ? contentHeader2.adminsAvatars : list, (i11 & 128) != 0 ? contentHeader2.closeButtonColor : closeButtonColor2);
            }

            public final boolean component1() {
                return this.showLogo;
            }

            public final String component2() {
                return this.logoUrl;
            }

            public final ColoredText component3() {
                return this.greeting;
            }

            public final ColoredText component4() {
                return this.intro;
            }

            public final HeaderBackdropStyle component5() {
                return this.headerBackdropStyle;
            }

            public final boolean component6() {
                return this.showAvatars;
            }

            public final List<AvatarWrapper> component7() {
                return this.adminsAvatars;
            }

            public final CloseButtonColor component8() {
                return this.closeButtonColor;
            }

            public final ContentHeader copy(boolean z10, String str, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle2, boolean z11, List<AvatarWrapper> list, CloseButtonColor closeButtonColor2) {
                C6496s.h(coloredText, "greeting");
                C6496s.h(coloredText2, "intro");
                C6496s.h(headerBackdropStyle2, "headerBackdropStyle");
                List<AvatarWrapper> list2 = list;
                C6496s.h(list2, "adminsAvatars");
                CloseButtonColor closeButtonColor3 = closeButtonColor2;
                C6496s.h(closeButtonColor3, "closeButtonColor");
                return new ContentHeader(z10, str, coloredText, coloredText2, headerBackdropStyle2, z11, list2, closeButtonColor3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentHeader)) {
                    return false;
                }
                ContentHeader contentHeader = (ContentHeader) obj;
                return this.showLogo == contentHeader.showLogo && C6496s.c(this.logoUrl, contentHeader.logoUrl) && C6496s.c(this.greeting, contentHeader.greeting) && C6496s.c(this.intro, contentHeader.intro) && C6496s.c(this.headerBackdropStyle, contentHeader.headerBackdropStyle) && this.showAvatars == contentHeader.showAvatars && C6496s.c(this.adminsAvatars, contentHeader.adminsAvatars) && C6496s.c(this.closeButtonColor, contentHeader.closeButtonColor);
            }

            public final List<AvatarWrapper> getAdminsAvatars() {
                return this.adminsAvatars;
            }

            public final CloseButtonColor getCloseButtonColor() {
                return this.closeButtonColor;
            }

            public final ColoredText getGreeting() {
                return this.greeting;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyle() {
                return this.headerBackdropStyle;
            }

            public final ColoredText getIntro() {
                return this.intro;
            }

            public final String getLogoUrl() {
                return this.logoUrl;
            }

            public final boolean getShowAvatars() {
                return this.showAvatars;
            }

            public final boolean getShowLogo() {
                return this.showLogo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.showLogo) * 31;
                String str = this.logoUrl;
                return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.greeting.hashCode()) * 31) + this.intro.hashCode()) * 31) + this.headerBackdropStyle.hashCode()) * 31) + Boolean.hashCode(this.showAvatars)) * 31) + this.adminsAvatars.hashCode()) * 31) + this.closeButtonColor.hashCode();
            }

            public String toString() {
                return "ContentHeader(showLogo=" + this.showLogo + ", logoUrl=" + this.logoUrl + ", greeting=" + this.greeting + ", intro=" + this.intro + ", headerBackdropStyle=" + this.headerBackdropStyle + ", showAvatars=" + this.showAvatars + ", adminsAvatars=" + this.adminsAvatars + ", closeButtonColor=" + this.closeButtonColor + ')';
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Content(PoweredBy poweredBy2, List<? extends HomeCards> list, List<AvatarWrapper> list2, AvatarWrapper avatarWrapper, boolean z10, ContentHeader contentHeader) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "cards");
            C6496s.h(list2, "adminsAvatars");
            C6496s.h(contentHeader, "header");
            this.poweredBy = poweredBy2;
            this.cards = list;
            this.adminsAvatars = list2;
            this.botAvatar = avatarWrapper;
            this.teammateAccessEnabled = z10;
            this.header = contentHeader;
        }

        public static /* synthetic */ Content copy$default(Content content, PoweredBy poweredBy2, List<HomeCards> list, List<AvatarWrapper> list2, AvatarWrapper avatarWrapper, boolean z10, ContentHeader contentHeader, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy2 = content.poweredBy;
            }
            if ((i10 & 2) != 0) {
                list = content.cards;
            }
            List<HomeCards> list3 = list;
            if ((i10 & 4) != 0) {
                list2 = content.adminsAvatars;
            }
            List<AvatarWrapper> list4 = list2;
            if ((i10 & 8) != 0) {
                avatarWrapper = content.botAvatar;
            }
            AvatarWrapper avatarWrapper2 = avatarWrapper;
            if ((i10 & 16) != 0) {
                z10 = content.teammateAccessEnabled;
            }
            boolean z11 = z10;
            if ((i10 & 32) != 0) {
                contentHeader = content.header;
            }
            return content.copy(poweredBy2, list3, list4, avatarWrapper2, z11, contentHeader);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final List<HomeCards> component2() {
            return this.cards;
        }

        public final List<AvatarWrapper> component3() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper component4() {
            return this.botAvatar;
        }

        public final boolean component5() {
            return this.teammateAccessEnabled;
        }

        public final ContentHeader component6() {
            return this.header;
        }

        public final Content copy(PoweredBy poweredBy2, List<? extends HomeCards> list, List<AvatarWrapper> list2, AvatarWrapper avatarWrapper, boolean z10, ContentHeader contentHeader) {
            C6496s.h(list, "cards");
            C6496s.h(list2, "adminsAvatars");
            C6496s.h(contentHeader, "header");
            return new Content(poweredBy2, list, list2, avatarWrapper, z10, contentHeader);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C6496s.c(this.poweredBy, content.poweredBy) && C6496s.c(this.cards, content.cards) && C6496s.c(this.adminsAvatars, content.adminsAvatars) && C6496s.c(this.botAvatar, content.botAvatar) && this.teammateAccessEnabled == content.teammateAccessEnabled && C6496s.c(this.header, content.header);
        }

        public final List<AvatarWrapper> getAdminsAvatars() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper getBotAvatar() {
            return this.botAvatar;
        }

        public final List<HomeCards> getCards() {
            return this.cards;
        }

        public final ContentHeader getHeader() {
            return this.header;
        }

        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final boolean getTeammateAccessEnabled() {
            return this.teammateAccessEnabled;
        }

        public int hashCode() {
            PoweredBy poweredBy2 = this.poweredBy;
            int i10 = 0;
            int hashCode = (((((poweredBy2 == null ? 0 : poweredBy2.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.adminsAvatars.hashCode()) * 31;
            AvatarWrapper avatarWrapper = this.botAvatar;
            if (avatarWrapper != null) {
                i10 = avatarWrapper.hashCode();
            }
            return ((((hashCode + i10) * 31) + Boolean.hashCode(this.teammateAccessEnabled)) * 31) + this.header.hashCode();
        }

        public String toString() {
            return "Content(poweredBy=" + this.poweredBy + ", cards=" + this.cards + ", adminsAvatars=" + this.adminsAvatars + ", botAvatar=" + this.botAvatar + ", teammateAccessEnabled=" + this.teammateAccessEnabled + ", header=" + this.header + ')';
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "header", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;Lio/intercom/android/sdk/m5/components/ErrorState;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "getHeader", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ErrorHeader", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends HomeUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final ErrorHeader header;
        private final PoweredBy poweredBy;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "", "backgroundColor", "", "foregroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ErrorHeader {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final String foregroundColor;

            public ErrorHeader(String str, String str2) {
                C6496s.h(str, "backgroundColor");
                C6496s.h(str2, "foregroundColor");
                this.backgroundColor = str;
                this.foregroundColor = str2;
            }

            public static /* synthetic */ ErrorHeader copy$default(ErrorHeader errorHeader, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = errorHeader.backgroundColor;
                }
                if ((i10 & 2) != 0) {
                    str2 = errorHeader.foregroundColor;
                }
                return errorHeader.copy(str, str2);
            }

            public final String component1() {
                return this.backgroundColor;
            }

            public final String component2() {
                return this.foregroundColor;
            }

            public final ErrorHeader copy(String str, String str2) {
                C6496s.h(str, "backgroundColor");
                C6496s.h(str2, "foregroundColor");
                return new ErrorHeader(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorHeader)) {
                    return false;
                }
                ErrorHeader errorHeader = (ErrorHeader) obj;
                return C6496s.c(this.backgroundColor, errorHeader.backgroundColor) && C6496s.c(this.foregroundColor, errorHeader.foregroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getForegroundColor() {
                return this.foregroundColor;
            }

            public int hashCode() {
                return (this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode();
            }

            public String toString() {
                return "ErrorHeader(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ')';
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(PoweredBy poweredBy2, ErrorState errorState2, ErrorHeader errorHeader) {
            super((DefaultConstructorMarker) null);
            C6496s.h(errorState2, "errorState");
            C6496s.h(errorHeader, "header");
            this.poweredBy = poweredBy2;
            this.errorState = errorState2;
            this.header = errorHeader;
        }

        public static /* synthetic */ Error copy$default(Error error, PoweredBy poweredBy2, ErrorState errorState2, ErrorHeader errorHeader, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy2 = error.poweredBy;
            }
            if ((i10 & 2) != 0) {
                errorState2 = error.errorState;
            }
            if ((i10 & 4) != 0) {
                errorHeader = error.header;
            }
            return error.copy(poweredBy2, errorState2, errorHeader);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final ErrorState component2() {
            return this.errorState;
        }

        public final ErrorHeader component3() {
            return this.header;
        }

        public final Error copy(PoweredBy poweredBy2, ErrorState errorState2, ErrorHeader errorHeader) {
            C6496s.h(errorState2, "errorState");
            C6496s.h(errorHeader, "header");
            return new Error(poweredBy2, errorState2, errorHeader);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C6496s.c(this.poweredBy, error.poweredBy) && C6496s.c(this.errorState, error.errorState) && C6496s.c(this.header, error.header);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final ErrorHeader getHeader() {
            return this.header;
        }

        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy2 = this.poweredBy;
            return ((((poweredBy2 == null ? 0 : poweredBy2.hashCode()) * 31) + this.errorState.hashCode()) * 31) + this.header.hashCode();
        }

        public String toString() {
            return "Error(poweredBy=" + this.poweredBy + ", errorState=" + this.errorState + ", header=" + this.header + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Loading;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends HomeUiState {
        public static final int $stable = 0;
        private final PoweredBy poweredBy;

        public Loading(PoweredBy poweredBy2) {
            super((DefaultConstructorMarker) null);
            this.poweredBy = poweredBy2;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, PoweredBy poweredBy2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                poweredBy2 = loading.poweredBy;
            }
            return loading.copy(poweredBy2);
        }

        public final PoweredBy component1() {
            return this.poweredBy;
        }

        public final Loading copy(PoweredBy poweredBy2) {
            return new Loading(poweredBy2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && C6496s.c(this.poweredBy, ((Loading) obj).poweredBy);
        }

        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public int hashCode() {
            PoweredBy poweredBy2 = this.poweredBy;
            if (poweredBy2 == null) {
                return 0;
            }
            return poweredBy2.hashCode();
        }

        public String toString() {
            return "Loading(poweredBy=" + this.poweredBy + ')';
        }
    }

    public /* synthetic */ HomeUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract PoweredBy getPoweredBy();

    private HomeUiState() {
    }
}
