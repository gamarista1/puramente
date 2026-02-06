package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "soundPlayer", "<init>", "(Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;)V", "Lio/intercom/android/sdk/m5/conversation/usecase/Action;", "action", "Llf/M;", "invoke$intercom_sdk_base_release", "(Lio/intercom/android/sdk/m5/conversation/usecase/Action;)V", "invoke", "Lio/intercom/android/sdk/identity/AppConfig;", "getAppConfig", "()Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "getSoundPlayer", "()Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SoundEffectsUseCase {
    public static final int $stable = 8;
    private final AppConfig appConfig;
    private final SoundPlayer soundPlayer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                io.intercom.android.sdk.m5.conversation.usecase.Action[] r0 = io.intercom.android.sdk.m5.conversation.usecase.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.conversation.usecase.Action r1 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_SENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.conversation.usecase.Action r1 = io.intercom.android.sdk.m5.conversation.usecase.Action.ADMIN_MESSAGE_RECEIVED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.conversation.usecase.Action r1 = io.intercom.android.sdk.m5.conversation.usecase.Action.OPERATOR_MESSAGE_RECEIVED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.m5.conversation.usecase.Action r1 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase.WhenMappings.<clinit>():void");
        }
    }

    public SoundEffectsUseCase(AppConfig appConfig2, SoundPlayer soundPlayer2) {
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(soundPlayer2, "soundPlayer");
        this.appConfig = appConfig2;
        this.soundPlayer = soundPlayer2;
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final SoundPlayer getSoundPlayer() {
        return this.soundPlayer;
    }

    public final void invoke$intercom_sdk_base_release(Action action) {
        C6496s.h(action, "action");
        if (this.appConfig.isAudioEnabled()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i10 == 1) {
                this.soundPlayer.playMessageSentSound();
            } else if (i10 == 2) {
                this.soundPlayer.playAdminMessageReceivedSound();
            } else if (i10 == 3) {
                this.soundPlayer.playOperatorMessageReceivedSound();
            } else if (i10 == 4) {
                this.soundPlayer.playMessageFailedSound();
            } else {
                throw new C6535s();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SoundEffectsUseCase(AppConfig appConfig2, SoundPlayer soundPlayer2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig2, soundPlayer2);
    }
}
