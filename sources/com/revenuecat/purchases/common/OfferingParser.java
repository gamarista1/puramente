package com.revenuecat.purchases.common;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.o;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bJ4\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J,\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0013\u001a\u00020\u0006H$¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser;", "", "()V", "createOffering", "Lcom/revenuecat/purchases/Offering;", "offeringJson", "Lorg/json/JSONObject;", "productsById", "", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "uiConfig", "Lcom/revenuecat/purchases/UiConfig;", "createOfferings", "Lcom/revenuecat/purchases/Offerings;", "offeringsJson", "createPackage", "Lcom/revenuecat/purchases/Package;", "packageJson", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "findMatchingProduct", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OfferingParser {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C6538b json = o.b((C6538b) null, OfferingParser$Companion$json$1.INSTANCE, 1, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser$Companion;", "", "<init>", "()V", "Llh/b;", "json", "Llh/b;", "getJson$purchases_defaultsRelease", "()Llh/b;", "getJson$purchases_defaultsRelease$annotations", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }

        public final C6538b getJson$purchases_defaultsRelease() {
            return OfferingParser.json;
        }

        private Companion() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.revenuecat.purchases.Offering createOffering(org.json.JSONObject r10, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> r11, com.revenuecat.purchases.UiConfig r12) {
        /*
            r9 = this;
            java.lang.String r0 = "offeringJson"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "productsById"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "identifier"
            java.lang.String r2 = r10.getString(r0)
            java.lang.String r0 = "metadata"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            if (r0 == 0) goto L_0x0022
            r1 = 1
            java.util.Map r0 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r4 = r0
            goto L_0x0027
        L_0x0022:
            java.util.Map r0 = mf.O.i()
            goto L_0x0020
        L_0x0027:
            java.lang.String r0 = "packages"
            org.json.JSONArray r0 = r10.getJSONArray(r0)
            com.revenuecat.purchases.PresentedOfferingContext r1 = new com.revenuecat.purchases.PresentedOfferingContext
            java.lang.String r3 = "offeringIdentifier"
            kotlin.jvm.internal.C6496s.g(r2, r3)
            r1.<init>(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r3 = r0.length()
            r6 = 0
        L_0x0041:
            if (r6 >= r3) goto L_0x0058
            org.json.JSONObject r7 = r0.getJSONObject(r6)
            java.lang.String r8 = "packageJson"
            kotlin.jvm.internal.C6496s.g(r7, r8)
            com.revenuecat.purchases.Package r7 = r9.createPackage(r7, r11, r1)
            if (r7 == 0) goto L_0x0055
            r5.add(r7)
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x0041
        L_0x0058:
            java.lang.String r11 = "paywall"
            org.json.JSONObject r11 = r10.optJSONObject(r11)
            java.lang.String r0 = "it.toString()"
            r1 = 0
            if (r11 == 0) goto L_0x0085
            lh.b r3 = json     // Catch:{ Exception -> 0x007c }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x007c }
            kotlin.jvm.internal.C6496s.g(r11, r0)     // Catch:{ Exception -> 0x007c }
            r3.a()     // Catch:{ Exception -> 0x007c }
            com.revenuecat.purchases.paywalls.PaywallData$Companion r6 = com.revenuecat.purchases.paywalls.PaywallData.Companion     // Catch:{ Exception -> 0x007c }
            gh.b r6 = r6.serializer()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r11 = r3.b(r6, r11)     // Catch:{ Exception -> 0x007c }
            com.revenuecat.purchases.paywalls.PaywallData r11 = (com.revenuecat.purchases.paywalls.PaywallData) r11     // Catch:{ Exception -> 0x007c }
            goto L_0x0083
        L_0x007c:
            r11 = move-exception
            java.lang.String r3 = "Error deserializing paywall data"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r3, r11)
            r11 = r1
        L_0x0083:
            r6 = r11
            goto L_0x0086
        L_0x0085:
            r6 = r1
        L_0x0086:
            java.lang.String r11 = "paywall_components"
            org.json.JSONObject r11 = r10.optJSONObject(r11)
            if (r11 == 0) goto L_0x00ad
            lh.b r3 = json     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00a7 }
            kotlin.jvm.internal.C6496s.g(r11, r0)     // Catch:{ all -> 0x00a7 }
            r3.a()     // Catch:{ all -> 0x00a7 }
            com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData$Companion r0 = com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData.Companion     // Catch:{ all -> 0x00a7 }
            gh.b r0 = r0.serializer()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r11 = r3.b(r0, r11)     // Catch:{ all -> 0x00a7 }
            com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData r11 = (com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData) r11     // Catch:{ all -> 0x00a7 }
            goto L_0x00ae
        L_0x00a7:
            r11 = move-exception
            java.lang.String r0 = "Error deserializing paywall components data"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r0, r11)
        L_0x00ad:
            r11 = r1
        L_0x00ae:
            if (r11 == 0) goto L_0x00b9
            if (r12 == 0) goto L_0x00b9
            com.revenuecat.purchases.Offering$PaywallComponents r0 = new com.revenuecat.purchases.Offering$PaywallComponents
            r0.<init>(r12, r11)
            r7 = r0
            goto L_0x00ba
        L_0x00b9:
            r7 = r1
        L_0x00ba:
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x00d1
            com.revenuecat.purchases.Offering r11 = new com.revenuecat.purchases.Offering
            java.lang.String r12 = "description"
            java.lang.String r3 = r10.getString(r12)
            java.lang.String r10 = "offeringJson.getString(\"description\")"
            kotlin.jvm.internal.C6496s.g(r3, r10)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x00d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.OfferingParser.createOffering(org.json.JSONObject, java.util.Map, com.revenuecat.purchases.UiConfig):com.revenuecat.purchases.Offering");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.revenuecat.purchases.Offerings createOfferings(org.json.JSONObject r13, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "offeringsJson"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "productsById"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            com.revenuecat.purchases.common.LogIntent r0 = com.revenuecat.purchases.common.LogIntent.DEBUG
            int r1 = r14.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r3 = "Building offerings response with %d products"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.String r3 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r3)
            com.revenuecat.purchases.common.LogWrapperKt.log(r0, r1)
            java.lang.String r0 = "offerings"
            org.json.JSONArray r0 = r13.getJSONArray(r0)
            java.lang.String r1 = "current_offering_id"
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r4 = "ui_config"
            org.json.JSONObject r4 = r13.optJSONObject(r4)
            r5 = 0
            if (r4 == 0) goto L_0x0061
            lh.b r6 = json     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x005b }
            java.lang.String r7 = "it.toString()"
            kotlin.jvm.internal.C6496s.g(r4, r7)     // Catch:{ all -> 0x005b }
            r6.a()     // Catch:{ all -> 0x005b }
            com.revenuecat.purchases.UiConfig$Companion r7 = com.revenuecat.purchases.UiConfig.Companion     // Catch:{ all -> 0x005b }
            gh.b r7 = r7.serializer()     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r6.b(r7, r4)     // Catch:{ all -> 0x005b }
            com.revenuecat.purchases.UiConfig r4 = (com.revenuecat.purchases.UiConfig) r4     // Catch:{ all -> 0x005b }
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            java.lang.String r6 = "Error deserializing ui_config"
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(r6, r4)
        L_0x0061:
            r4 = r5
        L_0x0062:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            int r7 = r0.length()
            r8 = 0
            r9 = r8
        L_0x006d:
            if (r9 >= r7) goto L_0x00aa
            org.json.JSONObject r10 = r0.getJSONObject(r9)
            java.lang.String r11 = "offeringJson"
            kotlin.jvm.internal.C6496s.g(r10, r11)
            com.revenuecat.purchases.Offering r10 = r12.createOffering(r10, r14, r4)
            if (r10 == 0) goto L_0x00a7
            java.lang.String r11 = r10.getIdentifier()
            r6.put(r11, r10)
            java.util.List r11 = r10.getAvailablePackages()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x00a7
            java.lang.String r10 = r10.getIdentifier()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r2)
            java.lang.String r11 = "There's a problem with your configuration. No packages could be found for offering with identifier %s. This could be due to Products not being configured correctly in the RevenueCat dashboard or Play Store.\nTo configure products, follow the instructions in https://rev.cat/how-to-configure-offerings.\nMore information: https://rev.cat/why-are-offerings-empty"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            kotlin.jvm.internal.C6496s.g(r10, r3)
            com.revenuecat.purchases.common.LogUtilsKt.warnLog(r10)
        L_0x00a7:
            int r9 = r9 + 1
            goto L_0x006d
        L_0x00aa:
            java.lang.String r14 = "targeting"
            org.json.JSONObject r14 = r13.optJSONObject(r14)
            if (r14 == 0) goto L_0x00d1
            java.lang.String r0 = "revision"
            java.lang.Integer r0 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableInt(r14, r0)
            java.lang.String r3 = "rule_id"
            java.lang.String r14 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(r14, r3)
            if (r0 == 0) goto L_0x00cc
            if (r14 == 0) goto L_0x00cc
            com.revenuecat.purchases.Offerings$Targeting r3 = new com.revenuecat.purchases.Offerings$Targeting
            int r0 = r0.intValue()
            r3.<init>(r0, r14)
            goto L_0x00d2
        L_0x00cc:
            java.lang.String r14 = "Error while parsing targeting - skipping"
            com.revenuecat.purchases.common.LogUtilsKt.warnLog(r14)
        L_0x00d1:
            r3 = r5
        L_0x00d2:
            java.lang.String r14 = "placements"
            org.json.JSONObject r13 = r13.optJSONObject(r14)
            if (r13 == 0) goto L_0x00fc
            java.lang.String r14 = "fallback_offering_id"
            java.lang.String r14 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.getNullableString(r13, r14)
            java.lang.String r0 = "offering_ids_by_placement"
            org.json.JSONObject r13 = r13.optJSONObject(r0)
            if (r13 == 0) goto L_0x00f3
            java.util.Map r13 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap$default(r13, r8, r2, r5)
            if (r13 == 0) goto L_0x00f3
            java.util.Map r13 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(r13)
            goto L_0x00f4
        L_0x00f3:
            r13 = r5
        L_0x00f4:
            if (r13 == 0) goto L_0x00fc
            com.revenuecat.purchases.Offerings$Placements r0 = new com.revenuecat.purchases.Offerings$Placements
            r0.<init>(r14, r13)
            goto L_0x00fd
        L_0x00fc:
            r0 = r5
        L_0x00fd:
            com.revenuecat.purchases.Offerings r13 = new com.revenuecat.purchases.Offerings
            java.lang.Object r14 = r6.get(r1)
            com.revenuecat.purchases.Offering r14 = (com.revenuecat.purchases.Offering) r14
            if (r14 == 0) goto L_0x010b
            com.revenuecat.purchases.Offering r5 = com.revenuecat.purchases.OfferingsKt.withPresentedContext(r14, r5, r3)
        L_0x010b:
            r13.<init>(r5, r6, r0, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.OfferingParser.createOfferings(org.json.JSONObject, java.util.Map):com.revenuecat.purchases.Offerings");
    }

    public final Package createPackage(JSONObject jSONObject, Map<String, ? extends List<? extends StoreProduct>> map, PresentedOfferingContext presentedOfferingContext) {
        C6496s.h(jSONObject, "packageJson");
        C6496s.h(map, "productsById");
        C6496s.h(presentedOfferingContext, "presentedOfferingContext");
        String string = jSONObject.getString("identifier");
        StoreProduct findMatchingProduct = findMatchingProduct(map, jSONObject);
        C6496s.g(string, "packageIdentifier");
        PackageType access$toPackageType = OfferingParserKt.toPackageType(string);
        if (findMatchingProduct != null) {
            return new Package(string, access$toPackageType, findMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject);
}
