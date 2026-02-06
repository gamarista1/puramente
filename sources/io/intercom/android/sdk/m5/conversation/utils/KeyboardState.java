package io.intercom.android.sdk.m5.conversation.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "", "isAnimating", "", "bottomDiff", "", "isVisible", "isDismissed", "keyboardHeight", "<init>", "(ZIZZI)V", "()Z", "getBottomDiff", "()I", "getKeyboardHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyboardState {
    public static final int $stable = 0;
    private final int bottomDiff;
    private final boolean isAnimating;
    private final boolean isDismissed;
    private final boolean isVisible;
    private final int keyboardHeight;

    public KeyboardState() {
        this(false, 0, false, false, 0, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KeyboardState copy$default(KeyboardState keyboardState, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = keyboardState.isAnimating;
        }
        if ((i12 & 2) != 0) {
            i10 = keyboardState.bottomDiff;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            z11 = keyboardState.isVisible;
        }
        boolean z13 = z11;
        if ((i12 & 8) != 0) {
            z12 = keyboardState.isDismissed;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            i11 = keyboardState.keyboardHeight;
        }
        return keyboardState.copy(z10, i13, z13, z14, i11);
    }

    public final boolean component1() {
        return this.isAnimating;
    }

    public final int component2() {
        return this.bottomDiff;
    }

    public final boolean component3() {
        return this.isVisible;
    }

    public final boolean component4() {
        return this.isDismissed;
    }

    public final int component5() {
        return this.keyboardHeight;
    }

    public final KeyboardState copy(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        return new KeyboardState(z10, i10, z11, z12, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardState)) {
            return false;
        }
        KeyboardState keyboardState = (KeyboardState) obj;
        return this.isAnimating == keyboardState.isAnimating && this.bottomDiff == keyboardState.bottomDiff && this.isVisible == keyboardState.isVisible && this.isDismissed == keyboardState.isDismissed && this.keyboardHeight == keyboardState.keyboardHeight;
    }

    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isAnimating) * 31) + Integer.hashCode(this.bottomDiff)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + Boolean.hashCode(this.isDismissed)) * 31) + Integer.hashCode(this.keyboardHeight);
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "KeyboardState(isAnimating=" + this.isAnimating + ", bottomDiff=" + this.bottomDiff + ", isVisible=" + this.isVisible + ", isDismissed=" + this.isDismissed + ", keyboardHeight=" + this.keyboardHeight + ')';
    }

    public KeyboardState(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        this.isAnimating = z10;
        this.bottomDiff = i10;
        this.isVisible = z11;
        this.isDismissed = z12;
        this.keyboardHeight = i11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KeyboardState(boolean r5, int r6, boolean r7, boolean r8, int r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.utils.KeyboardState.<init>(boolean, int, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
