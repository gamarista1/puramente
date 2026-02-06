package io.intercom.android.sdk.m5.navigation;

import Ug.K;
import Y.C1488g1;
import Y.C1500m;
import Y.C1505o0;
import Y.P;
import android.os.Bundle;
import androidx.activity.C1554j;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.R;
import j3.k;
import j3.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import v.C2719b;
import yf.p;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterDestinationKt$helpCenterDestination$7 implements r {
    final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2", f = "HelpCenterDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2  reason: invalid class name */
    static final class AnonymousClass2 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass2(dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                Injector.get().getMetricTracker().viewedSpace("help");
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    HelpCenterDestinationKt$helpCenterDestination$7(C1554j jVar, IntercomRootActivityArgs intercomRootActivityArgs, x xVar) {
        this.$rootActivity = jVar;
        this.$intercomRootActivityArgs = intercomRootActivityArgs;
        this.$navController = xVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(x xVar, C1554j jVar) {
        C6496s.h(xVar, "$navController");
        C6496s.h(jVar, "$rootActivity");
        if (xVar.K() == null) {
            jVar.finish();
        } else {
            xVar.X();
        }
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        List<String> n10;
        int i11;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        Bundle c10 = kVar.c();
        boolean z10 = c10 != null ? c10.getBoolean("isLaunchedProgrammatically") : false;
        HelpCenterViewModel.Companion companion = HelpCenterViewModel.Companion;
        C1554j jVar = this.$rootActivity;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        C6496s.g(helpCenterApi, "getHelpCenterApi(...)");
        HelpCenterViewModel create = companion.create(jVar, helpCenterApi, MetricTracker.Place.COLLECTION_LIST);
        mVar.T(-102150257);
        x xVar = this.$navController;
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            if (xVar.K() == null) {
                i11 = R.drawable.intercom_ic_close;
            } else if (z10) {
                i11 = R.drawable.intercom_ic_chevron_down;
            } else {
                i11 = R.drawable.intercom_ic_back;
            }
            A10 = C1488g1.a(i11);
            mVar.r(A10);
        }
        C1505o0 o0Var = (C1505o0) A10;
        mVar.M();
        IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
        if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionsArgs) {
            n10 = ((IntercomRootActivityArgs.HelpCenterCollectionsArgs) intercomRootActivityArgs).getCollectionIds();
        } else if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionArgs) {
            n10 = C6565s.e(((IntercomRootActivityArgs.HelpCenterCollectionArgs) intercomRootActivityArgs).getCollectionId());
        } else {
            n10 = C6565s.n();
        }
        HelpCenterScreenKt.HelpCenterScreen(create, n10, new M(this.$navController, this.$rootActivity), o0Var.b(), mVar, 72);
        P.g("", new AnonymousClass2((C6658d<? super AnonymousClass2>) null), mVar, 70);
    }
}
