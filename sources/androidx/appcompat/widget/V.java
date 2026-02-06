package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

public class V extends T implements U {

    /* renamed from: X  reason: collision with root package name */
    private static Method f11730X;

    /* renamed from: I  reason: collision with root package name */
    private U f11731I;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    public static class c extends O {

        /* renamed from: n  reason: collision with root package name */
        final int f11732n;

        /* renamed from: o  reason: collision with root package name */
        final int f11733o;

        /* renamed from: p  reason: collision with root package name */
        private U f11734p;

        /* renamed from: q  reason: collision with root package name */
        private MenuItem f11735q;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f11732n = 21;
                this.f11733o = 22;
                return;
            }
            this.f11732n = 22;
            this.f11733o = 21;
        }

        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            d dVar;
            g gVar;
            int pointToPosition;
            int i11;
            if (this.f11734p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                    i10 = 0;
                }
                if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = pointToPosition - i10) < 0 || i11 >= dVar.getCount()) {
                    gVar = null;
                } else {
                    gVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.f11735q;
                if (menuItem != gVar) {
                    e b10 = dVar.b();
                    if (menuItem != null) {
                        this.f11734p.n(b10, menuItem);
                    }
                    this.f11735q = gVar;
                    if (gVar != null) {
                        this.f11734p.d(b10, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f11732n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f11733o) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                }
                dVar.b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(U u10) {
            this.f11734p = u10;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f11730X = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public V(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void R(Object obj) {
        a.a(this.f11686F, (Transition) obj);
    }

    public void S(Object obj) {
        a.b(this.f11686F, (Transition) obj);
    }

    public void T(U u10) {
        this.f11731I = u10;
    }

    public void U(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f11730X;
            if (method != null) {
                try {
                    method.invoke(this.f11686F, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.a(this.f11686F, z10);
        }
    }

    public void d(e eVar, MenuItem menuItem) {
        U u10 = this.f11731I;
        if (u10 != null) {
            u10.d(eVar, menuItem);
        }
    }

    public void n(e eVar, MenuItem menuItem) {
        U u10 = this.f11731I;
        if (u10 != null) {
            u10.n(eVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public O s(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
