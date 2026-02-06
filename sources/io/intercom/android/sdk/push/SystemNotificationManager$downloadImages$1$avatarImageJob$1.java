package io.intercom.android.sdk.push;

import Ug.K;
import android.content.Context;
import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.push.SystemNotificationManager$downloadImages$1$avatarImageJob$1", f = "SystemNotificationManager.kt", l = {}, m = "invokeSuspend")
final class SystemNotificationManager$downloadImages$1$avatarImageJob$1 extends l implements p {
    final /* synthetic */ AppConfig $appConfig;
    final /* synthetic */ N $avatarImage;
    final /* synthetic */ Context $context;
    final /* synthetic */ PushPayload $payload;
    int label;
    final /* synthetic */ SystemNotificationManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SystemNotificationManager$downloadImages$1$avatarImageJob$1(N n10, SystemNotificationManager systemNotificationManager, PushPayload pushPayload, Context context, AppConfig appConfig, C6658d<? super SystemNotificationManager$downloadImages$1$avatarImageJob$1> dVar) {
        super(2, dVar);
        this.$avatarImage = n10;
        this.this$0 = systemNotificationManager;
        this.$payload = pushPayload;
        this.$context = context;
        this.$appConfig = appConfig;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SystemNotificationManager$downloadImages$1$avatarImageJob$1(this.$avatarImage, this.this$0, this.$payload, this.$context, this.$appConfig, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SystemNotificationManager$downloadImages$1$avatarImageJob$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            this.$avatarImage.f71759a = this.this$0.generateAvatar(this.$payload, this.$context, this.$appConfig);
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
