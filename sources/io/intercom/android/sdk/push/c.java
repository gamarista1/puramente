package io.intercom.android.sdk.push;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.android.sdk.identity.AppConfig;
import yf.p;

public final /* synthetic */ class c implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SystemNotificationManager f70084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PushPayload f70085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f70086c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppConfig f70087d;

    public /* synthetic */ c(SystemNotificationManager systemNotificationManager, PushPayload pushPayload, Context context, AppConfig appConfig) {
        this.f70084a = systemNotificationManager;
        this.f70085b = pushPayload;
        this.f70086c = context;
        this.f70087d = appConfig;
    }

    public final Object invoke(Object obj, Object obj2) {
        return SystemNotificationManager.createNotification$lambda$1(this.f70084a, this.f70085b, this.f70086c, this.f70087d, (Bitmap) obj, (Bitmap) obj2);
    }
}
