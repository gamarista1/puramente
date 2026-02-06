package io.intercom.android.sdk.models;

import Oc.c;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.EventParticipant;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 62\u00020\u0001:\u00016B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0010J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0010J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0010J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0010Jd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b!\u0010\u0010J\u0010\u0010\"\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H×\u0003¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b,\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b-\u0010\u0010R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010\u0010R\u0011\u00105\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u0010\u0010¨\u00067"}, d2 = {"Lio/intercom/android/sdk/models/EventData;", "Landroid/os/Parcelable;", "Lio/intercom/android/sdk/models/EventParticipant$Builder;", "_participant", "", "_eventAsPlainText", "_status", "customStateLabel", "customStatePrefix", "mergedConversationId", "description", "<init>", "(Lio/intercom/android/sdk/models/EventParticipant$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lio/intercom/android/sdk/models/EventParticipant$Builder;", "component2", "()Ljava/lang/String;", "component3", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component4", "component5", "component6", "component7", "copy", "(Lio/intercom/android/sdk/models/EventParticipant$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/intercom/android/sdk/models/EventData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/models/EventParticipant$Builder;", "Ljava/lang/String;", "getCustomStateLabel", "getCustomStatePrefix", "getMergedConversationId", "getDescription", "Lio/intercom/android/sdk/models/EventParticipant;", "getParticipant", "()Lio/intercom/android/sdk/models/EventParticipant;", "participant", "getEventAsPlainText", "eventAsPlainText", "getStatus", "status", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EventData> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final EventData NULL = new EventData((EventParticipant.Builder) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    @c("eventAsPlainText")
    private final String _eventAsPlainText;
    @c("participant")
    private final EventParticipant.Builder _participant;
    @c("status")
    private final String _status;
    @c("customStateLabel")
    private final String customStateLabel;
    @c("customStatePrefix")
    private final String customStatePrefix;
    private final String description;
    private final String mergedConversationId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/EventData$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/EventData;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventData> {
        public final EventData createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new EventData((EventParticipant.Builder) parcel.readValue(EventData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final EventData[] newArray(int i10) {
            return new EventData[i10];
        }
    }

    public EventData() {
        this((EventParticipant.Builder) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    private final EventParticipant.Builder component1() {
        return this._participant;
    }

    private final String component2() {
        return this._eventAsPlainText;
    }

    private final String component3() {
        return this._status;
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = eventData._participant;
        }
        if ((i10 & 2) != 0) {
            str = eventData._eventAsPlainText;
        }
        String str7 = str;
        if ((i10 & 4) != 0) {
            str2 = eventData._status;
        }
        String str8 = str2;
        if ((i10 & 8) != 0) {
            str3 = eventData.customStateLabel;
        }
        String str9 = str3;
        if ((i10 & 16) != 0) {
            str4 = eventData.customStatePrefix;
        }
        String str10 = str4;
        if ((i10 & 32) != 0) {
            str5 = eventData.mergedConversationId;
        }
        String str11 = str5;
        if ((i10 & 64) != 0) {
            str6 = eventData.description;
        }
        return eventData.copy(builder, str7, str8, str9, str10, str11, str6);
    }

    public final String component4() {
        return this.customStateLabel;
    }

    public final String component5() {
        return this.customStatePrefix;
    }

    public final String component6() {
        return this.mergedConversationId;
    }

    public final String component7() {
        return this.description;
    }

    public final EventData copy(EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6) {
        return new EventData(builder, str, str2, str3, str4, str5, str6);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return C6496s.c(this._participant, eventData._participant) && C6496s.c(this._eventAsPlainText, eventData._eventAsPlainText) && C6496s.c(this._status, eventData._status) && C6496s.c(this.customStateLabel, eventData.customStateLabel) && C6496s.c(this.customStatePrefix, eventData.customStatePrefix) && C6496s.c(this.mergedConversationId, eventData.mergedConversationId) && C6496s.c(this.description, eventData.description);
    }

    public final String getCustomStateLabel() {
        return this.customStateLabel;
    }

    public final String getCustomStatePrefix() {
        return this.customStatePrefix;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEventAsPlainText() {
        String str = this._eventAsPlainText;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getMergedConversationId() {
        return this.mergedConversationId;
    }

    public final EventParticipant getParticipant() {
        EventParticipant build;
        EventParticipant.Builder builder = this._participant;
        if (builder != null && (build = builder.build()) != null) {
            return build;
        }
        EventParticipant eventParticipant = EventParticipant.NULL;
        C6496s.g(eventParticipant, "NULL");
        return eventParticipant;
    }

    public final String getStatus() {
        String str = this._status;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        EventParticipant.Builder builder = this._participant;
        int i10 = 0;
        int hashCode = (builder == null ? 0 : builder.hashCode()) * 31;
        String str = this._eventAsPlainText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._status;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customStateLabel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customStatePrefix;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mergedConversationId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "EventData(_participant=" + this._participant + ", _eventAsPlainText=" + this._eventAsPlainText + ", _status=" + this._status + ", customStateLabel=" + this.customStateLabel + ", customStatePrefix=" + this.customStatePrefix + ", mergedConversationId=" + this.mergedConversationId + ", description=" + this.description + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeValue(this._participant);
        parcel.writeString(this._eventAsPlainText);
        parcel.writeString(this._status);
        parcel.writeString(this.customStateLabel);
        parcel.writeString(this.customStatePrefix);
        parcel.writeString(this.mergedConversationId);
        parcel.writeString(this.description);
    }

    public EventData(EventParticipant.Builder builder, String str, String str2, String str3, String str4, String str5, String str6) {
        this._participant = builder;
        this._eventAsPlainText = str;
        this._status = str2;
        this.customStateLabel = str3;
        this.customStatePrefix = str4;
        this.mergedConversationId = str5;
        this.description = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EventData(io.intercom.android.sdk.models.EventParticipant.Builder r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.EventData.<init>(io.intercom.android.sdk.models.EventParticipant$Builder, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
