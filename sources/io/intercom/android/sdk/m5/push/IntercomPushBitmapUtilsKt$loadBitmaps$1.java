package io.intercom.android.sdk.m5.push;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.content.Context;
import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1", f = "IntercomPushBitmapUtils.kt", l = {56, 57}, m = "invokeSuspend")
final class IntercomPushBitmapUtilsKt$loadBitmaps$1 extends l implements p {
    final /* synthetic */ AppConfig $appConfig;
    final /* synthetic */ String $authorName;
    final /* synthetic */ N $avatarBitmap;
    final /* synthetic */ String $avatarImageUrl;
    final /* synthetic */ N $contentBitmap;
    final /* synthetic */ String $contentImageUrl;
    final /* synthetic */ Context $context;
    final /* synthetic */ p $onComplete;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IntercomPushBitmapUtilsKt$loadBitmaps$1(p pVar, N n10, N n11, Context context, String str, String str2, String str3, AppConfig appConfig, C6658d<? super IntercomPushBitmapUtilsKt$loadBitmaps$1> dVar) {
        super(2, dVar);
        this.$onComplete = pVar;
        this.$contentBitmap = n10;
        this.$avatarBitmap = n11;
        this.$context = context;
        this.$contentImageUrl = str;
        this.$avatarImageUrl = str2;
        this.$authorName = str3;
        this.$appConfig = appConfig;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        IntercomPushBitmapUtilsKt$loadBitmaps$1 intercomPushBitmapUtilsKt$loadBitmaps$1 = new IntercomPushBitmapUtilsKt$loadBitmaps$1(this.$onComplete, this.$contentBitmap, this.$avatarBitmap, this.$context, this.$contentImageUrl, this.$avatarImageUrl, this.$authorName, this.$appConfig, dVar);
        intercomPushBitmapUtilsKt$loadBitmaps$1.L$0 = obj;
        return intercomPushBitmapUtilsKt$loadBitmaps$1;
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C5600w0 w0Var;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            K k10 = (K) this.L$0;
            C5600w0 d10 = C5576k.d(k10, (g) null, (M) null, new IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(this.$contentBitmap, this.$context, this.$contentImageUrl, (C6658d<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1>) null), 3, (Object) null);
            C5600w0 d11 = C5576k.d(k10, (g) null, (M) null, new IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1(this.$avatarBitmap, this.$context, this.$avatarImageUrl, this.$authorName, this.$appConfig, (C6658d<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$avatarBitmapJob$1>) null), 3, (Object) null);
            this.L$0 = d11;
            this.label = 1;
            if (d10.B0(this) == f10) {
                return f10;
            }
            w0Var = d11;
        } else if (i10 == 1) {
            w0Var = (C5600w0) this.L$0;
            w.b(obj);
        } else if (i10 == 2) {
            try {
                w.b(obj);
                this.$onComplete.invoke(this.$contentBitmap.f71759a, this.$avatarBitmap.f71759a);
                return C6514M.f71813a;
            } catch (Throwable th2) {
                this.$onComplete.invoke(this.$contentBitmap.f71759a, this.$avatarBitmap.f71759a);
                throw th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.L$0 = null;
        this.label = 2;
        if (w0Var.B0(this) == f10) {
            return f10;
        }
        this.$onComplete.invoke(this.$contentBitmap.f71759a, this.$avatarBitmap.f71759a);
        return C6514M.f71813a;
    }
}
