package io.intercom.android.sdk.models;

import Oc.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0010J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0012J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0012Jn\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010\u0012J\u0010\u0010)\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b)\u0010\u001bJ\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*H×\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b9\u0010\u0012¨\u0006:"}, d2 = {"Lio/intercom/android/sdk/models/Attribute;", "Landroid/os/Parcelable;", "", "identifier", "name", "type", "", "submitted", "customBotControlId", "", "options", "multiline", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "hasValue", "()Z", "getRenderType", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Llf/M;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/Boolean;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lio/intercom/android/sdk/models/Attribute;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getName", "getType", "Z", "getSubmitted", "getCustomBotControlId", "Ljava/util/List;", "getOptions", "Ljava/lang/Boolean;", "getMultiline", "getValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Attribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();
    @c("custom_bot_control_id")
    private final String customBotControlId;
    @c("identifier")
    private final String identifier;
    @c("multiline")
    private final Boolean multiline;
    @c("name")
    private final String name;
    @c("options")
    private final List<String> options;
    @c("submitted")
    private final boolean submitted;
    @c("type")
    private final String type;
    @c("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Attribute> {
        public final Attribute createFromParcel(Parcel parcel) {
            Boolean valueOf;
            C6496s.h(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z10 = false;
            boolean z11 = parcel.readInt() != 0;
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                valueOf = Boolean.valueOf(z10);
            }
            return new Attribute(readString, readString2, readString3, z11, readString4, createStringArrayList, valueOf, parcel.readString());
        }

        public final Attribute[] newArray(int i10) {
            return new Attribute[i10];
        }
    }

    public Attribute(String str, String str2, String str3, boolean z10, String str4, List<String> list, Boolean bool, String str5) {
        C6496s.h(str, "identifier");
        C6496s.h(str2, "name");
        C6496s.h(str3, "type");
        this.identifier = str;
        this.name = str2;
        this.type = str3;
        this.submitted = z10;
        this.customBotControlId = str4;
        this.options = list;
        this.multiline = bool;
        this.value = str5;
    }

    public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, String str3, boolean z10, String str4, List list, Boolean bool, String str5, int i10, Object obj) {
        Attribute attribute2 = attribute;
        int i11 = i10;
        return attribute.copy((i11 & 1) != 0 ? attribute2.identifier : str, (i11 & 2) != 0 ? attribute2.name : str2, (i11 & 4) != 0 ? attribute2.type : str3, (i11 & 8) != 0 ? attribute2.submitted : z10, (i11 & 16) != 0 ? attribute2.customBotControlId : str4, (i11 & 32) != 0 ? attribute2.options : list, (i11 & 64) != 0 ? attribute2.multiline : bool, (i11 & 128) != 0 ? attribute2.value : str5);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.submitted;
    }

    public final String component5() {
        return this.customBotControlId;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final Boolean component7() {
        return this.multiline;
    }

    public final String component8() {
        return this.value;
    }

    public final Attribute copy(String str, String str2, String str3, boolean z10, String str4, List<String> list, Boolean bool, String str5) {
        C6496s.h(str, "identifier");
        C6496s.h(str2, "name");
        C6496s.h(str3, "type");
        return new Attribute(str, str2, str3, z10, str4, list, bool, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        return C6496s.c(this.identifier, attribute.identifier) && C6496s.c(this.name, attribute.name) && C6496s.c(this.type, attribute.type) && this.submitted == attribute.submitted && C6496s.c(this.customBotControlId, attribute.customBotControlId) && C6496s.c(this.options, attribute.options) && C6496s.c(this.multiline, attribute.multiline) && C6496s.c(this.value, attribute.value);
    }

    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getMultiline() {
        return this.multiline;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0.equals(r1) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r0.equals(r1) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r0.equals(r1) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getRenderType() {
        /*
            r3 = this;
            java.lang.String r0 = r3.type
            int r1 = r0.hashCode()
            switch(r1) {
                case -891985903: goto L_0x0035;
                case 3076014: goto L_0x002c;
                case 64711720: goto L_0x0023;
                case 97526364: goto L_0x0017;
                case 1958052158: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x003d
        L_0x000a:
            java.lang.String r1 = "integer"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0013
            goto L_0x003d
        L_0x0013:
            java.lang.String r0 = "number"
            goto L_0x0085
        L_0x0017:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x003d
        L_0x0020:
            r0 = r1
            goto L_0x0085
        L_0x0023:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x003d
        L_0x002c:
            java.lang.String r1 = "date"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x003d
        L_0x0035:
            java.lang.String r1 = "string"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
        L_0x003d:
            java.lang.String r0 = "unknown"
            goto L_0x0085
        L_0x0040:
            java.util.List<java.lang.String> r0 = r3.options
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            java.lang.String r0 = "list"
            return r0
        L_0x0050:
            java.lang.String r0 = r3.identifier
            int r1 = r0.hashCode()
            r2 = 75849770(0x485602a, float:3.1356462E-36)
            if (r1 == r2) goto L_0x0078
            r2 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r1 == r2) goto L_0x006f
            r2 = 106642798(0x65b3d6e, float:4.1234453E-35)
            if (r1 == r2) goto L_0x0066
            goto L_0x0083
        L_0x0066:
            java.lang.String r1 = "phone"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0080
            goto L_0x0083
        L_0x006f:
            java.lang.String r1 = "email"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0078:
            java.lang.String r1 = "company.website"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0083
        L_0x0080:
            java.lang.String r0 = r3.identifier
            goto L_0x0085
        L_0x0083:
            java.lang.String r0 = "text"
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Attribute.getRenderType():java.lang.String");
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean hasValue() {
        boolean z10;
        String str = this.value;
        if (str == null || str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    public int hashCode() {
        int hashCode = ((((((this.identifier.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.submitted)) * 31;
        String str = this.customBotControlId;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.options;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multiline;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "Attribute(identifier=" + this.identifier + ", name=" + this.name + ", type=" + this.type + ", submitted=" + this.submitted + ", customBotControlId=" + this.customBotControlId + ", options=" + this.options + ", multiline=" + this.multiline + ", value=" + this.value + ')';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        boolean booleanValue;
        C6496s.h(parcel, "dest");
        parcel.writeString(this.identifier);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.submitted ? 1 : 0);
        parcel.writeString(this.customBotControlId);
        parcel.writeStringList(this.options);
        Boolean bool = this.multiline;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.value);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Attribute(java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, java.util.List r18, java.lang.Boolean r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r17
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r18
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r19
        L_0x001b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r20
        L_0x0023:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.models.Attribute.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
