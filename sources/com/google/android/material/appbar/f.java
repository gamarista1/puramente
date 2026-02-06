package com.google.android.material.appbar;

import Ua.a;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.l;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f55517a = {16843848};

    static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(View view, float f10) {
        int integer = view.getResources().getInteger(Ua.f.f52855a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, a.f52717E, -a.f52718F}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j10));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f10}).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray h10 = l.h(context, attributeSet, f55517a, i10, i11, new int[0]);
        try {
            if (h10.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h10.getResourceId(0, 0)));
            }
        } finally {
            h10.recycle();
        }
    }
}
