package io.intercom.android.sdk.m5.conversation.states;

import com.amazon.a.a.o.b;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "", "avatarWrapper", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "showAvatar", "", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "userType", "Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;", "<init>", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;ZLio/intercom/android/sdk/ui/common/StringProvider;Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;)V", "getAvatarWrapper", "()Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getShowAvatar", "()Z", "getDescription", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getUserType", "()Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurrentlyTypingState {
    public static final int $stable = 8;
    private final AvatarWrapper avatarWrapper;
    private final StringProvider description;
    private final boolean showAvatar;
    private final TypingIndicatorType userType;

    public CurrentlyTypingState(AvatarWrapper avatarWrapper2, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType) {
        C6496s.h(avatarWrapper2, "avatarWrapper");
        C6496s.h(stringProvider, b.f37480c);
        C6496s.h(typingIndicatorType, "userType");
        this.avatarWrapper = avatarWrapper2;
        this.showAvatar = z10;
        this.description = stringProvider;
        this.userType = typingIndicatorType;
    }

    public static /* synthetic */ CurrentlyTypingState copy$default(CurrentlyTypingState currentlyTypingState, AvatarWrapper avatarWrapper2, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            avatarWrapper2 = currentlyTypingState.avatarWrapper;
        }
        if ((i10 & 2) != 0) {
            z10 = currentlyTypingState.showAvatar;
        }
        if ((i10 & 4) != 0) {
            stringProvider = currentlyTypingState.description;
        }
        if ((i10 & 8) != 0) {
            typingIndicatorType = currentlyTypingState.userType;
        }
        return currentlyTypingState.copy(avatarWrapper2, z10, stringProvider, typingIndicatorType);
    }

    public final AvatarWrapper component1() {
        return this.avatarWrapper;
    }

    public final boolean component2() {
        return this.showAvatar;
    }

    public final StringProvider component3() {
        return this.description;
    }

    public final TypingIndicatorType component4() {
        return this.userType;
    }

    public final CurrentlyTypingState copy(AvatarWrapper avatarWrapper2, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType) {
        C6496s.h(avatarWrapper2, "avatarWrapper");
        C6496s.h(stringProvider, b.f37480c);
        C6496s.h(typingIndicatorType, "userType");
        return new CurrentlyTypingState(avatarWrapper2, z10, stringProvider, typingIndicatorType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentlyTypingState)) {
            return false;
        }
        CurrentlyTypingState currentlyTypingState = (CurrentlyTypingState) obj;
        return C6496s.c(this.avatarWrapper, currentlyTypingState.avatarWrapper) && this.showAvatar == currentlyTypingState.showAvatar && C6496s.c(this.description, currentlyTypingState.description) && this.userType == currentlyTypingState.userType;
    }

    public final AvatarWrapper getAvatarWrapper() {
        return this.avatarWrapper;
    }

    public final StringProvider getDescription() {
        return this.description;
    }

    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    public final TypingIndicatorType getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return (((((this.avatarWrapper.hashCode() * 31) + Boolean.hashCode(this.showAvatar)) * 31) + this.description.hashCode()) * 31) + this.userType.hashCode();
    }

    public String toString() {
        return "CurrentlyTypingState(avatarWrapper=" + this.avatarWrapper + ", showAvatar=" + this.showAvatar + ", description=" + this.description + ", userType=" + this.userType + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrentlyTypingState(AvatarWrapper avatarWrapper2, boolean z10, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AvatarWrapper.Companion.getNULL() : avatarWrapper2, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? new StringProvider.StringRes(R.string.intercom_thinking, (List) null, 2, (DefaultConstructorMarker) null) : stringProvider, typingIndicatorType);
    }
}
