package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k extends RecyclerView.F {

    /* renamed from: u  reason: collision with root package name */
    public static final a f59453u = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ViewGroup viewGroup) {
            C6496s.h(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new k(frameLayout, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    public final FrameLayout N() {
        View view = this.f18066a;
        C6496s.f(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) view;
    }

    private k(FrameLayout frameLayout) {
        super(frameLayout);
    }
}
