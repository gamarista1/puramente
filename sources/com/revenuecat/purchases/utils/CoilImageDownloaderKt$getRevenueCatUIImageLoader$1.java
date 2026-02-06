package com.revenuecat.purchases.utils;

import android.content.Context;
import b4.C3145a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import wf.k;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb4/a;", "invoke", "()Lb4/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CoilImageDownloaderKt$getRevenueCatUIImageLoader$1 extends C6498u implements C6787a {
    final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoilImageDownloaderKt$getRevenueCatUIImageLoader$1(Context context) {
        super(0);
        this.$this_getRevenueCatUIImageLoader = context;
    }

    public final C3145a invoke() {
        C3145a.C0592a aVar = new C3145a.C0592a();
        File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
        C6496s.g(cacheDir, "cacheDir");
        return aVar.c(k.z(cacheDir, "revenuecatui_cache")).d(26214400).a();
    }
}
