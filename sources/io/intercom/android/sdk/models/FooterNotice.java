package io.intercom.android.sdk.models;

import Oc.c;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/FooterNotice;", "", "title", "", "subtitle", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/AvatarDetails;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FooterNotice {
    public static final int $stable = 8;
    @c("avatar_details")
    private final AvatarDetails avatarDetails;
    @c("subtitle")
    private final String subtitle;
    @c("title")
    private final String title;

    public FooterNotice(String str, String str2, AvatarDetails avatarDetails2) {
        C6496s.h(str, b.f37461S);
        this.title = str;
        this.subtitle = str2;
        this.avatarDetails = avatarDetails2;
    }

    public static /* synthetic */ FooterNotice copy$default(FooterNotice footerNotice, String str, String str2, AvatarDetails avatarDetails2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footerNotice.title;
        }
        if ((i10 & 2) != 0) {
            str2 = footerNotice.subtitle;
        }
        if ((i10 & 4) != 0) {
            avatarDetails2 = footerNotice.avatarDetails;
        }
        return footerNotice.copy(str, str2, avatarDetails2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AvatarDetails component3() {
        return this.avatarDetails;
    }

    public final FooterNotice copy(String str, String str2, AvatarDetails avatarDetails2) {
        C6496s.h(str, b.f37461S);
        return new FooterNotice(str, str2, avatarDetails2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNotice)) {
            return false;
        }
        FooterNotice footerNotice = (FooterNotice) obj;
        return C6496s.c(this.title, footerNotice.title) && C6496s.c(this.subtitle, footerNotice.subtitle) && C6496s.c(this.avatarDetails, footerNotice.avatarDetails);
    }

    public final AvatarDetails getAvatarDetails() {
        return this.avatarDetails;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AvatarDetails avatarDetails2 = this.avatarDetails;
        if (avatarDetails2 != null) {
            i10 = avatarDetails2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "FooterNotice(title=" + this.title + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ')';
    }
}
