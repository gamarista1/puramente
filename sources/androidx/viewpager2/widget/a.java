package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f18570b;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f18571a;

    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    class C0319a implements Comparator {
        C0319a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f18570b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f18571a = linearLayoutManager;
    }

    private boolean a() {
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i10;
        int bottom;
        int i11;
        int J10 = this.f18571a.J();
        if (J10 == 0) {
            return true;
        }
        if (this.f18571a.l2() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = J10;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i12 = 0;
        while (i12 < J10) {
            View I10 = this.f18571a.I(i12);
            if (I10 != null) {
                ViewGroup.LayoutParams layoutParams = I10.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f18570b;
                }
                int[] iArr3 = iArr2[i12];
                if (z10) {
                    top = I10.getLeft();
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    top = I10.getTop();
                    i10 = marginLayoutParams.topMargin;
                }
                iArr3[0] = top - i10;
                int[] iArr4 = iArr2[i12];
                if (z10) {
                    bottom = I10.getRight();
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    bottom = I10.getBottom();
                    i11 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = bottom + i11;
                i12++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C0319a());
        for (int i13 = 1; i13 < J10; i13++) {
            if (iArr2[i13 - 1][1] != iArr2[i13][0]) {
                return false;
            }
        }
        int[] iArr5 = iArr2[0];
        int i14 = iArr5[1];
        int i15 = iArr5[0];
        int i16 = i14 - i15;
        if (i15 > 0 || iArr2[J10 - 1][1] < i16) {
            return false;
        }
        return true;
    }

    private boolean b() {
        int J10 = this.f18571a.J();
        for (int i10 = 0; i10 < J10; i10++) {
            if (c(this.f18571a.I(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if ((!a() || this.f18571a.J() <= 1) && b()) {
            return true;
        }
        return false;
    }
}
