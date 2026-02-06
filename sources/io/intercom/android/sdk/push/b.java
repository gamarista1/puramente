package io.intercom.android.sdk.push;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.android.sdk.identity.AppConfig;
import yf.p;

public final /* synthetic */ class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SystemNotificationManager f70080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PushPayload f70081b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f70082c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppConfig f70083d;

    public /* synthetic */ b(SystemNotificationManager systemNotificationManager, PushPayload pushPayload, Context context, AppConfig appConfig) {
        this.f70080a = systemNotificationManager;
        this.f70081b = pushPayload;
        this.f70082c = context;
        this.f70083d = appConfig;
    }

    public final Object invoke(Object obj, Object obj2) {
        return SystemNotificationManager.createPushOnlyNotification$lambda$0(this.f70080a, this.f70081b, this.f70082c, this.f70083d, (Bitmap) obj, (Bitmap) obj2);
    }
}
