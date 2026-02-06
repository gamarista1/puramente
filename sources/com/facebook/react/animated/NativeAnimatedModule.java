package com.facebook.react.animated;

import Q7.a;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.C3422o;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.l0;
import com.facebook.react.uimanager.n0;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import f8.C3519a;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import n7.C3863a;
import w.C2780Y;

@a(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    private final C3422o mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS = false;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    /* access modifiers changed from: private */
    public boolean mEnqueuedAnimationOnFrame = false;
    private boolean mInitializedForFabric = false;
    private boolean mInitializedForNonFabric = false;
    private final AtomicReference<o> mNodesManager = new AtomicReference<>();
    private int mNumFabricAnimations = 0;
    private int mNumNonFabricAnimations = 0;
    /* access modifiers changed from: private */
    public final A mOperations = new A();
    /* access modifiers changed from: private */
    public final A mPreOperations = new A();
    /* access modifiers changed from: private */
    public final b mReactChoreographer = b.h();
    private int mUIManagerType = 1;

    private class A {

        /* renamed from: a  reason: collision with root package name */
        private final Queue f40345a;

        /* renamed from: b  reason: collision with root package name */
        private B f40346b;

        private List b(long j10) {
            if (d()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                B b10 = this.f40346b;
                if (b10 != null) {
                    if (b10.b() > j10) {
                        break;
                    }
                    arrayList.add(this.f40346b);
                    this.f40346b = null;
                }
                B b11 = (B) this.f40345a.poll();
                if (b11 == null) {
                    break;
                } else if (b11.b() > j10) {
                    this.f40346b = b11;
                    break;
                } else {
                    arrayList.add(b11);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public void a(B b10) {
            this.f40345a.add(b10);
        }

        /* access modifiers changed from: package-private */
        public void c(long j10, o oVar) {
            List<B> b10 = b(j10);
            if (b10 != null) {
                for (B a10 : b10) {
                    a10.a(oVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            if (!this.f40345a.isEmpty() || this.f40346b != null) {
                return false;
            }
            return true;
        }

        private A() {
            this.f40345a = new ConcurrentLinkedQueue();
            this.f40346b = null;
        }
    }

    private abstract class B {

        /* renamed from: a  reason: collision with root package name */
        long f40348a;

        /* access modifiers changed from: package-private */
        public abstract void a(o oVar);

        public long b() {
            return this.f40348a;
        }

        public void c(long j10) {
            this.f40348a = j10;
        }

        private B() {
            this.f40348a = -1;
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$a  reason: case insensitive filesystem */
    class C3329a extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40350c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f40351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3329a(int i10, double d10) {
            super();
            this.f40350c = i10;
            this.f40351d = d10;
        }

        public void a(o oVar) {
            oVar.v(this.f40350c, this.f40351d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$b  reason: case insensitive filesystem */
    class C3330b extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40353c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f40354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3330b(int i10, double d10) {
            super();
            this.f40353c = i10;
            this.f40354d = d10;
        }

        public void a(o oVar) {
            oVar.u(this.f40353c, this.f40354d);
        }
    }

    class c extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40356c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super();
            this.f40356c = i10;
        }

        public void a(o oVar) {
            oVar.j(this.f40356c);
        }
    }

    class d extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40358c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super();
            this.f40358c = i10;
        }

        public void a(o oVar) {
            oVar.i(this.f40358c);
        }
    }

    class e extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40360c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40361d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ReadableMap f40362e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Callback f40363f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i10, int i11, ReadableMap readableMap, Callback callback) {
            super();
            this.f40360c = i10;
            this.f40361d = i11;
            this.f40362e = readableMap;
            this.f40363f = callback;
        }

        public void a(o oVar) {
            oVar.w(this.f40360c, this.f40361d, this.f40362e, this.f40363f);
        }
    }

    class f extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40365c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super();
            this.f40365c = i10;
        }

        public void a(o oVar) {
            oVar.y(this.f40365c);
        }
    }

    class g extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i10, int i11) {
            super();
            this.f40367c = i10;
            this.f40368d = i11;
        }

        public void a(o oVar) {
            oVar.d(this.f40367c, this.f40368d);
        }
    }

    class h extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(int i10, int i11) {
            super();
            this.f40370c = i10;
            this.f40371d = i11;
        }

        public void a(o oVar) {
            oVar.g(this.f40370c, this.f40371d);
        }
    }

    class i extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40373c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40374d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i10, int i11) {
            super();
            this.f40373c = i10;
            this.f40374d = i11;
        }

        public void a(o oVar) {
            oVar.c(this.f40373c, this.f40374d);
        }
    }

    class j extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(int i10, int i11) {
            super();
            this.f40376c = i10;
            this.f40377d = i11;
        }

        public void a(o oVar) {
            oVar.f(this.f40376c, this.f40377d);
        }
    }

    class k extends C3422o {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        /* access modifiers changed from: protected */
        public void doFrameGuarded(long j10) {
            try {
                NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                o nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.o()) {
                    nodesManager.t(j10);
                }
                if (nodesManager == null) {
                    return;
                }
                if (NativeAnimatedModule.this.mReactChoreographer != null) {
                    if (!M7.b.o() || nodesManager.o()) {
                        NativeAnimatedModule.this.enqueueFrameCallback();
                    }
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    class l extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40380c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(int i10) {
            super();
            this.f40380c = i10;
        }

        public void a(o oVar) {
            oVar.s(this.f40380c);
        }
    }

    class m extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40383d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ReadableMap f40384e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(int i10, String str, ReadableMap readableMap) {
            super();
            this.f40382c = i10;
            this.f40383d = str;
            this.f40384e = readableMap;
        }

        public void a(o oVar) {
            oVar.b(this.f40382c, this.f40383d, this.f40384e);
        }
    }

    class n extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40386c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40387d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f40388e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(int i10, String str, int i11) {
            super();
            this.f40386c = i10;
            this.f40387d = str;
            this.f40388e = i11;
        }

        public void a(o oVar) {
            oVar.r(this.f40386c, this.f40387d, this.f40388e);
        }
    }

    class o extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40390c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callback f40391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(int i10, Callback callback) {
            super();
            this.f40390c = i10;
            this.f40391d = callback;
        }

        public void a(o oVar) {
            oVar.m(this.f40390c, this.f40391d);
        }
    }

    class p extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40393c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableArray f40394d;

        class a implements c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f40396a;

            a(int i10) {
                this.f40396a = i10;
            }

            public void a(double d10) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("tag", this.f40396a);
                createMap.putDouble("value", d10);
                ReactApplicationContext access$200 = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (access$200 != null) {
                    access$200.emitDeviceEvent("onAnimatedValueUpdate", createMap);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(int i10, ReadableArray readableArray) {
            super();
            this.f40393c = i10;
            this.f40394d = readableArray;
        }

        public void a(o oVar) {
            ReactApplicationContext unused = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i10 = 0;
            while (i10 < this.f40393c) {
                int i11 = i10 + 1;
                switch (q.f40398a[z.b(this.f40394d.getInt(i10)).ordinal()]) {
                    case 1:
                        i10 += 2;
                        oVar.m(this.f40394d.getInt(i11), (Callback) null);
                        break;
                    case 2:
                        i10 += 2;
                        int i12 = this.f40394d.getInt(i11);
                        oVar.x(i12, new a(i12));
                        break;
                    case 3:
                        i10 += 2;
                        oVar.A(this.f40394d.getInt(i11));
                        break;
                    case 4:
                        i10 += 2;
                        oVar.y(this.f40394d.getInt(i11));
                        break;
                    case 5:
                        i10 += 2;
                        oVar.j(this.f40394d.getInt(i11));
                        break;
                    case 6:
                        i10 += 2;
                        oVar.i(this.f40394d.getInt(i11));
                        break;
                    case 7:
                        i10 += 2;
                        oVar.s(this.f40394d.getInt(i11));
                        break;
                    case 8:
                        i10 += 2;
                        oVar.h(this.f40394d.getInt(i11));
                        break;
                    case 9:
                    case 10:
                        i10 += 2;
                        break;
                    case 11:
                        int i13 = i10 + 2;
                        i10 += 3;
                        oVar.e(this.f40394d.getInt(i11), this.f40394d.getMap(i13));
                        break;
                    case 12:
                        int i14 = i10 + 2;
                        i10 += 3;
                        oVar.B(this.f40394d.getInt(i11), this.f40394d.getMap(i14));
                        break;
                    case 13:
                        int i15 = i10 + 2;
                        i10 += 3;
                        oVar.d(this.f40394d.getInt(i11), this.f40394d.getInt(i15));
                        break;
                    case StdKeyDeserializer.TYPE_URL /*14*/:
                        int i16 = i10 + 2;
                        i10 += 3;
                        oVar.g(this.f40394d.getInt(i11), this.f40394d.getInt(i16));
                        break;
                    case StdKeyDeserializer.TYPE_CLASS /*15*/:
                        int i17 = i10 + 2;
                        i10 += 3;
                        oVar.v(this.f40394d.getInt(i11), this.f40394d.getDouble(i17));
                        break;
                    case 16:
                        int i18 = i10 + 2;
                        i10 += 3;
                        oVar.v(this.f40394d.getInt(i11), this.f40394d.getDouble(i18));
                        break;
                    case 17:
                        int i19 = i10 + 2;
                        int i20 = this.f40394d.getInt(i11);
                        i10 += 3;
                        int i21 = this.f40394d.getInt(i19);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i21);
                        oVar.f(i20, i21);
                        break;
                    case 18:
                        if (M7.b.o()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                        int i22 = i10 + 3;
                        i10 += 4;
                        oVar.w(this.f40394d.getInt(i11), this.f40394d.getInt(i10 + 2), this.f40394d.getMap(i22), (Callback) null);
                        break;
                    case 19:
                        int i23 = this.f40394d.getInt(i11);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i23);
                        int i24 = i10 + 3;
                        i10 += 4;
                        oVar.r(i23, this.f40394d.getString(i10 + 2), this.f40394d.getInt(i24));
                        break;
                    case InboxPagingSource.PAGE_SIZE /*20*/:
                        int i25 = i10 + 2;
                        i10 += 3;
                        oVar.c(this.f40394d.getInt(i11), this.f40394d.getInt(i25));
                        break;
                    case 21:
                        int i26 = i10 + 3;
                        i10 += 4;
                        oVar.b(this.f40394d.getInt(i11), this.f40394d.getString(i10 + 2), this.f40394d.getMap(i26));
                        break;
                    default:
                        throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                }
            }
        }
    }

    static /* synthetic */ class q {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40398a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.animated.NativeAnimatedModule$z[] r0 = com.facebook.react.animated.NativeAnimatedModule.z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40398a = r0
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_GET_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_STOP_ANIMATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_RESTORE_DEFAULT_VALUES     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_DROP_ANIMATED_NODE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_ADD_LISTENER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_REMOVE_LISTENERS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_CREATE_ANIMATED_NODE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_CONNECT_ANIMATED_NODES     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_DISCONNECT_ANIMATED_NODES     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_SET_ANIMATED_NODE_VALUE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_SET_ANIMATED_NODE_OFFSET     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_START_ANIMATING_NODE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f40398a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.facebook.react.animated.NativeAnimatedModule$z r1 = com.facebook.react.animated.NativeAnimatedModule.z.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.NativeAnimatedModule.q.<clinit>():void");
        }
    }

    class r implements l0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f40399a;

        r(long j10) {
            this.f40399a = j10;
        }

        public void a(C c10) {
            NativeAnimatedModule.this.mPreOperations.c(this.f40399a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class s implements l0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f40401a;

        s(long j10) {
            this.f40401a = j10;
        }

        public void a(C c10) {
            NativeAnimatedModule.this.mOperations.c(this.f40401a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class t extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f40404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(int i10, ReadableMap readableMap) {
            super();
            this.f40403c = i10;
            this.f40404d = readableMap;
        }

        public void a(o oVar) {
            oVar.e(this.f40403c, this.f40404d);
        }
    }

    class u extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40406c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f40407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(int i10, ReadableMap readableMap) {
            super();
            this.f40406c = i10;
            this.f40407d = readableMap;
        }

        public void a(o oVar) {
            oVar.B(this.f40406c, this.f40407d);
        }
    }

    class v implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f40409a;

        v(int i10) {
            this.f40409a = i10;
        }

        public void a(double d10) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", this.f40409a);
            createMap.putDouble("value", d10);
            ReactApplicationContext access$000 = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (access$000 != null) {
                access$000.emitDeviceEvent("onAnimatedValueUpdate", createMap);
            }
        }
    }

    class w extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f40412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(int i10, c cVar) {
            super();
            this.f40411c = i10;
            this.f40412d = cVar;
        }

        public void a(o oVar) {
            oVar.x(this.f40411c, this.f40412d);
        }
    }

    class x extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40414c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(int i10) {
            super();
            this.f40414c = i10;
        }

        public void a(o oVar) {
            oVar.A(this.f40414c);
        }
    }

    class y extends B {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40416c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(int i10) {
            super();
            this.f40416c = i10;
        }

        public void a(o oVar) {
            oVar.h(this.f40416c);
        }
    }

    private enum z {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);
        

        /* renamed from: w  reason: collision with root package name */
        private static z[] f40439w;

        /* renamed from: a  reason: collision with root package name */
        private final int f40441a;

        static {
            f40439w = null;
        }

        private z(int i10) {
            this.f40441a = i10;
        }

        public static z b(int i10) {
            if (f40439w == null) {
                f40439w = values();
            }
            return f40439w[i10 - 1];
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(B b10) {
        b10.c(this.mCurrentBatchNumber);
        this.mOperations.a(b10);
    }

    private void addPreOperation(B b10) {
        b10.c(this.mCurrentBatchNumber);
        this.mPreOperations.a(b10);
    }

    private void addUnbatchedOperation(B b10) {
        b10.c(-1);
        this.mOperations.a(b10);
    }

    private void clearFrameCallback() {
        ((b) C3863a.c(this.mReactChoreographer)).n(b.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i10) {
        if (C3519a.a(i10) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i11 = this.mNumNonFabricAnimations;
        if (i11 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations == 0 && i11 > 0 && this.mUIManagerType != 1) {
            this.mUIManagerType = 1;
        }
    }

    /* access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (!this.mEnqueuedAnimationOnFrame) {
            ((b) C3863a.c(this.mReactChoreographer)).k(b.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
            this.mEnqueuedAnimationOnFrame = true;
        }
    }

    private void initializeLifecycleEventListenersForViewTag(int i10) {
        UIManager g10;
        int a10 = C3519a.a(i10);
        this.mUIManagerType = a10;
        if (a10 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        o nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.p(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && (g10 = n0.g(reactApplicationContext, this.mUIManagerType)) != null) {
            g10.addUIManagerEventListener(this);
            if (this.mUIManagerType == 2) {
                this.mInitializedForFabric = true;
            } else {
                this.mInitializedForNonFabric = true;
            }
        }
    }

    public void addAnimatedEventToView(double d10, String str, ReadableMap readableMap) {
        int i10 = (int) d10;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new m(i10, str, readableMap));
    }

    public void addListener(String str) {
    }

    public void connectAnimatedNodeToView(double d10, double d11) {
        int i10 = (int) d11;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new i((int) d10, i10));
    }

    public void connectAnimatedNodes(double d10, double d11) {
        addOperation(new g((int) d10, (int) d11));
    }

    public void createAnimatedNode(double d10, ReadableMap readableMap) {
        addOperation(new t((int) d10, readableMap));
    }

    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType == 2) {
            long j10 = this.mCurrentBatchNumber - 1;
            if (!this.mBatchingControlledByJS) {
                this.mCurrentFrameNumber++;
                if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                    this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                    j10 = this.mCurrentBatchNumber;
                }
            }
            this.mPreOperations.c(j10, getNodesManager());
            this.mOperations.c(j10, getNodesManager());
        }
    }

    public void didMountItems(UIManager uIManager) {
    }

    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    public void disconnectAnimatedNodeFromView(double d10, double d11) {
        int i10 = (int) d11;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new j((int) d10, i10));
    }

    public void disconnectAnimatedNodes(double d10, double d11) {
        addOperation(new h((int) d10, (int) d11));
    }

    public void dropAnimatedNode(double d10) {
        addOperation(new y((int) d10));
    }

    public void extractAnimatedNodeOffset(double d10) {
        addOperation(new d((int) d10));
    }

    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    public void flattenAnimatedNodeOffset(double d10) {
        addOperation(new c((int) d10));
    }

    public o getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            C2780Y.a(this.mNodesManager, (Object) null, new o(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    public void getValue(double d10, Callback callback) {
        addOperation(new o((int) d10, callback));
    }

    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    public void onHostDestroy() {
        clearFrameCallback();
    }

    public void onHostPause() {
        clearFrameCallback();
    }

    public void onHostResume() {
        enqueueFrameCallback();
    }

    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            switch (q.f40398a[z.b(readableArray.getInt(i10)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case StdKeyDeserializer.TYPE_URL /*14*/:
                case StdKeyDeserializer.TYPE_CLASS /*15*/:
                case 16:
                case 17:
                    i10 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case InboxPagingSource.PAGE_SIZE /*20*/:
                    int i12 = i10 + 2;
                    i10 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i12));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i11));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i10 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new p(size, readableArray));
        finishOperationBatch();
    }

    public void removeAnimatedEventFromView(double d10, String str, double d11) {
        int i10 = (int) d10;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new n(i10, str, (int) d11));
    }

    public void removeListeners(double d10) {
    }

    public void restoreDefaultValues(double d10) {
        addPreOperation(new l((int) d10));
    }

    public void setAnimatedNodeOffset(double d10, double d11) {
        addOperation(new C3330b((int) d10, d11));
    }

    public void setAnimatedNodeValue(double d10, double d11) {
        addOperation(new C3329a((int) d10, d11));
    }

    public void setNodesManager(o oVar) {
        this.mNodesManager.set(oVar);
    }

    public void startAnimatingNode(double d10, double d11, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new e((int) d10, (int) d11, readableMap, callback));
    }

    public void startListeningToAnimatedNodeValue(double d10) {
        int i10 = (int) d10;
        addOperation(new w(i10, new v(i10)));
    }

    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    public void stopAnimation(double d10) {
        addOperation(new f((int) d10));
    }

    public void stopListeningToAnimatedNodeValue(double d10) {
        addOperation(new x((int) d10));
    }

    public void updateAnimatedNodeConfig(double d10, ReadableMap readableMap) {
        addOperation(new u((int) d10, readableMap));
    }

    public void userDrivenScrollEnded(int i10) {
        o oVar = this.mNodesManager.get();
        if (oVar != null) {
            Set<Integer> l10 = oVar.l(i10, "topScrollEnded");
            if (!l10.isEmpty()) {
                WritableArray createArray = Arguments.createArray();
                for (Integer intValue : l10) {
                    createArray.pushInt(intValue.intValue());
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putArray("tags", createArray);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", createMap);
                }
            }
        }
    }

    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((!this.mOperations.d() || !this.mPreOperations.d()) && this.mUIManagerType != 2) {
            long j10 = this.mCurrentBatchNumber;
            this.mCurrentBatchNumber = 1 + j10;
            r rVar = new r(j10);
            s sVar = new s(j10);
            UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
            uIManagerModule.prependUIBlock(rVar);
            uIManagerModule.addUIBlock(sVar);
        }
    }

    public void willMountItems(UIManager uIManager) {
    }
}
