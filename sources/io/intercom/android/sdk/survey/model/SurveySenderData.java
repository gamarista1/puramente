package io.intercom.android.sdk.survey.model;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveySenderData;", "", "firstName", "", "name", "initials", "avatar", "Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;)V", "getFirstName", "()Ljava/lang/String;", "getName", "getInitials", "getAvatar", "()Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveySenderData {
    public static final int $stable = 0;
    @c("avatar")
    private final SurveySenderAvatar avatar;
    @c("first_name")
    private final String firstName;
    @c("initial")
    private final String initials;
    @c("name")
    private final String name;

    public SurveySenderData() {
        this((String) null, (String) null, (String) null, (SurveySenderAvatar) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SurveySenderData copy$default(SurveySenderData surveySenderData, String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveySenderData.firstName;
        }
        if ((i10 & 2) != 0) {
            str2 = surveySenderData.name;
        }
        if ((i10 & 4) != 0) {
            str3 = surveySenderData.initials;
        }
        if ((i10 & 8) != 0) {
            surveySenderAvatar = surveySenderData.avatar;
        }
        return surveySenderData.copy(str, str2, str3, surveySenderAvatar);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.initials;
    }

    public final SurveySenderAvatar component4() {
        return this.avatar;
    }

    public final SurveySenderData copy(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar) {
        return new SurveySenderData(str, str2, str3, surveySenderAvatar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveySenderData)) {
            return false;
        }
        SurveySenderData surveySenderData = (SurveySenderData) obj;
        return C6496s.c(this.firstName, surveySenderData.firstName) && C6496s.c(this.name, surveySenderData.name) && C6496s.c(this.initials, surveySenderData.initials) && C6496s.c(this.avatar, surveySenderData.avatar);
    }

    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.firstName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initials;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SurveySenderAvatar surveySenderAvatar = this.avatar;
        if (surveySenderAvatar != null) {
            i10 = surveySenderAvatar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "SurveySenderData(firstName=" + this.firstName + ", name=" + this.name + ", initials=" + this.initials + ", avatar=" + this.avatar + ')';
    }

    public SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar) {
        this.firstName = str;
        this.name = str2;
        this.initials = str3;
        this.avatar = surveySenderAvatar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : surveySenderAvatar);
    }
}
