package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "it", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$getProductInfo$onReceived$1 extends C6498u implements C6798l {
    final /* synthetic */ OnResultList $onResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$getProductInfo$onReceived$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        C6496s.h(list, "it");
        this.$onResult.onReceived(StoreProductMapperKt.map(list));
    }
}
