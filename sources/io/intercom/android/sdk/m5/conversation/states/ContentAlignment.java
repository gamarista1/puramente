package io.intercom.android.sdk.m5.conversation.states;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment;", "", "Start", "Center", "Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment$Center;", "Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment$Start;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ContentAlignment {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment$Center;", "Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Center implements ContentAlignment {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Center);
        }

        public int hashCode() {
            return 2101579366;
        }

        public String toString() {
            return "Center";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment$Start;", "Lio/intercom/android/sdk/m5/conversation/states/ContentAlignment;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Start implements ContentAlignment {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Start);
        }

        public int hashCode() {
            return 1052834865;
        }

        public String toString() {
            return "Start";
        }
    }
}
