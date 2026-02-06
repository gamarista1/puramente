package io.intercom.android.sdk.models.carousel;

import java.util.List;

final class AutoValue_ScreenAction extends ScreenAction {
    private final List<String> androidPermissions;
    private final String backgroundColor;

    /* renamed from: id  reason: collision with root package name */
    private final String f70046id;
    private final String textColor;
    private final String title;
    private final String type;
    private final String uri;

    AutoValue_ScreenAction(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        if (str != null) {
            this.f70046id = str;
            if (str2 != null) {
                this.type = str2;
                if (str3 != null) {
                    this.title = str3;
                    if (str4 != null) {
                        this.textColor = str4;
                        if (str5 != null) {
                            this.backgroundColor = str5;
                            if (str6 != null) {
                                this.uri = str6;
                                if (list != null) {
                                    this.androidPermissions = list;
                                    return;
                                }
                                throw new NullPointerException("Null androidPermissions");
                            }
                            throw new NullPointerException("Null uri");
                        }
                        throw new NullPointerException("Null backgroundColor");
                    }
                    throw new NullPointerException("Null textColor");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScreenAction)) {
            return false;
        }
        ScreenAction screenAction = (ScreenAction) obj;
        if (!this.f70046id.equals(screenAction.getId()) || !this.type.equals(screenAction.getType()) || !this.title.equals(screenAction.getTitle()) || !this.textColor.equals(screenAction.getTextColor()) || !this.backgroundColor.equals(screenAction.getBackgroundColor()) || !this.uri.equals(screenAction.getUri()) || !this.androidPermissions.equals(screenAction.getAndroidPermissions())) {
            return false;
        }
        return true;
    }

    public List<String> getAndroidPermissions() {
        return this.androidPermissions;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getId() {
        return this.f70046id;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((((((((((((this.f70046id.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.textColor.hashCode()) * 1000003) ^ this.backgroundColor.hashCode()) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.androidPermissions.hashCode();
    }

    public String toString() {
        return "ScreenAction{id=" + this.f70046id + ", type=" + this.type + ", title=" + this.title + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", uri=" + this.uri + ", androidPermissions=" + this.androidPermissions + "}";
    }
}
