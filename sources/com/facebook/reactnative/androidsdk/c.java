package com.facebook.reactnative.androidsdk;

import com.facebook.C3286a;
import com.facebook.C3294i;
import com.facebook.C3324n;
import com.facebook.C3459v;
import com.facebook.login.widget.f;
import com.facebook.r;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import io.branch.rnbranch.RNBranchModule;
import java.util.Iterator;
import java.util.Set;
import y7.F;

public class c extends f {

    /* renamed from: B  reason: collision with root package name */
    private final C3324n f42380B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final EventDispatcher f42381C = n0.c((ReactContext) getContext(), getId());

    class a extends C3294i {
        a() {
        }

        /* access modifiers changed from: protected */
        public void d(C3286a aVar, C3286a aVar2) {
            if (aVar2 == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("type", "logoutFinished");
                c.this.f42381C.h(new d(n0.e((ReactContext) c.this.getContext()), c.this.getId(), createMap));
            }
        }
    }

    class b implements r {
        b() {
        }

        public void a(C3459v vVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "loginFinished");
            createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, vVar.toString());
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isCancelled", false);
            createMap.putMap("result", createMap2);
            c.this.f42381C.h(new d(n0.e((ReactContext) c.this.getContext()), c.this.getId(), createMap));
        }

        /* renamed from: b */
        public void onSuccess(F f10) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "loginFinished");
            createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, (String) null);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isCancelled", false);
            createMap2.putArray("grantedPermissions", Arguments.fromJavaArgs(c.this.L(f10.c())));
            createMap2.putArray("declinedPermissions", Arguments.fromJavaArgs(c.this.L(f10.b())));
            createMap.putMap("result", createMap2);
            c.this.f42381C.h(new d(n0.e((ReactContext) c.this.getContext()), c.this.getId(), createMap));
        }

        public void onCancel() {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "loginFinished");
            createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, (String) null);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isCancelled", true);
            createMap.putMap("result", createMap2);
            c.this.f42381C.h(new d(n0.e((ReactContext) c.this.getContext()), c.this.getId(), createMap));
        }
    }

    public c(C3415h0 h0Var, C3324n nVar) {
        super(h0Var);
        setToolTipMode(f.d.NEVER_DISPLAY);
        this.f42380B = nVar;
        K();
    }

    /* access modifiers changed from: private */
    public String[] L(Set set) {
        String[] strArr = new String[set.size()];
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = (String) it.next();
            i10++;
        }
        return strArr;
    }

    public void K() {
        new a();
        C(this.f42380B, new b());
    }
}
