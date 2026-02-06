package com.revenuecat.purchases.amazon.attribution;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import yf.C6798l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/amazon/attribution/AmazonDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "<init>", "()V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "", "", "Llf/M;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lyf/l;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    public void getDeviceIdentifiers(Application application, C6798l lVar) {
        String str;
        C6496s.h(application, "applicationContext");
        C6496s.h(lVar, "completion");
        try {
            ContentResolver contentResolver = application.getContentResolver();
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0) {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
                lVar.invoke(MapExtensionsKt.filterNotNullValues(O.l(C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), str), C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.f37475af), C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), b.f37475af))));
            }
        } catch (Settings.SettingNotFoundException e10) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String format = String.format(AttributionStrings.AMAZON_COULD_NOT_GET_ADID, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        }
        str = null;
        lVar.invoke(MapExtensionsKt.filterNotNullValues(O.l(C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), str), C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.f37475af), C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), b.f37475af))));
    }
}
