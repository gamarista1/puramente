package io.intercom.android.sdk.m5.home.data;

import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/IconType;", "", "<init>", "(Ljava/lang/String;I)V", "TEAMMATE", "BOT", "FIN", "FACE_PILE", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum IconType {
    ;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/home/data/IconType.BOT", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class BOT extends IconType {
        BOT(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_conversation_card_question);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/home/data/IconType.FACE_PILE", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FACE_PILE extends IconType {
        FACE_PILE(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public Integer getIcon() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/home/data/IconType.FIN", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FIN extends IconType {
        FIN(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_chevron);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/home/data/IconType.TEAMMATE", "Lio/intercom/android/sdk/m5/home/data/IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TEAMMATE extends IconType {
        TEAMMATE(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_send_message_icon);
        }
    }

    static {
        IconType[] $values;
        $ENTRIES = C6714a.a($values);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public abstract Integer getIcon();
}
