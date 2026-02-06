package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f59637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f59638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewGroupManager f59639c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f59640d;

    public /* synthetic */ c(ArrayList arrayList, View view, ViewGroupManager viewGroupManager, ViewGroup viewGroup) {
        this.f59637a = arrayList;
        this.f59638b = view;
        this.f59639c = viewGroupManager;
        this.f59640d = viewGroup;
    }

    public final void run() {
        ReanimatedNativeHierarchyManager.lambda$manageChildren$0(this.f59637a, this.f59638b, this.f59639c, this.f59640d);
    }
}
