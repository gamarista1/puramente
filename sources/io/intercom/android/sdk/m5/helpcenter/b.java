package io.intercom.android.sdk.m5.helpcenter;

import yf.C6787a;

public final /* synthetic */ class b implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HelpCenterViewModel f69630a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f69631b;

    public /* synthetic */ b(HelpCenterViewModel helpCenterViewModel, String str) {
        this.f69630a = helpCenterViewModel;
        this.f69631b = str;
    }

    public final Object invoke() {
        return HelpCenterViewModel$fetchCollectionDetails$1.invokeSuspend$lambda$0(this.f69630a, this.f69631b);
    }
}
