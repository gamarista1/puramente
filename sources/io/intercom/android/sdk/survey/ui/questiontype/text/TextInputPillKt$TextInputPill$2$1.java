package io.intercom.android.sdk.survey.ui.questiontype.text;

import H.b;
import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import q0.C2423i;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$2$1", f = "TextInputPill.kt", l = {74}, m = "invokeSuspend")
final class TextInputPillKt$TextInputPill$2$1 extends l implements p {
    final /* synthetic */ b $bringIntoViewRequester;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextInputPillKt$TextInputPill$2$1(b bVar, C6658d<? super TextInputPillKt$TextInputPill$2$1> dVar) {
        super(2, dVar);
        this.$bringIntoViewRequester = bVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new TextInputPillKt$TextInputPill$2$1(this.$bringIntoViewRequester, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((TextInputPillKt$TextInputPill$2$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            b bVar = this.$bringIntoViewRequester;
            this.label = 1;
            if (b.a(bVar, (C2423i) null, this, 1, (Object) null) == f10) {
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
