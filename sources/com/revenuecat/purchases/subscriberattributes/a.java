package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import java.util.Observable;
import java.util.Observer;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SubscriberAttributesManager.ObtainDeviceIdentifiersObservable f59546a;

    public /* synthetic */ a(SubscriberAttributesManager.ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable) {
        this.f59546a = obtainDeviceIdentifiersObservable;
    }

    public final void update(Observable observable, Object obj) {
        SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f59546a, observable, obj);
    }
}
