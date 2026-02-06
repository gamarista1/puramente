package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Llf/M;", "handleResult", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "Result", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RedeemWebPurchaseListener {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "", "()V", "isSuccess", "", "()Z", "Error", "Expired", "InvalidToken", "PurchaseBelongsToOtherUser", "Success", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Error;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Expired;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$InvalidToken;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$PurchaseBelongsToOtherUser;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Error;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "(Lcom/revenuecat/purchases/PurchasesError;)V", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Error extends Result {
            private final PurchasesError error;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(PurchasesError purchasesError) {
                super((DefaultConstructorMarker) null);
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                this.error = purchasesError;
            }

            public static /* synthetic */ Error copy$default(Error error2, PurchasesError purchasesError, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    purchasesError = error2.error;
                }
                return error2.copy(purchasesError);
            }

            public final PurchasesError component1() {
                return this.error;
            }

            public final Error copy(PurchasesError purchasesError) {
                C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
                return new Error(purchasesError);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && C6496s.c(this.error, ((Error) obj).error);
            }

            public final PurchasesError getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Expired;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "obfuscatedEmail", "", "(Ljava/lang/String;)V", "getObfuscatedEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Expired extends Result {
            private final String obfuscatedEmail;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Expired(String str) {
                super((DefaultConstructorMarker) null);
                C6496s.h(str, "obfuscatedEmail");
                this.obfuscatedEmail = str;
            }

            public static /* synthetic */ Expired copy$default(Expired expired, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = expired.obfuscatedEmail;
                }
                return expired.copy(str);
            }

            public final String component1() {
                return this.obfuscatedEmail;
            }

            public final Expired copy(String str) {
                C6496s.h(str, "obfuscatedEmail");
                return new Expired(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Expired) && C6496s.c(this.obfuscatedEmail, ((Expired) obj).obfuscatedEmail);
            }

            public final String getObfuscatedEmail() {
                return this.obfuscatedEmail;
            }

            public int hashCode() {
                return this.obfuscatedEmail.hashCode();
            }

            public String toString() {
                return "Expired(obfuscatedEmail=" + this.obfuscatedEmail + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$InvalidToken;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidToken extends Result {
            public static final InvalidToken INSTANCE = new InvalidToken();

            private InvalidToken() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$PurchaseBelongsToOtherUser;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PurchaseBelongsToOtherUser extends Result {
            public static final PurchaseBelongsToOtherUser INSTANCE = new PurchaseBelongsToOtherUser();

            private PurchaseBelongsToOtherUser() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends Result {
            private final CustomerInfo customerInfo;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Success(CustomerInfo customerInfo2) {
                super((DefaultConstructorMarker) null);
                C6496s.h(customerInfo2, "customerInfo");
                this.customerInfo = customerInfo2;
            }

            public static /* synthetic */ Success copy$default(Success success, CustomerInfo customerInfo2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    customerInfo2 = success.customerInfo;
                }
                return success.copy(customerInfo2);
            }

            public final CustomerInfo component1() {
                return this.customerInfo;
            }

            public final Success copy(CustomerInfo customerInfo2) {
                C6496s.h(customerInfo2, "customerInfo");
                return new Success(customerInfo2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && C6496s.c(this.customerInfo, ((Success) obj).customerInfo);
            }

            public final CustomerInfo getCustomerInfo() {
                return this.customerInfo;
            }

            public int hashCode() {
                return this.customerInfo.hashCode();
            }

            public String toString() {
                return "Success(customerInfo=" + this.customerInfo + ')';
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSuccess() {
            if (this instanceof Success) {
                return true;
            }
            if ((this instanceof Error) || C6496s.c(this, InvalidToken.INSTANCE) || (this instanceof Expired) || C6496s.c(this, PurchaseBelongsToOtherUser.INSTANCE)) {
                return false;
            }
            throw new C6535s();
        }

        private Result() {
        }
    }

    void handleResult(Result result);
}
