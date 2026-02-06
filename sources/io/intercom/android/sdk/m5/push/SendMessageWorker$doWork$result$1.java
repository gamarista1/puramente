package io.intercom.android.sdk.m5.push;

import Ug.K;
import androidx.work.r;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUg/K;", "Landroidx/work/r$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(LUg/K;)Landroidx/work/r$a;"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$result$1", f = "SendMessageWorker.kt", l = {35}, m = "invokeSuspend")
final class SendMessageWorker$doWork$result$1 extends l implements p {
    final /* synthetic */ String $clientUUID;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $messageText;
    int label;
    final /* synthetic */ SendMessageWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendMessageWorker$doWork$result$1(String str, SendMessageWorker sendMessageWorker, String str2, String str3, C6658d<? super SendMessageWorker$doWork$result$1> dVar) {
        super(2, dVar);
        this.$messageText = str;
        this.this$0 = sendMessageWorker;
        this.$conversationId = str2;
        this.$clientUUID = str3;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SendMessageWorker$doWork$result$1(this.$messageText, this.this$0, this.$conversationId, this.$clientUUID, dVar);
    }

    public final Object invoke(K k10, C6658d<? super r.a> dVar) {
        return ((SendMessageWorker$doWork$result$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(this.$messageText);
            ConversationRepository access$getConversationRepository$p = this.this$0.conversationRepository;
            String str = this.$conversationId;
            String str2 = this.$clientUUID;
            C6496s.e(blocksForText);
            this.label = 1;
            obj = access$getConversationRepository$p.replyToConversation(str, str2, blocksForText, (Long) null, false, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return r.a.a();
        }
        if ((networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            return r.a.b();
        }
        if (networkResponse instanceof NetworkResponse.Success) {
            return r.a.c();
        }
        throw new C6535s();
    }
}
