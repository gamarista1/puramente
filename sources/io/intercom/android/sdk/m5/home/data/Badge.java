package io.intercom.android.sdk.m5.home.data;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/Badge;", "", "badgeType", "Lio/intercom/android/sdk/m5/home/data/BadgeType;", "label", "", "<init>", "(Lio/intercom/android/sdk/m5/home/data/BadgeType;Ljava/lang/String;)V", "getBadgeType", "()Lio/intercom/android/sdk/m5/home/data/BadgeType;", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Badge {
    public static final int $stable = 0;
    @c("badge_type")
    private final BadgeType badgeType;
    @c("label")
    private final String label;

    public Badge(BadgeType badgeType2, String str) {
        C6496s.h(badgeType2, "badgeType");
        this.badgeType = badgeType2;
        this.label = str;
    }

    public static /* synthetic */ Badge copy$default(Badge badge, BadgeType badgeType2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            badgeType2 = badge.badgeType;
        }
        if ((i10 & 2) != 0) {
            str = badge.label;
        }
        return badge.copy(badgeType2, str);
    }

    public final BadgeType component1() {
        return this.badgeType;
    }

    public final String component2() {
        return this.label;
    }

    public final Badge copy(BadgeType badgeType2, String str) {
        C6496s.h(badgeType2, "badgeType");
        return new Badge(badgeType2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.badgeType == badge.badgeType && C6496s.c(this.label, badge.label);
    }

    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = this.badgeType.hashCode() * 31;
        String str = this.label;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Badge(badgeType=" + this.badgeType + ", label=" + this.label + ')';
    }
}
