package io.intercom.android.sdk.m5.components.avatar;

import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "<init>", "(Lio/intercom/android/sdk/models/Avatar;Z)V", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "()Z", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "initials", "getInitials", "label", "getLabel", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvatarWrapper {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final AvatarWrapper NULL;
    private final Avatar avatar;
    private final String imageUrl;
    private final String initials;
    private final boolean isBot;
    private final String label;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getNULL", "()Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AvatarWrapper getNULL() {
            return AvatarWrapper.NULL;
        }

        private Companion() {
        }
    }

    static {
        Avatar avatar2 = Avatar.NULL;
        C6496s.g(avatar2, "NULL");
        NULL = new AvatarWrapper(avatar2, false, 2, (DefaultConstructorMarker) null);
    }

    public AvatarWrapper(Avatar avatar2, boolean z10) {
        C6496s.h(avatar2, "avatar");
        this.avatar = avatar2;
        this.isBot = z10;
        String imageUrl2 = avatar2.getImageUrl();
        C6496s.g(imageUrl2, "getImageUrl(...)");
        this.imageUrl = imageUrl2;
        String initials2 = avatar2.getInitials();
        C6496s.g(initials2, "getInitials(...)");
        this.initials = initials2;
        String label2 = avatar2.getLabel();
        C6496s.g(label2, "getLabel(...)");
        this.label = label2;
    }

    public static /* synthetic */ AvatarWrapper copy$default(AvatarWrapper avatarWrapper, Avatar avatar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatar2 = avatarWrapper.avatar;
        }
        if ((i10 & 2) != 0) {
            z10 = avatarWrapper.isBot;
        }
        return avatarWrapper.copy(avatar2, z10);
    }

    public final Avatar component1() {
        return this.avatar;
    }

    public final boolean component2() {
        return this.isBot;
    }

    public final AvatarWrapper copy(Avatar avatar2, boolean z10) {
        C6496s.h(avatar2, "avatar");
        return new AvatarWrapper(avatar2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarWrapper)) {
            return false;
        }
        AvatarWrapper avatarWrapper = (AvatarWrapper) obj;
        return C6496s.c(this.avatar, avatarWrapper.avatar) && this.isBot == avatarWrapper.isBot;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.avatar.hashCode() * 31) + Boolean.hashCode(this.isBot);
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        return "AvatarWrapper(avatar=" + this.avatar + ", isBot=" + this.isBot + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarWrapper(Avatar avatar2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(avatar2, (i10 & 2) != 0 ? false : z10);
    }
}
