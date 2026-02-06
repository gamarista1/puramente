package com.revenuecat.purchases.common.networking;

import android.net.Uri;
import com.amazon.a.a.o.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0003H&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0001\u000b\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint;", "", "pathTemplate", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "needsNonceToPerformSigning", "", "getNeedsNonceToPerformSigning", "()Z", "getPathTemplate", "supportsSignatureVerification", "getSupportsSignatureVerification", "getPath", "GetAmazonReceipt", "GetCustomerCenterConfig", "GetCustomerInfo", "GetOfferings", "GetProductEntitlementMapping", "LogIn", "PostAttributes", "PostDiagnostics", "PostPaywallEvents", "PostReceipt", "PostRedeemWebPurchase", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetAmazonReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerCenterConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerInfo;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetOfferings;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetProductEntitlementMapping;", "Lcom/revenuecat/purchases/common/networking/Endpoint$LogIn;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostAttributes;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostDiagnostics;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostPaywallEvents;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostRedeemWebPurchase;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Endpoint {
    private final String name;
    private final String pathTemplate;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetAmazonReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "receiptId", "(Ljava/lang/String;Ljava/lang/String;)V", "getReceiptId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "", "getPath", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GetAmazonReceipt extends Endpoint {
        private final String receiptId;
        private final String userId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetAmazonReceipt(String str, String str2) {
            super("/receipts/amazon/%s/%s", "get_amazon_receipt", (DefaultConstructorMarker) null);
            C6496s.h(str, "userId");
            C6496s.h(str2, b.f37447E);
            this.userId = str;
            this.receiptId = str2;
        }

        public static /* synthetic */ GetAmazonReceipt copy$default(GetAmazonReceipt getAmazonReceipt, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getAmazonReceipt.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = getAmazonReceipt.receiptId;
            }
            return getAmazonReceipt.copy(str, str2);
        }

        public final String component1() {
            return this.userId;
        }

        public final String component2() {
            return this.receiptId;
        }

        public final GetAmazonReceipt copy(String str, String str2) {
            C6496s.h(str, "userId");
            C6496s.h(str2, b.f37447E);
            return new GetAmazonReceipt(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAmazonReceipt)) {
                return false;
            }
            GetAmazonReceipt getAmazonReceipt = (GetAmazonReceipt) obj;
            return C6496s.c(this.userId, getAmazonReceipt.userId) && C6496s.c(this.receiptId, getAmazonReceipt.receiptId);
        }

        public String getPath() {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), this.receiptId}, 2));
            C6496s.g(format, "format(this, *args)");
            return format;
        }

        public final String getReceiptId() {
            return this.receiptId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.receiptId.hashCode();
        }

        public String toString() {
            return "GetAmazonReceipt(userId=" + this.userId + ", receiptId=" + this.receiptId + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerCenterConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getPath", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GetCustomerCenterConfig extends Endpoint {
        private final String userId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetCustomerCenterConfig(String str) {
            super("/customercenter/%s", "get_customer_center_config", (DefaultConstructorMarker) null);
            C6496s.h(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetCustomerCenterConfig copy$default(GetCustomerCenterConfig getCustomerCenterConfig, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getCustomerCenterConfig.userId;
            }
            return getCustomerCenterConfig.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerCenterConfig copy(String str) {
            C6496s.h(str, "userId");
            return new GetCustomerCenterConfig(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerCenterConfig) && C6496s.c(this.userId, ((GetCustomerCenterConfig) obj).userId);
        }

        public String getPath() {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            C6496s.g(format, "format(this, *args)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerCenterConfig(userId=" + this.userId + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerInfo;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getPath", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GetCustomerInfo extends Endpoint {
        private final String userId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetCustomerInfo(String str) {
            super("/subscribers/%s", "get_customer", (DefaultConstructorMarker) null);
            C6496s.h(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetCustomerInfo copy$default(GetCustomerInfo getCustomerInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getCustomerInfo.userId;
            }
            return getCustomerInfo.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerInfo copy(String str) {
            C6496s.h(str, "userId");
            return new GetCustomerInfo(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerInfo) && C6496s.c(this.userId, ((GetCustomerInfo) obj).userId);
        }

        public String getPath() {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            C6496s.g(format, "format(this, *args)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerInfo(userId=" + this.userId + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetOfferings;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getPath", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GetOfferings extends Endpoint {
        private final String userId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetOfferings(String str) {
            super("/subscribers/%s/offerings", "get_offerings", (DefaultConstructorMarker) null);
            C6496s.h(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetOfferings copy$default(GetOfferings getOfferings, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = getOfferings.userId;
            }
            return getOfferings.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetOfferings copy(String str) {
            C6496s.h(str, "userId");
            return new GetOfferings(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetOfferings) && C6496s.c(this.userId, ((GetOfferings) obj).userId);
        }

        public String getPath() {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            C6496s.g(format, "format(this, *args)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetOfferings(userId=" + this.userId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetProductEntitlementMapping;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GetProductEntitlementMapping extends Endpoint {
        public static final GetProductEntitlementMapping INSTANCE = new GetProductEntitlementMapping();

        private GetProductEntitlementMapping() {
            super("/product_entitlement_mapping", "get_product_entitlement_mapping", (DefaultConstructorMarker) null);
        }

        public String getPath() {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$LogIn;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LogIn extends Endpoint {
        public static final LogIn INSTANCE = new LogIn();

        private LogIn() {
            super("/subscribers/identify", "log_in", (DefaultConstructorMarker) null);
        }

        public String getPath() {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostAttributes;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getPath", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostAttributes extends Endpoint {
        private final String userId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PostAttributes(String str) {
            super("/subscribers/%s/attributes", "post_attributes", (DefaultConstructorMarker) null);
            C6496s.h(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ PostAttributes copy$default(PostAttributes postAttributes, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = postAttributes.userId;
            }
            return postAttributes.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final PostAttributes copy(String str) {
            C6496s.h(str, "userId");
            return new PostAttributes(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostAttributes) && C6496s.c(this.userId, ((PostAttributes) obj).userId);
        }

        public String getPath() {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            C6496s.g(format, "format(this, *args)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "PostAttributes(userId=" + this.userId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostDiagnostics;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostDiagnostics extends Endpoint {
        public static final PostDiagnostics INSTANCE = new PostDiagnostics();

        private PostDiagnostics() {
            super("/diagnostics", "post_diagnostics", (DefaultConstructorMarker) null);
        }

        public String getPath() {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostPaywallEvents;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostPaywallEvents extends Endpoint {
        public static final PostPaywallEvents INSTANCE = new PostPaywallEvents();

        private PostPaywallEvents() {
            super("/events", "post_paywall_events", (DefaultConstructorMarker) null);
        }

        public String getPath() {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostReceipt extends Endpoint {
        public static final PostReceipt INSTANCE = new PostReceipt();

        private PostReceipt() {
            super("/receipts", "post_receipt", (DefaultConstructorMarker) null);
        }

        public String getPath() {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostRedeemWebPurchase;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostRedeemWebPurchase extends Endpoint {
        public static final PostRedeemWebPurchase INSTANCE = new PostRedeemWebPurchase();

        private PostRedeemWebPurchase() {
            super("/subscribers/redeem_purchase", "post_redeem_web_purchase", (DefaultConstructorMarker) null);
        }

        public String getPath() {
            return getPathTemplate();
        }
    }

    public /* synthetic */ Endpoint(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsNonceToPerformSigning() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        if (this instanceof GetCustomerInfo) {
            z10 = true;
        } else {
            z10 = C6496s.c(this, LogIn.INSTANCE);
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = C6496s.c(this, PostReceipt.INSTANCE);
        }
        if (z11) {
            z12 = true;
        } else {
            z12 = C6496s.c(this, PostRedeemWebPurchase.INSTANCE);
        }
        if (z12) {
            return true;
        }
        if (this instanceof GetAmazonReceipt) {
            z13 = true;
        } else {
            z13 = this instanceof GetOfferings;
        }
        if (z13) {
            z14 = true;
        } else {
            z14 = this instanceof PostAttributes;
        }
        if (z14) {
            z15 = true;
        } else {
            z15 = C6496s.c(this, PostDiagnostics.INSTANCE);
        }
        if (z15) {
            z16 = true;
        } else {
            z16 = C6496s.c(this, PostPaywallEvents.INSTANCE);
        }
        if (z16) {
            z17 = true;
        } else {
            z17 = C6496s.c(this, GetProductEntitlementMapping.INSTANCE);
        }
        if (!z17) {
            z18 = this instanceof GetCustomerCenterConfig;
        }
        if (z18) {
            return false;
        }
        throw new C6535s();
    }

    public abstract String getPath();

    public final String getPathTemplate() {
        return this.pathTemplate;
    }

    public final boolean getSupportsSignatureVerification() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        if (this instanceof GetCustomerInfo) {
            z10 = true;
        } else {
            z10 = C6496s.c(this, LogIn.INSTANCE);
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = C6496s.c(this, PostReceipt.INSTANCE);
        }
        if (z11) {
            z12 = true;
        } else {
            z12 = this instanceof GetOfferings;
        }
        if (z12) {
            z13 = true;
        } else {
            z13 = C6496s.c(this, GetProductEntitlementMapping.INSTANCE);
        }
        if (z13) {
            z14 = true;
        } else {
            z14 = C6496s.c(this, PostRedeemWebPurchase.INSTANCE);
        }
        if (z14) {
            return true;
        }
        if (this instanceof GetAmazonReceipt) {
            z15 = true;
        } else {
            z15 = this instanceof PostAttributes;
        }
        if (z15) {
            z16 = true;
        } else {
            z16 = C6496s.c(this, PostDiagnostics.INSTANCE);
        }
        if (z16) {
            z17 = true;
        } else {
            z17 = C6496s.c(this, PostPaywallEvents.INSTANCE);
        }
        if (!z17) {
            z18 = this instanceof GetCustomerCenterConfig;
        }
        if (z18) {
            return false;
        }
        throw new C6535s();
    }

    private Endpoint(String str, String str2) {
        this.pathTemplate = str;
        this.name = str2;
    }
}
