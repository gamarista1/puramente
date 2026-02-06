package io.intercom.android.sdk.m5.helpcenter.ui;

import Y.C1500m;
import Y.C1521x;
import Y.J0;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import j3.C2126C;
import j3.C2135f;
import j3.v;
import j3.x;
import java.util.List;
import k0.c;
import k0.i;
import k3.C2159k;
import k3.C2161m;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00038\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "viewModel", "", "", "collectionIds", "Lkotlin/Function0;", "Llf/M;", "onCloseClick", "", "navIcon", "HelpCenterScreen", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Ljava/util/List;Lyf/a;ILY/m;I)V", "Lj3/x;", "navController", "startDestination", "Lk0/i;", "modifier", "HelpCenterNavGraph", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Lj3/x;Ljava/lang/String;Ljava/util/List;Lk0/i;LY/m;II)V", "START_DESTINATION", "Ljava/lang/String;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterScreenKt {
    private static final String START_DESTINATION = "startDestination";

    public static final void HelpCenterNavGraph(HelpCenterViewModel helpCenterViewModel, x xVar, String str, List<String> list, i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        HelpCenterViewModel helpCenterViewModel2 = helpCenterViewModel;
        x xVar2 = xVar;
        List<String> list2 = list;
        C6496s.h(helpCenterViewModel2, "viewModel");
        C6496s.h(xVar2, "navController");
        C6496s.h(str, START_DESTINATION);
        C6496s.h(list2, "collectionIds");
        C1500m h10 = mVar.h(686627856);
        if ((i11 & 16) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        C2161m.b(xVar, str, aVar, (c) null, (String) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, new r(helpCenterViewModel2, list2, xVar2, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), h10, ((i10 >> 3) & 112) | 8 | ((i10 >> 6) & 896), 0, 1016);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new s(helpCenterViewModel, xVar, str, list, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterNavGraph$lambda$3(HelpCenterViewModel helpCenterViewModel, List list, x xVar, Context context, v vVar) {
        HelpCenterViewModel helpCenterViewModel2 = helpCenterViewModel;
        List list2 = list;
        x xVar2 = xVar;
        Context context2 = context;
        C6496s.h(helpCenterViewModel2, "$viewModel");
        C6496s.h(list2, "$collectionIds");
        C6496s.h(xVar2, "$navController");
        C6496s.h(context2, "$context");
        C6496s.h(vVar, "$this$NavHost");
        C2159k.b(vVar, "COLLECTIONS", (List) null, (List) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, g0.c.c(-1869047411, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$1(helpCenterViewModel2, list2, xVar2)), 254, (Object) null);
        v vVar2 = vVar;
        C2159k.b(vVar2, "COLLECTION_DETAILS/{id}?startDestination={startDestination}", C6565s.q(C2135f.a("id", new p()), C2135f.a(START_DESTINATION, new q())), (List) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, g0.c.c(2018839094, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$4(helpCenterViewModel2, context2, xVar2)), 252, (Object) null);
        C2159k.b(vVar2, "COLLECTION_DETAILS", (List) null, (List) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, g0.c.c(-157077227, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$5(helpCenterViewModel2, list2, context2, xVar2)), 254, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterNavGraph$lambda$3$lambda$1(j3.i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterNavGraph$lambda$3$lambda$2(j3.i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        iVar.b(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterNavGraph$lambda$4(HelpCenterViewModel helpCenterViewModel, x xVar, String str, List list, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(helpCenterViewModel, "$viewModel");
        C6496s.h(xVar, "$navController");
        C6496s.h(str, "$startDestination");
        C6496s.h(list, "$collectionIds");
        HelpCenterNavGraph(helpCenterViewModel, xVar, str, list, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void HelpCenterScreen(HelpCenterViewModel helpCenterViewModel, List<String> list, C6787a aVar, int i10, C1500m mVar, int i11) {
        C6496s.h(helpCenterViewModel, "viewModel");
        C6496s.h(list, "collectionIds");
        C6496s.h(aVar, "onCloseClick");
        C1500m h10 = mVar.h(1421214035);
        C1521x.a(AndroidCompositionLocals_androidKt.g().d(helpCenterViewModel.localizedContext((Context) h10.m(AndroidCompositionLocals_androidKt.g()))), g0.c.e(-267860845, true, new HelpCenterScreenKt$HelpCenterScreen$1(i10, helpCenterViewModel, aVar, list), h10, 54), h10, J0.f9784i | 48);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(helpCenterViewModel, list, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterScreen$lambda$0(HelpCenterViewModel helpCenterViewModel, List list, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(helpCenterViewModel, "$viewModel");
        C6496s.h(list, "$collectionIds");
        C6496s.h(aVar, "$onCloseClick");
        HelpCenterScreen(helpCenterViewModel, list, aVar, i10, mVar, M0.a(i11 | 1));
        return C6514M.f71813a;
    }
}
