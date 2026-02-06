package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import java.util.ArrayList;
import java.util.List;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lh.h;
import lh.i;
import lh.j;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/customercenter/HelpPathsSerializer;", "Lgh/b;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "<init>", "()V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/List;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/List;)V", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HelpPathsSerializer implements C5978b {
    public static final HelpPathsSerializer INSTANCE = new HelpPathsSerializer();
    private static final f descriptor = C5998a.h(CustomerCenterConfigData.HelpPath.Companion.serializer()).getDescriptor();

    private HelpPathsSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public List<CustomerCenterConfigData.HelpPath> deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        ArrayList arrayList = new ArrayList();
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            for (i d10 : j.m(hVar.g())) {
                try {
                    arrayList.add(hVar.d().d(CustomerCenterConfigData.HelpPath.Companion.serializer(), d10));
                } catch (IllegalArgumentException e10) {
                    LogUtilsKt.debugLog("Issue deserializing CustomerCenter HelpPath. Ignoring. Error: " + e10);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("Can be deserialized only by JSON");
    }

    public void serialize(jh.f fVar, List<CustomerCenterConfigData.HelpPath> list) {
        C6496s.h(fVar, "encoder");
        C6496s.h(list, "value");
        C5998a.h(CustomerCenterConfigData.HelpPath.Companion.serializer()).serialize(fVar, list);
    }
}
