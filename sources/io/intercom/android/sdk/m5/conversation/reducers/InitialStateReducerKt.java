package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import r0.C2544x0;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"reduceInitialState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Loading;", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InitialStateReducerKt {
    public static final ConversationUiState.Loading reduceInitialState(LaunchMode launchMode) {
        int i10;
        LaunchMode launchMode2 = launchMode;
        C6496s.h(launchMode2, "launchMode");
        TopAppBarUiState topAppBarUiState = TopAppBarUiState.Companion.getDefault();
        if (launchMode2 == LaunchMode.PROGRAMMATIC) {
            i10 = R.drawable.intercom_ic_close;
        } else {
            i10 = R.drawable.intercom_ic_back;
        }
        return new ConversationUiState.Loading(TopAppBarUiState.m216copyd8CKnI4$default(topAppBarUiState, (StringProvider) null, Integer.valueOf(i10), (StringProvider) null, (Integer) null, (List) null, false, (TicketProgressRowState) null, (List) null, (C2544x0) null, (C2544x0) null, (C2544x0) null, 2045, (Object) null));
    }
}
