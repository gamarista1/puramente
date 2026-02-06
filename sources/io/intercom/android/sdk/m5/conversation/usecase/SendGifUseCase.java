package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bHB¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendGifUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "sendMessageUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;", "changeInputUseCase", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientState", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "gifData", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendGifUseCase {
    public static final int $stable = 8;
    private final ChangeInputUseCase changeInputUseCase;
    private final SendMessageUseCase sendMessageUseCase;

    public SendGifUseCase(SendMessageUseCase sendMessageUseCase2, ChangeInputUseCase changeInputUseCase2) {
        C6496s.h(sendMessageUseCase2, "sendMessageUseCase");
        C6496s.h(changeInputUseCase2, "changeInputUseCase");
        this.sendMessageUseCase = sendMessageUseCase2;
        this.changeInputUseCase = changeInputUseCase2;
    }

    public final Object invoke(x xVar, MediaData.Gif gif, C6658d<? super C6514M> dVar) {
        this.changeInputUseCase.invoke(xVar, ComposerInputType.TEXT);
        x xVar2 = xVar;
        Object invoke$default = SendMessageUseCase.invoke$default(this.sendMessageUseCase, xVar2, C6565s.e(new Block.Builder().withType(AppearanceType.IMAGE).withUrl(gif.getUrl()).withAttribution(gif.getAttribution()).withHeight(gif.getHeight()).withWidth(gif.getWidth())), (String) null, false, dVar, 12, (Object) null);
        if (invoke$default == C6680b.f()) {
            return invoke$default;
        }
        return C6514M.f71813a;
    }
}
