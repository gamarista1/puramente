package com.fasterxml.jackson.databind;

import java.io.Serializable;

public class PropertyMetadata implements Serializable {
    public static final PropertyMetadata STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, (String) null, (Integer) null, (String) null);
    public static final PropertyMetadata STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, (String) null, (Integer) null, (String) null);
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata((Boolean) null, (String) null, (Integer) null, (String) null);
    private static final long serialVersionUID = -1;
    protected final String _defaultValue;
    protected final String _description;
    protected final Integer _index;
    protected final Boolean _required;

    @Deprecated
    protected PropertyMetadata(Boolean bool, String str) {
        this(bool, str, (Integer) null, (String) null);
    }

    @Deprecated
    public static PropertyMetadata construct(boolean z10, String str) {
        return construct(z10, str, (Integer) null, (String) null);
    }

    public String getDefaultValue() {
        return this._defaultValue;
    }

    public String getDescription() {
        return this._description;
    }

    public Integer getIndex() {
        return this._index;
    }

    public Boolean getRequired() {
        return this._required;
    }

    public boolean hasDefaultValue() {
        if (this._defaultValue != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasDefuaultValue() {
        return hasDefaultValue();
    }

    public boolean hasIndex() {
        if (this._index != null) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        Boolean bool = this._required;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null) {
            return this;
        }
        Boolean bool = this._required;
        if (bool == null) {
            return STD_REQUIRED_OR_OPTIONAL;
        }
        if (bool.booleanValue()) {
            return STD_REQUIRED;
        }
        return STD_OPTIONAL;
    }

    public PropertyMetadata withDefaultValue(String str) {
        if (str == null || str.isEmpty()) {
            if (this._defaultValue == null) {
                return this;
            }
            str = null;
        } else if (this._defaultValue.equals(str)) {
            return this;
        }
        return new PropertyMetadata(this._required, this._description, this._index, str);
    }

    public PropertyMetadata withDescription(String str) {
        return new PropertyMetadata(this._required, str, this._index, this._defaultValue);
    }

    public PropertyMetadata withIndex(Integer num) {
        return new PropertyMetadata(this._required, this._description, num, this._defaultValue);
    }

    public PropertyMetadata withRequired(Boolean bool) {
        if (bool != null) {
            Boolean bool2 = this._required;
            if (bool2 != null && bool2.booleanValue() == bool.booleanValue()) {
                return this;
            }
        } else if (this._required == null) {
            return this;
        }
        return new PropertyMetadata(bool, this._description, this._index, this._defaultValue);
    }

    protected PropertyMetadata(Boolean bool, String str, Integer num, String str2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
    }

    public static PropertyMetadata construct(Boolean bool, String str, Integer num, String str2) {
        if (str != null || num != null || str2 != null) {
            return new PropertyMetadata(bool, str, num, str2);
        }
        if (bool == null) {
            return STD_REQUIRED_OR_OPTIONAL;
        }
        return bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    @Deprecated
    public static PropertyMetadata construct(boolean z10, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return z10 ? STD_REQUIRED : STD_OPTIONAL;
        }
        return new PropertyMetadata(Boolean.valueOf(z10), str, num, str2);
    }
}
