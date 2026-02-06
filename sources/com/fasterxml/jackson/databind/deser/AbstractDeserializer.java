package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map<String, SettableBeanProperty> _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;

    public AbstractDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, Map<String, SettableBeanProperty> map) {
        JavaType type = beanDescription.getType();
        this._baseType = type;
        this._objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        this._backRefProperties = map;
        Class<?> rawClass = type.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z10 = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z10 = false;
        }
        this._acceptDouble = z10;
    }

    public static AbstractDeserializer constructForNonPOJO(BeanDescription beanDescription) {
        return new AbstractDeserializer(beanDescription);
    }

    /* access modifiers changed from: protected */
    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        ReadableObjectId findObjectId = deserializationContext.findObjectId(readObjectReference, objectIdReader.generator, objectIdReader.resolver);
        Object resolve = findObjectId.resolve();
        if (resolve != null) {
            return resolve;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + readObjectReference + "] -- unresolved forward-reference?", jsonParser.getCurrentLocation(), findObjectId);
    }

    /* access modifiers changed from: protected */
    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (jsonParser.getCurrentTokenId()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.getText();
                }
                return null;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                return null;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
                return null;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AnnotatedMember annotatedMember;
        ObjectIdInfo findObjectIdInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty == null || annotationIntrospector == null) {
            annotatedMember = null;
        } else {
            annotatedMember = beanProperty.getMember();
        }
        if (annotatedMember == null || annotationIntrospector == null || (findObjectIdInfo = annotationIntrospector.findObjectIdInfo(annotatedMember)) == null) {
            return this;
        }
        ObjectIdInfo findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo);
        Class<? extends ObjectIdGenerator<?>> generatorType = findObjectReferenceInfo.getGeneratorType();
        if (generatorType == ObjectIdGenerators.PropertyGenerator.class) {
            deserializationContext.reportMappingException("Invalid Object Id definition for abstract type %s: can not use `PropertyGenerator` on polymorphic types using property annotation", handledType().getName());
        }
        ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(annotatedMember, findObjectReferenceInfo);
        JavaType javaType = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), (Class<?>) ObjectIdGenerator.class)[0];
        return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, findObjectReferenceInfo.getPropertyName(), deserializationContext.objectIdGeneratorInstance(annotatedMember, findObjectReferenceInfo), deserializationContext.findRootValueDeserializer(javaType), (SettableBeanProperty) null, objectIdResolverInstance));
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        JsonToken currentToken;
        if (!(this._objectIdReader == null || (currentToken = jsonParser.getCurrentToken()) == null)) {
            if (currentToken.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
            if (currentToken == JsonToken.START_OBJECT) {
                currentToken = jsonParser.nextToken();
            }
            if (currentToken == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        Object _deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        if (_deserializeIfNatural != null) {
            return _deserializeIfNatural;
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    public boolean isCachable() {
        return true;
    }

    protected AbstractDeserializer(BeanDescription beanDescription) {
        JavaType type = beanDescription.getType();
        this._baseType = type;
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class<?> rawClass = type.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z10 = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z10 = false;
        }
        this._acceptDouble = z10;
    }

    protected AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
    }
}
