package io.intercom.android.sdk.m5.push;

import Ug.K;
import android.content.Context;
import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1", f = "IntercomPushBitmapUtils.kt", l = {}, m = "invokeSuspend")
final class IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1 extends l implements p {
    final /* synthetic */ AppConfig $appConfig;
    final /* synthetic */ String $authorName;
    final /* synthetic */ N $avatarBitmap;
    final /* synthetic */ String $avatarImageUrl;
    final /* synthetic */ Context $context;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1(N n10, Context context, String str, String str2, AppConfig appConfig, C6658d<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1> dVar) {
        super(2, dVar);
        this.$avatarBitmap = n10;
        this.$context = context;
        this.$avatarImageUrl = str;
        this.$authorName = str2;
        this.$appConfig = appConfig;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1(this.$avatarBitmap, this.$context, this.$avatarImageUrl, this.$authorName, this.$appConfig, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            N n10 = this.$avatarBitmap;
            Context context = this.$context;
            String str = this.$avatarImageUrl;
            String str2 = this.$authorName;
            AppConfig appConfig = this.$appConfig;
            C6496s.e(appConfig);
            n10.f71759a = IntercomPushBitmapUtilsKt.loadAvatarBitmapBlocking(context, str, str2, appConfig);
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
