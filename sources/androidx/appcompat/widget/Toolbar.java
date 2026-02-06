package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C1560a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.B;
import androidx.core.view.C1680b0;
import androidx.core.view.C1712s;
import androidx.core.view.C1720w;
import androidx.core.view.C1726z;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import com.revenuecat.purchases.common.UtilsKt;
import i.C2037a;
import j.C2115a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements C1720w {
    private static final String TAG = "Toolbar";
    private j.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private Y mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    e.a mMenuBuilderCallback;
    final C1726z mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private C1564c mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private k0 mWrapper;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.mOnMenuItemClickListener;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    class c implements e.a {
        c() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar == null || !aVar.a(eVar, menuItem)) {
                return false;
            }
            return true;
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.mMenuView.J()) {
                Toolbar.this.mMenuHostHelper.k(eVar);
            }
            e.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new j0(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements j {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.e f11724a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f11725b;

        f() {
        }

        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = gVar.getActionView();
            this.f11725b = gVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f10976a = (toolbar4.mButtonGravity & 112) | 8388611;
                generateDefaultLayoutParams.f11727b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).b();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        public boolean f(m mVar) {
            return false;
        }

        public void g(boolean z10) {
            if (this.f11725b != null) {
                androidx.appcompat.view.menu.e eVar = this.f11724a;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (i10 < size) {
                        if (this.f11724a.getItem(i10) != this.f11725b) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
                i(this.f11724a, this.f11725b);
            }
        }

        public boolean h() {
            return false;
        }

        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f11725b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f11724a;
            if (!(eVar2 == null || (gVar = this.f11725b) == null)) {
                eVar2.f(gVar);
            }
            this.f11724a = eVar;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(List list, int i10) {
        boolean z10;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int b10 = C1712s.b(i10, getLayoutDirection());
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11727b == 0 && v(childAt) && h(gVar.f10976a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f11727b == 0 && v(childAt2) && h(gVar2.f10976a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void b(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f11727b = 1;
        if (!z10 || this.mExpandedActionView == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.mHiddenViews.add(view);
    }

    private void c() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new Y();
        }
    }

    private void d() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void e() {
        f();
        if (this.mMenuView.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            eVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void f() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.O(this.mActionMenuPresenterCallback, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f10976a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            b(this.mMenuView, false);
        }
    }

    private void g() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C1577p(getContext(), (AttributeSet) null, C2037a.f21256K);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f10976a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private int h(int i10) {
        int layoutDirection = getLayoutDirection();
        int b10 = C1712s.b(i10, layoutDirection) & 7;
        if (b10 == 1 || b10 == 3 || b10 == 5) {
            return b10;
        }
        if (layoutDirection == 1) {
            return 5;
        }
        return 3;
    }

    private int i(View view, int i10) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int j10 = j(gVar.f10976a);
        if (j10 == 48) {
            return getPaddingTop() - i11;
        }
        if (j10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = gVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = gVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int j(int i10) {
        int i11 = i10 & 112;
        if (i11 == 16 || i11 == 48 || i11 == 80) {
            return i11;
        }
        return this.mGravity & 112;
    }

    private int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int m(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = gVar.leftMargin - i10;
            int i15 = gVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean n(View view) {
        if (view.getParent() == this || this.mHiddenViews.contains(view)) {
            return true;
        }
        return false;
    }

    private int o(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i13, max + measuredWidth, view.getMeasuredHeight() + i13);
        return max + measuredWidth + gVar.rightMargin;
    }

    private int p(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = gVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i13, max, view.getMeasuredHeight() + i13);
        return max - (measuredWidth + gVar.leftMargin);
    }

    private int q(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void r(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void s() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void t() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean u() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (v(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean v(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public void addMenuProvider(B b10) {
        this.mMenuHostHelper.c(b10);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        if (getVisibility() != 0 || (actionMenuView = this.mMenuView) == null || !actionMenuView.K()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof g)) {
            return false;
        }
        return true;
    }

    public void collapseActionView() {
        androidx.appcompat.view.menu.g gVar;
        f fVar = this.mExpandedMenuPresenter;
        if (fVar == null) {
            gVar = null;
        } else {
            gVar = fVar.f11725b;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C1577p pVar = new C1577p(getContext(), (AttributeSet) null, C2037a.f21256K);
            this.mCollapseButtonView = pVar;
            pVar.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f10976a = (this.mButtonGravity & 112) | 8388611;
            generateDefaultLayoutParams.f11727b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Y y10 = this.mContentInsets;
        if (y10 != null) {
            return y10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.mContentInsetEndWithActions;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Y y10 = this.mContentInsets;
        if (y10 != null) {
            return y10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Y y10 = this.mContentInsets;
        if (y10 != null) {
            return y10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Y y10 = this.mContentInsets;
        if (y10 != null) {
            return y10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.mContentInsetStartWithNavigation;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N10;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (N10 = actionMenuView.N()) == null || !N10.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.mMenuView.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C1564c getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.mMenuView.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public I getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new k0(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        if (fVar == null || fVar.f11725b == null) {
            return false;
        }
        return true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || !actionMenuView.H()) {
            return false;
        }
        return true;
    }

    public void inflateMenu(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        s();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || !actionMenuView.I()) {
            return false;
        }
        return true;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || !actionMenuView.J()) {
            return false;
        }
        return true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a1 A[LOOP:0: B:103:0x029f->B:104:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c3 A[LOOP:1: B:106:0x02c1->B:107:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc A[LOOP:2: B:114:0x02fa->B:115:0x02fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r19.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.mTempMargins
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.view.C1680b0.B(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.mNavButtonView
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.mNavButtonView
            int r13 = r0.p(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0058
        L_0x004e:
            android.widget.ImageButton r13 = r0.mNavButtonView
            int r13 = r0.o(r13, r6, r11, r12)
        L_0x0054:
            r14 = r10
            goto L_0x0058
        L_0x0056:
            r13 = r6
            goto L_0x0054
        L_0x0058:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0069
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r14 = r0.p(r15, r14, r11, r12)
            goto L_0x006f
        L_0x0069:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r13 = r0.o(r15, r13, r11, r12)
        L_0x006f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0080
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            int r13 = r0.o(r15, r13, r11, r12)
            goto L_0x0086
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            int r14 = r0.p(r15, r14, r11, r12)
        L_0x0086:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.mExpandedActionView
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00bd
            android.view.View r13 = r0.mExpandedActionView
            int r10 = r0.p(r13, r10, r11, r12)
            goto L_0x00c3
        L_0x00bd:
            android.view.View r13 = r0.mExpandedActionView
            int r3 = r0.o(r13, r3, r11, r12)
        L_0x00c3:
            android.widget.ImageView r13 = r0.mLogoView
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x00d4
            android.widget.ImageView r13 = r0.mLogoView
            int r10 = r0.p(r13, r10, r11, r12)
            goto L_0x00da
        L_0x00d4:
            android.widget.ImageView r13 = r0.mLogoView
            int r3 = r0.o(r13, r3, r11, r12)
        L_0x00da:
            android.widget.TextView r13 = r0.mTitleTextView
            boolean r13 = r0.v(r13)
            android.widget.TextView r14 = r0.mSubtitleTextView
            boolean r14 = r0.v(r14)
            if (r13 == 0) goto L_0x00ff
            android.widget.TextView r15 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.mTitleTextView
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0102
        L_0x00ff:
            r23 = r7
            r2 = 0
        L_0x0102:
            if (r14 == 0) goto L_0x011c
            android.widget.TextView r7 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.mSubtitleTextView
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011e
        L_0x011c:
            r16 = r4
        L_0x011e:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            r18 = r6
            r22 = r12
        L_0x0127:
            r2 = 0
            goto L_0x0291
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r4 = r0.mTitleTextView
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r4 = r0.mSubtitleTextView
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r7 = r0.mSubtitleTextView
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r7 = r0.mTitleTextView
        L_0x0138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.mTitleTextView
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015b
            android.widget.TextView r15 = r0.mSubtitleTextView
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015b
        L_0x0158:
            r17 = 1
            goto L_0x015d
        L_0x015b:
            r17 = 0
        L_0x015d:
            int r15 = r0.mGravity
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a5
            r6 = 80
            if (r15 == r6) goto L_0x0197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.mTitleMarginTop
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0180
            int r6 = r15 + r12
            goto L_0x0195
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.mTitleMarginBottom
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0195
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0195:
            int r8 = r8 + r6
            goto L_0x01b4
        L_0x0197:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.mTitleMarginBottom
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b4
        L_0x01a5:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.mTitleMarginTop
            int r8 = r2 + r3
        L_0x01b4:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.mTitleMarginStart
        L_0x01ba:
            r2 = 1
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01ba
        L_0x01be:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.mTitleTextView
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.mTitleTextView
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.mTitleMarginEnd
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.mSubtitleTextView
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.mSubtitleTextView
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.mTitleMarginEnd
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0127
        L_0x0227:
            if (r17 == 0) goto L_0x022e
            int r2 = r0.mTitleMarginStart
            r1 = r2
        L_0x022c:
            r2 = 0
            goto L_0x0230
        L_0x022e:
            r1 = 0
            goto L_0x022c
        L_0x0230:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0265
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r4 = r0.mTitleTextView
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.mTitleTextView
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.mTitleTextView
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.mTitleMarginEnd
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0266
        L_0x0265:
            r4 = r3
        L_0x0266:
            if (r14 == 0) goto L_0x028a
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.mSubtitleTextView
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.mSubtitleTextView
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.mTitleMarginEnd
            int r1 = r1 + r5
            goto L_0x028b
        L_0x028a:
            r1 = r3
        L_0x028b:
            if (r17 == 0) goto L_0x0291
            int r3 = java.lang.Math.max(r4, r1)
        L_0x0291:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r4 = 3
            r0.a(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L_0x029f:
            if (r3 >= r1) goto L_0x02b2
            java.util.ArrayList<android.view.View> r5 = r0.mTempViews
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.o(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r3 = 5
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r3 = r2
        L_0x02c1:
            if (r3 >= r1) goto L_0x02d2
            java.util.ArrayList<android.view.View> r5 = r0.mTempViews
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.p(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r3 = 1
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r0.m(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L_0x02ed
            goto L_0x02f4
        L_0x02ed:
            if (r1 <= r10) goto L_0x02f3
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L_0x02f4
        L_0x02f3:
            r4 = r6
        L_0x02f4:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
        L_0x02fa:
            if (r2 >= r1) goto L_0x030b
            java.util.ArrayList<android.view.View> r3 = r0.mTempViews
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.o(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x030b:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.mTempMargins;
        char b10 = r0.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (v(this.mNavButtonView)) {
            r(this.mNavButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            i14 = this.mNavButtonView.getMeasuredWidth() + k(this.mNavButtonView);
            i13 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + l(this.mNavButtonView));
            i12 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (v(this.mCollapseButtonView)) {
            r(this.mCollapseButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            i14 = this.mCollapseButtonView.getMeasuredWidth() + k(this.mCollapseButtonView);
            i13 = Math.max(i13, this.mCollapseButtonView.getMeasuredHeight() + l(this.mCollapseButtonView));
            i12 = View.combineMeasuredStates(i12, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (v(this.mMenuView)) {
            r(this.mMenuView, i10, max, i11, 0, this.mMaxButtonHeight);
            i15 = this.mMenuView.getMeasuredWidth() + k(this.mMenuView);
            i13 = Math.max(i13, this.mMenuView.getMeasuredHeight() + l(this.mMenuView));
            i12 = View.combineMeasuredStates(i12, this.mMenuView.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (v(this.mExpandedActionView)) {
            max2 += q(this.mExpandedActionView, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.mExpandedActionView.getMeasuredHeight() + l(this.mExpandedActionView));
            i12 = View.combineMeasuredStates(i12, this.mExpandedActionView.getMeasuredState());
        }
        if (v(this.mLogoView)) {
            max2 += q(this.mLogoView, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.mLogoView.getMeasuredHeight() + l(this.mLogoView));
            i12 = View.combineMeasuredStates(i12, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f11727b == 0 && v(childAt)) {
                max2 += q(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + l(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i22 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (v(this.mTitleTextView)) {
            q(this.mTitleTextView, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + k(this.mTitleTextView);
            i16 = this.mTitleTextView.getMeasuredHeight() + l(this.mTitleTextView);
            i18 = View.combineMeasuredStates(i12, this.mTitleTextView.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (v(this.mSubtitleTextView)) {
            i17 = Math.max(i17, q(this.mSubtitleTextView, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.mSubtitleTextView.getMeasuredHeight() + l(this.mSubtitleTextView);
            i18 = View.combineMeasuredStates(i18, this.mSubtitleTextView.getMeasuredState());
        } else {
            int i23 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!u()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.e eVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            eVar = actionMenuView.N();
        } else {
            eVar = null;
        }
        int i10 = iVar.f11728c;
        if (!(i10 == 0 || this.mExpandedMenuPresenter == null || eVar == null || (findItem = eVar.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f11729d) {
            t();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        c();
        Y y10 = this.mContentInsets;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        y10.f(z10);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (!(fVar == null || (gVar = fVar.f11725b) == null)) {
            iVar.f11728c = gVar.getItemId();
        }
        iVar.f11729d = isOverflowMenuShowing();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((g) childAt.getLayoutParams()).f11727b == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void removeMenuProvider(B b10) {
        this.mMenuHostHelper.l(b10);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.mBackInvokedCallbackEnabled != z10) {
            this.mBackInvokedCallbackEnabled = z10;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C2115a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.mCollapsible = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        c();
        this.mContentInsets.e(i10, i11);
    }

    public void setContentInsetsRelative(int i10, int i11) {
        c();
        this.mContentInsets.g(i10, i11);
    }

    public void setLogo(int i10) {
        setLogo(C2115a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setMenu(androidx.appcompat.view.menu.e eVar, C1564c cVar) {
        if (eVar != null || this.mMenuView != null) {
            f();
            androidx.appcompat.view.menu.e N10 = this.mMenuView.N();
            if (N10 != eVar) {
                if (N10 != null) {
                    N10.P(this.mOuterActionMenuPresenter);
                    N10.P(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new f();
                }
                cVar.G(true);
                if (eVar != null) {
                    eVar.c(cVar, this.mPopupContext);
                    eVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    cVar.j(this.mPopupContext, (androidx.appcompat.view.menu.e) null);
                    this.mExpandedMenuPresenter.j(this.mPopupContext, (androidx.appcompat.view.menu.e) null);
                    cVar.g(true);
                    this.mExpandedMenuPresenter.g(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(cVar);
                this.mOuterActionMenuPresenter = cVar;
                updateBackInvokedCallbackState();
            }
        }
    }

    public void setMenuCallbacks(j.a aVar, e.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C2115a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.mPopupTheme != i10) {
            this.mPopupTheme = i10;
            if (i10 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextAppearance(Context context, int i10) {
        this.mSubtitleTextAppearance = i10;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.mTitleMarginStart = i10;
        this.mTitleMarginTop = i11;
        this.mTitleMarginEnd = i12;
        this.mTitleMarginBottom = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.mTitleMarginBottom = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.mTitleMarginEnd = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.mTitleMarginStart = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.mTitleMarginTop = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i10) {
        this.mTitleTextAppearance = i10;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || !actionMenuView.P()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void updateBackInvokedCallbackState() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            if (!hasExpandedActionView() || a10 == null || !isAttachedToWindow() || !this.mBackInvokedCallbackEnabled) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new h0(this));
                }
                e.c(a10, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = a10;
            } else if (!z10 && (onBackInvokedDispatcher = this.mBackInvokedDispatcher) != null) {
                e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = null;
            }
        }
    }

    public static class g extends C1560a.C0210a {

        /* renamed from: b  reason: collision with root package name */
        int f11727b = 0;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f10976a = 8388627;
        }

        public g(g gVar) {
            super((C1560a.C0210a) gVar);
            this.f11727b = gVar.f11727b;
        }

        public g(C1560a.C0210a aVar) {
            super(aVar);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21257L);
    }

    public void addMenuProvider(B b10, C1798v vVar) {
        this.mMenuHostHelper.d(b10, vVar);
    }

    /* access modifiers changed from: protected */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.mCollapseIcon);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            d();
            if (!n(this.mLogoView)) {
                b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && n(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            l0.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && n(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                C c10 = new C(context);
                this.mSubtitleTextView = c10;
                c10.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.mSubtitleTextAppearance;
                if (i10 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mSubtitleTextView)) {
                b(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C c10 = new C(context);
                this.mTitleTextView = c10;
                c10.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.mTitleTextAppearance;
                if (i10 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mTitleTextView)) {
                b(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends F1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f11728c;

        /* renamed from: d  reason: collision with root package name */
        boolean f11729d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11728c = parcel.readInt();
            this.f11729d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f11728c);
            parcel.writeInt(this.f11729d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C1726z(new i0(this));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        g0 v10 = g0.v(getContext(), attributeSet, i.j.f21573d3, i10, 0);
        C1680b0.m0(this, context, i.j.f21573d3, attributeSet, v10.r(), i10, 0);
        this.mTitleTextAppearance = v10.n(i.j.f21461F3, 0);
        this.mSubtitleTextAppearance = v10.n(i.j.f21668w3, 0);
        this.mGravity = v10.l(i.j.f21578e3, this.mGravity);
        this.mButtonGravity = v10.l(i.j.f21583f3, 48);
        int e10 = v10.e(i.j.f21683z3, 0);
        e10 = v10.s(i.j.f21456E3) ? v10.e(i.j.f21456E3, e10) : e10;
        this.mTitleMarginBottom = e10;
        this.mTitleMarginTop = e10;
        this.mTitleMarginEnd = e10;
        this.mTitleMarginStart = e10;
        int e11 = v10.e(i.j.f21446C3, -1);
        if (e11 >= 0) {
            this.mTitleMarginStart = e11;
        }
        int e12 = v10.e(i.j.f21441B3, -1);
        if (e12 >= 0) {
            this.mTitleMarginEnd = e12;
        }
        int e13 = v10.e(i.j.f21451D3, -1);
        if (e13 >= 0) {
            this.mTitleMarginTop = e13;
        }
        int e14 = v10.e(i.j.f21436A3, -1);
        if (e14 >= 0) {
            this.mTitleMarginBottom = e14;
        }
        this.mMaxButtonHeight = v10.f(i.j.f21638q3, -1);
        int e15 = v10.e(i.j.f21618m3, Integer.MIN_VALUE);
        int e16 = v10.e(i.j.f21598i3, Integer.MIN_VALUE);
        int f10 = v10.f(i.j.f21608k3, 0);
        int f11 = v10.f(i.j.f21613l3, 0);
        c();
        this.mContentInsets.e(f10, f11);
        if (!(e15 == Integer.MIN_VALUE && e16 == Integer.MIN_VALUE)) {
            this.mContentInsets.g(e15, e16);
        }
        this.mContentInsetStartWithNavigation = v10.e(i.j.f21623n3, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = v10.e(i.j.f21603j3, Integer.MIN_VALUE);
        this.mCollapseIcon = v10.g(i.j.f21593h3);
        this.mCollapseDescription = v10.p(i.j.f21588g3);
        CharSequence p10 = v10.p(i.j.f21678y3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(i.j.f21663v3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.mPopupContext = getContext();
        setPopupTheme(v10.n(i.j.f21658u3, 0));
        Drawable g10 = v10.g(i.j.f21653t3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(i.j.f21648s3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(i.j.f21628o3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(i.j.f21633p3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        if (v10.s(i.j.f21466G3)) {
            setTitleTextColor(v10.c(i.j.f21466G3));
        }
        if (v10.s(i.j.f21673x3)) {
            setSubtitleTextColor(v10.c(i.j.f21673x3));
        }
        if (v10.s(i.j.f21643r3)) {
            inflateMenu(v10.n(i.j.f21643r3, 0));
        }
        v10.x();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(B b10, C1798v vVar, C1790m.b bVar) {
        this.mMenuHostHelper.e(b10, vVar, bVar);
    }

    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof C1560a.C0210a) {
            return new g((C1560a.C0210a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }
}
