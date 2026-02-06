package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.C3367m;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.yoga.h;
import d8.C3480a;
import i8.e;
import i8.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import z8.C4236a;
import z8.C4237b;

public class C {
    private static final String TAG = "C";
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final C3480a mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private final e mLayoutAnimator;
    /* access modifiers changed from: private */
    public HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final B0 mViewManagers;

    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f41378a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f41379b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f41380c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Set f41381d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f41382e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i10) {
            this.f41378a = viewGroupManager;
            this.f41379b = viewGroup;
            this.f41380c = view;
            this.f41381d = set;
            this.f41382e = i10;
        }

        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f41378a.removeView(this.f41379b, this.f41380c);
            C.this.dropView(this.f41380c);
            this.f41381d.remove(Integer.valueOf(this.f41380c.getId()));
            if (this.f41381d.isEmpty()) {
                C.this.mPendingDeletionsForTag.remove(Integer.valueOf(this.f41382e));
            }
        }
    }

    public C(B0 b02) {
        this(b02, new RootViewManager());
    }

    private boolean b(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void c(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        g(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String d(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, u0[] u0VarArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i10 = 0; viewGroupManager.getChildAt(viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt(viewGroup, i12) == null || i11 >= 16) {
                        sb2.append("\n");
                    } else {
                        sb2.append(viewGroupManager.getChildAt(viewGroup, i12).getId() + com.amazon.a.a.o.b.f.f37529a);
                        i11++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 >= iArr.length || i14 >= 16) {
                        sb2.append("\n");
                    } else {
                        sb2.append(iArr[i15] + com.amazon.a.a.o.b.f.f37529a);
                        i14++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (u0VarArr != null) {
            sb2.append("  viewsToAdd(" + u0VarArr.length + "): [\n");
            for (int i16 = 0; i16 < u0VarArr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 >= u0VarArr.length || i17 >= 16) {
                        sb2.append("\n");
                    } else {
                        sb2.append("[" + u0VarArr[i18].f41823b + com.amazon.a.a.o.b.f.f37529a + u0VarArr[i18].f41822a + "],");
                        i17++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 >= iArr2.length || i20 >= 16) {
                        sb2.append("\n");
                    } else {
                        sb2.append(iArr2[i21] + com.amazon.a.a.o.b.f.f37529a);
                        i20++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String e(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        u0[] u0VarArr = new u0[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            u0VarArr[i10] = new u0(readableArray.getInt(i10), i10);
        }
        return d(viewGroup, viewGroupManager, (int[]) null, u0VarArr, (int[]) null);
    }

    private Set f(int i10) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i10))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i10), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i10));
    }

    private void g(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset((float) view.getLeft(), (float) view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset((float) view2.getLeft(), (float) view2.getTop());
            parent = view2.getParent();
        }
    }

    private void h(View view, long j10) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(C3367m.f40923D, Long.valueOf(j10));
    }

    private void i(View view, int i10, int i11, int i12, int i13) {
        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view)) {
            view.layout(i10, i11, i12 + i10, i13 + i11);
        } else {
            this.mLayoutAnimator.applyLayoutUpdate(view, i10, i11, i12, i13);
        }
    }

    public synchronized void addRootView(int i10, View view) {
        addRootViewGroup(i10, view);
    }

    /* access modifiers changed from: protected */
    public final synchronized void addRootViewGroup(int i10, View view) {
        String str;
        try {
            if (this.DEBUG_MODE) {
                String str2 = TAG;
                Integer valueOf = Integer.valueOf(i10);
                if (view != null) {
                    str = view.toString();
                } else {
                    str = "<null>";
                }
                U5.a.d(str2, "addRootViewGroup[%d]: %s", valueOf, str);
            }
            if (view.getId() != -1) {
                String str3 = TAG;
                U5.a.m(str3, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.mTagsToViews.put(i10, view);
            this.mTagsToViewManagers.put(i10, this.mRootViewManager);
            this.mRootTags.put(i10, true);
            view.setId(i10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    /* access modifiers changed from: package-private */
    public synchronized void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    /* access modifiers changed from: package-private */
    public synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(C3415h0 h0Var, int i10, String str, W w10) {
        String str2;
        try {
            if (this.DEBUG_MODE) {
                String str3 = TAG;
                Integer valueOf = Integer.valueOf(i10);
                if (w10 != null) {
                    str2 = w10.toString();
                } else {
                    str2 = "<null>";
                }
                U5.a.e(str3, "createView[%d]: %s %s", valueOf, str, str2);
            }
            UiThreadUtil.assertOnUiThread();
            C4237b.a(0, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
            ViewManager c10 = this.mViewManagers.c(str);
            this.mTagsToViews.put(i10, c10.createView(i10, h0Var, w10, (C3413g0) null, this.mJSResponderHandler));
            this.mTagsToViewManagers.put(i10, c10);
            C4236a.i(0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.e(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i10), Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view != null) {
                resolveViewManager(i10).receiveCommand(view, i11, readableArray);
            } else {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void dropView(View view) {
        int i10;
        try {
            if (this.DEBUG_MODE) {
                String str = TAG;
                if (view != null) {
                    i10 = view.getId();
                } else {
                    i10 = -1;
                }
                U5.a.c(str, "dropView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (view != null) {
                if (this.mTagsToViewManagers.get(view.getId()) != null) {
                    if (!this.mRootTags.get(view.getId())) {
                        resolveViewManager(view.getId()).onDropViewInstance(view);
                    }
                    ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
                    if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                        for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                            View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                            if (childAt == null) {
                                U5.a.m(TAG, "Unable to drop null child view");
                            } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                                dropView(childAt);
                            }
                        }
                        viewGroupManager.removeAllViews(viewGroup);
                    }
                    this.mTagsToViews.remove(view.getId());
                    this.mTagsToViewManagers.remove(view.getId());
                }
            }
        } finally {
            while (true) {
            }
        }
    }

    public synchronized int findTargetTagForTouch(int i10, float f10, float f11) {
        View view;
        try {
            if (this.DEBUG_MODE) {
                U5.a.e(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = this.mTagsToViews.get(i10);
            if (view != null) {
            } else {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i0.d(f10, f11, (ViewGroup) view);
    }

    public synchronized long getInstanceHandle(int i10) {
        Long l10;
        View view = this.mTagsToViews.get(i10);
        if (view != null) {
            l10 = (Long) view.getTag(C3367m.f40923D);
            if (l10 != null) {
            } else {
                throw new r("Unable to find instanceHandle for tag: " + i10);
            }
        } else {
            throw new r("Unable to find view for tag: " + i10);
        }
        return l10.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void manageChildren(int r18, int[] r19, com.facebook.react.uimanager.u0[] r20, int[] r21) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            monitor-enter(r17)
            boolean r1 = r8.DEBUG_MODE     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x003e
            java.lang.String r2 = TAG     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "createView[%d]: %s %s %s"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x001f }
            if (r9 == 0) goto L_0x0022
            java.lang.String r1 = r19.toString()     // Catch:{ all -> 0x001f }
        L_0x001d:
            r5 = r1
            goto L_0x0025
        L_0x001f:
            r0 = move-exception
            goto L_0x0235
        L_0x0022:
            java.lang.String r1 = "<null>"
            goto L_0x001d
        L_0x0025:
            if (r10 == 0) goto L_0x002d
            java.lang.String r1 = r20.toString()     // Catch:{ all -> 0x001f }
        L_0x002b:
            r6 = r1
            goto L_0x0030
        L_0x002d:
            java.lang.String r1 = "<null>"
            goto L_0x002b
        L_0x0030:
            if (r11 == 0) goto L_0x0038
            java.lang.String r1 = r21.toString()     // Catch:{ all -> 0x001f }
        L_0x0036:
            r7 = r1
            goto L_0x003b
        L_0x0038:
            java.lang.String r1 = "<null>"
            goto L_0x0036
        L_0x003b:
            U5.a.f(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x001f }
        L_0x003e:
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x001f }
            java.util.Set r12 = r17.f(r18)     // Catch:{ all -> 0x001f }
            android.util.SparseArray<android.view.View> r1 = r8.mTagsToViews     // Catch:{ all -> 0x001f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
            r13 = r1
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13     // Catch:{ all -> 0x001f }
            com.facebook.react.uimanager.ViewManager r1 = r17.resolveViewManager(r18)     // Catch:{ all -> 0x001f }
            r14 = r1
            com.facebook.react.uimanager.ViewGroupManager r14 = (com.facebook.react.uimanager.ViewGroupManager) r14     // Catch:{ all -> 0x001f }
            if (r13 == 0) goto L_0x020f
            int r1 = r14.getChildCount(r13)     // Catch:{ all -> 0x001f }
            if (r9 == 0) goto L_0x0121
            int r2 = r9.length     // Catch:{ all -> 0x001f }
            int r2 = r2 + -1
        L_0x0060:
            if (r2 < 0) goto L_0x0121
            r3 = r9[r2]     // Catch:{ all -> 0x001f }
            if (r3 < 0) goto L_0x00f6
            android.view.View r4 = r14.getChildAt(r13, (int) r3)     // Catch:{ all -> 0x001f }
            if (r4 != 0) goto L_0x00a7
            android.util.SparseBooleanArray r1 = r8.mRootTags     // Catch:{ all -> 0x001f }
            boolean r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x007c
            int r1 = r14.getChildCount(r13)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x007c
            monitor-exit(r17)
            return
        L_0x007c:
            com.facebook.react.uimanager.r r1 = new com.facebook.react.uimanager.r     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r4 = "Trying to remove a view index above child count "
            r2.append(r4)     // Catch:{ all -> 0x001f }
            r2.append(r3)     // Catch:{ all -> 0x001f }
            java.lang.String r3 = " view tag: "
            r2.append(r3)     // Catch:{ all -> 0x001f }
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "\n detail: "
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = d(r13, r14, r9, r10, r11)     // Catch:{ all -> 0x001f }
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x001f }
            r1.<init>(r0)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x001f }
        L_0x00a7:
            if (r3 >= r1) goto L_0x00cb
            android.view.View r1 = r14.getChildAt(r13, (int) r3)     // Catch:{ all -> 0x001f }
            boolean r4 = r8.mLayoutAnimationEnabled     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x00c4
            i8.e r4 = r8.mLayoutAnimator     // Catch:{ all -> 0x001f }
            boolean r4 = r4.shouldAnimateLayout(r1)     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x00c4
            int r1 = r1.getId()     // Catch:{ all -> 0x001f }
            boolean r1 = r8.b(r11, r1)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            r14.removeViewAt(r13, (int) r3)     // Catch:{ all -> 0x001f }
        L_0x00c7:
            int r2 = r2 + -1
            r1 = r3
            goto L_0x0060
        L_0x00cb:
            com.facebook.react.uimanager.r r1 = new com.facebook.react.uimanager.r     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r4 = "Trying to remove an out of order view index:"
            r2.append(r4)     // Catch:{ all -> 0x001f }
            r2.append(r3)     // Catch:{ all -> 0x001f }
            java.lang.String r3 = " view tag: "
            r2.append(r3)     // Catch:{ all -> 0x001f }
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "\n detail: "
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = d(r13, r14, r9, r10, r11)     // Catch:{ all -> 0x001f }
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x001f }
            r1.<init>(r0)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x001f }
        L_0x00f6:
            com.facebook.react.uimanager.r r1 = new com.facebook.react.uimanager.r     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r4 = "Trying to remove a negative view index:"
            r2.append(r4)     // Catch:{ all -> 0x001f }
            r2.append(r3)     // Catch:{ all -> 0x001f }
            java.lang.String r3 = " view tag: "
            r2.append(r3)     // Catch:{ all -> 0x001f }
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "\n detail: "
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = d(r13, r14, r9, r10, r11)     // Catch:{ all -> 0x001f }
            r2.append(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x001f }
            r1.<init>(r0)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0121:
            if (r11 == 0) goto L_0x0192
            r7 = 0
        L_0x0124:
            int r1 = r11.length     // Catch:{ all -> 0x001f }
            if (r7 >= r1) goto L_0x0192
            r1 = r11[r7]     // Catch:{ all -> 0x001f }
            android.util.SparseArray<android.view.View> r2 = r8.mTagsToViews     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x001f }
            r6 = r2
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x001f }
            if (r6 == 0) goto L_0x016d
            boolean r2 = r8.mLayoutAnimationEnabled     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0160
            i8.e r2 = r8.mLayoutAnimator     // Catch:{ all -> 0x001f }
            boolean r2 = r2.shouldAnimateLayout(r6)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0160
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x001f }
            r12.add(r1)     // Catch:{ all -> 0x001f }
            i8.e r5 = r8.mLayoutAnimator     // Catch:{ all -> 0x001f }
            com.facebook.react.uimanager.C$a r4 = new com.facebook.react.uimanager.C$a     // Catch:{ all -> 0x001f }
            r1 = r4
            r2 = r17
            r3 = r14
            r15 = r4
            r4 = r13
            r0 = r5
            r5 = r6
            r9 = r6
            r6 = r12
            r16 = r7
            r7 = r18
            r1.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x001f }
            r0.deleteView(r9, r15)     // Catch:{ all -> 0x001f }
            goto L_0x0166
        L_0x0160:
            r9 = r6
            r16 = r7
            r8.dropView(r9)     // Catch:{ all -> 0x001f }
        L_0x0166:
            int r7 = r16 + 1
            r0 = r18
            r9 = r19
            goto L_0x0124
        L_0x016d:
            com.facebook.react.uimanager.r r0 = new com.facebook.react.uimanager.r     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "Trying to destroy unknown view tag: "
            r2.append(r3)     // Catch:{ all -> 0x001f }
            r2.append(r1)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "\n detail: "
            r2.append(r1)     // Catch:{ all -> 0x001f }
            r1 = r19
            java.lang.String r1 = d(r13, r14, r1, r10, r11)     // Catch:{ all -> 0x001f }
            r2.append(r1)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x001f }
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            throw r0     // Catch:{ all -> 0x001f }
        L_0x0192:
            r1 = r9
            if (r10 == 0) goto L_0x01fe
            r0 = 0
        L_0x0196:
            int r2 = r10.length     // Catch:{ all -> 0x001f }
            if (r0 >= r2) goto L_0x01fe
            r2 = r10[r0]     // Catch:{ all -> 0x001f }
            android.util.SparseArray<android.view.View> r3 = r8.mTagsToViews     // Catch:{ all -> 0x001f }
            int r4 = r2.f41822a     // Catch:{ all -> 0x001f }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x001f }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x01d9
            int r4 = r2.f41823b     // Catch:{ all -> 0x001f }
            boolean r5 = r12.isEmpty()     // Catch:{ all -> 0x001f }
            if (r5 != 0) goto L_0x01d3
            r4 = 0
            r5 = 0
        L_0x01b1:
            int r6 = r13.getChildCount()     // Catch:{ all -> 0x001f }
            if (r4 >= r6) goto L_0x01d3
            int r6 = r2.f41823b     // Catch:{ all -> 0x001f }
            if (r5 != r6) goto L_0x01bc
            goto L_0x01d3
        L_0x01bc:
            android.view.View r6 = r13.getChildAt(r4)     // Catch:{ all -> 0x001f }
            int r6 = r6.getId()     // Catch:{ all -> 0x001f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x001f }
            boolean r6 = r12.contains(r6)     // Catch:{ all -> 0x001f }
            if (r6 != 0) goto L_0x01d0
            int r5 = r5 + 1
        L_0x01d0:
            int r4 = r4 + 1
            goto L_0x01b1
        L_0x01d3:
            r14.addView(r13, (android.view.View) r3, (int) r4)     // Catch:{ all -> 0x001f }
            int r0 = r0 + 1
            goto L_0x0196
        L_0x01d9:
            com.facebook.react.uimanager.r r0 = new com.facebook.react.uimanager.r     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r4 = "Trying to add unknown view tag: "
            r3.append(r4)     // Catch:{ all -> 0x001f }
            int r2 = r2.f41822a     // Catch:{ all -> 0x001f }
            r3.append(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r2 = "\n detail: "
            r3.append(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = d(r13, r14, r1, r10, r11)     // Catch:{ all -> 0x001f }
            r3.append(r1)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x001f }
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            throw r0     // Catch:{ all -> 0x001f }
        L_0x01fe:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x020d
            java.util.HashMap<java.lang.Integer, java.util.Set<java.lang.Integer>> r0 = r8.mPendingDeletionsForTag     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x001f }
            r0.remove(r1)     // Catch:{ all -> 0x001f }
        L_0x020d:
            monitor-exit(r17)
            return
        L_0x020f:
            r1 = r9
            com.facebook.react.uimanager.r r0 = new com.facebook.react.uimanager.r     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "Trying to manageChildren view with tag "
            r2.append(r3)     // Catch:{ all -> 0x001f }
            r3 = r18
            r2.append(r3)     // Catch:{ all -> 0x001f }
            java.lang.String r3 = " which doesn't exist\n detail: "
            r2.append(r3)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = d(r13, r14, r1, r10, r11)     // Catch:{ all -> 0x001f }
            r2.append(r1)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x001f }
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            throw r0     // Catch:{ all -> 0x001f }
        L_0x0235:
            monitor-exit(r17)     // Catch:{ all -> 0x001f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C.manageChildren(int, int[], com.facebook.react.uimanager.u0[], int[]):void");
    }

    public synchronized void measure(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.c(TAG, "measure[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view != null) {
                View view2 = (View) C3407d0.a(view);
                if (view2 != null) {
                    c(view2, iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    c(view, iArr);
                    iArr[0] = iArr[0] - i11;
                    iArr[1] = iArr[1] - i12;
                } else {
                    throw new E("Native view " + i10 + " is no longer on screen");
                }
            } else {
                throw new E("No native view for " + i10 + " currently exists");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void measureInWindow(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.c(TAG, "measureInWindow[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view != null) {
                view.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                iArr[0] = iArr[0] - rect.left;
                iArr[1] = iArr[1] - rect.top;
                iArr[2] = view.getWidth();
                iArr[3] = view.getHeight();
            } else {
                throw new E("No native view for " + i10 + " currently exists");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void removeRootView(int i10) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.c(TAG, "removeRootView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i10)) {
                SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
            }
            dropView(this.mTagsToViews.get(i10));
            this.mRootTags.delete(i10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized View resolveView(int i10) {
        View view;
        view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new r("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i10) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i10);
        if (viewManager == null) {
            throw new r("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i10, int i11) {
        View view = this.mTagsToViews.get(i10);
        if (view != null) {
            view.sendAccessibilityEvent(i11);
        } else {
            throw new RetryableMountingLayerException("Could not find view with tag " + i10);
        }
    }

    public synchronized void setChildren(int i10, ReadableArray readableArray) {
        String str;
        try {
            if (this.DEBUG_MODE) {
                String str2 = TAG;
                Integer valueOf = Integer.valueOf(i10);
                if (readableArray != null) {
                    str = readableArray.toString();
                } else {
                    str = "<null>";
                }
                U5.a.d(str2, "setChildren[%d]: %s", valueOf, str);
            }
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
            int i11 = 0;
            while (i11 < readableArray.size()) {
                View view = this.mTagsToViews.get(readableArray.getInt(i11));
                if (view != null) {
                    viewGroupManager.addView(viewGroup, view, i11);
                    i11++;
                } else {
                    throw new r("Trying to add unknown view tag: " + readableArray.getInt(i11) + "\n detail: " + e(viewGroup, viewGroupManager, readableArray));
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        if (!z10) {
            this.mJSResponderHandler.d(i11, (ViewParent) null);
            return;
        }
        View view = this.mTagsToViews.get(i10);
        if (i11 == i10 || !(view instanceof ViewParent)) {
            if (this.mRootTags.get(i10)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
            }
            this.mJSResponderHandler.d(i11, view.getParent());
            return;
        }
        this.mJSResponderHandler.d(i11, (ViewParent) view);
    }

    public void setLayoutAnimationEnabled(boolean z10) {
        this.mLayoutAnimationEnabled = z10;
    }

    public synchronized void updateInstanceHandle(int i10, long j10) {
        UiThreadUtil.assertOnUiThread();
        try {
            h(resolveView(i10), j10);
        } catch (r e10) {
            String str = TAG;
            U5.a.n(str, "Unable to update properties for view tag " + i10, e10);
        }
    }

    @Deprecated
    public void updateLayout(int i10, int i11, int i12, int i13, int i14) {
        updateLayout(i10, i10, i11, i12, i13, i14, h.INHERIT);
    }

    public synchronized void updateProperties(int i10, W w10) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i10), w10.toString());
            }
            UiThreadUtil.assertOnUiThread();
            ViewManager resolveViewManager = resolveViewManager(i10);
            View resolveView = resolveView(i10);
            if (w10 != null) {
                resolveViewManager.updateProperties(resolveView, w10);
            }
        } catch (r e10) {
            String str = TAG;
            U5.a.n(str, "Unable to update properties for view tag " + i10, e10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void updateViewExtraData(int i10, Object obj) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i10), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            resolveViewManager(i10).updateExtraData(resolveView(i10), obj);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public C(B0 b02, RootViewManager rootViewManager) {
        E7.a aVar = E7.a.f30668a;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new C3480a();
        this.mLayoutAnimator = new e();
        this.mBoundingBox = new RectF();
        this.mViewManagers = b02;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    /* JADX INFO: finally extract failed */
    public synchronized void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, h hVar) {
        int i16 = i10;
        int i17 = i11;
        synchronized (this) {
            try {
                if (this.DEBUG_MODE) {
                    U5.a.h(TAG, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
                }
                UiThreadUtil.assertOnUiThread();
                C4237b.a(0, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i17).c();
                View resolveView = resolveView(i17);
                resolveView.setLayoutDirection(C3427u.a(hVar));
                resolveView.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                ViewParent parent = resolveView.getParent();
                if (parent instanceof C3405c0) {
                    parent.requestLayout();
                }
                if (!this.mRootTags.get(i10)) {
                    ViewManager viewManager = this.mTagsToViewManagers.get(i10);
                    if (viewManager instanceof C3424q) {
                        C3424q qVar = (C3424q) viewManager;
                        if (qVar != null && !qVar.needsCustomLayoutForChildren()) {
                            i(resolveView, i12, i13, i14, i15);
                        }
                    } else {
                        throw new r("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                    }
                } else {
                    i(resolveView, i12, i13, i14, i15);
                }
                C4236a.i(0);
            } catch (Throwable th2) {
                C4236a.i(0);
                throw th2;
            } finally {
            }
        }
    }

    public synchronized void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                U5.a.e(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i10), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view != null) {
                resolveViewManager(i10).receiveCommand(view, str, readableArray);
            } else {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
