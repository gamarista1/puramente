package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import mf.Y;
import yf.C6787a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerCenterConfigData$Screen$supportedPaths$2 extends C6498u implements C6787a {
    final /* synthetic */ CustomerCenterConfigData.Screen this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerCenterConfigData$Screen$supportedPaths$2(CustomerCenterConfigData.Screen screen) {
        super(0);
        this.this$0 = screen;
    }

    public final List<CustomerCenterConfigData.HelpPath> invoke() {
        Set j10 = Y.j(CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE, CustomerCenterConfigData.HelpPath.PathType.CANCEL, CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL);
        ArrayList arrayList = new ArrayList();
        for (Object next : this.this$0.getPaths()) {
            if (j10.contains(((CustomerCenterConfigData.HelpPath) next).getType())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
