package io.intercom.android.sdk.m5.conversation.ui.components;

import D.A;
import Ug.K;
import Xg.C5696h;
import Y.C1510r0;
import Y.p1;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1", f = "LazyMessageList.kt", l = {138}, m = "invokeSuspend")
final class LazyMessageListKt$LazyMessageList$12$1 extends l implements p {
    final /* synthetic */ C1510r0 $isListAtTheBottom$delegate;
    final /* synthetic */ A $lazyListState;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Llf/M;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$3", f = "LazyMessageList.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$3  reason: invalid class name */
    static final class AnonymousClass3 extends l implements p {
        /* synthetic */ boolean Z$0;
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            AnonymousClass3 r02 = new AnonymousClass3(r0Var, dVar);
            r02.Z$0 = ((Boolean) obj).booleanValue();
            return r02;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (C6658d<? super C6514M>) (C6658d) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                LazyMessageListKt.LazyMessageList$lambda$18(r0Var, this.Z$0);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass3) create(Boolean.valueOf(z10), dVar)).invokeSuspend(C6514M.f71813a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$12$1(A a10, C1510r0 r0Var, C6658d<? super LazyMessageListKt$LazyMessageList$12$1> dVar) {
        super(2, dVar);
        this.$lazyListState = a10;
        this.$isListAtTheBottom$delegate = r0Var;
    }

    /* access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(A a10) {
        return a10.x().k();
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$12$1(this.$lazyListState, this.$isListAtTheBottom$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((LazyMessageListKt$LazyMessageList$12$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            LazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1 lazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1 = new LazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1(p1.p(new S(this.$lazyListState)));
            final C1510r0 r0Var = this.$isListAtTheBottom$delegate;
            AnonymousClass3 r62 = new AnonymousClass3((C6658d<? super AnonymousClass3>) null);
            this.label = 1;
            if (C5696h.i(lazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1, r62, this) == f10) {
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
