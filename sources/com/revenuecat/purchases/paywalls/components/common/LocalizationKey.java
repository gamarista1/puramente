package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C5985i
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class LocalizationKey {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return LocalizationKey$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private /* synthetic */ LocalizationKey(String str) {
        this.value = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LocalizationKey m112boximpl(String str) {
        return new LocalizationKey(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m113constructorimpl(String str) {
        C6496s.h(str, "value");
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m114equalsimpl(String str, Object obj) {
        return (obj instanceof LocalizationKey) && C6496s.c(str, ((LocalizationKey) obj).m118unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m115equalsimpl0(String str, String str2) {
        return C6496s.c(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m116hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m117toStringimpl(String str) {
        return "LocalizationKey(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m114equalsimpl(this.value, obj);
    }

    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m116hashCodeimpl(this.value);
    }

    public String toString() {
        return m117toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m118unboximpl() {
        return this.value;
    }
}
