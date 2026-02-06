package io.intercom.android.sdk.ui.extension;

import android.os.Bundle;
import android.os.Parcelable;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j3.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import u1.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/os/Parcelable;", "T", "Lj3/k;", "", "key", "Ljava/lang/Class;", "clazz", "defaultValue", "getParcelableObject", "(Lj3/k;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntryExtensionKt {
    public static final <T extends Parcelable> T getParcelableObject(k kVar, String str, Class<T> cls, T t10) {
        T t11;
        C6496s.h(kVar, "<this>");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(cls, "clazz");
        C6496s.h(t10, "defaultValue");
        Bundle c10 = kVar.c();
        if (c10 == null || (t11 = (Parcelable) b.a(c10, str, cls)) == null) {
            return t10;
        }
        return t11;
    }
}
