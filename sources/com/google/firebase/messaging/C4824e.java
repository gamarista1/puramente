package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C1587a;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.e  reason: case insensitive filesystem */
public abstract class C4824e {

    /* renamed from: a  reason: collision with root package name */
    public static final long f57514a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        public static C1587a a(Bundle bundle) {
            C1587a aVar = new C1587a();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals(TicketDetailDestinationKt.LAUNCHED_FROM) && !next.equals("message_type") && !next.equals("collapse_key")) {
                        aVar.put(next, str);
                    }
                }
            }
            return aVar;
        }
    }
}
