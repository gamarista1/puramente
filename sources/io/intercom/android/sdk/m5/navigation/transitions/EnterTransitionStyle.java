package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.g;
import androidx.compose.animation.i;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;
import w.C2760D;
import w.C2798j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/animation/i;", "transition", "()Landroidx/compose/animation/i;", "SLIDE_UP", "SLIDE_IN_LEFT", "SLIDE_IN_RIGHT", "NONE", "NULL", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum EnterTransitionStyle {
    ;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.NONE", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Landroidx/compose/animation/i;", "transition", "()Landroidx/compose/animation/i;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class NONE extends EnterTransitionStyle {
        NONE(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public i transition() {
            return i.f12381a.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.NULL", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Landroidx/compose/animation/i;", "transition", "()Landroidx/compose/animation/i;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class NULL extends EnterTransitionStyle {
        NULL(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public i transition() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Landroidx/compose/animation/i;", "transition", "()Landroidx/compose/animation/i;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        SLIDE_IN_LEFT(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        public i transition() {
            return g.A(C2798j.j(0, 0, (C2760D) null, 7, (Object) null), new a());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Landroidx/compose/animation/i;", "transition", "()Landroidx/compose/animation/i;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        SLIDE_IN_RIGHT(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return -i10;
        }

        public i transition() {
            return g.A(C2798j.j(0, 0, (C2760D) null, 7, (Object) null), new b());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_UP", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "Landroidx/compose/animation/i;", "transition", "()Landroidx/compose/animation/i;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_UP extends EnterTransitionStyle {
        SLIDE_UP(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        public i transition() {
            return g.B(C2798j.j(0, 0, (C2760D) null, 7, (Object) null), new c());
        }
    }

    static {
        EnterTransitionStyle[] $values;
        $ENTRIES = C6714a.a($values);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public abstract i transition();
}
