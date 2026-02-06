package io.intercom.android.sdk.m5.navigation.transitions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "Landroid/os/Parcelable;", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "enter", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "exit", "popEnter", "popExit", "<init>", "(Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;)V", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "component2", "()Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "component3", "component4", "copy", "(Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;)Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "getEnter", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "getExit", "getPopEnter", "getPopExit", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransitionArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransitionArgs> CREATOR = new Creator();
    private final EnterTransitionStyle enter;
    private final ExitTransitionStyle exit;
    private final EnterTransitionStyle popEnter;
    private final ExitTransitionStyle popExit;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransitionArgs> {
        public final TransitionArgs createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new TransitionArgs(EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()), EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()));
        }

        public final TransitionArgs[] newArray(int i10) {
            return new TransitionArgs[i10];
        }
    }

    public TransitionArgs() {
        this((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransitionArgs copy$default(TransitionArgs transitionArgs, EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enterTransitionStyle = transitionArgs.enter;
        }
        if ((i10 & 2) != 0) {
            exitTransitionStyle = transitionArgs.exit;
        }
        if ((i10 & 4) != 0) {
            enterTransitionStyle2 = transitionArgs.popEnter;
        }
        if ((i10 & 8) != 0) {
            exitTransitionStyle2 = transitionArgs.popExit;
        }
        return transitionArgs.copy(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    public final EnterTransitionStyle component1() {
        return this.enter;
    }

    public final ExitTransitionStyle component2() {
        return this.exit;
    }

    public final EnterTransitionStyle component3() {
        return this.popEnter;
    }

    public final ExitTransitionStyle component4() {
        return this.popExit;
    }

    public final TransitionArgs copy(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2) {
        C6496s.h(enterTransitionStyle, "enter");
        C6496s.h(exitTransitionStyle, "exit");
        C6496s.h(enterTransitionStyle2, "popEnter");
        C6496s.h(exitTransitionStyle2, "popExit");
        return new TransitionArgs(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionArgs)) {
            return false;
        }
        TransitionArgs transitionArgs = (TransitionArgs) obj;
        return this.enter == transitionArgs.enter && this.exit == transitionArgs.exit && this.popEnter == transitionArgs.popEnter && this.popExit == transitionArgs.popExit;
    }

    public final EnterTransitionStyle getEnter() {
        return this.enter;
    }

    public final ExitTransitionStyle getExit() {
        return this.exit;
    }

    public final EnterTransitionStyle getPopEnter() {
        return this.popEnter;
    }

    public final ExitTransitionStyle getPopExit() {
        return this.popExit;
    }

    public int hashCode() {
        return (((((this.enter.hashCode() * 31) + this.exit.hashCode()) * 31) + this.popEnter.hashCode()) * 31) + this.popExit.hashCode();
    }

    public String toString() {
        String encode = Uri.encode(new e().v(this));
        C6496s.g(encode, "encode(...)");
        return encode;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.enter.name());
        parcel.writeString(this.exit.name());
        parcel.writeString(this.popEnter.name());
        parcel.writeString(this.popExit.name());
    }

    public TransitionArgs(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2) {
        C6496s.h(enterTransitionStyle, "enter");
        C6496s.h(exitTransitionStyle, "exit");
        C6496s.h(enterTransitionStyle2, "popEnter");
        C6496s.h(exitTransitionStyle2, "popExit");
        this.enter = enterTransitionStyle;
        this.exit = exitTransitionStyle;
        this.popEnter = enterTransitionStyle2;
        this.popExit = exitTransitionStyle2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransitionArgs(io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle r1, io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle r2, io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle r3, io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle r1 = io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NULL
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle r2 = io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NULL
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0011
            r3 = r1
        L_0x0011:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0016
            r4 = r2
        L_0x0016:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs.<init>(io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle, io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle, io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle, io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
