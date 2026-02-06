package com.reactnativepagerview;

import C7.d;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.w0;
import com.facebook.soloader.SoLoader;
import e8.C3500a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C3834v;
import m8.C3836w;
import n7.C3863a;
import qd.C5151a;
import qd.C5152b;
import qd.C5153c;

@Q7.a(name = "RNCViewPager")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001IB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b2\u0010)J#\u00103\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b3\u00101J!\u00104\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b4\u0010)J!\u00105\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b5\u0010)J#\u00106\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b6\u00101J!\u00107\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b7\u0010/J#\u00108\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b8\u00101J!\u00109\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b9\u0010/J'\u0010<\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020*¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010)J!\u0010?\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010)J!\u0010A\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010@\u001a\u00020*H\u0016¢\u0006\u0004\bA\u0010/J'\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0C0BH\u0016¢\u0006\u0004\bD\u0010ER\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/b;", "Lm8/w;", "<init>", "()V", "Lcom/facebook/react/uimanager/w0;", "getDelegate", "()Lcom/facebook/react/uimanager/w0;", "", "getName", "()Ljava/lang/String;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Llf/M;", "receiveCommand", "(Lcom/reactnativepagerview/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/h0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/h0;)Lcom/reactnativepagerview/b;", "host", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/reactnativepagerview/b;Landroid/view/View;I)V", "parent", "getChildCount", "(Lcom/reactnativepagerview/b;)I", "getChildAt", "(Lcom/reactnativepagerview/b;I)Landroid/view/View;", "view", "removeView", "(Lcom/reactnativepagerview/b;Landroid/view/View;)V", "removeAllViews", "(Lcom/reactnativepagerview/b;)V", "removeViewAt", "(Lcom/reactnativepagerview/b;I)V", "", "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(Lcom/reactnativepagerview/b;Z)V", "setLayoutDirection", "(Lcom/reactnativepagerview/b;Ljava/lang/String;)V", "setInitialPage", "setOrientation", "setOffscreenPageLimit", "setPageMargin", "setOverScrollMode", "setOverdrag", "setKeyboardDismissMode", "setUseLegacy", "selectedPage", "scrollWithAnimation", "goTo", "(Lcom/reactnativepagerview/b;IZ)V", "setPage", "setPageWithoutAnimation", "scrollEnabled", "setScrollEnabledImperatively", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lcom/facebook/react/uimanager/w0;", "Companion", "a", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagerViewViewManager extends ViewGroupManager<b> implements C3836w {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final w0 mDelegate = new C3834v(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends f.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3415h0 f59435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f59436b;

        b(C3415h0 h0Var, b bVar) {
            this.f59435a = h0Var;
            this.f59436b = bVar;
        }

        public void a(int i10) {
            String str;
            super.a(i10);
            if (i10 == 0) {
                str = "idle";
            } else if (i10 == 1) {
                str = "dragging";
            } else if (i10 == 2) {
                str = "settling";
            } else {
                throw new IllegalStateException("Unsupported pageScrollState");
            }
            EventDispatcher c10 = n0.c(this.f59435a, this.f59436b.getId());
            if (c10 != null) {
                c10.h(new C5152b(this.f59436b.getId(), str));
            }
        }

        public void b(int i10, float f10, int i11) {
            super.b(i10, f10, i11);
            EventDispatcher c10 = n0.c(this.f59435a, this.f59436b.getId());
            if (c10 != null) {
                c10.h(new C5151a(this.f59436b.getId(), i10, f10));
            }
        }

        public void c(int i10) {
            super.c(i10);
            EventDispatcher c10 = n0.c(this.f59435a, this.f59436b.getId());
            if (c10 != null) {
                c10.h(new C5153c(this.f59436b.getId(), i10));
            }
        }
    }

    static {
        String str = a.f59437a;
        if (str != null) {
            SoLoader.t(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(f fVar, C3415h0 h0Var, b bVar) {
        fVar.g(new b(h0Var, bVar));
        EventDispatcher c10 = n0.c(h0Var, bVar.getId());
        if (c10 != null) {
            c10.h(new C5153c(bVar.getId(), fVar.getCurrentItem()));
        }
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> f10 = d.f("topPageScroll", d.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", d.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", d.d("registrationName", "onPageSelected"));
        C6496s.g(f10, "of(...)");
        return f10;
    }

    public String getName() {
        return "RNCViewPager";
    }

    public final void goTo(b bVar, int i10, boolean z10) {
        Integer num;
        if (bVar != null) {
            i iVar = i.f59451a;
            f h10 = iVar.h(bVar);
            C3863a.c(h10);
            RecyclerView.h adapter = h10.getAdapter();
            if (adapter != null) {
                num = Integer.valueOf(adapter.e());
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0 && i10 >= 0 && i10 < num.intValue()) {
                iVar.p(h10, i10, z10);
            }
        }
    }

    public boolean needsCustomLayoutForChildren() {
        return i.f59451a.i();
    }

    @C3500a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(b bVar, String str) {
    }

    @C3500a(name = "overdrag")
    public void setOverdrag(b bVar, boolean z10) {
    }

    @C3500a(name = "useLegacy")
    public void setUseLegacy(b bVar, boolean z10) {
    }

    public b createViewInstance(C3415h0 h0Var) {
        C6496s.h(h0Var, "reactContext");
        b bVar = new b(h0Var);
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bVar.setSaveEnabled(false);
        f fVar = new f(h0Var);
        fVar.setAdapter(new j());
        fVar.setSaveEnabled(false);
        fVar.post(new d(fVar, h0Var, bVar));
        bVar.addView(fVar);
        return bVar;
    }

    public void receiveCommand(b bVar, String str, ReadableArray readableArray) {
        C6496s.h(bVar, "root");
        this.mDelegate.b(bVar, str, readableArray);
    }

    public void removeAllViews(b bVar) {
        C6496s.h(bVar, "parent");
        i.f59451a.l(bVar);
    }

    public void removeView(b bVar, View view) {
        C6496s.h(bVar, "parent");
        C6496s.h(view, "view");
        i.f59451a.m(bVar, view);
    }

    @C3500a(defaultInt = 0, name = "initialPage")
    public void setInitialPage(b bVar, int i10) {
        if (bVar != null) {
            i.f59451a.q(bVar, i10);
        }
    }

    @C3500a(name = "layoutDirection")
    public void setLayoutDirection(b bVar, String str) {
        if (bVar != null && str != null) {
            i.f59451a.s(bVar, str);
        }
    }

    @C3500a(defaultInt = -1, name = "offscreenPageLimit")
    public void setOffscreenPageLimit(b bVar, int i10) {
        if (bVar != null) {
            i.f59451a.t(bVar, i10);
        }
    }

    @C3500a(name = "orientation")
    public void setOrientation(b bVar, String str) {
        if (bVar != null && str != null) {
            i.f59451a.u(bVar, str);
        }
    }

    @C3500a(name = "overScrollMode")
    public void setOverScrollMode(b bVar, String str) {
        if (bVar != null && str != null) {
            i.f59451a.v(bVar, str);
        }
    }

    public void setPage(b bVar, int i10) {
        goTo(bVar, i10, true);
    }

    @C3500a(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(b bVar, int i10) {
        if (bVar != null) {
            i.f59451a.w(bVar, i10);
        }
    }

    public void setPageWithoutAnimation(b bVar, int i10) {
        goTo(bVar, i10, false);
    }

    @C3500a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(b bVar, boolean z10) {
        if (bVar != null) {
            i.f59451a.y(bVar, z10);
        }
    }

    public void setScrollEnabledImperatively(b bVar, boolean z10) {
        if (bVar != null) {
            i.f59451a.y(bVar, z10);
        }
    }

    public void addView(b bVar, View view, int i10) {
        C6496s.h(bVar, "host");
        C6496s.h(view, "child");
        i.f59451a.e(bVar, view, i10);
    }

    public View getChildAt(b bVar, int i10) {
        C6496s.h(bVar, "parent");
        return i.f59451a.f(bVar, i10);
    }

    public int getChildCount(b bVar) {
        C6496s.h(bVar, "parent");
        return i.f59451a.g(bVar);
    }

    public void removeViewAt(b bVar, int i10) {
        C6496s.h(bVar, "parent");
        i.f59451a.n(bVar, i10);
    }
}
