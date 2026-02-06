package io.intercom.android.sdk.m5.helpcenter.ui;

import Y.C1500m;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import j3.C2124A;
import j3.C2128E;
import j3.H;
import j3.k;
import j3.n;
import j3.x;
import j3.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2719b;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterScreenKt$HelpCenterNavGraph$1$1 implements r {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ x $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterNavGraph$1$1(HelpCenterViewModel helpCenterViewModel, List<String> list, x xVar) {
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
        this.$navController = xVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(x xVar, String str) {
        C6496s.h(xVar, "$navController");
        C6496s.h(str, "collectionId");
        n.V(xVar, "COLLECTION_DETAILS/" + str, (z) null, (C2128E.a) null, 6, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(x xVar, String str) {
        C6496s.h(xVar, "$navController");
        C6496s.h(str, "collectionId");
        xVar.U("COLLECTION_DETAILS/" + str + "?startDestination=true", new v());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2(C2124A a10) {
        C6496s.h(a10, "$this$navigate");
        a10.d("COLLECTIONS", new u());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2$lambda$1(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(true);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(this.$viewModel, this.$collectionIds, new w(this.$navController), new x(this.$navController), mVar, 72);
    }
}
