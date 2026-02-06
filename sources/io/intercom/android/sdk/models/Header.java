package io.intercom.android.sdk.models;

import Oc.c;
import com.amazon.a.a.o.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import sf.C6714a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002*+BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÇ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020(H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/models/Header;", "", "backgroundColor", "", "foregroundPrimaryColor", "foregroundSecondaryColor", "collapsed", "Lio/intercom/android/sdk/models/Header$Collapsed;", "displayActiveIndicator", "", "expanded", "Lio/intercom/android/sdk/models/Header$Expanded;", "useBotHeader", "hideGreeting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Header$Collapsed;ZLio/intercom/android/sdk/models/Header$Expanded;ZZ)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundPrimaryColor", "getForegroundSecondaryColor", "getCollapsed", "()Lio/intercom/android/sdk/models/Header$Collapsed;", "getDisplayActiveIndicator", "()Z", "getExpanded", "()Lio/intercom/android/sdk/models/Header$Expanded;", "getUseBotHeader", "getHideGreeting", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Collapsed", "Expanded", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Header {
    public static final int $stable = 8;
    @c("background_color")
    private final String backgroundColor;
    @c("collapsed")
    private final Collapsed collapsed;
    @c("display_active_indicator")
    private final boolean displayActiveIndicator;
    @c("expanded")
    private final Expanded expanded;
    @c("foreground_primary_color")
    private final String foregroundPrimaryColor;
    @c("foreground_secondary_color")
    private final String foregroundSecondaryColor;
    @c("hide_greeting")
    private final boolean hideGreeting;
    @c("use_bot_header")
    private final boolean useBotHeader;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0007H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/Header$Collapsed;", "", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "icon", "Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;", "subtitle", "", "title", "<init>", "(Lio/intercom/android/sdk/models/AvatarDetails;Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "getIcon", "()Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "HeaderIconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Collapsed {
        public static final int $stable = 8;
        @c("avatar_details")
        private final AvatarDetails avatarDetails;
        @c("icon")
        private final HeaderIconType icon;
        @c("subtitle")
        private final String subtitle;
        @c("title")
        private final String title;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;", "", "<init>", "(Ljava/lang/String;I)V", "CLOCK", "AI", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum HeaderIconType {
            CLOCK,
            AI;

            static {
                HeaderIconType[] $values;
                $ENTRIES = C6714a.a($values);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        public Collapsed(AvatarDetails avatarDetails2, HeaderIconType headerIconType, String str, String str2) {
            C6496s.h(str2, b.f37461S);
            this.avatarDetails = avatarDetails2;
            this.icon = headerIconType;
            this.subtitle = str;
            this.title = str2;
        }

        public static /* synthetic */ Collapsed copy$default(Collapsed collapsed, AvatarDetails avatarDetails2, HeaderIconType headerIconType, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatarDetails2 = collapsed.avatarDetails;
            }
            if ((i10 & 2) != 0) {
                headerIconType = collapsed.icon;
            }
            if ((i10 & 4) != 0) {
                str = collapsed.subtitle;
            }
            if ((i10 & 8) != 0) {
                str2 = collapsed.title;
            }
            return collapsed.copy(avatarDetails2, headerIconType, str, str2);
        }

        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        public final HeaderIconType component2() {
            return this.icon;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final String component4() {
            return this.title;
        }

        public final Collapsed copy(AvatarDetails avatarDetails2, HeaderIconType headerIconType, String str, String str2) {
            C6496s.h(str2, b.f37461S);
            return new Collapsed(avatarDetails2, headerIconType, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Collapsed)) {
                return false;
            }
            Collapsed collapsed = (Collapsed) obj;
            return C6496s.c(this.avatarDetails, collapsed.avatarDetails) && this.icon == collapsed.icon && C6496s.c(this.subtitle, collapsed.subtitle) && C6496s.c(this.title, collapsed.title);
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final HeaderIconType getIcon() {
            return this.icon;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails2 = this.avatarDetails;
            int i10 = 0;
            int hashCode = (avatarDetails2 == null ? 0 : avatarDetails2.hashCode()) * 31;
            HeaderIconType headerIconType = this.icon;
            int hashCode2 = (hashCode + (headerIconType == null ? 0 : headerIconType.hashCode())) * 31;
            String str = this.subtitle;
            if (str != null) {
                i10 = str.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "Collapsed(avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ", subtitle=" + this.subtitle + ", title=" + this.title + ')';
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0004#$%&BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\fH×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded;", "", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "body", "", "Lio/intercom/android/sdk/models/Header$Expanded$Body;", "footer", "Lio/intercom/android/sdk/models/Header$Expanded$Footer;", "socialAccounts", "Lio/intercom/android/sdk/models/Header$Expanded$SocialAccount;", "title", "", "<init>", "(Lio/intercom/android/sdk/models/AvatarDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "getBody", "()Ljava/util/List;", "getFooter", "getSocialAccounts", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Body", "Footer", "SocialAccount", "Style", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Expanded {
        public static final int $stable = 8;
        @c("avatar_details")
        private final AvatarDetails avatarDetails;
        @c("body")
        private final List<Body> body;
        @c("footer")
        private final List<Footer> footer;
        @c("social_accounts")
        private final List<SocialAccount> socialAccounts;
        @c("title")
        private final String title;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$Body;", "", "style", "Lio/intercom/android/sdk/models/Header$Expanded$Style;", "text", "", "color", "<init>", "(Lio/intercom/android/sdk/models/Header$Expanded$Style;Ljava/lang/String;Ljava/lang/String;)V", "getStyle", "()Lio/intercom/android/sdk/models/Header$Expanded$Style;", "getText", "()Ljava/lang/String;", "getColor", "setColor", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Body {
            public static final int $stable = 8;
            @c("color")
            private String color;
            @c("style")
            private final Style style;
            @c("text")
            private final String text;

            public Body(Style style2, String str, String str2) {
                C6496s.h(style2, "style");
                C6496s.h(str, AttributeType.TEXT);
                this.style = style2;
                this.text = str;
                this.color = str2;
            }

            public static /* synthetic */ Body copy$default(Body body, Style style2, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    style2 = body.style;
                }
                if ((i10 & 2) != 0) {
                    str = body.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = body.color;
                }
                return body.copy(style2, str, str2);
            }

            public final Style component1() {
                return this.style;
            }

            public final String component2() {
                return this.text;
            }

            public final String component3() {
                return this.color;
            }

            public final Body copy(Style style2, String str, String str2) {
                C6496s.h(style2, "style");
                C6496s.h(str, AttributeType.TEXT);
                return new Body(style2, str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Body)) {
                    return false;
                }
                Body body = (Body) obj;
                return this.style == body.style && C6496s.c(this.text, body.text) && C6496s.c(this.color, body.color);
            }

            public final String getColor() {
                return this.color;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = ((this.style.hashCode() * 31) + this.text.hashCode()) * 31;
                String str = this.color;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public String toString() {
                return "Body(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ')';
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$Footer;", "", "style", "Lio/intercom/android/sdk/models/Header$Expanded$Style;", "text", "", "color", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "<init>", "(Lio/intercom/android/sdk/models/Header$Expanded$Style;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/AvatarDetails;)V", "getStyle", "()Lio/intercom/android/sdk/models/Header$Expanded$Style;", "getText", "()Ljava/lang/String;", "getColor", "setColor", "(Ljava/lang/String;)V", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Footer {
            public static final int $stable = 8;
            @c("avatar_details")
            private final AvatarDetails avatarDetails;
            @c("color")
            private String color;
            @c("style")
            private final Style style;
            @c("text")
            private final String text;

            public Footer(Style style2, String str, String str2, AvatarDetails avatarDetails2) {
                C6496s.h(style2, "style");
                C6496s.h(str, AttributeType.TEXT);
                this.style = style2;
                this.text = str;
                this.color = str2;
                this.avatarDetails = avatarDetails2;
            }

            public static /* synthetic */ Footer copy$default(Footer footer, Style style2, String str, String str2, AvatarDetails avatarDetails2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    style2 = footer.style;
                }
                if ((i10 & 2) != 0) {
                    str = footer.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = footer.color;
                }
                if ((i10 & 8) != 0) {
                    avatarDetails2 = footer.avatarDetails;
                }
                return footer.copy(style2, str, str2, avatarDetails2);
            }

            public final Style component1() {
                return this.style;
            }

            public final String component2() {
                return this.text;
            }

            public final String component3() {
                return this.color;
            }

            public final AvatarDetails component4() {
                return this.avatarDetails;
            }

            public final Footer copy(Style style2, String str, String str2, AvatarDetails avatarDetails2) {
                C6496s.h(style2, "style");
                C6496s.h(str, AttributeType.TEXT);
                return new Footer(style2, str, str2, avatarDetails2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) obj;
                return this.style == footer.style && C6496s.c(this.text, footer.text) && C6496s.c(this.color, footer.color) && C6496s.c(this.avatarDetails, footer.avatarDetails);
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final String getColor() {
                return this.color;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = ((this.style.hashCode() * 31) + this.text.hashCode()) * 31;
                String str = this.color;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails2 = this.avatarDetails;
                if (avatarDetails2 != null) {
                    i10 = avatarDetails2.hashCode();
                }
                return hashCode2 + i10;
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public String toString() {
                return "Footer(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ", avatarDetails=" + this.avatarDetails + ')';
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$SocialAccount;", "", "provider", "", "profileUrl", "imageUrl", "username", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "getProfileUrl", "getImageUrl", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SocialAccount {
            public static final int $stable = 0;
            @c("image_url")
            private final String imageUrl;
            @c("profile_url")
            private final String profileUrl;
            @c("provider")
            private final String provider;
            @c("username")
            private final String username;

            public SocialAccount(String str, String str2, String str3, String str4) {
                C6496s.h(str, "provider");
                C6496s.h(str2, "profileUrl");
                C6496s.h(str3, "imageUrl");
                C6496s.h(str4, "username");
                this.provider = str;
                this.profileUrl = str2;
                this.imageUrl = str3;
                this.username = str4;
            }

            public static /* synthetic */ SocialAccount copy$default(SocialAccount socialAccount, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = socialAccount.provider;
                }
                if ((i10 & 2) != 0) {
                    str2 = socialAccount.profileUrl;
                }
                if ((i10 & 4) != 0) {
                    str3 = socialAccount.imageUrl;
                }
                if ((i10 & 8) != 0) {
                    str4 = socialAccount.username;
                }
                return socialAccount.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.provider;
            }

            public final String component2() {
                return this.profileUrl;
            }

            public final String component3() {
                return this.imageUrl;
            }

            public final String component4() {
                return this.username;
            }

            public final SocialAccount copy(String str, String str2, String str3, String str4) {
                C6496s.h(str, "provider");
                C6496s.h(str2, "profileUrl");
                C6496s.h(str3, "imageUrl");
                C6496s.h(str4, "username");
                return new SocialAccount(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SocialAccount)) {
                    return false;
                }
                SocialAccount socialAccount = (SocialAccount) obj;
                return C6496s.c(this.provider, socialAccount.provider) && C6496s.c(this.profileUrl, socialAccount.profileUrl) && C6496s.c(this.imageUrl, socialAccount.imageUrl) && C6496s.c(this.username, socialAccount.username);
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final String getProfileUrl() {
                return this.profileUrl;
            }

            public final String getProvider() {
                return this.provider;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (((((this.provider.hashCode() * 31) + this.profileUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.username.hashCode();
            }

            public String toString() {
                return "SocialAccount(provider=" + this.provider + ", profileUrl=" + this.profileUrl + ", imageUrl=" + this.imageUrl + ", username=" + this.username + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$Style;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "H1", "PARAGRAPH", "GREETING", "INTRO", "QUOTE", "CAPTION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum Style {
            UNKNOWN,
            H1,
            PARAGRAPH,
            GREETING,
            INTRO,
            QUOTE,
            CAPTION;

            static {
                Style[] $values;
                $ENTRIES = C6714a.a($values);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        public Expanded(AvatarDetails avatarDetails2, List<Body> list, List<Footer> list2, List<SocialAccount> list3, String str) {
            C6496s.h(list, "body");
            C6496s.h(list2, "footer");
            C6496s.h(list3, "socialAccounts");
            C6496s.h(str, b.f37461S);
            this.avatarDetails = avatarDetails2;
            this.body = list;
            this.footer = list2;
            this.socialAccounts = list3;
            this.title = str;
        }

        public static /* synthetic */ Expanded copy$default(Expanded expanded, AvatarDetails avatarDetails2, List<Body> list, List<Footer> list2, List<SocialAccount> list3, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                avatarDetails2 = expanded.avatarDetails;
            }
            if ((i10 & 2) != 0) {
                list = expanded.body;
            }
            List<Body> list4 = list;
            if ((i10 & 4) != 0) {
                list2 = expanded.footer;
            }
            List<Footer> list5 = list2;
            if ((i10 & 8) != 0) {
                list3 = expanded.socialAccounts;
            }
            List<SocialAccount> list6 = list3;
            if ((i10 & 16) != 0) {
                str = expanded.title;
            }
            return expanded.copy(avatarDetails2, list4, list5, list6, str);
        }

        public final AvatarDetails component1() {
            return this.avatarDetails;
        }

        public final List<Body> component2() {
            return this.body;
        }

        public final List<Footer> component3() {
            return this.footer;
        }

        public final List<SocialAccount> component4() {
            return this.socialAccounts;
        }

        public final String component5() {
            return this.title;
        }

        public final Expanded copy(AvatarDetails avatarDetails2, List<Body> list, List<Footer> list2, List<SocialAccount> list3, String str) {
            C6496s.h(list, "body");
            C6496s.h(list2, "footer");
            C6496s.h(list3, "socialAccounts");
            C6496s.h(str, b.f37461S);
            return new Expanded(avatarDetails2, list, list2, list3, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) obj;
            return C6496s.c(this.avatarDetails, expanded.avatarDetails) && C6496s.c(this.body, expanded.body) && C6496s.c(this.footer, expanded.footer) && C6496s.c(this.socialAccounts, expanded.socialAccounts) && C6496s.c(this.title, expanded.title);
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final List<Body> getBody() {
            return this.body;
        }

        public final List<Footer> getFooter() {
            return this.footer;
        }

        public final List<SocialAccount> getSocialAccounts() {
            return this.socialAccounts;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            AvatarDetails avatarDetails2 = this.avatarDetails;
            return ((((((((avatarDetails2 == null ? 0 : avatarDetails2.hashCode()) * 31) + this.body.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.socialAccounts.hashCode()) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "Expanded(avatarDetails=" + this.avatarDetails + ", body=" + this.body + ", footer=" + this.footer + ", socialAccounts=" + this.socialAccounts + ", title=" + this.title + ')';
        }
    }

    public Header(String str, String str2, String str3, Collapsed collapsed2, boolean z10, Expanded expanded2, boolean z11, boolean z12) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "foregroundPrimaryColor");
        C6496s.h(str3, "foregroundSecondaryColor");
        C6496s.h(collapsed2, "collapsed");
        this.backgroundColor = str;
        this.foregroundPrimaryColor = str2;
        this.foregroundSecondaryColor = str3;
        this.collapsed = collapsed2;
        this.displayActiveIndicator = z10;
        this.expanded = expanded2;
        this.useBotHeader = z11;
        this.hideGreeting = z12;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, Collapsed collapsed2, boolean z10, Expanded expanded2, boolean z11, boolean z12, int i10, Object obj) {
        Header header2 = header;
        int i11 = i10;
        return header.copy((i11 & 1) != 0 ? header2.backgroundColor : str, (i11 & 2) != 0 ? header2.foregroundPrimaryColor : str2, (i11 & 4) != 0 ? header2.foregroundSecondaryColor : str3, (i11 & 8) != 0 ? header2.collapsed : collapsed2, (i11 & 16) != 0 ? header2.displayActiveIndicator : z10, (i11 & 32) != 0 ? header2.expanded : expanded2, (i11 & 64) != 0 ? header2.useBotHeader : z11, (i11 & 128) != 0 ? header2.hideGreeting : z12);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.foregroundPrimaryColor;
    }

    public final String component3() {
        return this.foregroundSecondaryColor;
    }

    public final Collapsed component4() {
        return this.collapsed;
    }

    public final boolean component5() {
        return this.displayActiveIndicator;
    }

    public final Expanded component6() {
        return this.expanded;
    }

    public final boolean component7() {
        return this.useBotHeader;
    }

    public final boolean component8() {
        return this.hideGreeting;
    }

    public final Header copy(String str, String str2, String str3, Collapsed collapsed2, boolean z10, Expanded expanded2, boolean z11, boolean z12) {
        C6496s.h(str, "backgroundColor");
        C6496s.h(str2, "foregroundPrimaryColor");
        C6496s.h(str3, "foregroundSecondaryColor");
        C6496s.h(collapsed2, "collapsed");
        return new Header(str, str2, str3, collapsed2, z10, expanded2, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return C6496s.c(this.backgroundColor, header.backgroundColor) && C6496s.c(this.foregroundPrimaryColor, header.foregroundPrimaryColor) && C6496s.c(this.foregroundSecondaryColor, header.foregroundSecondaryColor) && C6496s.c(this.collapsed, header.collapsed) && this.displayActiveIndicator == header.displayActiveIndicator && C6496s.c(this.expanded, header.expanded) && this.useBotHeader == header.useBotHeader && this.hideGreeting == header.hideGreeting;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Collapsed getCollapsed() {
        return this.collapsed;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final Expanded getExpanded() {
        return this.expanded;
    }

    public final String getForegroundPrimaryColor() {
        return this.foregroundPrimaryColor;
    }

    public final String getForegroundSecondaryColor() {
        return this.foregroundSecondaryColor;
    }

    public final boolean getHideGreeting() {
        return this.hideGreeting;
    }

    public final boolean getUseBotHeader() {
        return this.useBotHeader;
    }

    public int hashCode() {
        int hashCode = ((((((((this.backgroundColor.hashCode() * 31) + this.foregroundPrimaryColor.hashCode()) * 31) + this.foregroundSecondaryColor.hashCode()) * 31) + this.collapsed.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator)) * 31;
        Expanded expanded2 = this.expanded;
        return ((((hashCode + (expanded2 == null ? 0 : expanded2.hashCode())) * 31) + Boolean.hashCode(this.useBotHeader)) * 31) + Boolean.hashCode(this.hideGreeting);
    }

    public String toString() {
        return "Header(backgroundColor=" + this.backgroundColor + ", foregroundPrimaryColor=" + this.foregroundPrimaryColor + ", foregroundSecondaryColor=" + this.foregroundSecondaryColor + ", collapsed=" + this.collapsed + ", displayActiveIndicator=" + this.displayActiveIndicator + ", expanded=" + this.expanded + ", useBotHeader=" + this.useBotHeader + ", hideGreeting=" + this.hideGreeting + ')';
    }
}
