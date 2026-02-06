package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f41827a;

    /* renamed from: b  reason: collision with root package name */
    private int f41828b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int[] f41829c;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            Integer num = 0;
            if (viewZIndex == null) {
                viewZIndex = num;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            if (viewZIndex2 != null) {
                num = viewZIndex2;
            }
            return viewZIndex.intValue() - num.intValue();
        }
    }

    public v0(ViewGroup viewGroup) {
        this.f41827a = viewGroup;
    }

    public int a(int i10, int i11) {
        int[] iArr = this.f41829c;
        if (iArr != null && (i11 >= iArr.length || iArr[i11] >= i10)) {
            U5.a.K("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i10), Integer.valueOf(i11));
            e();
        }
        if (this.f41829c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(this.f41827a.getChildAt(i12));
            }
            Collections.sort(arrayList, new a());
            this.f41829c = new int[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                this.f41829c[i13] = this.f41827a.indexOfChild((View) arrayList.get(i13));
            }
        }
        return this.f41829c[i11];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f41828b++;
        }
        this.f41829c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f41828b--;
        }
        this.f41829c = null;
    }

    public boolean d() {
        if (this.f41828b > 0) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f41828b = 0;
        for (int i10 = 0; i10 < this.f41827a.getChildCount(); i10++) {
            if (ViewGroupManager.getViewZIndex(this.f41827a.getChildAt(i10)) != null) {
                this.f41828b++;
            }
        }
        this.f41829c = null;
    }
}
