package io.intercom.android.sdk.m5.components.avatar;

import Sg.p;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SQUIRCLE", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AvatarShape {
    CIRCLE,
    SQUIRCLE;
    
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape$Companion;", "", "<init>", "()V", "fromName", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "shape", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AvatarShape fromName(String str) {
            Object obj;
            C6496s.h(str, "shape");
            Iterator it = AvatarShape.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p.v(((AvatarShape) obj).name(), str, true)) {
                    break;
                }
            }
            AvatarShape avatarShape = (AvatarShape) obj;
            if (avatarShape == null) {
                return AvatarShape.CIRCLE;
            }
            return avatarShape;
        }

        private Companion() {
        }
    }

    static {
        AvatarShape[] $values;
        $ENTRIES = C6714a.a($values);
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
