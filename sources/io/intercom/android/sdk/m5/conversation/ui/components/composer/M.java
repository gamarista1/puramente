package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import yf.C6798l;

public final /* synthetic */ class M implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomBarUiState f69119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReactionListener f69120b;

    public /* synthetic */ M(BottomBarUiState bottomBarUiState, ReactionListener reactionListener) {
        this.f69119a = bottomBarUiState;
        this.f69120b = reactionListener;
    }

    public final Object invoke(Object obj) {
        return ConversationBottomBarKt$ConversationBottomBar$3.invoke$lambda$13$lambda$6(this.f69119a, this.f69120b, (Context) obj);
    }
}
