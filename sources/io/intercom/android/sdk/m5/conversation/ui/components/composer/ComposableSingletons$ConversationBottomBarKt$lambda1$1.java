package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ConversationBottomBarKt$lambda1$1 implements p {
    public static final ComposableSingletons$ConversationBottomBarKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationBottomBarKt$lambda1$1();

    ComposableSingletons$ConversationBottomBarKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(String str, TextInputSource textInputSource) {
        C6496s.h(str, "<unused var>");
        C6496s.h(textInputSource, "<unused var>");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(ComposerInputType composerInputType) {
        C6496s.h(composerInputType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ComposerState.TextInput textInput = new ComposerState.TextInput("Wubba Lubba Dub Dub!", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null);
            Avatar create = Avatar.create("", "PR");
            C6496s.g(create, "create(...)");
            ConversationBottomBarKt.m273ConversationBottomBarwn8IZOc((i) null, new BottomBarUiState(textInput, new CurrentlyTypingState(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null), false, (StringProvider) null, TypingIndicatorType.ADMIN, 6, (DefaultConstructorMarker) null), InputTypeState.Companion.getDEFAULT(), (List) null, false, (BottomBarUiState.BottomBadgeState) null, 56, (DefaultConstructorMarker) null), new C6099q(), new r(), new C6100s(), new C6101t(), new C6102u(), (C6798l) null, 0.0f, new C6103v(), new C6104w(), (C6787a) null, mVar, 807103936, 6, 2433);
            return;
        }
        mVar.I();
    }
}
