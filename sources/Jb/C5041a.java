package jb;

import Ua.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

/* renamed from: jb.a  reason: case insensitive filesystem */
public abstract class C5041a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f60846a = {16842752, a.f52721I};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f60847b = {a.f52746x};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f60846a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f60847b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        int b10 = b(context, attributeSet, i10, i11);
        if (!(context instanceof d) || ((d) context).c() != b10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (b10 == 0 || z10) {
            return context;
        }
        d dVar = new d(context, b10);
        int a10 = a(context, attributeSet);
        if (a10 != 0) {
            dVar.getTheme().applyStyle(a10, true);
        }
        return dVar;
    }
}
