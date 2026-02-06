package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Ug.K;
import Y.A1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import p0.e;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$7", f = "MessageComposer.kt", l = {}, m = "invokeSuspend")
final class MessageComposerKt$MessageComposer$7 extends l implements p {
    final /* synthetic */ e $focusManager;
    final /* synthetic */ A1 $keyboardAsState$delegate;
    final /* synthetic */ SpeechRecognizerState $speechRecognizerState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MessageComposerKt$MessageComposer$7(SpeechRecognizerState speechRecognizerState, e eVar, A1 a12, C6658d<? super MessageComposerKt$MessageComposer$7> dVar) {
        super(2, dVar);
        this.$speechRecognizerState = speechRecognizerState;
        this.$focusManager = eVar;
        this.$keyboardAsState$delegate = a12;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new MessageComposerKt$MessageComposer$7(this.$speechRecognizerState, this.$focusManager, this.$keyboardAsState$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((MessageComposerKt$MessageComposer$7) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            if (MessageComposerKt.MessageComposer$lambda$25(this.$keyboardAsState$delegate).isDismissed() && !this.$speechRecognizerState.isListening()) {
                e.c(this.$focusManager, false, 1, (Object) null);
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
