package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;
import w.C2760D;
import w.C2798j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/animation/k;", "transition", "()Landroidx/compose/animation/k;", "SLIDE_DOWN", "SLIDE_OUT_RIGHT", "SLIDE_OUT_LEFT", "NONE", "NULL", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ExitTransitionStyle {
    ;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.NONE", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "Landroidx/compose/animation/k;", "transition", "()Landroidx/compose/animation/k;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class NONE extends ExitTransitionStyle {
        NONE(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public k transition() {
            return k.f12384a.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.NULL", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "Landroidx/compose/animation/k;", "transition", "()Landroidx/compose/animation/k;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class NULL extends ExitTransitionStyle {
        NULL(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public k transition() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_DOWN", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "Landroidx/compose/animation/k;", "transition", "()Landroidx/compose/animation/k;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_DOWN extends ExitTransitionStyle {
        SLIDE_DOWN(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        public k transition() {
            return g.F(C2798j.j(0, 0, (C2760D) null, 7, (Object) null), new d());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_OUT_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "Landroidx/compose/animation/k;", "transition", "()Landroidx/compose/animation/k;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_OUT_LEFT extends ExitTransitionStyle {
        SLIDE_OUT_LEFT(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return -i10;
        }

        public k transition() {
            return g.E(C2798j.j(0, 0, (C2760D) null, 7, (Object) null), new e());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_OUT_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "Landroidx/compose/animation/k;", "transition", "()Landroidx/compose/animation/k;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_OUT_RIGHT extends ExitTransitionStyle {
        SLIDE_OUT_RIGHT(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        public k transition() {
            return g.E(C2798j.j(0, 0, (C2760D) null, 7, (Object) null), new f());
        }
    }

    static {
        ExitTransitionStyle[] $values;
        $ENTRIES = C6714a.a($values);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public abstract k transition();
}
