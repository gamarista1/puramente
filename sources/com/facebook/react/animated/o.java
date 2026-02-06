package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.g;
import com.facebook.react.uimanager.n0;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f40505a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f40506b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f40507c = new SparseArray();

    /* renamed from: d  reason: collision with root package name */
    private final List f40508d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final ReactApplicationContext f40509e;

    /* renamed from: f  reason: collision with root package name */
    private int f40510f = 0;

    /* renamed from: g  reason: collision with root package name */
    private final List f40511g = new LinkedList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f40512h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40513i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40514j = false;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f40515a;

        a(d dVar) {
            this.f40515a = dVar;
        }

        public void run() {
            o.this.n(this.f40515a);
        }
    }

    public o(ReactApplicationContext reactApplicationContext) {
        this.f40509e = reactApplicationContext;
    }

    private void C(List list) {
        String str;
        int i10;
        int i11 = this.f40510f;
        int i12 = i11 + 1;
        this.f40510f = i12;
        if (i12 == 0) {
            this.f40510f = i11 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i14 = bVar.f40447c;
            int i15 = this.f40510f;
            if (i14 != i15) {
                bVar.f40447c = i15;
                i13++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.f40445a != null) {
                for (int i16 = 0; i16 < bVar2.f40445a.size(); i16++) {
                    b bVar3 = (b) bVar2.f40445a.get(i16);
                    bVar3.f40446b++;
                    int i17 = bVar3.f40447c;
                    int i18 = this.f40510f;
                    if (i17 != i18) {
                        bVar3.f40447c = i18;
                        i13++;
                        arrayDeque.add(bVar3);
                    }
                }
            }
        }
        int i19 = this.f40510f;
        int i20 = i19 + 1;
        this.f40510f = i20;
        if (i20 == 0) {
            this.f40510f = i19 + 2;
        }
        Iterator it2 = list.iterator();
        int i21 = 0;
        while (it2.hasNext()) {
            b bVar4 = (b) it2.next();
            if (bVar4.f40446b == 0 && bVar4.f40447c != (i10 = this.f40510f)) {
                bVar4.f40447c = i10;
                i21++;
                arrayDeque.add(bVar4);
            }
        }
        int i22 = 0;
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            try {
                bVar5.h();
                if (bVar5 instanceof q) {
                    ((q) bVar5).m();
                }
            } catch (JSApplicationCausedNativeException e10) {
                U5.a.n("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e10);
            }
            if (bVar5 instanceof w) {
                ((w) bVar5).m();
            }
            if (bVar5.f40445a != null) {
                for (int i23 = 0; i23 < bVar5.f40445a.size(); i23++) {
                    b bVar6 = (b) bVar5.f40445a.get(i23);
                    int i24 = bVar6.f40446b - 1;
                    bVar6.f40446b = i24;
                    int i25 = bVar6.f40447c;
                    int i26 = this.f40510f;
                    if (i25 != i26 && i24 == 0) {
                        bVar6.f40447c = i26;
                        i21++;
                        arrayDeque.add(bVar6);
                    } else if (i25 == i26) {
                        i22++;
                    }
                }
            }
        }
        if (i13 == i21) {
            this.f40514j = false;
        } else if (!this.f40514j) {
            this.f40514j = true;
            U5.a.m("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                U5.a.m("NativeAnimatedNodesManager", ((b) it3.next()).f());
            }
            if (i22 > 0) {
                str = "cycles (" + i22 + ")";
            } else {
                str = "disconnected regions";
            }
            IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + str + ", there are " + i13 + " but toposort visited only " + i21);
            boolean z10 = this.f40512h;
            if (z10 && i22 == 0) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException((Throwable) illegalStateException));
            } else if (z10) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException((Throwable) illegalStateException));
            } else {
                throw illegalStateException;
            }
        }
    }

    /* access modifiers changed from: private */
    public void n(d dVar) {
        if (!this.f40508d.isEmpty()) {
            d.b eventAnimationDriverMatchSpec = dVar.getEventAnimationDriverMatchSpec();
            boolean z10 = false;
            for (EventAnimationDriver eventAnimationDriver : this.f40508d) {
                if (eventAnimationDriverMatchSpec.a(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                    z(eventAnimationDriver.valueNode);
                    dVar.dispatchModern(eventAnimationDriver);
                    this.f40511g.add(eventAnimationDriver.valueNode);
                    z10 = true;
                }
            }
            if (z10) {
                C(this.f40511g);
                this.f40511g.clear();
            }
        }
    }

    private String q(String str) {
        if (!str.startsWith("on")) {
            return str;
        }
        return VerticalAlignment.TOP + str.substring(2);
    }

    private void z(b bVar) {
        WritableArray writableArray = null;
        int i10 = 0;
        while (i10 < this.f40506b.size()) {
            e eVar = (e) this.f40506b.valueAt(i10);
            if (bVar.equals(eVar.f40450b)) {
                if (eVar.f40451c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    createMap.putDouble("value", eVar.f40450b.f40562f);
                    eVar.f40451c.invoke(createMap);
                } else if (this.f40509e != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("animationId", eVar.f40452d);
                    createMap2.putBoolean("finished", false);
                    createMap2.putDouble("value", eVar.f40450b.f40562f);
                    if (writableArray == null) {
                        writableArray = Arguments.createArray();
                    }
                    writableArray.pushMap(createMap2);
                }
                this.f40506b.removeAt(i10);
                i10--;
            }
            i10++;
        }
        if (writableArray != null) {
            this.f40509e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
        }
    }

    public void A(int i10) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
        ((w) bVar).n((c) null);
    }

    public void B(int i10, ReadableMap readableMap) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i10 + "] does not exist");
        } else if (bVar instanceof d) {
            z(bVar);
            ((d) bVar).a(readableMap);
            this.f40507c.put(i10, bVar);
        }
    }

    public void b(int i10, String str, ReadableMap readableMap) {
        int i11 = readableMap.getInt("animatedValueTag");
        b bVar = (b) this.f40505a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i11 + "] does not exist");
        } else if (bVar instanceof w) {
            ReadableArray array = readableMap.getArray("nativeEventPath");
            ArrayList arrayList = new ArrayList(array.size());
            for (int i12 = 0; i12 < array.size(); i12++) {
                arrayList.add(array.getString(i12));
            }
            String q10 = q(str);
            this.f40508d.add(new EventAnimationDriver(q10, i10, arrayList, (w) bVar));
            if (q10.equals("topScroll")) {
                b(i10, "topScrollEnded", readableMap);
            }
        } else {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i10 + "] connected to event handler (" + str + ") should be of type " + w.class.getName());
        }
    }

    public void c(int i10, int i11) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i10 + "] does not exist");
        } else if (bVar instanceof q) {
            ReactApplicationContext reactApplicationContext = this.f40509e;
            if (reactApplicationContext != null) {
                UIManager i12 = n0.i(reactApplicationContext, i11);
                if (i12 == null) {
                    ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i11));
                    return;
                }
                ((q) bVar).i(i11, i12);
                this.f40507c.put(i10, bVar);
                return;
            }
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i11);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i11 + "] should be of type " + q.class.getName());
        }
    }

    public void d(int i10, int i11) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar != null) {
            b bVar2 = (b) this.f40505a.get(i11);
            if (bVar2 != null) {
                bVar.b(bVar2);
                this.f40507c.put(i11, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
    }

    public void e(int i10, ReadableMap readableMap) {
        b bVar;
        if (this.f40505a.get(i10) == null) {
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                bVar = new s(readableMap, this);
            } else if ("value".equals(string)) {
                bVar = new w(readableMap);
            } else if ("color".equals(string)) {
                bVar = new f(readableMap, this, this.f40509e);
            } else if ("props".equals(string)) {
                bVar = new q(readableMap, this);
            } else if ("interpolation".equals(string)) {
                bVar = new k(readableMap);
            } else if ("addition".equals(string)) {
                bVar = new a(readableMap, this);
            } else if ("subtraction".equals(string)) {
                bVar = new t(readableMap, this);
            } else if ("division".equals(string)) {
                bVar = new i(readableMap, this);
            } else if ("multiplication".equals(string)) {
                bVar = new m(readableMap, this);
            } else if ("modulus".equals(string)) {
                bVar = new l(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                bVar = new h(readableMap, this);
            } else if ("transform".equals(string)) {
                bVar = new v(readableMap, this);
            } else if ("tracking".equals(string)) {
                bVar = new u(readableMap, this);
            } else if ("object".equals(string)) {
                bVar = new p(readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            bVar.f40448d = i10;
            this.f40505a.put(i10, bVar);
            this.f40507c.put(i10, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i10 + "] already exists");
    }

    public void f(int i10, int i11) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i10 + "] does not exist");
        } else if (bVar instanceof q) {
            ((q) bVar).j(i11);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i11 + "] should be of type " + q.class.getName());
        }
    }

    public void g(int i10, int i11) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar != null) {
            b bVar2 = (b) this.f40505a.get(i11);
            if (bVar2 != null) {
                bVar.g(bVar2);
                this.f40507c.put(i11, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i11 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i10 + "] does not exist");
    }

    public void h(int i10) {
        this.f40505a.remove(i10);
        this.f40507c.remove(i10);
    }

    public void i(int i10) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
        ((w) bVar).i();
    }

    public void j(int i10) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
        ((w) bVar).j();
    }

    public b k(int i10) {
        return (b) this.f40505a.get(i10);
    }

    /* access modifiers changed from: package-private */
    public Set l(int i10, String str) {
        int i11;
        List<b> list;
        HashSet hashSet = new HashSet();
        ListIterator listIterator = this.f40508d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (eventAnimationDriver != null && str.equals(eventAnimationDriver.eventName) && i10 == (i11 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i11));
                w wVar = eventAnimationDriver.valueNode;
                if (!(wVar == null || (list = wVar.f40445a) == null)) {
                    for (b bVar : list) {
                        hashSet.add(Integer.valueOf(bVar.f40448d));
                    }
                }
            }
        }
        return hashSet;
    }

    public void m(int i10, Callback callback) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i10 + "] does not exist or is not a 'value' node");
        }
        double l10 = ((w) bVar).l();
        if (callback != null) {
            callback.invoke(Double.valueOf(l10));
        } else if (this.f40509e != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", i10);
            createMap.putDouble("value", l10);
            this.f40509e.emitDeviceEvent("onNativeAnimatedModuleGetValue", createMap);
        }
    }

    public boolean o() {
        if (this.f40506b.size() > 0 || this.f40507c.size() > 0) {
            return true;
        }
        return false;
    }

    public void onEventDispatch(d dVar) {
        if (UiThreadUtil.isOnUiThread()) {
            n(dVar);
        } else {
            UiThreadUtil.runOnUiThread(new a(dVar));
        }
    }

    public void p(int i10) {
        if (i10 == 2) {
            if (this.f40512h) {
                return;
            }
        } else if (this.f40513i) {
            return;
        }
        UIManager g10 = n0.g(this.f40509e, i10);
        if (g10 != null) {
            g10.getEventDispatcher().g(this);
            if (i10 == 2) {
                this.f40512h = true;
            } else {
                this.f40513i = true;
            }
        }
    }

    public void r(int i10, String str, int i11) {
        String q10 = q(str);
        ListIterator listIterator = this.f40508d.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (q10.equals(eventAnimationDriver.eventName) && i10 == eventAnimationDriver.viewTag && i11 == eventAnimationDriver.valueNode.f40448d) {
                listIterator.remove();
                break;
            }
        }
        if (q10.equals("topScroll")) {
            r(i10, "topScrollEnded", i11);
        }
    }

    public void s(int i10) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar != null) {
            if (bVar instanceof q) {
                ((q) bVar).l();
                return;
            }
            throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + q.class.getName());
        }
    }

    public void t(long j10) {
        UiThreadUtil.assertOnUiThread();
        for (int i10 = 0; i10 < this.f40507c.size(); i10++) {
            this.f40511g.add((b) this.f40507c.valueAt(i10));
        }
        this.f40507c.clear();
        boolean z10 = false;
        for (int i11 = 0; i11 < this.f40506b.size(); i11++) {
            e eVar = (e) this.f40506b.valueAt(i11);
            eVar.b(j10);
            this.f40511g.add(eVar.f40450b);
            if (eVar.f40449a) {
                z10 = true;
            }
        }
        C(this.f40511g);
        this.f40511g.clear();
        if (z10) {
            WritableArray writableArray = null;
            for (int size = this.f40506b.size() - 1; size >= 0; size--) {
                e eVar2 = (e) this.f40506b.valueAt(size);
                if (eVar2.f40449a) {
                    if (eVar2.f40451c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        createMap.putDouble("value", eVar2.f40450b.f40562f);
                        eVar2.f40451c.invoke(createMap);
                    } else if (this.f40509e != null) {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putInt("animationId", eVar2.f40452d);
                        createMap2.putBoolean("finished", true);
                        createMap2.putDouble("value", eVar2.f40450b.f40562f);
                        if (writableArray == null) {
                            writableArray = Arguments.createArray();
                        }
                        writableArray.pushMap(createMap2);
                    }
                    this.f40506b.removeAt(size);
                }
            }
            if (writableArray != null) {
                this.f40509e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
            }
        }
    }

    public void u(int i10, double d10) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
        ((w) bVar).f40563g = d10;
        this.f40507c.put(i10, bVar);
    }

    public void v(int i10, double d10) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
        z(bVar);
        ((w) bVar).f40562f = d10;
        this.f40507c.put(i10, bVar);
    }

    public void w(int i10, int i11, ReadableMap readableMap, Callback callback) {
        e eVar;
        b bVar = (b) this.f40505a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] does not exist");
        } else if (bVar instanceof w) {
            e eVar2 = (e) this.f40506b.get(i10);
            if (eVar2 != null) {
                eVar2.a(readableMap);
                return;
            }
            String string = readableMap.getString("type");
            if ("frames".equals(string)) {
                eVar = new j(readableMap);
            } else if ("spring".equals(string)) {
                eVar = new r(readableMap);
            } else if ("decay".equals(string)) {
                eVar = new g(readableMap);
            } else {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i11 + "]: " + string);
            }
            eVar.f40452d = i10;
            eVar.f40451c = callback;
            eVar.f40450b = (w) bVar;
            this.f40506b.put(i10, eVar);
        } else {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i11 + "] should be of type " + w.class.getName());
        }
    }

    public void x(int i10, c cVar) {
        b bVar = (b) this.f40505a.get(i10);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i10 + "] does not exist, or is not a 'value' node");
        }
        ((w) bVar).n(cVar);
    }

    public void y(int i10) {
        WritableArray writableArray;
        int i11 = 0;
        while (true) {
            writableArray = null;
            if (i11 >= this.f40506b.size()) {
                break;
            }
            e eVar = (e) this.f40506b.valueAt(i11);
            if (eVar.f40452d == i10) {
                if (eVar.f40451c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    createMap.putDouble("value", eVar.f40450b.f40562f);
                    eVar.f40451c.invoke(createMap);
                } else if (this.f40509e != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putInt("animationId", eVar.f40452d);
                    createMap2.putBoolean("finished", false);
                    createMap2.putDouble("value", eVar.f40450b.f40562f);
                    writableArray = Arguments.createArray();
                    writableArray.pushMap(createMap2);
                }
                this.f40506b.removeAt(i11);
            } else {
                i11++;
            }
        }
        if (writableArray != null) {
            this.f40509e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArray);
        }
    }
}
