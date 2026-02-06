package io.intercom.android.sdk.m5.conversation;

import Ug.K;
import Xg.x;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onRetryMessageClicked$1", f = "ConversationViewModel.kt", l = {534}, m = "invokeSuspend")
final class ConversationViewModel$onRetryMessageClicked$1 extends l implements p {
    final /* synthetic */ Part $part;
    int label;
    final /* synthetic */ ConversationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationViewModel$onRetryMessageClicked$1(ConversationViewModel conversationViewModel, Part part, C6658d<? super ConversationViewModel$onRetryMessageClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = conversationViewModel;
        this.$part = part;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationViewModel$onRetryMessageClicked$1(this.this$0, this.$part, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationViewModel$onRetryMessageClicked$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            SendMessageUseCase access$getSendMessageUseCase$p = this.this$0.sendMessageUseCase;
            x access$getClientState$p = this.this$0.clientState;
            List<Block> blocks = this.$part.getBlocks();
            C6496s.g(blocks, "getBlocks(...)");
            Iterable<Block> iterable = blocks;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Block builder : iterable) {
                arrayList.add(builder.toBuilder());
            }
            String uuid = this.$part.getUuid();
            C6496s.g(uuid, "getUuid(...)");
            boolean isFromVoiceDictation = this.$part.isFromVoiceDictation();
            this.label = 1;
            if (access$getSendMessageUseCase$p.invoke(access$getClientState$p, arrayList, uuid, isFromVoiceDictation, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
