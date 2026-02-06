package com.revenuecat.purchases.amazon;

import Sg.p;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"pattern", "Ljava/util/regex/Pattern;", "createPeriod", "Lcom/revenuecat/purchases/models/Period;", "", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "marketplace", "parsePriceUsingRegex", "Ljava/math/BigDecimal;", "toStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/amazon/device/iap/model/Product;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern compile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        C6496s.g(compile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = compile;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r9.equals("SemiAnnually") == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r9.equals("Annually") == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r9 = Sg.p.F0(r9, new java.lang.String[]{com.fasterxml.jackson.core.util.MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        if (r9.size() != 2) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        if (r9 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        r0 = (java.lang.String) mf.C6565s.q0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        r0 = Sg.p.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        r0 = r0.intValue();
        r9 = java.lang.String.valueOf(Sg.p.j1((java.lang.CharSequence) r9.get(1)));
        kotlin.jvm.internal.C6496s.f(r9, "null cannot be cast to non-null type java.lang.String");
        r9 = r9.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.C6496s.g(r9, "this as java.lang.String).toUpperCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010b, code lost:
        return com.revenuecat.purchases.models.Period.Factory.create('P' + r0 + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r9.equals("Annual") == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return new com.revenuecat.purchases.models.Period(6, com.revenuecat.purchases.models.Period.Unit.MONTH, "P6M");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.YEAR, "P1Y");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r9.equals("SemiAnnual") == false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.revenuecat.purchases.models.Period createPeriod(java.lang.String r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            int r0 = r9.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case -2115097178: goto L_0x009f;
                case -1707840351: goto L_0x008b;
                case -1393678355: goto L_0x0077;
                case -580032564: goto L_0x0063;
                case -308855462: goto L_0x004e;
                case 347098056: goto L_0x003a;
                case 357220109: goto L_0x0030;
                case 937940249: goto L_0x001a;
                case 1965874687: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x00a7
        L_0x0010:
            java.lang.String r0 = "Annual"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x00a7
        L_0x001a:
            java.lang.String r0 = "Quarterly"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0024
            goto L_0x00a7
        L_0x0024:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.MONTH
            java.lang.String r1 = "P3M"
            r2 = 3
            r9.<init>(r2, r0, r1)
            goto L_0x0117
        L_0x0030:
            java.lang.String r0 = "SemiAnnual"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x00a7
        L_0x003a:
            java.lang.String r0 = "BiWeekly"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x00a7
        L_0x0043:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.WEEK
            java.lang.String r2 = "P2W"
            r9.<init>(r1, r0, r2)
            goto L_0x0117
        L_0x004e:
            java.lang.String r0 = "SemiAnnually"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x00a7
        L_0x0057:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.MONTH
            java.lang.String r1 = "P6M"
            r2 = 6
            r9.<init>(r2, r0, r1)
            goto L_0x0117
        L_0x0063:
            java.lang.String r0 = "Annually"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x00a7
        L_0x006c:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.YEAR
            java.lang.String r1 = "P1Y"
            r9.<init>(r2, r0, r1)
            goto L_0x0117
        L_0x0077:
            java.lang.String r0 = "Monthly"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0080
            goto L_0x00a7
        L_0x0080:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.MONTH
            java.lang.String r1 = "P1M"
            r9.<init>(r2, r0, r1)
            goto L_0x0117
        L_0x008b:
            java.lang.String r0 = "Weekly"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0094
            goto L_0x00a7
        L_0x0094:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.WEEK
            java.lang.String r1 = "P1W"
            r9.<init>(r2, r0, r1)
            goto L_0x0117
        L_0x009f:
            java.lang.String r0 = "BiMonthly"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x010e
        L_0x00a7:
            java.lang.String r0 = " "
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            java.util.List r9 = Sg.p.F0(r3, r4, r5, r6, r7, r8)
            int r0 = r9.size()
            r3 = 0
            if (r0 != r1) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r9 = r3
        L_0x00bf:
            if (r9 == 0) goto L_0x010c
            java.lang.Object r0 = mf.C6565s.q0(r9)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r0 = Sg.p.m(r0)
            if (r0 == 0) goto L_0x010c
            int r0 = r0.intValue()
            java.lang.Object r9 = r9.get(r2)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            char r9 = Sg.p.j1(r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.C6496s.f(r9, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.C6496s.g(r9, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 80
            r1.append(r2)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.revenuecat.purchases.models.Period$Factory r0 = com.revenuecat.purchases.models.Period.Factory
            com.revenuecat.purchases.models.Period r9 = r0.create(r9)
            return r9
        L_0x010c:
            r9 = r3
            goto L_0x0117
        L_0x010e:
            com.revenuecat.purchases.models.Period r9 = new com.revenuecat.purchases.models.Period
            com.revenuecat.purchases.models.Period$Unit r0 = com.revenuecat.purchases.models.Period.Unit.MONTH
            java.lang.String r2 = "P2M"
            r9.<init>(r1, r0, r2)
        L_0x0117:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.amazon.StoreProductConversionsKt.createPeriod(java.lang.String):com.revenuecat.purchases.models.Period");
    }

    public static final Price createPrice(String str, String str2) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, b.f37490m);
        BigDecimal parsePriceUsingRegex = parsePriceUsingRegex(str);
        if (parsePriceUsingRegex == null) {
            parsePriceUsingRegex = BigDecimal.ZERO;
        }
        C6496s.g(parsePriceUsingRegex, "priceNumeric");
        BigDecimal multiply = parsePriceUsingRegex.multiply(new BigDecimal(UtilsKt.MICROS_MULTIPLIER));
        C6496s.g(multiply, "this.multiply(other)");
        return new Price(str, multiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(str2));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        Matcher matcher;
        C6496s.h(str, "<this>");
        Matcher matcher2 = pattern.matcher(str);
        if (matcher2.find()) {
            matcher = matcher2;
        } else {
            matcher = null;
        }
        if (matcher == null) {
            return null;
        }
        String group = matcher2.group();
        C6496s.g(group, "dirtyPrice");
        String obj = p.g1(p.D(p.D(p.D(group, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "", false, 4, (Object) null), " ", "", false, 4, (Object) null), " ", "", false, 4, (Object) null)).toString();
        List F02 = p.F0(obj, new String[]{".", f.f37529a}, false, 0, 6, (Object) null);
        if (F02.size() != 1) {
            if (((String) C6565s.z0(F02)).length() == 3) {
                obj = p.D(p.D(obj, ".", "", false, 4, (Object) null), f.f37529a, "", false, 4, (Object) null);
            } else {
                obj = C6565s.x0(C6565s.h0(F02, 1), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null) + '.' + ((String) C6565s.z0(F02));
            }
        }
        return new BigDecimal(p.g1(obj).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String str) {
        Period period;
        String str2 = str;
        C6496s.h(product, "<this>");
        C6496s.h(str2, b.f37490m);
        Period period2 = null;
        if (product.getPrice() == null) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String format = String.format(AmazonStrings.PRODUCT_PRICE_MISSING, Arrays.copyOf(new Object[]{product.getSku()}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            return null;
        }
        String price = product.getPrice();
        C6496s.g(price, b.f37501x);
        Price createPrice = createPrice(price, str2);
        String sku = product.getSku();
        C6496s.g(sku, "sku");
        ProductType productType = product.getProductType();
        C6496s.g(productType, "productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        C6496s.g(title, b.f37461S);
        String title2 = product.getTitle();
        C6496s.g(title2, b.f37461S);
        String description = product.getDescription();
        C6496s.g(description, b.f37480c);
        String subscriptionPeriod = product.getSubscriptionPeriod();
        if (subscriptionPeriod != null) {
            period = createPeriod(subscriptionPeriod);
        } else {
            period = null;
        }
        String smallIconUrl = product.getSmallIconUrl();
        C6496s.g(smallIconUrl, "smallIconUrl");
        String freeTrialPeriod = product.getFreeTrialPeriod();
        if (freeTrialPeriod != null) {
            period2 = createPeriod(freeTrialPeriod);
        }
        JSONObject json = product.toJSON();
        C6496s.g(json, "this.toJSON()");
        return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, period, createPrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, period2, json, (PresentedOfferingContext) null);
    }
}
