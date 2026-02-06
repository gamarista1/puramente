package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;", "", "<init>", "()V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "inputType", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeInputUseCase {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType[] r0 = io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType.VOICE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.ChangeInputUseCase.WhenMappings.<clinit>():void");
        }
    }

    public final void invoke(x xVar, ComposerInputType composerInputType) {
        Object value;
        ComposerState.TextInput textInput;
        Object value2;
        x xVar2 = xVar;
        C6496s.h(xVar2, "clientState");
        C6496s.h(composerInputType, "inputType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[composerInputType.ordinal()];
        if (i10 == 1) {
            do {
                value = xVar.getValue();
                textInput = r10;
                ComposerState.TextInput textInput2 = new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null);
            } while (!xVar2.e(value, ConversationClientState.copy$default((ConversationClientState) value, (Map) null, (Conversation) null, (String) null, (CurrentlyTypingState) null, textInput, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, (FloatingIndicatorState) null, (String) null, false, false, 1048559, (Object) null)));
        } else if (i10 == 2) {
            do {
                value2 = xVar.getValue();
            } while (!xVar2.e(value2, ConversationClientState.copy$default((ConversationClientState) value2, (Map) null, (Conversation) null, (String) null, (CurrentlyTypingState) null, ComposerState.VoiceInput.INSTANCE, (BottomSheetState) null, (LaunchMode) null, (NetworkResponse) null, (ArticleMetadata) null, (NetworkState) null, (List) null, (List) null, (FinStreamingData) null, (OpenMessengerResponse) null, 0, 0, (FloatingIndicatorState) null, (String) null, false, false, 1048559, (Object) null)));
        } else {
            throw new C6535s();
        }
    }
}
