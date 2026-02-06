package io.intercom.android.sdk.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import sf.C6714a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/models/PoweredBy;", "", "icon", "Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", "linkUrl", "", "text", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", "getLinkUrl", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PoweredByIconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PoweredBy {
    public static final int $stable = 0;
    @c("icon")
    private final PoweredByIconType icon;
    @c("link_url")
    private final String linkUrl;
    @c("text")
    private final String text;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", "", "<init>", "(Ljava/lang/String;I)V", "INTERCOM", "FIN", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum PoweredByIconType {
        INTERCOM,
        FIN;

        static {
            PoweredByIconType[] $values;
            $ENTRIES = C6714a.a($values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    public PoweredBy(PoweredByIconType poweredByIconType, String str, String str2) {
        C6496s.h(poweredByIconType, "icon");
        C6496s.h(str, "linkUrl");
        C6496s.h(str2, AttributeType.TEXT);
        this.icon = poweredByIconType;
        this.linkUrl = str;
        this.text = str2;
    }

    public static /* synthetic */ PoweredBy copy$default(PoweredBy poweredBy, PoweredByIconType poweredByIconType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            poweredByIconType = poweredBy.icon;
        }
        if ((i10 & 2) != 0) {
            str = poweredBy.linkUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = poweredBy.text;
        }
        return poweredBy.copy(poweredByIconType, str, str2);
    }

    public final PoweredByIconType component1() {
        return this.icon;
    }

    public final String component2() {
        return this.linkUrl;
    }

    public final String component3() {
        return this.text;
    }

    public final PoweredBy copy(PoweredByIconType poweredByIconType, String str, String str2) {
        C6496s.h(poweredByIconType, "icon");
        C6496s.h(str, "linkUrl");
        C6496s.h(str2, AttributeType.TEXT);
        return new PoweredBy(poweredByIconType, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoweredBy)) {
            return false;
        }
        PoweredBy poweredBy = (PoweredBy) obj;
        return this.icon == poweredBy.icon && C6496s.c(this.linkUrl, poweredBy.linkUrl) && C6496s.c(this.text, poweredBy.text);
    }

    public final PoweredByIconType getIcon() {
        return this.icon;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.linkUrl.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "PoweredBy(icon=" + this.icon + ", linkUrl=" + this.linkUrl + ", text=" + this.text + ')';
    }
}
