package com.amazon.device.iap.model;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public final class Receipt {
    private static final String CANCEL_DATE = "endDate";
    private static final Date DATE_CANCELED = new Date(1);
    private static final String DEFERRED_DATE = "deferredDate";
    private static final String DEFERRED_SKU = "deferredSku";
    private static final String PRODUCT_TYPE = "itemType";
    private static final String PURCHASE_DATE = "purchaseDate";
    private static final String RECEIPT_ID = "receiptId";
    private static final String SKU = "sku";
    private static final String TERM_SKU = "termSku";
    private final Date cancelDate;
    private final Date deferredDate;
    private final String deferredSku;
    private final ProductType productType;
    private final Date purchaseDate;
    private final String receiptId;
    private final String sku;
    private final String termSku;

    public Receipt(ReceiptBuilder receiptBuilder) {
        f.a((Object) receiptBuilder.getSku(), "sku");
        f.a((Object) receiptBuilder.getProductType(), "productType");
        if (ProductType.SUBSCRIPTION == receiptBuilder.getProductType()) {
            f.a((Object) receiptBuilder.getPurchaseDate(), "purchaseDate");
        }
        this.receiptId = receiptBuilder.getReceiptId();
        this.sku = receiptBuilder.getSku();
        this.productType = receiptBuilder.getProductType();
        this.purchaseDate = receiptBuilder.getPurchaseDate();
        this.cancelDate = receiptBuilder.getCancelDate();
        this.deferredSku = receiptBuilder.getDeferredSku();
        this.deferredDate = receiptBuilder.getDeferredDate();
        this.termSku = receiptBuilder.getTermSku();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Receipt.class != obj.getClass()) {
            return false;
        }
        Receipt receipt = (Receipt) obj;
        Date date = this.cancelDate;
        if (date == null) {
            if (receipt.cancelDate != null) {
                return false;
            }
        } else if (!date.equals(receipt.cancelDate)) {
            return false;
        }
        if (this.productType != receipt.productType) {
            return false;
        }
        Date date2 = this.purchaseDate;
        if (date2 == null) {
            if (receipt.purchaseDate != null) {
                return false;
            }
        } else if (!date2.equals(receipt.purchaseDate)) {
            return false;
        }
        String str = this.receiptId;
        if (str == null) {
            if (receipt.receiptId != null) {
                return false;
            }
        } else if (!str.equals(receipt.receiptId)) {
            return false;
        }
        String str2 = this.sku;
        if (str2 == null) {
            if (receipt.sku != null) {
                return false;
            }
        } else if (!str2.equals(receipt.sku)) {
            return false;
        }
        String str3 = this.deferredSku;
        if (str3 == null) {
            if (receipt.deferredSku != null) {
                return false;
            }
        } else if (!str3.equals(receipt.deferredSku)) {
            return false;
        }
        Date date3 = this.deferredDate;
        if (date3 == null) {
            if (receipt.deferredDate != null) {
                return false;
            }
        } else if (date3.equals(receipt.deferredDate) && this.termSku.equals(receipt.termSku)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public Date getCancelDate() {
        return this.cancelDate;
    }

    public Date getDeferredDate() {
        return this.deferredDate;
    }

    public String getDeferredSku() {
        return this.deferredSku;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public String getSku() {
        return this.sku;
    }

    public String getTermSku() {
        return this.termSku;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Date date = this.cancelDate;
        int i17 = 0;
        if (date == null) {
            i10 = 0;
        } else {
            i10 = date.hashCode();
        }
        int i18 = (i10 + 31) * 31;
        ProductType productType2 = this.productType;
        if (productType2 == null) {
            i11 = 0;
        } else {
            i11 = productType2.hashCode();
        }
        int i19 = (i18 + i11) * 31;
        Date date2 = this.purchaseDate;
        if (date2 == null) {
            i12 = 0;
        } else {
            i12 = date2.hashCode();
        }
        int i20 = (i19 + i12) * 31;
        Date date3 = this.deferredDate;
        if (date3 == null) {
            i13 = 0;
        } else {
            i13 = date3.hashCode();
        }
        int i21 = (i20 + i13) * 31;
        String str = this.receiptId;
        if (str == null) {
            i14 = 0;
        } else {
            i14 = str.hashCode();
        }
        int i22 = (i21 + i14) * 31;
        String str2 = this.sku;
        if (str2 == null) {
            i15 = 0;
        } else {
            i15 = str2.hashCode();
        }
        int i23 = (i22 + i15) * 31;
        String str3 = this.deferredSku;
        if (str3 == null) {
            i16 = 0;
        } else {
            i16 = str3.hashCode();
        }
        int i24 = (i23 + i16) * 31;
        String str4 = this.termSku;
        if (str4 != null) {
            i17 = str4.hashCode();
        }
        return i24 + i17;
    }

    public boolean isCanceled() {
        if (this.cancelDate != null) {
            return true;
        }
        return false;
    }

    public boolean isDeferred() {
        if (this.deferredDate != null) {
            return true;
        }
        return false;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("receiptId", this.receiptId);
            jSONObject.put("sku", this.sku);
            jSONObject.put("itemType", this.productType);
            jSONObject.put("purchaseDate", this.purchaseDate);
            jSONObject.put("endDate", this.cancelDate);
            jSONObject.put("deferredSku", this.deferredSku);
            jSONObject.put("deferredDate", this.deferredDate);
            jSONObject.put("termSku", this.termSku);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }
}
