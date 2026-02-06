package com.revenuecat.purchases.google.attribution;

import android.app.Application;
import com.amazon.a.a.o.b;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import rd.C5192a;
import ya.C5288e;
import ya.C5289f;
import yf.C6798l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002XD¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/Dispatcher;)V", "Landroid/app/Application;", "applicationContext", "", "getAdvertisingID", "(Landroid/app/Application;)Ljava/lang/String;", "Lkotlin/Function1;", "", "Llf/M;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lyf/l;)V", "Lcom/revenuecat/purchases/common/Dispatcher;", "noPermissionAdvertisingIdValue", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher2) {
        C6496s.h(dispatcher2, "dispatcher");
        this.dispatcher = dispatcher2;
    }

    private final String getAdvertisingID(Application application) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
            if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                if (!C6496s.c(advertisingIdInfo.getId(), this.noPermissionAdvertisingIdValue)) {
                    return advertisingIdInfo.getId();
                }
                LogWrapperKt.log(LogIntent.WARNING, AttributionStrings.GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE);
            }
        } catch (C5288e e10) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String format = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
        } catch (C5289f e11) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            String format2 = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e11.getLocalizedMessage()}, 1));
            C6496s.g(format2, "format(this, *args)");
            LogWrapperKt.log(logIntent2, format2);
        } catch (TimeoutException e12) {
            LogIntent logIntent3 = LogIntent.GOOGLE_ERROR;
            String format3 = String.format(AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e12.getLocalizedMessage()}, 1));
            C6496s.g(format3, "format(this, *args)");
            LogWrapperKt.log(logIntent3, format3);
        } catch (IOException e13) {
            LogIntent logIntent4 = LogIntent.GOOGLE_ERROR;
            String format4 = String.format(AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e13.getLocalizedMessage()}, 1));
            C6496s.g(format4, "format(this, *args)");
            LogWrapperKt.log(logIntent4, format4);
        } catch (NullPointerException e14) {
            LogIntent logIntent5 = LogIntent.GOOGLE_ERROR;
            String format5 = String.format(AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e14.getLocalizedMessage()}, 1));
            C6496s.g(format5, "format(this, *args)");
            LogWrapperKt.log(logIntent5, format5);
        } catch (NoSuchMethodError unused) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, AttributionStrings.NO_SUCH_METHOD_WHEN_FETCHING_ADVERTISING_IDENTIFIER);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, C6798l lVar) {
        C6496s.h(googleDeviceIdentifiersFetcher, "this$0");
        C6496s.h(application, "$applicationContext");
        C6496s.h(lVar, "$completion");
        lVar.invoke(MapExtensionsKt.filterNotNullValues(O.l(C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.f37475af), C6502A.a(SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion.INSTANCE.getBackendKey(), b.f37475af))));
    }

    public void getDeviceIdentifiers(Application application, C6798l lVar) {
        C6496s.h(application, "applicationContext");
        C6496s.h(lVar, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new C5192a(this, application, lVar), (Delay) null, 2, (Object) null);
    }
}
