package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b extends d {

    /* renamed from: h  reason: collision with root package name */
    public static final a f41863h = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f41864a;

    /* renamed from: b  reason: collision with root package name */
    private final String f41865b;

    /* renamed from: c  reason: collision with root package name */
    private final String f41866c;

    /* renamed from: d  reason: collision with root package name */
    private final int f41867d;

    /* renamed from: e  reason: collision with root package name */
    private final int f41868e;

    /* renamed from: f  reason: collision with root package name */
    private final int f41869f;

    /* renamed from: g  reason: collision with root package name */
    private final int f41870g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10, int i11, Throwable th2) {
            C6496s.h(th2, "throwable");
            return new b(i10, i11, 1, th2.getMessage(), (String) null, 0, 0, 0, 0, (DefaultConstructorMarker) null);
        }

        public final b b(int i10, int i11) {
            return new b(i10, i11, 3, (String) null, (String) null, 0, 0, 0, 0, 504, (DefaultConstructorMarker) null);
        }

        public final b c(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 2, (String) null, str, i12, i13, 0, 0, (DefaultConstructorMarker) null);
        }

        public final b d(int i10, int i11) {
            return new b(i10, i11, 4, (String) null, (String) null, 0, 0, 0, 0, 504, (DefaultConstructorMarker) null);
        }

        public final b e(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 5, (String) null, str, 0, 0, i12, i13, (DefaultConstructorMarker) null);
        }

        public final String f(int i10) {
            if (i10 == 1) {
                return "topError";
            }
            if (i10 == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i10 == 3) {
                return "topLoadEnd";
            }
            if (i10 == 4) {
                return "topLoadStart";
            }
            if (i10 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i10).toString());
        }

        private a() {
        }
    }

    public /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, i13, i14, i15, i16);
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", this.f41866c);
        createMap.putDouble(Snapshot.WIDTH, (double) this.f41867d);
        createMap.putDouble(Snapshot.HEIGHT, (double) this.f41868e);
        C6496s.g(createMap, "apply(...)");
        return createMap;
    }

    public short getCoalescingKey() {
        return (short) this.f41864a;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        int i10 = this.f41864a;
        if (i10 == 1) {
            createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, this.f41865b);
        } else if (i10 == 2) {
            createMap.putMap("source", a());
        } else if (i10 == 5) {
            createMap.putInt(MetricTracker.Action.LOADED, this.f41869f);
            createMap.putInt("total", this.f41870g);
            createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, ((double) this.f41869f) / ((double) this.f41870g));
        }
        return createMap;
    }

    public String getEventName() {
        return f41863h.f(this.f41864a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* synthetic */ b(int r14, int r15, int r16, java.lang.String r17, java.lang.String r18, int r19, int r20, int r21, int r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r17
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r19
        L_0x001c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0022
            r10 = r2
            goto L_0x0024
        L_0x0022:
            r10 = r20
        L_0x0024:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002a
            r11 = r2
            goto L_0x002c
        L_0x002a:
            r11 = r21
        L_0x002c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0032
            r12 = r2
            goto L_0x0034
        L_0x0032:
            r12 = r22
        L_0x0034:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.b.<init>(int, int, int, java.lang.String, java.lang.String, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16) {
        super(i10, i11);
        this.f41864a = i12;
        this.f41865b = str;
        this.f41866c = str2;
        this.f41867d = i13;
        this.f41868e = i14;
        this.f41869f = i15;
        this.f41870g = i16;
    }
}
