package io.intercom.android.sdk.ui.preview.ui;

import D.A;
import D.k;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.C1510r0;
import Y.p1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1", f = "PreviewBottomBar.kt", l = {97}, m = "invokeSuspend")
final class PreviewBottomBarKt$ThumbnailList$1$1 extends l implements p {
    final /* synthetic */ A $listState;
    final /* synthetic */ C1510r0 $visibleItems;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewBottomBarKt$ThumbnailList$1$1(A a10, C1510r0 r0Var, C6658d<? super PreviewBottomBarKt$ThumbnailList$1$1> dVar) {
        super(2, dVar);
        this.$listState = a10;
        this.$visibleItems = r0Var;
    }

    /* access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(A a10) {
        Iterable<k> k10 = a10.x().k();
        ArrayList arrayList = new ArrayList(C6565s.y(k10, 10));
        for (k index : k10) {
            arrayList.add(Integer.valueOf(index.getIndex()));
        }
        return arrayList;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new PreviewBottomBarKt$ThumbnailList$1$1(this.$listState, this.$visibleItems, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((PreviewBottomBarKt$ThumbnailList$1$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C5694f p10 = p1.p(new C6357j(this.$listState));
            final C1510r0 r0Var = this.$visibleItems;
            AnonymousClass2 r12 = new C5695g() {
                public final Object emit(List<Integer> list, C6658d<? super C6514M> dVar) {
                    r0Var.setValue(list);
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (p10.collect(r12, this) == f10) {
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
