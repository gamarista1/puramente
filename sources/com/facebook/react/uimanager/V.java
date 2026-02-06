package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import com.facebook.yoga.a;
import com.facebook.yoga.b;
import com.facebook.yoga.c;
import com.facebook.yoga.g;
import com.facebook.yoga.h;
import com.facebook.yoga.i;
import com.facebook.yoga.j;
import com.facebook.yoga.l;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.r;
import com.facebook.yoga.s;
import com.facebook.yoga.u;
import com.facebook.yoga.v;
import com.facebook.yoga.x;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.Arrays;
import n7.C3863a;

public class V implements U {
    private static final c sYogaConfig = Z.b();
    private ArrayList<V> mChildren;
    private final C3411f0 mDefaultPadding;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private V mLayoutParent;
    private ArrayList<V> mNativeChildren;
    private V mNativeParent;
    private boolean mNodeUpdated = true;
    private final float[] mPadding;
    private final boolean[] mPaddingIsPercent;
    private V mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private C3415h0 mThemedContext;
    private int mTotalNativeChildren = 0;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private r mYogaNode;

    public V() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        this.mPaddingIsPercent = new boolean[9];
        this.mDefaultPadding = new C3411f0(0.0f);
        if (!isVirtual()) {
            r rVar = (r) H0.b().b();
            rVar = rVar == null ? s.a(sYogaConfig) : rVar;
            this.mYogaNode = rVar;
            rVar.D(this);
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    private void b(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() != 0) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                getChildAt(i12).b(sb2, i10 + 1);
            }
        }
    }

    private int c() {
        B nativeKind = getNativeKind();
        if (nativeKind == B.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == B.LEAF) {
            return this.mTotalNativeChildren + 1;
        }
        return 1;
    }

    private void d(int i10) {
        if (getNativeKind() != B.PARENT) {
            V parent = getParent();
            while (parent != null) {
                parent.mTotalNativeChildren += i10;
                if (parent.getNativeKind() != B.PARENT) {
                    parent = parent.getParent();
                } else {
                    return;
                }
            }
        }
    }

    private void e() {
        for (int i10 = 0; i10 <= 8; i10++) {
            if (i10 == 0 || i10 == 2 || i10 == 4 || i10 == 5) {
                if (g.a(this.mPadding[i10]) && g.a(this.mPadding[6]) && g.a(this.mPadding[8])) {
                    this.mYogaNode.i0(j.b(i10), this.mDefaultPadding.b(i10));
                }
            } else if (i10 == 1 || i10 == 3) {
                if (g.a(this.mPadding[i10]) && g.a(this.mPadding[7]) && g.a(this.mPadding[8])) {
                    this.mYogaNode.i0(j.b(i10), this.mDefaultPadding.b(i10));
                }
            } else if (g.a(this.mPadding[i10])) {
                this.mYogaNode.i0(j.b(i10), this.mDefaultPadding.b(i10));
            }
            if (this.mPaddingIsPercent[i10]) {
                this.mYogaNode.j0(j.b(i10), this.mPadding[i10]);
            } else {
                this.mYogaNode.i0(j.b(i10), this.mPadding[i10]);
            }
        }
    }

    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    public Iterable<? extends U> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.d();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    public void dispatchUpdates(float f10, float f11, s0 s0Var, D d10) {
        boolean z10;
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(s0Var);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f12 = f10 + layoutX;
            int round = Math.round(f12);
            float f13 = f11 + layoutY;
            int round2 = Math.round(f13);
            int round3 = Math.round(f12 + getLayoutWidth());
            int round4 = Math.round(f13 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i10 = round3 - round;
            int i11 = round4 - round2;
            if (round5 == this.mScreenX && round6 == this.mScreenY && i10 == this.mScreenWidth && i11 == this.mScreenHeight) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i10;
            this.mScreenHeight = i11;
            if (!z10) {
                return;
            }
            if (d10 != null) {
                d10.l(this);
                return;
            }
            s0Var.P(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
        }
    }

    public boolean dispatchUpdatesWillChangeLayout(float f10, float f11) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f12 = f10 + layoutX;
        int round = Math.round(f12);
        float f13 = f11 + layoutY;
        int round2 = Math.round(f13);
        int round3 = Math.round(f12 + getLayoutWidth());
        int round4 = Math.round(f13 + getLayoutHeight());
        int round5 = Math.round(layoutX);
        int round6 = Math.round(layoutY);
        int i10 = round3 - round;
        int i11 = round4 - round2;
        if (round5 == this.mScreenX && round6 == this.mScreenY && i10 == this.mScreenWidth && i11 == this.mScreenHeight) {
            return false;
        }
        return true;
    }

    public void dispose() {
        r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.w();
            H0.b().a(this.mYogaNode);
        }
    }

    public final int getChildCount() {
        ArrayList<V> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public float getFlex() {
        return this.mYogaNode.e();
    }

    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, 0);
        return sb2.toString();
    }

    public final h getLayoutDirection() {
        return this.mYogaNode.h();
    }

    public final float getLayoutHeight() {
        return this.mYogaNode.i();
    }

    public final float getLayoutWidth() {
        return this.mYogaNode.k();
    }

    public final float getLayoutX() {
        return this.mYogaNode.l();
    }

    public final float getLayoutY() {
        return this.mYogaNode.m();
    }

    public final int getNativeChildCount() {
        ArrayList<V> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public B getNativeKind() {
        if (isVirtual() || isLayoutOnly()) {
            return B.NONE;
        }
        if (hoistNativeChildren()) {
            return B.LEAF;
        }
        return B.PARENT;
    }

    public final float getPadding(int i10) {
        return this.mYogaNode.j(j.b(i10));
    }

    public final int getReactTag() {
        return this.mReactTag;
    }

    public final int getRootTag() {
        boolean z10;
        if (this.mRootTag != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3863a.a(z10);
        return this.mRootTag;
    }

    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    public int getScreenX() {
        return this.mScreenX;
    }

    public int getScreenY() {
        return this.mScreenY;
    }

    public final YogaValue getStyleHeight() {
        return this.mYogaNode.g();
    }

    public final YogaValue getStylePadding(int i10) {
        return this.mYogaNode.o(j.b(i10));
    }

    public final YogaValue getStyleWidth() {
        return this.mYogaNode.p();
    }

    public final C3415h0 getThemedContext() {
        return (C3415h0) C3863a.c(this.mThemedContext);
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    public final String getViewClass() {
        return (String) C3863a.c(this.mViewClassName);
    }

    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public final boolean hasNewLayout() {
        r rVar = this.mYogaNode;
        if (rVar == null || !rVar.q()) {
            return false;
        }
        return true;
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    public final boolean hasUpdates() {
        if (this.mNodeUpdated || hasNewLayout() || isDirty()) {
            return true;
        }
        return false;
    }

    public boolean hoistNativeChildren() {
        return false;
    }

    public final boolean isDirty() {
        r rVar = this.mYogaNode;
        if (rVar == null || !rVar.r()) {
            return false;
        }
        return true;
    }

    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.s();
    }

    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public final void markLayoutSeen() {
        r rVar = this.mYogaNode;
        if (rVar != null) {
            rVar.t();
        }
    }

    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (!this.mNodeUpdated) {
            this.mNodeUpdated = true;
            V parent = getParent();
            if (parent != null) {
                parent.markUpdated();
            }
        }
    }

    public void onAfterUpdateTransaction() {
    }

    public void onBeforeLayout(D d10) {
    }

    public void onCollectExtraUpdates(s0 s0Var) {
    }

    public final void removeAllNativeChildren() {
        ArrayList<V> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    public void removeAndDisposeAllChildren() {
        if (getChildCount() != 0) {
            int i10 = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.mYogaNode != null && !isYogaLeafNode()) {
                    this.mYogaNode.u(childCount);
                }
                V childAt = getChildAt(childCount);
                childAt.mParent = null;
                i10 += childAt.c();
                childAt.dispose();
            }
            ((ArrayList) C3863a.c(this.mChildren)).clear();
            markUpdated();
            this.mTotalNativeChildren -= i10;
            d(-i10);
        }
    }

    public void setAlignContent(a aVar) {
        this.mYogaNode.x(aVar);
    }

    public void setAlignItems(a aVar) {
        this.mYogaNode.y(aVar);
    }

    public void setAlignSelf(a aVar) {
        this.mYogaNode.z(aVar);
    }

    public void setBaselineFunction(b bVar) {
        this.mYogaNode.B(bVar);
    }

    public void setBorder(int i10, float f10) {
        this.mYogaNode.C(j.b(i10), f10);
    }

    public void setColumnGap(float f10) {
        this.mYogaNode.N(m.COLUMN, f10);
    }

    public void setColumnGapPercent(float f10) {
        this.mYogaNode.O(m.COLUMN, f10);
    }

    public void setDefaultPadding(int i10, float f10) {
        this.mDefaultPadding.c(i10, f10);
        e();
    }

    public void setDisplay(i iVar) {
        this.mYogaNode.F(iVar);
    }

    public void setFlex(float f10) {
        this.mYogaNode.G(f10);
    }

    public void setFlexBasis(float f10) {
        this.mYogaNode.H(f10);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.I();
    }

    public void setFlexBasisPercent(float f10) {
        this.mYogaNode.J(f10);
    }

    public void setFlexDirection(l lVar) {
        this.mYogaNode.K(lVar);
    }

    public void setFlexGrow(float f10) {
        this.mYogaNode.L(f10);
    }

    public void setFlexShrink(float f10) {
        this.mYogaNode.M(f10);
    }

    public void setFlexWrap(x xVar) {
        this.mYogaNode.q0(xVar);
    }

    public void setGap(float f10) {
        this.mYogaNode.N(m.ALL, f10);
    }

    public void setGapPercent(float f10) {
        this.mYogaNode.N(m.ALL, f10);
    }

    public final void setIsLayoutOnly(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (getParent() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3863a.b(z11, "Must remove from no opt parent first");
        if (this.mNativeParent == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        C3863a.b(z12, "Must remove from native parent first");
        if (getNativeChildCount() == 0) {
            z13 = true;
        }
        C3863a.b(z13, "Must remove all native children first");
        this.mIsLayoutOnly = z10;
    }

    public void setJustifyContent(n nVar) {
        this.mYogaNode.S(nVar);
    }

    public void setLayoutDirection(h hVar) {
        this.mYogaNode.E(hVar);
    }

    public void setLocalData(Object obj) {
    }

    public void setMargin(int i10, float f10) {
        this.mYogaNode.T(j.b(i10), f10);
    }

    public void setMarginAuto(int i10) {
        this.mYogaNode.U(j.b(i10));
    }

    public void setMarginPercent(int i10, float f10) {
        this.mYogaNode.V(j.b(i10), f10);
    }

    public void setMeasureFunction(o oVar) {
        this.mYogaNode.a0(oVar);
    }

    public void setMeasureSpecs(int i10, int i11) {
        this.mWidthMeasureSpec = Integer.valueOf(i10);
        this.mHeightMeasureSpec = Integer.valueOf(i11);
    }

    public void setOverflow(u uVar) {
        this.mYogaNode.g0(uVar);
    }

    public void setPadding(int i10, float f10) {
        this.mPadding[i10] = f10;
        this.mPaddingIsPercent[i10] = false;
        e();
    }

    public void setPaddingPercent(int i10, float f10) {
        this.mPadding[i10] = f10;
        this.mPaddingIsPercent[i10] = !g.a(f10);
        e();
    }

    public void setPosition(int i10, float f10) {
        this.mYogaNode.k0(j.b(i10), f10);
    }

    public void setPositionPercent(int i10, float f10) {
        this.mYogaNode.l0(j.b(i10), f10);
    }

    public void setPositionType(v vVar) {
        this.mYogaNode.m0(vVar);
    }

    public void setReactTag(int i10) {
        this.mReactTag = i10;
    }

    public final void setRootTag(int i10) {
        this.mRootTag = i10;
    }

    public void setRowGap(float f10) {
        this.mYogaNode.N(m.ROW, f10);
    }

    public void setRowGapPercent(float f10) {
        this.mYogaNode.O(m.ROW, f10);
    }

    public void setShouldNotifyOnLayout(boolean z10) {
        this.mShouldNotifyOnLayout = z10;
    }

    public void setStyleAspectRatio(float f10) {
        this.mYogaNode.A(f10);
    }

    public void setStyleHeight(float f10) {
        this.mYogaNode.P(f10);
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.Q();
    }

    public void setStyleHeightPercent(float f10) {
        this.mYogaNode.R(f10);
    }

    public void setStyleMaxHeight(float f10) {
        this.mYogaNode.W(f10);
    }

    public void setStyleMaxHeightPercent(float f10) {
        this.mYogaNode.X(f10);
    }

    public void setStyleMaxWidth(float f10) {
        this.mYogaNode.Y(f10);
    }

    public void setStyleMaxWidthPercent(float f10) {
        this.mYogaNode.Z(f10);
    }

    public void setStyleMinHeight(float f10) {
        this.mYogaNode.b0(f10);
    }

    public void setStyleMinHeightPercent(float f10) {
        this.mYogaNode.c0(f10);
    }

    public void setStyleMinWidth(float f10) {
        this.mYogaNode.d0(f10);
    }

    public void setStyleMinWidthPercent(float f10) {
        this.mYogaNode.e0(f10);
    }

    public void setStyleWidth(float f10) {
        this.mYogaNode.n0(f10);
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.o0();
    }

    public void setStyleWidthPercent(float f10) {
        this.mYogaNode.p0(f10);
    }

    public void setThemedContext(C3415h0 h0Var) {
        this.mThemedContext = h0Var;
    }

    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getReactTag() + "]";
    }

    public final void updateProperties(W w10) {
        x0.f(this, w10);
        onAfterUpdateTransaction();
    }

    public void addChildAt(V v10, int i10) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i10, v10);
        v10.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            r rVar = v10.mYogaNode;
            if (rVar != null) {
                this.mYogaNode.a(rVar, i10);
            } else {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + v10.toString() + "' to a '" + toString() + "')");
            }
        }
        markUpdated();
        int c10 = v10.c();
        this.mTotalNativeChildren += c10;
        d(c10);
    }

    public final void addNativeChildAt(V v10, int i10) {
        boolean z10 = false;
        C3863a.a(getNativeKind() == B.PARENT);
        if (v10.getNativeKind() != B.NONE) {
            z10 = true;
        }
        C3863a.a(z10);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i10, v10);
        v10.mNativeParent = this;
    }

    public void calculateLayout(float f10, float f11) {
        this.mYogaNode.c(f10, f11);
    }

    public final V getChildAt(int i10) {
        ArrayList<V> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    public final V getLayoutParent() {
        V v10 = this.mLayoutParent;
        return v10 != null ? v10 : getNativeParent();
    }

    public final int getNativeOffsetForChild(V v10) {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            V childAt = getChildAt(i11);
            if (v10 == childAt) {
                return i10;
            }
            i10 += childAt.c();
        }
        throw new RuntimeException("Child " + v10.getReactTag() + " was not a child of " + this.mReactTag);
    }

    public final V getNativeParent() {
        return this.mNativeParent;
    }

    public final V getParent() {
        return this.mParent;
    }

    public final int indexOf(V v10) {
        ArrayList<V> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(v10);
    }

    public final int indexOfNativeChild(V v10) {
        C3863a.c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(v10);
    }

    public boolean isDescendantOf(V v10) {
        for (V parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == v10) {
                return true;
            }
        }
        return false;
    }

    public V removeChildAt(int i10) {
        ArrayList<V> arrayList = this.mChildren;
        if (arrayList != null) {
            V remove = arrayList.remove(i10);
            remove.mParent = null;
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.u(i10);
            }
            markUpdated();
            int c10 = remove.c();
            this.mTotalNativeChildren -= c10;
            d(-c10);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    public final V removeNativeChildAt(int i10) {
        C3863a.c(this.mNativeChildren);
        V remove = this.mNativeChildren.remove(i10);
        remove.mNativeParent = null;
        return remove;
    }

    public final void setLayoutParent(V v10) {
        this.mLayoutParent = v10;
    }
}
