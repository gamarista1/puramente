package io.intercom.android.sdk.blocks.lib.models;

import Oc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\bHÇ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/FormField;", "", "id", "", "name", "value", "type", "required", "", "options", "Lio/intercom/android/sdk/blocks/lib/models/Options;", "identifier", "isControllingAttribute", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/blocks/lib/models/Options;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getValue", "getType", "getRequired", "()Z", "getOptions", "()Lio/intercom/android/sdk/blocks/lib/models/Options;", "getIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FormField {
    public static final int $stable = 8;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f68545id;
    @c("identifier")
    private final String identifier;
    @c("is_controlling_attribute")
    private final boolean isControllingAttribute;
    @c("name")
    private final String name;
    @c("options")
    private final Options options;
    @c("required")
    private final boolean required;
    @c("type")
    private final String type;
    @c("value")
    private final String value;

    public FormField(String str, String str2, String str3, String str4, boolean z10, Options options2, String str5, boolean z11) {
        C6496s.h(str, "id");
        C6496s.h(str2, "name");
        C6496s.h(str4, "type");
        this.f68545id = str;
        this.name = str2;
        this.value = str3;
        this.type = str4;
        this.required = z10;
        this.options = options2;
        this.identifier = str5;
        this.isControllingAttribute = z11;
    }

    public static /* synthetic */ FormField copy$default(FormField formField, String str, String str2, String str3, String str4, boolean z10, Options options2, String str5, boolean z11, int i10, Object obj) {
        FormField formField2 = formField;
        int i11 = i10;
        return formField.copy((i11 & 1) != 0 ? formField2.f68545id : str, (i11 & 2) != 0 ? formField2.name : str2, (i11 & 4) != 0 ? formField2.value : str3, (i11 & 8) != 0 ? formField2.type : str4, (i11 & 16) != 0 ? formField2.required : z10, (i11 & 32) != 0 ? formField2.options : options2, (i11 & 64) != 0 ? formField2.identifier : str5, (i11 & 128) != 0 ? formField2.isControllingAttribute : z11);
    }

    public final String component1() {
        return this.f68545id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.required;
    }

    public final Options component6() {
        return this.options;
    }

    public final String component7() {
        return this.identifier;
    }

    public final boolean component8() {
        return this.isControllingAttribute;
    }

    public final FormField copy(String str, String str2, String str3, String str4, boolean z10, Options options2, String str5, boolean z11) {
        C6496s.h(str, "id");
        C6496s.h(str2, "name");
        C6496s.h(str4, "type");
        return new FormField(str, str2, str3, str4, z10, options2, str5, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) obj;
        return C6496s.c(this.f68545id, formField.f68545id) && C6496s.c(this.name, formField.name) && C6496s.c(this.value, formField.value) && C6496s.c(this.type, formField.type) && this.required == formField.required && C6496s.c(this.options, formField.options) && C6496s.c(this.identifier, formField.identifier) && this.isControllingAttribute == formField.isControllingAttribute;
    }

    public final String getId() {
        return this.f68545id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((this.f68545id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.value;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31;
        Options options2 = this.options;
        int hashCode3 = (hashCode2 + (options2 == null ? 0 : options2.hashCode())) * 31;
        String str2 = this.identifier;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode3 + i10) * 31) + Boolean.hashCode(this.isControllingAttribute);
    }

    public final boolean isControllingAttribute() {
        return this.isControllingAttribute;
    }

    public String toString() {
        return "FormField(id=" + this.f68545id + ", name=" + this.name + ", value=" + this.value + ", type=" + this.type + ", required=" + this.required + ", options=" + this.options + ", identifier=" + this.identifier + ", isControllingAttribute=" + this.isControllingAttribute + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FormField(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, io.intercom.android.sdk.blocks.lib.models.Options r18, java.lang.String r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0010
            r9 = r2
            goto L_0x0012
        L_0x0010:
            r9 = r18
        L_0x0012:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0018
            r10 = r2
            goto L_0x001a
        L_0x0018:
            r10 = r19
        L_0x001a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            r0 = 0
            r11 = r0
            goto L_0x0023
        L_0x0021:
            r11 = r20
        L_0x0023:
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.lib.models.FormField.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, io.intercom.android.sdk.blocks.lib.models.Options, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
