package com.swmansion.reanimated.layoutReanimation;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TabNavigatorObserver {
    private final Set<Integer> mFragmentsWithListenerRegistry = new HashSet();
    /* access modifiers changed from: private */
    public final ReaLayoutAnimator mReaLayoutAnimator;

    class FragmentLifecycleCallbacks extends J.k {
        private View firstScreen;
        private Method getActivityState;
        private Method getScreen;
        private final List<View> nextTransition = new ArrayList();
        private final Set<Integer> screenTagsWithListener = new HashSet();

        public FragmentLifecycleCallbacks(C1769q qVar) {
            String str;
            if (ScreensHelper.isScreenFragment(qVar)) {
                try {
                    Method method = qVar.getClass().getMethod("getScreen", (Class[]) null);
                    this.getScreen = method;
                    View view = (View) method.invoke(qVar, (Object[]) null);
                    this.getActivityState = view.getClass().getMethod("getActivityState", (Class[]) null);
                    addScreenListener(view);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    if (e10.getMessage() != null) {
                        str = e10.getMessage();
                    } else {
                        str = "Unable to get screen activity state";
                    }
                    Log.e("[Reanimated]", str);
                }
            }
        }

        private void addScreenListener(View view) {
            if (!this.screenTagsWithListener.contains(Integer.valueOf(view.getId()))) {
                this.screenTagsWithListener.add(Integer.valueOf(view.getId()));
                view.addOnAttachStateChangeListener(new OnAttachStateChangeListener());
                view.addOnLayoutChangeListener(new f(this));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$addScreenListener$0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (!this.nextTransition.isEmpty()) {
                TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().navigationTabChanged(this.nextTransition.get(0), this.nextTransition.get(1));
                this.nextTransition.clear();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void onFragmentUpdate(androidx.fragment.app.C1769q r3, boolean r4) {
            /*
                r2 = this;
                boolean r0 = com.swmansion.reanimated.layoutReanimation.ScreensHelper.isScreenFragment(r3)
                if (r0 != 0) goto L_0x0007
                return
            L_0x0007:
                java.lang.reflect.Method r0 = r2.getScreen     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                r1 = 0
                java.lang.Object r3 = r0.invoke(r3, r1)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                android.view.View r3 = (android.view.View) r3     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                java.lang.reflect.Method r0 = r2.getActivityState     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                java.lang.Object r0 = r0.invoke(r3, r1)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                if (r0 != 0) goto L_0x0019
                return
            L_0x0019:
                r2.addScreenListener(r3)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                android.view.View r0 = r2.firstScreen     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                if (r0 != 0) goto L_0x0027
                r2.firstScreen = r3     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                return
            L_0x0023:
                r3 = move-exception
                goto L_0x0043
            L_0x0025:
                r3 = move-exception
                goto L_0x0043
            L_0x0027:
                if (r4 == 0) goto L_0x0034
                java.util.List<android.view.View> r4 = r2.nextTransition     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                r4.add(r0)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                java.util.List<android.view.View> r4 = r2.nextTransition     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                r4.add(r3)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                goto L_0x0040
            L_0x0034:
                java.util.List<android.view.View> r4 = r2.nextTransition     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                r4.add(r3)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                java.util.List<android.view.View> r3 = r2.nextTransition     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                android.view.View r4 = r2.firstScreen     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                r3.add(r4)     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
            L_0x0040:
                r2.firstScreen = r1     // Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0023 }
                goto L_0x0055
            L_0x0043:
                java.lang.String r4 = r3.getMessage()
                if (r4 == 0) goto L_0x004e
                java.lang.String r3 = r3.getMessage()
                goto L_0x0050
            L_0x004e:
                java.lang.String r3 = "Unable to get screen view"
            L_0x0050:
                java.lang.String r4 = "[Reanimated]"
                android.util.Log.e(r4, r3)
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.layoutReanimation.TabNavigatorObserver.FragmentLifecycleCallbacks.onFragmentUpdate(androidx.fragment.app.q, boolean):void");
        }

        public void onFragmentAttached(J j10, C1769q qVar, Context context) {
            onFragmentUpdate(qVar, true);
        }

        public void onFragmentDetached(J j10, C1769q qVar) {
            onFragmentUpdate(qVar, false);
        }
    }

    class OnAttachStateChangeListener implements View.OnAttachStateChangeListener {
        OnAttachStateChangeListener() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().visitNativeTreeAndMakeSnapshot(view);
        }
    }

    public TabNavigatorObserver(ReaLayoutAnimator reaLayoutAnimator) {
        this.mReaLayoutAnimator = reaLayoutAnimator;
    }

    public void handleScreenContainerUpdate(View view) {
        String str;
        try {
            C1769q qVar = (C1769q) view.getClass().getMethod("getFragment", (Class[]) null).invoke(view, (Object[]) null);
            int id2 = qVar.getId();
            if (!this.mFragmentsWithListenerRegistry.contains(Integer.valueOf(id2))) {
                this.mFragmentsWithListenerRegistry.add(Integer.valueOf(id2));
                qVar.getParentFragmentManager().n1(new FragmentLifecycleCallbacks(qVar), true);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            if (e10.getMessage() != null) {
                str = e10.getMessage();
            } else {
                str = "Unable to get screen fragment";
            }
            Log.e("[Reanimated]", str);
        }
    }
}
