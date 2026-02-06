package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import gh.C5978b;
import gh.C5985i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C5985i(with = LocalizationDataSerializer.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "", "Companion", "Image", "Text", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public interface LocalizationData {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C5978b serializer() {
            return LocalizationDataSerializer.INSTANCE;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Image implements LocalizationData {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final ThemeImageUrls value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return LocalizationData$Image$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Image(ThemeImageUrls themeImageUrls) {
            this.value = themeImageUrls;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Image m98boximpl(ThemeImageUrls themeImageUrls) {
            return new Image(themeImageUrls);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static ThemeImageUrls m99constructorimpl(ThemeImageUrls themeImageUrls) {
            C6496s.h(themeImageUrls, "value");
            return themeImageUrls;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m100equalsimpl(ThemeImageUrls themeImageUrls, Object obj) {
            return (obj instanceof Image) && C6496s.c(themeImageUrls, ((Image) obj).m104unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m101equalsimpl0(ThemeImageUrls themeImageUrls, ThemeImageUrls themeImageUrls2) {
            return C6496s.c(themeImageUrls, themeImageUrls2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m102hashCodeimpl(ThemeImageUrls themeImageUrls) {
            return themeImageUrls.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m103toStringimpl(ThemeImageUrls themeImageUrls) {
            return "Image(value=" + themeImageUrls + ')';
        }

        public boolean equals(Object obj) {
            return m100equalsimpl(this.value, obj);
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return m102hashCodeimpl(this.value);
        }

        public String toString() {
            return m103toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ ThemeImageUrls m104unboximpl() {
            return this.value;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0001\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Text implements LocalizationData {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return LocalizationData$Text$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Text(String str) {
            this.value = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Text m105boximpl(String str) {
            return new Text(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m106constructorimpl(String str) {
            C6496s.h(str, "value");
            return str;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m107equalsimpl(String str, Object obj) {
            return (obj instanceof Text) && C6496s.c(str, ((Text) obj).m111unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m108equalsimpl0(String str, String str2) {
            return C6496s.c(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m109hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m110toStringimpl(String str) {
            return "Text(value=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m107equalsimpl(this.value, obj);
        }

        public final /* synthetic */ String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m109hashCodeimpl(this.value);
        }

        public String toString() {
            return m110toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m111unboximpl() {
            return this.value;
        }
    }
}
