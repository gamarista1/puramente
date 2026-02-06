package io.intercom.android.sdk.m5.conversation.ui;

import D.A;
import Ef.m;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Y.p1;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1", f = "ConversationScreen.kt", l = {429}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$26$1 extends l implements p {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $lazyListJumpToBottomScrollOffset;
    final /* synthetic */ A $lazyListState;
    final /* synthetic */ C6798l $onConversationScrolled;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$26$1(A a10, float f10, C6798l lVar, boolean z10, boolean z11, C6658d<? super ConversationScreenKt$ConversationScreenContent$26$1> dVar) {
        super(2, dVar);
        this.$lazyListState = a10;
        this.$lazyListJumpToBottomScrollOffset = f10;
        this.$onConversationScrolled = lVar;
        this.$isLandscape = z10;
        this.$isLargeFont = z11;
    }

    /* access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(A a10) {
        return a10.x().k();
    }

    /* access modifiers changed from: private */
    public static final long invokeSuspend$lambda$2(boolean z10) {
        return z10 ? 200 : 0;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$26$1(this.$lazyListState, this.$lazyListJumpToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$26$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C5694f m10 = C5696h.m(new ConversationScreenKt$ConversationScreenContent$26$1$invokeSuspend$$inlined$map$1(p1.p(new s0(this.$lazyListState)), this.$lazyListJumpToBottomScrollOffset, this.$lazyListState), new t0());
            final C6798l lVar = this.$onConversationScrolled;
            final A a10 = this.$lazyListState;
            final boolean z10 = this.$isLandscape;
            final boolean z11 = this.$isLargeFont;
            AnonymousClass4 r12 = new C5695g() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                    return emit(((Boolean) obj).booleanValue(), (C6658d<? super C6514M>) dVar);
                }

                public final Object emit(boolean z10, C6658d<? super C6514M> dVar) {
                    boolean z11 = z10;
                    lVar.invoke(new ConversationScrolledState(z11, 0, z10, z11, m.d(a10.x().h() - 1, 0)));
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (m10.collect(r12, this) == f10) {
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
