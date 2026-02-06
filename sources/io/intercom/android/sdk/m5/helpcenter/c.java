package io.intercom.android.sdk.m5.helpcenter;

import java.util.Set;
import yf.C6787a;

public final /* synthetic */ class c implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HelpCenterViewModel f69632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f69633b;

    public /* synthetic */ c(HelpCenterViewModel helpCenterViewModel, Set set) {
        this.f69632a = helpCenterViewModel;
        this.f69633b = set;
    }

    public final Object invoke() {
        return HelpCenterViewModel$fetchCollections$1.invokeSuspend$lambda$0(this.f69632a, this.f69633b);
    }
}
