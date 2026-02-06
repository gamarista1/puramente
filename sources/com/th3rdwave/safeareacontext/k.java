package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.e;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.J;
import lf.C6514M;

public final class k extends e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private o f60020a = o.PADDING;

    /* renamed from: b  reason: collision with root package name */
    private a f60021b;

    /* renamed from: c  reason: collision with root package name */
    private m f60022c;

    /* renamed from: d  reason: collision with root package name */
    private View f60023d;

    /* renamed from: e  reason: collision with root package name */
    private C3413g0 f60024e;

    public k(Context context) {
        super(context);
    }

    private final View n() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof f) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean o() {
        a e10;
        View view = this.f60023d;
        if (view == null || (e10 = h.e(view)) == null || C6496s.c(this.f60021b, e10)) {
            return false;
        }
        this.f60021b = e10;
        p();
        return true;
    }

    private final void p() {
        a aVar = this.f60021b;
        if (aVar != null) {
            m mVar = this.f60022c;
            if (mVar == null) {
                l lVar = l.ADDITIVE;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            C3413g0 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putMap("insets", q.b(aVar));
                stateWrapper.updateState(createMap);
                return;
            }
            n nVar = new n(aVar, this.f60020a, mVar);
            ReactContext a10 = r.a(this);
            UIManagerModule uIManagerModule = (UIManagerModule) a10.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                a10.runOnNativeModulesQueueThread(new i(uIManagerModule));
                r();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void q(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    private final void r() {
        J j10 = new J();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        long nanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new j(reentrantLock, j10, newCondition));
        reentrantLock.lock();
        long j11 = 0;
        while (!j10.f71755a && j11 < 500000000) {
            try {
                newCondition.awaitNanos(500000000);
            } catch (InterruptedException unused) {
                j10.f71755a = true;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
            j11 += System.nanoTime() - nanoTime;
        }
        C6514M m10 = C6514M.f71813a;
        reentrantLock.unlock();
        if (j11 >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    /* access modifiers changed from: private */
    public static final void s(ReentrantLock reentrantLock, J j10, Condition condition) {
        reentrantLock.lock();
        try {
            if (!j10.f71755a) {
                j10.f71755a = true;
                condition.signal();
            }
            C6514M m10 = C6514M.f71813a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final C3413g0 getStateWrapper() {
        return this.f60024e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View n10 = n();
        this.f60023d = n10;
        if (!(n10 == null || (viewTreeObserver = n10.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        o();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f60023d;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f60023d = null;
    }

    public boolean onPreDraw() {
        boolean o10 = o();
        if (o10) {
            requestLayout();
        }
        return !o10;
    }

    public final void setEdges(m mVar) {
        C6496s.h(mVar, "edges");
        this.f60022c = mVar;
        p();
    }

    public final void setMode(o oVar) {
        C6496s.h(oVar, "mode");
        this.f60020a = oVar;
        p();
    }

    public final void setStateWrapper(C3413g0 g0Var) {
        this.f60024e = g0Var;
    }
}
