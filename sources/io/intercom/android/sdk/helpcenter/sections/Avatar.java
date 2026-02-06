package io.intercom.android.sdk.helpcenter.sections;

import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C5985i
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "", "", "initials", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/sections/Avatar;Ljh/d;Lih/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitials", "getInitials$annotations", "()V", "getImageUrl", "getImageUrl$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Avatar {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String imageUrl;
    private final String initials;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/Avatar$Companion;", "", "<init>", "()V", "Lgh/b;", "Lio/intercom/android/sdk/helpcenter/sections/Avatar;", "serializer", "()Lgh/b;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final C5978b serializer() {
            return Avatar$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Avatar() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = avatar.initials;
        }
        if ((i10 & 2) != 0) {
            str2 = avatar.imageUrl;
        }
        return avatar.copy(str, str2);
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getInitials$annotations() {
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Avatar avatar, d dVar, f fVar) {
        if (dVar.q(fVar, 0) || !C6496s.c(avatar.initials, "")) {
            dVar.t(fVar, 0, avatar.initials);
        }
        if (dVar.q(fVar, 1) || !C6496s.c(avatar.imageUrl, "")) {
            dVar.t(fVar, 1, avatar.imageUrl);
        }
    }

    public final String component1() {
        return this.initials;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Avatar copy(String str, String str2) {
        C6496s.h(str, "initials");
        C6496s.h(str2, "imageUrl");
        return new Avatar(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return C6496s.c(this.initials, avatar.initials) && C6496s.c(this.imageUrl, avatar.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        return (this.initials.hashCode() * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "Avatar(initials=" + this.initials + ", imageUrl=" + this.imageUrl + ')';
    }

    public /* synthetic */ Avatar(int i10, String str, String str2, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.initials = "";
        } else {
            this.initials = str;
        }
        if ((i10 & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
    }

    public Avatar(String str, String str2) {
        C6496s.h(str, "initials");
        C6496s.h(str2, "imageUrl");
        this.initials = str;
        this.imageUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Avatar(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
