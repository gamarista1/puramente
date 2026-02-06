package com.revenuecat.purchases;

import gh.C5978b;
import gh.C5985i;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import lf.v;
import lf.w;

@C5985i
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/Store;", "", "(Ljava/lang/String;I)V", "APP_STORE", "MAC_APP_STORE", "PLAY_STORE", "STRIPE", "PROMOTIONAL", "UNKNOWN_STORE", "AMAZON", "RC_BILLING", "EXTERNAL", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Store {
    APP_STORE,
    MAC_APP_STORE,
    PLAY_STORE,
    STRIPE,
    PROMOTIONAL,
    UNKNOWN_STORE,
    AMAZON,
    RC_BILLING,
    EXTERNAL;
    
    /* access modifiers changed from: private */
    public static final Lazy $cachedSerializer$delegate = null;
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/Store$Companion;", "", "<init>", "()V", "", "text", "Lcom/revenuecat/purchases/Store;", "fromString", "(Ljava/lang/String;)Lcom/revenuecat/purchases/Store;", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) Store.$cachedSerializer$delegate.getValue();
        }

        public final /* synthetic */ Store fromString(String str) {
            Store store;
            C6496s.h(str, AttributeType.TEXT);
            try {
                v.a aVar = v.f71841b;
                String upperCase = str.toUpperCase(Locale.ROOT);
                C6496s.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                store = v.b(Store.valueOf(upperCase));
            } catch (Throwable th2) {
                v.a aVar2 = v.f71841b;
                store = v.b(w.a(th2));
            }
            Store store2 = Store.UNKNOWN_STORE;
            if (v.g(store)) {
                store = store2;
            }
            return (Store) store;
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }
}
