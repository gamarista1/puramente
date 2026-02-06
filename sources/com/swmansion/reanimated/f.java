package com.swmansion.reanimated;

import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import java.util.ArrayList;

public final /* synthetic */ class f implements UIBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReanimatedModule f59623a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f59624b;

    public /* synthetic */ f(ReanimatedModule reanimatedModule, ArrayList arrayList) {
        this.f59623a = reanimatedModule;
        this.f59624b = arrayList;
    }

    public final void execute(UIBlockViewResolver uIBlockViewResolver) {
        this.f59623a.lambda$willDispatchViewUpdates$0(this.f59624b, uIBlockViewResolver);
    }
}
