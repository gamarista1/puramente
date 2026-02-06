package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
import com.adjust.sdk.network.ErrorCodes;
import i.C2043g;

class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    private e f11337a;

    /* renamed from: b  reason: collision with root package name */
    private c f11338b;

    /* renamed from: c  reason: collision with root package name */
    c f11339c;

    /* renamed from: d  reason: collision with root package name */
    private j.a f11340d;

    public f(e eVar) {
        this.f11337a = eVar;
    }

    public void a(e eVar, boolean z10) {
        if (z10 || eVar == this.f11337a) {
            c();
        }
        j.a aVar = this.f11340d;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public boolean b(e eVar) {
        j.a aVar = this.f11340d;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        c cVar = this.f11338b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f11337a;
        c.a aVar = new c.a(eVar.u());
        c cVar = new c(aVar.getContext(), C2043g.f21403j);
        this.f11339c = cVar;
        cVar.e(this);
        this.f11337a.b(this.f11339c);
        aVar.setAdapter(this.f11339c.b(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.setCustomTitle(y10);
        } else {
            aVar.setIcon(eVar.w()).setTitle(eVar.x());
        }
        aVar.setOnKeyListener(this);
        c create = aVar.create();
        this.f11338b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f11338b.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f11338b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f11337a.M((g) this.f11339c.b().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f11339c.a(this.f11337a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f11338b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f11338b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f11337a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f11337a.performShortcut(i10, keyEvent, 0);
    }
}
