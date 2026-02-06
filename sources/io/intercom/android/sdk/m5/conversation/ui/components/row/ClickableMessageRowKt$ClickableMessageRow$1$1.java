package io.intercom.android.sdk.m5.conversation.ui.components.row;

import D0.J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;
import z.C2938B;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LD0/J;", "Llf/M;", "<anonymous>", "(LD0/J;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt$ClickableMessageRow$1$1", f = "ClickableMessageRow.kt", l = {54}, m = "invokeSuspend")
final class ClickableMessageRowKt$ClickableMessageRow$1$1 extends l implements p {
    final /* synthetic */ C6787a $onClick;
    final /* synthetic */ C6787a $onLongClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableMessageRowKt$ClickableMessageRow$1$1(C6787a aVar, C6787a aVar2, C6658d<? super ClickableMessageRowKt$ClickableMessageRow$1$1> dVar) {
        super(2, dVar);
        this.$onLongClick = aVar;
        this.$onClick = aVar2;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(C6787a aVar, C2421g gVar) {
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$1(C6787a aVar, C2421g gVar) {
        aVar.invoke();
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        ClickableMessageRowKt$ClickableMessageRow$1$1 clickableMessageRowKt$ClickableMessageRow$1$1 = new ClickableMessageRowKt$ClickableMessageRow$1$1(this.$onLongClick, this.$onClick, dVar);
        clickableMessageRowKt$ClickableMessageRow$1$1.L$0 = obj;
        return clickableMessageRowKt$ClickableMessageRow$1$1;
    }

    public final Object invoke(J j10, C6658d<? super C6514M> dVar) {
        return ((ClickableMessageRowKt$ClickableMessageRow$1$1) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C6153u uVar = new C6153u(this.$onLongClick);
            C6154v vVar = new C6154v(this.$onClick);
            this.label = 1;
            if (C2938B.j((J) this.L$0, (C6798l) null, uVar, (q) null, vVar, this, 5, (Object) null) == f10) {
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
