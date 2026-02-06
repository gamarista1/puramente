package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Named;
import java.util.Iterator;

public abstract class BeanPropertyDefinition implements Named {
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    public boolean couldDeserialize() {
        if (getMutator() != null) {
            return true;
        }
        return false;
    }

    public boolean couldSerialize() {
        if (getAccessor() != null) {
            return true;
        }
        return false;
    }

    public JsonInclude.Value findInclusion() {
        return EMPTY_INCLUDE;
    }

    public ObjectIdInfo findObjectIdInfo() {
        return null;
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        return null;
    }

    public Class<?>[] findViews() {
        return null;
    }

    public abstract AnnotatedMember getAccessor();

    public abstract AnnotatedParameter getConstructorParameter();

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        return ClassUtil.emptyIterator();
    }

    public abstract AnnotatedField getField();

    public abstract PropertyName getFullName();

    public abstract AnnotatedMethod getGetter();

    public abstract String getInternalName();

    public abstract PropertyMetadata getMetadata();

    public abstract AnnotatedMember getMutator();

    public abstract String getName();

    public abstract AnnotatedMember getNonConstructorMutator();

    public abstract AnnotatedMember getPrimaryMember();

    public abstract AnnotatedMethod getSetter();

    public abstract PropertyName getWrapperName();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasGetter();

    public boolean hasName(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public boolean isExplicitlyNamed() {
        return isExplicitlyIncluded();
    }

    public boolean isRequired() {
        PropertyMetadata metadata = getMetadata();
        if (metadata == null || !metadata.isRequired()) {
            return false;
        }
        return true;
    }

    public boolean isTypeId() {
        return false;
    }

    public abstract BeanPropertyDefinition withName(PropertyName propertyName);

    public abstract BeanPropertyDefinition withSimpleName(String str);
}
